package edu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


import edu.model.Fresher;
import edu.service.LoginService;

@Controller
public class LoginController {
//	@Autowired
//	private LoginService loginService;
	
	
	@RequestMapping(value="login")
	public ModelAndView showLogin() {
		ModelAndView mav = new ModelAndView("login");
		mav.addObject("fresher", new Fresher());
		
		return mav;
	}
	@RequestMapping(value="dashboard")
	public String login(@ModelAttribute("fresher")Fresher fresher ,Model model) {
//		if(loginService.login(fresher)) {
//			model.addAttribute("fresher", fresher);
			return "dashboard";
//		}else
//			model.addAttribute("error", true);
//			return "redirect:login";
	}
}
