package com.frd.service.impl;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.frd.mapper.ColdHubMapper;
import com.frd.model.ColdHub;
import com.frd.service.ColdHubService;
@Service
public class ColdHubServiceIpml implements ColdHubService {
	@Autowired
	private  ColdHubMapper coldhubMapper;
 	
	
	public Integer addColdHub(ColdHub coldhub) {
		return coldhubMapper.addColdHub(coldhub);
	}

	
	public Integer deleteColdHub(Integer id) {
		if(id!=null && id!=0) {
			return coldhubMapper.deleteColdHub(id);
		}else {
			 Logger logger = LoggerFactory.getLogger(this.getClass());
			 logger.info("id为空不能进行删除");
			 return 0;
		}
	}

	
	public List<ColdHub> getAllColdHub(Map<String, Object> map) {
		return coldhubMapper.getAllColdHub(map);
	}

	public ColdHub getOneColdHub(Integer id) {
		return coldhubMapper.getOneColdHub(id);
	}

	
	public Integer updateColdHub(ColdHub coldhub) {
		return coldhubMapper.updateColdHub(coldhub);
	}

}

