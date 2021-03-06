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

import com.sun.xml.internal.messaging.saaj.util.ByteInputStream;
import com.sun.xml.internal.messaging.saaj.util.ByteOutputStream;
import com.zrhis.base.Message;
import com.zrhis.base.Parameters;
import com.zrhis.base.dao.BaseDao;
import com.zrhis.base.service.DefaultService;
import com.zrhis.wsjd.system.bean.SqglJtcyjbxx;
import com.zrhis.wsjd.system.bean.SqglXcysqyfw;
import com.zrhis.wsjd.system.dao.IUserDao;
import com.zrhis.wsjd.system.service.LoginService;
import com.zrhis.wsjd.util.CommonUtil;
import com.zrhis.wsjd.util.DataBaseTools;
import com.zrhis.wsjd.util.JSONFormat;
import com.zrhis.wsjd.util.JsonUtil;
import com.zrhis.wsjd.util.MessageManager;
import com.zrhis.wsjd.util.PropertiesUtil;

@Service
public class LoginServiceImpl implements LoginService{
	
	@Autowired
	private DefaultService defaultService;
	
	@Autowired
	private IUserDao iuseDao;
	
	@Autowired
	private BaseDao baseDao;
	
	@PersistenceContext
	protected EntityManager entityManager;
	@Autowired
	protected DataSource dataSource;
	String ypcslist=null;
	/**
	 * 查看签约服务协议书
	 */
	@Override
	public String queryQyfwxyss(HttpServletRequest request, int page,
			int pageSize) throws Exception {
		String paramMap=new String(request.getParameter("params").getBytes("iso8859-1"),"utf-8");
		//System.out.println(paramMap);
		Map<String, Object> map =JsonUtil.json2Map(paramMap);
		map.put("beanName","com.zrhis.wsjd.system.bean.SqglXcysqyfw");
		String str = iuseDao.getDatasByParam(map,pageSize, page);
		return str;
	}
	/**
	 * 修改（回退）签约服务协议书
	 */
	@Override
	@Transactional
	public String updateQyfwxyss(HttpServletRequest request) throws Exception {
		String paramMap=new String(request.getParameter("params").getBytes("iso8859-1"),"utf-8");
		//System.out.println(paramMap);
		Map<String, Object> map =JsonUtil.json2Map(paramMap);
		String c_jth=map.get("CJth").toString();
		iuseDao.htUpdate(c_jth);
		String str = iuseDao.getDatasByCJTH(c_jth);
		return str;
	}
	/**
	 * 修改成员签约服务
	 */
	@Override
	public String updateCyQyfwxy(HttpServletRequest request) throws Exception {
		iuseDao.CyUpdate(request);
		return "1";
	}
	
	/**
	 * 修改成员签约服务
	 *//*
	@Override
	public String updateCyQyfwxy1(HttpServletRequest request) throws Exception {
		String paramMap=new String(request.getParameter("params").getBytes("iso8859-1"),"utf-8");
		Map<String, Object> map =JsonUtil.json2Map(paramMap);
		String VId=map.get("VId").toString();
		String CJth=map.get("CJth").toString();
		String NRs=map.get("NRs").toString();
		String grbhs = map.get("grbh").toString();
		iuseDao.CyUpdate1(VId, CJth, NRs);
		
		
		return null;
	}*/
	
	
	
	/**
	 * 查看家庭信息
	 */
	@Override
	public String queryJtxx(HttpServletRequest request, int page, int pageSize)
			throws Exception {
		String paramMap=new String(request.getParameter("params").getBytes("iso8859-1"),"utf-8");
		Map<String, Object> map =JsonUtil.json2Map(paramMap);
		//map.put("beanName","com.zrhis.wsjd.system.bean.SqglJtjbxx");
		//map.put("depId", "41110200420812111");
		String str = iuseDao.getJtByParam(map,pageSize, page);
		return str;
	}
	



	
	

	
	/**
	 * 保存签约服务协议书
	 */
	@Override
	public String saveQyfwxy(HttpServletRequest request) throws Exception {
		Map<String, Object> fwxy = iuseDao.saveQyfwlog(request);
		String msg = iuseDao.saveQyfwxyyz(fwxy);		
		if("该家庭已签约".equals(msg)){
			ypcslist= CommonUtil.ArrayToMapLost1(msg);
		}else{
			if("保存成功".equals(msg)){
				ypcslist= CommonUtil.ArrayToMapLost2(msg);
			}else{
			ypcslist= CommonUtil.ArrayToMapLost3(msg);
		}
	  }
		return ypcslist;
	}
	
	
	/**
	 * 重复签约人员选择签约家庭
	 */
	@Override
	public String chooseQyJt(HttpServletRequest request) throws Exception {
		String paramMap=new String(request.getParameter("params").getBytes("iso8859-1"),"utf-8");
		Map<String, Object> map = JsonUtil.json2Map(paramMap);
		String str = iuseDao.chooseQyjt(map);
		ypcslist= CommonUtil.ArrayToMapLost2(str);
		return ypcslist;
	}
	
	
	/**
	 * 保存沁阳签约服务协议书
	 */
	@Override
	public String saveQyfwxyqy(HttpServletRequest request) throws Exception {
		Message msg = iuseDao.saveQyfwxyqy(request);		
		String result=msg.getMessage();
		if("该家庭已签约".equals(result)){
			ypcslist= CommonUtil.ArrayToMapLost1(result);
		}else{
			ypcslist= CommonUtil.ArrayToMapLost2(result);
		}
		return ypcslist;
	}
	@Override
	public String delete(HttpServletRequest request, Parameters params)
			throws Exception {
		Message msg= iuseDao.delete(request, params);
		String result=msg.getMessage();
		ypcslist= CommonUtil.ArrayToMapLost2(result);
		return ypcslist;
	}
	@Override
	public String Login(HttpServletRequest request) throws Exception {
		String xcList = iuseDao.Login(request);
		return xcList;
	}
	@Override
	public String surrender(HttpServletRequest request) throws Exception {
		Message msg = iuseDao.surrender(request);	
		String str=msg.getMessage();
		ypcslist= CommonUtil.ArrayToMapLost2(str);
		return ypcslist;
	}
	@Override
	public String regions(HttpServletRequest request) throws Exception {
		String parentId=request.getParameter("parentId");
		//String parentId="41000000000000000";
		String ypcslist = iuseDao.getSqjgxxByParentId(parentId);
		return ypcslist;
	}
	@Override
	public String query(HttpServletRequest request, Parameters params)
			throws Exception {
		Message message = defaultService.query(request, params);		
		List<Object[]> li=new ArrayList<Object[]>();
		List list=message.getRoots();
		//循环取出多条数据的每一条的每个参数的值
		if(list.size()>0){
			for(int j=0;j<list.size();j++){
				Object obj=list.get(j);
				Field[] f = obj.getClass().getDeclaredFields();
				Object[] val=new Object[f.length];
				for(int i=0;i<f.length;i++){
					Field ft = f[i];
					ft.setAccessible(true);		
					if(ft.get(obj)!=null){
						val[i]=ft.get(obj);
					}else{
						val[i]="";
					}
				}
				li.add(val);
			}
			//取出其中一条的参数名称
			Object o=list.get(0);
			Field[] f1 = o.getClass().getDeclaredFields();
			String []key=new String[f1.length];
			for(int i=0;i<f1.length;i++){
				Field ft = f1[i];
				ft.setAccessible(true);
				key[i]=ft.getName();			
			}
			//封装成json
			int count=message.getTotalCount();
			ypcslist=CommonUtil.ArrayToMapJsonFy(count,key,li);
			//System.out.println(ypcslist);
		}else{
			ypcslist=CommonUtil.ArrayToMapLost();
		}
		return ypcslist;
	}
	
	
	@Override
	public String getGxyZx(HttpServletRequest request, Parameters params,int page,int pageSize)
			throws Exception {
		 String ypcslist = iuseDao.getGxyZx(params, pageSize, page);
		return ypcslist;
	}
	
	
	/**
	 * 下载高血压专项信息
	 */
	@Override
	public String queryTnbZx(Parameters params, int page,
			int pageSize) throws Exception {
		String ypcslist = iuseDao.getTnbZx(params, pageSize, page);
		return ypcslist;
	}
	
	
	
	@Override
	public String getEntity(Class class1, String id) throws Exception {
		Message message = defaultService.getEntity(class1, id);	
		Object obj=message.getData();
		Field[] f = obj.getClass().getDeclaredFields();
		List<Object[]> lists = new ArrayList<Object[]>();
		String []key=new String[f.length];
		Object [] val=new Object[f.length];
		for(int i=0;i<f.length;i++){
			Field ft = f[i];
			ft.setAccessible(true);
			key[i]=ft.getName();			
			if(ft.get(obj)!=null){
				val[i]=ft.get(obj);
			}else{
				val[i]="";
			}
			//System.out.println(ft.getName()+" - "+ft.get(obj));
		}
		lists.add(val);
		ypcslist= CommonUtil.ArrayToMap(key, lists);
		//System.out.println("ypcslist===="+ypcslist);
		return ypcslist;	
	}
	@Override
	public String saveGxhfwxy(HttpServletRequest request) throws Exception {
		Message msg = iuseDao.saveGxhfwxy(request);		
		String result=msg.getMessage();
		ypcslist= CommonUtil.ArrayToMapLost2(result);
		return ypcslist;
	}
	@Override
	public String queryJtcyxx(HttpServletRequest request) throws Exception {
		String paramMap=new String(request.getParameter("params").getBytes("iso8859-1"),"utf-8");
		int page=Integer.parseInt(new String(request.getParameter("page").getBytes("iso8859-1"),"utf-8"));
		int pageSize=Integer.parseInt(new String(request.getParameter("pageSize").getBytes("iso8859-1"),"utf-8"));
//		System.out.println(request.getParameter("totalCount"));
		int count=Integer.parseInt(new String(request.getParameter("totalCount").getBytes("iso8859-1"),"utf-8"));
		//System.out.println("page::::"+page+"    pageSIze:::::"+pageSize);
		Map<String, Object> map =JsonUtil.json2Map(paramMap);
		//Map<String, Object> map=new HashMap<String, Object>();
		map.put("beanName", "com.zrhis.wsjd.system.bean.SqglJtcyjbxx");
		//map.put("CJth", "41110200400050");
		String str = iuseDao.queryJtcyxx(map,page,pageSize,count);
		System.out.println("555");
		return str;
	}
	@Override
	public String queryQyjtfwjl(HttpServletRequest request, int page,
			int pageSize) throws Exception {
		String paramMap=new String(request.getParameter("params").getBytes("iso8859-1"),"utf-8");
		Map<String, Object> map =JsonUtil.json2Map(paramMap);
		//Map<String, Object> map =new HashMap<String, Object>();
		map.put("beanName","com.zrhis.wsjd.system.bean.SqglQyjtfwjl");
		//map.put("depId", "41110200420812111");
		String str = iuseDao.queryQyjtfwjl(map,pageSize, page);
		return str;
	}
	
	
	@Override
	public String saveQyjtfwjl(HttpServletRequest request) throws Exception {
		Message msg = iuseDao.saveQyjtfwjl(request);		
		String result=msg.getMessage();
		ypcslist= CommonUtil.ArrayToMapLost2(result);
		return ypcslist;
	}
	
	@Override
	public String saveQyjtfwjllw(HttpServletRequest request) throws Exception {
		Message msg = iuseDao.saveQyjtfwjllw(request);		
		String result=msg.getMessage();
		ypcslist= CommonUtil.ArrayToMapLost2(result);
		return ypcslist;
	}
	
	@Override
	public String saveQyfwzrtdhf(HttpServletRequest request) throws Exception {
		Message msg = iuseDao.saveQyfwzrtdhf(request);		
		String result=msg.getMessage();
		ypcslist= CommonUtil.ArrayToMapLost2(result);
		return ypcslist;
	}
	@Override
	public String queryJtxxsy(HttpServletRequest request) throws Exception {
		String paramMap=new String(request.getParameter("params").getBytes("iso8859-1"),"utf-8");
		Map<String, Object> map =JsonUtil.json2Map(paramMap);
		map.put("beanName","com.zrhis.wsjd.system.bean.SqglJtjbxx");
		//map.put("depId", "41110200420812111");
		String str = iuseDao.getJtByParamsy(map);
		return str;
	}
	@Override
	public String onloadQyfwxyss(HttpServletRequest request) throws Exception {
		String paramMap=new String(request.getParameter("params").getBytes("iso8859-1"),"utf-8");
		Map<String, Object> map =JsonUtil.json2Map(paramMap);
		map.put("beanName","com.zrhis.wsjd.system.bean.SqglXcysqyfw");
		String str = iuseDao.getQyfwxyss(map);
		//System.out.println("str----"+str);
		return str;
	}
	@Override
	public String onloadQyfwxysw(HttpServletRequest request) throws Exception {
		String paramMap=new String(request.getParameter("params").getBytes("iso8859-1"),"utf-8");
		Map<String, Object> map =JsonUtil.json2Map(paramMap);
		String str = iuseDao.getQyfwxysw(map);
		return str;
	}
	@Override
	public String onloadQyfwxyXy(HttpServletRequest request) throws Exception {
		String paramMap=new String(request.getParameter("params").getBytes("iso8859-1"),"utf-8");
		Map<String, Object> map =JsonUtil.json2Map(paramMap);
		String str = iuseDao.getQyfwxyXy(map);
		return str;
	}
	
	@Override
	public String getQyfwzrtdhf(HttpServletRequest request, Parameters params)
			throws Exception {
		String paramMap=new String(request.getParameter("params").getBytes("iso8859-1"),"utf-8");
		Map<String, Object> map =JsonUtil.json2Map(paramMap);
		map.put("beanName","com.zrhis.wsjd.system.bean.SqglQyfwtdzrhf");
		String sql="SELECT V_ID, DEP_ID, DEP_NAME, V_YLJGH, V_YLJGMC, V_YY, V_ZWSY, V_XZ, V_ZRQY, V_ZRQYRKS, C_CZYBH, DT_CREATE, V_CWSS, V_ZRYS1, V_LXDH1, V_ZRYS2, V_LXDH2, V_QJYY, V_ZRYS3, V_LXDH3, V_SJYLJG, V_ZRYS4, V_LXDH4,V_XZCY, V_GZTP from Sqgl_Qyfwtdzrhf ";
		String[] arry={"VId","depId","depName","VYljgh","VYljgmc","VYy","VZwsy","VXz","VZrqy","VZrqyrks","CCzybh","dtCreate","VCwss","VZrys1","VLxdh1","VZrys2","VLxdh2","VQjyy","VZrys3","VLxdh3","VSjyljg","VZrys4","VLxdh4","VXzcy","VGztp"};
		String str = iuseDao.getByParamsy(map,sql,arry,1);
		return str;
	}

	@Override
	public String getQyfwzrtdhfqy(HttpServletRequest request, Parameters params)
			throws Exception {
		String paramMap=new String(request.getParameter("params").getBytes("iso8859-1"),"utf-8");
		//System.out.println("paramMapparamMapparamMapparamMap"+paramMap);
		Map<String, Object> map =JsonUtil.json2Map(paramMap);
		map.put("beanName","com.zrhis.wsjd.system.bean.SqglQyfwtdzrhf");
		String sql="SELECT V_ID, DEP_ID, DEP_NAME, V_YLJGH, V_YLJGMC, V_YY, V_ZWSY, V_XZ, V_ZRQY, V_ZRQYRKS, C_CZYBH, DT_CREATE, V_CWSS, V_ZRYS1, V_LXDH1, V_ZRYS2, V_LXDH2, V_QJYY, V_ZRYS3, V_LXDH3, V_SJYLJG, V_ZRYS4, V_LXDH4,V_XZCY,V_TDMC,V_ZZXM,V_ZZDH,DEP_ZNAME,DEP_XNAME,V_YYDH, V_GZTP from Sqgl_Qyfwtdzrhf ";
		String[] arry={"VId","depId","depName","VYljgh","VYljgmc","VYy","VZwsy","VXz","VZrqy","VZrqyrks","CCzybh","dtCreate","VCwss","VZrys1","VLxdh1","VZrys2","VLxdh2","VQjyy","VZrys3","VLxdh3","VSjyljg","VZrys4","VLxdh4","VXzcy","VTdmc","VZzxm","VZzdh","depZname","depXname","VYydh","VGztp"};
		String str = iuseDao.getByParamsy(map,sql,arry,1);
		str=str.replace("null", "");
		//System.out.println("strstrstrstrstr:"+str);
		JSONObject jo = JSONObject.fromObject(str);
		Map<String, Object> map1 =JsonUtil.json2Map(paramMap);
		if(null!=jo.get("data")){
		JSONArray ja = jo.getJSONArray("data");
		//System.out.println(ja.size());
		for (int i = 0; i < ja.size(); i++) {
			map1.put("VTdid", JSONObject.fromObject(ja.get(i)).get("VId"));
			map1.put("depId", JSONObject.fromObject(ja.get(i)).get("depId"));
			map1.put("beanName","com.zrhis.wsjd.system.bean.SqglQyfwtdzrhfysmx");
			String sqlmx="select V_ID,V_TDID,V_YSXM,V_YSDH,V_YLJGH,V_YLJGMC,DEP_ID,DEP_NAME,V_YLJGJB,V_TDMC,V_ZZXM  from  SQGL_QYFWTDZRHFYSMX ";
			String[] arrymx={"VId","VTdid","VYsxm","VYsdh","VYljgh","VYljgmc","depId","depName","VYljgjb","VTdmc","VZzxm"};
			String strmx = iuseDao.getSqglQyfwtdzrhfysmx(map1,sqlmx,arrymx);
			Map<String, Object> map2 =JsonUtil.json2Map(ja.get(i).toString());
			if(!"null".equals(JSONObject.fromObject(strmx).get("data").toString())&&null!=(JSONObject.fromObject(strmx).get("data"))){
				strmx=strmx.replace("null", "");
				map2.put("cymx", JSONObject.fromObject(strmx).get("data"));
			}else{
				JSONArray jn = new JSONArray();
				map2.put("cymx", jn);
			}
			ja.set(i, JSONObject.fromObject(map2));
		}
		jo.remove("data");
		jo.put("data", ja);
		}
		//System.out.println("rrrrrrrrrrrr"+jo.toString());
		return jo.toString();
	}
	@Override
	public String getZrys(HttpServletRequest request, Parameters params)
			throws Exception {
		String paramMap=new String(request.getParameter("params").getBytes("iso8859-1"),"utf-8");
		Map<String, Object> map =JsonUtil.json2Map(paramMap);
		map.put("beanName","com.zrhis.wsjd.system.bean.XtglZrys");
		String sql="select z.V_ID, z.Dep_ID, z.C_BH, z.V_MC, z.V_BZ V_BZ_YS, s.Pre_ID, s.V_NAME, s.I_LEVEL, s.C_CZYBH, s.PRAENT_ID, s.DT_DJSJ, s.V_BZ V_BZ_JG, s.V_PATH, s.I_SFZXS, s.ONE_ID, s.TWO_ID, s.THR_ID, s.FOU_ID, s.FIV_ID, s.CXSX_ID, s.CXFL_ID, s.V_POSTAL, s.V_PATH_MC, s.V_SZPCS from ";
		String []arr={"VId","depId","CBh","VMc","VBz","preId","VName","ILevel","CCzybh","praentId","dtDjsj","VBzJg","VPath","ISfzxs","oneId","twoId","thrId","fouId","fivId","cxsxId","cxflId","VPostal","VPathmc","VSzpcs"};
		String str = iuseDao.getZrysOrZrhs(map,sql,arr);
		return str;
	}

	@Override
	public String getZrhs(HttpServletRequest request, Parameters params)
			throws Exception {
		String paramMap=new String(request.getParameter("params").getBytes("iso8859-1"),"utf-8");
		Map<String, Object> map =JsonUtil.json2Map(paramMap);
		map.put("beanName","com.zrhis.wsjd.system.bean.XtglZrhs");
		String sql="select z.V_ID, z.Dep_ID, z.C_BH, z.V_MC, z.V_BZ V_BZ_HS, s.Pre_ID, s.V_NAME, s.I_LEVEL, s.C_CZYBH, s.PRAENT_ID, s.DT_DJSJ, s.V_BZ V_BZ_JG, s.V_PATH, s.I_SFZXS, s.ONE_ID, s.TWO_ID, s.THR_ID, s.FOU_ID, s.FIV_ID, s.CXSX_ID, s.CXFL_ID, s.V_POSTAL, s.V_PATH_MC, s.V_SZPCS from ";
		String []arr={"VId","depId","CBh","VMc","VBz","preId","VName","ILevel","CCzybh","praentId","dtDjsj","VBzJg","VPath","ISfzxs","oneId","twoId","thrId","fouId","fivId","cxsxId","cxflId","VPostal","VPathmc","VSzpcs"};
		String str = iuseDao.getZrysOrZrhs(map,sql,arr);
		return str;
	}
	@Override
	public String getZu(HttpServletRequest request, Parameters params)
			throws Exception {
		String paramMap=new String(request.getParameter("params").getBytes("iso8859-1"),"utf-8");
		Map<String, Object> map =JsonUtil.json2Map(paramMap);
		map.put("beanName","com.zrhis.wsjd.system.bean.XtglZu");
		String str = iuseDao.getZu(map);
		return str;
	}
	@Override
	public String getYyxx(HttpServletRequest request, Parameters params)
			throws Exception {
		String paramMap=new String(request.getParameter("params").getBytes("iso8859-1"),"utf-8");
		Map<String, Object> map =JsonUtil.json2Map(paramMap);
		map.put("beanName","com.zrhis.wsjd.system.bean.XtglYyxx");
		String sql="select z.V_ID, s.Dep_ID, z.C_BH, z.V_MC, z.V_DZ, z.V_DH, z.V_SSGJ, z.I_LB, z.C_DJHM , z.V_BZ V_BZ_YY, z.PARENT_ID, z.I_ZDQY, z.I_CFJW , z.I_QYYZ, z.I_HYKC, z.I_PDKC, z.N_FPGD, z.N_FPKD, z.I_YKMS, z.I_SFZDSC, z.V_JKYH, z.V_JKYHKL, z.I_Chnd, z.V_JKFS, z.V_FWQDZ, z.V_SJKMC, z.I_JKYXBS, z.V_SDX, z.V_ZDS, z.I_DZFS, z.I_IPPZFS, s.Pre_ID, s.V_NAME, s.I_LEVEL, s.C_CZYBH, s.PRAENT_ID, s.DT_DJSJ, s.V_BZ V_BZ_JG, s.V_PATH, s.I_SFZXS, s.ONE_ID, s.TWO_ID, s.THR_ID, s.FOU_ID, s.FIV_ID, s.CXSX_ID, s.CXFL_ID, s.V_POSTAL, s.V_PATH_MC, s.V_SZPCS from ";
		String []arr={"VId","depId","CBh","VMc","VDz","VDh","VSsgj","ILb","CDjhm","VBzYy","parentId","IZdqy","ICfjw","IQyyz","IHykc","IPdkc","NFpgd","NFpkd","IYkms","ISfzdsc","VJkyh","VJkyhkl","IChnd","VJkfs","VFwqdz","VSjkmc","IJkyxbs","VSdx","VZds","IDzfs","IIppzfs","preId","VName","ILevel","CCzybh","praentId","dtDjsj","VBzJg","VPath","ISfzxs","ONeid","TWoid","THrid","FOuid","FIvid","CXsxid","CXflid","VPostal","VPathmc","VSzpcs"};
		String str = iuseDao.getZrysOrZrhs(map,sql,arr);
		return str;
	}
	@Override
	public String getJwh(HttpServletRequest request, Parameters params)
			throws Exception {
		String paramMap=new String(request.getParameter("params").getBytes("iso8859-1"),"utf-8");
		Map<String, Object> map =JsonUtil.json2Map(paramMap);
		map.put("beanName","com.zrhis.wsjd.system.bean.XtglJwh");
		String sql="select j.V_ID, j.Dep_ID , j.C_BH , j.C_SSXZ, j.V_MC, j.V_BZ from ";
		String []arr={"VId","depId","CBh","CSsxz","VMc","VBz"};
		String str = iuseDao.getJwh(map,sql,arr);
		return str;
	}
	@Override
	public String queryMz(HttpServletRequest request)
			throws Exception {
		Map<String ,Object> map =new HashMap<String, Object>();
		map.put("beanName", "com.zrhis.wsjd.system.bean.XtglMz");
		String sql="select C_BH,V_MC,V_BZ,V_CODE,DT_CREATE from ";
		String []arr={"CBh","VMc","VBz","VCode","dtCreate"};
		String str = iuseDao.getZd(map,sql,arr);
		return str;
	}
	@Override
	public String queryWhcd(HttpServletRequest request)
			throws Exception {
		Map<String ,Object> map =new HashMap<String, Object>();
		map.put("beanName", "com.zrhis.wsjd.system.bean.XtglWhcd");
		String sql="select C_BH,V_MC,V_BZ,V_CODE,DT_CREATE from ";
		String []arr={"CBh","VMc","VBz","VCode","dtCreate"};
		String str = iuseDao.getZd(map,sql,arr);
		return str;
	}
	@Override
	public String queryZy(HttpServletRequest request)
			throws Exception {
		Map<String ,Object> map =new HashMap<String, Object>();
		map.put("beanName", "com.zrhis.wsjd.system.bean.XtglZy");
		String sql="select C_BH,V_MC,V_BZ,V_CODE,DT_CREATE,I_ZD from ";
		String []arr={"CBh","VMc","VBz","VCode","dtCreate","IZd"};
		String str = iuseDao.getZd(map,sql,arr);
		return str;
	}
	@Override
	public String queryHzgxb(HttpServletRequest request)
			throws Exception {
		Map<String ,Object> map =new HashMap<String, Object>();
		map.put("beanName", "com.zrhis.wsjd.system.bean.XtglHzgxb");
		String sql="select C_BH,V_MC,V_BZ,V_CODE,DT_CREATE from ";
		String []arr={"CBh","VMc","VBz","VCode","dtCreate"};
		String str = iuseDao.getZd(map,sql,arr);
		return str;
	}
	@Override
	public String saveJtcyxx(HttpServletRequest request) throws Exception {
		Message msg = iuseDao.saveJtcyxx(request);		
		String result=msg.getMessage();
		ypcslist= CommonUtil.ArrayToMapLost2(result);
		return ypcslist;
	}
	@Override
	public String getFwjl(HttpServletRequest request, Parameters params)
			throws Exception {
		String paramMap=new String(request.getParameter("params").getBytes("iso8859-1"),"utf-8");
		Map<String, Object> map =JsonUtil.json2Map(paramMap);
		map.put("beanName", "com.zrhis.wsjd.system.bean.SqglQyjtfwjllw");
		String sql="select DEP_NAME,DEP_ID,C_JTH,C_GRBH,V_HZXM,DT_FWSJ,V_JTDH,V_ZRYS1 from ";
		String []arr={"depName","depId","Cjth","CGrbh","VXm","dtFwsj","VJtdh","VZrys1"};
		String str = iuseDao.getFwjl(map,sql,arr);
		return str;
	}
	
	@Override
	@Transactional
	public String deleteJtcyxx(HttpServletRequest request, Parameters params)
			throws Exception {
		String json = CommonUtil.readJSONString(request);
		JSONObject jsonObject = JSONObject.fromObject(json);
		String sql="delete from  Sqgl_Jtcyjbxx where C_GRBH='"+jsonObject.getString("CGrbh")+"'";
		Query query=entityManager.createNativeQuery(sql);
		int k=query.executeUpdate();
		String str="";
		if(k>0){
			str="删除成功！";
			deleteJtcyxx1(jsonObject);
		}else{
			str="删除失败";
		}		
		ypcslist= CommonUtil.ArrayToMapLost2(str);
		return ypcslist;
	}

	public String deleteJtcyxx1(JSONObject jsonObject) throws Exception {
		Connection conn = null;
		Connection conn2 = null;
		ResultSet rs = null;
		PreparedStatement ps = null;
		int k = 0;

		//SqglJtcyjbxx SqglJtcyjbxx = (SqglJtcyjbxx) baseDao.get(SqglJtcyjbxx.class, jsonObject.get("CGrbh").toString());

		try {
			
		String sql3 = "select V_CYXX  from SQGL_XCYSQYFW where C_JTH=?";
		conn = dataSource.getConnection();
		ps = conn.prepareStatement(sql3, ResultSet.TYPE_SCROLL_INSENSITIVE,
				ResultSet.CONCUR_READ_ONLY);
		ps.setString(1, jsonObject.get("CJth").toString());
		rs = ps.executeQuery();
		rs.last();
		int rowCount = rs.getRow();
		rs.beforeFirst();
		if (rowCount > 0) {
			Connection conn1 = null;
			while (rs.next()) {
				String V_Cyxx = rs.getString(1);
				JSONObject data = JSONObject.fromObject(V_Cyxx);
				JSONArray ja = (JSONArray) data.get("data");
				// System.out.println("11111111111"+data.get("data"));
				// System.out.println("22222222222"+ja);
				if (ja != null && ja.size() > 0) {
					for (int i = 0; i < ja.size(); i++) {
						JSONObject job = ja.getJSONObject(i);
						if ((jsonObject.get("CGrbh").toString()).equals(
								job.get("geRenBianHao"))) {
							ja.remove(i);
							break;
						}
					}

					JSONObject JSONObjectNew = new JSONObject();
					JSONObjectNew.put("data", ja);

					String sql4 = "UPDATE SQGL_XCYSQYFW SET V_CYXX = ?  WHERE C_JTH=?";

					conn1 = this.dataSource.getConnection();
					ps = conn1.prepareStatement(sql4);
					ps.setString(1, (ja.size()==0?"":JSONObjectNew.toString()));
					ps.setString(2, jsonObject.get("CJth").toString());
					k = ps.executeUpdate();
					// System.out.println("kkkkkkkkkkkkkkkkk"+k);
					// System.out.println("SqglJtcyjbxx.getCJth()"+SqglJtcyjbxx.getCJth());
				}

			}
			
			ps.close();
			if(conn1!=null){
				conn1.close();
			}
		}

		// 删除成员同时要删除乡村医生签约服务家庭成员表中的成员信息
		String sql = "delete from  SQGL_XCYSQYFWJTCY  WHERE C_GRBH='"
				+ jsonObject.get("CGrbh").toString() + "'";
		//System.out.println("3333333333" + sql);
		conn2 = this.dataSource.getConnection();
		ps = conn2.prepareStatement(sql);
		k = ps.executeUpdate();
		
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			ps.close();
			if(conn!=null){
				conn.close();
			}
			if(conn2!=null){
				conn2.close();
			}	
		}

		ypcslist = CommonUtil.ArrayToMapLost2("注销成功");

		return ypcslist;
	}
	
	@Override
	@Transactional
	public String deleteCancel(HttpServletRequest request)
			throws Exception {	
		//Date d1 = new Date();
		Connection conn = null;
		
		Connection conn2 = null;
		ResultSet rs = null;
		PreparedStatement ps =null;
		int k=0;	
		try {
			
		
		//Message msg=new Message();
		String json = CommonUtil.readJSONString(request);
		JSONObject jsonObject = JSONObject.fromObject(json);
		//System.out.println(jsonObject.getString("CGrbh"));
		//Date d2 = new Date();
		//System.out.println("第一段时间"+(d2.getTime()-d1.getTime()));
		SqglJtcyjbxx SqglJtcyjbxx = (SqglJtcyjbxx)baseDao.get(SqglJtcyjbxx.class,jsonObject.get("CGrbh").toString());
		SqglJtcyjbxx.setIZt(0);
		
		
		String sql3="select V_CYXX  from SQGL_XCYSQYFW where C_JTH=?";
		conn =dataSource.getConnection();
		ps=conn.prepareStatement(sql3,ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
		ps.setString(1, SqglJtcyjbxx.getCJth());
		rs=ps.executeQuery();
		rs.last();
		int rowCount = rs.getRow();
		rs.beforeFirst(); 
		if(rowCount>0){
			Connection conn1 = null;
			while(rs.next()){
				String V_Cyxx=rs.getString(1);
				JSONObject data = JSONObject.fromObject(V_Cyxx);
				JSONArray ja = (JSONArray)data.get("data");
				//System.out.println("11111111111"+data.get("data"));
				//System.out.println("22222222222"+ja);
				if(ja!=null&&ja.size()>0){
					for (int i = 0; i < ja.size(); i++) {
						 JSONObject job = ja.getJSONObject(i);
						 if(SqglJtcyjbxx.getCGrbh().equals(job.get("geRenBianHao"))){
							 ja.remove(i);
							 break;
						 }
					}
					
					JSONObject JSONObjectNew = new JSONObject();
					JSONObjectNew.put("data", ja);
					
					String sql4="UPDATE SQGL_XCYSQYFW SET V_CYXX = ?  WHERE C_JTH=?";
					
					
					conn1 = this.dataSource.getConnection();
					ps = conn1.prepareStatement(sql4);
					ps.setString(1, (ja.size()==0?"":JSONObjectNew.toString()));
					ps.setString(2, SqglJtcyjbxx.getCJth().toString());
					k=ps.executeUpdate();
					//System.out.println("kkkkkkkkkkkkkkkkk"+k);
					//System.out.println("SqglJtcyjbxx.getCJth()"+SqglJtcyjbxx.getCJth());
					
				}
				
			}
			
			ps.close();
			if(conn1!=null){
				conn1.close();
			}
		}
		
		
		
		//注销成员同时要解约乡村医生签约服务家庭成员表中的成员信息
		String sql="UPDATE SQGL_XCYSQYFWJTCY SET I_ZT = 1,I_ZXZT=0 WHERE C_GRBH='"+SqglJtcyjbxx.getCGrbh()+"'";
		//System.out.println("3333333333"+sql);
		conn2 = this.dataSource.getConnection();
		ps = conn2.prepareStatement(sql);
		k=ps.executeUpdate();
		
		SqglJtcyjbxx.setIQyzt(1);
		baseDao.update(SqglJtcyjbxx);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			ps.close();
			if(conn!=null){
				conn.close();
			}
			if(conn2!=null){
				conn2.close();
			}
		}
		
		
		ypcslist= CommonUtil.ArrayToMapLost2("注销成功");

		return ypcslist;
	}
	@Override
	public String saveJtjbxx(HttpServletRequest request) throws Exception {
		String jth = iuseDao.saveJtjbxx(request);
		String str="{\"code\":1,\"message\":\"OK\",\"result\":\"成功\",\"data\":{\"CJth\":\""+jth+"\"}}";
		return str;
	}
	@Override
	@Transactional
	public String jtjbxxCancel(HttpServletRequest request) throws Exception {
		Connection conn = null;
		ResultSet rs = null;
		PreparedStatement ps =null;
		int k=0;
		try {
		String json = CommonUtil.readJSONString(request);
		JSONObject jsonObject = JSONObject.fromObject(json);
		//System.out.println(jsonObject.getString("CJth"));
		String sql="UPDATE SQGL_JTJBXX SET I_ZT = 0,I_QYZT = 1  WHERE C_JTH='"+jsonObject.getString("CJth")+"'";
		//System.out.println("sqlsqlsqlsqlsqlsqlsqlsql"+sql);
		conn = this.dataSource.getConnection();
		ps = conn.prepareStatement(sql);
		k=ps.executeUpdate();
		//System.out.println("kkkkkkk"+k);
		conn.close();
		
		String sql3="UPDATE SQGL_JTCYJBXX SET I_ZT = 0,I_QYZT = 1  WHERE C_JTH='"+jsonObject.getString("CJth")+"'";
		conn = this.dataSource.getConnection();
		ps = conn.prepareStatement(sql3);
		k=ps.executeUpdate();
		conn.close();
		
		String sql1="UPDATE SQGL_XCYSQYFW SET I_ZT= ?,V_CYXX=?,I_ZXZT=?  WHERE C_JTH=?";
		conn = this.dataSource.getConnection();
		System.out.println("jsonObject.getString"+jsonObject.getString("CJth"));
		ps = conn.prepareStatement(sql1);
		ps.setInt(1, 1);
		ps.setString(2, "");
		ps.setInt(3, 0);
		ps.setString(4, jsonObject.getString("CJth").toString());
		k=ps.executeUpdate();
		//System.out.println("k1k1k1k1k1"+k);
		conn.close();
		
		String sql2="UPDATE SQGL_XCYSQYFWJTCY SET I_ZT= 1,I_ZXZT=0  WHERE C_JTH='"+jsonObject.getString("CJth")+"'";
		conn = this.dataSource.getConnection();
		ps = conn.prepareStatement(sql2);
		k=ps.executeUpdate();
		//System.out.println("k2k2k2k2k2"+k);
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			ps.close();
			if(conn!=null){
				conn.close();
			}	
		}
		
		//Query query=entityManager.createNativeQuery(sql);
		//query.executeUpdate();
		ypcslist= CommonUtil.ArrayToMapLost2("注销成功");
		return ypcslist;
	}
	@Override
	public String jtjbxxDelete(HttpServletRequest request) throws Exception {
		
		Connection conn = null;
		ResultSet rs = null;
		PreparedStatement ps =null;
		int k=0;	
		try {
		String json = CommonUtil.readJSONString(request);
		JSONObject jsonObject = JSONObject.fromObject(json);
		//System.out.println(jsonObject.getString("CJth"));
		String sql="delete from  SQGL_JTJBXX   WHERE C_JTH='"+jsonObject.getString("CJth")+"'";
		//System.out.println("sqlsqlsqlsqlsqlsqlsqlsql"+sql);
		conn = this.dataSource.getConnection();
		ps = conn.prepareStatement(sql);
		k=ps.executeUpdate();
		//System.out.println("kkkkkkk"+k);
		conn.close();
		
		String sql3="delete from  SQGL_JTCYJBXX   WHERE C_JTH='"+jsonObject.getString("CJth")+"'";
		conn = this.dataSource.getConnection();
		ps = conn.prepareStatement(sql3);
		k=ps.executeUpdate();
		conn.close();
		
		String sql1="delete from   SQGL_XCYSQYFW   WHERE C_JTH=?";
		conn = this.dataSource.getConnection();
		System.out.println("jsonObject.getString"+jsonObject.getString("CJth"));
		ps = conn.prepareStatement(sql1);
		ps.setString(1, jsonObject.getString("CJth").toString());
		k=ps.executeUpdate();
		//System.out.println("k1k1k1k1k1"+k);
		conn.close();
		
		String sql2="delete from   SQGL_XCYSQYFWJTCY   WHERE C_JTH='"+jsonObject.getString("CJth")+"'";
		conn = this.dataSource.getConnection();
		ps = conn.prepareStatement(sql2);
		k=ps.executeUpdate();
		//System.out.println("k2k2k2k2k2"+k);
		
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			ps.close();
			if (conn != null) {
				conn.close();
			}
		}

		//Query query=entityManager.createNativeQuery(sql);
		//query.executeUpdate();
		ypcslist= CommonUtil.ArrayToMapLost2("注销成功");
		return ypcslist;
	}
	@Override
	public String queryPcs(HttpServletRequest request) throws Exception {
		Map<String ,Object> map =new HashMap<String, Object>();
		map.put("beanName", "com.zrhis.wsjd.system.bean.XtglPcs");
		String sql="select C_BH,V_MC,V_BZ,DEP_ID,DT_CREATE,N_SXBZ from ";
		String []arr={"CBh","VMc","VBz","depId","dtCreate","NSxbz"};
		String str = iuseDao.getZd(map,sql,arr);
		return str;
	}
	@Override
	public String queryJtlx(HttpServletRequest request) throws Exception {
		Map<String ,Object> map =new HashMap<String, Object>();
		map.put("beanName", "com.zrhis.wsjd.system.bean.XtglJtlx");
		String sql="select C_BH,V_MC,V_BZ,V_CODE,DT_CREATE from ";
		String []arr={"CBh","VMc","VBz","VCode","dtCreate"};
		String str = iuseDao.getZd(map,sql,arr);
		return str;
	}
	@Override
	public String queryDepId(HttpServletRequest request, Parameters params) throws Exception {
		String depId=new String(request.getParameter("params").getBytes("iso8859-1"),"utf-8");
//		String depId="41018110021233122";
		
		int kg=0;
		Connection conn = null;
		ResultSet rs = null;
		PreparedStatement ps =null;	
		List<Map<String,String>> ls=new ArrayList<Map<String,String>>();
		while(kg==0){
			String sql="select dep_id,praent_id,i_level from SQGL_SQJGXX where dep_id='"+depId+"'";
			conn = this.dataSource.getConnection();
			ps = conn.prepareStatement(sql);
			rs=ps.executeQuery();
			List<Map<String,String>> list =DataBaseTools.resultSetToList(rs);
			if(list!=null && list.size()>0){
				Map<String ,String> map =new HashMap<String, String>();
				map.put("praentId", list.get(0).get("PRAENT_ID"));
				map.put("depId", list.get(0).get("DEP_ID"));
				map.put("ILevel", list.get(0).get("I_LEVEL"));
				depId=map.get("praentId");
				ls.add(map);
			}else{
				kg=1;
			}
		}
		JSONArray json=JSONFormat.toJson(ls);
		ypcslist= CommonUtil.ArrayToMapLost3("true",json.toString());
		ps.close();
		rs.close();
		conn.close();
		return ypcslist;
	}
	@Override
	public String getJktj(HttpServletRequest request, Parameters params) throws Exception {
		Map<String ,Object> map =new HashMap<String, Object>();
		String sql="SELECT DEP_ID, V_ID, C_ID, C_GRBH, DT_TJRQ, V_XL, V_XZXL, V_XYD, V_XYG, V_FB, V_GB, V_PB, V_NYJ, V_NYS, N_SG, N_TZ, V_TZ1, V_TZ2, V_LBJ, V_GJ, V_SZ, V_GM, V_PF, V_WYJ, V_WYS, V_BZ, V_PFHW, V_XFS, V_GJFS, V_JL, V_JZL, V_GJYD, V_GJYC, V_SC, V_BLFS, I_YWZZ, I_TT, I_TY, I_XJ, I_XM, I_XT, I_MXKS, I_KT, I_HXKN, I_DY, I_DN, I_TZXJ, I_FL, I_GJZT, I_SLMH, I_SJMM, I_NJ, I_NT, I_BM, I_FX, I_EXOT, I_YH, I_EM, I_RFZT, I_QTZZ, V_QTZZ, N_TW, V_ML, V_HXPL, V_YXYG, V_YXYD, N_YW, N_TUNW, V_YTBZ1, V_YTBZ2, I_RZGN, N_RZFS, I_QGZT, N_QGFS, I_PF, I_GM, V_GMQT, I_LBJ, I_TZX, I_HXY, V_HXYYC, I_FLY, I_YWZY, V_XZZY, I_FYT, V_FYT, I_FBK, V_FBK, I_FGD, V_FGD, I_FPD, V_FPD, I_YDZY, V_YDZY, I_XZSZ, I_ZBDMBD, I_GMZZ, I_RX, I_RFQC, I_YCMR, I_RXBK, I_RXQT, V_RXQT, I_FKWY, V_WYYC, I_FKYD, V_YDYC, I_FKGJ, V_FKGJYC, I_FKGT, V_GTYC, I_FKFJ, V_FJYC, V_QTFK, V_ZHXGR, DT_ZHXGRQ, I_XGBZ, I_JLBZ, I_CSBZ, I_TJCS, DEP_NAME, I_UPLOAD, DT_UPLOAD, DT_CREATE, V_XM, I_XB, V_ZJHM, DT_CSRQ, V_YKTBH, V_BZ1, V_BZ2, V_BZ3, I_JKZT, I_SHZL, C_CZYBH, I_ZT FROM SQGL_NWKXMTJ";
		String []arr={"depId","VId","CId","CGrbh","dtTjrq","VXl","VXzxl","VXyd","VXyg","VFb","VGb","VPb","VNyj","VNys","NSg","NTz","VTz1","VTz2","VLbj","VGj","VSz","VGm","VPf","VWyj","VWys","VBz","VPfhw","VXfs","VGjfs","VJl","VJzl","VGjyd","VGjyc","VSc","VBlfs","IYwzz","ITt","ITy","IXj","IXm","IXt","IMxks","IKt","IHxkn","IDy","IDn","ITzxj","IFl","IGjzt","ISlmh","ISjmm","INj","INt","IBm","IFx","IExot","IYh","IEm","IRfzt","IQtzz","VQtzz","NTw","VMl","VHxpl","VYxyg","VYxyd","NYw","NTunw","VYtbz1","VYtbz2","IRzgn","NRzfs","IQgzt","NQgfs","IPf","IGm","VGmqt","ILbj","ITzx","IHxy","VHxyyc","IFly","IYwzy","VXzzy","IFyt","VFyt","IFbk","VFbk","IFgd","VFgd","IFpd","VFpd","IYdzy","VYdzy","IXzsz","IZbdmbd","IGmzz","IRx","IRfqc","IYcmr","IRxbk","IRxqt","VRxqt","IFkwy","VWyyc","IFkyd","VYdyc","IFkgj","VFkgjyc","IFkgt","VGtyc","IFkfj","VFjyc","VQtfk","VZhxgr","dtZhxgrq","IXgbz","IJlbz","ICsbz","ITjcs","depName","IUpload","dtUpload","dtCreate","VXm","IXb","VZjhm","dtCsrq","VYktbh","VBz1","VBz2","VBz3","IJkzt","IShzl","CCzybh","IZt"};
		String str = iuseDao.getXx(map,sql,arr);
		return str;
	}
	
	public static void main(String[] args){
		String sqlStr="V_GUID,I_SFSQ,I_SFBF,V_CZY,V_HZXM,I_XB,V_ZJHM,V_YLZH,DT_BCRQ,I_JZLX,I_JSLX,I_JZDW,V_ZFBZFY,V_HLFYBCB,V_ZFYBCB,V_YLZFY,V_YLHLFY,V_JBYLBCFY,V_DBBXBCJE,V_BCBXBCJE,V_MZBCJE,V_SYBCJE,V_QTBCJE,V_QFX,V_MLWZFY,V_YYCDJE,V_JSGS,V_JSGSSZ,V_JZYY,DT_RYJZRQ,DT_CYJZRQ,V_JBMC,V_JSJGMC,V_LXDH,V_JTZZ,I_ZFZT,DEP_ID,DEP_NAME,V_SQDH";
		String []arry= sqlStr.split(",");
		StringBuffer jsonForMatStr = new StringBuffer();
		for (int i = 0; i < arry.length; i++) {
			String arrystr=arry[i].trim();
			String str=arrystr.replace("_", "");
			String str1=str.substring(0,2);
			String str2=str.substring(2,str.length());
			String str5=str.substring(3,str.length());
			String str4=str.substring(0,3);
			String str3=null;
			if("DT".equals(str1.toUpperCase())){
				String s1 = str.substring(2,3);
				str3="\""+str1.toLowerCase()+s1.toUpperCase()+str5.toLowerCase()+"\"";
			}else if("DEP".equals(str4.toUpperCase())){
				String s2 = str.substring(3,4);
				String s3 = str.substring(4,str.length());
				str3="\""+str4.toLowerCase()+s2.toUpperCase()+s3.toLowerCase()+"\"";
			}else{
				str3="\""+str1.toUpperCase()+str2.toLowerCase()+"\"";
			}
			
			jsonForMatStr.append(str3);
			if(i==arry.length-1){
			}else{
				jsonForMatStr.append(",");
			}
		}
		jsonForMatStr.insert(0, "{");
		jsonForMatStr.append("}");
		System.out.println(jsonForMatStr);
	}
	@Override
	public String saveZxb(HttpServletRequest request) throws Exception {
		Message msg = iuseDao.saveZxb(request);		
		String result=msg.getMessage();
		ypcslist= CommonUtil.ArrayToMapLost2(result);
		return ypcslist;
	}
	@Override
	public String saveSfxx(HttpServletRequest request) throws Exception {
		Message msg = iuseDao.saveSfxx(request);		
		String result=msg.getMessage();
		ypcslist= CommonUtil.ArrayToMapLost2(result);
		return ypcslist;
	}
	
	
	@Override
	public String saveJtqyls(HttpServletRequest request) throws Exception {
		Message msg = iuseDao.saveJtqyls(request);
		//String str="{\"code\":1,\"message\":\"OK\",\"result\":\"成功\",\"data\":{\"CJth\":\""+jth+"\"}}";
		String result=msg.getMessage();
		ypcslist= CommonUtil.ArrayToMapLost2(result);
		return ypcslist;
	}
	
	
	
	@Override
	public void onloadApk(HttpServletRequest request,HttpServletResponse response) throws Exception {
		Properties props = new Properties();  
	    props=PropertiesLoaderUtils.loadAllProperties("config.properties"); 
	    String url=props.get("url").toString();
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
	public String VersionNum(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		PropertiesUtil p =new PropertiesUtil();
		String str=p.readValue("version-number");
		//String paramMap=new String(str.getBytes("iso8859-1"),"utf-8");
	    System.out.println(str);
		return str;
	}
	
	
	
	
	
}
