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

import com.frd.model.ColdPoint;
import com.frd.service.ColdPointService;

@Controller
@RequestMapping("coldpoint")
public class ColdPointController {
	@Autowired
	private  ColdPointService boxService;
	
	@RequestMapping(value="add/coldpoint")
	public ModelAndView  addColdPoint(ColdPoint coldpoint) {
		Integer addColdPoint = boxService.addColdPoint(coldpoint);
		if(addColdPoint!=null) {
			return new ModelAndView("main.jsp");
		}else {
			return null;
		}
	}
	
	@RequestMapping(value="delete/coldpoint/{id}")
	public  String   deleteColdPoint(@PathVariable Integer id) {
		 boxService.deleteColdPoint(id);
		return "redirct:";
	}
	
	
	@RequestMapping(value="getOne/coldpoint")
	public  ModelAndView getOneColdPoint(Integer id) {
		ColdPoint oneColdPoint = boxService.getOneColdPoint(id);
		if(oneColdPoint!=null) {
			return new ModelAndView("getOneBase","oneColdPoint",oneColdPoint);
		}
		return null;
	}
	
	
	@RequestMapping(value="getAll/coldpoint")
	public ModelAndView  getAllColdPoint(HttpServletRequest request) {
		Map<String, Object> map=new HashMap<String, Object>();
		ModelAndView modelAndView=new ModelAndView();
		map.put("name", request.getAttribute("11"));
		List<ColdPoint> allColdPoint = boxService.getAllColdPoint(map);
		if(!allColdPoint.isEmpty()) {
			modelAndView.addObject("allColdPoint", allColdPoint);
			return modelAndView;
		}else {
			return null;
		}
	}
	
	
	@RequestMapping(value="update/coldpoint")
	public String updateColdPoint(ColdPoint coldpoint) {
		Integer updateColdPoint = boxService.updateColdPoint(coldpoint);
		if(updateColdPoint!=null) {
			return "";
		}else {
			return "error";
		}
		
		
		
		
	}
	
}

