package com.bloodBank.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bloodBank.dao.registrationDao;
import com.bloodBank.model.registrationModel;

@Controller
public class registerController {
	
	@RequestMapping("/register")
	public String getRegPage() {
		
		return "register";
	}

	@RequestMapping("/registration")
	public String getRegistration(registrationModel mo, Model model) {
		
		//get user input using registrationModel
		String fname=mo.getFname();
		String lname=mo.getLname();
		String email=mo.getEmail();
		String password=mo.getPassword();
		String address=mo.getAddress();
		String phone=mo.getPhone();
		String bloodGroup=mo.getBloodGroup();
		String donate=mo.getDonate();
		
		//check if any fields empty
		if(fname.isEmpty() || lname.isEmpty()|| email.isEmpty() || password.isEmpty() || address.isEmpty() || phone.isEmpty()|| bloodGroup.isEmpty()|| donate.isEmpty()) {
			model.addAttribute("AllFieldRequired", "All fields are required to proceed!");
			return"register";
			
		}
		
		//if all fields are filled
		
		else {
			
			//create a object of registartion dao to enter the data in database
			registrationDao regDao= new registrationDao();
			
			//pass all the values using parameterized method
			int k=regDao.addDetailsToDatabse(fname,lname,email,password,address,phone,bloodGroup,donate);
			
			//if registration successfull go to login
			if(k>0) {
				model.addAttribute("registrationSuccess", "Registration successful, please login!");
				return"login";
			}
			
			else {
				model.addAttribute("msqlError", regDao.sqlError);
				return "register";
			}
			
		}
		
	}
}
