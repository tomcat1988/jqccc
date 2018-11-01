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

import com.frd.model.PltLease;
import com.frd.service.PltLeaseService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Controller
@RequestMapping("/pltlease")
public class PltLeaseController {
	@Autowired
	private  PltLeaseService service;
	
	@RequestMapping(value="add/pltlease")
	public String  addPltLease(PltLease pltlease) {
		pltlease.setCreatedt(new Date());
		pltlease.setModifydt(new Date());
		pltlease.setAdt(new Date());
		pltlease.setEdt(new Date());
		pltlease.setLeasedt(new Date());
		Integer addPltLease = service.addPltLease(pltlease);
		if(addPltLease!=null) {
			return "redirect:/pltlease/getAll/pltleases/1";
		}else { 
			return "error";
		} 
	}
	
	@RequestMapping(value="delete/pltlease/{id}")
	public  String   deletePltLease(@PathVariable Integer id) {
		 service.deletePltLease(id);
		return "redirect:/pltlease/getAll/pltleases/1";
	}
	
	
	@RequestMapping(value="getOne/pltlease/{id}/{option}")
	public  ModelAndView getOnePltLease(@PathVariable Integer id,@PathVariable int option) {
		PltLease onePltLease = service.getOnePltLease(id);
		if(option ==1) {
			return new ModelAndView("pltLeaseDetail","onePltLease",onePltLease);
		}
		if(option ==2) {
			return new ModelAndView("pltLeaseUpdate","onePltLease",onePltLease);
		}
		return null;
	}
	
	
	@InitBinder("pltLease")
	public void getPltLease(WebDataBinder wb) {
		wb.setFieldDefaultPrefix("pltLease.");
	}
	
	
	
	@RequestMapping(value="getAll/pltleases/{pageNum}")
	public String  getAllPltLeases(@PathVariable int pageNum,ModelMap modelMap, HttpServletRequest request,HttpServletResponse response) {
		Map<String ,Object> map=new HashMap<String, Object>();
		map.put("pltname", request.getParameter("pltname"));
		map.put("customer", request.getParameter("customer"));
		List<PltLease> allPltLease = service.getAllPltLease(map);
		PageInfo<PltLease> pageInfo=new PageInfo<PltLease>(allPltLease);
		PageHelper.startPage(pageNum, 5);
		request.getSession().setAttribute("pageInfo", pageInfo);
		modelMap.put("allPltLease", allPltLease);
		return "pltLease";
		
	}
	
	
	@RequestMapping(value="getAll/pltlease/{pageNum}")
	public String  getAllPltLease(@PathVariable int pageNum,ModelMap modelMap, HttpServletRequest request,HttpServletResponse response) {
		Map<String ,Object> map=new HashMap<String, Object>();
		List<PltLease> allPltLease = service.getAllPltLease(map);
		PageInfo<PltLease> pageInfo=new PageInfo<PltLease>(allPltLease);
		PageHelper.startPage(pageNum, 5);
		request.getSession().setAttribute("pageInfo", pageInfo);
		modelMap.put("allPltLease", allPltLease);
		return "pltLease";
		
	}
	
	
	
	
	
	@RequestMapping(value="hello", method=RequestMethod.GET)
	public String say(HashMap<String, Object> map) {
		map.put("hello", "欢迎进入HTML页面");
		return "/index";
	}
	
	

	@RequestMapping(value="update/pltlease")
	public String updatePltLease(PltLease onePltLease) {
		onePltLease.setCreatedt(new Date());
		onePltLease.setModifydt(new Date());
		onePltLease.setAdt(new Date());
		onePltLease.setEdt(new Date());
		onePltLease.setLeasedt(new Date());
		Integer updatePltLease = service.updatePltLease(onePltLease);
		if(updatePltLease!=null) {
			return "redirect:/pltlease/getAll/pltleases/1";
		}else {
			return "error";
		}
		
		
		
		
	}
	
}


