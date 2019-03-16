package com.zrhis.wsjd.util;

import java.io.IOException;
import java.io.StringWriter;

import org.codehaus.jackson.JsonGenerator;
import org.codehaus.jackson.map.ObjectMapper;
import org.junit.Test;

public class JacksonProcessUtil {
	private static ObjectMapper mapper;
	
	public static synchronized ObjectMapper getMapperInstance(boolean createNew){
		if(createNew){
			return new ObjectMapper();
		}else if(mapper == null){
			mapper = new ObjectMapper();
		}
		return mapper;
	}
	
	public static synchronized ObjectMapper getMapperInstance(){
		
		return getMapperInstance(false);
		
	}
	
	public static String beanToJson(Object entity) throws IOException{
		StringWriter writer = null;
		JsonGenerator generator = null;
		String json = null;
		try {
			ObjectMapper mapper = getMapperInstance();
			writer = new StringWriter();
			generator = mapper.getJsonFactory().createJsonGenerator(writer);
			mapper.writeValue(generator, entity);
		} catch (Exception e) {
			if(DebugUtil.IS_DEBUG)
				e.printStackTrace();
			throw new IOException(e.getMessage());
		}
		if(generator != null){
			try {
				generator.close();
			} catch (Exception e) {
				if(DebugUtil.IS_DEBUG)
				e.printStackTrace();
			}
		}
		json = writer.toString();
		if(writer != null){
			try {
				writer.close();
			} catch (Exception e) {
				if(DebugUtil.IS_DEBUG)
				e.printStackTrace();
			}
		}
		return json;
	}
	public static Object jsonToBean(String json, Class<?> clz) throws Exception{
		 ObjectMapper mapper = getMapperInstance();
		 Object obj = mapper.readValue(json, clz);
		 return obj;
	}
	
	@Test
	public void test(){/*
		WsjdUser user = new WsjdUser();
		user.setDepId("123456");
		user.setDepName("henan");
		user.setCCzybh("1263age85a65");
		try {
			String json = beanToJson(user);
			System.out.println(json);
			WsjdUser user2 = (WsjdUser)jsonToBean(json,WsjdUser.class);
			BeanTransform.printBeanValue(user2);
		} catch (Exception e) {
			e.printStackTrace();
		}
	*/}
}
