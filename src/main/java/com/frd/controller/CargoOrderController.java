package com.frd.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.frd.model.CargoOrder;
import com.frd.service.CargoOrderService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Controller
@RequestMapping("/cargoorder")
public class CargoOrderController {
	@Autowired
	private  CargoOrderService service;
	
	@RequestMapping(value="add/cargoorder")
	public String  addCargoOrder(CargoOrder cargoorder) {
		cargoorder.setCreatedt(new Date());
		cargoorder.setModifydt(new Date());
		cargoorder.setStartdt(new Date());
		cargoorder.setEnddt(new Date());
		Integer addCargoOrder = service.addCargoOrder(cargoorder);
		if(addCargoOrder!=null) {
			return "redirect:/cargoorder/getAll/cargoorders/1";
		}else { 
			return "error";
		} 
	}
	
	@RequestMapping(value="delete/cargoorder/{id}")
	public  String   deleteCargoOrder(@PathVariable Integer id) {
		 service.deleteCargoOrder(id);
		return "redirect:/cargoorder/getAll/cargoorders/1";
	}
	
	
	@RequestMapping(value="getOne/cargoorder/{id}/{option}")
	public  ModelAndView getOneCargoOrder(@PathVariable Integer id,@PathVariable int option) {
		CargoOrder oneCargoOrder = service.getOneCargoOrder(id);
		if(option ==1) {
			return new ModelAndView("cargoOrderDetail","oneCargoOrder",oneCargoOrder);
		}
		if(option ==2) {
			return new ModelAndView("cargoOrderUpdate","oneCargoOrder",oneCargoOrder);
		}
		return null;
	}
	
	
	@InitBinder("cargoOrder")
	public void getCargoOrder(WebDataBinder wb) {
		wb.setFieldDefaultPrefix("cargoOrder.");
	}
	
	
	
	@RequestMapping(value="getAll/cargoorders/{pageNum}")
	public String  getAllCargoOrders(@PathVariable int pageNum,ModelMap modelMap, HttpServletRequest request,HttpServletResponse response) {
		Map<String ,Object> map=new HashMap<String, Object>();
		map.put("orderno", request.getParameter("orderno"));
		map.put("tel", request.getParameter("tel"));
		List<CargoOrder> allCargoOrder = service.getAllCargoOrder(map);
		PageInfo<CargoOrder> pageInfo=new PageInfo<CargoOrder>(allCargoOrder);
		PageHelper.startPage(pageNum, 5);
		request.getSession().setAttribute("pageInfo", pageInfo);
		modelMap.put("allCargoOrder", allCargoOrder);
		return "cargoOrder";
		
	}
	
	
	@RequestMapping(value="getAll/cargoorder/{pageNum}")
	public String  getAllCargoOrder(@PathVariable int pageNum,ModelMap modelMap, HttpServletRequest request,HttpServletResponse response) {
		Map<String ,Object> map=new HashMap<String, Object>();
		List<CargoOrder> allCargoOrder = service.getAllCargoOrder(map);
		PageInfo<CargoOrder> pageInfo=new PageInfo<CargoOrder>(allCargoOrder);
		PageHelper.startPage(pageNum, 5);
		request.getSession().setAttribute("pageInfo", pageInfo);
		modelMap.put("allCargoOrder", allCargoOrder);
		return "cargoOrder";
		
	}
	
	
	
	
	
	@RequestMapping(value="hello", method=RequestMethod.GET)
	public String say(HashMap<String, Object> map) {
		map.put("hello", "欢迎进入HTML页面");
		return "/index";
	}
	
	

	@RequestMapping(value="update/cargoorder")
	public String updateCargoOrder(CargoOrder oneCargoOrder) {
		oneCargoOrder.setCreatedt(new Date());
		oneCargoOrder.setModifydt(new Date());
		oneCargoOrder.setStartdt(new Date());
		oneCargoOrder.setEnddt(new Date());
		Integer updateCargoOrder = service.updateCargoOrder(oneCargoOrder);
		if(updateCargoOrder!=null) {
			return "redirect:/cargoorder/getAll/cargoorders/1";
		}else {
			return "error";
		}
		
		
		
		
	}
	
}


