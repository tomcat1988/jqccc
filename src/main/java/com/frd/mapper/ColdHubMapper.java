package com.frd.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.frd.model.ColdHub;

/**
 * @author Administrator
 *
 */
@Mapper
public interface ColdHubMapper {

	/**
	 * @param coldhub
	 * @return
	 * 添加
	 */
	public  Integer  addColdHub(ColdHub coldhub );
	
	
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
	public List<ColdHub> getAllColdHub( @Param("cm") Map<String,Object> map);
	
	
	
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

