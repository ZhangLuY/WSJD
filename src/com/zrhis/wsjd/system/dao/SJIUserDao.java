package com.zrhis.wsjd.system.dao;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.zrhis.base.Message;
import com.zrhis.base.Parameters;
import com.zrhis.wsjd.system.bean.SqglGxhfwxy;


public interface SJIUserDao { 
	

	String Register(HttpServletRequest request) ;
	
	String Login(HttpServletRequest request) ;
	
	String ModifyPassword(HttpServletRequest request) ;
	
	String ModifyInfo(HttpServletRequest request) ;
	
	String GetUserInfo(HttpServletRequest request) ;
	
	String BindingFamily(HttpServletRequest request) ;
	
	String GetFamilyInfo(HttpServletRequest request) ;

	String GetFamilyMember(HttpServletRequest request) ;
	
	String GetFamilyContract(HttpServletRequest request) ;
	
	String GetFamilyContractTeam(HttpServletRequest request) ;
	
	String GetFamilyContractTeamQY(HttpServletRequest request) ;
	
	String GetFamilyChildren(HttpServletRequest request) ;
	
	String GetFamilyChildrenVisit(HttpServletRequest request) ;
	
	String GetFamilyKeyCrowd(HttpServletRequest request) ;
	
	String GetFamilyAntenatal(HttpServletRequest request) ;
	
	String GetFamilyPostpartum(HttpServletRequest request) ;
	
	String GetFamilyElderly(HttpServletRequest request) ;

	String GetFamilyElderlyVisit(HttpServletRequest request) ;
	
	String GetFamilyHypertension(HttpServletRequest request) ;
	
	String GetFamilyHypertensionVisit(HttpServletRequest request) ;
	
	String GetFamilyPsychosis(HttpServletRequest request) ;
	
	String GetFamilyPsychosisVisit(HttpServletRequest request) ;
	
	String GetFamilyDiabetes(HttpServletRequest request) ;
	
	String GetFamilyDiabetesVisit(HttpServletRequest request) ;
	
	String GetFamilyPhthisis(HttpServletRequest request) ;
	
	String GetFamilyPhthisisVisit(HttpServletRequest request) ;
	
	String queryQyjtfwjl(HttpServletRequest request) ;
	
	String saveEvaluationInfor(HttpServletRequest request) ;
	
	String getzcYzm(HttpServletRequest request) ;
	
	String checkzcYzm(HttpServletRequest request) ;
	
	String modifyPhoneNumber(HttpServletRequest request) ;


}
