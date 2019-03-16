package com.zrhis.wsjd.system.service.impl;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.apache.http.HttpRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.support.PropertiesLoaderUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sun.security.ntlm.Client;
import com.sun.xml.internal.messaging.saaj.util.ByteInputStream;
import com.sun.xml.internal.messaging.saaj.util.ByteOutputStream;
import com.zrhis.base.Message;
import com.zrhis.base.Parameters;
import com.zrhis.base.dao.BaseDao;
import com.zrhis.base.service.DefaultService;
import com.zrhis.wsjd.system.bean.SqglJtcyjbxx;
import com.zrhis.wsjd.system.bean.SqglXcysqyfw;
import com.zrhis.wsjd.system.dao.IUserDao;
import com.zrhis.wsjd.system.dao.SJIUserDao;
import com.zrhis.wsjd.system.service.LoginService;
import com.zrhis.wsjd.system.service.SJLoginService;
import com.zrhis.wsjd.util.CommonUtil;
import com.zrhis.wsjd.util.DataBaseTools;
import com.zrhis.wsjd.util.JSONFormat;
import com.zrhis.wsjd.util.JsonUtil;
import com.zrhis.wsjd.util.MessageManager;
import com.zrhis.wsjd.util.PropertiesUtil;

@Service
public class SJLoginServiceImpl implements SJLoginService{
	
	@Autowired
	private DefaultService defaultService;
	
	@Autowired
	private SJIUserDao iuseDao;
	
	@Autowired
	private BaseDao baseDao;
	
	@PersistenceContext
	protected EntityManager entityManager;
	@Autowired
	protected DataSource dataSource;
	String ypcslist=null;
	
	@Override
	public String Register(HttpServletRequest request)  {
		String xcList = iuseDao.Register(request);
		
		return xcList;
	}
	@Override
	public String Login(HttpServletRequest request)  {
		String xcList = iuseDao.Login(request);
		return xcList;
	}
	@Override
	@Transactional
	public String ModifyPassword(HttpServletRequest request)  {
		String xcList = iuseDao.ModifyPassword(request);
		return xcList;
	}
	@Override
	@Transactional
	public String ModifyInfo(HttpServletRequest request) {
		String xcList = iuseDao.ModifyInfo(request);
		return xcList;
	}
	
	@Override
	public String GetUserInfo(HttpServletRequest request) {
		String xcList = iuseDao.GetUserInfo(request);
		return xcList;
	}
	@Override
	@Transactional
	public String BindingFamily(HttpServletRequest request) {
		String xcList = iuseDao.BindingFamily(request);
		return xcList;
	}
	@Override
	public String GetFamilyInfo(HttpServletRequest request) {
		String xcList = iuseDao.GetFamilyInfo(request);
		return xcList;
	}
	@Override
	public String GetFamilyMember(HttpServletRequest request) {
		String xcList = iuseDao.GetFamilyMember(request);
		return xcList;
	}
	@Override
	public String GetFamilyContract(HttpServletRequest request) {
		String xcList = iuseDao.GetFamilyContract(request);
		return xcList;
	}
	@Override
	public String GetFamilyContractTeam(HttpServletRequest request) {
		String xcList = iuseDao.GetFamilyContractTeam(request);
		return xcList;
	}
	@Override
	public String GetFamilyChildren(HttpServletRequest request) {
		String xcList = iuseDao.GetFamilyChildren(request);
		return xcList;
	}
	@Override
	public String GetFamilyKeyCrowd(HttpServletRequest request) {
		String xcList = iuseDao.GetFamilyKeyCrowd(request);
		return xcList;
	}
	@Override
	public String GetFamilyAntenatal(HttpServletRequest request) {
		String xcList = iuseDao.GetFamilyAntenatal(request);
		return xcList;
	}
	@Override
	public String GetFamilyPostpartum(HttpServletRequest request) {
		String xcList = iuseDao.GetFamilyPostpartum(request);
		return xcList;
	}
	@Override
	public String GetFamilyElderly(HttpServletRequest request) {
		String xcList = iuseDao.GetFamilyElderly(request);
		return xcList;
	}
	@Override
	public String GetFamilyChildrenVisit(HttpServletRequest request) {
		String xcList = iuseDao.GetFamilyChildrenVisit(request);
		return xcList;
	}
	@Override
	public String GetFamilyElderlyVisit(HttpServletRequest request) {
		String xcList = iuseDao.GetFamilyElderlyVisit(request);
		return xcList;
	}
	@Override
	public String GetFamilyContractTeamQY(HttpServletRequest request) {
		String xcList = iuseDao.GetFamilyContractTeamQY(request);
		return xcList;
	}
	@Override
	public String GetFamilyHypertension(HttpServletRequest request) {
		String xcList = iuseDao.GetFamilyHypertension(request);
		return xcList;
	}
	@Override
	public String GetFamilyHypertensionVisit(HttpServletRequest request) {
		String xcList = iuseDao.GetFamilyHypertensionVisit(request);
		return xcList;
	}
	@Override
	public String GetFamilyPsychosis(HttpServletRequest request) {
		String xcList = iuseDao.GetFamilyPsychosis(request);
		return xcList;
	}
	@Override
	public String GetFamilyPsychosisVisit(HttpServletRequest request) {
		String xcList = iuseDao.GetFamilyPsychosisVisit(request);
		return xcList;
	}
	@Override
	public String GetFamilyDiabetes(HttpServletRequest request) {
		String xcList = iuseDao.GetFamilyDiabetes(request);
		return xcList;
	}
	@Override
	public String GetFamilyDiabetesVisit(HttpServletRequest request) {
		String xcList = iuseDao.GetFamilyDiabetesVisit(request);
		return xcList;
	}
	@Override
	public String GetFamilyPhthisis(HttpServletRequest request) {
		String xcList = iuseDao.GetFamilyPhthisis(request);
		return xcList;
	}
	@Override
	public String GetFamilyPhthisisVisit(HttpServletRequest request) {
		String xcList = iuseDao.GetFamilyPhthisisVisit(request);
		return xcList;
	}
	@Override
	public String VersionNum(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		PropertiesUtil p =new PropertiesUtil();
		String str=p.readValue("SJversion-number");
	    System.out.println(str);
		return str;
	}
	
	@Override
	public void onloadApk(HttpServletRequest request,HttpServletResponse response) throws Exception {
		Properties props = new Properties();  
	    props=PropertiesLoaderUtils.loadAllProperties("config.properties"); 
	    String url=props.get("url_sj").toString();
		File file = new File(url);
		InputStream is=new FileInputStream(file);
		response.setContentLength((int)file.length());
		byte[]  buf=new byte[2048];
		int len=0;
		OutputStream os=response.getOutputStream();
		while((len=is.read(buf))!=-1){
			os.write(buf,0,len);
		}
		os.flush();
		is.close();
		os.close();
	}
	@Override
	public String queryQyjtfwjl(HttpServletRequest request) {
		String xcList = iuseDao.queryQyjtfwjl(request);
		return xcList;
	}
	@Override
	@Transactional
	public String saveEvaluationInfor(HttpServletRequest request) {
		String xcList = iuseDao.saveEvaluationInfor(request);
		return xcList;
	}
	@Override
	public String getzcYzm(HttpServletRequest request) {
		String xcList = iuseDao.getzcYzm(request);
		return xcList;
	}
	@Override
	public String checkzcYzm(HttpServletRequest request) {
		String xcList = iuseDao.checkzcYzm(request);
		return xcList;
	}
	@Override
	@Transactional
	public String modifyPhoneNumber(HttpServletRequest request) {
		String xcList = iuseDao.modifyPhoneNumber(request);
		return xcList;
	}
	
	
	
	
	
	
	
}
