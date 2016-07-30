package com.elitecore.controller;

import java.util.List;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.elitecore.dao.querydao;
import com.elitecore.dto.*;
import com.elitecore.model.Query;
import com.elitecore.model.User;
import com.elitecore.services.queryservices;
import com.elitecore.services.transfer;
import com.elitecore.services.userservices;
import com.elitecore.services.validator;
@Controller
@SessionAttributes("test")
public class operationcontroller {

private userservices userService;
//private queryservices queryservices;

@Autowired
queryservices services;
@Autowired
	public operationcontroller(userservices userService) {
		this.userService = userService;
//		this.queryservices=queryservices;
//	
	}
	@RequestMapping(value="/hello.html")
	public ModelAndView hello()
	{
		return new ModelAndView("form","userdto",new userdto());
	}
	
	@RequestMapping(value="/save.html", method = RequestMethod.POST)
	public String save(@Valid @ModelAttribute userdto  userdto,BindingResult result) throws Exception 
	{
		validator valid=new validator();
		if(valid.validate_uname(userdto.getUsername()) && valid.validate_pw(userdto.getPassword()))
		{
				User user=transfer.trans(userdto);
				userService.addUser(user);
				return "redirect:profile.html";
		}
		else
		{
			return "redirect:errorpage.html";
		}
//		if(result.hasErrors())
//		{
//			return new ModelAndView("form","user",new User());
//		}
//		else
//		{
//			return new ModelAndView("profile");
//		}
}
	
	@RequestMapping(value="/profile.html", method = RequestMethod.GET)
	public ModelAndView save1(@ModelAttribute userdto  userdto)
	{
		
//				ModelAndView mandv=new ModelAndView();
//				mandv.addObject("test","hello");
//				mandv.setViewName("profile");
				return new ModelAndView("profile","test","hello");
		
	}
	@RequestMapping(value="/errorpage.html",method=RequestMethod.GET)
	public ModelAndView err()
	{
		return new ModelAndView("errorpage");
	}
	@RequestMapping(value="/login.html",method=RequestMethod.POST)
	public ModelAndView login(@ModelAttribute userdto userdto) throws Exception
	{

		User user=transfer.trans(userdto);
		
		String m=userService.checklogin(user);
		if(m.equalsIgnoreCase("success"))
		{
			return new ModelAndView("Dashboard","key",user.getUserName());
		}
		else
		{
			return new ModelAndView("welcome","key",m);
		}
	}
	
	@RequestMapping(value="/logout.html")
	public String logout(HttpSession session)
	{
		session.invalidate();
		return "redirect:hello.html";
	}
	
	@RequestMapping(value="/querymanager/{pageid}")
	public ModelAndView querygetter(@PathVariable int pageid)
	{
		int total=5;
		List<Query> list=services.getbypage(pageid, total);
		return new ModelAndView("pagination","list",list);
		
	}
}
