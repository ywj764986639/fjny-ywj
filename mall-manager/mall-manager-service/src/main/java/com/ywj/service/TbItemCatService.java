package com.ywj.service;

import java.util.List;

import com.ywj.utils.EasyUITreeNodeBean;

public interface TbItemCatService {
	List<EasyUITreeNodeBean> getTbItemCatList(Long parentId);
}
