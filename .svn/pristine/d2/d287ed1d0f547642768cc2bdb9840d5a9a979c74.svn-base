package com.zrhis.wsjd.util;


import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.SessionFactoryUtils;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * DaoUtil（Dao层工具类）
 * @author jxg
 */
public class MyDaoBase extends HibernateDaoSupport {
	private static final Log logger = LogFactory.getLog(MyDaoBase.class);
	/**
	 * 添加
	 */
	public <T>boolean save(T entity) {
		getHibernateTemplate().save(entity);
		getHibernateTemplate().flush();
		return true;
	}
	
	
	/**
	 * 添加或修改
	 * @param Obejct
	 * @param entity
	 * @return
	 */
	public  <T>boolean saveOrUpdate(T entity) {
		getHibernateTemplate().saveOrUpdate(entity);
		getHibernateTemplate().flush();
		return true;
	}
	
	/**
	 * 批量保存
	 * @param Obejct
	 * @param entity
	 * @param i
	 * @return
	 */
	public <T>boolean saveBatch(T entity, int i) {
		try {
			getHibernateTemplate().save(entity);
			if (i%50==0) {
				getHibernateTemplate().flush();
				getHibernateTemplate().clear();
			}
			return true;
		} catch (RuntimeException re) {
			logger.error(re);
			re.printStackTrace();
			throw re;
		}
	}
	

	/**
	 * 更新
	 * @param Obejct
	 * @param entity
	 */
	public <T>boolean merge(T entity) {
		getHibernateTemplate().merge(entity);
		getHibernateTemplate().flush();
		return true;
	}
	
	/**
	 * 删除
	 * @param <T1>
	 * @param <T2>
	 * @param c
	 * @param id
	 */
	@SuppressWarnings("unchecked")
	public <T1, T2> boolean delete(Class<T1> c,T2 id) {
		try {
			T1 instance = (T1) getHibernateTemplate().get(c, (Serializable) id);
			this.getHibernateTemplate().delete(instance);
			return true;
		} catch (RuntimeException re) {
			logger.error(re);
			re.printStackTrace();
			throw re;
		}
	}
	
	/**
	 * 删除
	 * @param o
	 */
	@SuppressWarnings("unchecked")
	public  boolean delete(Object o) {
		getHibernateTemplate().delete(o);
		getHibernateTemplate().flush();
		return true;
	}
	
	/**
	 * 执行原生sql更新
	 * @param execSql
	 * @param map
	 * @return
	 */
	public int execSqlUpdate(final String dbsql, final Map<String,Object> map) {
		return (Integer)getHibernateTemplate().execute(new HibernateCallback(){
			public Object doInHibernate(Session session)
				throws HibernateException, SQLException {
				Query query =  session.createSQLQuery(dbsql);
				getHibernateTemplate().setCacheQueries(true);  
				if(map!=null&&!map.isEmpty()){
					Iterator it  = map.entrySet().iterator();
					while(it.hasNext()){
						 Map.Entry map = (Map.Entry)it.next();
						 query.setParameter((String)map.getKey(),map.getValue());
					}
				}
				return new Integer(query.executeUpdate());
			
		}});
	}
	
	/**
	 * 执行hsql更新
	 * @param hql
	 * @param map
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public int execHQLUpdate(final String hql,final Map map) {
		return (Integer)getHibernateTemplate().execute(new HibernateCallback(){
			public Object doInHibernate(Session session)
				throws HibernateException, SQLException {
				Query query =  session.createQuery(hql);
				if(map!=null&&!map.isEmpty()){
					Iterator it  = map.entrySet().iterator();
					while(it.hasNext()){
						 Map.Entry entry = (Map.Entry)it.next();
						 query.setParameter((String)entry.getKey(),entry.getValue());
					}
				}
				return new Integer(query.executeUpdate());
			
		}});
	}
	
	/**
	 * 根据主建查找
	 * @param <T1>
	 * @param <T2>
	 * @param c
	 * @param id
	 * @return 
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public <T1, T2> T1 findByKey(Class<T1> c, T2 id) {
		return (T1)this.getHibernateTemplate().get(c,(Serializable) id); 
	}
	
	/**
	 * 不分页查询
	 * @param hql
	 * @param map
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public List findListByHql(final String hql,final Map map) {
		return (List)getHibernateTemplate().execute(new HibernateCallback(){
			public Object doInHibernate(Session session)
				throws HibernateException, SQLException {
				Query query =  session.createQuery(hql);
				if(map!=null&&!map.isEmpty()){
					 Iterator it = map.entrySet().iterator();
					 while(it.hasNext()){
						 Map.Entry entry =(Map.Entry)it.next();
						 query.setParameter((String)entry.getKey(), entry.getValue());
					 }
				}
				return query.list();
		}});
	}
	
	/**
	 * 不分页查询
	 * @param sql
	 * @param map
	 * 绑定class
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public List findListBySql(final String dbsql,final Map map,final Class c) {
		return (List)getHibernateTemplate().execute(new HibernateCallback(){
			public Object doInHibernate(Session session)
					throws HibernateException, SQLException {
				Query query = session.createSQLQuery(dbsql).addEntity(c);
				if(map!=null&&!map.isEmpty()){
				Iterator it = map.entrySet().iterator();
					while(it.hasNext()){
						Map.Entry entry = (Map.Entry)it.next();
						query.setParameter((String)entry.getKey(), entry.getValue());
					}
				}
				return query.list();
			}
		});
	}
	/**
	 * 不分页查询
	 * @param sql
	 * @param map
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public List findListBySql2(final String dbsql,final Map map) {
		return (List)getHibernateTemplate().execute(new HibernateCallback(){
			public Object doInHibernate(Session session)
					throws HibernateException, SQLException {
				Query query = session.createSQLQuery(dbsql);
				if(map!=null&&!map.isEmpty()){
				Iterator it = map.entrySet().iterator();
					while(it.hasNext()){
						Map.Entry entry = (Map.Entry)it.next();
						query.setParameter((Integer)entry.getKey(), entry.getValue());
					}
				}
				return query.list();
			}
		});
	}
	/** 2014年3月19日11:29:12 李志超
	 * 不分页查询
	 * @param sql
	 * @param map 
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public List findListBySql3(final String dbsql,final Map map) {
		return (List)getHibernateTemplate().execute(new HibernateCallback(){
			public Object doInHibernate(Session session)
					throws HibernateException, SQLException {
				Query query = session.createSQLQuery(dbsql);
				if(map!=null&&!map.isEmpty()){
				Iterator it = map.entrySet().iterator();
					while(it.hasNext()){
						Map.Entry entry = (Map.Entry)it.next();
						query.setParameter((String)entry.getKey(), entry.getValue());
					}
				}
				return query.list();
			}
		});
	}

	/**
	 * 分页查询
	 * @param hql
	 * @param map
	 * @param classid
	 * @param pageSize
	 * @param pageIndex
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public List findPageByHql(final String hql,final Map map,final int pageSize,final int pageNo) {
		return (List)getHibernateTemplate().execute(new HibernateCallback(){
			public Object doInHibernate(Session session)
					throws HibernateException, SQLException {
				Query query = session.createQuery(hql);
				if(map!=null&&!map.isEmpty()){
				Iterator it = map.entrySet().iterator();
					while(it.hasNext()){
						Map.Entry entry = (Map.Entry)it.next();
						query.setParameter((String)entry.getKey(), entry.getValue());
					}
				}
				query.setFirstResult(pageSize* (pageNo-1));
				query.setMaxResults(pageSize);
				return query.list();
			}
		});
	}
	
	

	/**
	 * 分页查询(绑定class)
	 * @param sql
	 * @param map
	 * @param classid
	 * @param pageSize
	 * @param pageIndex
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public List findPageBySql(final String sql,final  Map map,final int pageSize,final int pageNo,final Class c) {
		return (List)getHibernateTemplate().execute(new HibernateCallback(){
			public Object doInHibernate(Session session)
					throws HibernateException, SQLException {
				Query query = session.createSQLQuery(sql).addEntity(c);
				if(map!=null&&!map.isEmpty()){
				Iterator it = map.entrySet().iterator();
					while(it.hasNext()){
						Map.Entry entry = (Map.Entry)it.next();
						query.setParameter((String)entry.getKey(), entry.getValue());
					}
				}
				query.setFirstResult(pageSize* (pageNo-1));
				query.setMaxResults(pageSize);
				return query.list();
			}
		});
	}
	/**
	 * 分页查询
	 * @param sql
	 * @param map
	 * @param classid
	 * @param pageSize
	 * @param pageIndex
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public List findPageBySql(final String sql,final  Map map,final int pageSize,final int pageNo) {
		return (List)getHibernateTemplate().execute(new HibernateCallback(){
			public Object doInHibernate(Session session)
					throws HibernateException, SQLException {
				Query query = session.createSQLQuery(sql);
				if(map!=null&&!map.isEmpty()){
				Iterator it = map.entrySet().iterator();
					while(it.hasNext()){
						Map.Entry entry = (Map.Entry)it.next();
						query.setParameter((Integer)entry.getKey(), entry.getValue());
					}
				}
				query.setFirstResult(pageSize* (pageNo-1));
				query.setMaxResults(pageSize);
				return query.list();
			}
		});
	}
	/**
	 * 分页查询
	 * @param sql
	 * @param map
	 * @param classid
	 * @param pageSize
	 * @param pageIndex
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public List findPageBySql_str(final String sql,final  Map map,final int pageSize,final int pageNo) {
		return (List)getHibernateTemplate().execute(new HibernateCallback(){
			public Object doInHibernate(Session session)
					throws HibernateException, SQLException {
				Query query = session.createSQLQuery(sql);
				if(map!=null&&!map.isEmpty()){
				Iterator it = map.entrySet().iterator();
					while(it.hasNext()){
						Map.Entry entry = (Map.Entry)it.next();
						query.setParameter((String)entry.getKey(), entry.getValue());
					}
				}
				query.setFirstResult(pageSize* (pageNo-1));
				query.setMaxResults(pageSize);
				return query.list();
			}
		});
	}
	/**
	 * 查看单个值
	 * @param hql
	 * @param map
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public Object findObjectByHql(final String hql,final Map map) {
		return (Object)getHibernateTemplate().execute(new HibernateCallback(){
			public Object doInHibernate(Session session)
				throws HibernateException, SQLException {
				Query query =  session.createQuery(hql);
				if(map!=null&&!map.isEmpty()){
					Iterator it  = map.entrySet().iterator();
					while(it.hasNext()){
						 Map.Entry entry = (Map.Entry)it.next();
						 query.setParameter((String)entry.getKey(),entry.getValue());
					}
				}
				return query.uniqueResult();
		}});
	
	}
	
	/**
	 * 查询单个值
	 * @param sql
	 * @param map
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public Object findObjectBySql(final String dbsql,final Map map,final Class c) {
		return (Object)getHibernateTemplate().execute(new HibernateCallback(){
			public Object doInHibernate(Session session)
				throws HibernateException, SQLException {
				Query query =  session.createSQLQuery(dbsql).addEntity(c);
				if(map!=null&&!map.isEmpty()){
					Iterator it  = map.entrySet().iterator();
					while(it.hasNext()){
						 Map.Entry entry = (Map.Entry)it.next();
						 query.setParameter((String)entry.getKey(),entry.getValue());
					}
				}
				return query.uniqueResult();
		}});
	}

	
	/**
	 * 查询总数
	 * @param sql
	 * @param map
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public Integer findAllCountBySql(final String dbsql,final Map map) {
		return (Integer)getHibernateTemplate().execute(new HibernateCallback(){
			public Object doInHibernate(Session session)
			throws HibernateException, SQLException {
			Query query =  session.createSQLQuery(dbsql);
			if(map!=null&&!map.isEmpty()){
				Iterator it  = map.entrySet().iterator();
				while(it.hasNext()){
					 Map.Entry entry = (Map.Entry)it.next();
					 query.setParameter((Integer)entry.getKey(),entry.getValue());
				}
			}
			return ((BigDecimal)query.uniqueResult()).intValue();
	}});
	}
	
	/**
	 * 查询总数
	 * @param sql
	 * @param map
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public Integer findAllCountBySql_str(final String dbsql,final Map map) {
		return (Integer)getHibernateTemplate().execute(new HibernateCallback(){
			public Object doInHibernate(Session session)
			throws HibernateException, SQLException {
			Query query =  session.createSQLQuery(dbsql);
			if(map!=null&&!map.isEmpty()){
				Iterator it  = map.entrySet().iterator();
				while(it.hasNext()){
					 Map.Entry entry = (Map.Entry)it.next();
					 query.setParameter((String)entry.getKey(),entry.getValue());
				}
			}
			System.out.println((BigDecimal)query.uniqueResult());
			return ((BigDecimal)query.uniqueResult()==null?0:(BigDecimal)query.uniqueResult()).intValue();
	}});
	}
	
	//update 方法
	public boolean updateBySql(final String dbsql,final Map map) {
		return (Boolean)getHibernateTemplate().execute(new HibernateCallback(){
			public Object doInHibernate(Session session)
			throws HibernateException, SQLException {
			Query query =  session.createSQLQuery(dbsql);
			if(map!=null&&!map.isEmpty()){
				Iterator it  = map.entrySet().iterator();
				while(it.hasNext()){
					 Map.Entry entry = (Map.Entry)it.next();
					 query.setParameter((Integer)entry.getKey(),entry.getValue());
				}
			}
				boolean b = false;
				int ret=query.executeUpdate();
				if(ret>0)b=true;
				return b;
			}
		});
	
	}
	/**
	 * 查询金额总数
	 * @param sql
	 * @param map
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public Double findAllSumBySql(final String dbsql,final Map map) {
		return (Double)getHibernateTemplate().execute(new HibernateCallback(){
			public Object doInHibernate(Session session)
			throws HibernateException, SQLException {
			Query query =  session.createSQLQuery(dbsql);
			if(map!=null&&!map.isEmpty()){
				Iterator it  = map.entrySet().iterator();
				while(it.hasNext()){
					 Map.Entry entry = (Map.Entry)it.next();
					 query.setParameter((Integer)entry.getKey(),entry.getValue());
				}
			}
			if(query.uniqueResult()!= null){
				return ((BigDecimal)query.uniqueResult()).doubleValue();
			}else{
				return 0.0;
			}
			
	}});
		
	}
//	
//	public String findMaxBySql(final String dbsql,final Map map) {
//		return (String)getHibernateTemplate().execute(new HibernateCallback(){
//			public Object doInHibernate(Session session)
//			throws HibernateException, SQLException {
//			Query query =  session.createSQLQuery(dbsql);
//			if(map!=null&&!map.isEmpty()){
//				Iterator it  = map.entrySet().iterator();
//				while(it.hasNext()){
//					 Map.Entry entry = (Map.Entry)it.next();
//					 query.setParameter((Integer)entry.getKey(),entry.getValue());
//				}
//			}
//			String retur = query.uniqueResult()==null?null:query.uniqueResult().toString();
//			return retur;
//	}});
//	}
//	public Object findObjectBy(final String dbsql,final Map map){
//		return getHibernateTemplate().execute(new HibernateCallback(){
//			public Object doInHibernate(Session session)
//			throws HibernateException, SQLException {
//			Query query =  session.createSQLQuery(dbsql);
//			if(map!=null&&!map.isEmpty()){
//				Iterator it  = map.entrySet().iterator();
//				while(it.hasNext()){
//					 Map.Entry entry = (Map.Entry)it.next();
//					 query.setParameter((Integer)entry.getKey(),entry.getValue());
//				}
//			}
//			return query.uniqueResult();
//	}});
//		
//	}
	
	/**
	 * 查询单个值
	 * @param sql
	 * @param map
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public Object findObjectBySql(final String dbsql,final Map map) {
		return (Object)getHibernateTemplate().execute(new HibernateCallback(){
			public Object doInHibernate(Session session)
				throws HibernateException, SQLException {
				Query query =  session.createSQLQuery(dbsql);
				if(map!=null&&!map.isEmpty()){
					Iterator it  = map.entrySet().iterator();
					while(it.hasNext()){
						 Map.Entry entry = (Map.Entry)it.next();
						 query.setParameter((String)entry.getKey(),entry.getValue());
					}
				}
				return query.uniqueResult();
		}});
	} 
	
	/***
	 * 拼接hql
	 * @param hql hql语句
	 * @param map 参数列表
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public String joinHQL(String hql, Map map){
		StringBuffer strbuff = new StringBuffer();
		strbuff.append(hql);
		if(map!=null&&!map.isEmpty()){
			Iterator it = map.entrySet().iterator();
			while(it.hasNext()){
				Map.Entry entry = (Map.Entry)it.next();
				strbuff.append(" and "+entry.getKey()+"=:"+entry.getValue());
			}
		}
		return strbuff.toString();
	}
	/**2014年2月25日16:49:43 lzc
	 * 这个方法是从findPageBySql复制过来的  修改了query.setParameter((Integer)entry.getKey(), entry.getValue());
	 * @param sql
	 * @param map
	 * @param pageSize
	 * @param pageNo
	 * @param c
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public List findPageBySqlto(final String sql,final  Map map,final int pageSize,final int pageNo,final Class c) {
		System.out.println(map);
		return (List)getHibernateTemplate().execute(new HibernateCallback(){
			public Object doInHibernate(Session session)
					throws HibernateException, SQLException {
				Query query = session.createSQLQuery(sql).addEntity(c);
				if(map!=null&&!map.isEmpty()){
				Iterator it = map.entrySet().iterator();
					while(it.hasNext()){
						Map.Entry entry = (Map.Entry)it.next();
						query.setParameter((String)entry.getKey(), entry.getValue());
					}
				}
				query.setFirstResult(pageSize* (pageNo-1));
				query.setMaxResults(pageSize);
				return query.list();
			}
		});
	}
}