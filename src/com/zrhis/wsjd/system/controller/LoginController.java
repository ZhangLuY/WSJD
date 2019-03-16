package com.zrhis.wsjd.system.controller;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLDecoder;
import java.util.Date;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

import javax.annotation.Resource;
import javax.servlet.ServletInputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import sun.misc.BASE64Encoder;

import com.zrhis.base.BaseController;
import com.zrhis.base.Parameters;
import com.zrhis.wsjd.system.bean.SqglGxhfwxy;
import com.zrhis.wsjd.system.bean.SqglQyfwtdzrhf;
import com.zrhis.wsjd.system.bean.SqglQyjtfwjl;
import com.zrhis.wsjd.system.service.LoginService;
import com.zrhis.wsjd.util.DateUtil;
import com.zrhis.wsjd.util.GetWxOrderno;
import com.zrhis.wsjd.util.PageData;
import com.zrhis.wsjd.util.RequestHandler;
import com.zrhis.wsjd.util.Sha1Util;
import com.zrhis.wsjd.util.TenpayUtil;


@Controller
public class LoginController extends BaseController{
	
	@Autowired
	private LoginService loginService;
	/**
	 * 登录
	 * @param request
	 * @param response
	 * @throws Exception
	 */
	@RequestMapping(value="/login")
	public void Login(HttpServletRequest request,HttpServletResponse response) throws Exception {
		System.out.println("登录");	
		String xcList = loginService.Login(request);
		response.setContentType("application/json"); 
		if(xcList != null){
			//System.out.println(xcList);//在控制台输出要返回的json对象
			response.getWriter().print(xcList);
		}
	}
	/**
	 * 查看签约服务协议书列表
	 * @param request
	 * @param response
	 * @param params
	 * @param page
	 * @param pageSize
	 * @throws Exception
	 */
	@RequestMapping(value="/qyfwxys/querys")
	public void queryQyfwxyss(HttpServletRequest request,HttpServletResponse response,
			@ModelAttribute Parameters params,int page,int pageSize) throws Exception{
		System.out.println("查看签约服务协议书");
		response.setContentType("application/json");
		//{beanName=com.xzr.cxjm.system.bean.SqglXcysqyfw, qyys=, zd=DT_QYSJ, yljg=, end=2017-07-28, begin=2017-07-28}
		//分页
		//params.setParams("{beanName=com.xzr.cxjm.system.bean.SqglXcysqyfw, qyys=, zd=DT_QYSJ, yljg=, end=2017-07-28, begin=2017-07-28}");
		response.setContentType("application/json");
		if(page<1)page=1;	
		String xcList=loginService.queryQyfwxyss(request,page,pageSize);
		//System.out.println(xcList);
		response.getWriter().print(xcList);
	}
	/**
	 * 修改（回退）签约服务协议书列表
	 * @param request
	 * @param response
	 * @param params
	 * @param page
	 * @param pageSize
	 * @throws Exception
	 */
	@RequestMapping(value="/qyfwxys/updates")
	public void updateQyfwxyss(HttpServletRequest request,HttpServletResponse response,
			@ModelAttribute Parameters params) throws Exception{
		System.out.println("回退签约服务协议书");
		response.setContentType("application/json");
		response.setContentType("application/json");
		String xcList = loginService.updateQyfwxyss(request);
		//System.out.println(xcList);
		response.getWriter().print(xcList);
	}
	/**
	 * 下载签约服务协议书(未解约)列表(无线)
	 * @param request
	 * @param response
	 * @param params
	 * @throws Exception
	 */
	@RequestMapping(value="/qyfwxys/onload")
	public void onloadQyfwxyss(HttpServletRequest request,HttpServletResponse response,
			@ModelAttribute Parameters params) throws Exception{
		System.out.println("下载签约服务协议书(未解约)列表");
		response.setContentType("application/json");
		String xcList=loginService.onloadQyfwxyss(request);
		//System.out.println(xcList);
		response.getWriter().print(xcList);
	}
	/**
	 * 下载签约服务协议书(签约未完成)列表(无线)
	 * @param request
	 * @param response
	 * @param params
	 * @throws Exception
	 */
	@RequestMapping(value="/qyfwxys/onloadWw")
	public void onloadQyfwxysw(HttpServletRequest request,HttpServletResponse response,
			@ModelAttribute Parameters params) throws Exception{
		System.out.println("下载签约服务协议书(未完成)列表");
		response.setContentType("application/json");
		String xcList=loginService.onloadQyfwxysw(request);
		//System.out.println(xcList);
		response.getWriter().print(xcList);
	}
	/**
	 * 查看家庭信息列表
	 * @param request
	 * @param response
	 * @param params
	 * @param page
	 * @param pageSize
	 * @throws Exception
	 */
	@RequestMapping(value="/jtxx/querys")
	public void queryJtxx(HttpServletRequest request,HttpServletResponse response,
			@ModelAttribute Parameters params,int page,int pageSize) throws Exception{
		System.out.println("查看家庭信息列表");
		response.setContentType("application/json");
		//分页
		//参数：depId
		if(page<1)page=1;
		String xcList=loginService.queryJtxx(request,page,pageSize);
		//System.out.println(xcList);
		response.getWriter().print(xcList);
	}
	/**
	 * 下载家庭信息列表不分页
	 * @param request
	 * @param response
	 * @param params
	 * @throws Exception
	 */
	@RequestMapping(value="/jtxx/querysy")
	public void queryJtxx2(HttpServletRequest request,HttpServletResponse response,
			@ModelAttribute Parameters params) throws Exception{
		System.out.println("下载家庭信息列表不分页");
		response.setContentType("application/json");
		String xcList=loginService.queryJtxxsy(request);
		//System.out.println(xcList);
		response.getWriter().print(xcList);
	}
	/**
	 * 下载家庭成员基本信息列表
	 * @param request
	 * @param response
	 * @throws Exception
	 */
	@RequestMapping(value="/jtcyxx/querys")
	public void queryJtcyxx(HttpServletRequest request,HttpServletResponse response) throws Exception{
		System.out.println("下载家庭成员基本信息列表");
		response.setContentType("application/json");
		String xcList=loginService.queryJtcyxx(request);
		//System.out.println(xcList);
		response.getWriter().print(xcList);
	}
	
	/**
	 * 补签服务协议书
	 * @param request
	 * @param response
	 * @param params
	 * @throws Exception
	 */
	@RequestMapping(value="/qyfwxy/upcy")
	public void updateCyQyfwxy(HttpServletRequest request,HttpServletResponse response,
			@ModelAttribute Parameters params) throws Exception{
		System.out.println("修改签约服务协议成员");
		response.setContentType("application/json");
		String xcList=loginService.updateCyQyfwxy(request);
		//System.out.println(xcList);
		response.getWriter().print(xcList);
	}
	
	/**
	 * 修改签约服务协议书
	 * @param request
	 * @param response
	 * @param params
	 * @throws Exception
	 *//*
	@RequestMapping(value="/qyfwxy/upcyy")
	public void updateCyQyfwxy1(HttpServletRequest request,HttpServletResponse response,
			@ModelAttribute Parameters params) throws Exception{
		System.out.println("修改签约服务协议成员");
		response.setContentType("application/json");
		String xcList=loginService.updateCyQyfwxy1(request);
		
		//System.out.println(xcList);
		response.getWriter().print(xcList);
	}*/
	
	/**
	 * 保存签约服务协议书
	 * @param request
	 * @param response
	 * @param params
	 * @throws Exception
	 */
	@RequestMapping(value="/qyfwxy/save")
	public void saveQyfwxy(HttpServletRequest request,HttpServletResponse response,
			@ModelAttribute Parameters params) throws Exception{
		System.out.println("保存签约服务协议书");
		response.setContentType("application/json");
		String xcList=loginService.saveQyfwxy(request);
		//System.out.println(xcList);
		response.getWriter().print(xcList);
	}
	
	

	
	/**
	 * 选择家庭后修改信息
	 * @param request
	 * @param response
	 * @param params
	 * @throws Exception
	 */
	@RequestMapping(value="/qyfwxy/choose")
	public void chooseQyfwJt(HttpServletRequest request,HttpServletResponse response,
			@ModelAttribute Parameters params) throws Exception{
		System.out.println("选择签约服务协议书");
		response.setContentType("application/json");
		String xcList=loginService.chooseQyJt(request);
		//System.out.println(xcList);
		response.getWriter().print(xcList);
	}
	
	
	
	/**
	 * 保存沁阳签约服务协议书
	 * @param request
	 * @param response
	 * @param params
	 * @throws Exception
	 */
	@RequestMapping(value="/qyfwxy/saveqy")
	public void saveQyfwxyqy(HttpServletRequest request,HttpServletResponse response,
			@ModelAttribute Parameters params) throws Exception{
		System.out.println("保存签约服务协议书");
		response.setContentType("application/json");
		String xcList=loginService.saveQyfwxyqy(request);
		//System.out.println(xcList);
		response.getWriter().print(xcList);
	}
	
	

	
	
	/**
	 * 删除签约服务协议书
	 * @param request
	 * @param response
	 * @param params
	 * @throws Exception
	 */
	@RequestMapping(value="/qyfwxy/delete")
	public void deleteQyfwxy(HttpServletRequest request,HttpServletResponse response,
			@ModelAttribute Parameters params) throws Exception{
		System.out.println("删除签约服务协议书");
		response.setContentType("application/json");
		params.setId(request.getParameter("VId"));
		params.setClassName("com.zrhis.wsjd.system.bean.SqglXcysqyfw");
		String xcList=loginService.delete(request,params);
		//System.out.println(xcList);
		response.getWriter().print(xcList);
	}
	/**
	 * 解除约定
	 * @param request
	 * @param response
	 * @param params
	 * @throws Exception
	 */
	@RequestMapping(value="/surrender")
	public void surrender(HttpServletRequest request,HttpServletResponse response,
			@ModelAttribute Parameters params) throws Exception{
		System.out.println("解约");
		response.setContentType("application/json");
		String xcList=loginService.surrender(request);
		//System.out.println(xcList);
		response.getWriter().print(xcList);
	}
	/**
	 * 查询区域
	 * @param request
	 * @param response
	 * @throws Exception
	 */
	@RequestMapping(value="/regions/query")
	public void regions(HttpServletRequest request,HttpServletResponse response) throws Exception{
		System.out.println("查询区域");
		response.setContentType("application/json");
		String xcList=loginService.regions(request);
		//System.out.println(xcList);
		response.getWriter().print(xcList);
	}
	/**
	 * 查询个性化服务协议列表
	 * @param request
	 * @param response
	 * @param params
	 * @param page
	 * @param pageSize
	 * @throws Exception
	 */
	@RequestMapping(value="/gxhfwxy/querys")
	public void queryGxhfwxys(HttpServletRequest request,HttpServletResponse response,
			@ModelAttribute Parameters params,int page,int pageSize) throws Exception{
		System.out.println("查询个性化服务协议列表");
		response.setContentType("application/json");
		params.setClassName("com.zrhis.wsjd.system.bean.SqglGxhfwxy");
		if(page<1)page=1;
		params.setStart((page-1)*pageSize);
		params.setLimit(pageSize);
		String[] orders ={"VId desc"};
		params.setOrderarr(orders);		
		//查询条件	
		String param=new String(request.getParameter("params").getBytes("iso8859-1"),"utf-8");
		params.setParams(param);
		String xcList=loginService.query(request, params);
		//System.out.println(xcList);
		response.getWriter().print(xcList);
	}
	/**
	 * 查询个性化服务协议具体信息
	 * @param request
	 * @param response
	 * @param params
	 * @throws Exception
	 */
	@RequestMapping(value = "/gxhfwxy/query")
	public void queryGxhfwxy(HttpServletRequest request,
			HttpServletResponse response,@ModelAttribute Parameters params) throws Exception {
		System.out.println("查询个性化服务协议具体信息");	
		response.setContentType("application/json");
		String xcList=loginService.getEntity(SqglGxhfwxy.class, request.getParameter("VId"));
		//System.out.println(xcList);
		response.getWriter().print(xcList);
	}
	/**
	 * 保存个性化服务协议
	 * @param request
	 * @param response
	 * @throws Exception
	 */
	@RequestMapping(value="/gxhfwxy/save")
	public void saveGxhfwxy(HttpServletRequest request,HttpServletResponse response) throws Exception{
		System.out.println("保存个性化服务协议");
		response.setContentType("application/json");
		String xcList=loginService.saveGxhfwxy(request);
		//System.out.println(xcList);
		response.getWriter().print(xcList);
	}
	/**
	 * 删除个性化服务协议
	 * @param request
	 * @param response
	 * @param params
	 * @throws Exception
	 */
	@RequestMapping(value="/gxhfwxy/delete")
	public void deleteGxhfwxy(HttpServletRequest request,HttpServletResponse response,
			@ModelAttribute Parameters params) throws Exception{
		System.out.println("删除个性化服务协议");
		response.setContentType("application/json");
		params.setId(request.getParameter("VId"));
		params.setClassName("com.zrhis.wsjd.system.bean.SqglGxhfwxy");
		String xcList=loginService.delete(request,params);
		//System.out.println(xcList);
		response.getWriter().print(xcList);
	}
	/**
	 * 查询签约家庭服务记录列表
	 * @param request
	 * @param response
	 * @param params
	 * @param page
	 * @param pageSize
	 * @throws Exception
	 */
	@RequestMapping(value="/qyjtfwjl/querys")
	public void queryQyjtfwjls(HttpServletRequest request,HttpServletResponse response,
			@ModelAttribute Parameters params,int page,int pageSize) throws Exception{
		//int page=1;int pageSize=10;
		System.out.println("查询签约家庭服务记录列表");
		response.setContentType("application/json");
		if(page<1)page=1;
		String xcList=loginService.queryQyjtfwjl(request,page,pageSize);
		//System.out.println(xcList);
		response.getWriter().print(xcList);
	}
	/**
	 * 查询签约家庭服务记录详情
	 * @param request
	 * @param response
	 * @param params
	 * @throws Exception
	 */
	@RequestMapping(value="/qyjtfwjl/query")
	public void queryQyjtfwjl(HttpServletRequest request,HttpServletResponse response,
			@ModelAttribute Parameters params) throws Exception{
		//int page=1;int pageSize=10;
		System.out.println("查询签约家庭服务记录详情");
		response.setContentType("application/json");
		String xcList=loginService.getEntity(SqglQyjtfwjl.class, request.getParameter("VId"));
		//System.out.println(xcList);
		response.getWriter().print(xcList);
	}
	/**
	 * 保存签约家庭服务记录
	 * @param request
	 * @param response
	 * @throws Exception
	 */
	@RequestMapping(value="/qyjtfwjl/save")
	public void saveQyjtfwjl(HttpServletRequest request,HttpServletResponse response) throws Exception{
		System.out.println("保存签约家庭服务记录");
		response.setContentType("application/json");
		String xcList=loginService.saveQyjtfwjl(request);
		//System.out.println(xcList);
		response.getWriter().print(xcList);
	}
	/**
	 * 保存签约家庭服务记录
	 * @param request
	 * @param response
	 * @throws Exception
	 */
	@RequestMapping(value="/qyjtfwjl/savelw")
	public void saveQyjtfwjllw(HttpServletRequest request,HttpServletResponse response) throws Exception{
		System.out.println("保存签约家庭服务记录");
		response.setContentType("application/json");
		String xcList=loginService.saveQyjtfwjllw(request);
		//System.out.println(xcList);
		response.getWriter().print(xcList);
	}
	/**
	 * 删除签约家庭服务记录
	 * @param request
	 * @param response
	 * @param params
	 * @throws Exception
	 */
	@RequestMapping(value="/qyjtfwjl/delete")
	public void deleteQyjtfwjl(HttpServletRequest request,HttpServletResponse response,
			@ModelAttribute Parameters params) throws Exception{
		System.out.println("删除签约家庭服务记录");
		response.setContentType("application/json");
		params.setId(request.getParameter("VId"));
		params.setClassName("com.zrhis.wsjd.system.bean.SqglQyjtfwjllw");
		String xcList=loginService.delete(request,params);
		//System.out.println(xcList);
		response.getWriter().print(xcList);
	}
	/**
	 * 签约服务团队责任划分
	 * @param request
	 * @param response
	 * @param params
	 * @param page
	 * @param pageSize
	 * @throws Exception
	 */
	@RequestMapping(value="/qyfwzrtdhf/querys")
	public void queryQyfwzrtdhf(HttpServletRequest request,HttpServletResponse response,
			@ModelAttribute Parameters params,int page,int pageSize) throws Exception{
		System.out.println("查询签约服务团队责任划分");
		response.setContentType("application/json");
		params.setClassName("com.zrhis.wsjd.system.bean.SqglQyfwtdzrhf");
		if(page<1)page=1;
		params.setStart((page-1)*pageSize);
		params.setLimit(pageSize);
		String[] orders ={"VId desc"};
		params.setOrderarr(orders);		
		//查询条件	
		String param=new String(request.getParameter("params").getBytes("iso8859-1"),"utf-8");
		params.setParams(param);
		String xcList=loginService.query(request, params);
		//System.out.println(xcList);
		response.getWriter().print(xcList);
	}
	/**
	 * 查询签约服务团队责任划分详情
	 * @param request
	 * @param response
	 * @param params
	 * @throws Exception
	 */
	@RequestMapping(value="/qyfwzrtdhf/query")
	public void queryQyfwzrtdhf(HttpServletRequest request,HttpServletResponse response,
			@ModelAttribute Parameters params) throws Exception{
		//int page=1;int pageSize=10;
		System.out.println("查询签约服务团队责任划分详情");
		response.setContentType("application/json");
		String xcList=loginService.getEntity(SqglQyfwtdzrhf.class, request.getParameter("VId"));
		//System.out.println(xcList);
		response.getWriter().print(xcList);
	}
	
	/**
	 * 保存签约服务团队责任划分
	 * @param request
	 * @param response
	 * @throws Exception
	 */
	@RequestMapping(value="/qyfwzrtdhf/save")
	public void saveQyfwzrtdhf(HttpServletRequest request,HttpServletResponse response) throws Exception{
		System.out.println("保存签约服务团队责任划分");
		response.setContentType("application/json");
		String xcList=loginService.saveQyfwzrtdhf(request);
		//System.out.println(xcList);
		response.getWriter().print(xcList);
	}
	/**
	 * 删除签约服务团队责任划分
	 * @param request
	 * @param response
	 * @param params
	 * @throws Exception
	 */
	@RequestMapping(value="/qyfwzrtdhf/delete")
	public void deleteQyfwzrtdhf(HttpServletRequest request,HttpServletResponse response,
			@ModelAttribute Parameters params) throws Exception{
		System.out.println("删除签约服务团队责任划分");
		response.setContentType("application/json");
		params.setId(request.getParameter("VId"));
		params.setClassName("com.zrhis.wsjd.system.bean.SqglQyfwtdzrhf");
		String xcList=loginService.delete(request,params);
		//System.out.println(xcList);
		response.getWriter().print(xcList);
	}
	/**
	 * 下载某个村的签约服务团队责任划分
	 * @param request
	 * @param response
	 * @param params
	 * @throws Exception
	 */
	@RequestMapping(value="/qyfwzrtdhf/onload")
	public void onloadQyfwzrtdhf(HttpServletRequest request,HttpServletResponse response,
			@ModelAttribute Parameters params) throws Exception{
		//int page=1;int pageSize=10;
		System.out.println("下载某个村的签约服务团队责任划分");
		response.setContentType("application/json");
		String xcList=loginService.getQyfwzrtdhf(request,params);
		//System.out.println(xcList);
		response.getWriter().print(xcList);
	}
	
	/**
	 * 下载某个村的签约服务团队责任划分
	 * @param request
	 * @param response
	 * @param params
	 * @throws Exception
	 */
	@RequestMapping(value="/qyfwzrtdhf/onloadqy")
	public void onloadQyfwzrtdhfqy(HttpServletRequest request,HttpServletResponse response,
			@ModelAttribute Parameters params) throws Exception{
		//int page=1;int pageSize=10;
		System.out.println("下载沁阳某个村的签约服务团队责任划分");
		response.setContentType("application/json");
		String xcList=loginService.getQyfwzrtdhfqy(request,params);
		//System.out.println(xcList);
		response.getWriter().print(xcList);
	}
	
/**
 * 下载某个村的责任医生
 * @param request
 * @param response
 * @param params
 * @throws Exception
 */
	@RequestMapping(value="/zrys/onload")
	public void onloadZrys(HttpServletRequest request,HttpServletResponse response,
			@ModelAttribute Parameters params) throws Exception{
		//int page=1;int pageSize=10;
		System.out.println("下载某个村的责任医生");
		response.setContentType("application/json");
		String xcList=loginService.getZrys(request,params);
		//System.out.println(xcList);
		response.getWriter().print(xcList);
	}
	/**
	 * 下载某个村的责任护士
	 * @param request
	 * @param response
	 * @param params
	 * @throws Exception
	 */
	@RequestMapping(value="/zrhs/onload")
	public void onloadZrhs(HttpServletRequest request,HttpServletResponse response,
			@ModelAttribute Parameters params) throws Exception{
		//int page=1;int pageSize=10;
		System.out.println("下载某个村的责任护士");
		response.setContentType("application/json");
		String xcList=loginService.getZrhs(request,params);
		//System.out.println(xcList);
		response.getWriter().print(xcList);
	}
	/**
	 * 下载某个村的组信息
	 * @param request
	 * @param response
	 * @param params
	 * @throws Exception
	 */
	@RequestMapping(value="/zu/onload")
	public void onloadZu(HttpServletRequest request,HttpServletResponse response,
			@ModelAttribute Parameters params) throws Exception{
		//int page=1;int pageSize=10;
		System.out.println("下载某个村的组信息");
		response.setContentType("application/json");
		String xcList=loginService.getZu(request,params);
		//System.out.println(xcList);
		response.getWriter().print(xcList);
	}
	/**
	 * 下载某个村医院信息
	 * @param request
	 * @param response
	 * @param params
	 * @throws Exception
	 */
	@RequestMapping(value="/yyxx/onload")
	public void onloadYyxx(HttpServletRequest request,HttpServletResponse response,
			@ModelAttribute Parameters params) throws Exception{
		//int page=1;int pageSize=10;
		System.out.println("下载某个村医院信息");
		response.setContentType("application/json");
		String xcList=loginService.getYyxx(request,params);
		//System.out.println(xcList);
		response.getWriter().print(xcList);
	}
	/**
	 * 下载居委会信息
	 * @param request
	 * @param response
	 * @param params
	 * @throws Exception
	 */
	@RequestMapping(value="/jwh/onload")
	public void onloadJwh(HttpServletRequest request,HttpServletResponse response,
			@ModelAttribute Parameters params) throws Exception{
		System.out.println("下载居委会信息");
		//int page=1;int pageSize=10;
		response.setContentType("application/json");
		String xcList=loginService.getJwh(request,params);
		//System.out.println(xcList);
		response.getWriter().print(xcList);
	}
	/**
	 * 下载名族信息
	 * @param request
	 * @param response
	 * @param params
	 * @throws Exception
	 */
	@RequestMapping(value="/mz/onload")
	public void queryMz(HttpServletRequest request,HttpServletResponse response) throws Exception{
		System.out.println("下载名族信息");
		response.setContentType("application/json");
		String[] orders ={"VId desc"};
		String xcList=loginService.queryMz(request);
		//System.out.println(xcList);
		response.getWriter().print(xcList);
	}
	/**
	 * 下载文化程度信息
	 * @param request
	 * @param response
	 * @param params
	 * @throws Exception
	 */
	@RequestMapping(value="/whcd/onload")
	public void queryWhcd(HttpServletRequest request,HttpServletResponse response) throws Exception{
		System.out.println("下载文化程度信息");
		response.setContentType("application/json");
		String xcList=loginService.queryWhcd(request);
		//System.out.println(xcList);
		response.getWriter().print(xcList);
	}
	/**
	 * 下载职业信息
	 * @param request
	 * @param response
	 * @param params
	 * @throws Exception
	 */
	@RequestMapping(value="/zy/onload")
	public void queryZy(HttpServletRequest request,HttpServletResponse response,
			@ModelAttribute Parameters params) throws Exception{
		System.out.println("下载职业信息");
		response.setContentType("application/json");
		String xcList=loginService.queryZy(request);
		//System.out.println(xcList);
		response.getWriter().print(xcList);
	}
	
	@RequestMapping(value="/pcs/onload")
	public void queryPcs(HttpServletRequest request,HttpServletResponse response,
			@ModelAttribute Parameters params) throws Exception{
		System.out.println("下载派出所信息");
		response.setContentType("application/json");
		String xcList=loginService.queryPcs(request);
		//System.out.println(xcList);
		response.getWriter().print(xcList);
	}
	/**
	 * 下载户主关系表信息
	 * @param request
	 * @param response
	 * @param params
	 * @throws Exception
	 */
	@RequestMapping(value="/hzgxb/onload")
	public void queryHzgxb(HttpServletRequest request,HttpServletResponse response,
			@ModelAttribute Parameters params) throws Exception{
		System.out.println("下载户主关系表信息");
		response.setContentType("application/json");
		String xcList=loginService.queryHzgxb(request);
		//System.out.println(xcList);
		response.getWriter().print(xcList);
	}
	/**
	 * 保存家庭成员信息
	 * @param request
	 * @param response
	 * @throws Exception
	 */
	@RequestMapping(value="/jtcyxx/save")
	public void saveJtcyxx(HttpServletRequest request,HttpServletResponse response) throws Exception{
		System.out.println("保存家庭成员信息");
		response.setContentType("application/json");
		String xcList=loginService.saveJtcyxx(request);
		//System.out.println("xcList::::"+xcList);
		response.getWriter().print(xcList);
	}
	/**
	 * 删除家庭成员信息
	 * @param request
	 * @param response
	 * @param params
	 * @throws Exception
	 */
	@RequestMapping(value="/jtcyxx/delete")
	public void deleteJtcyxx(HttpServletRequest request,HttpServletResponse response,
			@ModelAttribute Parameters params) throws Exception{
		System.out.println("删除家庭成员信息");
		response.setContentType("application/json");
		String xcList=loginService.deleteJtcyxx(request,params);
		//System.out.println(xcList);
		response.getWriter().print(xcList);
	}
	/**
	 * 注销家庭成员信息
	 * @param request
	 * @param response
	 * @param params
	 * @throws Exception
	 */
	@RequestMapping(value="/jtcyxx/cancel")
	public void deleteCancel(HttpServletRequest request,HttpServletResponse response) throws Exception{
		//Date d = new Date();
		//System.out.println("d1d1d1d1d1"+d.getTime());
		System.out.println("注销家庭成员信息");
		response.setContentType("application/json");
		String xcList=loginService.deleteCancel(request);
		Date d2 = new Date();
		//System.out.println("d2d2d2d2d2"+d2.getTime());
		//System.out.println("chazhi"+(d2.getTime()-d.getTime()));
		//System.out.println(xcList);
		response.getWriter().print(xcList);
	}
	/**
	 * 保存家庭基本信息
	 * @param request
	 * @param response
	 * @throws Exception
	 */
	@RequestMapping(value="/jtjbxx/save")
	public void saveJtjbxx(HttpServletRequest request,HttpServletResponse response) throws Exception{
		System.out.println("保存家庭基本信息");
		response.setContentType("application/json");
		String xcList=loginService.saveJtjbxx(request);
		//System.out.println("xcList::::"+xcList);
		response.getWriter().print(xcList);
	}
	/**
	 * 注销家庭基本信息
	 * @param request
	 * @param response
	 * @throws Exception
	 */
	@RequestMapping(value="/jtjbxx/cancel")
	public void jtjbxxCancel(HttpServletRequest request,HttpServletResponse response) throws Exception{
		System.out.println("注销家庭基本信息");
		response.setContentType("application/json");
		String xcList=loginService.jtjbxxCancel(request);
		//System.out.println(xcList);
		response.getWriter().print(xcList);
	}
	/**
	 * 删除家庭基本信息
	 * @param request
	 * @param response
	 * @throws Exception
	 */
	@RequestMapping(value="/jtjbxx/delete")
	public void jtjbxxDelete(HttpServletRequest request,HttpServletResponse response) throws Exception{
		System.out.println("删除家庭基本信息");
		response.setContentType("application/json");
		String xcList=loginService.jtjbxxDelete(request);
		//System.out.println(xcList);
		response.getWriter().print(xcList);
	}
	/**
	 * 下载家庭类型信息
	 * @param request
	 * @param response
	 * @param params
	 * @throws Exception
	 */
	@RequestMapping(value="/jtlx/onload")
	public void queryJrlx(HttpServletRequest request,HttpServletResponse response,
			@ModelAttribute Parameters params) throws Exception{
		System.out.println("下载家庭类型信息");
		response.setContentType("application/json");
		String xcList=loginService.queryJtlx(request);
		//System.out.println(xcList);
		response.getWriter().print(xcList);
	}
   
	@RequestMapping(value="/query/depId")
	public void querydepId(HttpServletRequest request,HttpServletResponse response,
			@ModelAttribute Parameters params) throws Exception{
		System.out.println("下载depId");
		response.setContentType("application/json");
		String xcList=loginService.queryDepId(request,params);
		//System.out.println(xcList);
		response.getWriter().print(xcList);
	}
	/**
	 * 下载某个存的健康体检信息
	 * @param request
	 * @param response
	 * @param params
	 * @throws Exception
	 */
	@RequestMapping(value="/jktj/onload")
	public void onloadJktj(HttpServletRequest request,HttpServletResponse response,
			@ModelAttribute Parameters params) throws Exception{
		//int page=1;int pageSize=10;
		System.out.println("下载某个村的健康体检信息");
		response.setContentType("application/json");
		String xcList=loginService.getJktj(request,params);
		//System.out.println(xcList);
		response.getWriter().print(xcList);
	}
	/**
	 * 下载专项表和随访信息
	 * @param request
	 * @param response
	 * @param params
	 * @param page
	 * @param pageSize
	 * @throws Exception
	 */
	@RequestMapping(value="/zxbhsfxx/onload")
	public void onload(HttpServletRequest request,HttpServletResponse response,
			@ModelAttribute Parameters params,int page,int pageSize,String className) throws Exception{
		System.out.println("下载专项表或随访信息");
		response.setContentType("application/json");
		String xcList="";
		if(page<1)page=1;
		params.setClassName("com.zrhis.wsjd.system.bean."+className);
		params.setStart((page-1)*pageSize);
		params.setLimit(pageSize);
		String[] orders ={"depId desc"};
		params.setOrderarr(orders);		
		//查询条件	
		String param=new String(request.getParameter("params").getBytes("iso8859-1"),"utf-8");
		params.setParams(param);
		if(className=="SqglJtcygxyzxb"||"SqglJtcygxyzxb".equals(className)){
			xcList = loginService.getGxyZx(request, params,page,pageSize);
			//System.out.println(xcList);
		}else if(className=="SqglJtcytnbzxb"||"SqglJtcytnbzxb".equals(className)){
			xcList = loginService.queryTnbZx(params,page,pageSize);
			System.out.println(xcList);
		}else{
		xcList=loginService.query(request, params);
		}
		
		
		//System.out.println(xcList);
		response.getWriter().print(xcList);
	}
	
	/**
	 * 保存专项表
	 * @param request
	 * @param response
	 * @throws Exception
	 */
	@RequestMapping(value="/zxbhsfxx/save")
	public void saveZxbhsfxx(HttpServletRequest request,HttpServletResponse response) throws Exception{
		System.out.println("保存专项表");
		response.setContentType("application/json");
		String xcList=loginService.saveZxb(request);
		//System.out.println("xcList::::"+xcList);
		response.getWriter().print(xcList);
	}
	/**
	 * 保存随访信息
	 * @param request
	 * @param response
	 * @throws Exception
	 */
	@RequestMapping(value="/sfxx/save")
	public void saveSfxx(HttpServletRequest request,HttpServletResponse response) throws Exception{
		System.out.println("保存随访信息");
		response.setContentType("application/json");
		String xcList=loginService.saveSfxx(request);
		//System.out.println("xcList::::"+xcList);
		response.getWriter().print(xcList);
	}
	
	
	/**
	 * 下载某个村的责任医生
	 * @param request
	 * @param response
	 * @param params
	 * @throws Exception
	 */
		@RequestMapping(value="/qyjtfwjl/onload")
		public void onloadFwjl(HttpServletRequest request,HttpServletResponse response,
				@ModelAttribute Parameters params) throws Exception{
			//int page=1;int pageSize=10;
			System.out.println("下载某个村的公卫服务包");
			response.setContentType("application/json");
			String xcList=loginService.getFwjl(request,params);
			//System.out.println(xcList);
			response.getWriter().print(xcList);
		}
		
		/**
		 * 下载某个村的签约服务团队责任划分
		 * @param request
		 * @param response
		 * @param params
		 * @throws Exception
		 */
		@RequestMapping(value="/fileName/onload")
		public void getFile(HttpServletRequest request,HttpServletResponse response,
				@ModelAttribute Parameters params) throws Exception{
			//int page=1;int pageSize=10;
			System.out.println("下载帮助视频");
			
			
            
			//response.setContentType("text/html");
			java.io.FileInputStream fileInputStream =null;
			String xcList="";
			System.out.println("进入 "+"DownloadFileServlet");
			String filepath = "d://uploadfile/";
			String fn = request.getParameter("filename");
			String filename = URLDecoder.decode(fn, "utf-8");
			javax.servlet.ServletOutputStream out = response.getOutputStream();
			try{
			response.setContentType("application/x-msdownload");
			response
					.setHeader("Content-Disposition", "attachment; filename="
							+ new String(filename.getBytes("gb2312"),
									"iso8859-1") + "");
			
			
			System.out.println("下载路径filename:" +filepath+ filename);
			java.io.File file = new java.io.File(filepath + filename+".mp4");
			if (!file.exists()) {
				//log(file.getAbsolutePath() + " 文件不存在!");
				System.out.println(file.getAbsolutePath() + " 文件不存在!"+filepath + filename);
				return;
			}
			// 读取文件流
              fileInputStream = new java.io.FileInputStream(
					file);
			response.setContentLength((int)file.length());
			if (filename != null && filename.length() > 0) {
				
				if (fileInputStream != null) {
					int filelen = fileInputStream.available();
					// 文件太大时内存不能一次读出,要循环
					byte a[] = new byte[filelen];
					fileInputStream.read(a);
					out.write(a);
				}
					System.out.flush();
				fileInputStream.close();
				out.close();
			}
			}catch(Exception ex){
		         // if an I/O error occurs
		         System.out.println("IOException: close called before read()");
		      }
			// 下载文件
			// 设置响应头和下载保存的文件名
			/*if (filename != null && filename.length() > 0) {
				response.setContentType("application/x-msdownload");
				response
						.setHeader("Content-Disposition", "attachment; filename="
								+ new String(filename.getBytes("gb2312"),
										"iso8859-1") + "");
				if (fileInputStream != null) {
					int filelen = fileInputStream.available();
					// 文件太大时内存不能一次读出,要循环
					byte a[] = new byte[filelen];
					int i=0;
					while ((i =fileInputStream.read(a,0,a.length))!=-1) {
					//fileInputStream.read(a);
					 out.write(a);
					}
				}
			}
			 }catch(Exception ex){
		         // if an I/O error occurs
		         System.out.println("IOException: close called before read()");
		      }finally{
		    	  try{
						fileInputStream.close();
						out.flush();
						out.close();
		    	  }catch(IOException ex){
		    		  
		    	  }
		      }*/
		}
		/**
		 * 下载签约服务协议书(签约未完成)列表(无线)
		 * @param request
		 * @param response
		 * @param params
		 * @throws Exception
		 */
		@RequestMapping(value="/qyfwxys/onloadXy")
		public void onloadQyfwxyXy(HttpServletRequest request,HttpServletResponse response,
				@ModelAttribute Parameters params) throws Exception{
			System.out.println("下载待续约列表");
			response.setContentType("application/json");
			String xcList=loginService.onloadQyfwxyXy(request);
			//System.out.println(xcList);
			response.getWriter().print(xcList);
		}
	
		/**
		 * 保存续约流水表信息
		 * @param request
		 * @param response
		 * @throws Exception
		 */
		@RequestMapping(value="/Jtqyls/save")
		public void saveJtqyls(HttpServletRequest request,HttpServletResponse response) throws Exception{
			System.out.println("保存家庭签约流水");
			response.setContentType("application/json");
			String xcList=loginService.saveJtqyls(request);
			//System.out.println("xcList::::"+xcList);
			response.getWriter().print(xcList);
		}
		
		
	@RequestMapping(value="/onload/apk")
	public void onloadApk(HttpServletRequest request,HttpServletResponse response) throws Exception{
		System.out.println("下载apk");
		response.setContentType("application/json");
		loginService.onloadApk(request,response);
	}
	
	@RequestMapping(value="/query/VersionNum")
	public void queryVersionNum(HttpServletRequest request,HttpServletResponse response) throws Exception{
		System.out.println("查询版本号");
		response.setContentType("application/json");
		String xcList=loginService.VersionNum(request,response);
		//System.out.println("xcList::::"+xcList);
		response.getWriter().print(xcList);
	}
}
