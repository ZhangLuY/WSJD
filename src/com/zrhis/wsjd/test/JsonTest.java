package com.zrhis.wsjd.test;

import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;

import sun.misc.BASE64Encoder;

import com.zrhis.wsjd.util.MD5Encoder;

/**
 * json测试类
 * @author 张豫松
 * 2013年6月24日10:42:10
 */

public class JsonTest {
	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		/*System.out.println("请输入想转换的数字："); 
		Scanner in =new Scanner(System.in); 
		int num=in.nextInt();*/
		 /*String numStr=Integer.toBinaryString(16777222); 
		System.out.println(numStr); 
		StringBuffer bf=new StringBuffer();
		 for(int i=0;i<numStr.length();i++){
		 if(numStr.charAt(i)!='0'){ bf.append(numStr.length()-1-i);
		 } 
		} 
		int arr[]=new int[bf.length()];
		 for(int i=0;i<bf.length();i++)
		{
			 arr[i]=bf.charAt(i)-'0';
			 System.out.println(arr[i]);
			
		}*/

		 //int arr[32] = {0}; 
		/*int val=16777222;
		 	int [] arr=new int[32];
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
		                arr[i] = i+1;  
		                set.add((i+1)+"");  
		            } 
		            temp = temp << 1; 
		        } 
	      } 
	        System.out.println(set.size());
	        for(String value : set){  
	            System.out.print(value+" ");  
	        } */
	        
	       /* for(int a=0;a<arr.length;a++){
	        	 System.out.println("---arr--"+arr[a]);
	        }*/
		
		System.out.println(MD5Encoder.getMd5("123456")); 
		
        
	       
	}
}