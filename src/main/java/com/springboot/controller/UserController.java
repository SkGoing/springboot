package com.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.springboot.bean.User;
import com.springboot.service.UserService;

@Controller
public class UserController {
	@Autowired
	private UserService userService;
	
	@RequestMapping("/hello")
	@ResponseBody
	public String hello() {
		return "hello you know";
	}
	@RequestMapping("/index")
	public String index(Model model) {
		model.addAttribute("name","jack");
		model.addAttribute("age",20);
		model.addAttribute("info","我是一个人");
		return "index";
	}
	@RequestMapping("/save")
	@ResponseBody
	public String save(User user) {
		userService.save(user);
		return "save success !";
	}
}
