package com.cms.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class HomeController {
	@RequestMapping("/login")
	public String home() {
		return "login";
	}

	@RequestMapping("/userDetails")
	public String userDetails() {
		return "userDetails";
	}
}
