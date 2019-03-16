package com.zrhis.base.dao;

import java.util.List;
import java.util.Map;

import com.zrhis.base.ResultModel;

@SuppressWarnings("rawtypes")
public interface BaseDao {
	public void save(Object entity) throws Exception;
	public void update(Object entity) throws Exception;
	public void updateJtjbxxByCjth(String sql) throws Exception;
	public void updateEx(Object entity) throws Exception;
	public Object get(Class clz,String id) throws Exception;
	public void delete(Object entity) throws Exception;
	public void delete(Class clz,String id) throws Exception;
	public void delete(String className,String id) throws Exception;
	
	public <T> List<T> query(Class<T> clz,String property,Object value) throws Exception;
	public <T> List<T> query(Class<T> clz,Map<String ,Object> params) throws Exception;
	public <T> List<T> query(Class<T> clz,Map<String ,Object> params ,String[] orders) throws Exception;
	public <T> List<T> fuzzyQuery(Class<T> clz,Map<String ,Object> params,String[] orders) throws Exception;
	
	public ResultModel queryByJPQL(Class clz,Map<String, Object> params) throws Exception;
	public ResultModel queryByJPQL(Class clz,Map<String, Object> params,int start,int limit) throws Exception;
	public ResultModel queryByJPQL(Class clz,Map<String, Object> params,String[] orders,int start,int limit) throws Exception;
	public ResultModel queryByJPQL(Class clz,Map<String, Object> params,String[] orders) throws Exception;
	public Integer getMaxByPro(String table,String pid) throws Exception;
	public Integer getXmMaxByPro(String table,String jblx) throws Exception;
	public <T> List<T> queryAllByDep(Class<T> clz, Map<String, Object> params,
			String[] orders) throws Exception;
	
	public ResultModel queryAllByDep(Class clz, Map<String, Object> params,
			String[] orders, int start, int limit) throws Exception;
	
	public String getMaxId(String jgid);
}
