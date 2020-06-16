package com.ywj.service;

import com.ywj.pojo.TbItem;
import com.ywj.utils.EasyUIDataGridResult;
import com.ywj.utils.FjnyResult;

public interface TbItemService {
	//获取商品列表
	public EasyUIDataGridResult getTbItemList(Integer page, Integer rows);
	
	//添加商品
	public FjnyResult saveTbItem(TbItem tbItem);
}
