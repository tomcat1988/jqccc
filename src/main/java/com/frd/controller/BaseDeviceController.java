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

import com.frd.model.BaseDevice;
import com.frd.service.BaseDeviceService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Controller
@RequestMapping("/basedevice")
public class BaseDeviceController {
	@Autowired
	private  BaseDeviceService service;
	
	@RequestMapping(value="add/basedevice")
	public String  addBaseDevice(BaseDevice basedevice) {
		basedevice.setCreatedt(new Date());
		basedevice.setModifydt(new Date());
		Integer addBaseDevice = service.addBaseDevice(basedevice);
		if(addBaseDevice!=null) {
			return "redirect:/basedevice/getAll/basedevices/1";
		}else { 
			return "error";
		} 
	}
	
	@RequestMapping(value="delete/basedevice/{id}")
	public  String   deleteBaseDevice(@PathVariable Integer id) {
		 service.deleteBaseDevice(id);
		return "redirect:/basedevice/getAll/basedevices/1";
	}
	
	
	@RequestMapping(value="getOne/basedevice/{id}/{option}")
	public  ModelAndView getOneBaseDevice(@PathVariable Integer id,@PathVariable int option) {
		BaseDevice oneBaseDevice = service.getOneBaseDevice(id);
		if(option ==1) {
			return new ModelAndView("baseDeviceDetail","oneBaseDevice",oneBaseDevice);
		}
		if(option ==2) {
			return new ModelAndView("baseDeviceUpdate","oneBaseDevice",oneBaseDevice);
		}
		return null;
	}
	
	
	@InitBinder("baseDevice")
	public void getBaseDevice(WebDataBinder wb) {
		wb.setFieldDefaultPrefix("baseDevice.");
	}
	
	
	
	@RequestMapping(value="getAll/basedevices/{pageNum}")
	public String  getAllBaseDevices(@PathVariable int pageNum,ModelMap modelMap, HttpServletRequest request,HttpServletResponse response) {
		Map<String ,Object> map=new HashMap<String, Object>();
		map.put("devicename", request.getParameter("devicename"));
		map.put("devicecode", request.getParameter("devicecode"));
		List<BaseDevice> allBaseDevice = service.getAllBaseDevice(map);
		PageInfo<BaseDevice> pageInfo=new PageInfo<BaseDevice>(allBaseDevice);
		PageHelper.startPage(pageNum, 5);
		request.getSession().setAttribute("pageInfo", pageInfo);
		modelMap.put("allBaseDevice", allBaseDevice);
		return "baseDevice";
		
	}
	
	
	@RequestMapping(value="getAll/basedevice/{pageNum}")
	public String  getAllBaseDevice(@PathVariable int pageNum,ModelMap modelMap, HttpServletRequest request,HttpServletResponse response) {
		Map<String ,Object> map=new HashMap<String, Object>();
		List<BaseDevice> allBaseDevice = service.getAllBaseDevice(map);
		PageInfo<BaseDevice> pageInfo=new PageInfo<BaseDevice>(allBaseDevice);
		PageHelper.startPage(pageNum, 5);
		request.getSession().setAttribute("pageInfo", pageInfo);
		modelMap.put("allBaseDevice", allBaseDevice);
		return "baseDevice";
		
	}
	
	
	
	
	
	@RequestMapping(value="hello", method=RequestMethod.GET)
	public String say(HashMap<String, Object> map) {
		map.put("hello", "欢迎进入HTML页面");
		return "/index";
	}
	
	

	@RequestMapping(value="update/basedevice")
	public String updateBaseDevice(BaseDevice oneBaseDevice) {
		oneBaseDevice.setCreatedt(new Date());
		oneBaseDevice.setModifydt(new Date());
		Integer updateBaseDevice = service.updateBaseDevice(oneBaseDevice);
		if(updateBaseDevice!=null) {
			return "redirect:/basedevice/getAll/basedevices/1";
		}else {
			return "error";
		}
		
		
		
		
	}
	
}


