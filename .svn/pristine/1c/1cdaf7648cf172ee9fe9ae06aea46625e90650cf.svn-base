package com.zrhis.wsjd.util;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DataBaseTools {
	
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
					map.put(columnName, value);
				}
				list1.add(map);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list1;
	}
	public static void colseResource(Connection conn,CallableStatement ps,ResultSet rs) throws Exception{
		if(rs != null){
			rs.close();
		}
		if(ps != null){
			ps.close();
		}
		if(conn != null){
			conn.close();
		}
	}
}
