package com.frd.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.frd.model.ColdPoint;

/**
 * @author Administrator
 *
 */
@Mapper
public interface ColdPointMapper {

	/**
	 * @param coldpoint
	 * @return
	 * 添加
	 */
	public  Integer  addColdPoint(ColdPoint coldpoint );
	
	
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
	public List<ColdPoint> getAllColdPoint( @Param("cm") Map<String,Object> map);
	
	
	
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

