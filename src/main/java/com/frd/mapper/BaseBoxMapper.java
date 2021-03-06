﻿package com.frd.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.frd.model.BaseBox;

/**
 * @author Administrator
 *
 */
@Mapper
public interface BaseBoxMapper {

	/**
	 * @param basebox
	 * @return
	 * 添加
	 */
	public  Integer  addBaseBox(BaseBox basebox );
	
	
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
	public List<BaseBox> getAllBaseBox( @Param("cm") Map<String,Object> map);
	
	
	
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

