package com.zrhis.base.service;


import javax.servlet.http.HttpServletRequest;

import com.zrhis.base.Message;
import com.zrhis.base.Parameters;

@SuppressWarnings("rawtypes")
public interface DefaultService {

	public Message getEntity(String className,String id) throws Exception;
	public Message savaEntity(HttpServletRequest request,Parameters params) throws Exception;
	public Message updateEntity(HttpServletRequest request,Parameters params) throws Exception;
	public Message updateEntityEx(HttpServletRequest request,Parameters params) throws Exception;
	public Message deleteEntity(String className,String id) throws Exception;
	public Message query(HttpServletRequest request,Parameters params) throws Exception;
	public Message fuzzyQueryAll(HttpServletRequest request, Parameters params)
			throws Exception ;
	
	public Message getEntity(Class clz, String id) throws Exception;
	public Message queryAll(HttpServletRequest request, Parameters params)
			throws Exception;
	
	public Message queryAllByDep(HttpServletRequest request, Parameters params) 
			throws Exception;
	
	public Message pagingQueryAllByDep(HttpServletRequest request, Parameters params) 
			throws Exception;
}
