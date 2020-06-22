package com.ywj.service;

import java.util.List;

import com.ywj.pojo.TbItem;
import com.ywj.utils.EasyUIDataGridResult;
import com.ywj.utils.FjnyResult;

public interface TbItemService {
	//获取商品列表
	public EasyUIDataGridResult getTbItemList(Integer page, Integer rows);
	
	//添加商品
	public FjnyResult saveTbItem(TbItem tbItem,String desc, String itemParams);

	//更新商品
	public FjnyResult updateTbItem(TbItem tbItem,String Desc);
	
	//删除商品	
	//下架商品
	//上架商品
	public FjnyResult deleteTbItem(List<Long> ids,int a);


}
