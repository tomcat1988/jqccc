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

import com.frd.model.ColdInterface;
import com.frd.service.ColdInterfaceService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Controller
@RequestMapping("/coldinterface")
public class ColdInterfaceController {
	@Autowired
	private  ColdInterfaceService service;
	
	@RequestMapping(value="add/coldinterface")
	public String  addColdInterface(ColdInterface coldinterface) {
		coldinterface.setCreatedt(new Date());
		coldinterface.setModifydt(new Date());
		Integer addColdInterface = service.addColdInterface(coldinterface);
		if(addColdInterface!=null) {
			return "redirect:/coldinterface/getAll/coldinterfaces/1";
		}else { 
			return "error";
		} 
	}
	
	@RequestMapping(value="delete/coldinterface/{id}")
	public  String   deleteColdInterface(@PathVariable Integer id) {
		 service.deleteColdInterface(id);
		return "redirect:/coldinterface/getAll/coldinterfaces/1";
	}
	
	
	@RequestMapping(value="getOne/coldinterface/{id}/{option}")
	public  ModelAndView getOneColdInterface(@PathVariable Integer id,@PathVariable int option) {
		ColdInterface oneColdInterface = service.getOneColdInterface(id);
		if(option ==1) {
			return new ModelAndView("coldInterfaceDetail","oneColdInterface",oneColdInterface);
		}
		if(option ==2) {
			return new ModelAndView("coldInterfaceUpdate","oneColdInterface",oneColdInterface);
		}
		return null;
	}
	
	
	@InitBinder("coldInterface")
	public void getColdInterface(WebDataBinder wb) {
		wb.setFieldDefaultPrefix("coldInterface.");
	}
	
	
	
	@RequestMapping(value="getAll/coldinterfaces/{pageNum}")
	public String  getAllColdInterfaces(@PathVariable int pageNum,ModelMap modelMap, HttpServletRequest request,HttpServletResponse response) {
		Map<String ,Object> map=new HashMap<String, Object>();
		map.put("infcode", request.getParameter("infcode"));
		map.put("infname", request.getParameter("infname"));
		List<ColdInterface> allColdInterface = service.getAllColdInterface(map);
		PageInfo<ColdInterface> pageInfo=new PageInfo<ColdInterface>(allColdInterface);
		PageHelper.startPage(pageNum, 5);
		request.getSession().setAttribute("pageInfo", pageInfo);
		modelMap.put("allColdInterface", allColdInterface);
		return "coldInterface";
		
	}
	
	
	@RequestMapping(value="getAll/coldinterface/{pageNum}")
	public String  getAllColdInterface(@PathVariable int pageNum,ModelMap modelMap, HttpServletRequest request,HttpServletResponse response) {
		Map<String ,Object> map=new HashMap<String, Object>();
		List<ColdInterface> allColdInterface = service.getAllColdInterface(map);
		PageInfo<ColdInterface> pageInfo=new PageInfo<ColdInterface>(allColdInterface);
		PageHelper.startPage(pageNum, 5);
		request.getSession().setAttribute("pageInfo", pageInfo);
		modelMap.put("allColdInterface", allColdInterface);
		return "coldInterface";
		
	}
	
	
	
	
	
	@RequestMapping(value="hello", method=RequestMethod.GET)
	public String say(HashMap<String, Object> map) {
		map.put("hello", "欢迎进入HTML页面");
		return "/index";
	}
	
	

	@RequestMapping(value="update/coldinterface")
	public String updateColdInterface(ColdInterface oneColdInterface) {
		oneColdInterface.setCreatedt(new Date());
		oneColdInterface.setModifydt(new Date());
		Integer updateColdInterface = service.updateColdInterface(oneColdInterface);
		if(updateColdInterface!=null) {
			return "redirect:/coldinterface/getAll/coldinterfaces/1";
		}else {
			return "error";
		}
		
		
		
		
	}
	
}


