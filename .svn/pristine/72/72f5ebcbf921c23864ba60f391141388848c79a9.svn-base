package com.zrhis.base.interceptor;

//import javax.interceptor.Interceptor;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class RoleInterceptor implements HandlerInterceptor{

	public void afterCompletion(HttpServletRequest request,
			HttpServletResponse response, Object hanlder, Exception e)
			throws Exception {
		System.out.println("after Role Interceptor");
	}

	public void postHandle(HttpServletRequest request, HttpServletResponse response,
			Object hanlder, ModelAndView view) throws Exception {
		// TODO Auto-generated method stub
		
	}

	public boolean preHandle(HttpServletRequest request, HttpServletResponse response,
			Object hanlder) throws Exception {
		System.out.println("Role Interceptor");
		return true;
	}
	
}
