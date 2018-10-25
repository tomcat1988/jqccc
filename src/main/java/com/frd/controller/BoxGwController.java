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

import com.frd.model.BoxGw;
import com.frd.service.BoxGwService;

@Controller
@RequestMapping("boxgw")
public class BoxGwController {
	@Autowired
	private  BoxGwService boxService;
	
	@RequestMapping(value="add/boxgw")
	public ModelAndView  addBoxGw(BoxGw boxgw) {
		Integer addBoxGw = boxService.addBoxGw(boxgw);
		if(addBoxGw!=null) {
			return new ModelAndView("main.jsp");
		}else {
			return null;
		}
	}
	
	@RequestMapping(value="delete/boxgw/{id}")
	public  String   deleteBoxGw(@PathVariable Integer id) {
		 boxService.deleteBoxGw(id);
		return "redirct:";
	}
	
	
	@RequestMapping(value="getOne/boxgw")
	public  ModelAndView getOneBoxGw(Integer id) {
		BoxGw oneBoxGw = boxService.getOneBoxGw(id);
		if(oneBoxGw!=null) {
			return new ModelAndView("getOneBase","oneBoxGw",oneBoxGw);
		}
		return null;
	}
	
	
	@RequestMapping(value="getAll/boxgw")
	public ModelAndView  getAllBoxGw(HttpServletRequest request) {
		Map<String, Object> map=new HashMap<String, Object>();
		ModelAndView modelAndView=new ModelAndView();
		map.put("name", request.getAttribute("11"));
		List<BoxGw> allBoxGw = boxService.getAllBoxGw(map);
		if(!allBoxGw.isEmpty()) {
			modelAndView.addObject("allBoxGw", allBoxGw);
			return modelAndView;
		}else {
			return null;
		}
	}
	
	
	@RequestMapping(value="update/boxgw")
	public String updateBoxGw(BoxGw boxgw) {
		Integer updateBoxGw = boxService.updateBoxGw(boxgw);
		if(updateBoxGw!=null) {
			return "";
		}else {
			return "error";
		}
		
		
		
		
	}
	
}

