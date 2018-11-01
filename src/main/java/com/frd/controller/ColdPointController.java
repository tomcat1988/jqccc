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

import com.frd.model.ColdPoint;
import com.frd.service.ColdPointService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Controller
@RequestMapping("/coldpoint")
public class ColdPointController {
	@Autowired
	private  ColdPointService service;
	
	@RequestMapping(value="add/coldpoint")
	public String  addColdPoint(ColdPoint coldpoint) {
		coldpoint.setCreatedt(new Date());
		coldpoint.setModifydt(new Date());
		Integer addColdPoint = service.addColdPoint(coldpoint);
		if(addColdPoint!=null) {
			return "redirect:/coldpoint/getAll/coldpoints/1";
		}else { 
			return "error";
		} 
	}
	
	@RequestMapping(value="delete/coldpoint/{id}")
	public  String   deleteColdPoint(@PathVariable Integer id) {
		 service.deleteColdPoint(id);
		return "redirect:/coldpoint/getAll/coldpoints/1";
	}
	
	
	@RequestMapping(value="getOne/coldpoint/{id}/{option}")
	public  ModelAndView getOneColdPoint(@PathVariable Integer id,@PathVariable int option) {
		ColdPoint oneColdPoint = service.getOneColdPoint(id);
		if(option ==1) {
			return new ModelAndView("coldPointDetail","oneColdPoint",oneColdPoint);
		}
		if(option ==2) {
			return new ModelAndView("coldPointUpdate","oneColdPoint",oneColdPoint);
		}
		return null;
	}
	
	
	@InitBinder("coldPoint")
	public void getColdPoint(WebDataBinder wb) {
		wb.setFieldDefaultPrefix("coldPoint.");
	}
	
	
	
	@RequestMapping(value="getAll/coldpoints/{pageNum}")
	public String  getAllColdPoints(@PathVariable int pageNum,ModelMap modelMap, HttpServletRequest request,HttpServletResponse response) {
		Map<String ,Object> map=new HashMap<String, Object>();
		map.put("boxcode", request.getParameter("boxcode"));
		map.put("boxname", request.getParameter("boxname"));
		map.put("boxtype", request.getParameter("boxtype"));
		List<ColdPoint> allColdPoint = service.getAllColdPoint(map);
		PageInfo<ColdPoint> pageInfo=new PageInfo<ColdPoint>(allColdPoint);
		PageHelper.startPage(pageNum, 5);
		request.getSession().setAttribute("pageInfo", pageInfo);
		modelMap.put("allColdPoint", allColdPoint);
		return "coldPoint";
		
	}
	
	
	@RequestMapping(value="getAll/coldpoint/{pageNum}")
	public String  getAllColdPoint(@PathVariable int pageNum,ModelMap modelMap, HttpServletRequest request,HttpServletResponse response) {
		Map<String ,Object> map=new HashMap<String, Object>();
		List<ColdPoint> allColdPoint = service.getAllColdPoint(map);
		PageInfo<ColdPoint> pageInfo=new PageInfo<ColdPoint>(allColdPoint);
		PageHelper.startPage(pageNum, 5);
		request.getSession().setAttribute("pageInfo", pageInfo);
		modelMap.put("allColdPoint", allColdPoint);
		return "coldPoint";
		
	}
	
	
	
	
	
	@RequestMapping(value="hello", method=RequestMethod.GET)
	public String say(HashMap<String, Object> map) {
		map.put("hello", "欢迎进入HTML页面");
		return "/index";
	}
	
	

	@RequestMapping(value="update/coldpoint")
	public String updateColdPoint(ColdPoint oneColdPoint) {
		oneColdPoint.setCreatedt(new Date());
		oneColdPoint.setModifydt(new Date());
		Integer updateColdPoint = service.updateColdPoint(oneColdPoint);
		if(updateColdPoint!=null) {
			return "redirect:/coldpoint/getAll/coldpoints/1";
		}else {
			return "error";
		}
		
		
		
		
	}
	
}


