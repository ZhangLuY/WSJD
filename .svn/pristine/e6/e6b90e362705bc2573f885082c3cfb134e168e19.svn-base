package com.zrhis.wsjd.util;

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.common.util.ReflectHelper;
import org.junit.Test;
import org.springframework.beans.BeanUtils;

@SuppressWarnings("rawtypes")
public class EntityUtil {
	
	public static PropertyDescriptor[] getPropertyDescriptors(Class clz) throws IntrospectionException{
		BeanInfo beanInfo= Introspector.getBeanInfo(clz);
		PropertyDescriptor[] properties = beanInfo.getPropertyDescriptors();
		List<PropertyDescriptor> list = new ArrayList<PropertyDescriptor>();
		for(int i=0;i<properties.length;i++){
			if(!"class".equals(properties[i].getName())){
				list.add(properties[i]);
			}
		}
		PropertyDescriptor[] pies =  new PropertyDescriptor[list.size()];
		pies = list.toArray(pies);
		return pies;
	}
	public static PropertyDescriptor[] getPropertyDescriptorsEx(Class clz) throws IntrospectionException{
		PropertyDescriptor[] properties =getPropertyDescriptors(clz);
		List<PropertyDescriptor> list = new ArrayList<PropertyDescriptor>();
		for(int i=0;i<properties.length;i++){
			PropertyDescriptor property = properties[i];
			Method method = property.getReadMethod();
			DynamicUpdate annotaction = method.getAnnotation(DynamicUpdate.class);
			if(annotaction == null || !annotaction.value()){
				list.add(property);
			}
		}
		PropertyDescriptor[] pies =  new PropertyDescriptor[list.size()];
		pies = list.toArray(pies);
		return pies;
	}
	
	public static PropertyDescriptor getPrimaryKey(Class clz) throws IntrospectionException{
		PropertyDescriptor[] properties = getPropertyDescriptors(clz);
		for(int i=0;i<properties.length;i++){
			PropertyDescriptor property = properties[i];
			Method method = property.getReadMethod();
			Annotation annotation = method.getAnnotation(Id.class);
			if(annotation != null){
				return property;
			}
		}
		return null;
	}
	
	public static String getPrimaryColumn(Class clz) throws IntrospectionException{
		PropertyDescriptor property = getPrimaryKey(clz);
		Method method = property.getReadMethod();
		Column annotation = method.getAnnotation(Column.class);
		if(annotation == null)return null;
		return annotation.name();
	}
	
	public static String[] getColumns(Class clz) throws IntrospectionException{
		PropertyDescriptor[] properties = getPropertyDescriptors(clz);
		String[] columns = new String[properties.length];
		for(int i=0;i<properties.length;i++){
			PropertyDescriptor property = properties[i];
			String column = getColumn(property);
			if(column == null)column = property.getName();
			columns[i] = column;
		}
		return columns;
	}
	
	public static String getColumn(PropertyDescriptor property){
		Method method = property.getReadMethod();
		Column annotation = method.getAnnotation(Column.class);
		if(annotation == null)return null;
		return annotation.name();
	}
	
	public static PropertyDescriptor getPropertyByColumn(Class clz,String columnName) 
			throws IntrospectionException{
		PropertyDescriptor[] properties = getPropertyDescriptors(clz);
		for(int i=0;i<properties.length;i++){
			PropertyDescriptor property = properties[i];
			String column = getColumn(property);
			if(columnName.equals(column))return property;
		}
		return null;
	}
	
	public static String getColumnByProperty(Class clz,String propertyName) 
			throws IntrospectionException{
		PropertyDescriptor[] properties = getPropertyDescriptors(clz);
		for(int i=0;i<properties.length;i++){
			PropertyDescriptor property = properties[i];
			if(propertyName.equals(property.getName())){
				return getColumn(property);
			}
		}
		return null;
	}
	
	public static PropertyDescriptor[] getPropertiesByColumns(Class clz,String[] columnNames) 
			throws IntrospectionException{
		PropertyDescriptor[] properties = getPropertyDescriptors(clz);
		PropertyDescriptor[] rsproperties = new PropertyDescriptor[columnNames.length];
		int index = 0;
		for(int i= 0;i<columnNames.length;i++){
			for(int j=0;j<properties.length;j++){
				String column = getColumn(properties[j]);
				if(columnNames[i].equals(column)){
					rsproperties[index]=properties[j];
					index++;
					break;
				}
			}
		}
		return rsproperties;
	}
	public static String[] getProperties(Class clz) 
			throws IntrospectionException{
		PropertyDescriptor[] properties = getPropertyDescriptors(clz);
		String[] rs = new String[properties.length];
		for(int i=0;i<properties.length;i++){
			rs[i] = properties[i].getName();
		}
		return rs;
	}
	
	public static String[] getProperties(Object obj,boolean includeNull) 
			throws IntrospectionException, IllegalArgumentException, IllegalAccessException, InvocationTargetException{
		Class clz = obj.getClass();
		if(includeNull) return getProperties(clz);
		PropertyDescriptor[] properties = getPropertyDescriptors(clz);
		List<String> list = new ArrayList<String>();
		for(int i=0;i<properties.length;i++){
			PropertyDescriptor property = properties[i];
			Method method = property.getReadMethod();
			Object value = method.invoke(obj, null);
			if(!includeNull){
				if(value != null)list.add(property.getName());
			}else{
				list.add(property.getName());
			}
		}
		String[] rs = new String[list.size()];
		rs = list.toArray(rs);
		return rs;
	}
	
	public static Object getPropertyValue(Object obj,PropertyDescriptor property) throws IllegalArgumentException, IllegalAccessException, InvocationTargetException{
		Method readMethod = property.getReadMethod();
		Object value = readMethod.invoke(obj, null);
		return value;
	}
	public static String[] getProperties(Object src,Object e,boolean includeNull,boolean includeSame) 
			throws IntrospectionException, IllegalArgumentException, IllegalAccessException, InvocationTargetException{
		Class srcClz = src.getClass();
		if(!src.getClass().getName().equals(e.getClass().getName())) 
			throw new IllegalArgumentException(srcClz.getName()+"和"+e.getClass().getName()+"不是相同的类型");
		PropertyDescriptor[] properties = getPropertyDescriptors(srcClz);
		List<String> list = new ArrayList<String>();
		for(int i=0;i<properties.length;i++){
			PropertyDescriptor property = properties[i];
			Method method = property.getReadMethod();
			Object value = method.invoke(src, null);
			if(value != null){
				Object value2 = method.invoke(e, null);
				if(value.equals(value2)){
					if(includeSame)list.add(property.getName());
				}else{
					list.add(property.getName());
				}
			}else{
				if(includeNull){
					Object value2 = method.invoke(e, null);
					if(value2 == null){
						if(includeSame)list.add(property.getName());
					}else{
						list.add(property.getName());
					}
				}
			}
		}
		String[] rs = new String[list.size()];
		rs = list.toArray(rs);
		return rs;
	}
	public static void setValue(Object obj,String propertyName,Object value) throws IllegalArgumentException, IllegalAccessException, InvocationTargetException{
		PropertyDescriptor property = BeanUtils.getPropertyDescriptor(obj.getClass(), propertyName);
		setValue(obj, property, value);
	}
	public static void setValue(Object obj,PropertyDescriptor property,Object value) throws IllegalArgumentException, IllegalAccessException, InvocationTargetException{
		Method method = property.getWriteMethod();
		method.invoke(obj, value);
	}
	public static Object getValue(Object obj,String propertyName) throws IllegalArgumentException, IllegalAccessException, InvocationTargetException{
		PropertyDescriptor property = BeanUtils.getPropertyDescriptor(obj.getClass(), propertyName);
		return getValue(obj, property);
	}
	public static Object getValue(Object obj,PropertyDescriptor property) throws IllegalArgumentException, IllegalAccessException, InvocationTargetException{
		Method method = property.getReadMethod();
		return method.invoke(obj, null);
	}
	public static Object beanCopay(Object newEntity,Object oldEntity,PropertyFilter filter) throws IntrospectionException, IllegalArgumentException, IllegalAccessException, InvocationTargetException{
		PropertyDescriptor[] properties = getPropertyDescriptorsEx(newEntity.getClass());
		for(int i=0;i<properties.length;i++){
			PropertyDescriptor property = properties[i];
			Method method = property.getReadMethod();
			Object value1 = method.invoke(newEntity, null);
			Object value2 = method.invoke(oldEntity, null);
			if(filter.doFilter(newEntity, property.getName(), value1)){
				if(value1 != null && !"".equals(value1)){
					if(!value1.equals(value2)){
						setValue(oldEntity, property, value1);
					}
				}else{
					if(value2 != null){
						setValue(oldEntity, property, null);
					}
				}
			}
		}
		return oldEntity;
	}
	
	public static boolean hasProperty(Class clz,String propertyName){
		boolean has = false;
		try {
			Field field = clz.getDeclaredField(propertyName);
			if(field != null)has = true;
		} catch (Exception e) {
			//e.printStackTrace();
		} 
		return has;
	}
	
	public static Map<String,Object> getMetaData(Class clz) throws Exception{
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("idProperty", getPrimaryKey(clz).getName());
		map.put("fields", getProperties(clz));
		return map;
	}
	
	@SuppressWarnings("unchecked")
	public static String getTableName(Class clz) throws Exception{
		Table table = (Table)clz.getAnnotation(Table.class);
		return table.name();
	}
	
	// Bean --> Map 1: 利用Introspector和PropertyDescriptor 将Bean --> Map
    public static Map<String, Object> transBean2Map(Object obj) {

        if(obj == null){
            return null;
        }        
        Map<String, Object> map = new HashMap<String, Object>();
        try {
            BeanInfo beanInfo = Introspector.getBeanInfo(obj.getClass());
            PropertyDescriptor[] propertyDescriptors = beanInfo.getPropertyDescriptors();
            for (PropertyDescriptor property : propertyDescriptors) {
                String key = property.getName();

                // 过滤class属性
                if (!key.equals("class")) {
                    // 得到property对应的getter方法
                    Method getter = property.getReadMethod();
                    Object value = getter.invoke(obj);

                    map.put(key, value);
                }

            }
        } catch (Exception e) {
            System.out.println("transBean2Map Error " + e);
        }

        return map;

    }
    /**
	 * 字符串的填补
	 * @param s
	 * @param n
	 * @param replace
	 * @return
	 */
	 public static String lpad(String s, int n, String replace) { 
         while (s.length() < n) {  
             s = replace+s;  
         }  
         return s;  
     }
	 
	 /**
	  * 十进制转换成二进制，然后又转换成1，2，3的对应值形式
	  * @param {} dec
	  * @return {}
	  */
	 public static int[] blan(Integer para) { 
		 String numStr=Integer.toBinaryString(para);
			System.out.println(numStr); 
			StringBuffer bf=new StringBuffer();
			 for(int i=0;i<numStr.length();i++){
				 if(numStr.charAt(i)!='0'){ 
					 bf.append(numStr.length()-1-i);
				 } 
			} 
			int arr[]=new int[bf.length()];
			for(int i=0;i<bf.length();i++){
				 arr[i]=bf.charAt(i)-'0';
				 //System.out.print(arr[i]);
			}
			 
			return arr;
	 }
	 
	 public static Set<String> ParseValue2(int val){
		 Set<String> set = new HashSet<String>(); 
         if(val >=0 ){
        	boolean first = true; 
        	int temp = 1;
	        for (int i = 0; i < 32; i++){ 
	            int sel = temp & val; 
	            if(sel != 0){ 
	                if(first){ 
	                    first = false; 
	                }               
	                set.add((i+1)+"");              
	            } 
	            temp = temp << 1; 
	        } 
       } 
	    return set;  
	 }
	 
	 //迈瑞借口
	 public static int[] ParseValue(int val){
		 //int arr[32] = {0}; 
		 int [] arr=new int[32];
         if(val >=0 ){
        	boolean first = true; 
        	int temp = 1;
	        for (int i = 0; i < 32; i++){ 
	            int sel = temp & val; 
	            if(sel != 0){ 
	                if(first){ 
	                    first = false; 
	                }               
	                arr[i] = i+1;               
	            } 
	            temp = temp << 1; 
	        } 
       } 
	    return arr;  
	 }
	 /**
		 * 根据beanName获取CLASS
		 * @param beanName
		 * @return
		 */
		public static Class getClassForNames(String beanName){
			Class cls = null;
			try {
				cls = ReflectHelper.classForName(beanName);
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			return cls;
		}
}
