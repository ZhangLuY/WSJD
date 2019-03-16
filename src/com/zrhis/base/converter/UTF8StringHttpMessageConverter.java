package com.zrhis.base.converter;


import java.nio.charset.Charset;

import org.springframework.http.MediaType;
import org.springframework.http.converter.StringHttpMessageConverter;

import com.zrhis.wsjd.util.DebugUtil;

public class UTF8StringHttpMessageConverter extends StringHttpMessageConverter {

	private static final MediaType utf8 = new MediaType("text", "plain", Charset.forName("UTF-8"));   
	  
    @Override  
    protected MediaType getDefaultContentType(String dumy) {
    	DebugUtil.println("Test StringHttpMessageConverter");
        return utf8;  
    }  
	
}
