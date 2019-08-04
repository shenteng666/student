package com.st.controller;



import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.st.domain.user;

@RequestMapping("login")
@RestController
public class loginController {
	
	@RequestMapping("showName")
	public Map<String,String> showName(HttpServletRequest request) {
		HttpSession session = request.getSession();
		user user = (user) session.getAttribute("username");
		String username = user.getUsername();
		  //把用户名放到map中
        HashMap<String,String> map=new HashMap<>();
        map.put("username",username);
        return map;
	}
}
