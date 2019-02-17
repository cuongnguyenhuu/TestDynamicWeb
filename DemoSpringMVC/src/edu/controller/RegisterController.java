package edu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.model.Fresher;
import edu.service.RegisterService;


@Controller
public class RegisterController {
	
	@Autowired
	private RegisterService registerService;
	
	@RequestMapping(value="register")
	public String showRegister(Model model) {
		model.addAttribute("fresher", new Fresher());
		return "register";
	}
	
	@RequestMapping(value="UserRegister")
	public String register(@ModelAttribute("fresher")Fresher fresher,Model model) {
		if(registerService.register(fresher)) {
			model.addAttribute("fresher", new Fresher());
			return "redirect:login";
		}
		else
		{
			model.addAttribute("error",true);
			return "redirect:register";
		}
	}
}
