package com.frd.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.frd.model.ProjContract;

/**
 * @author Administrator
 *
 */
@Mapper
public interface ProjContractMapper {

	/**
	 * @param projcontract
	 * @return
	 * 添加
	 */
	public  Integer  addProjContract(ProjContract projcontract );
	
	
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
	public List<ProjContract> getAllProjContract( @Param("cm") Map<String,Object> map);
	
	
	
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

