package com.frd.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.frd.model.BoxCost;

/**
 * @author Administrator
 *
 */
@Mapper
public interface BoxCostMapper {

	/**
	 * @param boxcost
	 * @return
	 * 添加
	 */
	public  Integer  addBoxCost(BoxCost boxcost );
	
	
	/**
	 * @param id
	 * @return
	 * 删除
	 */
	public 	Integer  deleteBoxCost(Integer id);
	
	
	/**
	 * @param map
	 * @return
	 * 查询所有的信息(带条件)
	 */
	public List<BoxCost> getAllBoxCost( @Param("cm") Map<String,Object> map);
	
	
	
	/**
	 * @param id
	 * @return
	 * 查询一条数据
	 */
	public BoxCost getOneBoxCost(Integer id);
	
	
	/**
	 * @param boxcost
	 * @return
	 * 修改
	 */
	public Integer updateBoxCost(BoxCost boxcost);
	
}

