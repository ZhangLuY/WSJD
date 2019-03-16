package com.zrhis.base.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.servlet.HandlerAdapter;
import org.springframework.web.servlet.HandlerExecutionChain;
import org.springframework.web.servlet.HandlerMapping;

@ContextConfiguration(locations = {"file:WebRoot/WEB-INF/spring-servlet.xml","classpath:applicationContext.xml"})
//@RunWith(SpringJUnit4ClassRunner.class)
public class SpringMVCTest extends AbstractTransactionalJUnit4SpringContextTests{
	
	@Autowired
	private HandlerMapping handlerMapping;
	
	@Autowired
	private HandlerAdapter handlerAdapter;
	
	public void excuteAction(HttpServletRequest request, HttpServletResponse response) throws Exception{
		System.out.println(this.handlerAdapter);
		System.out.println(this.handlerMapping);
		
		HandlerExecutionChain chain = this.handlerMapping.getHandler(request); 
		System.out.println(chain);
		this.handlerAdapter.handle(request, response, chain.getHandler());
	}
	
	public void sendRequest(String url,String method,boolean isAjax){
		MockHttpServletRequest request = new MockHttpServletRequest();
        MockHttpServletResponse response = new MockHttpServletResponse();
        
        if(isAjax)request.addHeader("X-Requested-With", "XMLHttpRequest");
        
        request.setRequestURI(url);
        
        request.setMethod(method); 
		
        try {
        	
			this.excuteAction(request, response);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void sendRequest(String url,String method){
		this.sendRequest(url, method, true);
	}
	
	public void sendRequest(String url){
		this.sendRequest(url, "GET", true);
	}
	
	@Test
	public void test(){
		this.sendRequest("/basics/querystest");
	}
}
