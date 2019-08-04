package com.st.controller.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;

public class LoginInterceptor implements HandlerInterceptor{
	@Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response,Object handler)throws Exception {
		String uri = request.getRequestURI();
		System.out.println(uri);
        //��������ǵ�¼�����˳���ֱ�ӷ���
        if (uri.contains("login")){
            return true;
        }else {
        	response.sendRedirect("/login.html");
			return false;
		}
        
    }
}
