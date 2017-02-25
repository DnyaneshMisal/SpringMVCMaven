package com.dnyanesh.helloworld.controller;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.dnyanesh.helloworld.dao.User;

@Controller
public class HelloWorldController {
	String message = "Welcome to Spring MVC!";

	@RequestMapping("/hello")
	public ModelAndView showMessage(HttpServletRequest request, HttpSession session,
			@Valid @ModelAttribute("User") User user, BindingResult result) {

		if (result.hasErrors()) {
			ModelAndView mv = new ModelAndView("index");
			return mv;
		}
		
		String strRequest = "Hello  from request";
		String strSession = "Hello from session";
		request.setAttribute("strRequest", user);
		session.setAttribute("strSession", user);
		System.out.println("in controller");
		ModelAndView mv = new ModelAndView("helloworld");
		mv.addObject("message", message);
		return mv;
	}
}
