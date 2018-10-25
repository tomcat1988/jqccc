package com.frd.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.frd.model.CargoOrder;
import com.frd.service.CargoOrderService;

@Controller
@RequestMapping("cargoorder")
public class CargoOrderController {
	@Autowired
	private  CargoOrderService boxService;
	
	@RequestMapping(value="add/cargoorder")
	public ModelAndView  addCargoOrder(CargoOrder cargoorder) {
		Integer addCargoOrder = boxService.addCargoOrder(cargoorder);
		if(addCargoOrder!=null) {
			return new ModelAndView("main.jsp");
		}else {
			return null;
		}
	}
	
	@RequestMapping(value="delete/cargoorder/{id}")
	public  String   deleteCargoOrder(@PathVariable Integer id) {
		 boxService.deleteCargoOrder(id);
		return "redirct:";
	}
	
	
	@RequestMapping(value="getOne/cargoorder")
	public  ModelAndView getOneCargoOrder(Integer id) {
		CargoOrder oneCargoOrder = boxService.getOneCargoOrder(id);
		if(oneCargoOrder!=null) {
			return new ModelAndView("getOneBase","oneCargoOrder",oneCargoOrder);
		}
		return null;
	}
	
	
	@RequestMapping(value="getAll/cargoorder")
	public ModelAndView  getAllCargoOrder(HttpServletRequest request) {
		Map<String, Object> map=new HashMap<String, Object>();
		ModelAndView modelAndView=new ModelAndView();
		map.put("name", request.getAttribute("11"));
		List<CargoOrder> allCargoOrder = boxService.getAllCargoOrder(map);
		if(!allCargoOrder.isEmpty()) {
			modelAndView.addObject("allCargoOrder", allCargoOrder);
			return modelAndView;
		}else {
			return null;
		}
	}
	
	
	@RequestMapping(value="update/cargoorder")
	public String updateCargoOrder(CargoOrder cargoorder) {
		Integer updateCargoOrder = boxService.updateCargoOrder(cargoorder);
		if(updateCargoOrder!=null) {
			return "";
		}else {
			return "error";
		}
		
		
		
		
	}
	
}

