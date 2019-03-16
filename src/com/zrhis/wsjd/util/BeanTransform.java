package com.zrhis.wsjd.util;

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.lang.StringUtils;


/**
 * 相似类之间的复制，map、bean之间的转换
 * @author 王成委
 *
 */
public class BeanTransform {
	
	public static void printBeanValue(Object obj){
		try {
			BeanInfo beanInfo = Introspector.getBeanInfo(obj.getClass());
			PropertyDescriptor[] propertyDescriptor=beanInfo.getPropertyDescriptors();
			for(PropertyDescriptor pd : propertyDescriptor){
				String propertyName = pd.getName();
				Method method = pd.getReadMethod();
				Object value = method.invoke(obj, null);
				System.out.println(propertyName+":"+value);
			}
		} catch (IntrospectionException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	/**
	 * 把map转换成bean
	 * @param clz
	 * @param map
	 * @return
	 */
	public static Object mapToBean( Class clz,Map map){
		Object obj = null;
		try {
			obj = Class.forName(clz.getName()).newInstance();
			BeanInfo beanInfo = Introspector.getBeanInfo(clz);
			PropertyDescriptor[] propertyDescriptor=beanInfo.getPropertyDescriptors();
			for(PropertyDescriptor pd : propertyDescriptor){
				String propertyName = pd.getName();
				if(propertyName.equals("class"))continue;
				Class type = pd.getPropertyType();
				String simpleTypeName = type.getSimpleName();//获取属性类型
				//System.out.println(propertyName+"  "+type);
				Object value = map.get(propertyName).toString();//获得属性值
				if(value == null  || "".equals(value) || "null".equals(value))continue;
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
						//e.printStackTrace();
						if("Date".equals(simpleTypeName)){
							//value = new java.util.Date(java.sql.Date.valueOf(value.toString()).getTime());
							value = string2Date(value.toString());
						}
					}
				}
				if(tr_method != null)
				value = tr_method.invoke(type, value);
				Method method = pd.getWriteMethod();
				method.invoke(obj,value);
			}
		} catch (IntrospectionException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		} 
		return obj;
	}
	public static Object map2Bean( Class clz,Map properties){
		Object bean = null;
		try {
			bean = Class.forName(clz.getName()).newInstance();
			if ((bean == null) || (properties == null)) {
				return null;
			}
			Iterator entries = properties.entrySet().iterator();
			while (entries.hasNext()) {

				Map.Entry entry = (Map.Entry) entries.next();

				String name = (String) entry.getKey();
				if (name == null) {
					continue;
				}
				String value = (String)entry.getValue();
				if (StringUtils.isNotBlank(value)) { 
						try {
							BeanUtils.setProperty(bean, name,value);
						} catch (InvocationTargetException e) {
							e.printStackTrace();
						}

				} else {
					//BeanUtils.setProperty(bean, name, null);
				}

			}
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		return bean;
		
	}
	
	//public Date 
	public static Date string2Date(String source){
		Date date = null;// = new Date();
		DateFormat format1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		DateFormat format2 = new SimpleDateFormat("yyyy-MM-dd");
		DateFormat format3 = new SimpleDateFormat("yyyyMMdd");
		try {
			date = (Date) format1.parse(source);
		} catch (ParseException e) {
			try {
				date = (Date) format2.parse(source);
			} catch (ParseException e1) {
				try {
					date = (Date) format3.parse(source);
				} catch (ParseException e2) {
					e2.printStackTrace();
				}
			}
		}
		return date;
	}
}
