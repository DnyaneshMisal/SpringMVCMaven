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
			System.out.println("has errors");
			Date today = new Date();

			System.out.println("Date today is" + today);
			return mv;
		}
		
		String strRequest = "Dnyanesh in request";
		String strSession = "Dnyanesh in session";
		request.setAttribute("strRequest", user);
		session.setAttribute("strSession", user);
		System.out.println("in controller");
		ModelAndView mv = new ModelAndView("helloworld");
		mv.addObject("message", message);
		return mv;
	}
}