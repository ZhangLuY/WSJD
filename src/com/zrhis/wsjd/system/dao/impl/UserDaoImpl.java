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

import net.sf.ezmorph.object.DateMorpher;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import net.sf.json.util.JSONUtils;

import javax.persistence.Query;

import oracle.jdbc.OracleDriver;
import oracle.sql.CLOB;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import com.sun.org.apache.commons.beanutils.BeanUtils;
import com.sun.xml.internal.bind.v2.TODO;
import com.zrhis.base.Message;
import com.zrhis.base.Parameters;
import com.zrhis.base.ResultModel;
import com.zrhis.base.dao.BaseDao;
import com.zrhis.wsjd.system.bean.SqglGxhfwxy;
import com.zrhis.wsjd.system.bean.SqglJtcygxyzxb;
import com.zrhis.wsjd.system.bean.SqglJtcyjbxx;
import com.zrhis.wsjd.system.bean.SqglJtcyjzs;
import com.zrhis.wsjd.system.bean.SqglJtjbxx;
import com.zrhis.wsjd.system.bean.SqglQyfwtdzrhf;
import com.zrhis.wsjd.system.bean.SqglQyjtfwjl;
import com.zrhis.wsjd.system.bean.SqglQyjtfwjllw;
import com.zrhis.wsjd.system.bean.SqglXcysqyfw;
import com.zrhis.wsjd.system.bean.SqglXcysqyfwLog;
import com.zrhis.wsjd.system.bean.SqglXcysqyfwjtcy;
import com.zrhis.wsjd.system.bean.SqglXcysqyls;
import com.zrhis.wsjd.system.bean.XtglCzy;
import com.zrhis.wsjd.system.dao.IUserDao;
import com.zrhis.wsjd.util.BeanTransform;
import com.zrhis.wsjd.util.CommonUtil;
import com.zrhis.wsjd.util.DataBaseTools;
import com.zrhis.wsjd.util.EntityUtil;
import com.zrhis.wsjd.util.JSONFormat;
import com.zrhis.wsjd.util.JsonUtil;
import com.zrhis.wsjd.util.MD5Encoder;
import com.zrhis.wsjd.util.MessageManager;
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
public class UserDaoImpl implements IUserDao{
	
	@PersistenceContext
	protected EntityManager entityManager;
	@Autowired
	private PasswordEncoder passwordEncoder;
	@Autowired
	protected DataSource dataSource;
	@Autowired
	private BaseDao baseDao;
	String ypcslist=null;
	@Override
	public String getDatasByParam(Map<String, Object> paramMap, int pageSize,
			int page) throws Exception {
		String sql2 ="SELECT V_ID, DEP_ID, DEP_NAME, C_JTH, V_YLJGH, V_YLJGMC, V_ZWSY, DT_QYSJ, V_QYJT, V_QYJTDZ, N_JTRS, V_RQLB, V_XZQYFS, V_JTLXR, V_JTLXDH, N_JF, C_CZYBH, DT_CREATE, V_SZJDH, N_CZRKS, DT_DQSJ, V_SZJG, V_SZYS, V_SZYSDH, V_ZZJG1, V_ZZYS1, V_ZZYSDH1, V_ZZJG2, V_ZZYS2, V_ZZYSDH2, V_ZZJG3, V_ZZYS3, V_ZZYSDH3, V_CWSS, I_ZT, DT_JYSJ, V_JYYY, V_CYYS, V_CYDH, V_WSYYS, V_WSYDH, V_QJYS, V_QJDH, V_JFQZ, DT_JFQZSJ, V_YFQZ, DT_YFQZSJ, V_JFJY, DT_JFJYSJ, V_YFJY, DT_YFJYSJ, V_YY from "
				+EntityUtil.getTableName(EntityUtil.getClassForNames(paramMap.get("beanName").toString()))+this.reWhere(paramMap);
		Query query=this.entityManager.createNativeQuery(sql2);
		query.setFirstResult(page);
		query.setMaxResults(pageSize);
		List<Object[]> lists = query.getResultList();
		if(lists!=null && lists.size()>0){
			String []arry={"VId","depId","depName","CJth","VYljgh","VYljgmc","VZwsy","dtQysj","VQyjt","VQyjtdz","NJtrs","VRqlb","VXzqyfs","VJtlxr","VJtlxdh","NJf","CCzybh","dtCreate","VSzjdh","NCzrks","dtDqsj","VSzjg","VSzys","VSzysdh","VZzjg1","VZzys1","VZzysdh1","VZzjg2","VZzys2","VZzysdh2","VZzjg3","VZzys3","VZzysdh3","VCwss","IZt","dtJysj","VJyyy","VCyys","VCydh","VWsyys","VWsydh","VQjys","VQjdh","VJfqz","dtJfqzsj","VYfqz","dtYfqzsj","VJfjy","dtJfjysj","VYfjy","dtYfjysj","VYy"};
			
			String total = " select count(*) FROM ("+sql2+")";
			Query countQuery = this.entityManager.createNativeQuery(total);
			Integer totalCount = Integer.valueOf(countQuery.getSingleResult().toString());
			ypcslist=CommonUtil.ArrayToMapJsonFy(totalCount,arry,lists);
		}else{
			ypcslist=CommonUtil.ArrayToMapLost();
		}
		return ypcslist;
	}
	@Override
	public String getDatasByCJTH(String C_JTH) throws Exception {
		String sql2 ="SELECT V_ID, DEP_ID, DEP_NAME, C_JTH, V_YLJGH, V_YLJGMC, V_ZWSY, TRUNC(DT_QYSJ), V_QYJT, V_QYJTDZ, N_JTRS, V_RQLB, V_XZQYFS, V_JTLXR, V_JTLXDH, N_JF, C_CZYBH, TRUNC(DT_CREATE), V_SZJDH, N_CZRKS, TRUNC(DT_DQSJ), V_SZJG, V_SZYS, V_SZYSDH, V_ZZJG1, V_ZZYS1, V_ZZYSDH1, V_ZZJG2, V_ZZYS2, V_ZZYSDH2, V_ZZJG3, V_ZZYS3, V_ZZYSDH3, V_CWSS, I_ZT, TRUNC(DT_JYSJ), V_JYYY, V_CYYS, V_CYDH, V_WSYYS, V_WSYDH, V_QJYS, V_QJDH, V_JFQZ, TRUNC(DT_JFQZSJ), V_YFQZ, TRUNC(DT_YFQZSJ), V_JFJY, TRUNC(DT_JFJYSJ), V_YFJY, TRUNC(DT_YFJYSJ), V_YY from "
				+"SQGL_XCYSQYFW WHERE C_JTH='"+C_JTH+"'";
		Query query=this.entityManager.createNativeQuery(sql2);
		List<Object[]> lists = query.getResultList();
		if(lists!=null && lists.size()>0){
			String []arry={"VId","depId","depName","CJth","VYljgh","VYljgmc","VZwsy","dtQysj","VQyjt","VQyjtdz","NJtrs","VRqlb","VXzqyfs","VJtlxr","VJtlxdh","NJf","CCzybh","dtCreate","VSzjdh","NCzrks","dtDqsj","VSzjg","VSzys","VSzysdh","VZzjg1","VZzys1","VZzysdh1","VZzjg2","VZzys2","VZzysdh2","VZzjg3","VZzys3","VZzysdh3","VCwss","IZt","dtJysj","VJyyy","VCyys","VCydh","VWsyys","VWsydh","VQjys","VQjdh","VJfqz","dtJfqzsj","VYfqz","dtYfqzsj","VJfjy","dtJfjysj","VYfjy","dtYfjysj","VYy"};
	      ypcslist= CommonUtil.ArrayToMapJson(arry, lists);
		}else{
			ypcslist= CommonUtil.ArrayToMapJson(null, null);
		}
		return ypcslist;
	}
	public String reWhere(Map<String, Object> paramMap){
		String where =" WHERE 1=1 ";
		//substr(DEP_ID,1,length(41)) = '41'
		if(paramMap.get("depId")!=null && paramMap.get("depId").toString().length()>0){
			//where = where +" and DEP_ID = '"+paramMap.get("depId")+"'";
			int size=paramMap.get("depId").toString().length();
			where = where +" and substr(DEP_ID,1,"+size+") = '"+paramMap.get("depId")+"'";
		}
		
		if(paramMap.get("VYljgh")!=null && paramMap.get("VYljgh").toString().length()>0){
			where = where +" and v_yljgh = '"+paramMap.get("VYljgh")+"'";
		}
		
		if(paramMap.get("begin")!=null && paramMap.get("begin").toString().length()>0 && paramMap.get("end").toString().length()>0){
			where = where +" AND TO_CHAR("+paramMap.get("zd")+",'yyyy-mm-dd')>='"+paramMap.get("begin") +"' " +
					       " AND TO_CHAR("+paramMap.get("zd")+",'yyyy-mm-dd')<='"+paramMap.get("end")+"' " ;
		}
				
		if(paramMap.get("VQyys")!=null && paramMap.get("VQyys").toString().length()>0){
			where =where +" and v_qyys='"+paramMap.get("VQyys")+"'";
		}
		
		if(paramMap.get("VQyfwid")!=null && paramMap.get("VQyfwid").toString().length()>0){
			where =where +" and V_QYFWID= '"+paramMap.get("VQyfwid")+"'";
		}
		
		if(paramMap.get("CJth")!=null && paramMap.get("CJth").toString().length()>0){
			where =where +" and C_JTH= '"+paramMap.get("CJth")+"'";
		}
		
		if(paramMap.get("VHzxm")!=null && paramMap.get("VHzxm").toString().length()>0){
			where =where +" and V_HZXM= '"+paramMap.get("VHzxm")+"'";
		}
			
		if(paramMap.get("Vyear")!=null && paramMap.get("Vyear").toString().length()>0){
			where = where +" and V_YEAR= '"+paramMap.get("Vyear")+"'";
		}
		
		if(paramMap.get("IZt")!=null && paramMap.get("IZt").toString().length()>0){
			where = where +" and I_ZT= '"+paramMap.get("IZt")+"'";
		}
		return where;
	}
	
	public String reWhere1(Map<String, Object> paramMap){
		String where =" WHERE F.C_JTH=X.C_JTH  AND F.DEP_ID=Z.DEP_ID ";
		//substr(DEP_ID,1,length(41)) = '41'
		if(paramMap.get("depId")!=null && paramMap.get("depId").toString().length()>0){
			//where = where +" and DEP_ID = '"+paramMap.get("depId")+"'";
			int size=paramMap.get("depId").toString().length();
			where = where +" and substr(F.DEP_ID,1,"+size+") = '"+paramMap.get("depId")+"'";
		}
		
		if(paramMap.get("IZt")!=null && paramMap.get("IZt").toString().length()>0){
			where = where +" and F.I_ZT= '"+paramMap.get("IZt")+"'";
		}
		return where;
	}
	
	@Override
	public String getJtByParam(Map<String, Object> paramMap, int pageSize,
			int page) throws Exception {
		String sql2 ="select C_JTH,V_HZXM,V_DH,V_Jtzz,C_Jzzk,C_Jtlx,C_SZJDH from "+EntityUtil.getTableName(EntityUtil.getClassForNames(paramMap.get("beanName").toString()))+this.reWhere(paramMap)+"order by c_jth";
		Query query=this.entityManager.createNativeQuery(sql2);
		query.setFirstResult(page);
		query.setMaxResults(pageSize);
		List<Object[]> lists = query.getResultList();
		if(lists!=null && lists.size()>0){
			String []arry={"CJth","VHzxm","VDh","VJtzz","CJzzk","CJtlx","CSzjdh"};		
			String total = " select count(*) FROM ("+sql2+")";
			Query countQuery = this.entityManager.createNativeQuery(total);
			Integer totalCount = Integer.valueOf(countQuery.getSingleResult().toString());
			ypcslist=CommonUtil.ArrayToMapJsonFy(totalCount,arry,lists);
		}else{
			ypcslist=CommonUtil.ArrayToMapLost();
		}
		return ypcslist;
	}
	JSONObject jsonObject;
	
	
	
	
	
	
	@Override
	@Transactional
	public Message saveQyfwxy(Map<String, Object> fwxy) throws Exception {
		//lpf
		Message msg=new Message();
		String uuid="";
		BASE64Decoder decoder = new BASE64Decoder(); 
		/*String json = CommonUtil.readJSONString(request);
		//System.out.println("json----"+json);
		jsonObject = JSONObject.fromObject(json);
		
		Map<String,Object> fwxy = JSONFormat.JSONToMap(jsonObject.getString("jsonString"));*/
		String jfqm=StringUtils.objectToString(fwxy.get("VJfqm"));
		byte[] bjfqm = decoder.decodeBuffer(jfqm); 
		String cjfqm=new String(bjfqm);
		String yfqm=StringUtils.objectToString(fwxy.get("VYfqm"));
		byte[] byfqm = decoder.decodeBuffer(yfqm); 
		String cyfqm=new String(yfqm);
		String cyxm=StringUtils.objectToString(fwxy.get("VCyxm1"));
		byte[] vcyxm = decoder.decodeBuffer(cyxm); 
		String VCyxm=new String(vcyxm);
		String VCyxx="";
		if(fwxy.get("VCyxx")!=null&&!"".equals(fwxy.get("VCyxx"))){
			 VCyxx=StringUtils.objectToString(fwxy.get("VCyxx"));
		}
		SqglXcysqyfw fwxys=(SqglXcysqyfw)JSONFormat.toBean(SqglXcysqyfw.class,fwxy);
		String IPkjt=StringUtils.objectToString(fwxy.get("IPkjt"));//获取贫困家庭 : 0.否  1.是
		if(IPkjt==null || IPkjt==""){
			IPkjt="0";
		}
		String CJth = fwxys.getCJth();//获取家庭号
		String sql3 = "update sqgl_jtjbxx set I_Pkjt="+IPkjt+" where c_jth='"+CJth+"'";
		//SqglXcysqyfw fwxys =new SqglXcysqyfw();
		//System.out.println(fwxys);
		//System.out.println("vc:::"+fwxys.getVCyxm1());
		if(!"".equals(fwxys.getCJth()) || fwxys.getCJth() != null){
			
			String sql2 ="select count(*)  from SQGL_XCYSQYFW where i_zt=0 and c_jth='"+fwxys.getCJth()+"'";
			Query countQuery = this.entityManager.createNativeQuery(sql2);
			Integer Count = Integer.valueOf(countQuery.getSingleResult().toString());
			if(Count>0){
				msg = MessageManager.saveCheck(false);
				return msg;
			}
		}
		if("".equals(fwxys.getVId()) || fwxys.getVId() == null){
			uuid = UUID.randomUUID().toString().replaceAll("-", "");
			fwxys.setVId(uuid);
			fwxys.setIZt(0);//未解约状态
			fwxys.setISfsc(1);//平板保存状态
			fwxys.setVCyxm1(VCyxm);
			fwxys.setVCyxx(VCyxx);
			
			this.baseDao.save(fwxys);
			this.baseDao.updateJtjbxxByCjth(sql3);//修改家庭基本信息字段：贫困家庭
			msg = MessageManager.save(true);
			
			SqglXcysqyfwjtcy sqglXcysqyfwjtcy = new SqglXcysqyfwjtcy();
			this.Encapsulation("com.zrhis.wsjd.system.bean.SqglJtcyjbxx",fwxys);
			//System.out.println("SqglJtcyjbxx.getCJth()"+fwxys.getCJth());
			
		}else{
			fwxys.setVCyxm1(VCyxm);
			this.baseDao.update(fwxys);
			this.baseDao.updateJtjbxxByCjth(sql3);//修改家庭基本信息字段：贫困家庭
			msg = MessageManager.update(true);
		}
		return msg;
	}
	
	@Override
	@Transactional
	public String chooseQyjt(Map<String,Object> param) throws Exception {
		 String CJth = param.get("CJth").toString();
		 String VIdx =param.get("VIdx")!=null? param.get("VIdx").toString():"";
		// String VIdx = param.get("VIdx").toString();jh
		 String VId =param.get("VId")!=null? param.get("VId").toString():"";
		 //String VId = param.get("VId").toString();
		 String CGrbh = param.get("CGrbh").toString();
		 Class clz1 = Class.forName("com.zrhis.wsjd.system.bean.SqglXcysqyfw");
		    SqglXcysqyfw sqglXcysqyfw = (SqglXcysqyfw)baseDao.get(clz1,VIdx);
		 String sql="select c_jth from sqgl_jtcyjbxx where c_grbh='"+CGrbh+"'";//先查询此人家庭号和所要签约家庭是否一致
		 Query countQuery = this.entityManager.createNativeQuery(sql);
			String cjth = countQuery.getSingleResult().toString();
			if(cjth!=CJth&&!cjth.equals(CJth)){
				 String sql1="update sqgl_jtcyjbxx set c_jth='"+CJth+"' where c_grbh='"+CGrbh+"'";
				 this.baseDao.updateJtjbxxByCjth(sql1);//不一致的话修改家庭号
			}
			ycQyJt(VId,CGrbh);//将此人在之前的签约家庭信息中去掉
			putCancel(CGrbh,sqglXcysqyfw,VIdx);//将此人保存到要转到的家庭之中
			String sql1="update sqgl_jtcyjbxx set i_qyzt=0 where c_grbh='"+CGrbh+"'";
			this.baseDao.updateJtjbxxByCjth(sql1);//修改此人在个人档案中的签约状态
			Map<String, String> map = new HashMap<String, String>();
			JSONObject js = new JSONObject();
			JSONArray json = new JSONArray();
			map.put("geRenBianHao", CGrbh);
			json.add(map);
			js.put("data", json);
			String VCyxx = js.toString();
			String sql2="delete sqgl_xcysqyfwjtcy where c_grbh='"+CGrbh+"'";
			this.baseDao.updateJtjbxxByCjth(sql2);//删除此人
			this.Encapsulation1("com.zrhis.wsjd.system.bean.SqglJtcyjbxx",sqglXcysqyfw,VCyxx);
		return "1";
	}
	
	
	
	
	
	public void putCancel(String CGrbh,SqglXcysqyfw sqglXcysqyfw,String VId){//将此人的基本信息保存到要签约的家庭里边
		try {
		    String VCyxx =sqglXcysqyfw.getVCyxx();
		    Class clz = Class.forName("com.zrhis.wsjd.system.bean.SqglJtcyjbxx");
			SqglJtcyjbxx sqglJtcyjbxx = (SqglJtcyjbxx)baseDao.get(clz,CGrbh);
			HashMap<String, Object> map = new HashMap<String, Object>();
			JSONArray js = new JSONArray();
			JSONObject jn = new JSONObject();
			map.put("phone", sqglJtcyjbxx.getVLxdh()==null?"":sqglJtcyjbxx.getVLxdh());
			map.put("idCard",sqglJtcyjbxx.getVZjhm());
			map.put("name", sqglJtcyjbxx.getVXm());
			map.put("geRenBianHao", sqglJtcyjbxx.getCGrbh());
			if(VCyxx!=null&&!"".equals(VCyxx)){
				JSONObject data = JSONObject.fromObject(VCyxx);
				js= (JSONArray) data.get("data");
			}
			js.add(map);
			jn.put("data", js);
			String sql1="update sqgl_xcysqyfw set v_cyxx='"+(js.size()==0?"":jn.toString())+"',n_jtrs=n_jtrs+1 where V_ID='"+VId+"'";
			this.baseDao.updateJtjbxxByCjth(sql1);//不一致的话修改家庭号
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	
	
	
	
	public void ycQyJt(String VId,String CGrbh){//去掉签约信息中的成员信息
		JSONObject JSONObjectNew = new JSONObject();
		String VCyxx ="";
		Class clz;
		try {
			clz = Class.forName("com.zrhis.wsjd.system.bean.SqglXcysqyfw");
			SqglXcysqyfw SqglXcysqyfw = (SqglXcysqyfw)baseDao.get(clz,VId);
			VCyxx = SqglXcysqyfw.getVCyxx();
			JSONArray js = new JSONArray();
			if(VCyxx!=null&&!"".equals(VCyxx)){
				Object[] objs =JSONFormat.json2ObjectArray(JSONFormat.toJson(VCyxx).getString("data"));
				for (int i = 0; i < objs.length; i++) {
				String CGrbh1 = JSONObject.fromObject(objs[i]).getString("geRenBianHao");
				if(CGrbh!=CGrbh1&&!CGrbh.equals(CGrbh1)){
					js.add(objs[i]);
				}
			}
		}
			JSONObjectNew.put("data", js);
			String sql1="update sqgl_xcysqyfw set v_cyxx='"+(js.size()==0?"":JSONObjectNew.toString())+"' where V_ID='"+VId+"' and i_zt=0";
			this.baseDao.updateJtjbxxByCjth(sql1);  //修改之前的家庭签约信息 去掉这个人
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	
	
	
	@Override
	@Transactional
	public String saveQyfwxyyz(Map<String,Object> fwxy) throws Exception {
		//lpf
		String msg="";
		String uuid="";
		JSONArray json2 = new JSONArray();
		BASE64Decoder decoder = new BASE64Decoder(); 
		uuid = UUID.randomUUID().toString().replaceAll("-", "");
		/*String json = CommonUtil.readJSONString(request);
		System.out.println("json----"+json);
		jsonObject = JSONObject.fromObject(json);
		
		Map<String,Object> fwxy = JSONFormat.JSONToMap(jsonObject.getString("jsonString"));*/
		String jfqm=StringUtils.objectToString(fwxy.get("VJfqm"));
		byte[] bjfqm = decoder.decodeBuffer(jfqm); 
		String cjfqm=new String(bjfqm);
		String yfqm=StringUtils.objectToString(fwxy.get("VYfqm"));
		byte[] byfqm = decoder.decodeBuffer(yfqm); 
		String cyfqm=new String(yfqm);
		String cyxm=StringUtils.objectToString(fwxy.get("VCyxm1"));
		byte[] vcyxm = decoder.decodeBuffer(cyxm); 
		String VCyxm=new String(vcyxm);
		String VCyxx="";
		if(fwxy.get("VCyxx")!=null&&!"".equals(fwxy.get("VCyxx"))){
			 VCyxx=StringUtils.objectToString(fwxy.get("VCyxx"));
		}
		SqglXcysqyfw fwxys=(SqglXcysqyfw)JSONFormat.toBean(SqglXcysqyfw.class,fwxy);
		String IPkjt=StringUtils.objectToString(fwxy.get("IPkjt"));//获取贫困家庭 : 0.否  1.是
		if(IPkjt==null || IPkjt==""){
			IPkjt="0";
		}
		String CJth = fwxys.getCJth();//获取家庭号
		String sql3 = "update sqgl_jtjbxx set I_Pkjt="+IPkjt+" where c_jth='"+CJth+"'";
		//SqglXcysqyfw fwxys =new SqglXcysqyfw();
		//System.out.println(fwxys);
		//System.out.println("vc:::"+fwxys.getVCyxm1());
		if(!"".equals(fwxys.getCJth()) || fwxys.getCJth() != null){
			
			String sql2 ="select count(*)  from SQGL_XCYSQYFW where i_zt=0 and c_jth='"+fwxys.getCJth()+"'";
			Query countQuery = this.entityManager.createNativeQuery(sql2);
			Integer Count = Integer.valueOf(countQuery.getSingleResult().toString());
			if(Count>0){
				msg = "该家庭已签约";
				return msg;
			}
		}
		if("".equals(fwxys.getVId()) || fwxys.getVId() == null){
			//if("".equals(fwxys.getVCyxx())){
			Map<String, Object> mapl = new HashMap<String, Object>();
			JSONArray jo = new JSONArray();
			if(VCyxx!=null&&!"".equals(VCyxx)&&VCyxx!=""){
			Object[] objs =JSONFormat.json2ObjectArray(JSONFormat.toJson(VCyxx).getString("data"));
			for (int i = 0; i < objs.length; i++) {
				String CGrbh = JSONObject.fromObject(objs[i]).getString("geRenBianHao");
				String sql2="select v_qyjt,dep_name,dep_id,c_grbh,v_xm,V_JTLXR,'"+uuid+"','"+fwxys.getCJth()+"','"+fwxys.getVJtlxr()+"',V_QYFWID  from sqgl_xcysqyfwjtcy where c_grbh='"+CGrbh+"' and i_zt=0 and rownum<2";
				Query query=this.entityManager.createNativeQuery(sql2);
				List<Object[]> lists = query.getResultList();
				if(lists!=null && lists.size()>0){
					String []arry={"VQyjt","depName","depId","CGrbh","VXm","VJtlxr","VIdx","CJth","VJtlxrx","VId"};		
					ypcslist=CommonUtil.ArrayToMap(arry,lists);
					json2.add(ypcslist);
					//delete(i,objs);
				}else{
					jo.add(objs[i]);
				}
			}}
			mapl.put("data", jo);
			VCyxx=mapl.toString();
			fwxys.setVCyxx(VCyxx);
			//System.out.println(fwxys.getVCyxx());
			//}
			
			
			
			fwxys.setVId(uuid);
			fwxys.setIZt(0);//未解约状态
			fwxys.setISfsc(1);//平板保存状态
			fwxys.setVCyxm1(VCyxm);
			
			this.baseDao.save(fwxys);
			this.baseDao.updateJtjbxxByCjth(sql3);//修改家庭基本信息字段：贫困家庭
			msg ="保存成功";
			
			SqglXcysqyfwjtcy sqglXcysqyfwjtcy = new SqglXcysqyfwjtcy();
			this.Encapsulation("com.zrhis.wsjd.system.bean.SqglJtcyjbxx",fwxys);
			//System.out.println("SqglJtcyjbxx.getCJth()"+fwxys.getCJth());
			
		}else{
			fwxys.setVCyxm1(VCyxm);
			this.baseDao.update(fwxys);
			this.baseDao.updateJtjbxxByCjth(sql3);//修改家庭基本信息字段：贫困家庭
			msg = "保存成功";
		}
		if(json2.size()>0){
			return json2.toString();
		}
		return msg;
	}

	
	
	
	
	
	@Override
	@Transactional
	public Map<String,Object> saveQyfwlog(HttpServletRequest request) throws Exception {
		//lpf
		String uuid="";
		BASE64Decoder decoder = new BASE64Decoder(); 
		String json = CommonUtil.readJSONString(request);
		jsonObject = JSONObject.fromObject(json);
		
		Map<String,Object> fwxy = JSONFormat.JSONToMap(jsonObject.getString("jsonString"));
		String jfqm=StringUtils.objectToString(fwxy.get("VJfqm"));
		byte[] bjfqm = decoder.decodeBuffer(jfqm); 
		String cjfqm=new String(bjfqm);
		String yfqm=StringUtils.objectToString(fwxy.get("VYfqm"));
		byte[] byfqm = decoder.decodeBuffer(yfqm); 
		String cyfqm=new String(yfqm);
		String cyxm=StringUtils.objectToString(fwxy.get("VCyxm1"));
		byte[] vcyxm = decoder.decodeBuffer(cyxm); 
		String VCyxm=new String(vcyxm);
		String VCyxx="";
		if(fwxy.get("VCyxx")!=null&&!"".equals(fwxy.get("VCyxx"))){
			 VCyxx=StringUtils.objectToString(fwxy.get("VCyxx"));
		}
		SqglXcysqyfwLog fwxys=(SqglXcysqyfwLog)JSONFormat.toBean(SqglXcysqyfwLog.class,fwxy);
		String CJth = fwxys.getCJth();//获取家庭号
			uuid = UUID.randomUUID().toString().replaceAll("-", "");
			fwxys.setVId(uuid);
			fwxys.setIZt(0);//未解约状态
			fwxys.setISfsc(1);//平板保存状态
			fwxys.setVCyxm1(VCyxm);
			fwxys.setVCyxx(VCyxx);
			this.baseDao.save(fwxys);
		return fwxy;
	}
	
	@Override
	@Transactional
	public void CyUpdate(HttpServletRequest request) throws Exception {
		String json = CommonUtil.readJSONString(request);
		//System.out.println("json---"+json);
		JSONObject JSONObjectNew = new JSONObject();
		JSONArray ja=new JSONArray();
		JSONArray ja1=new JSONArray();
		jsonObject = JSONObject.fromObject(json);
		Map<String,Object> fwxy = JSONFormat.JSONToMap(jsonObject.getString("jsonString"));
		HashMap<String, Object> fwxy1 = new HashMap<String,Object>();
		fwxy1.put("VCyxx", fwxy.get("VCyxx"));
		String VCyxx=StringUtils.objectToString(fwxy.get("VCyxx"));
		SqglXcysqyfw fwxys=(SqglXcysqyfw)JSONFormat.toBean(SqglXcysqyfw.class,fwxy);
		System.out.println("cyxx-"+fwxys.getVCyxx());
		Class clz1 = Class.forName("com.zrhis.wsjd.system.bean.SqglXcysqyfw");
		SqglXcysqyfw SqglXcysqyfw = (SqglXcysqyfw)baseDao.get(clz1,fwxy.get("VId").toString());
		this.Encapsulation1("com.zrhis.wsjd.system.bean.SqglJtcyjbxx",SqglXcysqyfw,VCyxx);
		this.updateQyZt(VCyxx);//將人員狀態改為簽約
		JSONObject data1 = JSONObject.fromObject(VCyxx);
		ja1=(JSONArray) data1.get("data");
		Map<String, Object> map = json2Map(VCyxx);
		if(SqglXcysqyfw.getVCyxx()!=null){
		JSONObject data = JSONObject.fromObject(SqglXcysqyfw.getVCyxx());
		 ja = (JSONArray) data.get("data");
		}
		ja.add(ja1);
		JSONObjectNew.put("data", ja);
		//System.out.println("VCyxx---"+VCyxx);
		String VId=StringUtils.objectToString(fwxy.get("VId"));
		String NRs=StringUtils.objectToString(fwxy.get("NRs"));
		String sql="update sqgl_xcysqyfw set v_cyxx='"+(ja.size()==0?"":JSONObjectNew.toString())+"', N_JTRS='"+NRs+"' where v_id='"+VId+"'";  
		this.baseDao.updateJtjbxxByCjth(sql);
	}
	
	
	/*@Override
	@Transactional
	public void CyUpdate1(String vid,String cjth,String NRs) throws Exception {
		Class clz1 = Class.forName("com.zrhis.wsjd.system.bean.SqglXcysqyfw");
		SqglXcysqyfw sqglXcysqyfw = (SqglXcysqyfw)baseDao.get(clz1,vid);
		String sql="select * from sqgl_jtcyjbxx where c_jth='"+cjth+"' and i_zt<>0";
		Query query = this.entityManager.createNativeQuery(sql);
		List<SqglJtcyjbxx> list = query.getResultList();
		HashMap<String,String> map = new HashMap<String, String>();
		if(list.size()>0){
			for (int i = 0; i < list.size(); i++) {
				SqglJtcyjbxx sqglJtcyjbxx = list.get(i);
				map.put("phone", sqglJtcyjbxx.getVLxdh()==null?"":sqglJtcyjbxx.getVLxdh());
				map.put("idCard",sqglJtcyjbxx.getVZjhm());
				map.put("name", sqglJtcyjbxx.getVXm());
				map.put("geRenBianHao", sqglJtcyjbxx.getCGrbh());
			}
		}
		JSONObject JSONObjectNew = new JSONObject();
		if(list.size()>0){
			JSONObject data = JSONObject.fromObject(sqglXcysqyfw.getVCyxx());
			JSONArray ja = (JSONArray) data.get("data");
			ja.add(map);
			JSONObjectNew.put("data", ja);
			String sql4 = " update SQGL_XCYSQYFW SET V_CYXX = '"+(ja.size()==0?"":JSONObjectNew.toString())+"',N_JTRS='"+NRs+"'  WHERE C_JTH='"+cjth+"'";
			this.baseDao.updateJtjbxxByCjth(sql4);
		}
		
	}*/
	
	
	@Override
	@Transactional
	public void htUpdate(String c_jth) throws Exception {
		String sql="update sqgl_xcysqyfw set i_zt=2 where c_jth='"+c_jth+"'";
		String sql1="update sqgl_xcysqyfwjtcy set i_zt=2 where c_jth='"+c_jth+"'";
		this.baseDao.updateJtjbxxByCjth(sql);//回退签约服务状态
		this.baseDao.updateJtjbxxByCjth(sql1);//回退签约服务状态
	}
	
	
	public void Encapsulation(String beanname,SqglXcysqyfw SqglXcysqyfw) throws Exception{
		//List<SqglJtcyjbxx> list = new ArrayList<SqglJtcyjbxx>();
		//System.out.println("SqglXcysqyfw.getVCyxx()"+SqglXcysqyfw.getVCyxx());
		//JSONFormat.toJson(SqglXcysqyfw.getVCyxx());
		if("".equals(SqglXcysqyfw.getVCyxx())){
			return;//如果成员信息为空，全部不签约
		}
		Object[] objs =JSONFormat.json2ObjectArray(JSONFormat.toJson(SqglXcysqyfw.getVCyxx()).getString("data"));
		//jsonObject = JSONObject.fromObject(VCyx);
		//Map<String ,Object> map =new HashMap<String, Object>();
		//Map<String,Object> jsonMap = JSONFormat.JSONToMap(jsonObject.getString("geRenBianHao"));
		//map.put("VCyxx", VCyx);
		//tjMap.put("CGrbh", jsonMap.get("CGrbh"));
		Class clz = Class.forName(beanname);
		//List list = this.baseDao.query(clz, map);
		//System.out.println("list2018-02-07"+list);
		
		for (int i = 0; i < objs.length; i++) {
			String CGrbh = JSONObject.fromObject(objs[i]).getString("geRenBianHao");
			//System.out.println("CGrbhCGrbhCGrbh"+i+":"+CGrbh);
			SqglJtcyjbxx SqglJtcyjbxx = (SqglJtcyjbxx)baseDao.get(clz,CGrbh);
			
			SqglXcysqyfwjtcy SqglXcysqyfwjtcy = new SqglXcysqyfwjtcy();
			//SqglJtcyjbxx = (SqglJtcyjbxx)list.get(i);
			String uuid = UUID.randomUUID().toString().replaceAll("-", "");
			SqglXcysqyfwjtcy.setVId(uuid);
			SqglXcysqyfwjtcy.setCJth(SqglJtcyjbxx.getCJth());
			SqglXcysqyfwjtcy.setVQyfwid(SqglXcysqyfw.getVId());
			SqglXcysqyfwjtcy.setVXm(SqglJtcyjbxx.getVXm());
			SqglXcysqyfwjtcy.setIXb(SqglJtcyjbxx.getIXb());
			SqglXcysqyfwjtcy.setVZjhm(SqglJtcyjbxx.getVZjhm());
			SqglXcysqyfwjtcy.setVZwsy(SqglXcysqyfw.getVZwsy());
			SqglXcysqyfwjtcy.setDtQysj(SqglXcysqyfw.getDtQysj());
			SqglXcysqyfwjtcy.setVQyjt(SqglXcysqyfw.getVQyjt());
			SqglXcysqyfwjtcy.setVQyjtdz(SqglXcysqyfw.getVQyjtdz());
			SqglXcysqyfwjtcy.setVRqlb(SqglXcysqyfw.getVRqlb());
			SqglXcysqyfwjtcy.setVXzqyfs(SqglXcysqyfw.getVXzqyfs());
			SqglXcysqyfwjtcy.setVJtlxr(SqglXcysqyfw.getVJtlxr());
			SqglXcysqyfwjtcy.setVJtlxdh(SqglXcysqyfw.getVJtlxdh() ==null?" ":SqglXcysqyfw.getVJtlxdh().toString());
			SqglXcysqyfwjtcy.setNJf(SqglXcysqyfw.getNJf());
			SqglXcysqyfwjtcy.setCCzybh(SqglJtcyjbxx.getCCzybh());
			SqglXcysqyfwjtcy.setVSzjdh(SqglXcysqyfw.getVSzjdh());
			SqglXcysqyfwjtcy.setNCzrks(SqglXcysqyfw.getNCzrks());
			SqglXcysqyfwjtcy.setDtDqsj(SqglXcysqyfw.getDtDqsj());
			SqglXcysqyfwjtcy.setVSzjg(SqglXcysqyfw.getVSzjg());
			SqglXcysqyfwjtcy.setVSzys(SqglXcysqyfw.getVSzys());
			SqglXcysqyfwjtcy.setVSzysdh(SqglXcysqyfw.getVSzysdh());
			SqglXcysqyfwjtcy.setVCwss(SqglXcysqyfw.getVCwss());
			SqglXcysqyfwjtcy.setIZt(SqglXcysqyfw.getIZt());
			SqglXcysqyfwjtcy.setDtJysj(SqglXcysqyfw.getDtJysj());
			SqglXcysqyfwjtcy.setVJyyy(SqglXcysqyfw.getVJyyy());
			SqglXcysqyfwjtcy.setVCyys(SqglXcysqyfw.getVCyys());
			SqglXcysqyfwjtcy.setVCydh(SqglXcysqyfw.getVCydh());
			SqglXcysqyfwjtcy.setVWsyys(SqglXcysqyfw.getVWsyys());
			SqglXcysqyfwjtcy.setVWsydh(SqglXcysqyfw.getVWsydh());
			SqglXcysqyfwjtcy.setVQjys(SqglXcysqyfw.getVQjys());
			SqglXcysqyfwjtcy.setVQjdh(SqglXcysqyfw.getVQjdh());
			SqglXcysqyfwjtcy.setVJfqz(SqglXcysqyfw.getVJfqz());
			SqglXcysqyfwjtcy.setDtJfqzsj(SqglXcysqyfw.getDtJfqzsj());
			SqglXcysqyfwjtcy.setVYfqz(SqglXcysqyfw.getVYfqz());
			SqglXcysqyfwjtcy.setDtYfqzsj(SqglXcysqyfw.getDtYfqzsj());
			SqglXcysqyfwjtcy.setVJfjy(SqglXcysqyfw.getVJfjy());
			SqglXcysqyfwjtcy.setDtJfjysj(SqglXcysqyfw.getDtJfjysj());
			SqglXcysqyfwjtcy.setVYfjy(SqglXcysqyfw.getVYfjy());
			SqglXcysqyfwjtcy.setDtYfjysj(SqglXcysqyfw.getDtYfjysj());
			SqglXcysqyfwjtcy.setVYy(SqglXcysqyfw.getVYy());
			//SqglXcysqyfwjtcy.setVJfqm(SqglXcysqyfw.getVJfqm());
			//SqglXcysqyfwjtcy.setVYfqm(SqglXcysqyfw.getVYfqm());
			SqglXcysqyfwjtcy.setVBz(SqglXcysqyfw.getVBz());
			SqglXcysqyfwjtcy.setISfsc(SqglXcysqyfw.getISfsc());
			SqglXcysqyfwjtcy.setVJfjyqm(SqglXcysqyfw.getVJfjyqm());
			SqglXcysqyfwjtcy.setVYfjyqm(SqglXcysqyfw.getVYfjyqm());
			SqglXcysqyfwjtcy.setVYfc(SqglXcysqyfw.getVYfc());
			SqglXcysqyfwjtcy.setVYfz(SqglXcysqyfw.getVYfz());
			SqglXcysqyfwjtcy.setVYsbh(SqglXcysqyfw.getVYsbh());
			SqglXcysqyfwjtcy.setCYlzh(SqglXcysqyfw.getCYlzh());
			SqglXcysqyfwjtcy.setVJtlx(SqglXcysqyfw.getVJtlx());
			SqglXcysqyfwjtcy.setVSycyxm(SqglXcysqyfw.getVSycyxm());
			SqglXcysqyfwjtcy.setVYljgh(SqglXcysqyfw.getVYljgh());
			SqglXcysqyfwjtcy.setVYljgmc(SqglXcysqyfw.getVYljgmc());
			SqglXcysqyfwjtcy.setDepId(SqglXcysqyfw.getDepId());
			SqglXcysqyfwjtcy.setDepName(SqglJtcyjbxx.getDepName());
			SqglXcysqyfwjtcy.setCGrbh(SqglJtcyjbxx.getCGrbh());
			
			String sql2 ="select V_ID  from SQGL_XCYSQYFWJTCY where C_GRBH='"+SqglJtcyjbxx.getCGrbh()+"'";
			Query countQuery = this.entityManager.createNativeQuery(sql2);
			String VId="";
				List list = countQuery.getResultList();
				if(list.size() > 0){
				 VId = list.get(0).toString();
				 }else{
				}
			if(VId!=null&&!"".equals(VId)){
				SqglXcysqyfwjtcy.setVId(VId);
				this.baseDao.update(SqglXcysqyfwjtcy);
			}else{
				this.baseDao.save(SqglXcysqyfwjtcy);
			}
			
			Message msg = MessageManager.save(true);
			
		}
		
	}
		
	public void Encapsulation1(String beanname,SqglXcysqyfw SqglXcysqyfw,String VCyxx) throws Exception{
		if("".equals(VCyxx)||VCyxx==null){
			System.out.println("成员信息为空");
			return;//如果成员信息为空，全部不签约
		}
		Object[] objs =JSONFormat.json2ObjectArray(JSONFormat.toJson(VCyxx).getString("data"));
		Class clz = Class.forName(beanname);
		for (int i = 0; i < objs.length; i++) {
			String CGrbh = JSONObject.fromObject(objs[i]).getString("geRenBianHao");
			//System.out.println("CGrbhCGrbhCGrbh"+i+":"+CGrbh);
			SqglJtcyjbxx SqglJtcyjbxx = (SqglJtcyjbxx)baseDao.get(clz,CGrbh);
			/*String sql="select * from Sqgl_Xcysqyfwjtcy where c_grbh='"+CGrbh+"'";
			Query query = this.entityManager.createNativeQuery(sql);
			List<SqglJtcyjbxx> list = query.getResultList();
			if(list!=null||list.size()!=0){*/
			SqglXcysqyfwjtcy SqglXcysqyfwjtcy = new SqglXcysqyfwjtcy();
			//SqglJtcyjbxx = (SqglJtcyjbxx)list.get(i);
			String uuid = UUID.randomUUID().toString().replaceAll("-", "");
			SqglXcysqyfwjtcy.setVId(uuid);
			SqglXcysqyfwjtcy.setCJth(SqglJtcyjbxx.getCJth());
			SqglXcysqyfwjtcy.setVQyfwid(SqglXcysqyfw.getVId());
			SqglXcysqyfwjtcy.setVXm(SqglJtcyjbxx.getVXm());
			SqglXcysqyfwjtcy.setIXb(SqglJtcyjbxx.getIXb());
			SqglXcysqyfwjtcy.setVZjhm(SqglJtcyjbxx.getVZjhm());
			SqglXcysqyfwjtcy.setVZwsy(SqglXcysqyfw.getVZwsy());
			SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
			String s = df.format(new Date());
			SqglXcysqyfwjtcy.setDtQysj(df.parse(s));
			SqglXcysqyfwjtcy.setVQyjt(SqglXcysqyfw.getVQyjt());
			SqglXcysqyfwjtcy.setVQyjtdz(SqglXcysqyfw.getVQyjtdz());
			SqglXcysqyfwjtcy.setVRqlb(SqglXcysqyfw.getVRqlb());
			SqglXcysqyfwjtcy.setVXzqyfs(SqglXcysqyfw.getVXzqyfs());
			SqglXcysqyfwjtcy.setVJtlxr(SqglXcysqyfw.getVJtlxr());
			SqglXcysqyfwjtcy.setVJtlxdh(SqglXcysqyfw.getVJtlxdh() ==null?" ":SqglXcysqyfw.getVJtlxdh().toString());
			SqglXcysqyfwjtcy.setNJf(SqglXcysqyfw.getNJf());
			SqglXcysqyfwjtcy.setCCzybh(SqglJtcyjbxx.getCCzybh());
			SqglXcysqyfwjtcy.setVSzjdh(SqglXcysqyfw.getVSzjdh());
			SqglXcysqyfwjtcy.setNCzrks(SqglXcysqyfw.getNCzrks());
			SqglXcysqyfwjtcy.setDtDqsj(SqglXcysqyfw.getDtDqsj());
			SqglXcysqyfwjtcy.setVSzjg(SqglXcysqyfw.getVSzjg());
			SqglXcysqyfwjtcy.setVSzys(SqglXcysqyfw.getVSzys());
			SqglXcysqyfwjtcy.setVSzysdh(SqglXcysqyfw.getVSzysdh());
			SqglXcysqyfwjtcy.setVCwss(SqglXcysqyfw.getVCwss());
			SqglXcysqyfwjtcy.setIZt(SqglXcysqyfw.getIZt());
			SqglXcysqyfwjtcy.setDtJysj(SqglXcysqyfw.getDtJysj());
			SqglXcysqyfwjtcy.setVJyyy(SqglXcysqyfw.getVJyyy());
			SqglXcysqyfwjtcy.setVCyys(SqglXcysqyfw.getVCyys());
			SqglXcysqyfwjtcy.setVCydh(SqglXcysqyfw.getVCydh());
			SqglXcysqyfwjtcy.setVWsyys(SqglXcysqyfw.getVWsyys());
			SqglXcysqyfwjtcy.setVWsydh(SqglXcysqyfw.getVWsydh());
			SqglXcysqyfwjtcy.setVQjys(SqglXcysqyfw.getVQjys());
			SqglXcysqyfwjtcy.setVQjdh(SqglXcysqyfw.getVQjdh());
			SqglXcysqyfwjtcy.setVJfqz(SqglXcysqyfw.getVJfqz());
			SqglXcysqyfwjtcy.setDtJfqzsj(SqglXcysqyfw.getDtJfqzsj());
			SqglXcysqyfwjtcy.setVYfqz(SqglXcysqyfw.getVYfqz());
			SqglXcysqyfwjtcy.setDtYfqzsj(SqglXcysqyfw.getDtYfqzsj());
			SqglXcysqyfwjtcy.setVJfjy(SqglXcysqyfw.getVJfjy());
			SqglXcysqyfwjtcy.setDtJfjysj(SqglXcysqyfw.getDtJfjysj());
			SqglXcysqyfwjtcy.setVYfjy(SqglXcysqyfw.getVYfjy());
			SqglXcysqyfwjtcy.setDtYfjysj(SqglXcysqyfw.getDtYfjysj());
			SqglXcysqyfwjtcy.setVYy(SqglXcysqyfw.getVYy());
			//SqglXcysqyfwjtcy.setVJfqm(SqglXcysqyfw.getVJfqm());
			//SqglXcysqyfwjtcy.setVYfqm(SqglXcysqyfw.getVYfqm());
			SqglXcysqyfwjtcy.setVBz(SqglXcysqyfw.getVBz());
			SqglXcysqyfwjtcy.setISfsc(SqglXcysqyfw.getISfsc());
			SqglXcysqyfwjtcy.setVJfjyqm(SqglXcysqyfw.getVJfjyqm());
			SqglXcysqyfwjtcy.setVYfjyqm(SqglXcysqyfw.getVYfjyqm());
			SqglXcysqyfwjtcy.setVYfc(SqglXcysqyfw.getVYfc());
			SqglXcysqyfwjtcy.setVYfz(SqglXcysqyfw.getVYfz());
			SqglXcysqyfwjtcy.setVYsbh(SqglXcysqyfw.getVYsbh());
			SqglXcysqyfwjtcy.setCYlzh(SqglXcysqyfw.getCYlzh());
			SqglXcysqyfwjtcy.setVJtlx(SqglXcysqyfw.getVJtlx());
			SqglXcysqyfwjtcy.setVSycyxm(SqglXcysqyfw.getVSycyxm());
			SqglXcysqyfwjtcy.setVYljgh(SqglXcysqyfw.getVYljgh());
			SqglXcysqyfwjtcy.setVYljgmc(SqglXcysqyfw.getVYljgmc());
			SqglXcysqyfwjtcy.setDepId(SqglXcysqyfw.getDepId());
			SqglXcysqyfwjtcy.setDepName(SqglJtcyjbxx.getDepName());
			SqglXcysqyfwjtcy.setCGrbh(SqglJtcyjbxx.getCGrbh());
			
			String sql2 ="select V_ID  from SQGL_XCYSQYFWJTCY where C_GRBH='"+SqglJtcyjbxx.getCGrbh()+"'";
			Query countQuery = this.entityManager.createNativeQuery(sql2);
			String VId="";
				List list = countQuery.getResultList();
				if(list.size() > 0){
				 VId = list.get(0).toString();
				 }else{
				}
			if(VId!=null&&!"".equals(VId)){
				SqglXcysqyfwjtcy.setVId(VId);
				this.baseDao.update(SqglXcysqyfwjtcy);
			}else{
				this.baseDao.save(SqglXcysqyfwjtcy);
			}
			
			Message msg = MessageManager.save(true);
			}
	}
	
	
	
	
	
	
	
	@Override
	@Transactional
	public Message saveQyfwxyqy(HttpServletRequest request) throws Exception {
		//lpf
		Message msg=new Message();
		String uuid="";
		BASE64Decoder decoder = new BASE64Decoder(); 
		String json = CommonUtil.readJSONString(request);
		//System.out.println("json-----"+json);
		jsonObject = JSONObject.fromObject(json);
		
		Map<String,Object> fwxy = JSONFormat.JSONToMap(jsonObject.getString("jsonString"));
		//System.out.println("vc:::"+fwxy.get("VCyxm1"));
		String jfqm=StringUtils.objectToString(fwxy.get("VJfqm"));
		byte[] bjfqm = decoder.decodeBuffer(jfqm); 
		String cjfqm=new String(bjfqm);
		//System.out.println(cjfqm);
		String yfqm=StringUtils.objectToString(fwxy.get("VYfqm"));
		byte[] byfqm = decoder.decodeBuffer(yfqm); 
		String cyfqm=new String(yfqm);
		//System.out.println(cyfqm);
		//System.out.println("aaaaaaaaaaaaaaaaaaa"+fwxy.get("VCyxx"));
		String cyxm=StringUtils.objectToString(fwxy.get("VCyxm1"));
		//String str = (String)fwxy.get("VCyxx");
		//System.out.println("CJthCJthCJthCJthCJth"+fwxy.get("CJth"));
		String VCyxx="";
		if(fwxy.get("VCyxx")!=null&&!"".equals(fwxy.get("VCyxx"))){
			 VCyxx=StringUtils.objectToString(fwxy.get("VCyxx"));
		}
		
		byte[] vcyxm = decoder.decodeBuffer(cyxm); 
		String VCyxm=new String(vcyxm);
		SqglXcysqyfw fwxys=(SqglXcysqyfw)JSONFormat.toBean(SqglXcysqyfw.class,fwxy);
		String IPkjt=StringUtils.objectToString(fwxy.get("IPkjt"));//获取贫困家庭 : 0.否  1.是
		if(IPkjt==null || IPkjt==""){
			IPkjt="0";
		}
		String CJth = fwxys.getCJth();//获取家庭号
		String sql3 = "update sqgl_jtjbxx set I_Pkjt="+IPkjt+" where c_jth='"+CJth+"'";
         if(!"".equals(fwxys.getCJth()) || fwxys.getCJth() != null){
			String sql2 ="select count(*)  from SQGL_XCYSQYFW where i_zt=0 and c_jth='"+fwxys.getCJth()+"'";
			Query countQuery = this.entityManager.createNativeQuery(sql2);
			Integer Count = Integer.valueOf(countQuery.getSingleResult().toString());
			if(Count>0){
				msg = MessageManager.saveCheck(false);
				return msg;
			}
		}
		//SqglXcysqyfw fwxys =new SqglXcysqyfw();
		//System.out.println(fwxys);
		//System.out.println("vc:::"+fwxys.getVCyxm1());
		if("".equals(fwxys.getVId()) || fwxys.getVId() == null){
			uuid = UUID.randomUUID().toString().replaceAll("-", "");
			fwxys.setVId(uuid);
			fwxys.setIZt(0);//未解约状态
			fwxys.setISfsc(1);//平板保存状态
			fwxys.setVCyxm1(VCyxm);
			fwxys.setVCyxx(VCyxx);
			
			this.baseDao.save(fwxys);
			this.baseDao.updateJtjbxxByCjth(sql3);//修改家庭基本信息字段：贫困家庭
			msg = MessageManager.save(true);
			
			SqglXcysqyfwjtcy sqglXcysqyfwjtcy = new SqglXcysqyfwjtcy();
			this.Encapsulationqy("com.zrhis.wsjd.system.bean.SqglJtcyjbxx",fwxys);
			//System.out.println("SqglJtcyjbxx.getCJth()"+fwxys.getCJth());
			
		}else{
			fwxys.setVCyxm1(VCyxm);
			this.baseDao.update(fwxys);
			this.baseDao.updateJtjbxxByCjth(sql3);//修改家庭基本信息字段：贫困家庭
			msg = MessageManager.update(true);
		}
		return msg;
	}
	
	public void updateQyZt(String VCyxx) throws Exception{
		if("".equals(VCyxx)){
			//System.out.println("走这里---为空");
			return;//如果成员信息为空，全部不签约
		}
		Object[] objs =JSONFormat.json2ObjectArray(JSONFormat.toJson(VCyxx).getString("data"));
		for (int i = 0; i < objs.length; i++) {
			String CGrbh = JSONObject.fromObject(objs[i]).getString("geRenBianHao");
			//System.out.println("状态改了--");
		    String sql="update Sqgl_Jtcyjbxx set i_qyzt=0 where c_grbh='"+CGrbh+"'";
		    this.baseDao.updateJtjbxxByCjth(sql);
		}
	}
	
	public void Encapsulationqy(String beanname,SqglXcysqyfw SqglXcysqyfw) throws Exception{
		//List<SqglJtcyjbxx> list = new ArrayList<SqglJtcyjbxx>();
		//System.out.println("SqglXcysqyfw.getVCyxx()"+SqglXcysqyfw.getVCyxx());
		//JSONFormat.toJson(SqglXcysqyfw.getVCyxx());
		if("".equals(SqglXcysqyfw.getVCyxx())){
			return;//如果成员信息为空，全部不签约
		}
		Object[] objs =JSONFormat.json2ObjectArray(JSONFormat.toJson(SqglXcysqyfw.getVCyxx()).getString("data"));
		//jsonObject = JSONObject.fromObject(VCyx);
		//Map<String ,Object> map =new HashMap<String, Object>();
		//Map<String,Object> jsonMap = JSONFormat.JSONToMap(jsonObject.getString("geRenBianHao"));
		//map.put("VCyxx", VCyx);
		//tjMap.put("CGrbh", jsonMap.get("CGrbh"));
		Class clz = Class.forName(beanname);
		//List list = this.baseDao.query(clz, map);
		//System.out.println("list2018-02-07"+list);
		
		for (int i = 0; i < objs.length; i++) {
			String CGrbh = JSONObject.fromObject(objs[i]).getString("geRenBianHao");
			//System.out.println("CGrbhCGrbhCGrbh"+i+":"+CGrbh);
			SqglJtcyjbxx SqglJtcyjbxx = (SqglJtcyjbxx)baseDao.get(clz,CGrbh);
			
			SqglXcysqyfwjtcy SqglXcysqyfwjtcy = new SqglXcysqyfwjtcy();
			//SqglJtcyjbxx = (SqglJtcyjbxx)list.get(i);
			String uuid = UUID.randomUUID().toString().replaceAll("-", "");
			SqglXcysqyfwjtcy.setVId(uuid);
			SqglXcysqyfwjtcy.setCJth(SqglJtcyjbxx.getCJth());
			SqglXcysqyfwjtcy.setVQyfwid(SqglXcysqyfw.getVId());
			SqglXcysqyfwjtcy.setVXm(SqglJtcyjbxx.getVXm());
			SqglXcysqyfwjtcy.setIXb(SqglJtcyjbxx.getIXb());
			SqglXcysqyfwjtcy.setVZjhm(SqglJtcyjbxx.getVZjhm());
			SqglXcysqyfwjtcy.setVZwsy(SqglXcysqyfw.getVZwsy());
			SqglXcysqyfwjtcy.setDtQysj(SqglXcysqyfw.getDtQysj());
			SqglXcysqyfwjtcy.setVQyjt(SqglXcysqyfw.getVQyjt());
			SqglXcysqyfwjtcy.setVQyjtdz(SqglXcysqyfw.getVQyjtdz());
			SqglXcysqyfwjtcy.setVRqlb(SqglXcysqyfw.getVRqlb());
			SqglXcysqyfwjtcy.setVXzqyfs(SqglXcysqyfw.getVXzqyfs());
			SqglXcysqyfwjtcy.setVJtlxr(SqglXcysqyfw.getVJtlxr());
			SqglXcysqyfwjtcy.setVJtlxdh(SqglXcysqyfw.getVJtlxdh() ==null?" ":SqglXcysqyfw.getVJtlxdh().toString());
			SqglXcysqyfwjtcy.setNJf(SqglXcysqyfw.getNJf());
			SqglXcysqyfwjtcy.setCCzybh(SqglJtcyjbxx.getCCzybh());
			SqglXcysqyfwjtcy.setVSzjdh(SqglXcysqyfw.getVSzjdh());
			SqglXcysqyfwjtcy.setNCzrks(SqglXcysqyfw.getNCzrks());
			SqglXcysqyfwjtcy.setDtDqsj(SqglXcysqyfw.getDtDqsj());
			SqglXcysqyfwjtcy.setVSzjg(SqglXcysqyfw.getVSzjg());
			SqglXcysqyfwjtcy.setVSzys(SqglXcysqyfw.getVSzys());
			SqglXcysqyfwjtcy.setVSzysdh(SqglXcysqyfw.getVSzysdh());
			SqglXcysqyfwjtcy.setVCwss(SqglXcysqyfw.getVCwss());
			SqglXcysqyfwjtcy.setIZt(SqglXcysqyfw.getIZt());
			SqglXcysqyfwjtcy.setDtJysj(SqglXcysqyfw.getDtJysj());
			SqglXcysqyfwjtcy.setVJyyy(SqglXcysqyfw.getVJyyy());
			SqglXcysqyfwjtcy.setVCyys(SqglXcysqyfw.getVCyys());
			SqglXcysqyfwjtcy.setVCydh(SqglXcysqyfw.getVCydh());
			SqglXcysqyfwjtcy.setVWsyys(SqglXcysqyfw.getVWsyys());
			SqglXcysqyfwjtcy.setVWsydh(SqglXcysqyfw.getVWsydh());
			SqglXcysqyfwjtcy.setVQjys(SqglXcysqyfw.getVQjys());
			SqglXcysqyfwjtcy.setVQjdh(SqglXcysqyfw.getVQjdh());
			SqglXcysqyfwjtcy.setVJfqz(SqglXcysqyfw.getVJfqz());
			SqglXcysqyfwjtcy.setDtJfqzsj(SqglXcysqyfw.getDtJfqzsj());
			SqglXcysqyfwjtcy.setVYfqz(SqglXcysqyfw.getVYfqz());
			SqglXcysqyfwjtcy.setDtYfqzsj(SqglXcysqyfw.getDtYfqzsj());
			SqglXcysqyfwjtcy.setVJfjy(SqglXcysqyfw.getVJfjy());
			SqglXcysqyfwjtcy.setDtJfjysj(SqglXcysqyfw.getDtJfjysj());
			SqglXcysqyfwjtcy.setVYfjy(SqglXcysqyfw.getVYfjy());
			SqglXcysqyfwjtcy.setDtYfjysj(SqglXcysqyfw.getDtYfjysj());
			SqglXcysqyfwjtcy.setVYy(SqglXcysqyfw.getVYy());
			//SqglXcysqyfwjtcy.setVJfqm(SqglXcysqyfw.getVJfqm());
			//SqglXcysqyfwjtcy.setVYfqm(SqglXcysqyfw.getVYfqm());
			SqglXcysqyfwjtcy.setVBz(SqglXcysqyfw.getVBz());
			SqglXcysqyfwjtcy.setISfsc(SqglXcysqyfw.getISfsc());
			SqglXcysqyfwjtcy.setVJfjyqm(SqglXcysqyfw.getVJfjyqm());
			SqglXcysqyfwjtcy.setVYfjyqm(SqglXcysqyfw.getVYfjyqm());
			SqglXcysqyfwjtcy.setVYfc(SqglXcysqyfw.getVYfc());
			SqglXcysqyfwjtcy.setVYfz(SqglXcysqyfw.getVYfz());
			SqglXcysqyfwjtcy.setVYsbh(SqglXcysqyfw.getVYsbh());
			SqglXcysqyfwjtcy.setCYlzh(SqglXcysqyfw.getCYlzh());
			SqglXcysqyfwjtcy.setVJtlx(SqglXcysqyfw.getVJtlx());
			SqglXcysqyfwjtcy.setVSycyxm(SqglXcysqyfw.getVSycyxm());
			SqglXcysqyfwjtcy.setVYljgh(SqglXcysqyfw.getVYljgh());
			SqglXcysqyfwjtcy.setVYljgmc(SqglXcysqyfw.getVYljgmc());
			SqglXcysqyfwjtcy.setDepId(SqglXcysqyfw.getDepId());
			SqglXcysqyfwjtcy.setDepName(SqglJtcyjbxx.getDepName());
			SqglXcysqyfwjtcy.setCGrbh(SqglJtcyjbxx.getCGrbh());
			SqglXcysqyfwjtcy.setVTdid(SqglXcysqyfw.getVTdid());
			String sql2 ="select count(*)  from SQGL_XCYSQYFWJTCY where I_zt =0 and C_Grbh='"+SqglJtcyjbxx.getCGrbh()+"'";
			Query countQuery = this.entityManager.createNativeQuery(sql2);
			Integer Count = Integer.valueOf(countQuery.getSingleResult().toString());
			if(Count>0){
				this.baseDao.update(SqglXcysqyfwjtcy);
			}else{
				this.baseDao.save(SqglXcysqyfwjtcy);
			}
			
			Message msg = MessageManager.save(true);
			
		}
		
		

		
	}
	
	//删除
	@Override
	public Message delete(HttpServletRequest request, Parameters params)
			throws Exception {	
		baseDao.delete(params.getClassName(),params.getId());
		Message msg = MessageManager.delete();
		return msg;
	}

	//登录
	@SuppressWarnings("unchecked")
	public String Login(HttpServletRequest request) throws Exception  {	      
//		Connection conn = null;
//		ResultSet rs = null;
//		PreparedStatement ps =null;	
//		conn = this.dataSource.getConnection();
//		String json = CommonUtil.readJSONString(request); 
//		JSONObject jsonObject = JSONObject.fromObject(json);
//		String user=jsonObject.getString("username");
//		String password=jsonObject.getString("password");
//		String sql1="select count(*) from Xtgl_Czy where V_Zcmc="+"'"+user+"'";
//		ps = conn.prepareStatement(sql1);
//		rs=ps.executeQuery();
//		List<Map<String,String>> list =DataBaseTools.resultSetToList(rs);
//		if(list.size()>0&&list!=null){
//			String sql2="select V_Dlkl from Xtgl_Czy where V_Zcmc="+"'"+user+"'";
//			ps = conn.prepareStatement(sql2);
//			rs=ps.executeQuery();
//			List<Map<String,String>> list2 =DataBaseTools.resultSetToList(rs);
//			String mm=list2.get(0).get("V_DLKL");
//			if(MD5Encoder.encoder(password).equals(mm)){
//				String sql3="select DEP_ID, C_CZYBH, V_CZYMC, V_ZCMC, V_DLKL, N_ZT, N_CJYH, DEP_NAME, ROL_ID, V_CSS, DT_ZCRQ, " +
//						"DT_CREATE, V_YLBH, V_XTBH, N_YHLB, I_GLMS, I_CXFS, I_TYPE, V_SCQX from Xtgl_Czy where V_Zcmc="+"'"+user+"'";
//				ps = conn.prepareStatement(sql3);
//				rs=ps.executeQuery();
//				List<Map<String,String>> list3 =DataBaseTools.resultSetToList(rs);
//				if(list3!=null&&list3.size()>0){
////					String depId=list3.get(0).get("DEP_ID");
////					int kg=0;
////					List<Map<String,String>> ls=new ArrayList<Map<String,String>>();
////					while(kg==0){
////						String sql="select dep_id,praent_id,i_level from SQGL_SQJGXX where dep_id='"+depId+"'";
////						conn = this.dataSource.getConnection();
////						ps = conn.prepareStatement(sql);
////						rs=ps.executeQuery();
////						List<Map<String,String>> list4 =DataBaseTools.resultSetToList(rs);
////						if(list4!=null && list4.size()>0){
////							Map<String ,String> map =new HashMap<String, String>();
////							map.put("praentId", list4.get(0).get("PRAENT_ID"));
////							map.put("depId", list4.get(0).get("DEP_ID"));
////							map.put("ILevel", list4.get(0).get("I_LEVEL"));
////							depId=map.get("praentId");
////							ls.add(map);
////						}else{
////							kg=1;
////						}
////					}
////					JSONArray json2=JSONFormat.toJson(ls);//depId
//					JSONArray json1=JSONFormat.toJson(list3);
//					ypcslist= CommonUtil.ArrayToMapLost4("true",json1.toString(),null);
//				}
//			}else{
//				String ypcslist=null;
//				String result="用户名或密码错误！";
//				ypcslist= CommonUtil.ArrayToMapLost1(result);
//				return ypcslist;
//			}
//		}else{
//			String ypcslist=null;
//			String result="该用户不存在！";
//			ypcslist= CommonUtil.ArrayToMapLost1(result);
//			//System.out.println("登录失败");
//			return ypcslist;
//		}
//		ps.close();
//		rs.close();
//		conn.close();
//		return ypcslist;
		
		String json = CommonUtil.readJSONString(request); 
		JSONObject jsonObject = JSONObject.fromObject(json);
		String user=jsonObject.getString("username");
		String password=jsonObject.getString("password");
		String sql1="select count(*) from Xtgl_Czy where V_Zcmc="+"'"+user+"'";
		Query countQuery = entityManager.createNativeQuery(sql1);
		Integer Count = Integer.valueOf(countQuery.getSingleResult().toString());
		if(Count>0){
			String sql2="select V_Dlkl from Xtgl_Czy where V_Zcmc="+"'"+user+"'";
			Query query=this.entityManager.createNativeQuery(sql2);
			String mm=(String) query.getSingleResult();
			if(MD5Encoder.encoder(password).equals(mm)){
				String sql3="select DEP_ID, C_CZYBH, V_CZYMC, V_ZCMC, V_DLKL, N_ZT, N_CJYH, DEP_NAME, ROL_ID, V_CSS, DT_ZCRQ, " +
						"DT_CREATE, V_YLBH, V_XTBH, N_YHLB, I_GLMS, I_CXFS, I_TYPE, V_SCQX from Xtgl_Czy where V_Zcmc="+"'"+user+"'";
				Query query2 = this.entityManager.createNativeQuery(sql3);
				List<Object[]> lists = query2.getResultList();
				List<Map<String, Object>> newList=null;
				if(lists!=null&&lists.size()>0){
					String []arry={"depId","CCzybh","VCzymc","VZcmc","VDlkl","NZt","NCjyh","depName","rolId","VCss","dtZcrq","dtCreate",
							"VYlbh","VXtbh","NYhlb","IGlms","ICxfs","IType","VScqx"};
					newList= JsonUtil.listToMap(arry, lists);
				}
			    //json字符串
				String ypcslist=null;
				String []arry={"depId","CCzybh","VCzymc","VZcmc","VDlkl","NZt","NCjyh","depName","rolId","VCss","dtZcrq","dtCreate",
						"VYlbh","VXtbh","NYhlb","IGlms","ICxfs","IType","VScqx"};
				ypcslist= CommonUtil.ArrayToMap(arry, lists);
				entityManager.close();
				return ypcslist;
			}else{
				String ypcslist=null;
				String result="用户名或密码错误！";
				ypcslist= CommonUtil.ArrayToMapLost1(result);
				return ypcslist;
			}
		}else{
			String ypcslist=null;
			String result="该用户不存在！";
			ypcslist= CommonUtil.ArrayToMapLost1(result);
			//System.out.println("登录失败");
			return ypcslist;
		}		
	}

	@Override
	public Message surrender(HttpServletRequest request) throws Exception {
		Message msg=new Message();
		//String paramMap=new String(request.getParameter("params").getBytes("iso8859-1"),"utf-8");
		String json = CommonUtil.readJSONString(request);
		jsonObject = JSONObject.fromObject(json);
		//System.out.println(jsonObject);
		//Map<String, Object> map =JsonUtil.json2Map(jsonObject);
		//SqglXcysqyfw qyfw=this.entityManager.find(SqglXcysqyfw.class, map.get("VId"));
		SqglXcysqyfw qyfw = (SqglXcysqyfw)baseDao.get(SqglXcysqyfw.class,jsonObject.get("VId").toString());
		qyfw.setIZt(1);
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		
		if(jsonObject.get("dtJysj")!=null && !"".equals(jsonObject.get("dtJysj"))){
			//sql +=",DT_JYSJ =to_date('"+map.get("dtJysj")+"','yyyy-MM-dd')";
			String s= jsonObject.get("dtJysj").toString(); 
			Date date =  formatter.parse(s);
			qyfw.setDtJysj(date);
		}
		if(jsonObject.get("VJyyy")!=null && !"".equals(jsonObject.get("VJyyy"))){
			//sql += " ,V_JYYY = '"+map.get("VJyyy")+"'";
			qyfw.setVJyyy(jsonObject.get("VJyyy").toString());
		}
		if(jsonObject.get("dtJfjysj")!=null && !"".equals(jsonObject.get("dtJfjysj"))){
			//sql +=",DT_JFJYSJ =to_date('"+map.get("dtJfjysj")+"','yyyy-MM-dd')";
			String s= jsonObject.get("dtJfjysj").toString(); 
			Date date =  formatter.parse(s);
			qyfw.setDtJfjysj(date);
		}
		if(jsonObject.get("VJfjyqm")!=null && !"".equals(jsonObject.get("VJfjyqm"))){
			//sql += " ,V_JFJY = '"+map.get("VJfjy")+"'";
			qyfw.setVJfjyqm(jsonObject.get("VJfjyqm").toString());
		}
		if(jsonObject.get("VYfjyqm")!=null && !"".equals(jsonObject.get("VYfjyqm"))){
			//sql += " ,V_YFJY = '"+map.get("VYfjy")+"'";
			qyfw.setVYfjyqm(jsonObject.get("VYfjyqm").toString());
		}
		if(jsonObject.get("dtYfjysj")!=null && !"".equals(jsonObject.get("dtYfjysj"))){
			//sql +=",DT_YFJYSJ =to_date('"+map.get("dtYfjysj")+"','yyyy-MM-dd')";
			String s= jsonObject.get("dtYfjysj").toString(); 
			Date date =  formatter.parse(s);
			qyfw.setDtYfjysj(date);
		}
		baseDao.update(qyfw);
		msg = MessageManager.update(true);
		return msg;
	}

	@Override
	public String getSqjgxxByParentId(String parentId)
			throws Exception {
		List<Map<String, Object>> list = new ArrayList<Map<String,Object>>();
		String sql = "select Dep_ID, V_NAME,(select count(*) from SQGL_SQJGXX where PRAENT_ID = jg.Dep_ID) I_COUNT, I_LEVEL"+
		" from SQGL_SQJGXX jg where PRAENT_ID = '"+parentId+"' order by dep_id";
		Query query2 = this.entityManager.createNativeQuery(sql);
		List<Object[]> lists = query2.getResultList();
		List<Map<String, Object>> newList=null;
		if(lists!=null&&lists.size()>0){
			String []arry={"depId","CCzybh","VCzymc","VZcmc","VDlkl","NZt","NCjyh","depName","rolId","VCss","dtZcrq","dtCreate",
					"VYlbh","VXtbh","NYhlb","IGlms","ICxfs","IType","VScqx"};
			ypcslist= CommonUtil.ArrayToMapJson(arry, lists);
		}else{
			ypcslist= CommonUtil.ArrayToMap(null, null);
		}
		return ypcslist;
	}

	@Override
	public Message saveGxhfwxy(HttpServletRequest request) throws Exception {
		String json = CommonUtil.readJSONString(request);
		Message msg=new Message();
		jsonObject = JSONObject.fromObject(json);
		//clz = Class.forName(jsonObject.getString("className"));
		Map<String,Object> form = JSONFormat.JSONToMap(jsonObject.getString("jsonString"));
		SqglGxhfwxy fwxy=(SqglGxhfwxy)JSONFormat.toBean(SqglGxhfwxy.class,form);
		if(fwxy.getVId()==null || "".equals(fwxy.getVId())){
			String uuid = UUID.randomUUID().toString().replaceAll("-", "");
			fwxy.setVId(uuid);
			this.baseDao.save(fwxy);
			msg = MessageManager.save(true);
		}else{
			this.baseDao.update(fwxy);
			msg = MessageManager.update(true);
		}
		return msg;
	}
	
	@Override
	public String queryJtcyxx(Map<String, Object> paramMap,int page,int pageSize,int count) throws Exception {
//		String sql2="select V_XM,C_JTH,V_ZJHM from "+ lpf
		String sql2 ="select DEP_ID, C_SQH, C_ID, C_GRBH, V_XM, C_JTH, C_YHZGX, V_PYJM, I_XB, DT_CSRQ, I_HKLX, I_HJLX, I_JZZK, " +
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
				"I_RLLX, I_YS, I_CS, I_QCL, C_CZYBH, C_SZJDH, I_ET, DT_TURN_ET, DT_REVOKE_ET, I_LR, DT_TURN_LR, DT_REVOKE_LR, I_YCF, DT_TURN_YCF, DT_REVOKE_YCF,I_JBLB31,DT_QZRQ31,I_QYZT,I_PKZT,dt_fwrq,v_pgnf from "+
				EntityUtil.getTableName(EntityUtil.getClassForNames(paramMap.get("beanName").toString()))+this.reWhere(paramMap)+"and I_ZT=1";
		Query query=this.entityManager.createNativeQuery(sql2);
		int st=(page-1)*pageSize;
		//System.out.println("pa===="+st);
		query.setFirstResult(st);
		query.setMaxResults(pageSize);
		List<Object[]> lists = query.getResultList();
		if(lists!=null && lists.size()>0){
//			String []arry={"VXm","CJth","VZjhm"};
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
					"IYwbls","IBls","ICfpf","IRllx","IYs","ICs","IQcl","CCzybh","CSzjdh","IEt","dtTurnet","dtRevokeet","ILr","dtTurnlr","dtRevokelr","IYcf","dtTurnycf","dtRevokeycf","IJblb31","dtQzrq31","IQyzt","IPkzt","dtFwrq","VPgnf"};		
			String total = " select count(*) FROM ("+sql2+")";
			Integer totalCount;
			if(count==-1){
//				System.out.println("11111111");
				Query countQuery = this.entityManager.createNativeQuery(total);
				totalCount = Integer.valueOf(countQuery.getSingleResult().toString());
			}else{
				totalCount=count;
			}
			ypcslist=CommonUtil.ArrayToMapJsonFy(totalCount,arry,lists);
		}else{
			ypcslist=CommonUtil.ArrayToMapLost();
		}
		return ypcslist;
	}

	@Override
	public String queryQyjtfwjl(Map<String, Object> paramMap, int pageSize, int page)
			throws Exception {
		String sql2 ="select V_ID, DEP_ID, DEP_NAME, C_JTH, V_YLJGH, V_YLJGMC, DT_FWSJ, V_HZXM, V_JTRENQ, V_JTRS, V_JTDH, V_JTZZ, I_FWZL1, I_FWZL2, I_FWZL3, I_FWZL4, I_FWZL5, I_FWZL6, I_FWZL7, I_FWZL8, I_FWZL9, I_FWZL10, I_FWZL11, V_PXJL, V_FWJL, V_FWXJ, V_FWPG, V_JSFWJM, V_FWYS, C_CZYBH, DT_CREATE, V_FWFS from "+EntityUtil.getTableName(EntityUtil.getClassForNames(paramMap.get("beanName").toString()))+this.reWhere(paramMap)+"order by c_jth";
		Query query=this.entityManager.createNativeQuery(sql2);
		query.setFirstResult((page-1)*pageSize);
		query.setMaxResults(pageSize);
		List<Object[]> lists = query.getResultList();
		if(lists!=null && lists.size()>0){
			String []arry={"VId","depId","depName","CJth","VYljgh","VYljgmc","dtFwsj","VHzxm","VJtrenq","VJtrs","VJtdh","VJtzz","IFwzl1","IFwzl2","IFwzl3","IFwzl4","IFwzl5","IFwzl6","IFwzl7","IFwzl8","IFwzl9","IFwzl10","IFwzl11","VPxjl","VFwjl","VFwxj","VFwpg","VJsfwjm","VFwys","CCzybh","dtCreate","VFwfs"};
			
			String total = " select count(*) FROM ("+sql2+")";
			Query countQuery = this.entityManager.createNativeQuery(total);
			Integer totalCount = Integer.valueOf(countQuery.getSingleResult().toString());
			ypcslist=CommonUtil.ArrayToMapJsonFy(totalCount,arry,lists);
		}else{
			ypcslist=CommonUtil.ArrayToMapLost();
		}
		return ypcslist;
	}

	
	@Override
	public String queryQyjtfwjllw(Map<String, Object> paramMap, int pageSize, int page)
			throws Exception {
		String sql2 ="select V_ID, DEP_ID, DEP_NAME, C_JTH, V_YLJGH, V_YLJGMC, DT_FWSJ, V_HZXM, V_JTRENQ, V_JTRS, V_JTDH, V_JTZZ, I_FWZL1, I_FWZL2, I_FWZL3, I_FWZL4, I_FWZL5, I_FWZL6, I_FWZL7, I_FWZL8, I_FWZL9, I_FWZL10, I_FWZL11, V_PXJL, V_FWJL, V_FWXJ, V_FWPG, V_JSFWJM, V_FWYS, C_CZYBH, DT_CREATE, V_FWFS from "+EntityUtil.getTableName(EntityUtil.getClassForNames(paramMap.get("beanName").toString()))+this.reWhere(paramMap)+"order by c_jth";
		Query query=this.entityManager.createNativeQuery(sql2);
		query.setFirstResult((page-1)*pageSize);
		query.setMaxResults(pageSize);
		List<Object[]> lists = query.getResultList();
		if(lists!=null && lists.size()>0){
			String []arry={"VId","depId","depName","CJth","VYljgh","VYljgmc","dtFwsj","VHzxm","VJtrenq","VJtrs","VJtdh","VJtzz","IFwzl1","IFwzl2","IFwzl3","IFwzl4","IFwzl5","IFwzl6","IFwzl7","IFwzl8","IFwzl9","IFwzl10","IFwzl11","VPxjl","VFwjl","VFwxj","VFwpg","VJsfwjm","VFwys","CCzybh","dtCreate","VFwfs"};
			
			String total = " select count(*) FROM ("+sql2+")";
			Query countQuery = this.entityManager.createNativeQuery(total);
			Integer totalCount = Integer.valueOf(countQuery.getSingleResult().toString());
			ypcslist=CommonUtil.ArrayToMapJsonFy(totalCount,arry,lists);
		}else{
			ypcslist=CommonUtil.ArrayToMapLost();
		}
		return ypcslist;
	}
	
	@Override
	public Message saveQyjtfwjl(HttpServletRequest request) throws Exception {
		HttpSession session = request.getSession();
		String json = CommonUtil.readJSONString(request);
		Message msg=new Message();
		Class clz = null;
		jsonObject = JSONObject.fromObject(json);
		//clz = Class.forName(jsonObject.getString("className"));
		Map<String,Object> form = JSONFormat.JSONToMap(jsonObject.getString("jsonString"));
		SqglQyjtfwjl fwxy=(SqglQyjtfwjl)JSONFormat.toBean(SqglQyjtfwjl.class,form);
		//System.out.println(form);
//		if(fwxy.getVFwtp()!=null && !"".equals(fwxy.getVFwtp())){
//			byte[] b=fwxy.getVFwtp().getBytes();
//			UserDaoImpl ud=new UserDaoImpl();
//			String fwtp=ud.compressPicByQuality(b, (float) 0.0001);
//			//System.out.println(fwtp);
//			fwxy.setVFwtp(fwtp);
//		}
		if(fwxy.getVId()==null || "".equals(fwxy.getVId())){
			String uuid = UUID.randomUUID().toString().replaceAll("-", "");
			fwxy.setVId(uuid);
			this.baseDao.save(fwxy);
			msg = MessageManager.save(true);
		}else{
			this.baseDao.update(fwxy);
			msg = MessageManager.update(true);
		}
		return msg;
	}

	
	@Override
	public Message saveQyjtfwjllw(HttpServletRequest request) throws Exception {
		HttpSession session = request.getSession();
		String json = CommonUtil.readJSONString(request);
		Message msg=new Message();
		Class clz = null;
		String VTdcy="";
		jsonObject = JSONObject.fromObject(json);
		//clz = Class.forName(jsonObject.getString("className"));
		String str = jsonObject.getString("jsonString");
		Map<String,Object> form = JSONFormat.JSONToMap(str);
		//System.out.println("tpxx----"+form.get("VFwtp"));
		if(form.get("VTdcy")!=null&&!"".equals(form.get("VTdcy"))){
			VTdcy=StringUtils.objectToString(form.get("VTdcy"));
		}
		
		SqglQyjtfwjllw fwxy=(SqglQyjtfwjllw)JSONFormat.toBean(SqglQyjtfwjllw.class,form);
		//System.out.println(form);
//		if(fwxy.getVFwtp()!=null && !"".equals(fwxy.getVFwtp())){
//			byte[] b=fwxy.getVFwtp().getBytes();
//			UserDaoImpl ud=new UserDaoImpl();
//			String fwtp=ud.compressPicByQuality(b, (float) 0.0001);
//			//System.out.println(fwtp);
//			fwxy.setVFwtp(fwtp);
//		}
		if(fwxy.getVId()==null || "".equals(fwxy.getVId())){
			String uuid = UUID.randomUUID().toString().replaceAll("-", "");
			fwxy.setVId(uuid);
			fwxy.setVTdcy(VTdcy);
			this.baseDao.save(fwxy);
			msg = MessageManager.save(true);
		}else{
			fwxy.setVTdcy(VTdcy);
			this.baseDao.update(fwxy);
			msg = MessageManager.update(true);
		}
		return msg;
	}
	
	
	@Override
	public Message saveQyfwzrtdhf(HttpServletRequest request) throws Exception {
		HttpSession session = request.getSession();
		String json = CommonUtil.readJSONString(request);
		Message msg=new Message();
		Class clz = null;
		jsonObject = JSONObject.fromObject(json);
		clz = Class.forName(jsonObject.getString("className"));
		Map<String,Object> form = JSONFormat.JSONToMap(jsonObject.getString("jsonString"));
		SqglQyfwtdzrhf fwxy=(SqglQyfwtdzrhf)JSONFormat.toBean(SqglQyfwtdzrhf.class,form);
		if(fwxy.getVId()==null || "".equals(fwxy.getVId())){
			String uuid = UUID.randomUUID().toString().replaceAll("-", "");
			fwxy.setVId(uuid);
			this.baseDao.save(fwxy);
			msg = MessageManager.save(true);
		}else{
			this.baseDao.update(fwxy);
			msg = MessageManager.update(true);
		}
		return msg;
	}

	@Override
	public String getJtByParamsy(Map<String, Object> paramMap) throws Exception {
//		String sql2="select DEP_ID, C_JTH, V_HZXM, V_SZJD, V_SZHY, V_SZHL, V_SZHS, V_DH, V_ZRYS, V_ZRHS, C_SQBH, C_SZJDH, C_JWHBH, I_SFQDHT, C_JTLX, I_LENDZT, I_CSBZ, C_JZZK, N_JZMJ, I_YSLY1, I_YSLY2, " +
//		"I_YSLY3, I_YSLY4, I_YSLY5, I_YSLY6, I_YSLY7, V_QTLY, I_CSLB, C_JTRJSR, N_YLZWZ, N_ZGDWZ, N_PCSWZ, I_ZFJG, I_LCS, I_FJS, N_M, N_RJMJ, I_CG, I_TF, I_BN, I_KQSD, I_CF, I_SSSP, I_RL," +
//		" I_PY, I_WS, I_SZ, I_JYDD, I_JYDH, I_JYDSJ, I_JYLYJ, I_JYFRJ, I_JYDBX, I_JYXYJ, I_JYKT, I_JYLY, I_JYDN, I_JYZXC, I_JYJC, I_JYJTYY, I_JYQT, V_QTJY, to_char(DT_XHSJ,'yy-mm-dd hh24:mi:ss'), V_XHWT, to_char(DT_CSSJ,'yy-mm-dd hh24:mi:ss'), V_CSWT, " +
//		" to_char(DT_XLQSJ,'yy-mm-dd hh24:mi:ss'), V_XLQWT,  to_char(DT_XLHSJ,'yy-mm-dd hh24:mi:ss'), V_XLHWT,  to_char(DT_QSSJ,'yy-mm-dd hh24:mi:ss'), V_QSWT,  to_char(DT_LJSJ,'yy-mm-dd hh24:mi:ss'), V_LJWT,  to_char(DT_MRSJ,'yy-mm-dd hh24:mi:ss'), V_MRWT,  to_char(DT_TXSJ,'yy-mm-dd hh24:mi:ss'), V_TXWT,  to_char(DT_SOSJ,'yy-mm-dd hh24:mi:ss'), V_SOWT, I_ZT, I_ZCDYY, V_ZDJWH, V_ZDXQ, V_ZDJD, V_ZDLH, V_ZDFJH,   to_char(DT_JDRQ,'yy-mm-dd hh24:mi:ss')," +
//		" V_BDCZ, V_DCZ, V_FHZ,  to_char(DT_QMRQ,'yy-mm-dd hh24:mi:ss'),  to_char(DT_DCRQ,'yy-mm-dd hh24:mi:ss'),  to_char(DT_FHRQ,'yy-mm-dd hh24:mi:ss'), V_BZ, DEP_NAME, V_JTSDBH,  to_char(DT_CREATE,'yy-mm-dd hh24:mi:ss'),C_CZYBH, V_JTZZ from "+EntityUtil.getTableName(EntityUtil.getClassForNames(paramMap.get("beanName").toString()))+this.reWhere(paramMap)+"and I_ZT =1 order by c_jth";		
		String sql2="select DEP_ID, C_JTH, V_HZXM, V_SZJD, V_SZHY, V_SZHL, V_SZHS, V_DH, V_ZRYS, V_ZRHS, C_SQBH, C_SZJDH, C_JWHBH, I_SFQDHT, C_JTLX, I_LENDZT, I_CSBZ, C_JZZK, N_JZMJ, I_YSLY1, I_YSLY2, " +
				"I_YSLY3, I_YSLY4, I_YSLY5, I_YSLY6, I_YSLY7, V_QTLY, I_CSLB, C_JTRJSR, N_YLZWZ, N_ZGDWZ, N_PCSWZ, I_ZFJG, I_LCS, I_FJS, N_M, N_RJMJ, I_CG, I_TF, I_BN, I_KQSD, I_CF, I_SSSP, I_RL," +
				" I_PY, I_WS, I_SZ, I_JYDD, I_JYDH, I_JYDSJ, I_JYLYJ, I_JYFRJ, I_JYDBX, I_JYXYJ, I_JYKT, I_JYLY, I_JYDN, I_JYZXC, I_JYJC, I_JYJTYY, I_JYQT, V_QTJY, DT_XHSJ, V_XHWT, DT_CSSJ, V_CSWT, " +
				"DT_XLQSJ, V_XLQWT, DT_XLHSJ, V_XLHWT, DT_QSSJ, V_QSWT, DT_LJSJ, V_LJWT, DT_MRSJ, V_MRWT, DT_TXSJ, V_TXWT, DT_SOSJ, V_SOWT, I_ZT, I_ZCDYY, V_ZDJWH, V_ZDXQ, V_ZDJD, V_ZDLH, V_ZDFJH, DT_JDRQ," +
				" V_BDCZ, V_DCZ, V_FHZ, DT_QMRQ, DT_DCRQ, DT_FHRQ, V_BZ, DEP_NAME, V_JTSDBH, DT_CREATE, C_CZYBH, V_JTZZ , I_PKJT,V_PKJTYY,V_PKJTYYQT from "+EntityUtil.getTableName(EntityUtil.getClassForNames(paramMap.get("beanName").toString()))+this.reWhere(paramMap)+"and I_ZT =1 order by c_jth";		

//		String sql2 ="select C_JTH,V_HZXM,V_DH,V_Jtzz,C_Jzzk,C_Jtlx,C_SZJDH from "+EntityUtil.getTableName(EntityUtil.getClassForNames(paramMap.get("beanName").toString()))+this.reWhere(paramMap)+"and I_ZT =1 order by c_jth";
		Query query=this.entityManager.createNativeQuery(sql2);
		List<Object[]> lists = query.getResultList();
		//System.out.println("lists+++++"+lists);
	
		if(lists!=null && lists.size()>0){
//			String []arry={"CJth","VHzxm","VDh","VJtzz","CJzzk","CJtlx","CSzjdh"};
			String []arry={"depId","CJth","VHzxm","VSzjd","VSzhy","VSzhl","VSzhs","VDh","VZrys","VZrhs","CSqbh","CSzjdh","CJwhbh","ISfqdht","CJtlx","ILendzt","ICsbz","CJzzk","NJzmj","IYsly1","IYsly2","IYsly3","IYsly4","IYsly5","IYsly6","IYsly7","VQtly","ICslb","CJtrjsr","NYlzwz","NZgdwz","NPcswz","IZfjg","ILcs","IFjs","NM","NRjmj","ICg","ITf","IBn","IKqsd","ICf","ISssp","IRl","IPy","IWs","ISz","IJydd","IJydh","IJydsj","IJylyj","IJyfrj","IJydbx","IJyxyj","IJykt","IJyly","IJydn","IJyzxc","IJyjc","IJyjtyy","IJyqt","VQtjy","dtXhsj","VXhwt","dtCssj","VCswt","dtXlqsj","VXlqwt","dtXlhsj","VXlhwt","dtQssj","VQswt","dtLjsj","VLjwt","dtMrsj","VMrwt","dtTxsj","VTxwt","dtSosj","VSowt","IZt","IZcdyy","VZdjwh","VZdxq","VZdjd","VZdlh","VZdfjh","dtJdrq","VBdcz","VDcz","VFhz","dtQmrq","dtDcrq","dtFhrq","VBz","dtPname","VJtsdbh","dtCreate","CCzybh","VJtzz","IPkjt","VPkjtyy","VPkjtyyqt"};
			String total = " select count(*) FROM ("+sql2+")";
			Query countQuery = this.entityManager.createNativeQuery(total);
			Integer totalCount = Integer.valueOf(countQuery.getSingleResult().toString());
			ypcslist=CommonUtil.ArrayToMapJsonFy(totalCount,arry,lists);
		}else{
			ypcslist=CommonUtil.ArrayToMapLost();
		}
		return ypcslist;
	}

	@Override
	public String getQyfwxyss(Map<String, Object> paramMap) throws Exception {
		String sql2 ="SELECT V_ID, DEP_ID, DEP_NAME, C_JTH, V_YLJGH, V_YLJGMC, V_ZWSY, DT_QYSJ, V_QYJT, V_QYJTDZ, N_JTRS, V_RQLB, V_XZQYFS, V_JTLXR, V_JTLXDH, N_JF, C_CZYBH, DT_CREATE, V_SZJDH, N_CZRKS, DT_DQSJ, V_SZJG, V_SZYS, V_SZYSDH, V_ZZJG1, V_ZZYS1, V_ZZYSDH1, V_ZZJG2, V_ZZYS2, V_ZZYSDH2, V_ZZJG3, V_ZZYS3, V_ZZYSDH3, V_CWSS, I_ZT, DT_JYSJ, V_JYYY, V_CYYS, V_CYDH, V_WSYYS, V_WSYDH, V_QJYS, V_QJDH, V_JFQZ, DT_JFQZSJ, V_YFQZ, DT_YFQZSJ, V_JFJY, DT_JFJYSJ, V_YFJY, DT_YFJYSJ, V_YY from "
			+EntityUtil.getTableName(EntityUtil.getClassForNames(paramMap.get("beanName").toString()))+this.reWhere(paramMap);
		Query query=this.entityManager.createNativeQuery(sql2);
		List<Object[]> lists = query.getResultList();
		if(lists!=null && lists.size()>0){
			String []arry={"VId","depId","depName","CJth","VYljgh","VYljgmc","VZwsy","dtQysj","VQyjt","VQyjtdz","NJtrs","VRqlb","VXzqyfs","VJtlxr","VJtlxdh","NJf","CCzybh","dtCreate","VSzjdh","NCzrks","dtDqsj","VSzjg","VSzys","VSzysdh","VZzjg1","VZzys1","VZzysdh1","VZzjg2","VZzys2","VZzysdh2","VZzjg3","VZzys3","VZzysdh3","VCwss","IZt","dtJysj","VJyyy","VCyys","VCydh","VWsyys","VWsydh","VQjys","VQjdh","VJfqz","dtJfqzsj","VYfqz","dtYfqzsj","VJfjy","dtJfjysj","VYfjy","dtYfjysj","VYy"};
			
			String total = " select count(*) FROM ("+sql2+")";
			Query countQuery = this.entityManager.createNativeQuery(total);
			Integer totalCount = Integer.valueOf(countQuery.getSingleResult().toString());
			ypcslist=CommonUtil.ArrayToMapJsonFy(totalCount,arry,lists);
		}else{
			ypcslist=CommonUtil.ArrayToMapLost();
		}
		return ypcslist;
	}
	
	@Override
	public String getQyfwxysw(Map<String, Object> paramMap) throws Exception {
		String sql2 ="SELECT F.V_ID, F.DEP_ID, F.DEP_NAME, F.C_JTH, F.V_YLJGH, F.V_YLJGMC,F.V_ZWSY, to_char(F.DT_QYSJ,'yyyy-mm-dd'), F.V_QYJT, F.V_QYJTDZ, F.N_JTRS, F.V_RQLB, F.V_XZQYFS, F.V_JTLXR, F.V_JTLXDH, F.N_JF, F.C_CZYBH, to_char(F.DT_CREATE,'yyyy-mm-dd'), F.V_SZJDH, F.N_CZRKS,  to_char(F.DT_DQSJ,'yyyy-mm-dd'), F.V_SZJG, F.V_SZYS, F.V_SZYSDH, F.V_ZZJG1, F.V_ZZYS1, F.V_ZZYSDH1, F.V_ZZJG2, F.V_ZZYS2, F.V_ZZYSDH2, F.V_ZZJG3, F.V_ZZYS3, F.V_ZZYSDH3, F.V_CWSS, F.I_ZT,to_char(F.DT_JYSJ,'yyyy-mm-dd') , F.V_JYYY, F.V_CYYS, F.V_CYDH, F.V_WSYYS, F.V_WSYDH, F.V_QJYS, F.V_QJDH, F.V_JFQZ,to_char(F.DT_JFQZSJ,'yyyy-mm-dd') , F.V_YFQZ,to_char(F.DT_YFQZSJ,'yyyy-mm-dd') , F.V_JFJY,to_char(F.DT_JFJYSJ,'yyyy-mm-dd') , F.V_YFJY, to_char(F.DT_YFJYSJ,'yyyy-mm-dd'), F.V_YY,F.V_YFC,F.V_YFZ,X.I_PKJT, V_GZTP from "
			+"SQGL_XCYSQYFW F,SQGL_JTJBXX X,SQGL_QYFWTDZRHF Z  "+this.reWhere1(paramMap);
		Query query=this.entityManager.createNativeQuery(sql2);
		List<Object[]> lists = query.getResultList();
		if(lists!=null && lists.size()>0){
			String []arry={"VId","depId","depName","CJth","VYljgh","VYljgmc","VZwsy","dtQysj","VQyjt","VQyjtdz","NJtrs","VRqlb","VXzqyfs","VJtlxr","VJtlxdh","NJf","CCzybh","dtCreate","VSzjdh","NCzrks","dtDqsj","VSzjg","VSzys","VSzysdh","VZzjg1","VZzys1","VZzysdh1","VZzjg2","VZzys2","VZzysdh2","VZzjg3","VZzys3","VZzysdh3","VCwss","IZt","dtJysj","VJyyy","VCyys","VCydh","VWsyys","VWsydh","VQjys","VQjdh","VJfqz","dtJfqzsj","VYfqz","dtYfqzsj","VJfjy","dtJfjysj","VYfjy","dtYfjysj","VYy","VYfc","VYfz","IPkjt","VGztp"};			
			String total = " select count(*) FROM ("+sql2+")";
			Query countQuery = this.entityManager.createNativeQuery(total);
			Integer totalCount = Integer.valueOf(countQuery.getSingleResult().toString());
			ypcslist=CommonUtil.listToMapJson(totalCount,arry,lists);
		}else{
			ypcslist=CommonUtil.ArrayToMapLost();
		}
		return ypcslist;
	}
	
	@Override
	public String getQyfwxyXy(Map<String, Object> paramMap) throws Exception {
		String sql2 ="select V_ID,DEP_ID,DEP_NAME,C_JTH,V_YFJY,V_JFJY,to_char(DT_CZSJ,'yyyy-mm-dd'),C_CZYBH,V_JF from sqgl_xcysqyls "+this.reWhere(paramMap)+" AND I_ZT='5' AND I_CZLX='2'";
		Query query=this.entityManager.createNativeQuery(sql2);
		List<Object[]> lists = query.getResultList();
		if(lists!=null && lists.size()>0){
			String []arry={"VId","depId","depName","CJth","VYfjy","VJfjy","dtCzsj","CCzybh","VJf"};			
			String total = " select count(*) FROM ("+sql2+")";
			Query countQuery = this.entityManager.createNativeQuery(total);
			Integer totalCount = Integer.valueOf(countQuery.getSingleResult().toString());
			ypcslist=CommonUtil.listToMapJson(totalCount,arry,lists);
		}else{
			ypcslist=CommonUtil.ArrayToMapLost();
		}
		return ypcslist;
	}
	
	
	public String compressPicByQuality(byte[] imgByte, float quality) {
		byte[] inByte = null;
		String ec=null;
		try {
			ByteArrayInputStream byteInput = new ByteArrayInputStream(imgByte);
			BufferedImage image = ImageIO.read(byteInput);
		
			// 如果图片空，返回空
			if (image == null) {
			return null;
			} 
			// 得到指定Format图片的writer
			Iterator<ImageWriter> iter = ImageIO
			.getImageWritersByFormatName("jpeg");// 得到迭代器
			ImageWriter writer = (ImageWriter) iter.next(); // 得到writer
		
			// 得到指定writer的输出参数设置(ImageWriteParam )
			ImageWriteParam iwp = writer.getDefaultWriteParam();
			iwp.setCompressionMode(ImageWriteParam.MODE_EXPLICIT); // 设置可否压缩
			iwp.setCompressionQuality(quality); // 设置压缩质量参数
		
			iwp.setProgressiveMode(ImageWriteParam.MODE_DISABLED);
		
			ColorModel colorModel = ColorModel.getRGBdefault();
			// 指定压缩时使用的色彩模式
			iwp.setDestinationType(new javax.imageio.ImageTypeSpecifier(colorModel,
			colorModel.createCompatibleSampleModel(16, 16)));
		
			// 开始打包图片，写入byte[]
			ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(); // 取得内存输出流
			IIOImage iIamge = new IIOImage(image, null, null);
		
			// 此处因为ImageWriter中用来接收write信息的output要求必须是ImageOutput
			// 通过ImageIo中的静态方法，得到byteArrayOutputStream的ImageOutput
			writer.setOutput(ImageIO
			.createImageOutputStream(byteArrayOutputStream));
			writer.write(null, iIamge, iwp);
			inByte = byteArrayOutputStream.toByteArray();
			
			BASE64Encoder encoder = new BASE64Encoder();
			ec=encoder.encode(inByte);
			
		    //生成图片为PNG
			ByteArrayInputStream in = new ByteArrayInputStream(inByte);    //将b作为输入流；
			BufferedImage i = ImageIO.read(in);     //将in作为输入流，读取图片存入image中，而这里in可以为ByteArrayInputStream();
			ImageIO.write(i, "jpg",  new File("D:\\xiao.jpg"));
		} catch (IOException e) {
			//System.out.println("write errro");
			e.printStackTrace();
		}
		return ec;
	}
	
	
	
	public static void main(String[] args) throws IOException {
		String imgFile = "d:\\timg.jpg";// 待处理的图片
		InputStream in = null;
		byte[] data = null;
		in = new FileInputStream(imgFile);
		data = new byte[in.available()];
		in.read(data);
		in.close();
		// 对字节数组Base64编码
		BASE64Encoder encoder = new BASE64Encoder();
		//System.out.println(encoder.encode(data));;// 返回Base64编码过的字节数组字符串
		//System.out.println("in:"+in);
		//System.out.println("data:"+data);
		UserDaoImpl ud=new UserDaoImpl();
		//ud.compressPicByQuality(data,80);
		//System.out.println("fh--"+ud.compressPicByQuality(data,1));
	}

	@Override
	public String getByParamsy(Map<String, Object> map, String sql,
			String[] arry,Integer n) throws Exception {
		String sql2 =sql+this.reWhere(map);
		Query query=this.entityManager.createNativeQuery(sql2);
		List<Object[]> lists = query.getResultList();
		if(lists!=null && lists.size()>0){
			String total = " select count(*) FROM ("+sql2+")";
			Query countQuery = this.entityManager.createNativeQuery(total);
			Integer totalCount = Integer.valueOf(countQuery.getSingleResult().toString());
			//System.out.println("lists:"+arry);
			ypcslist=CommonUtil.listToMapJson(totalCount,arry,lists);
		}else{
			ypcslist=CommonUtil.ArrayToMapLost();
		}
		//System.out.println("lists:"+lists);
		return ypcslist;
	}

	@Override
	public String getZrysOrZrhs(Map<String, Object> map,String sql,String []arr) throws Exception {
		String sql2 =sql+EntityUtil.getTableName(EntityUtil.getClassForNames(map.get("beanName").toString()))+" z inner join SQGL_SQJGXX s on z.Dep_ID=s.Dep_ID where 1=1 and z.Dep_ID=(select s2.PRAENT_ID from SQGL_SQJGXX s2 where s2.Dep_ID='"+map.get("depId")+"')";
		//System.out.println("sql:::"+sql2);
		Query query=this.entityManager.createNativeQuery(sql2);
		List<Object[]> lists = query.getResultList();
		if(lists!=null && lists.size()>0){
			String []arry=arr;
			String total = " select count(*) FROM ("+sql2+")";
			Query countQuery = this.entityManager.createNativeQuery(total);
			Integer totalCount = Integer.valueOf(countQuery.getSingleResult().toString());
			ypcslist=CommonUtil.ArrayToMapJsonFy(totalCount,arry,lists);
		}else{
			ypcslist=CommonUtil.ArrayToMapLost();
		}
		return ypcslist;
	}

	@Override
	public String getZu(Map<String, Object> map) throws Exception {
		//System.out.println(map);
		String sql2 ="select Dep_Id, to_number(C_BH) C_BH, C_SSC, V_MC, V_BZ, V_ID from Xtgl_Zu z group by Dep_Id, to_number(C_BH), C_SSC, V_MC, V_BZ, V_ID having 1 = 1 and z.Dep_Id = '"+map.get("depId")+"' order by to_number(C_BH)";
		Query query=this.entityManager.createNativeQuery(sql2);
		List<Object[]> lists = query.getResultList();
		if(lists!=null && lists.size()>0){
			String []arry={"depId","CBh","CSsc","VMc","VBz","VId"};
			String total = " select count(*) FROM ("+sql2+")";
			Query countQuery = this.entityManager.createNativeQuery(total);
			Integer totalCount = Integer.valueOf(countQuery.getSingleResult().toString());
			ypcslist=CommonUtil.ArrayToMapJsonFy(totalCount,arry,lists);
		}else{
			ypcslist=CommonUtil.ArrayToMapLost();
		}
		return ypcslist;
	}

	@Override
	public String getJwh(Map<String, Object> map, String sql, String[] arr)
			throws Exception {
//		String sql2 =sql+EntityUtil.getTableName(EntityUtil.getClassForNames(map.get("beanName").toString()))+" j where 1=1 and j.Dep_ID=(select s.PRAENT_ID from SQGL_SQJGXX s where s.Dep_ID='"+map.get("depId")+"')";
		String sql2 =sql+EntityUtil.getTableName(EntityUtil.getClassForNames(map.get("beanName").toString()))+" j where 1=1 and j.v_bz='"+map.get("depId")+"'";
		Query query=this.entityManager.createNativeQuery(sql2);
		List<Object[]> lists = query.getResultList();
		if(lists!=null && lists.size()>0){
			String []arry=arr;
			String total = " select count(*) FROM ("+sql2+")";
			Query countQuery = this.entityManager.createNativeQuery(total);
			Integer totalCount = Integer.valueOf(countQuery.getSingleResult().toString());
			ypcslist=CommonUtil.ArrayToMapJsonFy(totalCount,arry,lists);
		}else{
			ypcslist=CommonUtil.ArrayToMapLost();
		}
		return ypcslist;
	}

	@Override
	public String getFwjl(Map<String, Object> map, String sql, String[] arr)
			throws Exception {
//		String sql2 =sql+EntityUtil.getTableName(EntityUtil.getClassForNames(map.get("beanName").toString()))+" j where 1=1 and j.Dep_ID=(select s.PRAENT_ID from SQGL_SQJGXX s where s.Dep_ID='"+map.get("depId")+"')";
		String sql2 =sql+EntityUtil.getTableName(EntityUtil.getClassForNames(map.get("beanName").toString()))+"  where 1=1 and dep_id='"+map.get("depId")+"'";
		Query query=this.entityManager.createNativeQuery(sql2);
		List<Object[]> lists = query.getResultList();
		if(lists!=null && lists.size()>0){
			String []arry=arr;
			String total = " select count(*) FROM ("+sql2+")";
			Query countQuery = this.entityManager.createNativeQuery(total);
			Integer totalCount = Integer.valueOf(countQuery.getSingleResult().toString());
			ypcslist=CommonUtil.ArrayToMapJsonFy(totalCount,arry,lists);
		}else{
			ypcslist=CommonUtil.ArrayToMapLost();
		}
		return ypcslist;
	}
	
	
	
	
	
	@Override
	public String getZd(Map<String, Object> map, String sql, String[] arr)
			throws Exception {
		String sql2 =sql+EntityUtil.getTableName(EntityUtil.getClassForNames(map.get("beanName").toString()));
		Query query=this.entityManager.createNativeQuery(sql2);
		List<Object[]> lists = query.getResultList();
		if(lists!=null && lists.size()>0){
			String []arry=arr;
			String total = " select count(*) FROM ("+sql2+")";
			Query countQuery = this.entityManager.createNativeQuery(total);
			Integer totalCount = Integer.valueOf(countQuery.getSingleResult().toString());
			ypcslist=CommonUtil.ArrayToMapJsonFy(totalCount,arry,lists);
		}else{
			ypcslist=CommonUtil.ArrayToMapLost();
		}
		return ypcslist;
	}

	@Override
	@Transactional
	public Message saveJtcyxx(HttpServletRequest request) throws Exception {
		Message msg=new Message();
		BASE64Decoder decoder = new BASE64Decoder(); 
		String CGrbh="";
		String json = CommonUtil.readJSONString(request);
		jsonObject = JSONObject.fromObject(json);
		Map<String,Object> cyjbxxMap = JSONFormat.JSONToMap(jsonObject.getString("cyjbxx"));
		//System.out.println("cyjbxxMap::"+cyjbxxMap);
		Map<String,Object> jzsMap = JSONFormat.JSONToMap(jsonObject.getString("jzs"));
		SqglJtcyjzs jzs=new SqglJtcyjzs();
		SqglJtcyjbxx cyjbxx=(SqglJtcyjbxx)JSONFormat.toBean(SqglJtcyjbxx.class,cyjbxxMap);
		System.err.println("dtJlsj::::"+jzsMap.get("dtJlsj"));
		if (jzsMap != null) {
			jzs=(SqglJtcyjzs)JSONFormat.toBean(SqglJtcyjzs.class,jzsMap);
			} else {jzs = null;};
		utils u=new utils();
		if ("".equals(cyjbxx.getCGrbh()) ||  cyjbxx.getCGrbh()==null){
			//System.out.println("==="+cyjbxxMap.get("CJth").toString());
			CGrbh=u.getMaxId("SqglJtcyjbxx", cyjbxxMap.get("CJth").toString(),"01");
			//System.out.println("--grbh--"+CGrbh);
			cyjbxx.setCGrbh(CGrbh); 
			jzs.setCGrbh(CGrbh); 
			if("".equals(cyjbxx.getVGrsdbh()) ||  cyjbxx.getVGrsdbh()==null){
				cyjbxx.setVGrsdbh(CGrbh);
			}
			this.baseDao.save(cyjbxx);
			msg = MessageManager.save(true);
			jzs.setDtDcrq(cyjbxx.getDtDcrq());
			jzs.setDtFhrq(cyjbxx.getDtFhrq());
			jzs.setDtQmrq(cyjbxx.getDtQmrq());
			jzs.setCId(cyjbxx.getCId());
			jzs.setDepId(cyjbxx.getDepId());
			jzs.setDepName(cyjbxx.getDepName());
			
			
			String sql2 ="select count(*)  from SQGL_JTCYJZS where C_GRBH='"+cyjbxx.getCGrbh().toString()+"'";
			Query countQuery = this.entityManager.createNativeQuery(sql2);
			Integer Count = Integer.valueOf(countQuery.getSingleResult().toString());
			
			if(Count>0){
				this.baseDao.update(jzs);
			}else{
				this.baseDao.save(jzs);
			}
			
			
		
			//msg = MessageManager.save(true);
			msg.setMessage(CGrbh);
		}else{
			String sql2 ="select I_QYZT  from SQGL_JTCYJBXX where c_grbh="+cyjbxx.getCGrbh()+"";
			Query countQuery = this.entityManager.createNativeQuery(sql2);
			List list = countQuery.getResultList();
			if(list.size()>0&&null!=list.get(0)){
				Integer i = Integer.valueOf(list.get(0).toString());
				cyjbxx.setIQyzt(i);
			}
			
			this.baseDao.update(cyjbxx);
			msg = MessageManager.update(true);
		}
		return msg;
			
	}

	@Override
	@Transactional
	public String saveJtjbxx(HttpServletRequest request) throws Exception {
		BASE64Decoder decoder = new BASE64Decoder(); 
		String json = CommonUtil.readJSONString(request);
		jsonObject = JSONObject.fromObject(json);
		Map<String,Object> jtjbxxMap = JSONFormat.JSONToMap(jsonObject.getString("jtjbxx"));
		//System.out.println("jtjbxxMap：：："+jtjbxxMap);
		SqglJtjbxx jtjbxx=(SqglJtjbxx)JSONFormat.toBean(SqglJtjbxx.class,jtjbxxMap);
		utils u=new utils();
		//System.out.println("jtjbxx::::"+jtjbxx);
		//---bean--SqglJtcyjbxx--jg--41110400100003---01
		String jth="";
		if ("".equals(jtjbxx.getCJth()) ||  jtjbxx.getCJth()==null){
			jth=u.getMaxId("SqglJtjbxx", jtjbxxMap.get("depId").toString(),"00001");
			//System.out.println("--jth---"+jth);
			jtjbxx.setCJth(jth); 
			if("".equals(jtjbxx.getVJtsdbh()) ||  jtjbxx.getVJtsdbh()==null){
				jtjbxx.setVJtsdbh(jth);
			}
			//System.out.println("jth::::"+jth);
			this.baseDao.save(jtjbxx);
		}else{
			this.baseDao.update(jtjbxx);
			MessageManager.update(true);
		}
		return jth;
	}

	@Override
	public String getXx(Map<String, Object> map, String sql, String[] arr)
			throws Exception {
		String sql2=sql+" "+this.reWhere(map);
		Query query=this.entityManager.createNativeQuery(sql2);
		List<Object[]> lists = query.getResultList();
		if(lists!=null && lists.size()>0){
			String []arry=arr;
			String total = " select count(*) FROM ("+sql2+")";
			Query countQuery = this.entityManager.createNativeQuery(total);
			Integer totalCount = Integer.valueOf(countQuery.getSingleResult().toString());
			ypcslist=CommonUtil.ArrayToMapJsonFy(totalCount,arry,lists);
		}else{
			ypcslist=CommonUtil.ArrayToMapLost();
		}
		return ypcslist;
	}

	@Override
	public Message saveZxb(HttpServletRequest request) throws Exception {
		request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
		HttpSession session = request.getSession();	
		String json = CommonUtil.readJSONString(request);	
		jsonObject = JSONObject.fromObject(json);
//		Class clz = Class.forName(jsonObject.getString("className"));
		//System.out.println("jsonObject::"+jsonObject);
		Map<String,Object> jsonMap = JSONFormat.JSONToMap(jsonObject.getString("zhuanXiang"));
		Class clz = null;
		Object entity=null;
		if(jsonMap.size() !=0){
			clz = Class.forName(jsonMap.get("beanName").toString());
//			System.out.println("clz:"+clz);
			Map<String,Object> tjMap=new HashMap<String, Object>();
			//tjMap.put("IZt", 1);
			tjMap.put("CGrbh", jsonMap.get("CGrbh"));
//			System.out.println("cgrbh::"+jsonMap.get("CGrbh"));
			List rs=baseDao.query(clz,tjMap);
			if(rs.size()>0){
				Object obj = rs.get(0);
				Set<String> keySet = jsonMap.keySet();
				Iterator<String> it = keySet.iterator();
				while(it.hasNext()){
					String property = it.next();
					Format f = new SimpleDateFormat("yyyy-MM-dd"); Date d=null;
					Format f2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); 
					if(property.substring(0, 2).equals("dt") && jsonMap.get(property)!=null){
						if(jsonMap.get(property).toString().length()>12){
							d = (Date) f2.parseObject(jsonMap.get(property).toString());
						}else{
							d = (Date) f.parseObject(jsonMap.get(property).toString());
						}
						BeanUtils.setProperty(obj, property, d);
					}else{
						BeanUtils.setProperty(obj, property, jsonMap.get(property));
					}
				}
				baseDao.update(obj);
			}else{
				entity = JSONFormat.toBean(clz,jsonMap);
				baseDao.save(entity);
			}
		}
		
		JSONArray jsonArray = JSONArray.fromObject(jsonObject.getString("suiFang"));
		Object[] object=jsonArray.toArray();
		
		for(int i=0;i<object.length;i++){
	   		Map<String,Object> map2 = json2Map(object[i].toString());
	   		Class clz2 = Class.forName(map2.get("beanName").toString());
	   		entity=null;
			String vid = map2.get("VId").toString();
			if(vid!=null && vid.length()>0){
				Object obj = baseDao.get(clz, vid);
				Set<String> keySet = map2.keySet();
				Iterator<String> it = keySet.iterator();
				while(it.hasNext()){
					String property = it.next();
					Format f = new SimpleDateFormat("yyyy-MM-dd"); Date d=null;
					Format f2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); 
					if(property.substring(0, 2).equals("dt") && jsonMap.get(property)!=null){
						if(jsonMap.get(property).toString().length()>12){
							d = (Date) f2.parseObject(jsonMap.get(property).toString());
						}else{
							d = (Date) f.parseObject(jsonMap.get(property).toString());
						}
						BeanUtils.setProperty(obj, property, d);
					}else{
						BeanUtils.setProperty(obj, property, jsonMap.get(property));
					}
				}
				baseDao.update(obj);
			}else{
				String uuid = UUID.randomUUID().toString().replaceAll("-", "");
				map2.put("VId", uuid);
				entity = JSONFormat.toBean(clz2,map2);
				baseDao.save(entity);
			}
	   	}
		Message msg = MessageManager.save();
		return msg;
	}

	@Override
	public Message saveSfxx(HttpServletRequest request) throws Exception {
		request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
		HttpSession session = request.getSession();	
		String json = CommonUtil.readJSONString(request);	
		jsonObject = JSONObject.fromObject(json);
//		Class clz = Class.forName(jsonObject.getString("className"));
		//System.out.println("jsonObject::"+jsonObject);
		JSONArray jsonArray1 = JSONArray.fromObject(jsonObject.getString("zhuanXiang"));
		Object[] object1=jsonArray1.toArray();
		Class clz = null;
		Object entity=null;
		for(int i=0;i<object1.length;i++){
			Map<String,Object> map3 = json2Map(object1[i].toString());
			clz = Class.forName(map3.get("beanName").toString());
			//Map<String,Object> tjMap=new HashMap<String, Object>();
			//tjMap.put("IZt", 1);
//			tjMap.put("CGrbh", map3.get("CGrbh"));
//			List rs=baseDao.query(clz,tjMap);
			String VId=map3.get("VId").toString();
			if(VId!=null && VId.length()>0){
				Object obj = baseDao.get(clz, VId);
				Set<String> keySet = map3.keySet();
				Iterator<String> it = keySet.iterator();
				while(it.hasNext()){
					String property = it.next();
					Format f = new SimpleDateFormat("yyyy-MM-dd"); Date d=null;
					Format f2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); 
					if(property.substring(0, 2).equals("dt") && map3.get(property)!=null){
						if(map3.get(property).toString().length()>12){
							d = (Date) f2.parseObject(map3.get(property).toString());
						}else{
							d = (Date) f.parseObject(map3.get(property).toString());
						}
						BeanUtils.setProperty(obj, property, d);
					}else{
						BeanUtils.setProperty(obj, property, map3.get(property));
					}
				}
				baseDao.update(obj);
			}else{
				String uuid = UUID.randomUUID().toString().replaceAll("-", "");
				map3.put("VId", uuid);
				entity = JSONFormat.toBean(clz,map3);
				baseDao.save(entity);
			}
		}
		JSONArray jsonArray = JSONArray.fromObject(jsonObject.getString("suiFang"));
		Object[] object=jsonArray.toArray();
		
		for(int i=0;i<object.length;i++){
	   		Map<String,Object> map2 = json2Map(object[i].toString());
	   		Class clz2 = Class.forName(map2.get("beanName").toString());
	   		entity=null;
			String vid = map2.get("VId").toString();
			if(vid!=null && vid.length()>0){
				Object obj = baseDao.get(clz, vid);
				Set<String> keySet = map2.keySet();
				Iterator<String> it = keySet.iterator();
				while(it.hasNext()){
					String property = it.next();
					Format f = new SimpleDateFormat("yyyy-MM-dd"); Date d=null;
					Format f2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); 
					if(property.substring(0, 2).equals("dt") && map2.get(property)!=null){
						if(map2.get(property).toString().length()>12){
							d = (Date) f2.parseObject(map2.get(property).toString());
						}else{
							d = (Date) f.parseObject(map2.get(property).toString());
						}
						BeanUtils.setProperty(obj, property, d);
					}else{
						BeanUtils.setProperty(obj, property, map2.get(property));
					}
				}
				baseDao.update(obj);
			}else{
				String uuid = UUID.randomUUID().toString().replaceAll("-", "");
				map2.put("VId", uuid);
				entity = JSONFormat.toBean(clz2,map2);
				baseDao.save(entity);
			}
	   	}
		Message msg = MessageManager.save();
		return msg;
	}
	
	public static Map<String, Object> json2Map(String jsonString) {  
		   return (Map<String, Object>) json2pojo(jsonString,Map.class);  
	}
	public static Object json2pojo(String jsonStr,Class javaBean){  
		JSONObject jsonObj = JSONObject.fromObject(jsonStr);  
		Object obj = JSONObject.toBean(jsonObj, javaBean);  
		return obj;  
	}

	@Override
	public String getSqglQyfwtdzrhfysmx(Map<String, Object> map, String sql,
			String[] arr) throws Exception {
		String sql2 = sql
				+ EntityUtil.getTableName(EntityUtil.getClassForNames(map.get(
						"beanName").toString()));
		sql2 = sql2 + " where V_TDID='" + map.get("VTdid").toString()
				+ "' and DEP_ID='" + map.get("depId").toString() + "'";
		Query query = this.entityManager.createNativeQuery(sql2);
		List<Object[]> lists = query.getResultList();
		if (lists != null && lists.size() > 0) {
			String[] arry = arr;
			String total = " select count(*) FROM (" + sql2 + ")";
			Query countQuery = this.entityManager.createNativeQuery(total);
			Integer totalCount = Integer.valueOf(countQuery.getSingleResult()
					.toString());
			ypcslist = CommonUtil.ArrayToMapJsonFy(totalCount, arry, lists);
		} else {
			ypcslist = CommonUtil.ArrayToMapLost();
		}
		return ypcslist;
	}

	
	@Override
	public String getGxyZx(Parameters params, int pageSize,
			int page) throws Exception {
		String param = params.getParams();
		Map<String, Object> map =JsonUtil.json2Map(param);
		String depId = map.get("depId").toString();
		Integer totalCount =0;
		Message msg =new Message();
		String sql="SELECT DEP_ID, C_ID, C_GRBH, I_GLJB, I_BSLX, I_XYG, I_XYD, I_JYYQK, I_JJYY, I_WJ, I_BLFY, I_FYBB, I_PYBB, I_BXZL, I_BYF, I_QT, V_QTYY, M_JYFY, I_NQX, I_NCX, I_NDZQX, I_XJGS, I_XJT, I_XGDM, I_XCX, I_STNB, I_SSJ, I_SCX, I_SSZ, I_GYFC, I_SFGXZ, I_ZDGCJC, I_ZDGCJCZ, I_SFZXSFH, I_ZXSFHJC, I_SFYDJC, I_SFSWMXZ, I_XTJC, I_XTJCZ, I_NDBJC, I_NDBJCZ, I_SFDMBK, I_DMBKZ, I_SFXXGJZS, V_BDCZ, V_DCZ, V_FHZ, DT_QMRQ, DT_DCRQ, DT_FHRQ, DT_JLSJ, C_CZYBH, V_BZ, DEP_NAME, I_UPLOAD, DT_UPLOAD, DT_CREATE, V_XM, I_XB, V_ZJHM, DT_CSRQ, V_YKTBH, V_BZ1, V_BZ2, V_BZ3, I_HISTO, V_GRSDBH FROM SQGL_JTCYGXYZXB " +
				"WHERE SUBSTR(DEP_ID,1,LENGTH('"+depId+"'))='"+depId+"' AND  C_GRBH IN (select sqgljtcyjb1_.C_GRBH from SQGL_JTCYJBXX sqgljtcyjb1_ where nvl(sqgljtcyjb1_.I_JBLB1, 0) = 1 and sqgljtcyjb1_.I_ZT = 1)";
		Query query=this.entityManager.createNativeQuery(sql);
		query.setFirstResult((page-1)*pageSize);
		query.setMaxResults(pageSize);
		List lists = query.getResultList();
		if(lists!=null && lists.size()>0){
			String []arry={"depId","CId","CGrbh","IGljb","IBslx","IXyg","IXyd","IJyyqk","IJjyy","IWj","IBlfy","IFybb","IPybb","IBxzl","IByf","IQt","VQtyy","MJyfy","INqx","INcx","INdzqx","IXjgs","IXjt","IXgdm","IXcx","IStnb","ISsj","IScx","ISsz","IGyfc","ISfgxz","IZdgcjc","IZdgcjcz","ISfzxsfh","IZxsfhjc","ISfydjc","ISfswmxz","IXtjc","IXtjcz","INdbjc","INdbjcz","ISfdmbk","IDmbkz","ISfxxgjzs","VBdcz","VDcz","VFhz","dtQmrq","dtDcrq","dtFhrq","dtJlsj","CCzybh","VBz","depName","IUpload","dtUpload","dtCreate","VXm","IXb","VZjhm","dtCsrq","VYktbh","VBz1","VBz2","VBz3","IHisto","VGrsdbh"};
			String total = " select count(*) FROM (" + sql + ")";
			Query countQuery = this.entityManager.createNativeQuery(total);
		 totalCount = Integer.valueOf(countQuery.getSingleResult().toString());
			ypcslist=CommonUtil.ArrayToMapJsonFy(totalCount,arry,lists);
		}else{
			ypcslist=CommonUtil.ArrayToMapLost();
		}
		return ypcslist;
	}
	
	@Override
	public String getTnbZx(Parameters params, int pageSize,
			int page) throws Exception {
		String param = params.getParams();
		Map<String, Object> map =JsonUtil.json2Map(param);
		String depId = map.get("depId").toString();
		Integer totalCount =0;
		Message msg =new Message();
		String sql="SELECT DEP_ID, C_ID, C_GRBH, I_TNBLX, N_XTSP, I_JTQK, M_JTFY, I_JJYY, I_WJ, I_PYBB, I_BYF, I_BLFY, I_BXYW, I_SYBB, I_QT, V_QTYY, I_BFJX, I_BFFJH, I_BFDMY, I_BFSJB, I_BFSWM, N_WZTZ, N_MQTZ, N_KFXT, N_FHXT, V_BDCZ, V_DCZ, V_FHZ, DT_QMRQ, DT_DCRQ, DT_FHRQ, DT_JLSJ, C_CZYBH, V_BZ, DEP_NAME, I_UPLOAD, DT_UPLOAD, DT_CREATE, V_XM, I_XB, V_ZJHM, DT_CSRQ, V_YKTBH, V_BZ1, V_BZ2, V_BZ3, I_HISTO, V_GRSDBH FROM SQGL_JTCYTNBZXB " +
				"WHERE SUBSTR(DEP_ID,1,LENGTH('"+depId+"'))='"+depId+"' AND  C_GRBH IN (select sqgljtcyjb1_.C_GRBH from SQGL_JTCYJBXX sqgljtcyjb1_ where nvl(sqgljtcyjb1_.I_JBLB5, 0) = 1 and sqgljtcyjb1_.I_ZT = 1)";
		Query query=this.entityManager.createNativeQuery(sql);
		query.setFirstResult((page-1)*pageSize);
		query.setMaxResults(pageSize);
		List lists = query.getResultList();
		if(lists!=null && lists.size()>0){
			String []arry={"depId","CId","CGrbh","ITnblx","NXtsp","IJtqk","MJtfy","IJjyy","IWj","IPybb","IByf","IBlfy","IBxyw","ISybb","IQt","VQtyy","IBfjx","IBffjh","IBfdmy","IBfsjb","IBfswm","NWztz","NMqtz","NKfxt","NFhxt","VBdcz","VDcz","VFhz","dtQmrq","dtDcrq","dtFhrq","dtJlsj","CCzybh","VBz","depName","IUpload","dtUpload","dtCreate","VXm","IXb","VZjhm","dtCsrq","VYktbh","VBz1","VBz2","VBz3","IHisto","VGrsdbh"};
			String total = " select count(*) FROM (" + sql + ")";
			Query countQuery = this.entityManager.createNativeQuery(total);
		 totalCount = Integer.valueOf(countQuery.getSingleResult().toString());
			ypcslist=CommonUtil.ArrayToMapJsonFy(totalCount,arry,lists);
		}else{
			ypcslist=CommonUtil.ArrayToMapLost();
		}
		return ypcslist;
	}
	
	
	@Override
	@Transactional
	public Message saveJtqyls(HttpServletRequest request) throws Exception {
		BASE64Decoder decoder = new BASE64Decoder(); 
		String json = CommonUtil.readJSONString(request);
		jsonObject = JSONObject.fromObject(json);
		Map<String,Object> JtqylsMap = JSONFormat.JSONToMap(jsonObject.getString("jsonString"));
		//System.out.println("jtjbxxMap：：："+jtjbxxMap);
		//JSONUtils.getMorpherRegistry().registerMorpher(new DateMorpher(new String[] {"MM/dd/yyyy HH:mm:ss"}) );
		//System.out.println("map----"+JtqylsMap.get("dtCzsj"));
		SqglXcysqyls Jtqyls=(SqglXcysqyls)JSONFormat.toBean(SqglXcysqyls.class,JtqylsMap);
		utils u=new utils();
		//System.out.println("jtjbxx::::"+jtjbxx);
		//---bean--SqglJtcyjbxx--jg--41110400100003---01
		
			this.baseDao.update(Jtqyls);
			Message msg = MessageManager.update(true);
		return msg;
	}
	
	
}