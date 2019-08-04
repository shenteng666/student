package com.st.controller;

import java.io.UnsupportedEncodingException;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.st.domain.user;
import com.st.service.registerService;

@RequestMapping("register")
@RestController
public class registerController {
	
	@Autowired
	private registerService RegisterService;
	
	@RequestMapping("regis")
	public void register(HttpServletRequest request,HttpServletResponse response) throws Exception {
		request.setCharacterEncoding("utf-8");
		//获取输入的用户名和密码
		String uN = request.getParameter("register-username");
		String pwd = request.getParameter("register-password");
		
		//存到user对象
		user user=new user();
		user.setUsername(uN);
		user.setPassword(pwd);
		
		RegisterService.insertUser(user);
		
//		request.getRequestDispatcher("/login.html").forward(request, response);
		response.sendRedirect("/Student/login.html");
	}
	
}
