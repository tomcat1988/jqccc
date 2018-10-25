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

import com.frd.model.PltPallet;
import com.frd.service.PltPalletService;

@Controller
@RequestMapping("pltpallet")
public class PltPalletController {
	@Autowired
	private  PltPalletService boxService;
	
	@RequestMapping(value="add/pltpallet")
	public ModelAndView  addPltPallet(PltPallet pltpallet) {
		Integer addPltPallet = boxService.addPltPallet(pltpallet);
		if(addPltPallet!=null) {
			return new ModelAndView("main.jsp");
		}else {
			return null;
		}
	}
	
	@RequestMapping(value="delete/pltpallet/{id}")
	public  String   deletePltPallet(@PathVariable Integer id) {
		 boxService.deletePltPallet(id);
		return "redirct:";
	}
	
	
	@RequestMapping(value="getOne/pltpallet")
	public  ModelAndView getOnePltPallet(Integer id) {
		PltPallet onePltPallet = boxService.getOnePltPallet(id);
		if(onePltPallet!=null) {
			return new ModelAndView("getOneBase","onePltPallet",onePltPallet);
		}
		return null;
	}
	
	
	@RequestMapping(value="getAll/pltpallet")
	public ModelAndView  getAllPltPallet(HttpServletRequest request) {
		Map<String, Object> map=new HashMap<String, Object>();
		ModelAndView modelAndView=new ModelAndView();
		map.put("name", request.getAttribute("11"));
		List<PltPallet> allPltPallet = boxService.getAllPltPallet(map);
		if(!allPltPallet.isEmpty()) {
			modelAndView.addObject("allPltPallet", allPltPallet);
			return modelAndView;
		}else {
			return null;
		}
	}
	
	
	@RequestMapping(value="update/pltpallet")
	public String updatePltPallet(PltPallet pltpallet) {
		Integer updatePltPallet = boxService.updatePltPallet(pltpallet);
		if(updatePltPallet!=null) {
			return "";
		}else {
			return "error";
		}
		
		
		
		
	}
	
}

