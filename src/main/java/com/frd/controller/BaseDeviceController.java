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

import com.frd.model.BaseDevice;
import com.frd.service.BaseDeviceService;

@Controller
@RequestMapping("basedevice")
public class BaseDeviceController {
	@Autowired
	private  BaseDeviceService boxService;
	
	@RequestMapping(value="add/basedevice")
	public ModelAndView  addBaseDevice(BaseDevice basedevice) {
		Integer addBaseDevice = boxService.addBaseDevice(basedevice);
		if(addBaseDevice!=null) {
			return new ModelAndView("main.jsp");
		}else {
			return null;
		}
	}
	
	@RequestMapping(value="delete/basedevice/{id}")
	public  String   deleteBaseDevice(@PathVariable Integer id) {
		 boxService.deleteBaseDevice(id);
		return "redirct:";
	}
	
	
	@RequestMapping(value="getOne/basedevice")
	public  ModelAndView getOneBaseDevice(Integer id) {
		BaseDevice oneBaseDevice = boxService.getOneBaseDevice(id);
		if(oneBaseDevice!=null) {
			return new ModelAndView("getOneBase","oneBaseDevice",oneBaseDevice);
		}
		return null;
	}
	
	
	@RequestMapping(value="getAll/basedevice")
	public ModelAndView  getAllBaseDevice(HttpServletRequest request) {
		Map<String, Object> map=new HashMap<String, Object>();
		ModelAndView modelAndView=new ModelAndView();
		map.put("name", request.getAttribute("11"));
		List<BaseDevice> allBaseDevice = boxService.getAllBaseDevice(map);
		if(!allBaseDevice.isEmpty()) {
			modelAndView.addObject("allBaseDevice", allBaseDevice);
			return modelAndView;
		}else {
			return null;
		}
	}
	
	
	@RequestMapping(value="update/basedevice")
	public String updateBaseDevice(BaseDevice basedevice) {
		Integer updateBaseDevice = boxService.updateBaseDevice(basedevice);
		if(updateBaseDevice!=null) {
			return "";
		}else {
			return "error";
		}
		
		
		
		
	}
	
}

