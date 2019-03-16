package com.zrhis.base;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

public class ExceptionHandler implements HandlerExceptionResolver {

	public ModelAndView resolveException(HttpServletRequest request,
			HttpServletResponse response, Object hanlder, Exception ex) {
		
		/*try {
			PrintWriter out = response.getWriter();
		} catch (IOException e) {
			e.printStackTrace();
		}*/
		return new ModelAndView("view/index.jsp");
	}

}
