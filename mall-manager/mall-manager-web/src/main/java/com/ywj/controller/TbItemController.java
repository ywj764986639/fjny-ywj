package com.ywj.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ywj.pojo.TbItem;
import com.ywj.service.TbItemCatService;
import com.ywj.service.TbItemDescService;
import com.ywj.service.TbItemService;
import com.ywj.utils.EasyUIDataGridResult;
import com.ywj.utils.EasyUITreeNodeBean;
import com.ywj.utils.FjnyResult;

@Controller
@RequestMapping("/item")
public class TbItemController {

	@Autowired
	public TbItemService tbItemService;
	@Autowired
	public TbItemCatService tbItemCatService;
	@Autowired
	public TbItemDescService tbItemDescService;
	
	@RequestMapping("/getItem")
	@ResponseBody
	public EasyUIDataGridResult getTbItemList(@RequestParam(defaultValue = "1")
		Integer page
				,@RequestParam(defaultValue = "10") Integer rows){
		return tbItemService.getTbItemList(page, rows);
	}
	@RequestMapping(value = "/save",method = RequestMethod.POST)
	@ResponseBody
	public FjnyResult saveTbItem(TbItem tbItem,String desc,String itemParams){
		tbItemService.saveTbItem(tbItem, desc,itemParams);
		return FjnyResult.ok();
	}
	
	
	@RequestMapping("cat/list")
	@ResponseBody
	public List<EasyUITreeNodeBean> getTbItemCatList(@RequestParam(defaultValue = "0")Long id){
		return tbItemCatService.getTbItemCatList(id);
	}
	
	@RequestMapping("/query/item-desc/{id}")
	@ResponseBody
	public FjnyResult getTbItemDesc(@PathVariable Long id){
		 return tbItemDescService.getTbItemDesc(id); 
	}
	
	@RequestMapping("/update")
	@ResponseBody
	public FjnyResult updateTbItem(TbItem tbItem,String desc){
		return tbItemService.updateTbItem(tbItem, desc);
		
	}
	
	@RequestMapping("/delete")
	@ResponseBody
	public FjnyResult deleteTbItem(@RequestParam("ids") List<Long>ids,@RequestParam("status") int status){
		return tbItemService.deleteTbItem(ids,status);
	}
	

	
	
}




