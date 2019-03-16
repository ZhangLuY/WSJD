package com.zrhis.wsjd.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import sun.misc.BASE64Encoder;

/**
 * MD5加密算法
 * @author 张豫松
 * 2010年7月5日16:37:55
 */
//获取md5,进行64位处理；如果以后sun去掉了：sun.misc.BASE64Encoder;，就单独写个类BASE64Encoder
public class MD5Encoder {
	 public final static String encoder(String s) {   
		  char hexDigits[] = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9',   
		    'a', 'b', 'c', 'd', 'e', 'f' };   
		  try {   
		   byte[] strTemp = s.getBytes();   
		   MessageDigest mdTemp = MessageDigest.getInstance("MD5");   
		   BASE64Encoder encoder = new BASE64Encoder();
		   mdTemp.update(strTemp);   
		   byte[] md = mdTemp.digest();   
		   int j = md.length;   
		   char str[] = new char[j * 2];   
		   int k = 0;   
		   for (int i = 0; i < j; i++) {   
		    byte byte0 = md[i];   
		    str[k++] = hexDigits[byte0 >>> 4 & 0xf];   
		    str[k++] = hexDigits[byte0 & 0xf];   
		   }   
		   return encoder.encode(new String(str).getBytes());   
		  } catch (Exception e) {   
		   return null;   
		  }   
		 } 
	
	 
	 public static String getMd5(String plainText) {  
          try { 
              MessageDigest md = MessageDigest.getInstance("MD5");  
             md.update(plainText.getBytes());  
             byte b[] = md.digest();  
   
             int i;  
   
             StringBuffer buf = new StringBuffer("");  
             for (int offset = 0; offset < b.length; offset++) {  
                 i = b[offset];  
                 if (i < 0)  
                     i += 256;  
                 if (i < 16)  
                     buf.append("0");  
                 buf.append(Integer.toHexString(i));  
             }  
             //32位加密  
             return buf.toString().toUpperCase();  
             // 16位的加密  
             //return buf.toString().substring(8, 24);  
         } catch (NoSuchAlgorithmException e) {  
             e.printStackTrace();  
             return null;  
         }  
		   
     } 
}
