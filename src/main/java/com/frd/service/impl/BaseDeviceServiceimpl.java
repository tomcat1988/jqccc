package com.frd.service.impl;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.frd.mapper.BaseDeviceMapper;
import com.frd.model.BaseDevice;
import com.frd.service.BaseDeviceService;
@Service
public class BaseDeviceServiceIpml implements BaseDeviceService {
	@Autowired
	private  BaseDeviceMapper basedeviceMapper;
 	
	
	public Integer addBaseDevice(BaseDevice basedevice) {
		return basedeviceMapper.addBaseDevice(basedevice);
	}

	
	public Integer deleteBaseDevice(Integer id) {
		if(id!=null && id!=0) {
			return basedeviceMapper.deleteBaseDevice(id);
		}else {
			 Logger logger = LoggerFactory.getLogger(this.getClass());
			 logger.info("id为空不能进行删除");
			 return 0;
		}
	}

	
	public List<BaseDevice> getAllBaseDevice(Map<String, Object> map) {
		return basedeviceMapper.getAllBaseDevice(map);
	}

	public BaseDevice getOneBaseDevice(Integer id) {
		return basedeviceMapper.getOneBaseDevice(id);
	}

	
	public Integer updateBaseDevice(BaseDevice basedevice) {
		return basedeviceMapper.updateBaseDevice(basedevice);
	}

}

