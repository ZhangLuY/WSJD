package com.zrhis.wsjd.util;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.sql.Timestamp;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import net.sf.ezmorph.object.DateMorpher;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import net.sf.json.JsonConfig;
import net.sf.json.util.JSONUtils;
import net.sf.json.util.PropertyFilter;

import com.zrhis.base.converter.DateConverter;
import com.zrhis.base.converter.JsDateJsonBeanValueProcessor;
import com.zrhis.base.converter.JsDateJsonValueProcessor;

@SuppressWarnings({"unchecked"})
public class JSONFormat {
	
	/**
	 * 将对象转为JSONObject对象
	 * @param obj
	 * @param includeNull 是否包含值为空的字段
	 * @return
	 */
	public static JSONObject toJson(Object obj,boolean includeNull){
		JsonConfig jsonconfig = getJsonConfig();
		if(!includeNull){
			jsonconfig.setJsonPropertyFilter(getNullFilter());
		}
		
		JSONObject data = JSONObject.fromObject(obj,jsonconfig);
		return data;
	}
	
	/**
	 * 
	 * @param obj
	 * @return
	 */
	public static JSONObject toJson(Object obj){
		return toJson(obj,true);
	}
	
	public static JSONObject toJson(Map map,boolean includeNull){
		return toJson(map,includeNull);
	}
	public static JSONObject toJson(Map map){
		return toJson(map,true);
	}
	public static JSONArray toJson(List list,boolean includeNull){
		JsonConfig jsonconfig = getJsonConfig();
		if(!includeNull){
			jsonconfig.setJsonPropertyFilter(ownPropertyFilter());
		}
		JSONArray data = JSONArray.fromObject(list,jsonconfig);
		return data;
	}
	public static JSONArray toJson(List list){
		return toJson(list,true);
	}
	
	public static Object toBean(Class clz,String json){
		JsonConfig jsonconfig = new JsonConfig();
		jsonconfig.setRootClass(clz);
		//解决日期转换不正常的问题
		JSONUtils.getMorpherRegistry().registerMorpher(new DateMorpher(
			new String[]{"yyyy-MM-dd HH:mm:ss","yyyy-MM-dd"}
		));
		jsonconfig.setJavaPropertyFilter(getNullFilter());
		
		JSONObject jsonObject = JSONObject.fromObject(json);
		//DebugUtil.println(jsonObject);
		
		Object entity = JSONObject.toBean(jsonObject, jsonconfig);
		
		return entity;
	}
	public static Object toBean(String className,String json){
		try {
			Class clz = Class.forName(className);
			return toBean(clz, json);
		} catch (ClassNotFoundException e) {
			if(DebugUtil.IS_DEBUG) 
			e.printStackTrace();
			return null;
		}
	}
	
	public static Object toBean(Class clz,Map<String,Object> map){
		
		JSONObject jsonObject = JSONObject.fromObject(map);
		
		JsonConfig jsonconfig = new JsonConfig();
		jsonconfig.setRootClass(clz);
		jsonconfig.setJavaPropertyFilter(ownPropertyFilter());
		//解决日期转换不正常的问题
		JSONUtils.getMorpherRegistry().registerMorpher(new DateMorpher(
			new String[]{"yyyy-MM-dd HH:mm:ss","yyyy-MM-dd"}
		));
		Object entity = JSONObject.toBean(jsonObject, jsonconfig);
		
		return entity;
	}
	
	private static PropertyFilter getNullFilter(){
		return new PropertyFilter (){
			public boolean apply(Object entity, String propertyName, Object value){
				if(value == null || "".equals(value)){
					return true;
				}
				return false;
			}
			
		};
	}
	
	private static PropertyFilter ownPropertyFilter(){
		return new PropertyFilter (){
			public boolean apply(Object entity, String propertyName, Object value){
				boolean has = EntityUtil.hasProperty(entity.getClass(), propertyName);
				if(!has) return true;
				if(value == null || "".equals(value)){
					return true;
				}
				return false;
			}
			
		};
	}
	
	private static JsonConfig getJsonConfig(){
		JsonConfig jsonconfig = new JsonConfig();
		jsonconfig.registerJsonValueProcessor(Date.class, new JsDateJsonValueProcessor());
		jsonconfig.setAllowNonStringKeys(false);
		return jsonconfig;
	}
	
	public static Map<String,Object> bindType(String className,Map map) throws ClassNotFoundException{
		Class clz = null;
		clz = Class.forName(className);
		return bindType(clz, map);
	}
	public static Map<String,Object> bindType(Class clz ,Map map){
		Map<String,Object> rsmap = new HashMap<String,Object>();
		Set<String> set = map.keySet();
		Iterator<String> it = set.iterator();
		while(it.hasNext()){
			String key = it.next();
			try {
				Field filed = clz.getDeclaredField(key);
				Class type = filed.getType();
				rsmap.put(key, typeTransform(type,map.get(key)));
			} catch (SecurityException e) {
				e.printStackTrace();
			} catch (NoSuchFieldException e) {
				e.printStackTrace();
			}
		}
		return rsmap;
	}
	
	public static Object typeTransform(Class type,Object obj){
		String simpleTypeName = type.getSimpleName();//获取属性类型
		DateConverter dc = new DateConverter();
		Object value = obj;//获得属性值
		if(value == null  || "".equals(value) || "null".equals(value))return null;
		if("int".equals(simpleTypeName))type = Integer.class;
		if("double".equals(simpleTypeName))type = Double.class;
		if("short".equals(simpleTypeName))type = Short.class;
		if("long".equals(simpleTypeName))type = Long.class;
		if("float".equals(simpleTypeName))type = Float.class;
		if("boolean".equals(simpleTypeName))type = Boolean.class;
		if("byte".equals(simpleTypeName))type = Byte.class;
		if("char".equals(simpleTypeName))value = value.toString().charAt(0);
		Method tr_method = null;
		if(!"String".equals(simpleTypeName)&&!"char".equals(simpleTypeName)){
			try {
				tr_method = type.getMethod("valueOf", String.class);
			} catch (NoSuchMethodException e) {
				if("Date".equals(simpleTypeName)){
					value = dc.convert(value.toString());
				}
			}
		}
		if(tr_method != null){
			try {
				value = tr_method.invoke(type, value.toString());
			} catch (IllegalArgumentException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			} catch (InvocationTargetException e) {
				e.printStackTrace();
			}
		}
		return value;
	}
	
	public static Map<String,Object> JSONToMap(String json) {
		Map<String, Object> map = null;
		map = JSONObject.fromObject(json);
		return map;
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
