package com.zrhis.base.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.mock.web.MockServletContext;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.XmlWebApplicationContext;
import org.springframework.web.servlet.HandlerAdapter;
import org.springframework.web.servlet.HandlerExecutionChain;
import org.springframework.web.servlet.HandlerMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;

public class ConfigurationSpringMVCTests {
	
	private static HandlerMapping handlerMapping;
	
    private static HandlerAdapter handlerAdapter; 
	
	@BeforeClass
	public static void setUp(){
		if(handlerMapping == null){
			String[] config = {
				"classpath:applicationContext.xml",
				"file:WebRoot/WEB-INF/spring-servlet.xml"
			};
			
			XmlWebApplicationContext context = new XmlWebApplicationContext();
			
			context.setConfigLocations(config);
			MockServletContext msc = new MockServletContext();
			context.setServletContext(msc);
			context.refresh();
			
			msc.setAttribute(WebApplicationContext.ROOT_WEB_APPLICATION_CONTEXT_ATTRIBUTE, context);
			
			handlerMapping = (HandlerMapping)context.getBean(RequestMappingHandlerMapping.class);
			//RequestMappingHandlerMapping.class
			handlerAdapter = (HandlerAdapter)context.getBean(
				context.getBeanNamesForType(RequestMappingHandlerAdapter.class)[0]
			);
			
		}
		
	}
	
	public ModelAndView excuteAction(HttpServletRequest request, HttpServletResponse response) throws Exception{
		
		request.setAttribute(HandlerMapping.INTROSPECT_TYPE_LEVEL_MAPPING, true);
		
		HandlerExecutionChain chain = handlerMapping.getHandler(request); 
		
		handlerAdapter.handle(request, response, chain.getHandler());
		
		ModelAndView model = null;
		
		model = handlerAdapter.handle(request, response, chain.getHandler()); 
		
		return model;
	}
	
	
	/*public void sendRequest(String url){
		
		
		this.excuteAction(url, "GET", true);
	}*/
	
	@Test
	public void test(){
		
		
	}
}
