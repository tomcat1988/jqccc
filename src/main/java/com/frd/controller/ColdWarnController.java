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

import com.frd.model.ColdWarn;
import com.frd.service.ColdWarnService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Controller
@RequestMapping("/coldwarn")
public class ColdWarnController {
	@Autowired
	private  ColdWarnService service;
	
	@RequestMapping(value="add/coldwarn")
	public String  addColdWarn(ColdWarn coldwarn) {
		coldwarn.setCreatedt(new Date());
		coldwarn.setModifydt(new Date());
		Integer addColdWarn = service.addColdWarn(coldwarn);
		if(addColdWarn!=null) {
			return "redirect:/coldwarn/getAll/coldwarns/1";
		}else { 
			return "error";
		} 
	}
	
	@RequestMapping(value="delete/coldwarn/{id}")
	public  String   deleteColdWarn(@PathVariable Integer id) {
		 service.deleteColdWarn(id);
		return "redirect:/coldwarn/getAll/coldwarns/1";
	}
	
	
	@RequestMapping(value="getOne/coldwarn/{id}/{option}")
	public  ModelAndView getOneColdWarn(@PathVariable Integer id,@PathVariable int option) {
		ColdWarn oneColdWarn = service.getOneColdWarn(id);
		if(option ==1) {
			return new ModelAndView("coldWarnDetail","oneColdWarn",oneColdWarn);
		}
		if(option ==2) {
			return new ModelAndView("coldWarnUpdate","oneColdWarn",oneColdWarn);
		}
		return null;
	}
	
	
	@InitBinder("coldWarn")
	public void getColdWarn(WebDataBinder wb) {
		wb.setFieldDefaultPrefix("coldWarn.");
	}
	
	
	
	@RequestMapping(value="getAll/coldwarns/{pageNum}")
	public String  getAllColdWarns(@PathVariable int pageNum,ModelMap modelMap, HttpServletRequest request,HttpServletResponse response) {
		Map<String ,Object> map=new HashMap<String, Object>();
		map.put("warnname", request.getParameter("warnname"));
		map.put("warncode", request.getParameter("warncode"));
		List<ColdWarn> allColdWarn = service.getAllColdWarn(map);
		PageInfo<ColdWarn> pageInfo=new PageInfo<ColdWarn>(allColdWarn);
		PageHelper.startPage(pageNum, 5);
		request.getSession().setAttribute("pageInfo", pageInfo);
		modelMap.put("allColdWarn", allColdWarn);
		return "coldWarn";
		
	}
	
	
	@RequestMapping(value="getAll/coldwarn/{pageNum}")
	public String  getAllColdWarn(@PathVariable int pageNum,ModelMap modelMap, HttpServletRequest request,HttpServletResponse response) {
		Map<String ,Object> map=new HashMap<String, Object>();
		List<ColdWarn> allColdWarn = service.getAllColdWarn(map);
		PageInfo<ColdWarn> pageInfo=new PageInfo<ColdWarn>(allColdWarn);
		PageHelper.startPage(pageNum, 5);
		request.getSession().setAttribute("pageInfo", pageInfo);
		modelMap.put("allColdWarn", allColdWarn);
		return "coldWarn";
		
	}
	
	
	
	
	
	@RequestMapping(value="hello", method=RequestMethod.GET)
	public String say(HashMap<String, Object> map) {
		map.put("hello", "欢迎进入HTML页面");
		return "/index";
	}
	
	

	@RequestMapping(value="update/coldwarn")
	public String updateColdWarn(ColdWarn oneColdWarn) {
		oneColdWarn.setCreatedt(new Date());
		oneColdWarn.setModifydt(new Date());
		Integer updateColdWarn = service.updateColdWarn(oneColdWarn);
		if(updateColdWarn!=null) {
			return "redirect:/coldwarn/getAll/coldwarns/1";
		}else {
			return "error";
		}
		
		
		
		
	}
	
}


