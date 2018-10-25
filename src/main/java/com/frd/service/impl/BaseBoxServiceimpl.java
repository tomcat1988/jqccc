package com.frd.service.impl;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.frd.mapper.BaseBoxMapper;
import com.frd.model.BaseBox;
import com.frd.service.BaseBoxService;
@Service
public class BaseBoxServiceIpml implements BaseBoxService {
	@Autowired
	private  BaseBoxMapper baseboxMapper;
 	
	
	public Integer addBaseBox(BaseBox basebox) {
		return baseboxMapper.addBaseBox(basebox);
	}

	
	public Integer deleteBaseBox(Integer id) {
		if(id!=null && id!=0) {
			return baseboxMapper.deleteBaseBox(id);
		}else {
			 Logger logger = LoggerFactory.getLogger(this.getClass());
			 logger.info("id为空不能进行删除");
			 return 0;
		}
	}

	
	public List<BaseBox> getAllBaseBox(Map<String, Object> map) {
		return baseboxMapper.getAllBaseBox(map);
	}

	public BaseBox getOneBaseBox(Integer id) {
		return baseboxMapper.getOneBaseBox(id);
	}

	
	public Integer updateBaseBox(BaseBox basebox) {
		return baseboxMapper.updateBaseBox(basebox);
	}

}

