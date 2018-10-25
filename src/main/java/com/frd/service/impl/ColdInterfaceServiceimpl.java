package com.frd.service.impl;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.frd.mapper.ColdInterfaceMapper;
import com.frd.model.ColdInterface;
import com.frd.service.ColdInterfaceService;
@Service
public class ColdInterfaceServiceIpml implements ColdInterfaceService {
	@Autowired
	private  ColdInterfaceMapper coldinterfaceMapper;
 	
	
	public Integer addColdInterface(ColdInterface coldinterface) {
		return coldinterfaceMapper.addColdInterface(coldinterface);
	}

	
	public Integer deleteColdInterface(Integer id) {
		if(id!=null && id!=0) {
			return coldinterfaceMapper.deleteColdInterface(id);
		}else {
			 Logger logger = LoggerFactory.getLogger(this.getClass());
			 logger.info("id为空不能进行删除");
			 return 0;
		}
	}

	
	public List<ColdInterface> getAllColdInterface(Map<String, Object> map) {
		return coldinterfaceMapper.getAllColdInterface(map);
	}

	public ColdInterface getOneColdInterface(Integer id) {
		return coldinterfaceMapper.getOneColdInterface(id);
	}

	
	public Integer updateColdInterface(ColdInterface coldinterface) {
		return coldinterfaceMapper.updateColdInterface(coldinterface);
	}

}

