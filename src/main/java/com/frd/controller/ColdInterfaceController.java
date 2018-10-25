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

import com.frd.model.ColdInterface;
import com.frd.service.ColdInterfaceService;

@Controller
@RequestMapping("coldinterface")
public class ColdInterfaceController {
	@Autowired
	private  ColdInterfaceService boxService;
	
	@RequestMapping(value="add/coldinterface")
	public ModelAndView  addColdInterface(ColdInterface coldinterface) {
		Integer addColdInterface = boxService.addColdInterface(coldinterface);
		if(addColdInterface!=null) {
			return new ModelAndView("main.jsp");
		}else {
			return null;
		}
	}
	
	@RequestMapping(value="delete/coldinterface/{id}")
	public  String   deleteColdInterface(@PathVariable Integer id) {
		 boxService.deleteColdInterface(id);
		return "redirct:";
	}
	
	
	@RequestMapping(value="getOne/coldinterface")
	public  ModelAndView getOneColdInterface(Integer id) {
		ColdInterface oneColdInterface = boxService.getOneColdInterface(id);
		if(oneColdInterface!=null) {
			return new ModelAndView("getOneBase","oneColdInterface",oneColdInterface);
		}
		return null;
	}
	
	
	@RequestMapping(value="getAll/coldinterface")
	public ModelAndView  getAllColdInterface(HttpServletRequest request) {
		Map<String, Object> map=new HashMap<String, Object>();
		ModelAndView modelAndView=new ModelAndView();
		map.put("name", request.getAttribute("11"));
		List<ColdInterface> allColdInterface = boxService.getAllColdInterface(map);
		if(!allColdInterface.isEmpty()) {
			modelAndView.addObject("allColdInterface", allColdInterface);
			return modelAndView;
		}else {
			return null;
		}
	}
	
	
	@RequestMapping(value="update/coldinterface")
	public String updateColdInterface(ColdInterface coldinterface) {
		Integer updateColdInterface = boxService.updateColdInterface(coldinterface);
		if(updateColdInterface!=null) {
			return "";
		}else {
			return "error";
		}
		
		
		
		
	}
	
}

