package com.bloodBank.controller;

import java.util.*;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.bloodBank.dao.searchDao;
import com.bloodBank.model.search;
import com.bloodBank.model.srch;

@Controller
public class searchController {
	@RequestMapping("/search")
	public String getSearchPage() {
		
		return "login";
	}
	
	@RequestMapping("/searchResult")
	public String model(search mo, Model model) {
	
		/*
		 * ----------IMPORTANT----------
		 * add jstl dependency in pom.xml
		 * add <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> in jsp page
		 * foreach loop in JSP page
		 * */
		//get choice of user (bloodGroup and address
		String bloodGroup= mo.getBloodGroup();
		String address= mo.getAddress();
		
		//create object of searchDao to call the method getSearchResult which return a "list" type.
		searchDao sd= new searchDao();
		
		//create a new list of type srch
		List <srch> list= new ArrayList<>();
		
		//assign returned list to our new list
		list=sd.getSearchResult(bloodGroup,address);
		
		//add list to jsp page
		model.addAttribute("allList",list);
		
		//go to searchResult.jsp page
		return "searchResult";
		
		
	}
	
	

}
