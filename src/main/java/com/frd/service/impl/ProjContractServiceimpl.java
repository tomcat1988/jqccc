package com.frd.service.impl;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.frd.mapper.ProjContractMapper;
import com.frd.model.ProjContract;
import com.frd.service.ProjContractService;
@Service
public class ProjContractServiceIpml implements ProjContractService {
	@Autowired
	private  ProjContractMapper projcontractMapper;
 	
	
	public Integer addProjContract(ProjContract projcontract) {
		return projcontractMapper.addProjContract(projcontract);
	}

	
	public Integer deleteProjContract(Integer id) {
		if(id!=null && id!=0) {
			return projcontractMapper.deleteProjContract(id);
		}else {
			 Logger logger = LoggerFactory.getLogger(this.getClass());
			 logger.info("id为空不能进行删除");
			 return 0;
		}
	}

	
	public List<ProjContract> getAllProjContract(Map<String, Object> map) {
		return projcontractMapper.getAllProjContract(map);
	}

	public ProjContract getOneProjContract(Integer id) {
		return projcontractMapper.getOneProjContract(id);
	}

	
	public Integer updateProjContract(ProjContract projcontract) {
		return projcontractMapper.updateProjContract(projcontract);
	}

}

