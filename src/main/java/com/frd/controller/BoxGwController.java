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

import com.frd.model.BoxGw;
import com.frd.service.BoxGwService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Controller
@RequestMapping("/boxgw")
public class BoxGwController {
	@Autowired
	private  BoxGwService service;
	
	@RequestMapping(value="add/boxgw")
	public String  addBoxGw(BoxGw boxgw) {
		boxgw.setCreatedt(new Date());
		boxgw.setModifydt(new Date());
		boxgw.setGwtime(new Date());
		Integer addBoxGw = service.addBoxGw(boxgw);
		if(addBoxGw!=null) {
			return "redirect:/boxgw/getAll/boxgws/1";
		}else { 
			return "error";
		} 
	}
	
	@RequestMapping(value="delete/boxgw/{id}")
	public  String   deleteBoxGw(@PathVariable Integer id) {
		 service.deleteBoxGw(id);
		return "redirect:/boxgw/getAll/boxgws/1";
	}
	
	
	@RequestMapping(value="getOne/boxgw/{id}/{option}")
	public  ModelAndView getOneBoxGw(@PathVariable Integer id,@PathVariable int option) {
		BoxGw oneBoxGw = service.getOneBoxGw(id);
		if(option ==1) {
			return new ModelAndView("boxGwDetail","oneBoxGw",oneBoxGw);
		}
		if(option ==2) {
			return new ModelAndView("boxGwUpdate","oneBoxGw",oneBoxGw);
		}
		return null;
	}
	
	
	@InitBinder("boxGw")
	public void getBoxGw(WebDataBinder wb) {
		wb.setFieldDefaultPrefix("boxGw.");
	}
	
	
	
	@RequestMapping(value="getAll/boxgws/{pageNum}")
	public String  getAllBoxGws(@PathVariable int pageNum,ModelMap modelMap, HttpServletRequest request,HttpServletResponse response) {
		Map<String ,Object> map=new HashMap<String, Object>();
		map.put("boxcode", request.getParameter("boxcode"));
		map.put("boxname", request.getParameter("boxname"));
		map.put("boxtype", request.getParameter("boxtype"));
		List<BoxGw> allBoxGw = service.getAllBoxGw(map);
		PageInfo<BoxGw> pageInfo=new PageInfo<BoxGw>(allBoxGw);
		PageHelper.startPage(pageNum, 5);
		request.getSession().setAttribute("pageInfo", pageInfo);
		modelMap.put("allBoxGw", allBoxGw);
		return "boxGw";
		
	}
	
	
	@RequestMapping(value="getAll/boxgw/{pageNum}")
	public String  getAllBoxGw(@PathVariable int pageNum,ModelMap modelMap, HttpServletRequest request,HttpServletResponse response) {
		Map<String ,Object> map=new HashMap<String, Object>();
		List<BoxGw> allBoxGw = service.getAllBoxGw(map);
		PageInfo<BoxGw> pageInfo=new PageInfo<BoxGw>(allBoxGw);
		PageHelper.startPage(pageNum, 5);
		request.getSession().setAttribute("pageInfo", pageInfo);
		modelMap.put("allBoxGw", allBoxGw);
		return "boxGw";
		
	}
	
	
	
	
	
	@RequestMapping(value="hello", method=RequestMethod.GET)
	public String say(HashMap<String, Object> map) {
		map.put("hello", "欢迎进入HTML页面");
		return "/index";
	}
	
	

	@RequestMapping(value="update/boxgw")
	public String updateBoxGw(BoxGw oneBoxGw) {
		oneBoxGw.setCreatedt(new Date());
		oneBoxGw.setModifydt(new Date());
		oneBoxGw.setGwtime(new Date());
		Integer updateBoxGw = service.updateBoxGw(oneBoxGw);
		if(updateBoxGw!=null) {
			return "redirect:/boxgw/getAll/boxgws/1";
		}else {
			return "error";
		}
	}
	
}


