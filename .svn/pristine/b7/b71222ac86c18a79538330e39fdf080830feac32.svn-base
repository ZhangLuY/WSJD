package com.zrhis.wsjd.util;

import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

public class StringUtils {
	public  Set<Integer> set = new HashSet<Integer>();
	
	/**boject 类型转STRING 类型*/
	public static String objectToString(Object obj) {
		return obj != null && !"".equals(obj)&&!"null".equals(obj)&& !" ".equals(obj)?obj.toString():"";
	}
	/**boject 类型转STRING 类型*/
	public static int objectToInt(Object object) {
		String obj=objectToString(object);
		return obj != null && !"null".equals(obj)&&!"".equals(obj)?Integer.parseInt(obj):0;
	}
	
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

	
	 /** 
     * 使用java正则表达式去掉多余的.与0 
     * @param s 
     * @return  
     */  
    public static String subZeroAndDot(String s){  
        if(s.indexOf(".") > 0){  
            s = s.replaceAll("0+?$", "");//去掉多余的0  
            s = s.replaceAll("[.]$", "");//如最后一位是.则去掉  
        }  
        return s;  
    }  
   
    /**
     * 
     * 根据数量和单价算金额
     */
    public static Double countMoney(Object sl,Object dj){
    	double Dsl=objectTodouble(sl);
    	double Ddj=objectTodouble(dj);
    	double Dje=Dsl*Ddj;
		return Dje;
    }
    
    
    
    /**
     * 判断字符串是否全部字母
     */
    
    public static boolean isLetter(String str){ 
    	java.util.regex.Pattern pattern = java.util.regex.Pattern.compile("[a-zA-Z]+"); 
    	java.util.regex.Matcher m = pattern.matcher(str);
    	return m.matches(); 
    	} 
   
    //流水号加1后返回，流水号长度为6
    private static final String STR_FORMAT = "000000";   
    public static String haoAddOne(String liuShuiHao){  
        Integer intHao = Integer.parseInt(liuShuiHao);  
        if(intHao==999999){
        	intHao=0;
        }
        intHao++;  
        DecimalFormat df = new DecimalFormat(STR_FORMAT);  
        return df.format(intHao);  
    }  
    //object 转double
	public static double objectTodouble(Object obj) {
		String str=objectToString(obj);
		if(str != null && !"".equals(str)&&!"null".equals(str)&& !" ".equals(str)){
			return Double.parseDouble(str);
		}else{
			return 0;
		}
		//return obj != null && !"".equals(obj)&&!"null".equals(obj)&& !" ".equals(obj)?obj.toString():"";
	}
	
	//格式化json
	  public static String StringTojson(String jsonStr) {
			int start=jsonStr.indexOf("{")+1;
			int end =jsonStr.indexOf("}");
			String json=jsonStr.substring(start, end);
			String []arry= json.split(",");
			StringBuffer jsonForMatStr = new StringBuffer();
			for (int i = 0; i < arry.length; i++) {
				String [] arry1=arry[i].split(":");
					String s1=arry1[0];
				String s2="\""+s1+"\":"+"\""+arry1[1]+"\"";
				jsonForMatStr.append(s2);
				if(i==arry.length-1){
				}else{
					jsonForMatStr.append(",");
				}
			}
			jsonForMatStr.insert(0, "{");
			jsonForMatStr.append("}");
			System.out.println(jsonForMatStr);
		    return jsonForMatStr.toString();
		  }
	  
	  
	  //金额的进位
	  public static double jejwfs(double money,int flag){
		  double money1=0;
		  if(flag==1){
			  if(money>0){
				  money1=Math.ceil(money*10)/10;
			  } 
		  }
		return money1;
	  }
	  /**
	   * 
	   * <br>功能：<B>获取18位唯一码</B>
	   * <br>思路： 用时间戳加上4位随机数生成
	   * <OL>
	   *   <LI>1、</LI>
	   *   <LI>2、</LI>
	   *   <LI>3、</LI>
	   * </OL>
	   * <br>相关性：
	   * @return
	   */
	  public static String getRandomUUID() {
		  //1、创建时间戳
		  java.util.Date dateNow = new java.util.Date();
		  SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
		  String dateNowStr = dateFormat.format(dateNow);
		  StringBuffer sb = new StringBuffer(dateNowStr);

		  //2、创建随机对象
		  Random rd = new Random(); 
		  
		  //3、产生4位随机数
		  String n = "";
		  int rdGet; //取得随机数

		  do {
		   rdGet = Math.abs(rd.nextInt()) % 10 + 48; //产生48到57的随机数(0-9的键位值)
		   // rdGet=Math.abs(rd.nextInt())%26+97; //产生97到122的随机数(a-z的键位值)
		   char num1 = (char) rdGet;
		   String dd = Character.toString(num1);
		   n += dd;
		  } while (n.length() < 4);// 假如长度小于4
		  sb.append(n);
		  //4、返回唯一码
		  return sb.toString();
		 }

	  
	  
	  /**  
	     * 计算两个日期之间相差的天数  
	     * @param smdate 较小的时间 
	     * @param bdate  较大的时间 
	     * @return 相差天数 
	     * @throws ParseException  
	     */    
	    public static int daysBetween(Date smdate,Date bdate) throws ParseException    
	    {    
	        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");  
	        smdate=sdf.parse(sdf.format(smdate));  
	        bdate=sdf.parse(sdf.format(bdate));  
	        Calendar cal = Calendar.getInstance();    
	        cal.setTime(smdate);    
	        long time1 = cal.getTimeInMillis();                 
	        cal.setTime(bdate);    
	        long time2 = cal.getTimeInMillis();         
	        long between_days=(time2-time1)/(1000*3600*24);  
	            
	       return Integer.parseInt(String.valueOf(between_days));           
	    }    
	      
	/** 
	*字符串的日期格式的计算 
	*/  
	    public static int daysBetween(String smdate,String bdate) throws ParseException{  
	        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");  
	        Calendar cal = Calendar.getInstance();    
	        cal.setTime(sdf.parse(smdate));    
	        long time1 = cal.getTimeInMillis();                 
	        cal.setTime(sdf.parse(bdate));    
	        long time2 = cal.getTimeInMillis();         
	        long between_days=(time2-time1)/(1000*3600*24);  
	            
	       return Integer.parseInt(String.valueOf(between_days));     
	    }  
	  /*
	   * date 日期
	   * k加减几天
	   */
	  public static Date dateAddDays(Date date,int k){
		    Calendar   calendar   =   new   GregorianCalendar(); 
		     calendar.setTime(date); 
		     calendar.add(calendar.DATE,k);//把日期往后增加一天.整数往后推,负数往前移动 
		     Date todate=calendar.getTime(); 
		     return todate;
	  }
	  
	  /**
	   * 
	   * @Description: TODO
	   * @param @param date时间类型年月日
	   * @param @param str string类型的十分秒
	   * @param @return   
	   * @return Date  
	   * @throws
	   * @author 窦纪平
	   * @date 2016-10-13
	   */
	  public static Date together(Date date ,String str){
		  SimpleDateFormat dtf=new SimpleDateFormat("yyyy-MM-dd");
		  SimpleDateFormat dtf1=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
			String sdate=dtf.format(date);
			String sdate1=sdate+" "+str;
			Date date2=null;
			try {
				date2= dtf1.parse(sdate1);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return date2;
	  }
	  
	  //object 转map
	    public static Map<String, Object> objectToMap(Object obj) throws Exception {    
	        if(obj == null)  
	            return null;      	  
	        Map<String, Object> map = new HashMap<String, Object>();   
	        BeanInfo beanInfo = Introspector.getBeanInfo(obj.getClass());    
	        PropertyDescriptor[] propertyDescriptors = beanInfo.getPropertyDescriptors();    
	        for (PropertyDescriptor property : propertyDescriptors) {    
	            String key = property.getName();    
	            if (key.compareToIgnoreCase("class") == 0) {   
	                continue;  
	            }  
	            Method getter = property.getReadMethod();  
	            Object value = getter!=null ? getter.invoke(obj) : null;  
	            map.put(key, value);  
	        }     
	        return map;  
	    } 
	    
	    /**
	     * 四舍五入保留小数
	     * @Description: TODO
	     * @param @param number
	     * @param @param k 精确几位
	     * @param @return   
	     * @return double  
	     * @throws
	     * @author 窦纪平
	     * @date 2016-11-6
	     */
	    public static double decimal(double number,int k){
	    	if(number!=0){
	    		BigDecimal   b   =   new   BigDecimal(number);  
			    double   number1   =   b.setScale(k,   BigDecimal.ROUND_HALF_UP).doubleValue();
				return number1;
	    	}else{
	    		return number;
	    	}
		    
	    }
	    /**
	    * 提供精确的小数位四舍五入处理。
	    * @param v 需要四舍五入的数字
	    * @param scale 小数点后保留几位
	    * @return 四舍五入后的结果
	    */
	    public static double round(double v, int scale) {
	    	   if (scale < 0) {
	    	    throw new IllegalArgumentException(
	    	      "The scale must be a positive integer or zero");
	    	   }
	    	   BigDecimal b = new BigDecimal(Double.toString(v));
	    	   BigDecimal ne = new BigDecimal("1");
	    	   return b.divide(ne, scale, BigDecimal.ROUND_HALF_UP).doubleValue();
	    	
	    	}
	    
	    
	    
	    /**
	    * 提供（相对）精确的除法运算。当发生除不尽的情况时，由scale参数指
	    * 定精度，以后的数字四舍五入。
	    * @param v1 被除数
	    * @param v2 除数
	    * @param scale 表示表示需要精确到小数点以后几位。
	    * @return 两个参数的商
	    */
	    public static double div(Object ob1, Object ob2, int scale) {
	    	   if (scale < 0) {
	    	    throw new IllegalArgumentException(
	    	      "The scale must be a positive integer or zero");
	    	   }
	    	   double v1=objectTodouble(ob1);
	    	   double v2=objectTodouble(ob2);
	    	   BigDecimal b1 = new BigDecimal(Double.toString(v1));
	    	   BigDecimal b2 = new BigDecimal(Double.toString(v2));
	    	   return b1.divide(b2, scale, BigDecimal.ROUND_HALF_UP).doubleValue();
	    	}
	  //判断是否是整数
	    public static boolean isNumeric(String s)
	    {
	       if((s != null)&&(s!=""))
	        return s.matches("^[0-9]*$");
	       else
	        return false;
	    }
	    //判断传递来的是否是数字
	    public static int checkID(String s)
	    {
	       if((s == null)||(s.length() == 0)||!s.matches("^[0-9]*$"))
	       {
	        return 0;
	       }
	       else
	       {
	        if(s.length() < 10)
	        {
	         return Integer.parseInt(s);
	          }
	          else
	          {
	            return 0;
	          } 
	       }
	    } 
	    public static List<Map<String,String>> resultSetToList(ResultSet rs){
			List<Map<String,String>> list1 = new ArrayList<Map<String,String>>();
			try {
				ResultSetMetaData metaData = rs.getMetaData();
				int count = metaData.getColumnCount();
				while(rs.next()){
					Map<String,String> map = new HashMap<String,String>();
				for(int i=0;i<count;i++){	
						String columnName = metaData.getColumnName(i+1);
						String value = rs.getString(columnName);
						value = value==null?"":value;
						map.put(columnName.toUpperCase(), value);
					}
					//System.out.println(map);
					list1.add(map);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return list1;
		}  
	    
}
