package com.frd.service;
import java.util.List;
import java.util.Map;

import com.frd.model.ColdWarn;

public interface ColdWarnService {
	/**
	 * @param coldwarn
	 * @return
	 * 添加
	 */
	public  Integer  addColdWarn(ColdWarn coldwarn);
	
	
	/**
	 * @param id
	 * @return
	 * 删除
	 */
	public 	Integer  deleteColdWarn(Integer id);
	
	
	/**
	 * @param map
	 * @return
	 * 查询所有的信息(带条件)
	 */
	public List<ColdWarn> getAllColdWarn(Map<String,Object> map);
	
	
	
	/**
	 * @param id
	 * @return
	 * 查询一条数据
	 */
	public ColdWarn getOneColdWarn(Integer id);
	
	
	/**
	 * @param coldwarn
	 * @return
	 * 修改
	 */
	public Integer updateColdWarn(ColdWarn coldwarn);
	
}
