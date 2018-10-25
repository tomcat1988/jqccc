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

import com.frd.model.ColdWarn;
import com.frd.service.ColdWarnService;

@Controller
@RequestMapping("coldwarn")
public class ColdWarnController {
	@Autowired
	private  ColdWarnService boxService;
	
	@RequestMapping(value="add/coldwarn")
	public ModelAndView  addColdWarn(ColdWarn coldwarn) {
		Integer addColdWarn = boxService.addColdWarn(coldwarn);
		if(addColdWarn!=null) {
			return new ModelAndView("main.jsp");
		}else {
			return null;
		}
	}
	
	@RequestMapping(value="delete/coldwarn/{id}")
	public  String   deleteColdWarn(@PathVariable Integer id) {
		 boxService.deleteColdWarn(id);
		return "redirct:";
	}
	
	
	@RequestMapping(value="getOne/coldwarn")
	public  ModelAndView getOneColdWarn(Integer id) {
		ColdWarn oneColdWarn = boxService.getOneColdWarn(id);
		if(oneColdWarn!=null) {
			return new ModelAndView("getOneBase","oneColdWarn",oneColdWarn);
		}
		return null;
	}
	
	
	@RequestMapping(value="getAll/coldwarn")
	public ModelAndView  getAllColdWarn(HttpServletRequest request) {
		Map<String, Object> map=new HashMap<String, Object>();
		ModelAndView modelAndView=new ModelAndView();
		map.put("name", request.getAttribute("11"));
		List<ColdWarn> allColdWarn = boxService.getAllColdWarn(map);
		if(!allColdWarn.isEmpty()) {
			modelAndView.addObject("allColdWarn", allColdWarn);
			return modelAndView;
		}else {
			return null;
		}
	}
	
	
	@RequestMapping(value="update/coldwarn")
	public String updateColdWarn(ColdWarn coldwarn) {
		Integer updateColdWarn = boxService.updateColdWarn(coldwarn);
		if(updateColdWarn!=null) {
			return "";
		}else {
			return "error";
		}
		
		
		
		
	}
	
}

