package com.bloodBank.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bloodBank.dao.loginDao;
import com.bloodBank.model.loginModel;

@Controller
public class loginController {
	
	@RequestMapping("/login")
	public String login() {
		
		return "login";
	}
	
	@RequestMapping("/loginSuccess")
	public String loginSuccess(loginModel mo, Model model) {
		
		String email=mo.getEmail();
		String password=mo.getPassword();
		loginDao l1= new loginDao();
		int k= l1.getUserDetails(email);
		
		if(k>0) {
			if(l1.Myemail.equals(email) && l1.password.equals(password)) {
				return "search";
			}
		}
		else {
			model.addAttribute("errorMessage", "email and password did not match!");
			return "login";
		}
		return "login";
		
	}

}
