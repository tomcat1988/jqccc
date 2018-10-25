package com.frd.service.impl;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.frd.mapper.PltLeaseMapper;
import com.frd.model.PltLease;
import com.frd.service.PltLeaseService;
@Service
public class PltLeaseServiceIpml implements PltLeaseService {
	@Autowired
	private  PltLeaseMapper pltleaseMapper;
 	
	
	public Integer addPltLease(PltLease pltlease) {
		return pltleaseMapper.addPltLease(pltlease);
	}

	
	public Integer deletePltLease(Integer id) {
		if(id!=null && id!=0) {
			return pltleaseMapper.deletePltLease(id);
		}else {
			 Logger logger = LoggerFactory.getLogger(this.getClass());
			 logger.info("id为空不能进行删除");
			 return 0;
		}
	}

	
	public List<PltLease> getAllPltLease(Map<String, Object> map) {
		return pltleaseMapper.getAllPltLease(map);
	}

	public PltLease getOnePltLease(Integer id) {
		return pltleaseMapper.getOnePltLease(id);
	}

	
	public Integer updatePltLease(PltLease pltlease) {
		return pltleaseMapper.updatePltLease(pltlease);
	}

}

