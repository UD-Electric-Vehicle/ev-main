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
public class AdminController {
	
	@GetMapping("/udadmin/login")
	public String adminLogin(Model model) {
		model.addAttribute("loginModel" , new LoginModel());
		return "admin-sign-in";
	}
	
	@PostMapping("/udadmin/login")
	public String doAdminLogin(@ModelAttribute LoginModel loginModel, Model model) {
		log.info("Received Admin Login Model -{}" , loginModel);
		model.addAttribute("adminLogin" , new LoginModel());
		return "redirect:/udadmin/dashboard";
	}

	@GetMapping("/udadmin/dashboard")
	public String adminDashboard() {
		return "admin-dashboard";
	}
	
	@GetMapping("/udadmin/dealerenquiries")
	public String adminDealerEnquiries() {
		return "admin-dealer-enquiry";
	}

}
