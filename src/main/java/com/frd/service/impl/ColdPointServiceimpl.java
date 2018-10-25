package com.frd.service.impl;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.frd.mapper.ColdPointMapper;
import com.frd.model.ColdPoint;
import com.frd.service.ColdPointService;
@Service
public class ColdPointServiceIpml implements ColdPointService {
	@Autowired
	private  ColdPointMapper coldpointMapper;
 	
	
	public Integer addColdPoint(ColdPoint coldpoint) {
		return coldpointMapper.addColdPoint(coldpoint);
	}

	
	public Integer deleteColdPoint(Integer id) {
		if(id!=null && id!=0) {
			return coldpointMapper.deleteColdPoint(id);
		}else {
			 Logger logger = LoggerFactory.getLogger(this.getClass());
			 logger.info("id为空不能进行删除");
			 return 0;
		}
	}

	
	public List<ColdPoint> getAllColdPoint(Map<String, Object> map) {
		return coldpointMapper.getAllColdPoint(map);
	}

	public ColdPoint getOneColdPoint(Integer id) {
		return coldpointMapper.getOneColdPoint(id);
	}

	
	public Integer updateColdPoint(ColdPoint coldpoint) {
		return coldpointMapper.updateColdPoint(coldpoint);
	}

}

