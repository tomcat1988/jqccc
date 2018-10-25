package com.frd.service;
import java.util.List;
import java.util.Map;

import com.frd.model.ProjContract;

public interface ProjContractService {
	/**
	 * @param projcontract
	 * @return
	 * 添加
	 */
	public  Integer  addProjContract(ProjContract projcontract);
	
	
	/**
	 * @param id
	 * @return
	 * 删除
	 */
	public 	Integer  deleteProjContract(Integer id);
	
	
	/**
	 * @param map
	 * @return
	 * 查询所有的信息(带条件)
	 */
	public List<ProjContract> getAllProjContract(Map<String,Object> map);
	
	
	
	/**
	 * @param id
	 * @return
	 * 查询一条数据
	 */
	public ProjContract getOneProjContract(Integer id);
	
	
	/**
	 * @param projcontract
	 * @return
	 * 修改
	 */
	public Integer updateProjContract(ProjContract projcontract);
	
}
