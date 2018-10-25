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

import com.frd.model.BoxCost;
import com.frd.service.BoxCostService;

@Controller
@RequestMapping("boxcost")
public class BoxCostController {
	@Autowired
	private  BoxCostService boxService;
	
	@RequestMapping(value="add/boxcost")
	public ModelAndView  addBoxCost(BoxCost boxcost) {
		Integer addBoxCost = boxService.addBoxCost(boxcost);
		if(addBoxCost!=null) {
			return new ModelAndView("main.jsp");
		}else {
			return null;
		}
	}
	
	@RequestMapping(value="delete/boxcost/{id}")
	public  String   deleteBoxCost(@PathVariable Integer id) {
		 boxService.deleteBoxCost(id);
		return "redirct:";
	}
	
	
	@RequestMapping(value="getOne/boxcost")
	public  ModelAndView getOneBoxCost(Integer id) {
		BoxCost oneBoxCost = boxService.getOneBoxCost(id);
		if(oneBoxCost!=null) {
			return new ModelAndView("getOneBase","oneBoxCost",oneBoxCost);
		}
		return null;
	}
	
	
	@RequestMapping(value="getAll/boxcost")
	public ModelAndView  getAllBoxCost(HttpServletRequest request) {
		Map<String, Object> map=new HashMap<String, Object>();
		ModelAndView modelAndView=new ModelAndView();
		map.put("name", request.getAttribute("11"));
		List<BoxCost> allBoxCost = boxService.getAllBoxCost(map);
		if(!allBoxCost.isEmpty()) {
			modelAndView.addObject("allBoxCost", allBoxCost);
			return modelAndView;
		}else {
			return null;
		}
	}
	
	
	@RequestMapping(value="update/boxcost")
	public String updateBoxCost(BoxCost boxcost) {
		Integer updateBoxCost = boxService.updateBoxCost(boxcost);
		if(updateBoxCost!=null) {
			return "";
		}else {
			return "error";
		}
		
		
		
		
	}
	
}

