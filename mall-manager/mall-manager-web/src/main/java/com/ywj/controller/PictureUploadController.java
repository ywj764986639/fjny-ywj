package com.ywj.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.ywj.service.PictureUploadService;
import com.ywj.utils.PictureResult;

@Controller
public class PictureUploadController {
		
		@Autowired
		private PictureUploadService pictureUploadService;
	
		@RequestMapping("/pic/upload")
		@ResponseBody
		public PictureResult PictureUpload(MultipartFile uploadFile){
			PictureResult pictureUpload = pictureUploadService.pictureupload(uploadFile);
			return pictureUpload;
		}
}
 