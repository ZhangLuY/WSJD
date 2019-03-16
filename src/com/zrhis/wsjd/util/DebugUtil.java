package com.zrhis.wsjd.util;

import net.sf.json.JSONObject;

public class DebugUtil {
	
	public static final boolean IS_DEBUG = true;
	public static void println(Object obj){
		String callerInfo = getCallerInfo();
		System.out.println(callerInfo);
		System.out.println(obj);
		System.out.println();
	}
	
	private static String getCallerInfo(){
		JSONObject data = getCaller();
		String callerInfo = (String)data.get("className")+"."+(String)data.get("method")+
				"("+(String)data.get("file")+":"+data.get("lineNumber").toString()+")";
		return callerInfo;
	}
	/**
	 * 获取调用者
	 * @return StackTraceElement
	 */
	private static JSONObject getCaller(){
		String fullClassName = DebugUtil.class.getName();
        // 首先得到调用栈
        StackTraceElement stack[] = (new Throwable()).getStackTrace();
        // 然后从栈中向上搜索，直到搜索到我们的Important类。
        int ix = 0;
        while (ix < stack.length) {
            StackTraceElement frame = stack[ix];
            String cname = frame.getClassName();
            if (cname.equals(fullClassName)) {
                break;
            }
            ix++;
        }
        // 此时ic位置放置的是Important类。
        while (ix < stack.length) {
            StackTraceElement frame = stack[ix];
            String cname = frame.getClassName();
            if (!cname.equals(fullClassName)) {
                //第一个费Important类的类就是调用者
            	JSONObject data = new JSONObject();
            	data.put("className",frame.getClassName());
            	data.put("method",frame.getMethodName());
            	data.put("lineNumber", frame.getLineNumber());
            	data.put("file", frame.getFileName());
                return data;
            }
            ix++;
        }
		return null;
	}
}
