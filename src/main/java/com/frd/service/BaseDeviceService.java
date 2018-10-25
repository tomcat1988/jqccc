package com.frd.service;
import java.util.List;
import java.util.Map;

import com.frd.model.BaseDevice;

public interface BaseDeviceService {
	/**
	 * @param basedevice
	 * @return
	 * 添加
	 */
	public  Integer  addBaseDevice(BaseDevice basedevice);
	
	
	/**
	 * @param id
	 * @return
	 * 删除
	 */
	public 	Integer  deleteBaseDevice(Integer id);
	
	
	/**
	 * @param map
	 * @return
	 * 查询所有的信息(带条件)
	 */
	public List<BaseDevice> getAllBaseDevice(Map<String,Object> map);
	
	
	
	/**
	 * @param id
	 * @return
	 * 查询一条数据
	 */
	public BaseDevice getOneBaseDevice(Integer id);
	
	
	/**
	 * @param basedevice
	 * @return
	 * 修改
	 */
	public Integer updateBaseDevice(BaseDevice basedevice);
	
}
