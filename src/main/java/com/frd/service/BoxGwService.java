package com.frd.service;
import java.util.List;
import java.util.Map;

import com.frd.model.BoxGw;

public interface BoxGwService {
	/**
	 * @param boxgw
	 * @return
	 * 添加
	 */
	public  Integer  addBoxGw(BoxGw boxgw);
	
	
	/**
	 * @param id
	 * @return
	 * 删除
	 */
	public 	Integer  deleteBoxGw(Integer id);
	
	
	/**
	 * @param map
	 * @return
	 * 查询所有的信息(带条件)
	 */
	public List<BoxGw> getAllBoxGw(Map<String,Object> map);
	
	
	
	/**
	 * @param id
	 * @return
	 * 查询一条数据
	 */
	public BoxGw getOneBoxGw(Integer id);
	
	
	/**
	 * @param boxgw
	 * @return
	 * 修改
	 */
	public Integer updateBoxGw(BoxGw boxgw);
	
}
