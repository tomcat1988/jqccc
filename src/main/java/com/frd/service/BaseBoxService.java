﻿package com.frd.service;
import java.util.List;
import java.util.Map;

import com.frd.model.BaseBox;

public interface BaseBoxService {
	/**
	 * @param basebox
	 * @return
	 * 添加
	 */
	public  Integer  addBaseBox(BaseBox basebox);
	
	
	/**
	 * @param id
	 * @return
	 * 删除
	 */
	public 	Integer  deleteBaseBox(Integer id);
	
	
	/**
	 * @param map
	 * @return
	 * 查询所有的信息(带条件)
	 */
	public List<BaseBox> getAllBaseBox(Map<String,Object> map);
	
	
	
	/**
	 * @param id
	 * @return
	 * 查询一条数据
	 */
	public BaseBox getOneBaseBox(Integer id);
	
	
	/**
	 * @param basebox
	 * @return
	 * 修改
	 */
	public Integer updateBaseBox(BaseBox basebox);
	
}
