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

import com.frd.model.ProjContract;
import com.frd.service.ProjContractService;

@Controller
@RequestMapping("projcontract")
public class ProjContractController {
	@Autowired
	private  ProjContractService boxService;
	
	@RequestMapping(value="add/projcontract")
	public ModelAndView  addProjContract(ProjContract projcontract) {
		Integer addProjContract = boxService.addProjContract(projcontract);
		if(addProjContract!=null) {
			return new ModelAndView("main.jsp");
		}else {
			return null;
		}
	}
	
	@RequestMapping(value="delete/projcontract/{id}")
	public  String   deleteProjContract(@PathVariable Integer id) {
		 boxService.deleteProjContract(id);
		return "redirct:";
	}
	
	
	@RequestMapping(value="getOne/projcontract")
	public  ModelAndView getOneProjContract(Integer id) {
		ProjContract oneProjContract = boxService.getOneProjContract(id);
		if(oneProjContract!=null) {
			return new ModelAndView("getOneBase","oneProjContract",oneProjContract);
		}
		return null;
	}
	
	
	@RequestMapping(value="getAll/projcontract")
	public ModelAndView  getAllProjContract(HttpServletRequest request) {
		Map<String, Object> map=new HashMap<String, Object>();
		ModelAndView modelAndView=new ModelAndView();
		map.put("name", request.getAttribute("11"));
		List<ProjContract> allProjContract = boxService.getAllProjContract(map);
		if(!allProjContract.isEmpty()) {
			modelAndView.addObject("allProjContract", allProjContract);
			return modelAndView;
		}else {
			return null;
		}
	}
	
	
	@RequestMapping(value="update/projcontract")
	public String updateProjContract(ProjContract projcontract) {
		Integer updateProjContract = boxService.updateProjContract(projcontract);
		if(updateProjContract!=null) {
			return "";
		}else {
			return "error";
		}
		
		
		
		
	}
	
}

