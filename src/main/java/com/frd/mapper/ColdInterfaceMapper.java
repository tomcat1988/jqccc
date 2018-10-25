package com.frd.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.frd.model.ColdInterface;

/**
 * @author Administrator
 *
 */
@Mapper
public interface ColdInterfaceMapper {

	/**
	 * @param coldinterface
	 * @return
	 * 添加
	 */
	public  Integer  addColdInterface(ColdInterface coldinterface );
	
	
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
	public List<ColdInterface> getAllColdInterface( @Param("cm") Map<String,Object> map);
	
	
	
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

