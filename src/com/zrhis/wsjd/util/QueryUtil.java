package com.zrhis.wsjd.util;

import java.beans.PropertyDescriptor;

import javax.persistence.Query;

public class QueryUtil {
	public static Query setParamters(Query query,Object entity,boolean includeNull) throws Exception{
		PropertyDescriptor[] properties = EntityUtil.getPropertyDescriptors(entity.getClass());
		String primaryKey = EntityUtil.getPrimaryKey(entity.getClass()).getName();
		for(PropertyDescriptor p:properties){
			Object value = EntityUtil.getPropertyValue(entity, p);
			if(value == null){
				
			}
		}
		return query;
	}
}
