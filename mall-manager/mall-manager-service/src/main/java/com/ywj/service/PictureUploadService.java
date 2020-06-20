package com.ywj.service;

import org.springframework.web.multipart.MultipartFile;

import com.ywj.utils.PictureResult;

public interface PictureUploadService {
	public PictureResult pictureupload(MultipartFile uploadfile);
}
