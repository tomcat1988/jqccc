package com.frd.service;
import java.util.List;
import java.util.Map;

import com.frd.model.ColdHub;

public interface ColdHubService {
	/**
	 * @param coldhub
	 * @return
	 * 添加
	 */
	public  Integer  addColdHub(ColdHub coldhub);
	
	
	/**
	 * @param id
	 * @return
	 * 删除
	 */
	public 	Integer  deleteColdHub(Integer id);
	
	
	/**
	 * @param map
	 * @return
	 * 查询所有的信息(带条件)
	 */
	public List<ColdHub> getAllColdHub(Map<String,Object> map);
	
	
	
	/**
	 * @param id
	 * @return
	 * 查询一条数据
	 */
	public ColdHub getOneColdHub(Integer id);
	
	
	/**
	 * @param coldhub
	 * @return
	 * 修改
	 */
	public Integer updateColdHub(ColdHub coldhub);
	
}
