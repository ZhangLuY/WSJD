package com.zrhis.wsjd.util;

import java.util.HashMap;
import java.util.Map;

/**
 * 导出excel时候把需要导出的各列所需属性存储在Map中
 * @author 张豫松
 * 2012年2月23日9:14:22
 */

public class MapUtil {
	
	/**
	 * 给导出excel各列所需属性赋值，name参数值是必须的，其他三个参数值可以为空，程序会默认
	 * @param name 属性名称，对应集合中的map的键
	 * @param width 列宽度
	 * @param format 列显示格式，比如日期格式yyyy-MM-dd
	 * @param isText 列显示类型是否是文本
	 * @return
	 */
	public static Map<String, Object> setAttr(String name, Integer width, String format, boolean isText) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("name", name);
		if (width != null) {
			map.put("width", width);
		}
		if (format != null) {
			map.put("format", format);
		}
		if (isText) {
			map.put("isText", isText);
		}
		return map;
	}
	
	/**
	 * 只存储属性名称
	 * @param name
	 * @return
	 */
	public static Map<String, Object> setAttr(String name) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("name", name);
		return map;
	}
	
	/**
	 * 存储属性名称和宽度值
	 * @param name
	 * @param width
	 * @return
	 */
	public static Map<String, Object> setAttr(String name, Integer width) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("name", name);
		if (width != null) {
			map.put("width", width);
		}
		return map;
	}
	
	/**
	 * 存储属性名称和宽度以及是否转换和转换内容
	 * @param name
	 * @param width
	 * @param isTransform
	 * @param transformMap
	 * @return
	 */
	public static Map<String, Object> setAttr(String name, Integer width, boolean isTransform, Map<Object, Object> transformMap) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("name", name);
		if (width != null) {
			map.put("width", width);
		}
		if (isTransform) {
			map.put("isTransform", isTransform);
		}
		if (transformMap != null) {
			map.put("transformMap", transformMap);
		}
		
		return map;
	}

	
}
