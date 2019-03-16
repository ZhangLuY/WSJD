package com.zrhis.wsjd.util;

import java.io.IOException;
import java.io.InputStream;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Map;
import java.util.Properties;

import javax.sql.DataSource;

import org.springframework.core.io.support.PropertiesLoaderUtils;

import com.zrhis.wsjd.system.controller.Connect;

public class utils {
	
    public Connection conn = null;  
    public PreparedStatement pst = null; 
    
    
	private DataSource dataSource;
	public DataSource getDataSource() {
		return dataSource;
	}
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	private Map<String, String> initMap;
	/**
	 * 获取最大编号
	 * @param beanName
	 * @param id
	 * @return
	 */
	
	public String getMaxId(String beanName, String id,String bh) {	
		 Properties props = new Properties();  
	        try {
				props=PropertiesLoaderUtils.loadAllProperties("db.properties");
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} 
	        System.out.println("key:::"+props.get("url"));
		/*String maxId = null;
		String sql = "{call PRO_SQGL_GETMAX(?, ?, ?, ?)}";
		Session session = this.getHibernateTemplate().getSessionFactory().openSession();
		List<String> list = session.createSQLQuery(sql)
					.setParameter(0, beanName).setParameter(1, id)
					.setParameter(2, initMap.get(beanName)).setParameter(3, "").list();
		
		if (list != null && !list.isEmpty()) {
			if (list.get(0) != null && !"ERR".equals(list.get(0))) {
				maxId = list.get(0);
			}
		}
		if(session!=null)
			session.close();
		return maxId;*/
		String maxId = null;
		String sql = "{call PRO_SQGL_GETMAX(?, ?, ?, ?)}";
		String rs = null;//获取oracle存储过程结果
		//Session session = this.getHibernateTemplate().getSessionFactory().openSession();
		//ConnectionProvider cp = ((SessionFactoryImplementor)this.hibernateTemplate.getSessionFactory()).getConnectionProvider();
		Connection conn = null;
		CallableStatement call = null;
//		System.out.println("---bean--"+beanName+"--jg--"+id+"---"+initMap.get(beanName));
		try {
//			conn = this.dataSource.getConnection();
			conn = DriverManager.getConnection(props.get("url").toString(), props.get("user").toString(), props.get("password").toString());//获取连接  
			call = conn.prepareCall(sql);
			call.setString(1, beanName);
			call.setString(2,id);
			call.setString(3, bh);
//			call.setString(3, "SQGL_JTCYJBXX");
			call.registerOutParameter(4, oracle.jdbc.OracleTypes.VARCHAR);
			call.execute();
			rs = call.getString(4);
			//System.out.println("rs:"+rs);
		} catch (SQLException e) {
			e.printStackTrace();
		}   
		if (rs != null && !"ERR".equals(rs)) {
			maxId = rs;
			System.out.println("rs:::::"+rs);
		}
		//System.out.println("MaxId:"+maxId);
		if (call != null) {
			try {
				call.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if (conn!=null) {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
			
		return maxId;
	}
}
