package com.zrhis.base;

import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONObject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

import com.zrhis.wsjd.exception.WSJDException;
import com.zrhis.wsjd.util.ControllerTools;
import com.zrhis.wsjd.util.DebugUtil;
import com.zrhis.wsjd.util.JSONFormat;
import com.zrhis.wsjd.util.MessageManager;
/**
 * 基础控制层，处理异常等信息。异常需要由控制层抛出。
 * ajax请求和URL请求需分开处理
 * 
 * @author 王成委
 *
 */
@Controller
public class BaseController {
	
	@ExceptionHandler(WSJDException.class)
	@Deprecated
	public ModelAndView wsjdDaoException(HttpServletRequest request,
		HttpServletResponse response,WSJDException ex){
		boolean isAjaxRequest = this.isAjaxRequest(request);
		Message msg = MessageManager.exception(ex);
		if(DebugUtil.IS_DEBUG)ex.printStackTrace();
		if(isAjaxRequest){
			PrintWriter out = ControllerTools.getWriter(response);
			JSONObject data = JSONFormat.toJson(msg,false);
			out.print(data.toString());
			return null;
		}else{
			Map<String,Object> map = new HashMap<String,Object>();
			map.put("message", msg.getMessage());
			map.put("exceptionName", msg.getExName());
			map.put("isError", true);
			return new ModelAndView("error/exception",map);
		}
	}
	/**
	 * 公共异常处理，URL请求返回异常页面，Ajax请求返回json数据
	 * @param request HttpServletRequest
	 * @param response HttpServletResponse
	 * @param ex Exception
	 * @return
	 */
	@ExceptionHandler(Exception.class)
	public ModelAndView exception(HttpServletRequest request,
		HttpServletResponse response,Exception ex){
		if(DebugUtil.IS_DEBUG)ex.printStackTrace();
		boolean isAjaxRequest = this.isAjaxRequest(request);
		Message msg = MessageManager.exception(ex);
		
		if(isAjaxRequest){
			//Ajax请求处理
			PrintWriter out = ControllerTools.getWriter(response);
			JSONObject data = JSONFormat.toJson(msg,false);
			out.print(data.toString());
			return null;
		}else{
			//URL请求处理
			Map<String,Object> map = new HashMap<String,Object>();
			map.put("message", msg.getMessage()+" Exception Test");
			map.put("isError", true);
			return new ModelAndView("error/exception",map);
		}
	}
	/**
	 * 判断是否是ajax请求，根据请求头"X-Requested-With"作为依据。
	 * Ajax为XMLHttpRequest，URL请求则为null
	 * @param request HttpServletRequest
	 * @return Boolean 
	 */
	private boolean isAjaxRequest(HttpServletRequest request){
		String requestType = request.getHeader("X-Requested-With");
		DebugUtil.println(requestType);
		return requestType != null;
	}
}
