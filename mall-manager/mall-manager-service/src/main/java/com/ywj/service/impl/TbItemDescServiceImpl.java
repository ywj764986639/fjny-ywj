package com.ywj.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ywj.mapper.TbItemDescMapper;
import com.ywj.pojo.TbItemDesc;
import com.ywj.service.TbItemDescService;
import com.ywj.utils.FjnyResult;
@Service
public class TbItemDescServiceImpl implements TbItemDescService {

	
	@Autowired
	private TbItemDescMapper tbItemDescMapper;
	
	@Override
	public FjnyResult getTbItemDesc(Long itemId) {
		TbItemDesc itemDesc = tbItemDescMapper.selectByPrimaryKey(itemId);
		return FjnyResult.ok(itemDesc);
	}

}
