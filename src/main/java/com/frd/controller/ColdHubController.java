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

import com.frd.model.ColdHub;
import com.frd.service.ColdHubService;

@Controller
@RequestMapping("coldhub")
public class ColdHubController {
	@Autowired
	private  ColdHubService boxService;
	
	@RequestMapping(value="add/coldhub")
	public ModelAndView  addColdHub(ColdHub coldhub) {
		Integer addColdHub = boxService.addColdHub(coldhub);
		if(addColdHub!=null) {
			return new ModelAndView("main.jsp");
		}else {
			return null;
		}
	}
	
	@RequestMapping(value="delete/coldhub/{id}")
	public  String   deleteColdHub(@PathVariable Integer id) {
		 boxService.deleteColdHub(id);
		return "redirct:";
	}
	
	
	@RequestMapping(value="getOne/coldhub")
	public  ModelAndView getOneColdHub(Integer id) {
		ColdHub oneColdHub = boxService.getOneColdHub(id);
		if(oneColdHub!=null) {
			return new ModelAndView("getOneBase","oneColdHub",oneColdHub);
		}
		return null;
	}
	
	
	@RequestMapping(value="getAll/coldhub")
	public ModelAndView  getAllColdHub(HttpServletRequest request) {
		Map<String, Object> map=new HashMap<String, Object>();
		ModelAndView modelAndView=new ModelAndView();
		map.put("name", request.getAttribute("11"));
		List<ColdHub> allColdHub = boxService.getAllColdHub(map);
		if(!allColdHub.isEmpty()) {
			modelAndView.addObject("allColdHub", allColdHub);
			return modelAndView;
		}else {
			return null;
		}
	}
	
	
	@RequestMapping(value="update/coldhub")
	public String updateColdHub(ColdHub coldhub) {
		Integer updateColdHub = boxService.updateColdHub(coldhub);
		if(updateColdHub!=null) {
			return "";
		}else {
			return "error";
		}
		
		
		
		
	}
	
}

