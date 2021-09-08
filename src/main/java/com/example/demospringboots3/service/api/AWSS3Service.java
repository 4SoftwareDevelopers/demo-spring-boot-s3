package com.example.demospringboots3.service.api;

import java.io.InputStream;
import java.util.List;

import org.springframework.web.multipart.MultipartFile;

public interface AWSS3Service {

	void uploadFile(MultipartFile file);
	
	List<String> getObjectsFromS3();
	
	InputStream downloadFile(String key);
}
