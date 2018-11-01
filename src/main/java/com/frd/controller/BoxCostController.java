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

import com.frd.model.BoxCost;
import com.frd.service.BoxCostService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Controller
@RequestMapping("/boxcost")
public class BoxCostController {
	@Autowired
	private  BoxCostService service;
	
	@RequestMapping(value="add/boxcost")
	public String  addBoxCost(BoxCost boxcost) {
		boxcost.setCreatedt(new Date());
		boxcost.setModifydt(new Date());
		boxcost.setCosttime(new Date());
		Integer addBoxCost = service.addBoxCost(boxcost);
		if(addBoxCost!=null) {
			return "redirect:/boxcost/getAll/boxcosts/1";
		}else { 
			return "error";
		} 
	}
	
	@RequestMapping(value="delete/boxcost/{id}")
	public  String   deleteBoxCost(@PathVariable Integer id) {
		 service.deleteBoxCost(id);
		return "redirect:/boxcost/getAll/boxcosts/1";
	}
	
	
	@RequestMapping(value="getOne/boxcost/{id}/{option}")
	public  ModelAndView getOneBoxCost(@PathVariable Integer id,@PathVariable int option) {
		BoxCost oneBoxCost = service.getOneBoxCost(id);
		if(option ==1) {
			return new ModelAndView("boxCostDetail","oneBoxCost",oneBoxCost);
		}
		if(option ==2) {
			return new ModelAndView("boxCostUpdate","oneBoxCost",oneBoxCost);
		}
		return null;
	}
	
	
	@InitBinder("boxCost")
	public void getBoxCost(WebDataBinder wb) {
		wb.setFieldDefaultPrefix("boxCost.");
	}
	
	
	
	@RequestMapping(value="getAll/boxcosts/{pageNum}")
	public String  getAllBoxCosts(@PathVariable int pageNum,ModelMap modelMap, HttpServletRequest request,HttpServletResponse response) {
		Map<String ,Object> map=new HashMap<String, Object>();
		map.put("boxcode", request.getParameter("boxcode"));
		map.put("boxname", request.getParameter("boxname"));
		List<BoxCost> allBoxCost = service.getAllBoxCost(map);
		PageInfo<BoxCost> pageInfo=new PageInfo<BoxCost>(allBoxCost);
		PageHelper.startPage(pageNum, 5);
		request.getSession().setAttribute("pageInfo", pageInfo);
		modelMap.put("allBoxCost", allBoxCost);
		return "boxCost";
		
	}
	
	
	@RequestMapping(value="getAll/boxcost/{pageNum}")
	public String  getAllBoxCost(@PathVariable int pageNum,ModelMap modelMap, HttpServletRequest request,HttpServletResponse response) {
		Map<String ,Object> map=new HashMap<String, Object>();
		List<BoxCost> allBoxCost = service.getAllBoxCost(map);
		PageInfo<BoxCost> pageInfo=new PageInfo<BoxCost>(allBoxCost);
		PageHelper.startPage(pageNum, 5);
		request.getSession().setAttribute("pageInfo", pageInfo);
		modelMap.put("allBoxCost", allBoxCost);
		return "boxCost";
		
	}
	
	
	
	
	
	@RequestMapping(value="hello", method=RequestMethod.GET)
	public String say(HashMap<String, Object> map) {
		map.put("hello", "欢迎进入HTML页面");
		return "/index";
	}
	
	

	@RequestMapping(value="update/boxcost")
	public String updateBoxCost(BoxCost oneBoxCost) {
		oneBoxCost.setCreatedt(new Date());
		oneBoxCost.setModifydt(new Date());
		oneBoxCost.setCosttime(new Date());
		Integer updateBoxCost = service.updateBoxCost(oneBoxCost);
		if(updateBoxCost!=null) {
			return "redirect:/boxcost/getAll/boxcosts/1";
		}else {
			return "error";
		}
		
		
		
		
	}
	
}


