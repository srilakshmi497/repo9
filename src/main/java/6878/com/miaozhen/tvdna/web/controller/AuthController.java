package com.miaozhen.tvdna.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AuthController {

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String showLoginPage() {
		return "/login";
	}
	
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String authLogin(HttpServletRequest request, HttpServletResponse response){
		return "redirect:/";
	}
}
