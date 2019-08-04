package com.st.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.st.domain.announcement;
import com.st.domain.mydomain.Result;
import com.st.service.homeService;


@RestController
@RequestMapping("home")
public class homeController {
	
	@Autowired
	private homeService homeservice;
	//../home/findAll
	@RequestMapping("findAll")
	public List<announcement> findeAll() {
		List<announcement> list =homeservice.findAll();
		return list ;
		
	}
}
