package com.frd.service;
import java.util.List;
import java.util.Map;

import com.frd.model.ColdInterface;

public interface ColdInterfaceService {
	/**
	 * @param coldinterface
	 * @return
	 * 添加
	 */
	public  Integer  addColdInterface(ColdInterface coldinterface);
	
	
	/**
	 * @param id
	 * @return
	 * 删除
	 */
	public 	Integer  deleteColdInterface(Integer id);
	
	
	/**
	 * @param map
	 * @return
	 * 查询所有的信息(带条件)
	 */
	public List<ColdInterface> getAllColdInterface(Map<String,Object> map);
	
	
	
	/**
	 * @param id
	 * @return
	 * 查询一条数据
	 */
	public ColdInterface getOneColdInterface(Integer id);
	
	
	/**
	 * @param coldinterface
	 * @return
	 * 修改
	 */
	public Integer updateColdInterface(ColdInterface coldinterface);
	
}
