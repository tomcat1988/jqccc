package com.frd.service.impl;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.frd.mapper.CargoOrderMapper;
import com.frd.model.CargoOrder;
import com.frd.service.CargoOrderService;
@Service
public class CargoOrderServiceIpml implements CargoOrderService {
	@Autowired
	private  CargoOrderMapper cargoorderMapper;
 	
	
	public Integer addCargoOrder(CargoOrder cargoorder) {
		return cargoorderMapper.addCargoOrder(cargoorder);
	}

	
	public Integer deleteCargoOrder(Integer id) {
		if(id!=null && id!=0) {
			return cargoorderMapper.deleteCargoOrder(id);
		}else {
			 Logger logger = LoggerFactory.getLogger(this.getClass());
			 logger.info("id为空不能进行删除");
			 return 0;
		}
	}

	
	public List<CargoOrder> getAllCargoOrder(Map<String, Object> map) {
		return cargoorderMapper.getAllCargoOrder(map);
	}

	public CargoOrder getOneCargoOrder(Integer id) {
		return cargoorderMapper.getOneCargoOrder(id);
	}

	
	public Integer updateCargoOrder(CargoOrder cargoorder) {
		return cargoorderMapper.updateCargoOrder(cargoorder);
	}

}

