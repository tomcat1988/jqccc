package com.frd.service.impl;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.frd.mapper.BoxGwMapper;
import com.frd.model.BoxGw;
import com.frd.service.BoxGwService;
@Service
public class BoxGwServiceIpml implements BoxGwService {
	@Autowired
	private  BoxGwMapper boxgwMapper;
 	
	
	public Integer addBoxGw(BoxGw boxgw) {
		return boxgwMapper.addBoxGw(boxgw);
	}

	
	public Integer deleteBoxGw(Integer id) {
		if(id!=null && id!=0) {
			return boxgwMapper.deleteBoxGw(id);
		}else {
			 Logger logger = LoggerFactory.getLogger(this.getClass());
			 logger.info("id为空不能进行删除");
			 return 0;
		}
	}

	
	public List<BoxGw> getAllBoxGw(Map<String, Object> map) {
		return boxgwMapper.getAllBoxGw(map);
	}

	public BoxGw getOneBoxGw(Integer id) {
		return boxgwMapper.getOneBoxGw(id);
	}

	
	public Integer updateBoxGw(BoxGw boxgw) {
		return boxgwMapper.updateBoxGw(boxgw);
	}

}

