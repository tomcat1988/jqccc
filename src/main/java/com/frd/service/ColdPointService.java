package com.frd.service;
import java.util.List;
import java.util.Map;

import com.frd.model.ColdPoint;

public interface ColdPointService {
	/**
	 * @param coldpoint
	 * @return
	 * 添加
	 */
	public  Integer  addColdPoint(ColdPoint coldpoint);
	
	
	/**
	 * @param id
	 * @return
	 * 删除
	 */
	public 	Integer  deleteColdPoint(Integer id);
	
	
	/**
	 * @param map
	 * @return
	 * 查询所有的信息(带条件)
	 */
	public List<ColdPoint> getAllColdPoint(Map<String,Object> map);
	
	
	
	/**
	 * @param id
	 * @return
	 * 查询一条数据
	 */
	public ColdPoint getOneColdPoint(Integer id);
	
	
	/**
	 * @param coldpoint
	 * @return
	 * 修改
	 */
	public Integer updateColdPoint(ColdPoint coldpoint);
	
}
