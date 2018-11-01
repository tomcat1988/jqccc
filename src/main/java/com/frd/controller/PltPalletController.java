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

import com.frd.model.PltPallet;
import com.frd.service.PltPalletService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Controller
@RequestMapping("/pltpallet")
public class PltPalletController {
	@Autowired
	private  PltPalletService service;
	
	@RequestMapping(value="add/pltpallet")
	public String  addPltPallet(PltPallet pltpallet) {
		pltpallet.setCreatedt(new Date());
		pltpallet.setModifydt(new Date());
		Integer addPltPallet = service.addPltPallet(pltpallet);
		if(addPltPallet!=null) {
			return "redirect:/pltpallet/getAll/pltpallets/1";
		}else { 
			return "error";
		} 
	}
	
	@RequestMapping(value="delete/pltpallet/{id}")
	public  String   deletePltPallet(@PathVariable Integer id) {
		 service.deletePltPallet(id);
		return "redirect:/pltpallet/getAll/pltpallets/1";
	}
	
	
	@RequestMapping(value="getOne/pltpallet/{id}/{option}")
	public  ModelAndView getOnePltPallet(@PathVariable Integer id,@PathVariable int option) {
		PltPallet onePltPallet = service.getOnePltPallet(id);
		if(option ==1) {
			return new ModelAndView("pltPalletDetail","onePltPallet",onePltPallet);
		}
		if(option ==2) {
			return new ModelAndView("pltPalletUpdate","onePltPallet",onePltPallet);
		}
		return null;
	}
	
	
	@InitBinder("pltPallet")
	public void getPltPallet(WebDataBinder wb) {
		wb.setFieldDefaultPrefix("pltPallet.");
	}
	
	
	
	@RequestMapping(value="getAll/pltpallets/{pageNum}")
	public String  getAllPltPallets(@PathVariable int pageNum,ModelMap modelMap, HttpServletRequest request,HttpServletResponse response) {
		Map<String ,Object> map=new HashMap<String, Object>();
		map.put("pltname", request.getParameter("pltname"));
		map.put("plttype", request.getParameter("plttype"));
		List<PltPallet> allPltPallet = service.getAllPltPallet(map);
		PageInfo<PltPallet> pageInfo=new PageInfo<PltPallet>(allPltPallet);
		PageHelper.startPage(pageNum, 5);
		request.getSession().setAttribute("pageInfo", pageInfo);
		modelMap.put("allPltPallet", allPltPallet);
		return "pltPallet";
		
	}
	
	
	@RequestMapping(value="getAll/pltpallet/{pageNum}")
	public String  getAllPltPallet(@PathVariable int pageNum,ModelMap modelMap, HttpServletRequest request,HttpServletResponse response) {
		Map<String ,Object> map=new HashMap<String, Object>();
		List<PltPallet> allPltPallet = service.getAllPltPallet(map);
		PageInfo<PltPallet> pageInfo=new PageInfo<PltPallet>(allPltPallet);
		PageHelper.startPage(pageNum, 5);
		request.getSession().setAttribute("pageInfo", pageInfo);
		modelMap.put("allPltPallet", allPltPallet);
		return "pltPallet";
		
	}
	
	
	
	
	
	@RequestMapping(value="hello", method=RequestMethod.GET)
	public String say(HashMap<String, Object> map) {
		map.put("hello", "欢迎进入HTML页面");
		return "/index";
	}
	
	

	@RequestMapping(value="update/pltpallet")
	public String updatePltPallet(PltPallet onePltPallet) {
		onePltPallet.setCreatedt(new Date());
		onePltPallet.setModifydt(new Date());
		Integer updatePltPallet = service.updatePltPallet(onePltPallet);
		if(updatePltPallet!=null) {
			return "redirect:/pltpallet/getAll/pltpallets/1";
		}else {
			return "error";
		}
		
		
		
		
	}
	
}


