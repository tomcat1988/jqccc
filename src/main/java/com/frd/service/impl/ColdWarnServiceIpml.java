package com.frd.service.impl;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.frd.mapper.ColdWarnMapper;
import com.frd.model.ColdWarn;
import com.frd.service.ColdWarnService;
@Service
public class ColdWarnServiceIpml implements ColdWarnService {
	@Autowired
	private  ColdWarnMapper coldwarnMapper;
 	
	
	public Integer addColdWarn(ColdWarn coldwarn) {
		return coldwarnMapper.addColdWarn(coldwarn);
	}

	
	public Integer deleteColdWarn(Integer id) {
		if(id!=null && id!=0) {
			return coldwarnMapper.deleteColdWarn(id);
		}else {
			 Logger logger = LoggerFactory.getLogger(this.getClass());
			 logger.info("id为空不能进行删除");
			 return 0;
		}
	}

	
	public List<ColdWarn> getAllColdWarn(Map<String, Object> map) {
		return coldwarnMapper.getAllColdWarn(map);
	}

	public ColdWarn getOneColdWarn(Integer id) {
		return coldwarnMapper.getOneColdWarn(id);
	}

	
	public Integer updateColdWarn(ColdWarn coldwarn) {
		return coldwarnMapper.updateColdWarn(coldwarn);
	}

}

