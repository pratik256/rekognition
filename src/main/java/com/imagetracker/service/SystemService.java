package com.imagetracker.service;

import java.util.Set;

import org.springframework.web.multipart.MultipartFile;

import com.imagetracker.dto.ResultDTO;

public interface SystemService {

	public void addFileToSharedFolder(MultipartFile file);

	public String getObjectURL(String fileName);
	
	public String rekognitionImage(String fileName);

	public void removeDuplicateLables(Set<String> lables, String[] split);
}
