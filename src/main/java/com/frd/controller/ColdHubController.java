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

import com.frd.model.ColdHub;
import com.frd.service.ColdHubService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Controller
@RequestMapping("/coldhub")
public class ColdHubController {
	@Autowired
	private  ColdHubService service;
	
	@RequestMapping(value="add/coldhub")
	public String  addColdHub(ColdHub coldhub) {
		coldhub.setCreatedt(new Date());
		coldhub.setModifydt(new Date());
		Integer addColdHub = service.addColdHub(coldhub);
		if(addColdHub!=null) {
			return "redirect:/coldhub/getAll/coldhubs/1";
		}else { 
			return "error";
		} 
	}
	
	@RequestMapping(value="delete/coldhub/{id}")
	public  String   deleteColdHub(@PathVariable Integer id) {
		 service.deleteColdHub(id);
		return "redirect:/coldhub/getAll/coldhubs/1";
	}
	
	
	@RequestMapping(value="getOne/coldhub/{id}/{option}")
	public  ModelAndView getOneColdHub(@PathVariable Integer id,@PathVariable int option) {
		ColdHub oneColdHub = service.getOneColdHub(id);
		if(option ==1) {
			return new ModelAndView("coldHubDetail","oneColdHub",oneColdHub);
		}
		if(option ==2) {
			return new ModelAndView("coldHubUpdate","oneColdHub",oneColdHub);
		}
		return null;
	}
	
	
	@InitBinder("coldHub")
	public void getColdHub(WebDataBinder wb) {
		wb.setFieldDefaultPrefix("coldHub.");
	}
	
	
	
	@RequestMapping(value="getAll/coldhubs/{pageNum}")
	public String  getAllColdHubs(@PathVariable int pageNum,ModelMap modelMap, HttpServletRequest request,HttpServletResponse response) {
		Map<String ,Object> map=new HashMap<String, Object>();
		map.put("boxcode", request.getParameter("boxcode"));
		map.put("boxname", request.getParameter("boxname"));
		map.put("boxtype", request.getParameter("boxtype"));
		List<ColdHub> allColdHub = service.getAllColdHub(map);
		PageInfo<ColdHub> pageInfo=new PageInfo<ColdHub>(allColdHub);
		PageHelper.startPage(pageNum, 5);
		request.getSession().setAttribute("pageInfo", pageInfo);
		modelMap.put("allColdHub", allColdHub);
		return "coldHub";
		
	}
	
	
	@RequestMapping(value="getAll/coldhub/{pageNum}")
	public String  getAllColdHub(@PathVariable int pageNum,ModelMap modelMap, HttpServletRequest request,HttpServletResponse response) {
		Map<String ,Object> map=new HashMap<String, Object>();
		List<ColdHub> allColdHub = service.getAllColdHub(map);
		PageInfo<ColdHub> pageInfo=new PageInfo<ColdHub>(allColdHub);
		PageHelper.startPage(pageNum, 5);
		request.getSession().setAttribute("pageInfo", pageInfo);
		modelMap.put("allColdHub", allColdHub);
		return "coldHub";
		
	}
	
	
	
	
	
	@RequestMapping(value="hello", method=RequestMethod.GET)
	public String say(HashMap<String, Object> map) {
		map.put("hello", "欢迎进入HTML页面");
		return "/index";
	}
	
	

	@RequestMapping(value="update/coldhub")
	public String updateColdHub(ColdHub oneColdHub) {
		oneColdHub.setCreatedt(new Date());
		oneColdHub.setModifydt(new Date());
		Integer updateColdHub = service.updateColdHub(oneColdHub);
		if(updateColdHub!=null) {
			return "redirect:/coldhub/getAll/coldhubs/1";
		}else {
			return "error";
		}
		
		
		
		
	}
	
}


