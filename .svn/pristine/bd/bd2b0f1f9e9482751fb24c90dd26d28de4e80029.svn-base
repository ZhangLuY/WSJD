package com.zrhis.base.interceptor;

//import javax.interceptor.Interceptor;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONObject;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.zrhis.base.Constant;
import com.zrhis.base.Message;
import com.zrhis.wsjd.util.ControllerTools;
import com.zrhis.wsjd.util.JSONFormat;

public class UserSessionInterceptor implements HandlerInterceptor{

	public void afterCompletion(HttpServletRequest request,
			HttpServletResponse response, Object hanlder, Exception e)
			throws Exception {
	}

	public void postHandle(HttpServletRequest request, HttpServletResponse response,
			Object hanlder, ModelAndView view) throws Exception {
	}

	public boolean preHandle(HttpServletRequest request, HttpServletResponse response,
			Object hanlder) throws Exception {
		//System.out.println("Interceptor");
		String[] noFilters = new String[] { "login.html", "index.jsp", //"system",  
                "index.html", "logout.html" };
		String uri = request.getRequestURI();
		String path = request.getContextPath();
		String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
		//判断session中的用户信息是否存在
		Object sessionObject = request.getSession().getAttribute(Constant.USER_SESSION_KEY);
		boolean beFilter = true;  
        for (String s : noFilters) {  
            if (uri.indexOf(s) != -1) {  
                beFilter = false;  
                break;  
            }
        } 
        if (beFilter) {
        	if (sessionObject == null) {
    			//判断请求状态是否是ajax请求
    			String requestType = request.getHeader("X-Requested-With");
    			if (requestType != null) {//ajax请求反之普通请求
    				//返回一标志前台判断
    				//PrintWriter out = response.getWriter();  
                    Message message = new Message();
                    message.setIsSessionOut(true);
    				ControllerTools.print(response, message);
    			} else {
    				PrintWriter out = response.getWriter();  
                    StringBuilder builder = new StringBuilder();  
                    builder.append("<script type=\"text/javascript\" charset=\"UTF-8\">");  
                    builder.append("window.location.href=\"");
                    builder.append(basePath);
                    builder.append("index.jsp\";</script>"); 
                    out.print(builder.toString());  
                    out.close();			
    			}
    			return false;
    		}
        }
		return true;
	}
	
}
