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

import com.frd.model.BaseBox;
import com.frd.service.BaseBoxService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Controller
@RequestMapping("/basebox")
public class BaseBoxController {
	@Autowired
	private  BaseBoxService boxService;
	
	@RequestMapping(value="add/basebox")
	public String  addBaseBox(BaseBox basebox) {
		basebox.setCreatedt(new Date());
		basebox.setModifydt(new Date());
		Integer addBaseBox = boxService.addBaseBox(basebox);
		if(addBaseBox!=null) {
			return "redirect:/basebox/getAll/baseboxs/1";
		}else { 
			return "error";
		} 
	}
	
	@RequestMapping(value="delete/basebox/{id}")
	public  String   deleteBaseBox(@PathVariable Integer id) {
		 boxService.deleteBaseBox(id);
		return "redirect:/basebox/getAll/baseboxs/1";
	}
	
	
	@RequestMapping(value="getOne/basebox/{id}/{option}")
	public  ModelAndView getOneBaseBox(@PathVariable Integer id,@PathVariable int option) {
		BaseBox oneBaseBox = boxService.getOneBaseBox(id);
		if(option ==1) {
			return new ModelAndView("baseBoxDetail","oneBaseBox",oneBaseBox);
		}
		if(option ==2) {
			return new ModelAndView("baseBoxUpdate","oneBaseBox",oneBaseBox);
		}
		return null;
	}
	
	
	@InitBinder("baseBox")
	public void getBaseBox(WebDataBinder wb) {
		wb.setFieldDefaultPrefix("baseBox.");
	}
	
	
	
	@RequestMapping(value="getAll/baseboxs/{pageNum}")
	public String  getAllBaseBoxs(@PathVariable int pageNum,ModelMap modelMap, HttpServletRequest request,HttpServletResponse response) {
		Map<String ,Object> map=new HashMap<String, Object>();
		map.put("boxcode", request.getParameter("boxcode"));
		map.put("boxname", request.getParameter("boxname"));
		map.put("boxtype", request.getParameter("boxtype"));
		List<BaseBox> allBaseBox = boxService.getAllBaseBox(map);
		PageInfo<BaseBox> pageInfo=new PageInfo<BaseBox>(allBaseBox);
		PageHelper.startPage(pageNum, 5);
		request.getSession().setAttribute("pageInfo", pageInfo);
		modelMap.put("allBaseBox", allBaseBox);
		return "baseBox";
		
	}
	
	
	@RequestMapping(value="getAll/basebox/{pageNum}")
	public String  getAllBaseBox(@PathVariable int pageNum,ModelMap modelMap, HttpServletRequest request,HttpServletResponse response) {
		Map<String ,Object> map=new HashMap<String, Object>();
		List<BaseBox> allBaseBox = boxService.getAllBaseBox(map);
		PageInfo<BaseBox> pageInfo=new PageInfo<BaseBox>(allBaseBox);
		PageHelper.startPage(pageNum, 5);
		request.getSession().setAttribute("pageInfo", pageInfo);
		modelMap.put("allBaseBox", allBaseBox);
		return "baseBox";
		
	}
	
	
	
	
	
	@RequestMapping(value="hello", method=RequestMethod.GET)
	public String say(HashMap<String, Object> map) {
		map.put("hello", "欢迎进入HTML页面");
		return "/index";
	}
	
	

	@RequestMapping(value="update/basebox")
	public String updateBaseBox(BaseBox oneBaseBox) {
		oneBaseBox.setCreatedt(new Date());
		oneBaseBox.setModifydt(new Date());
		Integer updateBaseBox = boxService.updateBaseBox(oneBaseBox);
		if(updateBaseBox!=null) {
			return "redirect:/basebox/getAll/baseboxs/1";
		}else {
			return "error";
		}
		
		
		
		
	}
	
}

