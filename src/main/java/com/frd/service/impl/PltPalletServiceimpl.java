package com.frd.service.impl;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.frd.mapper.PltPalletMapper;
import com.frd.model.PltPallet;
import com.frd.service.PltPalletService;
@Service
public class PltPalletServiceIpml implements PltPalletService {
	@Autowired
	private  PltPalletMapper pltpalletMapper;
 	
	
	public Integer addPltPallet(PltPallet pltpallet) {
		return pltpalletMapper.addPltPallet(pltpallet);
	}

	
	public Integer deletePltPallet(Integer id) {
		if(id!=null && id!=0) {
			return pltpalletMapper.deletePltPallet(id);
		}else {
			 Logger logger = LoggerFactory.getLogger(this.getClass());
			 logger.info("id为空不能进行删除");
			 return 0;
		}
	}

	
	public List<PltPallet> getAllPltPallet(Map<String, Object> map) {
		return pltpalletMapper.getAllPltPallet(map);
	}

	public PltPallet getOnePltPallet(Integer id) {
		return pltpalletMapper.getOnePltPallet(id);
	}

	
	public Integer updatePltPallet(PltPallet pltpallet) {
		return pltpalletMapper.updatePltPallet(pltpallet);
	}

}

