package com.frd.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.frd.model.CargoOrder;

/**
 * @author Administrator
 *
 */
@Mapper
public interface CargoOrderMapper {

	/**
	 * @param cargoorder
	 * @return
	 * 添加
	 */
	public  Integer  addCargoOrder(CargoOrder cargoorder );
	
	
	/**
	 * @param id
	 * @return
	 * 删除
	 */
	public 	Integer  deleteCargoOrder(Integer id);
	
	
	/**
	 * @param map
	 * @return
	 * 查询所有的信息(带条件)
	 */
	public List<CargoOrder> getAllCargoOrder( @Param("cm") Map<String,Object> map);
	
	
	
	/**
	 * @param id
	 * @return
	 * 查询一条数据
	 */
	public CargoOrder getOneCargoOrder(Integer id);
	
	
	/**
	 * @param cargoorder
	 * @return
	 * 修改
	 */
	public Integer updateCargoOrder(CargoOrder cargoorder);
	
}

