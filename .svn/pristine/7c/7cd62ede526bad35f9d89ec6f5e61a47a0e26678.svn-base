package com.zrhis.wsjd.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONObject;

import com.zrhis.base.Constant;
import com.zrhis.base.Message;
import com.zrhis.base.UserSession;
/**
 * 控制器工具类
 * @author 王成委
 *
 */
public class ControllerTools {
	
	/**
	 * 获取PrintWriter 便于前台输出
	 * @param response
	 * @return
	 */
	public static PrintWriter getWriter(HttpServletResponse response){
		PrintWriter out = null;
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/json");
		//response.setHeader(name, value)
		try {
			out = response.getWriter();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return out;
	}
	public static void print(HttpServletResponse response,Message msg){
		JSONObject data = JSONFormat.toJson(msg, false);
		print(response,data);
	}
	public static void print(HttpServletResponse response,Object data){
		PrintWriter out = getWriter(response);
		out.print(data);
	}
	public static String resolvePayload(HttpServletRequest request) throws Exception{
		StringBuffer content = new StringBuffer();
		BufferedReader reader = null;
		reader = request.getReader();
        String line;  
        while ((line = reader.readLine()) != null) {  
            content.append(line + "\r\n");
        }
        return content.toString();
	}
	public static Object resolvePayload(HttpServletRequest request,String className) throws Exception{
		String content = resolvePayload(request);
		if("".equals(content) || content == null) 
			throw new NullPointerException("Request Payload解析失败");
        Object entity = JSONFormat.toBean(className, content);
        return entity;
	}
	public static Object resolvePayloadEX(HttpServletRequest request) throws Exception{
		String className = request.getParameter("className");
		return resolvePayload(request, className);
	}
	/**
	 * 返回当前会话信息
	 * @param request
	 * @return
	 */
	public static UserSession getUserSession(HttpServletRequest request) {
		UserSession userSession = (UserSession) request.getSession().getAttribute(Constant.USER_SESSION_KEY);
		return userSession;
	}
}
