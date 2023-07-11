package com.ud.ev.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.ud.ev.app.model.LoginModel;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class DealerController {
	
	@GetMapping("/uddealer/login")
	public String delaerLogin(Model model) {
		model.addAttribute("loginModel" , new LoginModel());
		return "dealer-sign-in";
	}
	
	@PostMapping("/uddealer/login")
	public String dealerLogin(@ModelAttribute LoginModel loginModel, Model model) {
		log.info("Received Admin Login Model -{}" , loginModel);
		model.addAttribute("adminLogin" , new LoginModel());
		return "redirect:/uddealer/dashboard";
	}

	@GetMapping("/uddealer/dashboard")
	public String adminDashboard() {
		return "dealer-dashboard";
	}


}
