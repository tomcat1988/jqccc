package com.frd.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.frd.model.BaseDevice;

/**
 * @author Administrator
 *
 */
@Mapper
public interface BaseDeviceMapper {

	/**
	 * @param basedevice
	 * @return
	 * 添加
	 */
	public  Integer  addBaseDevice(BaseDevice basedevice );
	
	
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
	public List<BaseDevice> getAllBaseDevice( @Param("cm") Map<String,Object> map);
	
	
	
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

