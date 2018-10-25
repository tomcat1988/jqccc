package com.frd.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.frd.model.ColdWarn;

/**
 * @author Administrator
 *
 */
@Mapper
public interface ColdWarnMapper {

	/**
	 * @param coldwarn
	 * @return
	 * 添加
	 */
	public  Integer  addColdWarn(ColdWarn coldwarn );
	
	
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
	public List<ColdWarn> getAllColdWarn( @Param("cm") Map<String,Object> map);
	
	
	
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

