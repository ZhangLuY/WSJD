package com.zrhis.wsjd.util;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 主键生成方法
 * @author 张豫松
 * 2013年6月21日14:19:55
 */

public class GenerateIdTools {
	public static String generateByTime() {
		return new SimpleDateFormat("yyyyMMddHHmmssSSS").format(new Date());
	}
	
	public static String generateByTime(String str) {
		return "".equals(str.trim()) ? generateByTime() : str + generateByTime();
	}
	
	public static void main(String[] args) {
		System.out.println(generateByTime());
	}
}
