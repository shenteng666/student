package com.st.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.omg.CORBA.PUBLIC_MEMBER;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.st.domain.user;
import com.st.service.userService;
import com.st.service.impl.userServiceimpl;

import sun.print.resources.serviceui;

@Controller
@RequestMapping("user")
public class userController {
	@Autowired
	private userService service; 
	
	@RequestMapping("login")
//	@ResponseBody
	public String login(HttpServletRequest request) {
		//��ȡ�û���������
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		//�浽user����
		user user=new user();
		user.setPassword(password);
		user.setUsername(username);
		HttpSession session = request.getSession();
		session.setAttribute("username", user);
		//��ѯ
		List<user> list= service.login();
			for (user user2 : list) {
				if (user.equals(user2)) {
					return "forward:/user/index.html";
				}
//				System.out.println(user2);
			}		
			return "redirect:/login.html";	
	}
	
	//�û��˳�
	@RequestMapping("logout")
	public String logout() {
		return "redirect:/login.html";	
	}
	
}
