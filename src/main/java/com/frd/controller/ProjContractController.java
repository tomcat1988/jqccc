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

import com.frd.model.ProjContract;
import com.frd.service.ProjContractService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Controller
@RequestMapping("/projcontract")
public class ProjContractController {
	@Autowired
	private  ProjContractService service;
	
	@RequestMapping(value="add/projcontract")
	public String  addProjContract(ProjContract projcontract) {
		projcontract.setCreatedt(new Date());
		projcontract.setModifydt(new Date());
		projcontract.setStartdt(new Date());
		projcontract.setEnddt(new Date());
		Integer addProjContract = service.addProjContract(projcontract);
		if(addProjContract!=null) {
			return "redirect:/projcontract/getAll/projcontracts/1";
		}else { 
			return "error";
		} 
	}
	
	@RequestMapping(value="delete/projcontract/{id}")
	public  String   deleteProjContract(@PathVariable Integer id) {
		 service.deleteProjContract(id);
		return "redirect:/projcontract/getAll/projcontracts/1";
	}
	
	
	@RequestMapping(value="getOne/projcontract/{id}/{option}")
	public  ModelAndView getOneProjContract(@PathVariable Integer id,@PathVariable int option) {
		ProjContract oneProjContract = service.getOneProjContract(id);
		if(option ==1) {
			return new ModelAndView("projContractDetail","oneProjContract",oneProjContract);
		}
		if(option ==2) {
			return new ModelAndView("projContractUpdate","oneProjContract",oneProjContract);
		}
		return null;
	}
	
	
	@InitBinder("projContract")
	public void getProjContract(WebDataBinder wb) {
		wb.setFieldDefaultPrefix("projContract.");
	}
	
	
	
	@RequestMapping(value="getAll/projcontracts/{pageNum}")
	public String  getAllProjContracts(@PathVariable int pageNum,ModelMap modelMap, HttpServletRequest request,HttpServletResponse response) {
		Map<String ,Object> map=new HashMap<String, Object>();
		map.put("contractname", request.getParameter("contractname"));
		map.put("contractcode", request.getParameter("contractcode"));
		List<ProjContract> allProjContract = service.getAllProjContract(map);
		PageInfo<ProjContract> pageInfo=new PageInfo<ProjContract>(allProjContract);
		PageHelper.startPage(pageNum, 5);
		request.getSession().setAttribute("pageInfo", pageInfo);
		modelMap.put("allProjContract", allProjContract);
		return "projContract";
		
	}
	
	
	@RequestMapping(value="getAll/projcontract/{pageNum}")
	public String  getAllProjContract(@PathVariable int pageNum,ModelMap modelMap, HttpServletRequest request,HttpServletResponse response) {
		Map<String ,Object> map=new HashMap<String, Object>();
		List<ProjContract> allProjContract = service.getAllProjContract(map);
		PageInfo<ProjContract> pageInfo=new PageInfo<ProjContract>(allProjContract);
		PageHelper.startPage(pageNum, 5);
		request.getSession().setAttribute("pageInfo", pageInfo);
		modelMap.put("allProjContract", allProjContract);
		return "projContract";
		
	}
	
	
	
	
	
	@RequestMapping(value="hello", method=RequestMethod.GET)
	public String say(HashMap<String, Object> map) {
		map.put("hello", "欢迎进入HTML页面");
		return "/index";
	}
	
	

	@RequestMapping(value="update/projcontract")
	public String updateProjContract(ProjContract oneProjContract) {
		oneProjContract.setCreatedt(new Date());
		oneProjContract.setModifydt(new Date());
		oneProjContract.setStartdt(new Date());
		oneProjContract.setEnddt(new Date());
		Integer updateProjContract = service.updateProjContract(oneProjContract);
		if(updateProjContract!=null) {
			return "redirect:/projcontract/getAll/projcontracts/1";
		}else {
			return "error";
		}
		
		
		
		
	}
	
}


