package com.frd.service;
import java.util.List;
import java.util.Map;

import com.frd.model.BoxCost;

public interface BoxCostService {
	/**
	 * @param boxcost
	 * @return
	 * 添加
	 */
	public  Integer  addBoxCost(BoxCost boxcost);
	
	
	/**
	 * @param id
	 * @return
	 * 删除
	 */
	public 	Integer  deleteBoxCost(Integer id);
	
	
	/**
	 * @param map
	 * @return
	 * 查询所有的信息(带条件)
	 */
	public List<BoxCost> getAllBoxCost(Map<String,Object> map);
	
	
	
	/**
	 * @param id
	 * @return
	 * 查询一条数据
	 */
	public BoxCost getOneBoxCost(Integer id);
	
	
	/**
	 * @param boxcost
	 * @return
	 * 修改
	 */
	public Integer updateBoxCost(BoxCost boxcost);
	
}
