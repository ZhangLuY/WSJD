package com.zrhis.wsjd.system.service;

import java.io.File;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.zrhis.base.Parameters;
import com.zrhis.wsjd.system.bean.SqglGxhfwxy;

public interface LoginService {
	//查看签约服务协议书
	String queryQyfwxyss(HttpServletRequest request, int page, int pageSize) throws Exception;
	//查看家庭信息列表
	String queryJtxx(HttpServletRequest request, int page, int pageSize) throws Exception;
	//保存签约服务协议书
	String saveQyfwxy(HttpServletRequest request) throws Exception;
	//保存签约服务协议书
	String saveQyfwxyqy(HttpServletRequest request) throws Exception;
	//删除签约服务协议书
	String delete(HttpServletRequest request, Parameters params) throws Exception;
	//登录
	String Login(HttpServletRequest request) throws Exception;
	//解约
	String surrender(HttpServletRequest request) throws Exception;
	//查询区域
	String regions(HttpServletRequest request) throws Exception;
	//查询多
	String query(HttpServletRequest request, Parameters params) throws Exception;
	//查询单
	String getEntity(Class class1, String parameter) throws Exception;
	//保存个性化服务协议
	String saveGxhfwxy(HttpServletRequest request) throws Exception;
	//查询家庭成员基本信息
	String queryJtcyxx(HttpServletRequest request) throws Exception;
	//签约家庭服务记录列表
	String queryQyjtfwjl(HttpServletRequest request, int page, int pageSize) throws Exception;
	//保存签约家庭服务记录
	String saveQyjtfwjl(HttpServletRequest request) throws Exception;
	//保存签约服务团队责任划分
	String saveQyfwzrtdhf(HttpServletRequest request) throws Exception;
	//查看家庭信息列表所有
	String queryJtxxsy(HttpServletRequest request) throws Exception;
	//获取所以未解约的数据
	String onloadQyfwxyss(HttpServletRequest request)throws Exception;
	//下载某个村的签约服务团队责任划分
	String getQyfwzrtdhf(HttpServletRequest request, Parameters params)throws Exception;
	//下载沁阳某个村的签约服务团队责任划分
	String getQyfwzrtdhfqy(HttpServletRequest request, Parameters params)throws Exception;
	//下载某个村的责任医生
	String getZrys(HttpServletRequest request, Parameters params)throws Exception;
	//下载某个村的责任护士
	String getZrhs(HttpServletRequest request, Parameters params)throws Exception;
	//下载某个村的组信息
	String getZu(HttpServletRequest request, Parameters params)throws Exception;
	//卫生所信息
	String getYyxx(HttpServletRequest request, Parameters params)throws Exception;
	
	String getJwh(HttpServletRequest request, Parameters params)throws Exception;
	//查看名族信息
	String queryMz(HttpServletRequest request)throws Exception;
	//文化程度
	String queryWhcd(HttpServletRequest request)throws Exception;
	//职业
	String queryZy(HttpServletRequest request)throws Exception;
	//户主关系表
	String queryHzgxb(HttpServletRequest request)throws Exception;
	//保存家庭成员信息
	String saveJtcyxx(HttpServletRequest request)throws Exception;
	//删除家庭成员信息
	String deleteJtcyxx(HttpServletRequest request, Parameters params)throws Exception;
	//注销家庭成员信息
	String deleteCancel(HttpServletRequest request)throws Exception;
	//保存家庭基本信息
	String saveJtjbxx(HttpServletRequest request)throws Exception;
	//注销家庭信息
	String jtjbxxCancel(HttpServletRequest request)throws Exception;
	//删除家庭信息
	String jtjbxxDelete(HttpServletRequest request)throws Exception;
	//下载家庭类型
	String queryJtlx(HttpServletRequest request)throws Exception;
	//下载派出所信息
	String queryPcs(HttpServletRequest request)throws Exception;
	//下载depId
	String queryDepId(HttpServletRequest request, Parameters params)throws Exception;
	//下载某个存的健康体检信息
	String getJktj(HttpServletRequest request, Parameters params) throws Exception;
	//保存专项表
	String saveZxb(HttpServletRequest request)throws Exception;
	//保存随访信息
	String saveSfxx(HttpServletRequest request)throws Exception;
	//下载apk
	void onloadApk(HttpServletRequest request,HttpServletResponse response)throws Exception;
	String VersionNum(HttpServletRequest request, HttpServletResponse response)throws Exception;
	//修改、回退签约接口
	String updateQyfwxyss(HttpServletRequest request)throws Exception;
	//下载未完成的签约协议
	String onloadQyfwxysw(HttpServletRequest request) throws Exception;
	//成员补签接口
	String updateCyQyfwxy(HttpServletRequest request) throws Exception;
	//新的公卫服务包接口
	String saveQyjtfwjllw(HttpServletRequest request) throws Exception;
	//选择签约家庭
	String chooseQyJt(HttpServletRequest request) throws Exception;
	//选择有效的高血压数据
	String getGxyZx(HttpServletRequest request, Parameters params, int page,
			int pageSize)
			throws Exception;
	//下载有效的糖尿病数据
	String queryTnbZx(Parameters request, int page, int pageSize)
			throws Exception;
	//下载服务记录
	String getFwjl(HttpServletRequest request, Parameters params)
			throws Exception;
	String onloadQyfwxyXy(HttpServletRequest request) throws Exception;
	String saveJtqyls(HttpServletRequest request) throws Exception;
}
