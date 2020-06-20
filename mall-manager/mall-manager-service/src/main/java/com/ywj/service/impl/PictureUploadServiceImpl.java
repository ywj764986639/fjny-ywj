package com.ywj.service.impl;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.reflection.ExceptionUtil;
import org.joda.time.DateTime;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.ywj.service.PictureUploadService;
import com.ywj.utils.FtpUtil;
import com.ywj.utils.IDUtils;
import com.ywj.utils.PictureResult;
@Service
public class PictureUploadServiceImpl implements PictureUploadService {
	String host = "127.0.0.1";
	int port = 21;
	String username = "ywj";
	String password = "123456";
			
	@Override
	public PictureResult pictureupload(MultipartFile uploadfile) {
			
		PictureResult result = new PictureResult();
		
		
		try {
			//判断是否为空
			if(null == uploadfile || uploadfile.isEmpty()){
				result.setError(500);
				result.setMessage("上传图片为空");
				return result;
			}
			//获取文件名
			String originalFilename = uploadfile.getOriginalFilename();
			String ext = originalFilename.substring(originalFilename.lastIndexOf("."));
			DateTime dateTime= new DateTime();
			String filePath = dateTime.toString("/yyyy/MM/dd");
			String filename = IDUtils.genImageName()+ext;
			InputStream input = uploadfile.getInputStream();
			FtpUtil.uploadFile(host, port, username, password,"/", "image/" + filePath, filename, input);
			String url = "http://localhost:8888" + filePath +"/"+ filename;
			System.out.println("********"+url);
			result.setError(0);
			result.setUrl(url);
			return result;
		} catch (IOException e) {
			result.setError(1);
			result.setMessage(ExceptionUtil.unwrapThrowable(e).toString());
		}
		return result;	

	}
}
