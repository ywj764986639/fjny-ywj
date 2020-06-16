package com.ywj.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ywj.mapper.TbItemMapper;
import com.ywj.pojo.TbItem;
import com.ywj.pojo.TbItemExample;
import com.ywj.service.TbItemService;
import com.ywj.utils.EasyUIDataGridResult;
import com.ywj.utils.FjnyResult;
import com.ywj.utils.IDUtils;
@Service
public class TbItemServiceImpl implements TbItemService {
	@Autowired
	private TbItemMapper tbItemMapper;
	@Override
	public EasyUIDataGridResult getTbItemList(Integer page, Integer rows) {
		//分页插件
		PageHelper.startPage(page, rows);
		TbItemExample example = new TbItemExample();
		List<TbItem> list =  tbItemMapper.selectByExample(example);
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).toString());
		}
		PageInfo<TbItem> pageInfo = new PageInfo<>(list);
		long total = pageInfo.getTotal();
		EasyUIDataGridResult easyUIDataGridResult = new EasyUIDataGridResult(total, list);
		return easyUIDataGridResult;
	}
	@Override
	public FjnyResult saveTbItem(TbItem tbItem) {
		long genItemId = IDUtils.genItemId();
		tbItem.setId(genItemId);
		tbItem.setCreated(new Date());
		tbItem.setUpdated(new Date());
		tbItem.setStatus((byte)1);
		tbItem.setCid(3l);
		int insertSelective = tbItemMapper.insertSelective(tbItem);
		if(insertSelective < 0){
			return FjnyResult.build(500, "添加商品失败");
		}
		return FjnyResult.ok();
		
	}

}
