package com.zrhis.wsjd.util;

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.io.BufferedReader;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Proxy;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.Query;
import javax.servlet.http.HttpServletRequest;

import org.hibernate.engine.jdbc.SerializableClobProxy;

/**
 * @ClassName: CommonUtil
 * @Description: 通用工具类
 * @author 张帅
 * @date 2016-10-31 下午05:05:01
 *
 */
public class CommonUtil {

	public static String readJSONString(HttpServletRequest request){
		StringBuffer json = new StringBuffer();
		String line = null;
		try {
			BufferedReader reader = request.getReader();
			while((line = reader.readLine()) != null) {
				json.append(line);
			}
		}
		catch(Exception e) {
			System.out.println(e.toString());
		}
		return json.toString();
	}
	/** 返回失败
	 * 
	 * return 自己定义
	 */
	public static String CodeMessageF(int i ,String result){
		StringBuffer strbuff = new StringBuffer();
		//Boolean result=false;
		strbuff.append("{\"code\":"+i+",\"message\":\"NO\",\"result\":"+result+",\"data\":null}");
		return strbuff.toString();	
	}
	/** 返回成功
	 * 
	 * return 自己定义
	 */
	public static String CodeMessageT(int i ,String result){
		StringBuffer strbuff = new StringBuffer();
		//Boolean result=false;
		strbuff.append("{\"code\":"+i+",\"message\":\"YES\",\"result\":"+result+",\"data\":null}");
		return strbuff.toString();	
	}
	
	/** 不带中括号(失败)
	 * 二维数组转json
	 * return 自己定义
	 */
	public static String ArrayToMapLost1(String result){
		StringBuffer strbuff = new StringBuffer();
		//Boolean result=false;
		strbuff.append("{\"code\":0,\"message\":\"NO\",\"result\":"+result+",\"data\":null}");
		return strbuff.toString();	
	}
	/** 不带中括号(成功)
	 * 二维数组转json
	 * return 自己定义
	 */
	public static String ArrayToMapLost2(String result){
		StringBuffer strbuff = new StringBuffer();
		//Boolean result=false;
		strbuff.append("{\"code\":1,\"message\":\"YES\",\"result\":\""+result+"\",\"data\":null}");
		return strbuff.toString();	
	}
	public static String ArrayToMapLost3(String result){
		StringBuffer strbuff = new StringBuffer();
		//Boolean result=false;
		strbuff.append("{\"code\":2,\"message\":\"YES\",\"result\":"+result+",\"data\":null}");
		return strbuff.toString();	
	}
	//带中括号
	public static List<Map<String,Object>> listToMaps(String[] s, List<Object[]> lst){
		List<Map<String,Object>> newlst= new ArrayList<Map<String,Object>>();
		Map<String,Object> map =null;

		for(int i=0;i<lst.size();i++){
			Object[] o = lst.get(i);
			map = new HashMap<String, Object>();
			for(int j=0;j<s.length;j++){
				String s1 = s[j];
				if(j>=o.length){
					map.put(s1,null);
				}else{
					Object o1 = o[j];
					map.put(s1,o1);
				}
			}
			newlst.add(map);
		}
		return newlst;
	}
	//不带中括号
	public static Map<String,Object> listToMap(String[] s, List<Object[]> lst){
		Map<String,Object> map =null;
		for(int i=0;i<lst.size();i++){
			Object[] o = lst.get(i);
			map = new HashMap<String, Object>();
			for(int j=0;j<s.length;j++){
				map.put(s[j],o[j]);
			}
		}
		return map;
	}
	public static Object convertMap(Class type, Map map)throws IntrospectionException, IllegalAccessException,
	InstantiationException, InvocationTargetException {
		BeanInfo beanInfo = Introspector.getBeanInfo(type); // 获取类属性
		Object obj = type.newInstance(); // 创建 JavaBean 对象
		// 给 JavaBean 对象的属性赋值
		PropertyDescriptor[] propertyDescriptors =  beanInfo.getPropertyDescriptors();
		for (int i = 0; i< propertyDescriptors.length; i++) {
			PropertyDescriptor descriptor = propertyDescriptors[i];
			String propertyName = descriptor.getName();

			if (map.containsKey(propertyName)) {
				// 下面一句可以 try 起来，这样当一个属性赋值失败的时候就不会影响其他属性赋值。
				Object value = map.get(propertyName);

				Object[] args = new Object[1];
				args[0] = value;

				descriptor.getWriteMethod().invoke(obj, args);
			}
		}
		return obj;
	}
	/** 不带中括号(成功)
	 * 二维数组转json
	 * @return
	 */
	public static String ArrayToMap(String[] s,List<Object[]> lst){
		StringBuffer strbuff = new StringBuffer();
		Boolean result=true;
		Map<String,Object> map = null;
		strbuff.append("{\"code\":1,\"message\":\"OK\",\"result\":"+result+",\"data\":");
		if(lst!=null&&lst.size()>0){
			for(int i=0;i<lst.size();i++){
				Object[] o = lst.get(i);//获取查询的个数
				map = new HashMap<String, Object>();
				strbuff.append("{");
				for(int j=0;j<s.length;j++){
					strbuff.append("\"");
					strbuff.append(s[j]);
					if(j>=o.length){
						strbuff.append("\":\"");
						strbuff.append("null");
						strbuff.append("\"");
					}else{
						if((lst.get(i))[j] instanceof Number){
							strbuff.append("\":");
							strbuff.append((lst.get(i))[j]);

						}else{
							strbuff.append("\":\"");
							strbuff.append((lst.get(i))[j]);
							strbuff.append("\"");
						}
					}
					if(j!=s.length-1){
						strbuff.append(",");
					}
				}
				strbuff.append("}");
				if(i!=lst.size()-1){
					strbuff.append(",");
				}
			}
		}
		strbuff.append("}");
		return strbuff.toString();	
	}
	/** 不带中括号(失败)
	 * 二维数组转json
	 * @return
	 */
	public static String ArrayToMapLost(){
		StringBuffer strbuff = new StringBuffer();
		Boolean result=false;
		strbuff.append("{\"code\":0,\"message\":\"NO\",\"result\":"+result+",\"data\":null}");
		return strbuff.toString();	
	}
	public static String ArrayToMapLosts(){
		StringBuffer strbuff = new StringBuffer();
		Boolean result=false;
		strbuff.append("{\"code\":1,\"message\":\"OK\",\"result\":true,\"data\":{\"userName\":\"jsz2011\",\"password\":\"ZTEwYWRjMzk0OWJhNTlhYmJlNTZlMDU3ZjIwZjg4M2U=\"}}");
		return strbuff.toString();	
	}
	/**	带中括号
	 * 二维数组转json
	 * @return
	 */
	public static String ArrayToMapJson(String[] s,List<Object[]> lst){
		StringBuffer strbuff = new StringBuffer();
		Boolean result=true;
		strbuff.append("{\"code\":1,\"message\":\"OK\",\"result\":"+result+",\"data\":[");
		if(lst!=null&&lst.size()>0){
			for(int i=0;i<lst.size();i++){
				Object[] o = lst.get(i);//获取查询的个数
				strbuff.append("{");
				for(int j=0;j<s.length;j++){
					strbuff.append("\"");
					strbuff.append(s[j]);
					if(j>=o.length){
						strbuff.append("\":\"");
						strbuff.append("null");
						strbuff.append("\"");
					}else{
						if((lst.get(i))[j] instanceof Number){
							strbuff.append("\":");
							strbuff.append((lst.get(i))[j]);

						}else{
							strbuff.append("\":\"");
							strbuff.append((lst.get(i))[j]);
							strbuff.append("\"");
						}
					}
					if(j!=s.length-1){
						strbuff.append(",");
					}
				}
				strbuff.append("}");
				if(i!=lst.size()-1){
					strbuff.append(",");
				}
			}
		}
		strbuff.append("]}");
		return strbuff.toString();	
	}

	/**	带中括号
	 * 二维数组转json(分页)
	 * @return
	 */
	public static String ArrayFYJson(String[] s,List<Object[]> lst){
		StringBuffer strbuff = new StringBuffer();
		Boolean result=true;
		strbuff.append("{\"code\":1,\"message\":\"OK\",\"result\":"+result+",\"data\":{\"PageIndex\":1,\"PageCount\":50,\"Totel\":1,\"Items\":");
		if(lst!=null&&lst.size()>0){
			for(int i=0;i<lst.size();i++){
				Object[] o = lst.get(i);//获取查询的个数
				strbuff.append("{");
				for(int j=0;j<s.length;j++){
					strbuff.append("\"");
					strbuff.append(s[j]);
					if(j>=o.length){
						strbuff.append("\":\"");
						strbuff.append("null");
						strbuff.append("\"");
					}else{
						if((lst.get(i))[j] instanceof Number){
							strbuff.append("\":");
							strbuff.append((lst.get(i))[j]);

						}else{
							strbuff.append("\":\"");
							strbuff.append((lst.get(i))[j]);
							strbuff.append("\"");
						}
					}
					if(j!=s.length-1){
						strbuff.append(",");
					}
				}
				strbuff.append("}");
				if(i!=lst.size()-1){
					strbuff.append(",");
				}
			}
		}
		strbuff.append("}}");
		return strbuff.toString();	
	}
	/**	带中括号
	 * 二维数组转json(有些方法专用)
	 * @return
	 */
	public static String ZYJson(String[] s,List<Object[]> lst){
		StringBuffer strbuff = new StringBuffer();
		Boolean result=true;
		strbuff.append("[");
		if(lst!=null&&lst.size()>0){
			for(int i=0;i<lst.size();i++){
				Object[] o = lst.get(i);//获取查询的个数
				strbuff.append("{");
				for(int j=0;j<s.length;j++){
					strbuff.append("\"");
					strbuff.append(s[j]);
					if(j>=o.length){
						strbuff.append("\":\"");
						strbuff.append("null");
						strbuff.append("\"");
					}else{
						if((lst.get(i))[j] instanceof Number){
							strbuff.append("\":");
							strbuff.append((lst.get(i))[j]);

						}else{
							strbuff.append("\":\"");
							strbuff.append((lst.get(i))[j]);
							strbuff.append("\"");
						}
					}
					if(j!=s.length-1){
						strbuff.append(",");
					}
				}
				strbuff.append("}");
				if(i!=lst.size()-1){
					strbuff.append(",");
				}
			}
		}
		strbuff.append("]");
		return strbuff.toString();	
	}


	/**
	 * 二维数组转json
	 * @return
	 */
	public static String ArrayToMaps(String[] s,List<Object[]> lst){
		StringBuffer strbuff = new StringBuffer();
		Boolean result=true;
		Map<String,Object> map = null;
		if(lst!=null&&lst.size()>0){
			for(int i=0;i<lst.size();i++){
				map = new HashMap<String, Object>();
				strbuff.append("{");
				for(int j=0;j<s.length;j++){
					strbuff.append("\"");
					strbuff.append(s[j]);
					if((lst.get(i))[j] instanceof Number){
						strbuff.append("\":");
						strbuff.append((lst.get(i))[j]);

					}else{
						strbuff.append("\":\"");
						strbuff.append((lst.get(i))[j]);
						strbuff.append("\"");
					}
					if(j!=s.length-1){
						strbuff.append(",");
					}
				}
				strbuff.append("}");
				if(i!=lst.size()-1){
					strbuff.append(",");
				}
			}
		}
		return strbuff.toString();	
	}


	/**
	 * URL编码（utf-8）
	 * 
	 * @param source
	 * @return
	 */
	public static String urlEncodeUTF8(String source) {
		String result = source;
		try {
			result = java.net.URLEncoder.encode(source, "utf-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		return result;
	}
	
	/**	带中括号(分页)
	 * 二维数组转json
	 * @return
	 */
	public static String ArrayToMapJsonFy(int totalCount,String[] s,List<Object[]> lst){
		
		StringBuffer strbuff = new StringBuffer();
		Boolean result=true;
		strbuff.append("{\"code\":1,\"message\":\"OK\",\"result\":"+result+",\"totalCount\":"+totalCount+",\"data\":[");
		if(lst!=null&&lst.size()>0){
			for(int i=0;i<lst.size();i++){
				Object[] o = lst.get(i);//获取查询的个数
				strbuff.append("{");
				for(int j=0;j<s.length;j++){
					strbuff.append("\"");
					strbuff.append(s[j]);
					if(j>=o.length){
						strbuff.append("\":\"");
						strbuff.append("null");
						strbuff.append("\"");
					}else{
						if((lst.get(i))[j] instanceof Number){
							strbuff.append("\":");
							strbuff.append((lst.get(i))[j]);

						}else{  
							strbuff.append("\":\"");
							strbuff.append((lst.get(i))[j]);
							strbuff.append("\"");
						}
					}
					if(j!=s.length-1){
						strbuff.append(",");
					}
				}
				strbuff.append("}");
				if(i!=lst.size()-1){
					strbuff.append(",");
				}
			}
		}
		strbuff.append("]}");
		return strbuff.toString();	
	}
	public static String listToMapJson(int totalCount,String[] s,List<Object[]> lst) throws Exception{
		StringBuffer strbuff = new StringBuffer();
		Boolean result=true;
		strbuff.append("{\"code\":1,\"message\":\"OK\",\"result\":"+result+",\"totalCount\":"+totalCount+",\"data\":[");
		if(lst!=null&&lst.size()>0){
			for(int i=0;i<lst.size();i++){
				Object[] o = lst.get(i);//获取查询的个数
				strbuff.append("{");
				for(int j=0;j<s.length;j++){
					strbuff.append("\"");
					strbuff.append(s[j]);
					if(j>=o.length){
						strbuff.append("\":\"");
						strbuff.append("null");
						strbuff.append("\"");
					}else{
						if((lst.get(i))[j] instanceof Number){
							strbuff.append("\":");
							strbuff.append((lst.get(i))[j]);

						}else{
							if(j==s.length-1){
								System.out.println("j"+j);
								if(StringUtils.objectToString(o[j])!=""){
									System.out.println(o[j]);
									SerializableClobProxy proxy = (SerializableClobProxy) Proxy.getInvocationHandler(o[j]);
							        java.sql.Clob realClob = proxy.getWrappedClob();
							        String content = ""; 
							        Reader reader = realClob.getCharacterStream();// 得到流
							        BufferedReader br = new BufferedReader(reader);
							        String str = br.readLine();
							        StringBuffer sb = new StringBuffer(); 
//							        while (str != null) {// 执行循环将字符串全部取出付值给 
//							            sb.append(str);
//							            str = br.readLine();
//							        }
							        content = sb.toString();
							        strbuff.append("\":\"");
									strbuff.append(str);
									strbuff.append("\"");
									//map.put(s[j], content);
								}else{
									 strbuff.append("\":\"");
									 strbuff.append("\"");
								}
							}else{
								strbuff.append("\":\"");
								strbuff.append((lst.get(i))[j]);
								strbuff.append("\"");
								//map.put(s[j],o[j]);
							}	
						}
					}
					if(j!=s.length-1){
						strbuff.append(",");
					}
				}
				strbuff.append("}");
				if(i!=lst.size()-1){
					strbuff.append(",");
				}
			}
		}
		strbuff.append("]}");
		return strbuff.toString();	
	}
	/**
	 * LPF 2018年4月23日14:50:21  获取多个clob字段
	 * @param totalCount
	 * @param s
	 * @param lst
	 * @return
	 * @throws Exception
	 */
	public static String listToMapJson1(String[] s,List<Object[]> lst,int n) throws Exception{
		StringBuffer strbuff = new StringBuffer();
		Boolean result=true;
		strbuff.append("{\"code\":1,\"message\":\"OK\",\"result\":"+result+",\"data\":[");
		if(lst!=null&&lst.size()>0){
			for(int i=0;i<lst.size();i++){
				Object[] o = lst.get(i);//获取查询的个数
				strbuff.append("{");
				for(int j=0;j<s.length;j++){
					strbuff.append("\"");
					strbuff.append(s[j]);
					if(j>=o.length){
						strbuff.append("\":\"");
						strbuff.append("null");
						strbuff.append("\"");
					}else{
						if((lst.get(i))[j] instanceof Number){
							strbuff.append("\":");
							strbuff.append((lst.get(i))[j]);

						}else{
							if(j>=s.length-n){
								System.out.println("j"+j);
								if(StringUtils.objectToString(o[j])!=""){
									System.out.println(o[j]);
									SerializableClobProxy proxy = (SerializableClobProxy) Proxy.getInvocationHandler(o[j]);
							        java.sql.Clob realClob = proxy.getWrappedClob();
							        String content = ""; 
							        Reader reader = realClob.getCharacterStream();// 得到流
							        BufferedReader br = new BufferedReader(reader);
							        String str = br.readLine();
							        StringBuffer sb = new StringBuffer(); 
//							        while (str != null) {// 执行循环将字符串全部取出付值给 
//							            sb.append(str);
//							            str = br.readLine();
//							        }
							        content = sb.toString();
							        strbuff.append("\":\"");
									strbuff.append(str);
									strbuff.append("\"");
									//map.put(s[j], content);
								}else{
									 strbuff.append("\":\"");
									 strbuff.append("\"");
								}
							}else{
								strbuff.append("\":\"");
								strbuff.append((lst.get(i))[j]);
								strbuff.append("\"");
								//map.put(s[j],o[j]);
							}	
						}
					}
					if(j!=s.length-1){
						strbuff.append(",");
					}
				}
				strbuff.append("}");
				if(i!=lst.size()-1){
					strbuff.append(",");
				}
			}
		}
		strbuff.append("]}");
		return strbuff.toString();	
	}
	/**
	 * LPF 2018年4月23日14:50:21  获取多个clob字段
	 * @param totalCount
	 * @param s
	 * @param lst
	 * @return
	 * @throws Exception
	 */
	public static String getClob(Object s) throws Exception{
		SerializableClobProxy proxy = (SerializableClobProxy) Proxy.getInvocationHandler(s);
        java.sql.Clob realClob = proxy.getWrappedClob();
        String content = ""; 
        Reader reader = realClob.getCharacterStream();// 得到流
        BufferedReader br = new BufferedReader(reader);
        String str = br.readLine();
        StringBuffer sb = new StringBuffer(); 

        content = sb.toString();
        
		return str;	
	}
	
	public static String ArrayToMapLost3(String result,String data){
		StringBuffer strbuff = new StringBuffer();
		//Boolean result=false;
		strbuff.append("{\"code\":1,\"message\":\"YES\",\"result\":\""+result+"\",\"data\":"+data+"}");
		return strbuff.toString();	
	}
	
	public static String ArrayToMapLost4(String result,String data,String data1){
		StringBuffer strbuff = new StringBuffer();
		//Boolean result=false;
		strbuff.append("{\"code\":1,\"message\":\"YES\",\"result\":\""+result+"\",\"data\":"+data+",\"data1\":"+data1+"}");
		return strbuff.toString();	
	}
	
}