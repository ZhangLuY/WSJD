package com.zrhis.wsjd.system.controller;

import java.util.Date;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import com.zrhis.base.BaseController;
import com.zrhis.base.Parameters;
import com.zrhis.wsjd.system.bean.SqglGxhfwxy;
import com.zrhis.wsjd.system.bean.SqglQyfwtdzrhf;
import com.zrhis.wsjd.system.bean.SqglQyjtfwjl;
import com.zrhis.wsjd.system.service.SJLoginService;


@Controller
@RequestMapping("/SJ")
public class SJLoginController extends BaseController{
	
	@Autowired
	private SJLoginService loginService;
	
	
	/**
	 * 注册，2018年4月18日17:19:16
	 * @param request
	 * @param response
	 * @throws Exception
	 * @author lpf
	 */
	@RequestMapping(value="/register")
	public void Register(HttpServletRequest request,HttpServletResponse response) throws Exception {
		System.out.println("注册");	
		String xcList = loginService.Register(request);
		response.setContentType("application/json"); 
		if(xcList != null){
			System.out.println(xcList);//在控制台输出要返回的json对象
			response.getWriter().print(xcList);
		}
	}
	
	/**
	 * 登录，2018年4月18日17:19:20
	 * @param request
	 * @param response
	 * @throws Exception
	 * @author lpf
	 */
	@RequestMapping(value="/login")
	public void Login(HttpServletRequest request,HttpServletResponse response) throws Exception {
		System.out.println("登录");	
		String xcList = loginService.Login(request);
		response.setContentType("application/json"); 
		if(xcList != null){
			System.out.println(xcList);//在控制台输出要返回的json对象
			response.getWriter().print(xcList);
		}
	}
	
	/**
	 * 修改密码，2018年4月18日17:21:47
	 * @param request
	 * @param response
	 * @throws Exception
	 * @author lpf
	 */
	@RequestMapping(value="/Modify")
	public void ModifyPassword(HttpServletRequest request,HttpServletResponse response) throws Exception {
		System.out.println("修改密码");	
		String xcList = loginService.ModifyPassword(request);
		response.setContentType("application/json"); 
		if(xcList != null){
			System.out.println(xcList);//在控制台输出要返回的json对象
			response.getWriter().print(xcList);
		}
	}
	
	/**
	 * 修改个人信息，2018年4月19日10:26:10
	 * @param request
	 * @param response
	 * @throws Exception
	 * @author lpf
	 */
	@RequestMapping(value="/ModifyInfo")
	public void ModifyInfo(HttpServletRequest request,HttpServletResponse response) throws Exception {
		System.out.println("修改个人信息");	
		String xcList = loginService.ModifyInfo(request);
		response.setContentType("application/json"); 
		if(xcList != null){
			System.out.println(xcList);//在控制台输出要返回的json对象
			response.getWriter().print(xcList);
		}
	}
	
	/**
	 * 根据身份证获取个人信息对应的家庭，2018年4月19日10:26:10
	 * @param request
	 * @param response
	 * @throws Exception
	 * @author lpf
	 */
	@RequestMapping(value="/GetUserInfo")
	public void GetUserInfo(HttpServletRequest request,HttpServletResponse response) throws Exception {
		System.out.println("根据身份证获取个人信息对应的家庭");	
		String xcList = loginService.GetUserInfo(request);
		response.setContentType("application/json"); 
		if(xcList != null){
			System.out.println(xcList);//在控制台输出要返回的json对象
			response.getWriter().print(xcList);
		}
	}
	
	/**
	 * 个人账号绑定家庭，2018年4月19日10:26:10
	 * @param request
	 * @param response
	 * @throws Exception
	 * @author lpf
	 */
	@RequestMapping(value="/BindingFamily")
	public void BindingFamily(HttpServletRequest request,HttpServletResponse response) throws Exception {
		System.out.println("个人账号绑定家庭");	
		String xcList = loginService.BindingFamily(request);
		response.setContentType("application/json"); 
		if(xcList != null){
			System.out.println(xcList);//在控制台输出要返回的json对象
			response.getWriter().print(xcList);
		}
	}
	/**
	 * 获取个人家庭信息，2018年4月19日10:26:10
	 * @param request
	 * @param response
	 * @throws Exception
	 * @author lpf
	 */
	@RequestMapping(value="/GetFamilyInfo")
	public void GetFamilyInfo(HttpServletRequest request,HttpServletResponse response) throws Exception {
		System.out.println("获取个人家庭信息");	 
		String xcList = loginService.GetFamilyInfo(request);
		response.setContentType("application/json"); 
		if(xcList != null){
			System.out.println(xcList);//在控制台输出要返回的json对象
			response.getWriter().print(xcList);
		}
	}
	
	/**
	 * 获取个人家庭成员信息，2018年4月19日10:26:10
	 * @param request
	 * @param response
	 * @throws Exception
	 * @author lpf
	 */
	@RequestMapping(value="/GetFamilyMember")
	public void GetFamilyMember(HttpServletRequest request,HttpServletResponse response) throws Exception {
		System.out.println("获取个人家庭成员信息");	 
		String xcList = loginService.GetFamilyMember(request);
		response.setContentType("application/json"); 
		if(xcList != null){
			System.out.println(xcList);//在控制台输出要返回的json对象
			response.getWriter().print(xcList);
		}
	}
	
	/**
	 * 获取个人家庭签约信息，2018年4月19日10:26:10
	 * @param request
	 * @param response
	 * @throws Exception
	 * @author lpf
	 */
	@RequestMapping(value="/GetFamilyContract")
	public void GetFamilyContract(HttpServletRequest request,HttpServletResponse response) throws Exception {
		System.out.println("获取个人家庭签约信息");	 
		String xcList = loginService.GetFamilyContract(request);
		response.setContentType("application/json"); 
		if(xcList != null){
			System.out.println(xcList);//在控制台输出要返回的json对象
			response.getWriter().print(xcList);
		}
	}
	
	/**
	 * 获取家庭签约团队信息(漯河)，2018年4月19日10:26:10
	 * @param request
	 * @param response
	 * @throws Exception
	 * @author lpf
	 */
	@RequestMapping(value="/GetFamilyContractTeam")
	public void GetFamilyContractTeam(HttpServletRequest request,HttpServletResponse response) throws Exception {
		System.out.println("获取家庭签约团队信息(漯河)");	 
		String xcList = loginService.GetFamilyContractTeam(request);
		response.setContentType("application/json"); 
		if(xcList != null){
			System.out.println(xcList);//在控制台输出要返回的json对象
			response.getWriter().print(xcList);
		}
	}
	/**
	 * 获取家庭签约团队信息(沁阳)，2018年4月19日10:26:10
	 * @param request
	 * @param response
	 * @throws Exception
	 * @author lpf
	 */
	@RequestMapping(value="/GetFamilyContractTeamQY")
	public void GetFamilyContractTeamQY(HttpServletRequest request,HttpServletResponse response) throws Exception {
		System.out.println("获取家庭签约团队信息(沁阳)");	 
		String xcList = loginService.GetFamilyContractTeamQY(request);
		response.setContentType("application/json"); 
		if(xcList != null){
			System.out.println(xcList);//在控制台输出要返回的json对象
			response.getWriter().print(xcList);
		}
	}
	
	/**
	 * 获取家庭成员儿童专项，2018年4月19日10:26:10
	 * @param request
	 * @param response
	 * @throws Exception
	 * @author lpf
	 */
	@RequestMapping(value="/GetFamilyChildren")
	public void GetFamilyChildren(HttpServletRequest request,HttpServletResponse response) throws Exception {
		System.out.println("获取家庭成员儿童专项");	 
		String xcList = loginService.GetFamilyChildren(request);
		response.setContentType("application/json"); 
		if(xcList != null){
			System.out.println(xcList);//在控制台输出要返回的json对象
			response.getWriter().print(xcList);
		}
	}
	/**
	 * 获取家庭成员儿童随访，2018年4月19日10:26:10
	 * @param request
	 * @param response
	 * @throws Exception
	 * @author lpf
	 */
	@RequestMapping(value="/GetFamilyChildrenVisit")
	public void GetFamilyChildrenVisit(HttpServletRequest request,HttpServletResponse response) throws Exception {
		System.out.println("获取家庭成员儿童随访");	 
		String xcList = loginService.GetFamilyChildrenVisit(request);
		response.setContentType("application/json"); 
		if(xcList != null){
			System.out.println(xcList);//在控制台输出要返回的json对象
			response.getWriter().print(xcList);
		}
	}
	
	/**
	 * 获取家庭重点人群成员，2018年4月19日10:26:10
	 * @param request
	 * @param response
	 * @throws Exception
	 * @author lpf
	 */
	@RequestMapping(value="/GetFamilyKeyCrowd")
	public void GetFamilyKeyCrowd(HttpServletRequest request,HttpServletResponse response) throws Exception {
		System.out.println("获取家庭重点人群成员");	 
		String xcList = loginService.GetFamilyKeyCrowd(request);
		response.setContentType("application/json"); 
		if(xcList != null){
			System.out.println(xcList);//在控制台输出要返回的json对象
			response.getWriter().print(xcList);
		}
	}
	
	/**
	 * 获取家庭成员孕产妇产前随访，2018年4月19日10:26:10
	 * @param request
	 * @param response
	 * @throws Exception
	 * @author lpf
	 */
	@RequestMapping(value="/GetFamilyAntenatal")
	public void GetFamilyAntenatal(HttpServletRequest request,HttpServletResponse response) throws Exception {
		System.out.println("获取家庭成员孕产妇产前随访");	 
		String xcList = loginService.GetFamilyAntenatal(request);
		response.setContentType("application/json"); 
		if(xcList != null){
			System.out.println(xcList);//在控制台输出要返回的json对象
			response.getWriter().print(xcList);
		}
	}
	/**
	 * 获取家庭成员孕产妇产后随访，2018年4月19日10:26:10
	 * @param request
	 * @param response
	 * @throws Exception
	 * @author lpf
	 */
	@RequestMapping(value="/GetFamilyPostpartum")
	public void GetFamilyPostpartum(HttpServletRequest request,HttpServletResponse response) throws Exception {
		System.out.println("获取家庭成员孕产妇产后随访");	 
		String xcList = loginService.GetFamilyPostpartum(request);
		response.setContentType("application/json"); 
		if(xcList != null){
			System.out.println(xcList);//在控制台输出要返回的json对象
			response.getWriter().print(xcList);
		}
	}
	
	/**
	 * 获取家庭成员65岁以上老人专项表，2018年4月19日10:26:10
	 * @param request
	 * @param response
	 * @throws Exception
	 * @author lpf
	 */
	@RequestMapping(value="/GetFamilyElderly")
	public void GetFamilyElderly(HttpServletRequest request,HttpServletResponse response) throws Exception {
		System.out.println("获取家庭成员65岁以上老人专项表");	 
		String xcList = loginService.GetFamilyElderly(request);
		response.setContentType("application/json"); 
		if(xcList != null){
			System.out.println(xcList);//在控制台输出要返回的json对象
			response.getWriter().print(xcList);
		}
	}
	
	/**
	 * 获取家庭成员65岁以上老人随访表，2018年4月19日10:26:10
	 * @param request
	 * @param response
	 * @throws Exception
	 * @author lpf
	 */
	@RequestMapping(value="/GetFamilyElderlyVisit")
	public void GetFamilyElderlyVisit(HttpServletRequest request,HttpServletResponse response) throws Exception {
		System.out.println("获取家庭成员65岁以上老人随访表");	 
		String xcList = loginService.GetFamilyElderlyVisit(request);
		response.setContentType("application/json"); 
		if(xcList != null){
			System.out.println(xcList);//在控制台输出要返回的json对象
			response.getWriter().print(xcList);
		}
	}
	/**
	 * 获取家庭成员高血压病人专项，2018年4月19日10:26:10
	 * @param request
	 * @param response
	 * @throws Exception
	 * @author lpf
	 */
	@RequestMapping(value="/GetFamilyHypertension")
	public void GetFamilyHypertension(HttpServletRequest request,HttpServletResponse response) throws Exception {
		System.out.println("获取家庭成员高血压病人专项");	 
		String xcList = loginService.GetFamilyHypertension(request);
		response.setContentType("application/json"); 
		if(xcList != null){
			System.out.println(xcList);//在控制台输出要返回的json对象
			response.getWriter().print(xcList);
		}
	}
	/**
	 * 获取家庭成员高血压病人随访记录，2018年4月19日10:26:10
	 * @param request
	 * @param response
	 * @throws Exception
	 * @author lpf
	 */
	@RequestMapping(value="/GetFamilyHypertensionVisit")
	public void GetFamilyHypertensionVisit(HttpServletRequest request,HttpServletResponse response) throws Exception {
		System.out.println("获取家庭成员高血压病人随访记录");	 
		String xcList = loginService.GetFamilyHypertensionVisit(request);
		response.setContentType("application/json"); 
		if(xcList != null){
			System.out.println(xcList);//在控制台输出要返回的json对象
			response.getWriter().print(xcList);
		}
	}
	
	/**
	 * 获取家庭成员精神病人专项，2018年4月19日10:26:10
	 * @param request
	 * @param response
	 * @throws Exception
	 * @author lpf
	 */
	@RequestMapping(value="/GetFamilyPsychosis")
	public void GetFamilyPsychosis(HttpServletRequest request,HttpServletResponse response) throws Exception {
		System.out.println("获取家庭成员精神病人专项");	 
		String xcList = loginService.GetFamilyPsychosis(request);
		response.setContentType("application/json"); 
		if(xcList != null){
			System.out.println(xcList);//在控制台输出要返回的json对象
			response.getWriter().print(xcList);
		}
	}
	/**
	 * 获取家庭成员精神病人随访记录，2018年4月19日10:26:10
	 * @param request
	 * @param response
	 * @throws Exception
	 * @author lpf
	 */
	@RequestMapping(value="/GetFamilyPsychosisVisit")
	public void GetFamilyPsychosisVisit(HttpServletRequest request,HttpServletResponse response) throws Exception {
		System.out.println("获取家庭成员精神病人随访记录");	 
		String xcList = loginService.GetFamilyPsychosisVisit(request);
		response.setContentType("application/json"); 
		if(xcList != null){
			System.out.println(xcList);//在控制台输出要返回的json对象
			response.getWriter().print(xcList);
		}
	}
	
	/**
	 * 获取家庭成员糖尿病病人专项，2018年4月19日10:26:10
	 * @param request
	 * @param response
	 * @throws Exception
	 * @author lpf
	 */
	@RequestMapping(value="/GetFamilyDiabetes")
	public void GetFamilyDiabetes(HttpServletRequest request,HttpServletResponse response) throws Exception {
		System.out.println("获取家庭成员糖尿病病人专项");	 
		String xcList = loginService.GetFamilyDiabetes(request);
		response.setContentType("application/json"); 
		if(xcList != null){
			System.out.println(xcList);//在控制台输出要返回的json对象
			response.getWriter().print(xcList);
		}
	}
	/**
	 * 获取家庭成员糖尿病病人随访记录，2018年4月19日10:26:10
	 * @param request
	 * @param response
	 * @throws Exception
	 * @author lpf
	 */
	@RequestMapping(value="/GetFamilyDiabetesVisit")
	public void GetFamilyDiabetesVisit(HttpServletRequest request,HttpServletResponse response) throws Exception {
		System.out.println("获取家庭成员糖尿病病人专项");	 
		String xcList = loginService.GetFamilyDiabetesVisit(request);
		response.setContentType("application/json"); 
		if(xcList != null){
			System.out.println(xcList);//在控制台输出要返回的json对象
			response.getWriter().print(xcList);
		}
	}
	/**
	 * 获取家庭成员肺结核病人专项，2018年4月19日10:26:10
	 * @param request
	 * @param response
	 * @throws Exception
	 * @author lpf
	 */
	@RequestMapping(value="/GetFamilyPhthisis")
	public void GetFamilyPhthisis(HttpServletRequest request,HttpServletResponse response) throws Exception {
		System.out.println("获取家庭成员肺结核病人专项");	 
		String xcList = loginService.GetFamilyPhthisis(request);
		response.setContentType("application/json"); 
		if(xcList != null){
			System.out.println(xcList);//在控制台输出要返回的json对象
			response.getWriter().print(xcList);
		}
	}
	/**
	 * 获取家庭成员肺结核病人随访记录，2018年4月19日10:26:10
	 * @param request
	 * @param response
	 * @throws Exception
	 * @author lpf
	 */
	@RequestMapping(value="/GetFamilyPhthisisVisit")
	public void GetFamilyPhthisisVisit(HttpServletRequest request,HttpServletResponse response) throws Exception {
		System.out.println("获取家庭成员肺结核病人随访记录");	 
		String xcList = loginService.GetFamilyPhthisisVisit(request);
		response.setContentType("application/json"); 
		if(xcList != null){
			System.out.println(xcList);//在控制台输出要返回的json对象
			response.getWriter().print(xcList);
		}
	}
	@RequestMapping(value="/VersionNum")
	public void queryVersionNum(HttpServletRequest request,HttpServletResponse response) throws Exception{
		System.out.println("查询版本号");
		response.setContentType("application/json");
		String xcList=loginService.VersionNum(request,response);
		System.out.println("xcList::::"+xcList);
		response.getWriter().print(xcList);
	}
	@RequestMapping(value="/onload/apk")
	public void onloadApk(HttpServletRequest request,HttpServletResponse response) throws Exception{
		System.out.println("下载apk");
		response.setContentType("application/json");
		loginService.onloadApk(request,response);
	}
	
	/**
	 * 查询签约家庭服务记录详情
	 * @param request
	 * @param response
	 * @param params
	 * @throws Exception
	 */
	@RequestMapping(value="/queryQyjtfwjl")
	public void queryQyjtfwjl(HttpServletRequest request,HttpServletResponse response) throws Exception{
		System.out.println("查询签约家庭服务记录详情");	 
		String xcList = loginService.queryQyjtfwjl(request);
		response.setContentType("application/json"); 
		if(xcList != null){
			System.out.println(xcList);//在控制台输出要返回的json对象
			response.getWriter().print(xcList);
		}
	}
	/**
	 * 保存评价信息
	 * @param request
	 * @param response
	 * @param params
	 * @throws Exception
	 */
	@RequestMapping(value="/saveEvaluationInfor")
	public void saveEvaluationInfor(HttpServletRequest request,HttpServletResponse response) throws Exception{
		System.out.println("保存评价信息");	 
		String xcList = loginService.saveEvaluationInfor(request);
		response.setContentType("application/json"); 
		if(xcList != null){
			System.out.println(xcList);//在控制台输出要返回的json对象
			response.getWriter().print(xcList);
		}
	}
	
	/**
	 * 用户注册获取短信验证码信息
	 * @param request
	 * @param response
	 * @param params
	 * @throws Exception
	 */
	@RequestMapping(value="/getzcYzm")
	public void getzcYzm(HttpServletRequest request,HttpServletResponse response) throws Exception{
		System.out.println("用户注册获取短信验证码信息");	 
		String xcList = loginService.getzcYzm(request);
		response.setContentType("application/json"); 
		if(xcList != null){
			System.out.println(xcList);//在控制台输出要返回的json对象
			response.getWriter().print(xcList);
		}
	}
	/**
	 * 检验用户输入的验证码
	 * @param request
	 * @param response
	 * @param params
	 * @throws Exception
	 */
	@RequestMapping(value="/checkzcYzm")
	public void checkzcYzm(HttpServletRequest request,HttpServletResponse response) throws Exception{
		System.out.println("检验用户输入的验证码");	 
		String xcList = loginService.checkzcYzm(request);
		response.setContentType("application/json"); 
		if(xcList != null){
			System.out.println(xcList);//在控制台输出要返回的json对象
			response.getWriter().print(xcList);
		}
	}
	/**
	 * 修改绑定的手机号
	 * @param request
	 * @param response
	 * @param params
	 * @throws Exception
	 */
	@RequestMapping(value="/modifyPhoneNumber")
	public void modifyPhoneNumber(HttpServletRequest request,HttpServletResponse response) throws Exception{
		System.out.println("检验用户输入的验证码");	 
		String xcList = loginService.modifyPhoneNumber(request);
		response.setContentType("application/json"); 
		if(xcList != null){
			System.out.println(xcList);//在控制台输出要返回的json对象
			response.getWriter().print(xcList);
		}
	}
}
