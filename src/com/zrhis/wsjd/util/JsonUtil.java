package com.zrhis.wsjd.util;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.sf.ezmorph.object.DateMorpher;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import net.sf.json.util.JSONUtils;
/**
 * jxg 工具类
 * @author Administrator
 *
 */
public class JsonUtil {
	/**
	 * 二维数组+count转json
	 * @return
	 */
	public static String ArrayToMap(String[] s,List<Object[]> lst,Integer total){
		StringBuffer strbuff = new StringBuffer();
		Map<String,Object> map = null;
		strbuff.append("{\"total\":"+total+",");
		if(total==0){
			strbuff.append("\"rows\":[]}");
			return strbuff.toString();
		}else{
			strbuff.append("\"rows\":[");
			if(lst!=null && lst.size()>0){
				for(int i=0;i<lst.size();i++){
					map = new HashMap<String, Object>();
					strbuff.append("{");
					for(int j=0;j<s.length;j++){
						strbuff.append("\"");
						strbuff.append(s[j]);
						if((lst.get(i))[j] instanceof Number){
							strbuff.append("\":");
							strbuff.append((lst.get(i))[j]==null?0:(lst.get(i))[j]);
						}else{
							strbuff.append("\":\"");
							strbuff.append((lst.get(i))[j]==null?"":(lst.get(i))[j]);
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
			strbuff.append("]}");
		}
		return strbuff.toString();
		
	}
	/**
	 * 二维数组转json
	 * @return
	 */
	public static String ArrayToMap(String[] s,List<Object[]> lst){
		StringBuffer strbuff = new StringBuffer();
		Map<String,Object> map = null;
		strbuff.append("{\"data\":[");
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
		strbuff.append("]}");
		return strbuff.toString();	
	}
	/**
	 * 二维数组转json
	 * @return
	 */
	public static String ArrayToMap(String[] s,List<Object[]> lst,String data){
		StringBuffer strbuff = new StringBuffer();
		Map<String,Object> map = null;
		strbuff.append("{\"");
		strbuff.append(data);
		strbuff.append("\":[");
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
		strbuff.append("]}");
		return strbuff.toString();	
	}
	/**
	 * List<Map<String,Object>>转json
	 * @return
	 */
	public static String listToJson(String[] str,List<Map<String,Object>> lst,String data){
		StringBuffer strbuff = new StringBuffer();
		strbuff.append("{\"");
		strbuff.append(data);
		strbuff.append("\":[");
		  if(lst!=null && lst.size()>0){
			for(int i=0;i<lst.size();i++){
				strbuff.append("{");
				for(int j=0;j<str.length;j++){
					strbuff.append("\"");
					strbuff.append(str[j]);
					if((lst.get(i)).get(str[j]) instanceof Number){
						strbuff.append("\":");
						strbuff.append((lst.get(i)).get(str[j]));
						
					}else{
						strbuff.append("\":\"");
						strbuff.append((lst.get(i)).get(str[j]));
						strbuff.append("\"");
					}
					if(j!=str.length-1){
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
     * 从一个JSON 对象字符格式中得到一个java对象，形如：    
     * {"id" : idValue, "name" : nameValue, "aBean" : {"aBeanId" : aBeanIdValue, ...}}    
     * @param object    
     * @param clazz    
     * @return    
     */     
    public static Object getDTO(String jsonString, Class clazz){       
        JSONObject jsonObject = null;       
        try{       
           setDataFormat2JAVA();       
            jsonObject = JSONObject.fromObject(jsonString);      
        }catch(Exception e){       
            e.printStackTrace();      
        }      
        return JSONObject.toBean(jsonObject, clazz);       
    }
    /**
     *  List<Object[]>转List<Map<String,Object>>
     * @param s 有序数组
     * @param lst  List<Object[]>
     * @return
     */
	public static List<Map<String,Object>> listToMap(String[] s, List<Object[]> lst){
		List<Map<String,Object>> newlst= new ArrayList<Map<String,Object>>();
		Map<String,Object> map =null;
		
    	for(int i=0;i<lst.size();i++){
    		Object[] o = lst.get(i);
    		map = new HashMap<String, Object>();
    		for(int j=0;j<s.length;j++){
    			if(o[j]==null){
    				o[j]="";			
    			}  
    			map.put(s[j],o[j]);
    		}
    		newlst.add(map);
    	}
    	return newlst;
    }
	private static void setDataFormat2JAVA(){       
	        //设定日期转换格式       
	        JSONUtils.getMorpherRegistry().registerMorpher(new DateMorpher(new String[]{"yyyy-MM-dd HH:mm:ss","yyyy-MM-dd"}));       
	}
	private static void setDataFormat2JAVA2(){       
        //设定日期转换格式       
        JSONUtils.getMorpherRegistry().registerMorpher(new DateMorpher(new String[]{"yyyy-MM"}));       
	}
	public static void main(String[] args) {
		
	}
	
	public static Object[] json2ObjectArray(String jsonString) {  
		JSONArray jsonArray = JSONArray.fromObject(jsonString);  
	   	return jsonArray.toArray();
	}
	
	public static Object json2pojo(String jsonStr,Class javaBean){  
		JSONObject jsonObj = JSONObject.fromObject(jsonStr);  
		Object obj = JSONObject.toBean(jsonObj, javaBean);  
		return obj;  
	}
	
	public static Map<String, Object> json2Map(String jsonString) {  
		   return (Map<String, Object>) json2pojo(jsonString,Map.class);  
	}
}
