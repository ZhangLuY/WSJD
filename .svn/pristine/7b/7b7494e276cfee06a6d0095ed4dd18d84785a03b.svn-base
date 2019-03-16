package com.zrhis.wsjd.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.time.DateUtils;

import ognl.DefaultTypeConverter;

/**
 * 时间转换器
 * @author wangyan
 * 2017年4月7日18:00:21
 */

public class DateConverter2 extends DefaultTypeConverter {

	private static final String DATETIME_PATTERN = "yyyy-MM-dd HH:mm:ss";
	
	private static final String CNDATE_PATTERN = "yyyy-MM-dd";

	private static final String DATE_PATTERN = "yyyyMMdd";
	
	private static final String MONTH_PATTERN = "yyyy-MM";
	
	private static final String DATETIME_PATTERN01 = "yyyy/MM/dd HH:mm:ss";
	
	private static final String CNDATE_PATTERN01 = "yyyy/MM/dd";
	
	private static final String MONTH_PATTERN01 = "yyyy/MM";

	/**
	 * Convert value between types
	 */
	@SuppressWarnings("unchecked")
	public Object convertValue(Map ognlContext, Object value, Class toType) {
		Object result = null;
		if (toType == Date.class) {
			result = doConvertToDate(value);
		} else if (toType == String.class) {
			result = doConvertToString(value);
		}
		return result;
	}

	/**
	 * Convert String to Date
	 * 
	 * @param value
	 * @return
	 */
	public static Date doConvertToDate(Object value) {
		Date result = null;

		if (value instanceof String) {
			try {
				result = DateUtils.parseDate((String) value, new String[] { CNDATE_PATTERN,DATE_PATTERN, DATETIME_PATTERN, MONTH_PATTERN,DATETIME_PATTERN01,CNDATE_PATTERN01,MONTH_PATTERN01 });
			} catch (ParseException e1) {
				e1.printStackTrace();
			}

			// all patterns failed, try a milliseconds constructor
			if (result == null && StringUtils.isNotEmpty((String)value)) {

				try {
					result = new Date(new Long((String) value).longValue());
				} catch (Exception e) {
					e.printStackTrace();
				}

			}

		} else if (value instanceof Object[]) {
			// let&apos;s try to convert the first element only
			Object[] array = (Object[]) value;

			if ((array != null) && (array.length >= 1)) {
				value = array[0];
				result = doConvertToDate(value);
			}

		} else if (Date.class.isAssignableFrom(value.getClass())) {
			result = (Date) value;
		}
		return result;
	}
	/**
	 * 返回sql的date，仅支持yyyy-MM-dd
	 */
	public static java.sql.Date doConvertToSqlDate(String str){
		SimpleDateFormat bartDateFormat =  new SimpleDateFormat("yyyy-MM-dd"); 
		java.sql.Date sqlDate =null;
		      try {  
		       java.util.Date date = bartDateFormat.parse(str);  
		       sqlDate = new java.sql.Date(date.getTime());
		      }  
		      catch (Exception ex) {  
		    	  ex.printStackTrace();
		      }
		return sqlDate;
	}
	
	/**
	 * Convert Date to String
	 * 
	 * @param value
	 * @return
	 */
	public static String doConvertToString(Object value) {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(DATETIME_PATTERN);
		String result = null;
		if (value instanceof Date) {
			result = simpleDateFormat.format(value);
		}
		return result;
	}
	/**
	 * 日期转String
	 * @param value
	 * @param sdf 日期格式
	 * @param isnow 是否返回当前日期
	 * @return
	 */
	public static String doConvertToString(Object value,String sdf) {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(sdf);
		String result = null;
		if (value!=null && value instanceof Date) {
			result = simpleDateFormat.format(value);
		}
		return result;
	}
	/**
	 * String 转日期
	 * @param value
	 * @param sdf
	 * @return
	 */
	public static Date doConvertToDate(String value,String sdf) {
		SimpleDateFormat sdf2 = new SimpleDateFormat(sdf);
		Date date= null;;
		try {
			if(value!=null && value.trim().length()>0){
				date = sdf2.parse(value);
			}
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return date;
	}

}
