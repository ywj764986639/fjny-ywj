package com.ywj.service.impl;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.mysql.fabric.xmlrpc.base.Data;
import com.ywj.mapper.TbItemDescMapper;
import com.ywj.mapper.TbItemMapper;
import com.ywj.mapper.TbItemParamItemMapper;
import com.ywj.mapper.TbItemParamMapper;
import com.ywj.pojo.TbItem;
import com.ywj.pojo.TbItemDesc;
import com.ywj.pojo.TbItemExample;
import com.ywj.pojo.TbItemParamItem;
import com.ywj.service.TbItemService;
import com.ywj.utils.EasyUIDataGridResult;
import com.ywj.utils.FjnyResult;
import com.ywj.utils.IDUtils;

@Service
public class TbItemServiceImpl implements TbItemService {
	@Resource
	private TbItemMapper tbItemMapper;
	@Resource
	private TbItemDescMapper tbItemDescMapper;
	@Resource
	private TbItemParamItemMapper tbItemParamItemMapper;

	@Override
	public EasyUIDataGridResult getTbItemList(Integer page, Integer rows) {
		// 分页插件
		PageHelper.startPage(page, rows);
		TbItemExample example = new TbItemExample();
		example.createCriteria().andStatusNotEqualTo((byte)3);
		List<TbItem> list = tbItemMapper.selectByExample(example);
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).toString());
		}
		PageInfo<TbItem> pageInfo = new PageInfo<>(list);
		long total = pageInfo.getTotal();
		EasyUIDataGridResult easyUIDataGridResult = new EasyUIDataGridResult(total, list);
		return easyUIDataGridResult;
	}

	@Override
	public FjnyResult saveTbItem(TbItem tbItem, String desc,String itemParams) {
		long genItemId = IDUtils.genItemId();
		tbItem.setId(genItemId);
		tbItem.setCreated(new Date());
		tbItem.setUpdated(new Date());
		tbItem.setStatus((byte) 1);
		int insertSelective = tbItemMapper.insertSelective(tbItem);
		if (insertSelective < 0) {
			return FjnyResult.build(500, "添加商品失败");
		}
		// 商品描述添加
		TbItemDesc tbItemDesc = new TbItemDesc();
		tbItemDesc.setItemId(tbItem.getId());
		tbItemDesc.setItemDesc(desc);
		tbItemDesc.setCreated(new Date());
		tbItemDesc.setUpdated(new Date());
		tbItemDescMapper.insertSelective(tbItemDesc);
		
		//把商品的规格参数插入到tb_item_param_item中
		TbItemParamItem itemParamItem = new TbItemParamItem();
		itemParamItem.setItemId(tbItem.getId());
		itemParamItem.setParamData(itemParams);
		itemParamItem.setCreated(new Date());
		itemParamItem.setUpdated(new Date());
		tbItemParamItemMapper.insert(itemParamItem);
		
		return FjnyResult.ok();
//		return FjnyResult.ok(tbItem);

	}

	@Override
	public FjnyResult updateTbItem(TbItem tbItem, String desc) {
		// 更新商品信息
		tbItem.setUpdated(new Date());// 更新时间
		tbItemMapper.updateByPrimaryKeySelective(tbItem);
		// 更新商品描述信息
		TbItemDesc record = new TbItemDesc();
		record.setItemId(tbItem.getId());
		record.setItemDesc(desc);
		record.setUpdated(new Date());
		tbItemDescMapper.updateByPrimaryKeySelective(record);
		return FjnyResult.ok();
	}

	@Override
	public FjnyResult deleteTbItem(List<Long> ids,int a) {
		try {
			TbItem record = new TbItem();
			record.setStatus((byte) a);
				TbItemExample example = new TbItemExample();
			example.createCriteria().andIdIn(ids);
			tbItemMapper.updateByExampleSelective(record, example);
		} catch (Exception e) {
			
			if(a==1){
				return FjnyResult.build(500,"上架失败");
			}else if(a==2) {
				return FjnyResult.build(500,"下架失败");
			}else{
				return FjnyResult.build(500,"删除失败");
			}
		
		}

		return FjnyResult.ok();
	}




}
