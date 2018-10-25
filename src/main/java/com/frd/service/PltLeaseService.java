package com.frd.service;
import java.util.List;
import java.util.Map;

import com.frd.model.PltLease;

public interface PltLeaseService {
	/**
	 * @param pltlease
	 * @return
	 * 添加
	 */
	public  Integer  addPltLease(PltLease pltlease);
	
	
	/**
	 * @param id
	 * @return
	 * 删除
	 */
	public 	Integer  deletePltLease(Integer id);
	
	
	/**
	 * @param map
	 * @return
	 * 查询所有的信息(带条件)
	 */
	public List<PltLease> getAllPltLease(Map<String,Object> map);
	
	
	
	/**
	 * @param id
	 * @return
	 * 查询一条数据
	 */
	public PltLease getOnePltLease(Integer id);
	
	
	/**
	 * @param pltlease
	 * @return
	 * 修改
	 */
	public Integer updatePltLease(PltLease pltlease);
	
}
