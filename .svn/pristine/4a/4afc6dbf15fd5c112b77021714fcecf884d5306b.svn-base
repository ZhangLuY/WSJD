package com.zrhis.wsjd.util;

import java.io.UnsupportedEncodingException;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;







/**
 * 
 * 项目名称
 * 包          名 db
 * 文   件  名 DbUtils.java
 * 开   发  人 Administrator
 * 描述信息 数据库连接帮助类
 * 发布日期 
 * 修改日期 
 * 修   改  人        
 * 版本信息 
 *
 */
public class DbUtils {
	private static String DRIVER;
	private static String URL;
	private static String NAME;
	private static String PWD;
	private static Connection conn=null;
	private static String path;

	
	/**
	 * 释放数据库操作对象
	 * @param conn
	 * @param pmst
	 * @param rs
	 */
	public static void freeDb(Connection conn,PreparedStatement pmst,ResultSet rs){
		try {
			if (rs!=null) {
				rs.close();
				
			}
		} catch (Exception e) {
			throw new DbException("关闭ResultSet对象异常");
		}
		try {
			if (pmst!=null) {
				pmst.close();
				
			}
		} catch (Exception e) {
			throw new DbException("关闭PreparedStatement对象异常");
		}
		try {
			if (conn!=null) {
				conn.close();
				
			}
		} catch (Exception e) {
			throw new DbException("关闭ResultSet对象异常");
		}
		
	}
	
	
	
	/**
	 * 释放数据库操作对象(0带存储过程）
	 * @param conn
	 * @param pmst
	 * @param rs
	 */
	public static void freeDbpro(Connection conn,CallableStatement casm,ResultSet rs){
		try {
			if (rs!=null) {
				rs.close();
				
			}
		} catch (Exception e) {
			throw new DbException("关闭ResultSet对象异常");
		}
		try {
			if (casm!=null) {
				casm.close();
				
			}
		} catch (Exception e) {
			throw new DbException("关闭PreparedStatement对象异常");
		}
		try {
			if (conn!=null) {
				conn.close();
				
			}
		} catch (Exception e) {
			throw new DbException("关闭ResultSet对象异常");
		}
		
	}

}
