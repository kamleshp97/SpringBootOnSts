package com.spring.boot.controller;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
@RestController
public class FileUploadController {
	@Value("${fileUpload.location}")
	private String path;

	@PostMapping("/fileUpload")
	public ResponseEntity<String> fileUpload(@RequestParam("file") MultipartFile multipartFile) {
		boolean status = false;
		try{
			byte[] fileContent = multipartFile.getBytes();
			String filename = multipartFile.getOriginalFilename();
			long fileSize = multipartFile.getSize();
			String fileUploadingDirectory = path+"\\"+filename;
			FileOutputStream fos = new FileOutputStream(fileUploadingDirectory);
			fos.flush();
			fos.write(fileContent);
			fos.close();
			
			// another way to upload file in single line using nio
			//Files.copy(multipartFile.getInputStream(), Paths.get(fileUploadingDirectory),StandardCopyOption.REPLACE_EXISTING);
			
			status = true;
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		if(status == true) {
			return ResponseEntity.ok("File uploaded successfully!!");
		}
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
	}
}
