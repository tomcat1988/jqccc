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

import com.frd.model.BaseBox;
import com.frd.service.BaseBoxService;

@Controller
@RequestMapping("basebox")
public class BaseBoxController {
	@Autowired
	private  BaseBoxService boxService;
	
	@RequestMapping(value="add/basebox")
	public ModelAndView  addBaseBox(BaseBox baseBox) {
		Integer addBaseBox = boxService.addBaseBox(baseBox);
		if(addBaseBox!=null) {
			return new ModelAndView("main.jsp");
		}else {
			return null;
		}
	}
	
	@RequestMapping(value="delete/basebox/{id}")
	public  String   deleteBaseBox(@PathVariable Integer id) {
		 boxService.deleteBaseBox(id);
		return "redirct:";
	}
	
	
	@RequestMapping(value="getOne/base")
	public  ModelAndView getOneBaseBox(Integer id) {
		BaseBox oneBaseBox = boxService.getOneBaseBox(id);
		if(oneBaseBox!=null) {
			return new ModelAndView("getOneBase","oneBaseBox",oneBaseBox);
		}
		return null;
	}
	
	
	@RequestMapping(value="getAll/basebox")
	public ModelAndView  getAllBaseBox(HttpServletRequest request) {
		Map<String, Object> map=new HashMap<String, Object>();
		ModelAndView modelAndView=new ModelAndView();
		map.put("name", request.getAttribute("11"));
		List<BaseBox> allBaseBox = boxService.getAllBaseBox(map);
		if(!allBaseBox.isEmpty()) {
			modelAndView.addObject("allBaseBox", allBaseBox);
			return modelAndView;
		}else {
			return null;
		}
	}
	
	
	@RequestMapping(value="update/basebox")
	public String updateBaseBox(BaseBox baseBox) {
		Integer updateBaseBox = boxService.updateBaseBox(baseBox);
		if(updateBaseBox!=null) {
			return "";
		}else {
			return "error";
		}
		
		
		
		
	}
	
}
