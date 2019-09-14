package com.assignment.fyleassignment.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomePageController {
	public class HomeController {

		@RequestMapping("/")
		@ResponseBody
		public String welcome() {
			return "index";
		}
	}
}
