package com.zrhis.wsjd.util;

import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.DecimalFormat;
import java.text.NumberFormat;

import org.junit.Test;

public class Tools {
	/**
	 * 字符串的填补
	 * @param s
	 * @param n
	 * @param replace
	 * @return
	 */
	 public static String lpad(String s, int n, String replace) {
		 //NumberFormat nf = new NumberFormat("0000");
		 NumberFormat nf = new DecimalFormat("00");
         while (s.length() < n) {  
             s = replace+s;  
         }  
         return s;  
     }
	 
	public static String format(Integer i,String format){
		NumberFormat nf = new DecimalFormat(format);
		return nf.format(i);
	}
	
	public static String format(Integer i){
		return format(i,"00");
	}
	
	public static int sum(int... i){
		int sum = 0;
		for(int val : i){
			sum += val;
		}
		return sum;
	}
	@Test
	public void test(){/*
		String s = "123";
		int i = 8;
		int t = 8;
		double d = 3;
		System.out.println(s+(i+t)+d);
		
		WsjdUser user = new WsjdUser();
		try {
			System.out.println(user.getClass().getSimpleName());
			PropertyDescriptor property = EntityUtil.getPrimaryKey(user.getClass());
			System.out.println(property.getName());
			Method getter = property.getReadMethod();
			Method setter = property.getWriteMethod();
			setter.invoke(user, "afeweoaosiga546");
			System.out.println(getter.invoke(user, null));
		} catch (IntrospectionException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	*/}
	
}
