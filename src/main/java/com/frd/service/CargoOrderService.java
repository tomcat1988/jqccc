package com.frd.service;
import java.util.List;
import java.util.Map;

import com.frd.model.CargoOrder;

public interface CargoOrderService {
	/**
	 * @param cargoorder
	 * @return
	 * 添加
	 */
	public  Integer  addCargoOrder(CargoOrder cargoorder);
	
	
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
	public List<CargoOrder> getAllCargoOrder(Map<String,Object> map);
	
	
	
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
