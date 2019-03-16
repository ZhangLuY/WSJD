package com.zrhis.wsjd.system.dao.impl;

import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;
import java.beans.PropertyDescriptor;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.io.StringReader;
import java.io.Writer;
import java.math.BigDecimal;
import java.sql.Clob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

import javax.imageio.IIOImage;
import javax.imageio.ImageIO;
import javax.imageio.ImageWriteParam;
import javax.imageio.ImageWriter;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.sql.DataSource;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import javax.persistence.Query;

import oracle.jdbc.OracleDriver;
import oracle.sql.CLOB;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import com.aliyuncs.dysmsapi.model.v20170525.SendSmsResponse;
import com.aliyuncs.exceptions.ClientException;
import com.sun.org.apache.commons.beanutils.BeanUtils;
import com.sun.xml.internal.bind.v2.TODO;
import com.zrhis.base.Message;
import com.zrhis.base.Parameters;
import com.zrhis.base.ResultModel;
import com.zrhis.base.dao.BaseDao;
import com.zrhis.wsjd.api.SendCode;
import com.zrhis.wsjd.system.bean.SqglGxhfwxy;
import com.zrhis.wsjd.system.bean.SqglJtcygxyzxb;
import com.zrhis.wsjd.system.bean.SqglJtcyjbxx;
import com.zrhis.wsjd.system.bean.SqglJtcyjzs;
import com.zrhis.wsjd.system.bean.SqglJtjbxx;
import com.zrhis.wsjd.system.bean.SqglQyfwtdzrhf;
import com.zrhis.wsjd.system.bean.SqglQyjtfwjl;
import com.zrhis.wsjd.system.bean.SqglXcysqyfw;
import com.zrhis.wsjd.system.bean.SqglXcysqyfwjtcy;
import com.zrhis.wsjd.system.bean.XtglCzy;
import com.zrhis.wsjd.system.bean.XtglUsers;
import com.zrhis.wsjd.system.dao.IUserDao;
import com.zrhis.wsjd.system.dao.SJIUserDao;
import com.zrhis.wsjd.util.BeanTransform;
import com.zrhis.wsjd.util.CommonUtil;
import com.zrhis.wsjd.util.DataBaseTools;
import com.zrhis.wsjd.util.EntityUtil;
import com.zrhis.wsjd.util.JSONFormat;
import com.zrhis.wsjd.util.JsonUtil;
import com.zrhis.wsjd.util.MD5Encoder;
import com.zrhis.wsjd.util.MessageManager;
import com.zrhis.wsjd.util.MyDaoBase;
import com.zrhis.wsjd.util.StringUtils;
import com.zrhis.wsjd.util.utils;

import org.springframework.security.authentication.encoding.PasswordEncoder;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;
@Repository
public class SJUserDaoImpl implements SJIUserDao{
	
	@PersistenceContext
	protected EntityManager entityManager;
	@Autowired
	private PasswordEncoder passwordEncoder;
	@Autowired
	protected DataSource dataSource;
	@Autowired
	private BaseDao baseDao;
	String ypcslist=null;
	
	//注册
	@Override
	public String Register(HttpServletRequest request)  {
		String json = CommonUtil.readJSONString(request); 
		JSONObject jsonObject = JSONObject.fromObject(json);
		String password=jsonObject.getString("VDlkl");
		String VZjhm=jsonObject.getString("VZjhm");
		String VUsermc=jsonObject.getString("VUsermc");
		try {
			new RuntimeException();
		
		String sql2="select count(*) from XTGL_Users where V_Zjhm=?";
		Query countQuery2 = entityManager.createNativeQuery(sql2);
		countQuery2.setParameter(1, VZjhm);
		Integer Count2 = Integer.valueOf(countQuery2.getSingleResult().toString());
		if(Count2>0){
			return CommonUtil.CodeMessageF(2, "该身份证已注册");
		}
		
		String sql1="select count(*) from XTGL_Users where V_Usermc=?";
		Query countQuery = entityManager.createNativeQuery(sql1);
		countQuery.setParameter(1, VUsermc);
		Integer Count = Integer.valueOf(countQuery.getSingleResult().toString());
		if(Count>0){
			return CommonUtil.CodeMessageF(0, "用户名已存在");
		}
		XtglUsers XtglUsers = (XtglUsers)JSONObject.toBean(jsonObject, XtglUsers.class);
		String uuid = UUID.randomUUID().toString().replaceAll("-", "");
		XtglUsers.setVDlkl(MD5Encoder.encoder(password));
		XtglUsers.setCUserbh(uuid);
		this.baseDao.save(XtglUsers);
		
		
		} catch (Exception e) {
			e.printStackTrace();
			return  CommonUtil.CodeMessageF(-1, "系统异常，请稍后重试");
		}
		return  CommonUtil.CodeMessageF(1, "注册成功");
	}
	/**
	 * 2018年4月18日17:13:37
	 * lpf
	 * 登录
	 */
	public String Login(HttpServletRequest request)   {	
		String json = CommonUtil.readJSONString(request); 
		JSONObject jsonObject = JSONObject.fromObject(json);
		String user=jsonObject.getString("username");
		String Vzd="V_Usermc";
		if(user.length()>15){
			Vzd="V_Zjhm";
		}
		
		String password=jsonObject.getString("password");
		try {
			//取出用户名，判断是否存在
		String sql1="select count(*) from XTGL_Users where "+Vzd+"=?";
		Query countQuery = entityManager.createNativeQuery(sql1);
		countQuery.setParameter(1, user);
		Integer Count = Integer.valueOf(countQuery.getSingleResult().toString());
		if(Count>0){
			//用户名存在，取出对应的密码，把用户输入的对应的密码转换MD5进行匹配
			String sql2="select V_Dlkl from XTGL_Users where "+Vzd+"=?";
			Query query=this.entityManager.createNativeQuery(sql2);
			query.setParameter(1, user);
			String mm=(String) query.getSingleResult();
			
			if(MD5Encoder.encoder(password).equals(mm)){
				//登录成功将用户名对应的信息返回
				String sql3="select DEP_ID, v_usermc,v_xm,v_zjhm,i_xb,dt_csrq,v_sjhm,v_jtzz,v_xxzz,C_GRBH,C_JTH  from XTGL_Users where "+Vzd+"=?";
				Query query2 = this.entityManager.createNativeQuery(sql3);
				query2.setParameter(1,user);
				List<Object[]> lists = query2.getResultList();
				String ypcslist=null;
				String []arry={"depId","VUsermc","VXm","VZjhm","IXb","dtCsrq","VSjhm","VJtzz","VXxzz","CGrbh","CJth"};
				ypcslist= CommonUtil.ArrayToMap(arry, lists);
				entityManager.close();
				return ypcslist;
			}else{
				return CommonUtil.CodeMessageF(2, "密码错误");
			}
		}else{
			return CommonUtil.CodeMessageF(0, "该用户不存在");
		}
		
		} catch (Exception e) {
			e.printStackTrace();
			return CommonUtil.CodeMessageF(-1, "系统异常，请稍后重试");
		}
	}
	/**
	 * 2018年4月18日17:27:35
	 * lpf
	 * 修改密码
	 */
	@Override
	public String ModifyPassword(HttpServletRequest request)  {
		String json = CommonUtil.readJSONString(request); 
		JSONObject jsonObject = JSONObject.fromObject(json);
		String user=jsonObject.getString("username");
		String NewPassword=jsonObject.getString("NewPassword");
		String OldPassword=jsonObject.getString("OldPassword");
		try {
		String sql="select V_Dlkl from XTGL_Users where V_Usermc=?";
		Query query=this.entityManager.createNativeQuery(sql);
		query.setParameter(1, user);
		String mm=(String) query.getSingleResult();
		if(MD5Encoder.encoder(OldPassword).equals(mm)){
			String sql2="update XTGL_Users set V_Dlkl =?  where V_Usermc=?";
			Query query1=this.entityManager.createNativeQuery(sql2);
			query1.setParameter(1, MD5Encoder.encoder(NewPassword));
			query1.setParameter(2, user);
			int i =query1.executeUpdate();
			if(i<=0){
				return CommonUtil.CodeMessageF(0, "修改失败");
			}else{
				return CommonUtil.CodeMessageF(1, "修改成功");
			}
			
		}else{
			return CommonUtil.CodeMessageF(2, "输入旧密码不对");
		}
		
		} catch (Exception e) {
			e.printStackTrace();
			return CommonUtil.CodeMessageF(-1, "系统异常，请稍后重试");
		}
		
	}
	/**
	 * 2018年4月19日10:28:51
	 * lpf
	 * 修改个人信息
	 */
	@Override
	public String ModifyInfo(HttpServletRequest request) {
		String json = CommonUtil.readJSONString(request); 
		JSONObject jsonObject = JSONObject.fromObject(json);
		String VUsermc=jsonObject.getString("VUsermc");
		String VXm=jsonObject.getString("VXm");
		String VZjhm=jsonObject.getString("VZjhm");
		String IXb=jsonObject.getString("IXb");
		String dtCsrq=jsonObject.getString("dtCsrq");
		String VSjhm=jsonObject.getString("VSjhm");
		String VJtzz=jsonObject.getString("VJtzz");
		String VXxzz=jsonObject.getString("VXxzz");
		 SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		 String sql="update XTGL_Users set V_XM ='"+VXm+"',I_Xb="+IXb+",dt_Csrq=to_date('"+dtCsrq+"','yyyy-MM-dd'),V_Sjhm='"+VSjhm+"',V_Jtzz='"+VJtzz+"',V_Xxzz='"+VXxzz+"'";
		try {
			if(!"".equals(VZjhm)){
				String sql2="select count(*) from XTGL_Users where UPPER(V_Zjhm)=?";
				Query countQuery2 = entityManager.createNativeQuery(sql2);
				countQuery2.setParameter(1, VZjhm);
				Integer Count2 = Integer.valueOf(countQuery2.getSingleResult().toString());
				if(Count2>0){
					return CommonUtil.CodeMessageF(2, "该身份证已绑定其他账号");
				} 
				
				sql=sql+",V_Zjhm='"+VZjhm+"',dep_id='',c_grbh='',c_jth='' ";
			 }
			
			sql=sql+"  where V_Usermc='"+VUsermc+"'";
		
		Query query1=this.entityManager.createNativeQuery(sql);
		int i =query1.executeUpdate();
		if(i<=0){
			return CommonUtil.CodeMessageF(0, "修改失败");
		}else{
			String sql3="select DEP_ID, v_usermc,v_xm,v_zjhm,i_xb,dt_csrq,v_sjhm,v_jtzz,v_xxzz,C_GRBH,C_JTH  from XTGL_Users where V_Usermc=?";
			Query query2 = this.entityManager.createNativeQuery(sql3);
			query2.setParameter(1,VUsermc);
			List<Object[]> lists = query2.getResultList();
			String ypcslist=null;
			String []arry={"depId","VUsermc","VXm","VZjhm","IXb","dtCsrq","VSjhm","VJtzz","VXxzz","CGrbh","CJth"};
			ypcslist= CommonUtil.ArrayToMap(arry, lists);
			entityManager.close();
			return ypcslist;
		}
		} catch (Exception e) {
			e.printStackTrace();
			return CommonUtil.CodeMessageF(-1, "系统异常，请稍后重试");
		}
		
	}
	
	/**
	 * 根据身份证获取个人信息对应的家庭，2018年4月19日10:26:10
	 * @param request
	 * @param response
	 * @throws Exception
	 * @author lpf
	 */
	@Override
	public String GetUserInfo(HttpServletRequest request) {
		String json = CommonUtil.readJSONString(request); 
		JSONObject jsonObject = JSONObject.fromObject(json);
		String VZjhm=jsonObject.getString("VZjhm");
		try {
			String lastNumer = VZjhm.substring(17,18);
			String sql="select c.dep_name,c.c_grbh,c.c_jth,x.v_hzxm,c.dep_id,c.v_xm,c.v_zjhm  from  SQGL_JTCYJBXX c,SQGL_JTJBXX x where  c.c_jth=x.c_jth and c.c_jth  in ( select c_jth from SQGL_JTCYJBXX  where v_zjhm=?)";
			if("X".equals(lastNumer.toUpperCase())){
				sql="select c.dep_name,c.c_grbh,c.c_jth,x.v_hzxm,c.dep_id,c.v_xm,c.v_zjhm  from  SQGL_JTCYJBXX c,SQGL_JTJBXX x where  c.c_jth=x.c_jth and c.c_jth  in ( select c_jth from SQGL_JTCYJBXX  where UPPER(v_zjhm)=?)";
			}
		Query query2 = this.entityManager.createNativeQuery(sql);
		query2.setParameter(1,VZjhm);
		List<Object[]> lists = query2.getResultList();
		if(lists.size()>0){
			String ypcslist=null;
			String []arry={"depName","CGrbh","CJth","VHzxm","depId","VXm","VZjhm"};
			ypcslist= CommonUtil.ArrayToMapJson(arry, lists);
			entityManager.close();
			return ypcslist;
		}else{
			return CommonUtil.CodeMessageF(0, "未查到对应的家庭");
		}
		
		} catch (Exception e) {
			e.printStackTrace();
			return CommonUtil.CodeMessageF(-1, "系统异常，请稍后重试");
		}
		
	}
	/**
	 * 个人账号绑定家庭，2018年4月19日10:26:10
	 * @param request
	 * @param response
	 * @throws Exception
	 * @author lpf
	 */
	@Override
	public String BindingFamily(HttpServletRequest request) {
		String json = CommonUtil.readJSONString(request); 
		JSONObject jsonObject = JSONObject.fromObject(json);
		String VUsermc=jsonObject.getString("VUsermc");
		String depId=jsonObject.getString("depId");
		String CJth=jsonObject.getString("CJth");
		String CGrbh=jsonObject.getString("CGrbh");
		try {
		String sql2="update XTGL_Users set DEP_ID =?,C_GRBH=?,C_JTH=?  where V_Usermc=?";
		Query query1=this.entityManager.createNativeQuery(sql2);
		query1.setParameter(1, depId);
		query1.setParameter(2, CGrbh);
		query1.setParameter(3, CJth);
		query1.setParameter(4, VUsermc);
		int i =query1.executeUpdate();
		if(i<=0){
			return CommonUtil.CodeMessageF(0, "绑定失败");
		}else{
			return CommonUtil.CodeMessageF(1, "绑定成功");
		}
		
		} catch (Exception e) {
			e.printStackTrace();
			return CommonUtil.CodeMessageF(-1, "系统异常，请稍后重试");
		}
		
	}
	/**
	 * 获取个人家庭信息，2018年4月19日10:26:10
	 * @param request
	 * @param response
	 * @throws Exception
	 * @author lpf
	 */
	@Override
	public String GetFamilyInfo(HttpServletRequest request) {
		String json = CommonUtil.readJSONString(request); 
		JSONObject jsonObject = JSONObject.fromObject(json);
		String CJth=jsonObject.getString("CJth");
		String sql="select DEP_ID, C_JTH, V_HZXM, V_SZJD, V_SZHY, V_SZHL, V_SZHS, V_DH, V_ZRYS, V_ZRHS, C_SQBH, C_SZJDH, C_JWHBH, I_SFQDHT, C_JTLX, I_LENDZT, I_CSBZ, C_JZZK, N_JZMJ, I_YSLY1, I_YSLY2, " +
		"I_YSLY3, I_YSLY4, I_YSLY5, I_YSLY6, I_YSLY7, V_QTLY, I_CSLB, C_JTRJSR, N_YLZWZ, N_ZGDWZ, N_PCSWZ, I_ZFJG, I_LCS, I_FJS, N_M, N_RJMJ, I_CG, I_TF, I_BN, I_KQSD, I_CF, I_SSSP, I_RL," +
		" I_PY, I_WS, I_SZ, I_JYDD, I_JYDH, I_JYDSJ, I_JYLYJ, I_JYFRJ, I_JYDBX, I_JYXYJ, I_JYKT, I_JYLY, I_JYDN, I_JYZXC, I_JYJC, I_JYJTYY, I_JYQT, V_QTJY, DT_XHSJ, V_XHWT, DT_CSSJ, V_CSWT, " +
		"DT_XLQSJ, V_XLQWT, DT_XLHSJ, V_XLHWT, DT_QSSJ, V_QSWT, DT_LJSJ, V_LJWT, DT_MRSJ, V_MRWT, DT_TXSJ, V_TXWT, DT_SOSJ, V_SOWT, I_ZT, I_ZCDYY, V_ZDJWH, V_ZDXQ, V_ZDJD, V_ZDLH, V_ZDFJH, DT_JDRQ," +
		" V_BDCZ, V_DCZ, V_FHZ, DT_QMRQ, DT_DCRQ, DT_FHRQ, V_BZ, DEP_NAME, V_JTSDBH, DT_CREATE, C_CZYBH, V_JTZZ from  SQGL_JTJBXX where I_ZT =1  and c_jth=?";		
		try {
		Query query2 = this.entityManager.createNativeQuery(sql);
		query2.setParameter(1,CJth);
		List<Object[]> lists = query2.getResultList();
		String ypcslist=null;
		if(lists!=null && lists.size()>0){
		String []arry={"depId","CJth","VHzxm","VSzjd","VSzhy","VSzhl","VSzhs","VDh","VZrys","VZrhs","CSqbh","CSzjdh","CJwhbh","ISfqdht","CJtlx","ILendzt","ICsbz","CJzzk","NJzmj",
				"IYsly1","IYsly2","IYsly3","IYsly4","IYsly5","IYsly6","IYsly7","VQtly","ICslb","CJtrjsr","NYlzwz","NZgdwz","NPcswz","IZfjg","ILcs","IFjs","NM","NRjmj","ICg","ITf",
				"IBn","IKqsd","ICf","ISssp","IRl","IPy","IWs","ISz","IJydd","IJydh","IJydsj","IJylyj","IJyfrj","IJydbx","IJyxyj","IJykt","IJyly","IJydn","IJyzxc","IJyjc","IJyjtyy",
				"IJyqt","VQtjy","dtXhsj","VXhwt","dtCssj","VCswt","dtXlqsj","VXlqwt","dtXlhsj","VXlhwt","dtQssj","VQswt","dtLjsj","VLjwt","dtMrsj","VMrwt","dtTxsj","VTxwt","dtSosj",
				"VSowt","IZt","IZcdyy","VZdjwh","VZdxq","VZdjd","VZdlh","VZdfjh","dtJdrq","VBdcz","VDcz","VFhz","dtQmrq","dtDcrq","dtFhrq","VBz","depName","VJtsdbh","dtCreate","CCzybh","VJtzz"};
		ypcslist= CommonUtil.ArrayToMapJson(arry, lists);
		entityManager.close();
		return ypcslist;
		}else{
			return CommonUtil.CodeMessageF(0, "该成员暂无对应家庭信息");
		}
		} catch (Exception e) {
			e.printStackTrace();
			return CommonUtil.CodeMessageF(-1, "系统异常，请稍后重试");
		}
	}
	/**
	 * 获取个人家庭成员信息，2018年4月19日10:26:10
	 * @param request
	 * @param response
	 * @throws Exception
	 * @author lpf
	 */
	@Override
	public String GetFamilyMember(HttpServletRequest request) {
		String json = CommonUtil.readJSONString(request); 
		JSONObject jsonObject = JSONObject.fromObject(json);
		String CJth=jsonObject.getString("CJth");
		String sql ="select DEP_ID, C_SQH, C_ID, C_GRBH, V_XM, C_JTH, C_YHZGX, V_PYJM, I_XB, DT_CSRQ, I_HKLX, I_HJLX, I_JZZK, " +
		"I_YLFKFS, V_QT, V_YBZH, I_HF, N_SG, N_TZ, I_XL, V_XYG, V_XYD, V_MZ, C_SF, C_SQ, C_XQ, V_GZDW, V_DWDH, V_ZJHM, C_WHCD," +
		" V_JG, V_YQZY, V_ZY, V_SZJWH, V_SZPCS, C_SZXQ, V_SZJD, V_SZYH, V_SZLH, V_SZFJH, C_YZBM, V_LXDH, I_XX, I_SFLR, I_ZT, I_ZCDYY, " +
		"V_ZDJWH, C_ZDXQ, V_ZDJD, V_ZDLH, V_ZDFJH, V_WGYY, I_JWJKZK, I_JBLB1, I_JBLB2, I_JBLB3, I_JBLB4, I_JBLB5, I_JBLB6, I_JBLB7, I_JBLB8," +
		" I_JBLB9, I_JBLB10, I_JBLB11, I_JBLB12, I_JBLB13, I_JBLB14, I_JBLB15, I_JBLB16, I_JBLB17, I_JBLB18, I_JBLB19, I_JBLB20, I_JBLB21, I_JBLB22," +
		" I_JBLB23, I_JBLB24, I_JBLB25, I_JBLB26, I_JBLB27, I_JBLB28, I_JBLB29, I_JBLB30, V_QTJB, DT_QZRQ1, DT_QZRQ2, DT_QZRQ3, DT_QZRQ4, DT_QZRQ5," +
		" DT_QZRQ6, DT_QZRQ7, DT_QZRQ8, DT_QZRQ9, DT_QZRQ10, DT_QZRQ11, DT_QZRQ12, DT_QZRQ13, DT_QZRQ14, DT_QZRQ15, DT_QZRQ16, DT_QZRQ17, DT_QZRQ18, " +
		"DT_QZRQ19, DT_QZRQ20, DT_QZRQ21, DT_QZRQ22, DT_QZRQ23, DT_QZRQ24, DT_QZRQ25, DT_QZRQ26, DT_QZRQ27, DT_QZRQ28, DT_QZRQ29, DT_QZRQ30, DT_QTQZRQ, " +
		"V_JDYS, V_JDHS, DT_JDRQ, V_BDCZ, V_DCZ, V_FHZ, DT_QMRQ, DT_DCRQ, DT_FHRQ, V_BZ, I_ICZT, V_JDDW, V_JDDWDH, V_JTDH, V_YSDH, V_QTSM, V_LXRXM, I_YWSS, " +
		"V_SSMC1, V_SSMC2, V_SSMC3, DT_SSRQ1, DT_SSRQ2, DT_SSRQ3, I_YWWS, V_WSMC1, V_WSMC2, V_WSMC3, DT_WSRQ1, DT_WSRQ2, DT_WSRQ3, I_YWSX, V_SXYY1, V_SXYY2, " +
		"V_SXYY3, DT_SXRQ1, DT_SXRQ2, DT_SXRQ3, I_YWGM, I_YWQMS, I_YWHA, I_YWLMS, I_QTGM, V_QTGM, I_YWCJ, I_SLCJ, I_TLCJ, I_YYCJ, I_ZTCJ, I_ZLCJ, I_JSCJ, I_QTCJ," +
		" V_QTCJ, I_XXYX, V_ZHXGR, DT_ZHXGRQ, I_XGBZ, I_JLBZ, I_CSBZ, I_ZT2, I_ZCDYY2, DEP_NAME, V_GRSDBH, I_UPLOAD, DT_UPLOAD, DT_CREATE, I_YWBLS, I_BLS, I_CFPF, " +
		"I_RLLX, I_YS, I_CS, I_QCL, C_CZYBH, C_SZJDH, I_ET, DT_TURN_ET, DT_REVOKE_ET, I_LR, DT_TURN_LR, DT_REVOKE_LR, I_YCF, DT_TURN_YCF, DT_REVOKE_YCF from   SQGL_JTCYJBXX  where I_ZT =1  and c_jth=? ";
		try {
			Query query2 = this.entityManager.createNativeQuery(sql);
			query2.setParameter(1,CJth);
			List<Object[]> lists = query2.getResultList();
			String ypcslist=null;
			if(lists!=null && lists.size()>0){
				String []arry={"depId","CSqh","CId","CGrbh","VXm","CJth","CYhzgx","VPyjm","IXb","dtCsrq","IHklx","IHjlx","IJzzk","IYlfkfs","VQt","VYbzh","IHf","NSg","NTz","IXl","VXyg",
						"VXyd","VMz","CSf","CSq","CXq","VGzdw","VDwdh","VZjhm","CWhcd","VJg","VYqzy","VZy","VSzjwh","VSzpcs","CSzxq","VSzjd","VSzyh","VSzlh","VSzfjh","CYzbm","VLxdh",
						"IXx","ISflr","IZt","IZcdyy","VZdjwh","CZdxq","VZdjd","VZdlh","VZdfjh","VWgyy","IJwjkzk","IJblb1","IJblb2","IJblb3","IJblb4","IJblb5","IJblb6","IJblb7","IJblb8",
						"IJblb9","IJblb10","IJblb11","IJblb12","IJblb13","IJblb14","IJblb15","IJblb16","IJblb17","IJblb18","IJblb19","IJblb20","IJblb21","IJblb22","IJblb23","IJblb24",
						"IJblb25","IJblb26","IJblb27","IJblb28","IJblb29","IJblb30","VQtjb","dtQzrq1","dtQzrq2","dtQzrq3","dtQzrq4","dtQzrq5","dtQzrq6","dtQzrq7","dtQzrq8","dtQzrq9",
						"dtQzrq10","dtQzrq11","dtQzrq12","dtQzrq13","dtQzrq14","dtQzrq15","dtQzrq16","dtQzrq17","dtQzrq18","dtQzrq19","dtQzrq20","dtQzrq21","dtQzrq22","dtQzrq23",
						"dtQzrq24","dtQzrq25","dtQzrq26","dtQzrq27","dtQzrq28","dtQzrq29","dtQzrq30","dtQtqzrq","VJdys","VJdhs","dtJdrq","VBdcz","VDcz","VFhz","dtQmrq","dtDcrq","dtFhrq",
						"VBz","IIczt","VJddw","VJddwdh","VJtdh","VYsdh","VQtsm","VLxrxm","IYwss","VSsmc1","VSsmc2","VSsmc3","dtSsrq1","dtSsrq2","dtSsrq3","IYwws","VWsmc1","VWsmc2","VWsmc3",
						"dtWsrq1","dtWsrq2","dtWsrq3","IYwsx","VSxyy1","VSxyy2","VSxyy3","dtSxrq1","dtSxrq2","dtSxrq3","IYwgm","IYwqms","IYwha","IYwlms","IQtgm","VQtgm","IYwcj","ISlcj","ITlcj",
						"IYycj","IZtcj","IZlcj","IJscj","IQtcj","VQtcj","IXxyx","VZhxgr","DTzhxgrq","IXgbz","IJlbz","ICsbz","IZt2","IZcdyy2","depName","VGrsdbh","IUpload","dtUpload","dtCreate",
						"IYwbls","IBls","ICfpf","IRllx","IYs","ICs","IQcl","CCzybh","CSzjdh","IEt","dtTurnet","dtRevokeet","ILr","dtTurnlr","dtRevokelr","IYcf","dtTurnycf","dtRevokeycf"};	
			ypcslist= CommonUtil.ArrayToMapJson(arry, lists);
			entityManager.close();
			return ypcslist;
			}else{
				return CommonUtil.CodeMessageF(0, "该成员暂无对应家庭信息");
			}
			} catch (Exception e) {
				e.printStackTrace();
				return CommonUtil.CodeMessageF(-1, "系统异常，请稍后重试");
			}
	}
	/**
	 * 获取个人家庭签约信息，2018年4月19日10:26:10
	 * @param request
	 * @param response
	 * @throws Exception
	 * @author lpf
	 */
	@Override
	public String GetFamilyContract(HttpServletRequest request) {
		String json = CommonUtil.readJSONString(request); 
		JSONObject jsonObject = JSONObject.fromObject(json);
		String CJth=jsonObject.getString("CJth");
		System.out.println(CJth);
		String sql="SELECT V_ID, DEP_ID, DEP_NAME, C_JTH, V_YLJGH, V_YLJGMC, V_ZWSY, DT_QYSJ, V_QYJT, V_QYJTDZ, N_JTRS, V_RQLB, V_XZQYFS, V_JTLXR, V_JTLXDH," +
				" N_JF, C_CZYBH, DT_CREATE, V_SZJDH, N_CZRKS, DT_DQSJ, V_SZJG, V_SZYS, V_SZYSDH, V_ZZJG1, V_ZZYS1, V_ZZYSDH1, V_ZZJG2, V_ZZYS2, V_ZZYSDH2, V_ZZJG3," +
				" V_ZZYS3, V_ZZYSDH3, V_CWSS, I_ZT, DT_JYSJ, V_JYYY, V_CYYS, V_CYDH, V_WSYYS, V_WSYDH, V_QJYS, V_QJDH, V_JFQZ, DT_JFQZSJ, V_YFQZ, DT_YFQZSJ, V_JFJY," +
				" DT_JFJYSJ, V_YFJY, DT_YFJYSJ,V_YY,V_Yfc,V_Yfz,dep_xname,DEP_ZNAME,V_YYDH,V_TDMC,V_ZZXM,V_LXDH1,V_TDID,I_ZXZT,nvl(I_PJZT,1),I_SFLX,I_YSTQJH,I_YSTD,I_PJFS,V_PJNR,DT_PJSJ,C_PJRGRBH,C_USERBH,V_JFQM,V_YFQM from SQGL_XCYSQYFW  where i_zt=0 and i_zxzt=1 and c_jth =? and rownum=1";
		try {
			Query query2 = this.entityManager.createNativeQuery(sql);
			query2.setParameter(1,CJth);
			List<Object[]> lists = query2.getResultList();
			String ypcslist=null;
			if(lists!=null && lists.size()>0){
			String []arry={"VId","depId","depName","CJth","VYljgh","VYljgmc","VZwsy","dtQysj","VQyjt","VQyjtdz","NJtrs","VRqlb","VXzqyfs","VJtlxr","VJtlxdh","NJf",
					"CCzybh","dtCreate","VSzjdh","NCzrks","dtDqsj","VSzjg","VSzys","VSzysdh","VZzjg1","VZzys1","VZzysdh1","VZzjg2","VZzys2","VZzysdh2","VZzjg3","VZzys3",
					"VZzysdh3","VCwss","IZt","dtJysj","VJyyy","VCyys","VCydh","VWsyys","VWsydh","VQjys","VQjdh","VJfqz","dtJfqzsj","VYfqz","dtYfqzsj","VJfjy","dtJfjysj",
					"VYfjy","dtYfjysj","VYy","VYfc","VYfz","depXname","depZname","VYydh","VTdmc","VZzxm","VLxdh1","VTdid","IZxzt","IPjzt","ISflx","IYstqjh","IYstd","IPjfs","VPjnr","dtPjsj","CPjrgrbh","CUserbh","VJfqm","VYfqm"};
			ypcslist= CommonUtil.listToMapJson1(arry, lists,2);
			JSONObject jsonObject1 = JSONObject.fromObject(ypcslist);
			String sql1="select V_CYXX from SQGL_XCYSQYFW where i_zt=0 and i_zxzt=1 and c_jth =? and rownum=1";
			Query query=this.entityManager.createNativeQuery(sql1);
			query.setParameter(1, CJth);
			List<Object[]> lists1 = query.getResultList();
			Object str = lists1.get(0);
			String a = CommonUtil.getClob(str);
			JSONObject jsonObject2 = JSONObject.fromObject(a);
			jsonObject1.put("VCyxx", jsonObject2);
			jsonObject1.put("code", 1);
			entityManager.close();
			return jsonObject1.toString();
			}else{
				return CommonUtil.CodeMessageF(0, "该成员暂无签约家庭或者已解约");
			}
				}catch (Exception e) {
				e.printStackTrace();
				return CommonUtil.CodeMessageF(-1, "系统异常，请稍后重试");
			}

	}
	
	/**
	 * 获取家庭签约团队信息，2018年4月19日10:26:10
	 * @param request
	 * @param response
	 * @throws Exception
	 * @author lpf
	 */
	@Override
	public String GetFamilyContractTeam(HttpServletRequest request) {
		String json = CommonUtil.readJSONString(request); 
		JSONObject jsonObject = JSONObject.fromObject(json);
		String CJth=jsonObject.getString("CJth");
		
		String sql="SELECT  V_CYYS,V_CYDH,V_WSYYS,v_WSYDH,V_QJYS,V_QJDH,V_Yy,V_Cwss,V_Zwsy from SQGL_XCYSQYFW WHERE C_JTH=? AND i_zt=0 and i_zxzt=1 and rownum=1 ";
		try {
			Query query2 = this.entityManager.createNativeQuery(sql);
			query2.setParameter(1,CJth);
			List<Object[]> lists = query2.getResultList();
			String ypcslist=null;
			if(lists!=null && lists.size()>0){
			String []arry={"VCyys","VCydh","VWsyys","VWsydh","VQjys","VQjdh","VYy","VCwss","VZwsy"};
			ypcslist= CommonUtil.ArrayToMapJson(arry, lists);
			entityManager.close();
			return ypcslist;
			}else{
				return CommonUtil.CodeMessageF(0, "该成员暂无签约家庭或者已解约");
			}
			} catch (Exception e) {
				e.printStackTrace();
				return CommonUtil.CodeMessageF(-1, "系统异常，请稍后重试");
			}
			
	}
	/**
	 * 获取家庭成员儿童专项，2018年4月19日10:26:10
	 * @param request
	 * @param response
	 * @throws Exception
	 * @author lpf
	 */
	@Override
	public String GetFamilyChildren(HttpServletRequest request) {
		String json = CommonUtil.readJSONString(request); 
		JSONObject jsonObject = JSONObject.fromObject(json);
		String CGrbh=jsonObject.getString("CGrbh");
		String sql="SELECT   w.dep_id ,w.c_id ,w.c_bh ,w.c_grbh ,w.dt_sfrq,w.v_xm,w.I_XB,w.dt_csrq ,w.v_zjhm,w.v_jtzz,w.v_fxm ,w.v_fzy ,w.v_fdh ,w.dt_fcsrq,w.v_mxm ,w.v_mzy ,w.v_mdh ,w.dt_mcsrq,w.i_csyz,w.i_rcjb,w.v_rcqt,w.v_zcjg,w.i_sc,w.i_tx,w.i_cq,w.i_pg,w.i_sdt ,w.i_tw,w.i_csqt,w.v_csqt,w.i_zx,w.i_zxcd,w.i_jx,w.v_jxqk,w.i_tlsc,w.n_tz,w.n_sg,w.i_wyfs,w.v_tw,w.i_hxpl,w.i_ml,w.i_mshr,w.i_hr,w.i_msqt,w.v_msqt,w.n_qlz ,w.n_qly ,w.i_ql,w.v_qlqt,w.i_yzc ,w.v_yyc ,w.i_szzc,w.v_szyc,w.i_ezc ,w.v_eyc ,w.i_jbwbk ,w.v_jbybk ,w.i_bzc ,w.v_byc ,w.i_pfzc,w.i_pfsz,w.i_pfml,w.i_pfqt,w.i_kqzc,w.v_kqyc,w.i_gmzc,w.v_gmyc,w.i_xfzc,w.v_xfyc,w.i_wszqzc,w.v_wszqyc,w.i_fbzc,w.v_fbyc,w.i_jzzc,w.v_jzyc,w.i_qd,w.v_qdqt,w.i_sfzz,w.v_zzyy,w.v_zzjg,w.i_wyzd,w.i_mrwy,w.i_hlzd,w.i_yfzd,w.v_xcsfdd,w.dt_xcsfrq ,w.c_sfys,w.c_czybh ,w.v_bz,w.dt_jlrq ,w.v_zhxgr ,w.dt_zhxgrq ,w.i_xgbz,w.i_jlbz,w.i_csbz,w.dep_name,w.i_upload,w.dt_upload ,w.dt_create ,w.i_apgar ,w.i_jbsc,w.v_jbqt,w.n_mqtz,w.i_ot,w.n_cnl ,w.i_cncs,w.i_db,w.i_dbcs,w.i_hdbw,w.i_zd,w.i_fyzd,w.i_yfsh,w.i_kqbj,w.i_bb,w.v_zdqt,w.i_zdqt,w.v_xbyc,w.i_xbzc from Sqgl_Xsejtfsb w,SQGL_JTCYJBXX x WHERE w.c_grbh=x.c_grbh and x.i_zt=1 and w.c_grbh=?   ";
		try {
			Query query2 = this.entityManager.createNativeQuery(sql);
			query2.setParameter(1,CGrbh);
			List<Object[]> lists = query2.getResultList();
			String ypcslist=null;
			if(lists!=null && lists.size()>0){
			String []arry={"depId","CId","CBh","CGrbh","dtSfrq","VXm","IXb","dtCsrq","VZjhm","VJtzz","VFxm","VFzy","VFdh","dtFcsrq","VMxm","VMzy","VMdh","dtMcsrq","ICsyz","IRcjb","VRcqt","VZcjg","ISc","ITx","ICq","IPg","ISdt","ITw","ICsqt","VCsqt","IZx","IZxcd","IJx","VJxqk","ITlsc","NTz","NSg","IWyfs","VTw","IHxpl","IMl","IMshr","IHr","IMsqt","VMsqt","NQlz","NQly","IQl","VQlqt","IYzc","VYyc","ISzzc","VSzyc","IEzc","VEyc","IJbwbk","VJbybk","IBzc","VByc","IPfzc","IPfsz","IPfml","IPfqt","IKqzc","VKqyc","IGmzc","VGmyc","IXfzc","VXfyc","IWszqzc","VWszqyc","IFbzc","VFbyc","IJzzc","VJzyc","IQd","VQdqt","ISfzz","VZzyy","VZzjg","IWyzd","IMrwy","IHlzd","IYfzd","VXcsfdd","dtXcsfrq","CSfys","CCzybh","VBz","dtJlrq","VZhxgr","dtZhxgrq","IXgbz","IJlbz","ICsbz","depName","IUpload","dtUpload","dtCreate","IApgar","IJbsc","VJbqt","NMqtz","IOt","NCnl","ICncs","IDb","IDbcs","IHdbw","IZd","IFyzd","IYfsh","IKqbj","IBb","VZdqt","IZdqt","VXbyc","IXbzc"};
			ypcslist= CommonUtil.ArrayToMapJson(arry, lists);
			entityManager.close();
			return ypcslist;
			}else{
				return CommonUtil.CodeMessageF(0, "暂无此项或者已注销");
			}
			} catch (Exception e) {
				e.printStackTrace();
				return CommonUtil.CodeMessageF(-1, "系统异常，请稍后重试");
			}
		
	}
	/**
	 * 获取家庭重点人群成员，2018年4月19日10:26:10
	 * @param request
	 * @param response
	 * @throws Exception
	 * @author lpf
	 */
	@Override
	public String GetFamilyKeyCrowd(HttpServletRequest request) {
		String json = CommonUtil.readJSONString(request); 
		JSONObject jsonObject = JSONObject.fromObject(json);
		String CJth=jsonObject.getString("CJth");
		String TableName=jsonObject.getString("TableName");
		String dtSfrq=jsonObject.getString("dtSfrq");
		String sql ="select w.v_xm,x.v_zjhm,x.i_xb,x.c_grbh,w."+dtSfrq+",0  from  "+TableName+"  w,SQGL_JTCYJBXX x WHERE w.c_grbh=x.c_grbh and x.i_zt=1  and x.C_JTH=?";
		if("SQGL_ETJKJCYL".equals(TableName.trim().toUpperCase())){
			sql ="select w.v_id,x.v_xm,x.v_zjhm,x.i_xb,x.c_grbh,w."+dtSfrq+",w.I_NL  from  "+TableName+"  w,SQGL_JTCYJBXX x WHERE w.c_grbh=x.c_grbh and x.i_zt=1  and x.C_JTH=?";
		}else if("SQGL_CQSFJL".equals(TableName.trim().toUpperCase())){
			sql ="select w.v_id,x.v_xm,x.v_zjhm,x.i_xb,x.c_grbh,w."+dtSfrq+",w.I_sfcs  from  "+TableName+"  w,SQGL_JTCYJBXX x WHERE w.c_grbh=x.c_grbh and x.i_zt=1  and x.C_JTH=?";
		}else if("SQGL_YCF_CHSFJL".equals(TableName.trim().toUpperCase())){
			sql ="select w.v_id,x.v_xm,x.v_zjhm,x.i_xb,x.c_grbh,w."+dtSfrq+",w.I_sfts  from  "+TableName+"  w,SQGL_JTCYJBXX x WHERE w.c_grbh=x.c_grbh and x.i_zt=1  and x.C_JTH=?";
		}else if("SQGL_JTCYLRZXBSFJL".equals(TableName.trim().toUpperCase())||"SQGL_JTCYGXYZXBSFJL".equals(TableName.trim().toUpperCase())
				||"SQGL_JTCYTNBZXBSFJL".equals(TableName.trim().toUpperCase())||"SQGL_JTCYJSBZXBSFJL".equals(TableName.trim().toUpperCase())
				||"SQGL_FJHHZSFJLB".equals(TableName.trim().toUpperCase())){
			sql ="select w.v_id,x.v_xm,x.v_zjhm,x.i_xb,x.c_grbh,w."+dtSfrq+",0  from  "+TableName+"  w,SQGL_JTCYJBXX x WHERE w.c_grbh=x.c_grbh and x.i_zt=1  and x.C_JTH=?";
		}
		try {
			Query query = this.entityManager.createNativeQuery(sql);
			query.setParameter(1,CJth);
			List<Object[]> lists = query.getResultList();
			String ypcslist=null;
			if(lists!=null && lists.size()>0){
				//String []arry={"VXm","VZjhm","IXb","CGrbh","dtSfrq","Isl"};
				if("SQGL_ETJKJCYL".equals(TableName.trim().toUpperCase())||"SQGL_JTCYLRZXBSFJL".equals(TableName.trim().toUpperCase())||"SQGL_JTCYGXYZXBSFJL".equals(TableName.trim().toUpperCase())
						||"SQGL_JTCYTNBZXBSFJL".equals(TableName.trim().toUpperCase())||"SQGL_JTCYJSBZXBSFJL".equals(TableName.trim().toUpperCase())
						||"SQGL_FJHHZSFJLB".equals(TableName.trim().toUpperCase())||"SQGL_ETJKJCYL".equals(TableName.trim().toUpperCase())||"SQGL_CQSFJL".equals(TableName.trim().toUpperCase())
						||"SQGL_YCF_CHSFJL".equals(TableName.trim().toUpperCase())){
					String []arry={"VId","VXm","VZjhm","IXb","CGrbh","dtSfrq","Isl"};
					ypcslist= CommonUtil.ArrayToMapJson(arry, lists);
				}else{
					String []arry={"VXm","VZjhm","IXb","CGrbh","dtSfrq","Isl"};
					ypcslist= CommonUtil.ArrayToMapJson(arry, lists);
				}
			entityManager.close();
			return ypcslist;
			}else{
				return CommonUtil.CodeMessageF(0, "此项暂无人员");
			}
			} catch (Exception e) {
				e.printStackTrace();
				return CommonUtil.CodeMessageF(-1, "系统异常，请稍后重试");
			}
	}
	/**
	 * 获取家庭成员孕产妇产前随访，2018年4月19日10:26:10
	 * @param request
	 * @param response
	 * @throws Exception
	 * @author lpf
	 */
	@Override
	public String GetFamilyAntenatal(HttpServletRequest request) {
		String json = CommonUtil.readJSONString(request); 
		JSONObject jsonObject = JSONObject.fromObject(json);
		String VId=jsonObject.getString("VId");
		String sql="SELECT   w.DEP_ID,w.V_ID,w.C_ID,w.C_GRBH,w.I_SFCS,w.DT_SFRQ,w.I_YZ,w.V_ZS,w.V_ZFXM,w.I_ZFNL,w.V_ZFDH,w.I_YC,w.I_CC,w.DT_MCYJ,w.DT_YCQ,w.I_JWS,w.I_XZB,w.I_SZJB,w.I_GZJB,w.I_GXY,w.I_PX,w.I_TNB,w.I_JWSQT,w.V_JWSQT,w.I_YCJB,w.I_JSJBS,w.I_JZSQT,w.V_JZSQT,w.I_FKSF,w.V_FKSF,w.I_LC,w.I_ST,w.I_SC,w.I_XSR,w.N_SG,w.N_TZ,w.I_XYG,w.I_XYD,w.I_TZXZ,w.V_TZXZ,w.I_TZFB,w.V_TZFB,w.I_GDGD,w.I_FW,w.I_TXL,w.I_WYZC,w.V_WYYC,w.I_YDZC,w.V_YDYC,w.I_GJZC,w.V_GJYC,w.I_ZGZC,w.V_ZGZC,w.I_FJZC,w.V_FJYC,w.V_XHDB,w.V_BXB,w.V_XXB,w.V_XCG,w.V_NDB,w.V_NT,w.V_NTT,w.V_NTX,w.V_NCG,w.V_XQGB,w.V_XQGC,w.V_BDB,w.V_ZDHS,w.V_JHDHS,w.V_XQJG,w.V_XNST,w.V_XJND,w.V_XNND,w.I_YDWJYC,w.I_DC,w.I_MJ,w.V_FMW,w.I_MDXQ,w.I_HIV,w.V_BC,w.V_XTSC,w.I_ZTPG,w.V_ZTPG,w.I_ZD,w.I_ZZYW,w.V_ZZYY,w.V_ZZJG,w.DT_XCSFRQ,w.V_SFYS,w.V_BZ,w.C_CZYBH,w.DT_JLRQ,w.V_ZHXGR,w.DT_ZHXGRQ,w.I_XGBZ,w.I_JLBZ,w.I_CSBZ,w.I_GRWS,w.I_SS,w.I_XL,w.I_YD,w.I_ZWJH,w.I_MRWY,w.I_FMZB,w.DEP_NAME,w.I_TZZS1,w.I_TZZS2,w.I_UPLOAD,w.DT_UPLOAD,w.DT_CREATE,w.V_XM,w.I_XB,w.V_ZJHM,w.DT_CSRQ,w.V_YKTBH,w.V_BZ1,w.V_BZ2,w.V_BZ3,w.I_GRS,w.V_GRSQT,w.V_XXABO,w.V_XXRH,w.I_YDQJD,w.V_YGBMKY,w.V_YGBMKT,w.V_YGEKY,w.V_YGEKT,w.V_YGHXKT,w.I_BJZD,w.V_BJZDQT,w.I_HISTO,w.I_HYCS,w.V_BRDH,w.I_TXS,w.I_TXL2,w.I_TXL3,w.I_TXL4,w.I_RGLC,w.I_CSQXE,w.V_TW,w.V_YFNL,w.I_YDFMCS,w.I_PGCCS,w.V_FZJC,w.I_SHFS,w.I_YY,w.V_ZDQT,w.I_ZDQT,w.I_JSJMJ,w.V_FZJCDYC,nvl(w.I_PJZT,1),w.I_SFLX,w.I_YSTQJH,w.I_YSTD,w.I_PJFS,w.V_PJNR,w.DT_PJSJ,w.C_PJRGRBH,w.C_USERBH  from Sqgl_Cqsfjl w,SQGL_JTCYJBXX x WHERE w.c_grbh=x.c_grbh and x.i_zt=1 and w.V_Id=?   ";
		try {
			Query query2 = this.entityManager.createNativeQuery(sql);
			query2.setParameter(1,VId);
			List<Object[]> lists = query2.getResultList();
			String ypcslist=null;
			if(lists!=null && lists.size()>0){
			String []arry={"depId","VId","CId","CGrbh","ISfcs","dtSfrq","IYz","VZs","VZfxm","IZfnl","VZfdh","IYc","ICc","dtMcyj","dtYcq","IJws","IXzb","ISzjb","IGzjb","IGxy","IPx","ITnb","IJwsqt","VJwsqt","IYcjb","IJsjbs","IJzsqt","VJzsqt","IFksf","VFksf","ILc","ISt","ISc","IXsr","NSg","NTz","IXyg","IXyd","ITzxz","VTzxz","ITzfb","VTzfb","IGdgd","IFw","ITxl","IWyzc","VWyyc","IYdzc","VYdyc","IGjzc","VGjyc","IZgzc","VZgzc","IFjzc","VFjyc","VXhdb","VBxb","VXxb","VXcg","VNdb","VNt","VNtt","VNtx","VNcg","VXqgb","VXqgc","VBdb","VZdhs","VJhdhs","VXqjg","VXnst","VXjnd","VXnnd","IYdwjyc","IDc","IMj","VFmw","IMdxq","IHiv","VBc","VXtsc","IZtpg","VZtpg","IZd","IZzyw","VZzyy","VZzjg","dtXcsfrq","VSfys","VBz","CCzybh","dtJlrq","VZhxgr","dtZhxgrq","IXgbz","IJlbz","ICsbz","IGrws","ISs","IXl","IYd","IZwjh","IMrwy","IFmzb","depName","ITzzs1","ITzzs2","IUpload","dtUpload","dtCreate","VXm","IXb","VZjhm","dtCsrq","VYktbh","VBz1","VBz2","VBz3","IGrs","VGrsqt","VXxabo","VXxrh","IYdqjd","VYgbmky","VYgbmkt","VYgeky","VYgekt","VYghxkt","IBjzd","VBjzdqt","IHisto","IHycs","VBrdh","ITxs","ITxl2","ITxl3","ITxl4","IRglc","ICsqxe","VTw","VYfnl","IYdfmcs","IPgccs","VFzjc","IShfs","IYy","VZdqt","IZdqt","IJsjmj","VFzjcdyc","IPjzt","ISflx","IYstqjh","IYstd","IPjfs","VPjnr","dtPjsj","CPjrgrbh","CUserbh"};
			ypcslist= CommonUtil.ArrayToMapJson(arry, lists);
			entityManager.close();
			return ypcslist;
			}else{
				return CommonUtil.CodeMessageF(0, "暂无此项或者已注销");
			}
			} catch (Exception e) {
				e.printStackTrace();
				return CommonUtil.CodeMessageF(-1, "系统异常，请稍后重试");
			}
	}
	/**
	 * 获取家庭成员孕产妇产后随访，2018年4月19日10:26:10
	 * @param request
	 * @param response
	 * @throws Exception
	 * @author lpf
	 */
	@Override
	public String GetFamilyPostpartum(HttpServletRequest request) {
		String json = CommonUtil.readJSONString(request); 
		JSONObject jsonObject = JSONObject.fromObject(json);
		String VId=jsonObject.getString("VId");
		String sql="SELECT  w.DEP_ID,w.V_ID,w.C_ID,w.C_GRBH,w.I_SFTS,w.DT_SFRQ,w.V_JKQK,w.V_XLQK,w.N_TW,w.I_XYG,w.I_XYD,w.I_RFYC,w.V_RFYC,w.I_ELYC,w.V_ELYC,w.I_ZGYC,w.V_ZGYC,w.I_SKYC,w.V_SKYC,w.V_QT,w.I_FL,w.V_FLWHF,w.I_GRWS,w.I_XL,w.I_YY,w.I_MRWY,w.I_XSEHL,w.I_XBJ,w.I_BY,w.I_MRWY6,w.I_QTZD,w.V_QTZD,w.I_CL,w.V_ZZYY,w.V_ZZJG,w.DT_NEXT,w.V_SFYS,w.V_BZ,w.C_CZYBH,w.DT_JLRQ,w.V_ZHXGR,w.DT_ZHXGRQ,w.I_XGBZ,w.I_JLBZ,w.I_CSBZ,w.DEP_NAME,w.I_UPLOAD,w.DT_UPLOAD,w.DT_CREATE,w.V_XM,w.I_XB,w.V_ZJHM,w.DT_CSRQ,w.V_YKTBH,w.V_BZ1,w.V_BZ2,w.V_BZ3,w.I_HISTO,w.DT_FMRQ,w.DT_CYRQ,w.I_XLBJ,w.I_XBJBY,w.I_YEWY,w.I_CFYY,w.V_ZDQT,w.I_ZDQT,nvl(w.I_PJZT,1),w.I_SFLX,w.I_YSTQJH,w.I_YSTD,w.I_PJFS,w.V_PJNR,w.DT_PJSJ,w.C_PJRGRBH,w.C_USERBH  from SQGL_YCF_CHSFJL w,SQGL_JTCYJBXX x WHERE w.c_grbh=x.c_grbh and x.i_zt=1 and w.V_Id=?   ";
		try {
			Query query2 = this.entityManager.createNativeQuery(sql);
			query2.setParameter(1,VId);
			List<Object[]> lists = query2.getResultList();
			String ypcslist=null;
			if(lists!=null && lists.size()>0){
			String []arry={"depId","VId","CId","CGrbh","ISfts","dtSfrq","VJkqk","VXlqk","NTw","IXyg","IXyd","IRfyc","VRfyc","IElyc","VElyc","IZgyc","VZgyc","ISkyc","VSkyc","VQt","IFl","VFlwhf","IGrws","IXl","IYy","IMrwy","IXsehl","IXbj","IBy","IMrwy6","IQtzd","VQtzd","ICl","VZzyy","VZzjg","dtNext","VSfys","VBz","CCzybh","dtJlrq","VZhxgr","dtZhxgrq","IXgbz","IJlbz","ICsbz","depName","IUpload","dtUpload","dtCreate","VXm","IXb","VZjhm","dtCsrq","VYktbh","VBz1","VBz2","VBz3","IHisto","dtFmrq","dtCyrq","IXlbj","IXbjby","IYewy","ICfyy","VZdqt","IZdqt","IPjzt","ISflx","IYstqjh","IYstd","IPjfs","VPjnr","dtPjsj","CPjrgrbh","CUserbh"};
			ypcslist= CommonUtil.ArrayToMapJson(arry, lists);
			entityManager.close();
			return ypcslist;
			}else{
				return CommonUtil.CodeMessageF(0, "暂无此项或者已注销");
			}
			} catch (Exception e) {
				e.printStackTrace();
				return CommonUtil.CodeMessageF(-1, "系统异常，请稍后重试");
			}
	}
	/**
	 * 获取家庭成员65岁以上老人专项表，2018年4月19日10:26:10
	 * @param request
	 * @param response
	 * @throws Exception
	 * @author lpf
	 */
	@Override
	public String GetFamilyElderly(HttpServletRequest request) {
		String json = CommonUtil.readJSONString(request); 
		JSONObject jsonObject = JSONObject.fromObject(json);
		String CGrbh=jsonObject.getString("CGrbh");
		String sql="SELECT  w.C_ID,w.C_GRBH,w.I_SHSYBR,w.I_SHSYPO,w.I_SHSYZN,w.I_SHSYQQ,w.I_SHSYZF,w.I_SHSYJT,w.I_SHSYQT,w.I_SHNL1,w.I_SHNL2,w.I_SHNL3,w.I_SHNL4,w.I_SHNL5,w.I_SHNL6,w.I_SHNL7,w.I_SHNL8,w.I_SHNL9,w.I_SHNL10,w.I_SHNL11,w.I_SHNL12,w.I_SHNL13,w.I_SHNL14,w.I_SHNLPDJG,w.I_HLZGBX,w.I_HLZGPO,w.I_HLZGZN,w.I_HLZGQY,w.I_HLZGBM,w.I_HLZGYLJG,w.I_HLZGLJ,w.I_HLZGQT,w.V_HLZGQT,w.I_SLZS,w.I_YCCQ,w.I_SYST,w.I_SYSC,w.I_CCSS,w.I_JJSS,w.I_FKJC,w.I_LAFKJB,w.V_LBFKJB,w.I_JBZZ1,w.I_JBZZ2,w.I_JBZZ3,w.I_JBZZ4,w.V_QTZZ,w.V_BDCZ,w.V_FHZ,w.DT_QMRQ,w.DT_DCRQ,w.DT_FHRQ,w.DT_JLSJ,w.C_CZYBH,w.V_BZ,w.DEP_NAME,w.I_UPLOAD,w.DT_UPLOAD,w.DT_CREATE,w.V_XM,w.I_XB,w.V_ZJHM,w.DT_CSRQ,w.V_YKTBH,w.V_BZ1,w.V_BZ2,w.V_BZ3,w.I_CSBZ,w.V_TJBH,w.I_ZT,w.V_Dcz  from Sqgl_Jtcylrzxb w,SQGL_JTCYJBXX x WHERE w.c_grbh=x.c_grbh and x.i_zt=1 and w.c_grbh=?   ";
		try {
			Query query2 = this.entityManager.createNativeQuery(sql);
			query2.setParameter(1,CGrbh);
			List<Object[]> lists = query2.getResultList();
			String ypcslist=null;
			if(lists!=null && lists.size()>0){
			String []arry={"CId","CGrbh","IShsybr","IShsypo","IShsyzn","IShsyqq","IShsyzf","IShsyjt","IShsyqt","IShnl1","IShnl2","IShnl3","IShnl4","IShnl5","IShnl6","IShnl7","IShnl8","IShnl9","IShnl10","IShnl11","IShnl12","IShnl13","IShnl14","IShnlpdjg","IHlzgbx","IHlzgpo","IHlzgzn","IHlzgqy","IHlzgbm","IHlzgyljg","IHlzglj","IHlzgqt","VHlzgqt","ISlzs","IYccq","ISyst","ISysc","ICcss","IJjss","IFkjc","ILafkjb","VLbfkjb","IJbzz1","IJbzz2","IJbzz3","IJbzz4","VQtzz","VBdcz","VFhz","dtQmrq","dtDcrq","dtFhrq","dtJlsj","CCzybh","VBz","depName","IUpload","dtUpload","dtCreate","VXm","IXb","VZjhm","dtCsrq","VYktbh","VBz1","VBz2","VBz3","ICsbz","VTjbh","IZt","VDcz"};
			ypcslist= CommonUtil.ArrayToMapJson(arry, lists);
			entityManager.close();
			return ypcslist;
			}else{
				return CommonUtil.CodeMessageF(0, "暂无此项或者已注销");
			}
			} catch (Exception e) {
				e.printStackTrace();
				return CommonUtil.CodeMessageF(-1, "系统异常，请稍后重试");
			}
	}
	/**
	 * 获取家庭成员儿童随访，2018年4月19日10:26:10
	 * @param request
	 * @param response
	 * @throws Exception
	 * @author lpf
	 */
	@Override
	public String GetFamilyChildrenVisit(HttpServletRequest request) {
		String json = CommonUtil.readJSONString(request); 
		JSONObject jsonObject = JSONObject.fromObject(json);
		String VID=jsonObject.getString("VId");
		String sql="SELECT  w.DEP_ID,w.V_ID,w.C_ID,w.C_GRBH,w.I_LX,w.V_XM,w.DT_SFRQ,w.N_TZ,w.I_TZ,w.N_SC,w.I_SC,w.I_TGPJ,w.I_MSLX,w.V_MSQT,w.I_PF,w.V_PFYC,w.I_QLBH,w.I_WBH1,w.I_WBH2,w.I_YZC,w.V_YYC,w.I_EZC,w.V_EYC,w.I_CYS,w.I_XFZC,w.V_XFYC,w.I_GPZC,w.V_GPYC,w.I_FB,w.V_FBYC,w.I_JB,w.V_JBYC,w.I_SZ,w.V_SZYC,w.I_BT,w.V_BTYC,w.I_GLBTZ,w.I_GMJSZQ,w.V_GMJSZQ,w.I_XHDBZ,w.I_HDSJ,w.I_WSSL,w.I_PGXW,w.I_PGSJ,w.V_PGSJ,w.V_QT,w.I_WHBQK,w.I_FY,w.I_FYCS,w.I_MZ,w.I_PX,w.I_YYBL,w.I_GLB,w.I_FX,w.I_FXCS,w.I_WS,w.I_WSCS,w.V_QTJB,w.I_YWGM,w.V_YGM,w.I_ZZQK,w.V_ZZYY,w.V_ZZJG,w.I_ZD,w.V_QTZD,w.DT_XCSFRQ,w.V_SFYS,w.DT_JLRQ,w.C_CZYBH,w.V_BZ,w.V_ZHXGR,w.DT_ZHXGRQ,w.I_XGBZ,w.I_JLBZ,w.I_CSBZ,w.I_GLBZT,w.I_MRWY,w.I_JBYF,w.I_YWSH,w.I_SSZD,w.I_NL,w.DEP_NAME,w.I_UPLOAD,w.DT_UPLOAD,w.I_GLB2,w.DT_CREATE,w.I_HISTO,w.N_TOUW,w.I_JBWBK,w.V_JBYBK,w.I_TL,w.V_SLZ,w.V_SLY,w.I_QCS,w.I_KQ,w.V_KQYC,w.I_QTJB,w.I_FYPG,w.I_KXWY,w.I_SZFY,w.I_KQBJ,w.I_MR,w.N_PFN,w.I_FS,w.I_XLXW,w.V_XLXW,w.I_ZYJK,w.V_ZYJK,w.I_BB,w.I_XB,w.V_ZJHM,w.DT_CSRQ,w.V_JTZZ,w.V_ETID,w.V_QZJGH,w.V_QZJGMC,w.V_JBWBK_Y,w.V_YZC_YC,w.V_PF_YC,w.V_EZC_YC,w.V_KQ_YC,w.V_XFZC_YC,w.V_FB_YC,w.V_JB_YC,w.V_SZ_YC,w.V_GMJSZQ_YC,w.V_BT_YC,w.I_GLBZZ,nvl(w.I_PJZT,1),w.I_SFLX,w.I_YSTQJH,w.I_YSTD,w.I_PJFS,w.V_PJNR,w.DT_PJSJ,w.C_PJRGRBH,w.C_USERBH  from Sqgl_Etjkjcyl w,SQGL_JTCYJBXX x WHERE w.c_grbh=x.c_grbh and x.i_zt=1 and w.v_id=?   ";
		try {
			Query query2 = this.entityManager.createNativeQuery(sql);
			query2.setParameter(1,VID);
			List<Object[]> lists = query2.getResultList();
			String ypcslist=null;
			if(lists!=null && lists.size()>0){
			String []arry={"depId","VId","CId","CGrbh","ILx","VXm","dtSfrq","NTz","ITz","NSc","ISc","ITgpj","IMslx","VMsqt","IPf","VPfyc","IQlbh","IWbh1","IWbh2","IYzc","VYyc","IEzc","VEyc","ICys","IXfzc","VXfyc","IGpzc","VGpyc","IFb","VFbyc","IJb","VJbyc","ISz","VSzyc","IBt","VBtyc","IGlbtz","IGmjszq","VGmjszq","IXhdbz","IHdsj","IWssl","IPgxw","IPgsj","VPgsj","VQt","IWhbqk","IFy","IFycs","IMz","IPx","IYybl","IGlb","IFx","IFxcs","IWs","IWscs","VQtjb","IYwgm","VYgm","IZzqk","VZzyy","VZzjg","IZd","VQtzd","dtXcsfrq","VSfys","dtJlrq","CCzybh","VBz","VZhxgr","dtZhxgrq","IXgbz","IJlbz","ICsbz","IGlbzt","IMrwy","IJbyf","IYwsh","ISszd","INl","depName","IUpload","dtUpload","IGlb2","dtCreate","IHisto","NTouw","IJbwbk","VJbybk","ITl","VSlz","VSly","IQcs","IKq","VKqyc","IQtjb","IFypg","IKxwy","ISzfy","IKqbj","IMr","NPfn","IFs","IXlxw","VXlxw","IZyjk","VZyjk","IBb","IXb","VZjhm","dtCsrq","VJtzz","VEtid","VQzjgh","VQzjgmc","VJbwbky","VYzcyc","VPfyc","VEzcyc","VKqyc","VXfzcyc","VFbyc","VJbyc","VSzyc","VGmjszqyc","VBtyc","IGlbzz","IPjzt","ISflx","IYstqjh","IYstd","IPjfs","VPjnr","dtPjsj","CPjrgrbh","CUserbh"};
			ypcslist= CommonUtil.ArrayToMapJson(arry, lists);
			entityManager.close();
			return ypcslist;
			}else{
				return CommonUtil.CodeMessageF(0, "暂无此项或者已注销");
			}
			} catch (Exception e) {
				e.printStackTrace();
				return CommonUtil.CodeMessageF(-1, "系统异常，请稍后重试");
			}
	}
	/**
	 * 获取家庭成员65岁以上老人随访表，2018年4月19日10:26:10
	 * @param request
	 * @param response
	 * @throws Exception
	 * @author lpf
	 */
	@Override
	public String GetFamilyElderlyVisit(HttpServletRequest request) {
		String json = CommonUtil.readJSONString(request); 
		JSONObject jsonObject = JSONObject.fromObject(json);
		String VId=jsonObject.getString("VId");
		String sql="SELECT w.DEP_ID,w.V_ID,w.C_ID,w.C_GRBH,w.DT_SFRQ,w.I_ZZ,w.V_XCXZZ,w.DT_CXSJ,w.V_YCXZZ,w.I_CXY,w.I_CXM,w.I_CXD,w.V_ZZJG,w.DT_ZZSJ,w.N_TZ,w.I_XY,w.I_XYMB,w.DT_JYSJ,w.I_YJ,w.I_YJMB,w.DT_JJSJ,w.I_YDCS,w.I_YDFZ,w.I_YDCSMB,w.I_YDFZMB,w.I_YS,w.V_XYD,w.V_XYG,w.N_FKXT,w.N_CHXT,w.I_XLTZ,w.I_ZYXW,w.V_SHJB,w.V_ZLQK,w.V_YYQK,w.I_SFMYD,w.V_DCQM,w.DT_JLSJ,w.DT_NEXT,w.V_SFYS,w.C_CZYBH,w.V_BZ,w.DEP_NAME,w.I_UPLOAD,w.DT_UPLOAD,w.DT_CREATE,w.V_XM,w.I_XB,w.V_ZJHM,w.DT_CSRQ,w.V_YKTBH,w.V_BZ1,w.V_BZ2,w.V_BZ3,w.I_HISTO,w.I_SHNL1,w.I_SHNL2,w.I_SHNL3,w.I_SHNL4,w.I_SHNL5,w.I_SHNLPDJG,w.V_TJBH,nvl(w.I_PJZT,1),w.I_SFLX,w.I_YSTQJH,w.I_YSTD,w.I_PJFS,w.V_PJNR,w.DT_PJSJ,w.C_PJRGRBH,w.C_USERBH  from Sqgl_Jtcylrzxbsfjl w,SQGL_JTCYJBXX x WHERE w.c_grbh=x.c_grbh and x.i_zt=1 and w.V_Id=?   ";
		try {
			Query query2 = this.entityManager.createNativeQuery(sql);
			query2.setParameter(1,VId);
			List<Object[]> lists = query2.getResultList();
			String ypcslist=null;
			if(lists!=null && lists.size()>0){
			String []arry={"depId","VId","CId","CGrbh","dtSfrq","IZz","VXcxzz","dtCxsj","VYcxzz","ICxy","ICxm","ICxd","VZzjg","dtZzsj","NTz","IXy","IXymb","dtJysj","IYj","IYjmb","dtJjsj","IYdcs","IYdfz","IYdcsmb","IYdfzmb","IYs","VXyd","VXyg","NFkxt","NChxt","IXltz","IZyxw","VShjb","VZlqk","VYyqk","ISfmyd","VDcqm","dtJlsj","dtNext","VSfys","CCzybh","VBz","depName","IUpload","dtUpload","dtCreate","VXm","IXb","VZjhm","dtCsrq","VYktbh","VBz1","VBz2","VBz3","IHisto","IShnl1","IShnl2","IShnl3","IShnl4","IShnl5","IShnlpdjg","VTjbh","IPjzt","ISflx","IYstqjh","IYstd","IPjfs","VPjnr","dtPjsj","CPjrgrbh","CUserbh"};
			ypcslist= CommonUtil.ArrayToMapJson(arry, lists);
			entityManager.close();
			return ypcslist;
			}else{
				return CommonUtil.CodeMessageF(0, "暂无此项或者已注销");
			}
			} catch (Exception e) {
				e.printStackTrace();
				return CommonUtil.CodeMessageF(-1, "系统异常，请稍后重试");
			}
	}
	@Override
	public String GetFamilyContractTeamQY(HttpServletRequest request) {
		String json = CommonUtil.readJSONString(request); 
		JSONObject jsonObject = JSONObject.fromObject(json);
		String CJth=jsonObject.getString("CJth");
		String sql="SELECT f.V_ID,f.DEP_ID,f.DEP_NAME,f.V_YLJGH,f.V_YLJGMC,f.V_YY,f.V_ZWSY,f.V_XZ,f.V_ZRQY,f.V_ZRQYRKS,f.C_CZYBH,f.DT_CREATE,f.V_CWSS,f.V_ZRYS1,f.V_LXDH1,f.V_ZRYS2,f.V_LXDH2,f.V_QJYY,f.V_ZRYS3,f.V_LXDH3,f.V_SJYLJG,f.V_ZRYS4,f.V_LXDH4,f.V_XZCY,f.V_TDMC,f.V_ZZXM,f.DEP_ZNAME,f.DEP_XNAME,f.V_YYDH,x.V_ID XV_ID,x.V_TDID XV_TDID,x.V_YSXM XV_YSXM,x.V_YSDH XV_YSDH,x.V_YLJGH XV_YLJGH,x.V_YLJGMC XV_YLJGMC,x.DEP_ID XDEP_ID,x.DEP_NAME XDEP_NAME,x.V_YLJGJB XV_YLJGJB,x.V_TDMC XV_TDMC,x.V_ZZXM XV_ZZXM,f.V_GZTP from Sqgl_Qyfwtdzrhf f,SQGL_XCYSQYFW w,SQGL_QYFWTDZRHFYSMX x where w.v_tdid=f.v_id and f.v_id=x.v_tdid and w.i_zt=0 and w.c_jth=?";
		try {
			Query query2 = this.entityManager.createNativeQuery(sql);
			query2.setParameter(1,CJth);
			List<Object[]> lists = query2.getResultList();
			String ypcslist=null;
			if(lists!=null && lists.size()>0){
			String[] arry={"VId","depId","depName","VYljgh","VYljgmc","VYy","VZwsy","VXz","VZrqy","VZrqyrks","CCzybh","dtCreate","VCwss","VZrys1","VLxdh1","VZrys2","VLxdh2","VQjyy","VZrys3","VLxdh3","VSjyljg","VZrys4","VLxdh4","VXzcy","VTdmc","VZzxm","depZname","depXname","VYydh","XVId","XVTdid","XVYsxm","XVYsdh","XVYljgh","XVYljgmc","XdepId","XdepName","XVYljgjb","XVTdmc","XVZzxm","VGztp"};
			ypcslist= CommonUtil.listToMapJson1(arry, lists,1);
			
			entityManager.close();
			return ypcslist;
			}else{
				return CommonUtil.CodeMessageF(0, "该成员暂无签约家庭或者已解约");
			}
				}catch (Exception e) {
				e.printStackTrace();
				return CommonUtil.CodeMessageF(-1, "系统异常，请稍后重试");
			}
	}
	/**
	 * 获取家庭成员高血压病人专项，2018年4月19日10:26:10
	 * @param request
	 * @param response
	 * @throws Exception
	 * @author lpf
	 */
	@Override
	public String GetFamilyHypertension(HttpServletRequest request) {
		String json = CommonUtil.readJSONString(request); 
		JSONObject jsonObject = JSONObject.fromObject(json);
		String CGrbh=jsonObject.getString("CGrbh");
		String sql="SELECT w.DEP_ID,w.C_ID,w.C_GRBH,w.I_GLJB,w.I_BSLX,w.I_XYG,w.I_XYD,w.I_JYYQK,w.I_JJYY,w.I_WJ,w.I_BLFY,w.I_FYBB,w.I_PYBB,w.I_BXZL,w.I_BYF,w.I_QT,w.V_QTYY,w.M_JYFY,w.I_NQX,w.I_NCX,w.I_NDZQX,w.I_XJGS,w.I_XJT,w.I_XGDM,w.I_XCX,w.I_STNB,w.I_SSJ,w.I_SCX,w.I_SSZ,w.I_GYFC,w.I_SFGXZ,w.I_ZDGCJC,w.I_ZDGCJCZ,w.I_SFZXSFH,w.I_ZXSFHJC,w.I_SFYDJC,w.I_SFSWMXZ,w.I_XTJC,w.I_XTJCZ,w.I_NDBJC,w.I_NDBJCZ,w.I_SFDMBK,w.I_DMBKZ,w.I_SFXXGJZS,w.V_BDCZ,w.V_DCZ,w.V_FHZ,w.DT_QMRQ,w.DT_DCRQ,w.DT_FHRQ,w.DT_JLSJ,w.C_CZYBH,w.V_BZ,w.DEP_NAME,w.I_UPLOAD,w.DT_UPLOAD,w.DT_CREATE,w.V_XM,w.I_XB,w.V_ZJHM,w.DT_CSRQ,w.V_YKTBH,w.V_BZ1,w.V_BZ2,w.V_BZ3,w.I_HISTO from Sqgl_Jtcygxyzxb w,SQGL_JTCYJBXX x WHERE w.c_grbh=x.c_grbh and x.i_zt=1 and w.c_grbh=?   ";
		try {
			Query query2 = this.entityManager.createNativeQuery(sql);
			query2.setParameter(1,CGrbh);
			List<Object[]> lists = query2.getResultList();
			String ypcslist=null;
			if(lists!=null && lists.size()>0){
			String []arry={"depId","CId","CGrbh","IGljb","IBslx","IXyg","IXyd","IJyyqk","IJjyy","IWj","IBlfy","IFybb","IPybb","IBxzl","IByf","IQt","VQtyy","MJyfy","INqx","INcx","INdzqx","IXjgs","IXjt","IXgdm","IXcx","IStnb","ISsj","IScx","ISsz","IGyfc","ISfgxz","IZdgcjc","IZdgcjcz","ISfzxsfh","IZxsfhjc","ISfydjc","ISfswmxz","IXtjc","IXtjcz","INdbjc","INdbjcz","ISfdmbk","IDmbkz","ISfxxgjzs","VBdcz","VDcz","VFhz","dtQmrq","dtDcrq","dtFhrq","dtJlsj","CCzybh","VBz","depName","IUpload","dtUpload","dtCreate","VXm","IXb","VZjhm","dtCsrq","VYktbh","VBz1","VBz2","VBz3","IHisto"};
			ypcslist= CommonUtil.ArrayToMapJson(arry, lists);
			entityManager.close();
			return ypcslist;
			}else{
				return CommonUtil.CodeMessageF(0, "暂无此项或者已注销");
			}
			} catch (Exception e) {
				e.printStackTrace();
				return CommonUtil.CodeMessageF(-1, "系统异常，请稍后重试");
			}
	}
	/**
	 * 获取家庭成员高血压病人随访记录，2018年4月19日10:26:10
	 * @param request
	 * @param response
	 * @throws Exception
	 * @author lpf
	 */
	@Override
	public String GetFamilyHypertensionVisit(HttpServletRequest request) {
		String json = CommonUtil.readJSONString(request); 
		JSONObject jsonObject = JSONObject.fromObject(json);
		String VId=jsonObject.getString("VId");
		String sql="SELECT w.DEP_ID,w.V_ID,w.C_ID,w.C_GRBH,w.I_SFCLXY,w.I_JGTS,w.I_CLXYG,w.I_CLXYD,w.I_BCXL,w.N_CLTZ,w.I_ZZTY,w.I_ZZTT,w.I_ZZFZ,w.I_ZZCH,w.I_ZZSL,w.I_ZZQT,w.V_QTZZ,w.I_SFFY,w.V_YPMC1,w.N_MCJL1,w.I_FYCS1,w.I_BLFY1,w.V_YPMC2,w.N_MCJL2,w.I_FYCS2,w.I_BLFY2,w.V_YPMC3,w.N_MCJL3,w.I_FYCS3,w.I_BLFY3,w.V_YPMC4,w.N_MCJL4,w.I_FYCS4,w.I_BLFY4,w.V_YPMC5,w.N_MCJL5,w.I_FYCS5,w.I_BLFY5,w.V_YPMC6,w.N_MCJL6,w.I_FYCS6,w.I_BLFY6,w.V_YPMC7,w.N_MCJL7,w.I_FYCS7,w.I_BLFY7,w.V_YPMC8,w.N_MCJL8,w.I_FYCS8,w.I_BLFY8,w.I_FYQKYJ,w.I_FYQKCJS,w.I_FYQKBY,w.I_GXYXY,w.I_GXYJY,w.I_GXYJJ,w.I_GXYSS,w.I_GXYTZ,w.I_GXYYD,w.I_GXYFS,w.I_GXYQT,w.V_GXYQT,w.DT_NEXT,w.V_BDCZ,w.V_DCZ,w.V_FHZ,w.DT_QMRQ,w.DT_DCRQ,w.DT_FHRQ,w.DT_JLSJ,w.C_CZYBH,w.V_BZ,w.I_SFFS,w.I_ZZ1,w.I_ZZ3,w.I_ZZ4,w.I_ZZ5,w.I_ZZ6,w.I_ZZ7,w.I_ZZ8,w.I_ZZ9,w.N_MBTZ,w.V_TZZS1,w.V_TZZS2,w.I_MBXL,w.V_QTTZ,w.I_XY,w.I_XYMB,w.I_YJ,w.I_YJMB,w.I_YDCS,w.I_YDFZ,w.I_YDCSMB,w.I_YDFZMB,w.I_SY,w.I_SYMB,w.I_XLTZ,w.I_ZYXW,w.V_JCJG,w.I_FYYCX,w.I_CCSFFL,w.V_YSXM,w.I_SFZZ,w.V_ZZYY,w.V_ZZJG,w.V_ZHXGR,w.DT_ZHXGRQ,w.I_XGBZ,w.I_JLBZ,w.I_CSBZ,w.DEP_NAME,w.I_UPLOAD,w.DT_UPLOAD,w.DT_CREATE,w.V_XM,w.I_XB,w.V_ZJHM,w.DT_CSRQ,w.V_YKTBH,w.V_BZ1,w.V_BZ2,w.V_BZ3,w.I_HISTO,w.V_SY ,nvl(w.I_PJZT,1),w.I_SFLX,w.I_YSTQJH,w.I_YSTD,w.I_PJFS,w.V_PJNR,w.DT_PJSJ,w.C_PJRGRBH,w.C_USERBH from Sqgl_Jtcygxyzxbsfjl w,SQGL_JTCYJBXX x WHERE w.c_grbh=x.c_grbh and x.i_zt=1 and w.V_Id=?   ";
		try {
			Query query2 = this.entityManager.createNativeQuery(sql);
			query2.setParameter(1,VId);
			List<Object[]> lists = query2.getResultList();
			String ypcslist=null;
			if(lists!=null && lists.size()>0){
			String []arry={"depId","VId","CId","CGrbh","ISfclxy","IJgts","IClxyg","IClxyd","IBcxl","NCltz","IZzty","IZztt","IZzfz","IZzch","IZzsl","IZzqt","VQtzz","ISffy","VYpmc1","NMcjl1","IFycs1","IBlfy1","VYpmc2","NMcjl2","IFycs2","IBlfy2","VYpmc3","NMcjl3","IFycs3","IBlfy3","VYpmc4","NMcjl4","IFycs4","IBlfy4","VYpmc5","NMcjl5","IFycs5","IBlfy5","VYpmc6","NMcjl6","IFycs6","IBlfy6","VYpmc7","NMcjl7","IFycs7","IBlfy7","VYpmc8","NMcjl8","IFycs8","IBlfy8","IFyqkyj","IFyqkcjs","IFyqkby","IGxyxy","IGxyjy","IGxyjj","IGxyss","IGxytz","IGxyyd","IGxyfs","IGxyqt","VGxyqt","dtNext","VBdcz","VDcz","VFhz","dtQmrq","dtDcrq","dtFhrq","dtJlsj","CCzybh","VBz","ISffs","IZz1","IZz3","IZz4","IZz5","IZz6","IZz7","IZz8","IZz9","NMbtz","VTzzs1","VTzzs2","IMbxl","VQttz","IXy","IXymb","IYj","IYjmb","IYdcs","IYdfz","IYdcsmb","IYdfzmb","ISy","ISymb","IXltz","IZyxw","VJcjg","IFyycx","ICcsffl","VYsxm","ISfzz","VZzyy","VZzjg","VZhxgr","dtZhxgrq","IXgbz","IJlbz","ICsbz","depName","IUpload","dtUpload","dtCreate","VXm","IXb","VZjhm","dtCsrq","VYktbh","VBz1","VBz2","VBz3","IHisto","VSy","IPjzt","ISflx","IYstqjh","IYstd","IPjfs","VPjnr","dtPjsj","CPjrgrbh","CUserbh" };
			ypcslist= CommonUtil.ArrayToMapJson(arry, lists);
			entityManager.close();
			return ypcslist;
			}else{
				return CommonUtil.CodeMessageF(0, "暂无此项或者已注销");
			}
			} catch (Exception e) {
				e.printStackTrace();
				return CommonUtil.CodeMessageF(-1, "系统异常，请稍后重试");
			}
	}
	/**
	 * 获取家庭成员精神病人专项，2018年4月19日10:26:10
	 * @param request
	 * @param response
	 * @throws Exception
	 * @author lpf
	 */
	@Override
	public String GetFamilyPsychosis(HttpServletRequest request) {
		String json = CommonUtil.readJSONString(request); 
		JSONObject jsonObject = JSONObject.fromObject(json);
		String CGrbh=jsonObject.getString("CGrbh");
		String sql="SELECT w.DEP_ID,w.C_ID,w.C_GRBH,w.V_JHR,w.V_GX,w.V_JHRZZ,w.V_JHRDH,w.V_CWH,w.DT_CCFBRQ,w.I_ZZHJ,w.I_ZZJL,w.I_ZZCY,w.I_ZZXN,w.I_ZZXW,w.I_ZZXF,w.I_ZZSR,w.I_ZZBG,w.I_ZZWZ,w.I_ZZZY,w.I_ZZGP,w.V_ZZQT,w.I_ZLMZ,w.I_ZLZYCS,w.V_ZJZD,w.V_QZYY,w.DT_QZRQ,w.I_ZLXG,w.I_YXCS1,w.I_YXCS2,w.I_YXCS3,w.I_YXCS4,w.I_YXCS5,w.I_YXCS6,w.I_GSZT,w.V_BDCZ,w.V_DCZ,w.V_FHZ,w.DT_QMRQ,w.DT_DCRQ,w.DT_FHRQ,w.DT_JLSJ,w.C_CZYBH,w.V_BZ,w.DEP_NAME,w.I_UPLOAD,w.DT_UPLOAD,w.DT_CREATE,w.V_XM,w.I_XB,w.V_ZJHM,w.DT_CSRQ,w.V_YKTBH,w.V_BZ1,w.V_BZ2,w.V_BZ3,w.I_CJGL,w.V_TYQZ,w.DT_QZSJ,w.DT_SCZLSJ,w.I_JJZK,w.V_YSYJ,w.I_HB,w.V_ZY,w.I_JYQK,w.I_YXCS7 from Sqgl_Jtcyjsbzxb w,SQGL_JTCYJBXX x WHERE w.c_grbh=x.c_grbh and x.i_zt=1 and w.c_grbh=?   ";
		try {
			Query query2 = this.entityManager.createNativeQuery(sql);
			query2.setParameter(1,CGrbh);
			List<Object[]> lists = query2.getResultList();
			String ypcslist=null;
			if(lists!=null && lists.size()>0){
			String []arry={"depId","CId","CGrbh","VJhr","VGx","VJhrzz","VJhrdh","VCwh","dtCcfbrq","IZzhj","IZzjl","IZzcy","IZzxn","IZzxw","IZzxf","IZzsr","IZzbg","IZzwz","IZzzy","IZzgp","VZzqt","IZlmz","IZlzycs","VZjzd","VQzyy","dtQzrq","IZlxg","IYxcs1","IYxcs2","IYxcs3","IYxcs4","IYxcs5","IYxcs6","IGszt","VBdcz","VDcz","VFhz","dtQmrq","dtDcrq","dtFhrq","dtJlsj","CCzybh","VBz","depName","IUpload","dtUpload","dtCreate","VXm","IXb","VZjhm","dtCsrq","VYktbh","VBz1","VBz2","VBz3","ICjgl","VTyqz","dtQzsj","dtSczlsj","IJjzk","VYsyj","IHb","VZy","IJyqk","IYxcs7"};
			ypcslist= CommonUtil.ArrayToMapJson(arry, lists);
			entityManager.close();
			return ypcslist;
			}else{
				return CommonUtil.CodeMessageF(0, "暂无此项或者已注销");
			}
			} catch (Exception e) {
				e.printStackTrace();
				return CommonUtil.CodeMessageF(-1, "系统异常，请稍后重试");
			}
	}
	/**
	 * 获取家庭成员精神病人随访记录，2018年4月19日10:26:10
	 * @param request
	 * @param response
	 * @throws Exception
	 * @author lpf
	 */
	@Override
	public String GetFamilyPsychosisVisit(HttpServletRequest request) {
		String json = CommonUtil.readJSONString(request); 
		JSONObject jsonObject = JSONObject.fromObject(json);
		String VId=jsonObject.getString("VId");
		String sql="SELECT w.DEP_ID,w.V_ID,w.C_ID,w.C_GRBH,w.I_ZZHJ,w.I_ZZJL,w.I_ZZCY,w.I_ZZXN,w.I_ZZXW,w.I_ZZXF,w.I_ZZSR,w.I_ZZBG,w.I_ZZWZ,w.I_ZZZY,w.I_ZZGP,w.V_ZZQT,w.I_ZZL,w.I_SMQK,w.I_YSQK,w.I_SHGR,w.I_SHJW,w.I_SHLD,w.I_SHXX,w.I_SHRJ,w.V_SYSJC,w.I_FYYCX,w.I_BLFY,w.V_BLFY,w.I_ZLXG,w.I_SFFL,w.I_SFZZ,w.V_ZZYY,w.V_ZZJG,w.V_YPMC1,w.I_FYCS1,w.N_MCJL1,w.V_YPMC2,w.I_FYCS2,w.N_MCJL2,w.V_YPMC3,w.I_FYCS3,w.N_MCJL3,w.I_KFCS1,w.I_KFCS2,w.I_KFCS3,w.I_KFCS4,w.I_KFCS5,w.V_KFCS,w.DT_NEXT,w.V_BDCZ,w.V_DCZ,w.V_FHZ,w.DT_QMRQ,w.DT_DCRQ,w.DT_FHRQ,w.DT_JLSJ,w.C_CZYBH,w.V_BZ,w.I_YXCS1,w.I_YXCS2,w.I_YXCS3,w.I_YXCS4,w.I_YXCS5,w.I_YXCS6,w.DEP_NAME,w.I_UPLOAD,w.DT_UPLOAD,w.DT_CREATE,w.V_XM,w.I_XB,w.V_ZJHM,w.DT_CSRQ,w.V_YKTBH,w.V_BZ1,w.V_BZ2,w.V_BZ3,w.I_WXX,w.I_GSZT,w.I_ZYQK,w.DT_MCCY,w.I_CSBZ,w.I_HISTO,w.I_SFFS,w.I_SFYY,w.DT_SWRQ,w.I_SWYY,w.I_SWJB0,w.I_SWJB1,w.I_SWJB2,w.I_SWJB3,w.I_SWJB4,w.I_SWJB5,w.I_SWJB6,w.I_SWJB7,w.V_YPMC4,w.I_FYCS4,w.N_MCJL4,w.V_YPMC5,w.I_FYCS5,w.N_MCJL5,w.V_YPMC6,w.I_FYCS6,w.N_MCJL6,w.I_YXCS7,nvl(w.I_PJZT,1),w.I_SFLX,w.I_YSTQJH,w.I_YSTD,w.I_PJFS,w.V_PJNR,w.DT_PJSJ,w.C_PJRGRBH,w.C_USERBH from Sqgl_Jtcyjsbzxbsfjl w,SQGL_JTCYJBXX x WHERE w.c_grbh=x.c_grbh and x.i_zt=1 and w.V_Id=?   ";
		try {
			Query query2 = this.entityManager.createNativeQuery(sql);
			query2.setParameter(1,VId);
			List<Object[]> lists = query2.getResultList();
			String ypcslist=null;
			if(lists!=null && lists.size()>0){
			String []arry={"depId","VId","CId","CGrbh","IZzhj","IZzjl","IZzcy","IZzxn","IZzxw","IZzxf","IZzsr","IZzbg","IZzwz","IZzzy","IZzgp","VZzqt","IZzl","ISmqk","IYsqk","IShgr","IShjw","IShld","IShxx","IShrj","VSysjc","IFyycx","IBlfy","VBlfy","IZlxg","ISffl","ISfzz","VZzyy","VZzjg","VYpmc1","IFycs1","NMcjl1","VYpmc2","IFycs2","NMcjl2","VYpmc3","IFycs3","NMcjl3","IKfcs1","IKfcs2","IKfcs3","IKfcs4","IKfcs5","VKfcs","dtNext","VBdcz","VDcz","VFhz","dtQmrq","dtDcrq","dtFhrq","dtJlsj","CCzybh","VBz","IYxcs1","IYxcs2","IYxcs3","IYxcs4","IYxcs5","IYxcs6","depName","IUpload","dtUpload","dtCreate","VXm","IXb","VZjhm","dtCsrq","VYktbh","VBz1","VBz2","VBz3","IWxx","IGszt","IZyqk","dtMccy","ICsbz","IHisto","ISffs","ISfyy","dtSwrq","ISwyy","ISwjb0","ISwjb1","ISwjb2","ISwjb3","ISwjb4","ISwjb5","ISwjb6","ISwjb7","VYpmc4","IFycs4","NMcjl4","VYpmc5","IFycs5","NMcjl5","VYpmc6","IFycs6","NMcjl6","IYxcs7","IPjzt","ISflx","IYstqjh","IYstd","IPjfs","VPjnr","dtPjsj","CPjrgrbh","CUserbh"};
			ypcslist= CommonUtil.ArrayToMapJson(arry, lists);
			entityManager.close();
			return ypcslist;
			}else{
				return CommonUtil.CodeMessageF(0, "暂无此项或者已注销");
			}
			} catch (Exception e) {
				e.printStackTrace();
				return CommonUtil.CodeMessageF(-1, "系统异常，请稍后重试");
			}
	}
	/**
	 * 获取家庭成员糖尿病病人专项，2018年4月19日10:26:10
	 * @param request
	 * @param response
	 * @throws Exception
	 * @author lpf
	 */
	@Override
	public String GetFamilyDiabetes(HttpServletRequest request) {
		String json = CommonUtil.readJSONString(request); 
		JSONObject jsonObject = JSONObject.fromObject(json);
		String CGrbh=jsonObject.getString("CGrbh");
		String sql="SELECT w.DEP_ID,w.C_ID,w.C_GRBH,w.I_TNBLX,w.N_XTSP,w.I_JTQK,w.M_JTFY,w.I_JJYY,w.I_WJ,w.I_PYBB,w.I_BYF,w.I_BLFY,w.I_BXYW,w.I_SYBB,w.I_QT,w.V_QTYY,w.I_BFJX,w.I_BFFJH,w.I_BFDMY,w.I_BFSJB,w.I_BFSWM,w.N_WZTZ,w.N_MQTZ,w.N_KFXT,w.N_FHXT,w.V_BDCZ,w.V_DCZ,w.V_FHZ,w.DT_QMRQ,w.DT_DCRQ,w.DT_FHRQ,w.DT_JLSJ,w.C_CZYBH,w.V_BZ,w.DEP_NAME,w.I_UPLOAD,w.DT_UPLOAD,w.DT_CREATE,w.V_XM,w.I_XB,w.V_ZJHM,w.DT_CSRQ,w.V_YKTBH,w.V_BZ1,w.V_BZ2,w.V_BZ3,w.I_HISTO from Sqgl_Jtcytnbzxb w,SQGL_JTCYJBXX x WHERE w.c_grbh=x.c_grbh and x.i_zt=1 and w.c_grbh=?   ";
		try {
			Query query2 = this.entityManager.createNativeQuery(sql);
			query2.setParameter(1,CGrbh);
			List<Object[]> lists = query2.getResultList();
			String ypcslist=null;
			if(lists!=null && lists.size()>0){
			String []arry={"depId","CId","CGrbh","ITnblx","NXtsp","IJtqk","MJtfy","IJjyy","IWj","IPybb","IByf","IBlfy","IBxyw","ISybb","IQt","VQtyy","IBfjx","IBffjh","IBfdmy","IBfsjb","IBfswm","NWztz","NMqtz","NKfxt","NFhxt","VBdcz","VDcz","VFhz","dtQmrq","dtDcrq","dtFhrq","dtJlsj","CCzybh","VBz","depName","IUpload","dtUpload","dtCreate","VXm","IXb","VZjhm","dtCsrq","VYktbh","VBz1","VBz2","VBz3","IHisto"};
			ypcslist= CommonUtil.ArrayToMapJson(arry, lists);
			entityManager.close();
			return ypcslist;
			}else{
				return CommonUtil.CodeMessageF(0, "暂无此项或者已注销");
			}
			} catch (Exception e) {
				e.printStackTrace();
				return CommonUtil.CodeMessageF(-1, "系统异常，请稍后重试");
			}
	}
	/**
	 * 获取家庭成员糖尿病病人随访记录，2018年4月19日10:26:10
	 * @param request
	 * @param response
	 * @throws Exception
	 * @author lpf
	 */
	@Override
	public String GetFamilyDiabetesVisit(HttpServletRequest request) {
		String json = CommonUtil.readJSONString(request); 
		JSONObject jsonObject = JSONObject.fromObject(json);
		String VId=jsonObject.getString("VId");
		String sql="SELECT w.DEP_ID,w.V_ID,w.C_ID,w.C_GRBH,w.DT_SFSJ,w.I_SFFS,w.V_NTZC,w.I_ZZ1,w.I_ZZ2,w.I_ZZ3,w.I_ZZ4,w.I_ZZ5,w.I_ZZ6,w.I_ZZ7,w.I_ZZ8,w.V_QTZZ,w.XYG,w.XYD,w.N_MQTZ,w.I_TZZS1,w.I_TZZS2,w.I_ZBDM,w.V_QTTZ,w.I_XY,w.I_XYMB,w.I_YJ,w.I_YJMB,w.I_YDCS,w.I_YDFZ,w.I_YDCSMB,w.I_YDFZMB,w.I_ZS,w.I_ZSMB,w.I_XLTZ,w.I_ZYXW,w.N_KFXT,w.N_XHDB,w.DT_JCRQ,w.V_JCJG,w.I_FYYCX,w.I_BLFY,w.V_BLFY,w.I_DXTFY,w.I_CCSFFL,w.V_YPMC1,w.I_FYCS1,w.N_MCJL1,w.V_YPMC2,w.I_FYCS2,w.N_MCJL2,w.V_YPMC3,w.I_FYCS3,w.N_MCJL3,w.V_YDS,w.V_YSXM,w.DT_XCSFSJ,w.V_BDCZ,w.V_DCZ,w.V_FHZ,w.DT_QMRQ,w.DT_DCRQ,w.DT_FHRQ,w.I_SFZZ,w.V_ZZYY,w.V_ZZJG,w.DT_JLSJ,w.C_CZYBH,w.V_BZ,w.DEP_NAME,w.I_UPLOAD,w.DT_UPLOAD,w.DT_CREATE,w.V_XM,w.I_XB,w.V_ZJHM,w.DT_CSRQ,w.V_YKTBH,w.V_BZ1,w.V_BZ2,w.V_BZ3,w.I_CSBZ,w.I_HISTO,w.I_ZBDMJR1,w.I_ZBDMJR2,w.I_ZBDMJR3,w.I_ZBDMXS1,w.I_ZBDMXS2,w.I_ZBDMXS3,w.I_ZBDMBF,nvl(w.I_PJZT,1),w.I_SFLX,w.I_YSTQJH,w.I_YSTD,w.I_PJFS,w.V_PJNR,w.DT_PJSJ,w.C_PJRGRBH,w.C_USERBH from Sqgl_Jtcytnbzxbsfjl w,SQGL_JTCYJBXX x WHERE w.c_grbh=x.c_grbh and x.i_zt=1 and w.V_Id=?   ";
		try {
			Query query2 = this.entityManager.createNativeQuery(sql);
			query2.setParameter(1,VId);
			List<Object[]> lists = query2.getResultList();
			String ypcslist=null;
			if(lists!=null && lists.size()>0){
			String []arry={"depId","VId","CId","CGrbh","dtSfsj","ISffs","VNtzc","IZz1","IZz2","IZz3","IZz4","IZz5","IZz6","IZz7","IZz8","VQtzz","XYg","XYd","NMqtz","ITzzs1","ITzzs2","IZbdm","VQttz","IXy","IXymb","IYj","IYjmb","IYdcs","IYdfz","IYdcsmb","IYdfzmb","IZs","IZsmb","IXltz","IZyxw","NKfxt","NXhdb","dtJcrq","VJcjg","IFyycx","IBlfy","VBlfy","IDxtfy","ICcsffl","VYpmc1","IFycs1","NMcjl1","VYpmc2","IFycs2","NMcjl2","VYpmc3","IFycs3","NMcjl3","VYds","VYsxm","dtXcsfsj","VBdcz","VDcz","VFhz","dtQmrq","dtDcrq","dtFhrq","ISfzz","VZzyy","VZzjg","dtJlsj","CCzybh","VBz","depName","IUpload","dtUpload","dtCreate","VXm","IXb","VZjhm","dtCsrq","VYktbh","VBz1","VBz2","VBz3","ICsbz","IHisto","IZbdmjr1","IZbdmjr2","IZbdmjr3","IZbdmxs1","IZbdmxs2","IZbdmxs3","IZbdmbf","IPjzt","ISflx","IYstqjh","IYstd","IPjfs","VPjnr","dtPjsj","CPjrgrbh","CUserbh"};
			ypcslist= CommonUtil.ArrayToMapJson(arry, lists);
			entityManager.close();
			return ypcslist;
			}else{
				return CommonUtil.CodeMessageF(0, "暂无此项或者已注销");
			}
			} catch (Exception e) {
				e.printStackTrace();
				return CommonUtil.CodeMessageF(-1, "系统异常，请稍后重试");
			}
	}
	/**
	 * 获取家庭成员肺结核病人专项，2018年4月19日10:26:10
	 * @param request
	 * @param response
	 * @throws Exception
	 * @author lpf
	 */
	@Override
	public String GetFamilyPhthisis(HttpServletRequest request) {
		// TODO Auto-generated method stub
		String json = CommonUtil.readJSONString(request); 
		JSONObject jsonObject = JSONObject.fromObject(json);
		String CGrbh=jsonObject.getString("CGrbh");
		String sql="SELECT w.DEP_ID,w.DEP_NAME,w.V_XM,w.C_GRBH,w.V_ZJHM,w.I_SFFS,w.I_HZLX,w.I_TJQK,w.I_NYQK,w.I_ZZ,w.I_ZZKS,w.I_ZZDH,w.I_ZZXT,w.I_ZZXTXS,w.I_ZZEX,w.I_ZZTT,w.I_ZZSJMH,w.I_ZZPZ,w.I_ZZEM,w.V_ZZQT,w.V_HLFA,w.I_YYYF,w.I_YPJX1,w.I_DDRY,w.I_JTHJ_DJ,w.I_JTHJ_TF,w.V_XY1,w.V_XY2,w.V_YJ1,w.V_YJ2,w.V_QYDD,w.DT_QYRQ,w.I_FYJLK,w.I_FYFS,w.I_ZLLC,w.I_BGLFY,w.I_BLFY,w.I_FZCT,w.I_WCFY,w.I_SHXG,w.I_JCZJC,w.DT_SFNEXT,w.V_YSQZ,w.DT_CREATE,w.C_CZYBH,w.V_BZ,w.I_HISTO,w.I_ZT,w.I_XB,w.DT_CSRQ,w.DT_JLSJ,w.I_ZZQT,w.I_YPJX2,w.I_YPJX3,w.I_YPJX4 from Sqgl_Fjhdycrhsf w,SQGL_JTCYJBXX x WHERE w.c_grbh=x.c_grbh and x.i_zt=1 and w.c_grbh=?   ";
		try {
			Query query2 = this.entityManager.createNativeQuery(sql);
			query2.setParameter(1,CGrbh);
			List<Object[]> lists = query2.getResultList();
			String ypcslist=null;
			if(lists!=null && lists.size()>0){
			String []arry={"depId","depName","VXm","CGrbh","VZjhm","ISffs","IHzlx","ITjqk","INyqk","IZz","IZzks","IZzdh","IZzxt","IZzxtxs","IZzex","IZztt","IZzsjmh","IZzpz","IZzem","VZzqt","VHlfa","IYyyf","IYpjx1","IDdry","IJthjdj","IJthjtf","VXy1","VXy2","VYj1","VYj2","VQydd","dtQyrq","IFyjlk","IFyfs","IZllc","IBglfy","IBlfy","IFzct","IWcfy","IShxg","IJczjc","dtSfnext","VYsqz","dtCreate","CCzybh","VBz","IHisto","IZt","IXb","dtCsrq","dtJlsj","IZzqt","IYpjx2","IYpjx3","IYpjx4"};
			ypcslist= CommonUtil.ArrayToMapJson(arry, lists);
			entityManager.close();
			return ypcslist;
			}else{
				return CommonUtil.CodeMessageF(0, "暂无此项或者已注销");
			}
			} catch (Exception e) {
				e.printStackTrace();
				return CommonUtil.CodeMessageF(-1, "系统异常，请稍后重试");
			}
	}
	/**
	 * 获取家庭成员肺结核病人随访记录，2018年4月19日10:26:10
	 * @param request
	 * @param response
	 * @throws Exception
	 * @author lpf
	 */
	@Override
	public String GetFamilyPhthisisVisit(HttpServletRequest request) {
		// TODO Auto-generated method stub
		String json = CommonUtil.readJSONString(request); 
		JSONObject jsonObject = JSONObject.fromObject(json);
		String VId=jsonObject.getString("VId");
		String sql="SELECT w.DEP_ID,w.V_ID,w.DEP_NAME,w.V_XM,w.C_GRBH,w.V_ZJHM,w.I_XB,w.DT_CSRQ,w.V_ZLYX,w.I_DDRY,w.I_SFFS,w.I_ZZ,w.I_ZZKS,w.I_ZZDH,w.I_ZZXT,w.I_ZZXTXS,w.I_ZZEX,w.I_ZZTT,w.I_ZZSJMH,w.I_ZZPZ,w.I_ZZEM,w.V_ZZQT,w.V_HLFA,w.I_YYYF,w.I_YPJX1,w.V_LFCS,w.V_XY1,w.V_XY2,w.V_YJ1,w.V_YJ2,w.I_YWBLFY,w.V_YWBLFY2,w.I_BFZ,w.V_BFZ2,w.V_ZZKB,w.V_ZZYY,w.V_ZZSFJG,w.V_CLYJ,w.DT_SFNEXT,w.V_SFYSQZ,w.DT_TZSJ,w.I_TZYY1,w.I_YFSCS,w.I_SJFSCS,w.I_YFYCS,w.I_SJFYCS,w.V_FYL,w.C_CZYBH,w.DT_CREATE,w.I_HISTO,w.V_BZ,w.I_ZT,w.DT_JLSJ,w.V_YSQZ,w.I_ZZQT,w.I_YPJX2,w.I_YPJX3,w.I_YPJX4,w.I_TZYY2,w.I_TZYY3,w.I_TZYY4,w.V_PGYS,nvl(w.I_PJZT,1),w.I_SFLX,w.I_YSTQJH,w.I_YSTD,w.I_PJFS,w.V_PJNR,w.DT_PJSJ,w.C_PJRGRBH,w.C_USERBH from Sqgl_Fjhhzsfjlb w,SQGL_JTCYJBXX x WHERE w.c_grbh=x.c_grbh and x.i_zt=1 and w.V_Id=?   ";
		try {
			Query query2 = this.entityManager.createNativeQuery(sql);
			query2.setParameter(1,VId);
			List<Object[]> lists = query2.getResultList();
			String ypcslist=null;
			if(lists!=null && lists.size()>0){
			String []arry={"depId","VId","depName","VXm","CGrbh","VZjhm","IXb","dtCsrq","VZlyx","IDdry","ISffs","IZz","IZzks","IZzdh","IZzxt","IZzxtxs","IZzex","IZztt","IZzsjmh","IZzpz","IZzem","VZzqt","VHlfa","IYyyf","IYpjx1","VLfcs","VXy1","VXy2","VYj1","VYj2","IYwblfy","VYwblfy2","IBfz","VBfz2","VZzkb","VZzyy","VZzsfjg","VClyj","dtSfnext","VSfysqz","dtTzsj","ITzyy1","IYfscs","ISjfscs","IYfycs","ISjfycs","VFyl","CCzybh","dtCreate","IHisto","VBz","IZt","dtJlsj","VYsqz","IZzqt","IYpjx2","IYpjx3","IYpjx4","ITzyy2","ITzyy3","ITzyy4","VPgys","IPjzt","ISflx","IYstqjh","IYstd","IPjfs","VPjnr","dtPjsj","CPjrgrbh","CUserbh"};
			ypcslist= CommonUtil.ArrayToMapJson(arry, lists);
			entityManager.close();
			return ypcslist;
			}else{
				return CommonUtil.CodeMessageF(0, "暂无此项或者已注销");
			}
			} catch (Exception e) {
				e.printStackTrace();
				return CommonUtil.CodeMessageF(-1, "系统异常，请稍后重试");
			}
	}
	/**
	 * 查询签约家庭服务记录详情
	 * @param request
	 * @param response
	 * @param params
	 * @throws Exception
	 */
	@Override
	public String queryQyjtfwjl(HttpServletRequest request) {
		// TODO Auto-generated method stub
		String json = CommonUtil.readJSONString(request); 
		JSONObject jsonObject = JSONObject.fromObject(json);
		String CJth=jsonObject.getString("CJth");
		String sql="SELECT V_ID,DEP_ID,DEP_NAME,C_JTH,V_YLJGH,V_YLJGMC,DT_FWSJ,V_HZXM,V_JTRENQ,V_JTRS,V_JTDH,V_JTZZ,I_FWZL1,I_FWZL2,I_FWZL3,I_FWZL4,I_FWZL5,I_FWZL6,I_FWZL7,I_FWZL8,I_FWZL9,I_FWZL10,I_FWZL11,V_PXJL,V_FWJL,V_FWXJ,V_FWPG,V_JSFWJM,V_FWYS,C_CZYBH,DT_CREATE,V_FWTP,V_FWFS,nvl(I_PJZT,1),I_SFLX,I_YSTQJH,I_YSTD,I_PJFS,V_PJNR,DT_PJSJ,C_PJRGRBH,C_USERBH,V_JSJMFWQM,V_FWYSQM from Sqgl_Qyjtfwjl  WHERE c_jth=?   ";
		try {
			Query query2 = this.entityManager.createNativeQuery(sql);
			query2.setParameter(1,CJth);
			List<Object[]> lists = query2.getResultList();
			String ypcslist=null;
			if(lists!=null && lists.size()>0){
			String []arry={"VId","depId","depName","CJth","VYljgh","VYljgmc","dtFwsj","VHzxm","VJtrenq","VJtrs","VJtdh","VJtzz","IFwzl1","IFwzl2","IFwzl3","IFwzl4","IFwzl5","IFwzl6","IFwzl7","IFwzl8","IFwzl9","IFwzl10","IFwzl11","VPxjl","VFwjl","VFwxj","VFwpg","VJsfwjm","VFwys","CCzybh","dtCreate","VFwtp","VFwfs","IPjzt","ISflx","IYstqjh","IYstd","IPjfs","VPjnr","dtPjsj","CPjrgrbh","CUserbh","VJsjmfwqm","VFwysqm"};
			ypcslist= CommonUtil.listToMapJson1(arry, lists,2);
			entityManager.close();
			return ypcslist;
			}else{
				return CommonUtil.CodeMessageF(0, "暂无此项或者已注销");
			}
			} catch (Exception e) {
				e.printStackTrace();
				return CommonUtil.CodeMessageF(-1, "系统异常，请稍后重试");
			}
	}
	/**
	 * 查询家庭未评价的服务记录
	 * @param request
	 * @param response
	 * @param params
	 * @throws Exception
	 */
	@Override
	public String saveEvaluationInfor(HttpServletRequest request) {
		// TODO Auto-generated method stub
		String json = CommonUtil.readJSONString(request); 
		JSONObject jsonObject = JSONObject.fromObject(json);
		String TableName=jsonObject.getString("TableName");
		int ISflx=jsonObject.getInt("ISflx");
		int IYstqjh=jsonObject.getInt("IYstqjh");
		int IYstd=jsonObject.getInt("IYstd");
		Double IPjfs=jsonObject.getDouble("IPjfs");
		String VPjnr=jsonObject.getString("VPjnr");
		String dtPjsj=jsonObject.getString("dtPjsj");
		String CPjrgrbh=jsonObject.getString("CPjrgrbh");
		String CUserbh=jsonObject.getString("CUserbh");
		String VId=jsonObject.getString("VId");
		try {
			String sql="update "+TableName+" set I_PJZT =0,I_SFLX="+ISflx+",I_YSTQJH="+IYstqjh+",I_YSTD="+IYstd+",I_PJFS="+IPjfs+",V_PJNR='"+VPjnr+"',DT_PJSJ=to_date('"+dtPjsj+"','yyyy-MM-dd'),C_PJRGRBH='"+CPjrgrbh+"',C_USERBH='"+CUserbh+"'  where V_Id='"+VId+"'";
			Query query1=this.entityManager.createNativeQuery(sql);
			int i =query1.executeUpdate();
			if(i>=1){
				return CommonUtil.CodeMessageF(1, "评价成功");
			}else{
				return CommonUtil.CodeMessageF(0, "评价失败");
			}
			
			} catch (Exception e) {
				e.printStackTrace();
				return CommonUtil.CodeMessageF(-1, "系统异常，请稍后重试");
			}
			
	}
	/**
	 * 用户注册获取短信验证码信息
	 * @param request
	 * @param response
	 * @param params
	 * @throws Exception
	 */
	@Override
	public String getzcYzm(HttpServletRequest request) {
		HttpSession session =request.getSession();
		//测试
		String json = CommonUtil.readJSONString(request); 
		JSONObject jsonObject = JSONObject.fromObject(json);
		String phoneNumber=jsonObject.getString("phoneNumber");
		
		String sql1="select count(*) from XTGL_Users where V_SJHM=?";
		Query countQuery = entityManager.createNativeQuery(sql1);
		countQuery.setParameter(1, phoneNumber);
		Integer Count = Integer.valueOf(countQuery.getSingleResult().toString());
		if(Count>0){
			return CommonUtil.CodeMessageF(2, "该手机号已被使用");
		}
		
		String code=(int)((Math.random()*9+1)*100000)+"";  //生成验证码
		SendCode sd=new SendCode();
		SendSmsResponse ssr;
		try {
			ssr = sd.sendSms(phoneNumber, code);
		} catch (ClientException e) {
			e.printStackTrace();
			return CommonUtil.CodeMessageF(-1, "系统异常，请稍后重试");
		}
		if("OK".equals(ssr.getMessage().toString())){//发送成功
			return CommonUtil.CodeMessageT(1, code);
		}else{
			return CommonUtil.CodeMessageF(0, "失败");
		}

	}
	@Override
	public String checkzcYzm(HttpServletRequest request) {
		HttpSession session =request.getSession();
		String json = CommonUtil.readJSONString(request); 
		JSONObject jsonObject = JSONObject.fromObject(json);
		String VerificationCode=jsonObject.getString("VerificationCode");
		String PN=jsonObject.getString("phoneNumber");
		String code=jsonObject.getString("code");
		if(VerificationCode.equals(code)){
			return CommonUtil.CodeMessageT(1, "验证成功");	
		}else{
			 return CommonUtil.CodeMessageF(0, "验证码错误");
		}
		
	}
	/**
	 * 修改绑定的手机号
	 * @param request
	 * @param response
	 * @param params
	 * @throws Exception
	 */
	@Override
	public String modifyPhoneNumber(HttpServletRequest request) {
		// TODO Auto-generated method stub
		String json = CommonUtil.readJSONString(request); 
		JSONObject jsonObject = JSONObject.fromObject(json);
		String VUsermc=jsonObject.getString("VUsermc");
		String phoneNumber=jsonObject.getString("phoneNumber");
		
		String sql2="update XTGL_Users set V_SJHM =?  where V_Usermc=?";
		Query query1=this.entityManager.createNativeQuery(sql2);
		query1.setParameter(1, phoneNumber);
		query1.setParameter(2, VUsermc);
		int i =query1.executeUpdate();
		if(i<=0){
			return CommonUtil.CodeMessageF(0, "修改失败");
		}else{
			return CommonUtil.CodeMessageF(1, "修改成功");
		}
	}
	
}