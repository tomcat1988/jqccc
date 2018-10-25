package com.frd.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.frd.model.PltLease;

/**
 * @author Administrator
 *
 */
@Mapper
public interface PltLeaseMapper {

	/**
	 * @param pltlease
	 * @return
	 * 添加
	 */
	public  Integer  addPltLease(PltLease pltlease );
	
	
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
	public List<PltLease> getAllPltLease( @Param("cm") Map<String,Object> map);
	
	
	
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

