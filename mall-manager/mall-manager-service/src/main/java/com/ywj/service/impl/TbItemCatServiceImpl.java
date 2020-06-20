package com.ywj.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ywj.mapper.TbItemCatMapper;
import com.ywj.pojo.TbItemCat;
import com.ywj.pojo.TbItemCatExample;
import com.ywj.pojo.TbItemCatExample.Criteria;
import com.ywj.service.TbItemCatService;
import com.ywj.utils.EasyUITreeNodeBean;
@Service
public class TbItemCatServiceImpl implements TbItemCatService {

	@Autowired
	private TbItemCatMapper tbItemCatMapper;
	
	@Override
	public List<EasyUITreeNodeBean> getTbItemCatList(Long parentId) {
		TbItemCatExample example = new TbItemCatExample();
		Criteria criteria = example.createCriteria();
		criteria.andParentIdEqualTo(parentId);
		List<TbItemCat> list = tbItemCatMapper.selectByExample(example);
		List<EasyUITreeNodeBean> easyUiTreeNodeBeans = new ArrayList<>();
		for(TbItemCat tbItemCat : list){
			EasyUITreeNodeBean e = new EasyUITreeNodeBean();
			e.setId(tbItemCat.getId());
			e.setText(tbItemCat.getName());
			/*Boolean isParent = tbItemCat.getIsParent();
			if(isParent){
				e.setStatus("closed");
			}else{
				e.setStatus("open");
			}*/
			e.setState(tbItemCat.getIsParent()?"closed":"open");
			easyUiTreeNodeBeans.add(e);
		}
	
		return easyUiTreeNodeBeans;	
	}

}
