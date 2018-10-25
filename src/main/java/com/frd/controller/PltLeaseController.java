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

import com.frd.model.PltLease;
import com.frd.service.PltLeaseService;

@Controller
@RequestMapping("pltlease")
public class PltLeaseController {
	@Autowired
	private  PltLeaseService boxService;
	
	@RequestMapping(value="add/pltlease")
	public ModelAndView  addPltLease(PltLease pltlease) {
		Integer addPltLease = boxService.addPltLease(pltlease);
		if(addPltLease!=null) {
			return new ModelAndView("main.jsp");
		}else {
			return null;
		}
	}
	
	@RequestMapping(value="delete/pltlease/{id}")
	public  String   deletePltLease(@PathVariable Integer id) {
		 boxService.deletePltLease(id);
		return "redirct:";
	}
	
	
	@RequestMapping(value="getOne/pltlease")
	public  ModelAndView getOnePltLease(Integer id) {
		PltLease onePltLease = boxService.getOnePltLease(id);
		if(onePltLease!=null) {
			return new ModelAndView("getOneBase","onePltLease",onePltLease);
		}
		return null;
	}
	
	
	@RequestMapping(value="getAll/pltlease")
	public ModelAndView  getAllPltLease(HttpServletRequest request) {
		Map<String, Object> map=new HashMap<String, Object>();
		ModelAndView modelAndView=new ModelAndView();
		map.put("name", request.getAttribute("11"));
		List<PltLease> allPltLease = boxService.getAllPltLease(map);
		if(!allPltLease.isEmpty()) {
			modelAndView.addObject("allPltLease", allPltLease);
			return modelAndView;
		}else {
			return null;
		}
	}
	
	
	@RequestMapping(value="update/pltlease")
	public String updatePltLease(PltLease pltlease) {
		Integer updatePltLease = boxService.updatePltLease(pltlease);
		if(updatePltLease!=null) {
			return "";
		}else {
			return "error";
		}
		
		
		
		
	}
	
}

