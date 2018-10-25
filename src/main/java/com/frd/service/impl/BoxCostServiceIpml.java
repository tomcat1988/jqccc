package com.frd.service.impl;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.frd.mapper.BoxCostMapper;
import com.frd.model.BoxCost;
import com.frd.service.BoxCostService;
@Service
public class BoxCostServiceIpml implements BoxCostService {
	@Autowired
	private  BoxCostMapper boxcostMapper;
 	
	
	public Integer addBoxCost(BoxCost boxcost) {
		return boxcostMapper.addBoxCost(boxcost);
	}

	
	public Integer deleteBoxCost(Integer id) {
		if(id!=null && id!=0) {
			return boxcostMapper.deleteBoxCost(id);
		}else {
			 Logger logger = LoggerFactory.getLogger(this.getClass());
			 logger.info("id为空不能进行删除");
			 return 0;
		}
	}

	
	public List<BoxCost> getAllBoxCost(Map<String, Object> map) {
		return boxcostMapper.getAllBoxCost(map);
	}

	public BoxCost getOneBoxCost(Integer id) {
		return boxcostMapper.getOneBoxCost(id);
	}

	
	public Integer updateBoxCost(BoxCost boxcost) {
		return boxcostMapper.updateBoxCost(boxcost);
	}

}

