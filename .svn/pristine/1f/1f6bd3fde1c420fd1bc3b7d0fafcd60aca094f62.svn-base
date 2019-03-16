package com.zrhis.base.dao.impl;

import java.beans.PropertyDescriptor;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Expression;
import javax.persistence.criteria.Order;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import javax.persistence.metamodel.EntityType;
import javax.sql.DataSource;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.zrhis.base.ResultModel;
import com.zrhis.base.dao.BaseDao;
import com.zrhis.wsjd.util.DebugUtil;
import com.zrhis.wsjd.util.EntityUtil;
import com.zrhis.wsjd.util.JPQLBuilder;
import com.zrhis.wsjd.util.PropertyFilter;

@Repository
@SuppressWarnings({"unchecked","rawtypes"})
public class BaseDaoImpl implements BaseDao{
	private static final Logger logger = Logger.getLogger(BaseDaoImpl.class);
	@PersistenceContext
	protected EntityManager entityManager;
	
	@Autowired
	protected DataSource dataSource;
	@Transactional
	public void save(Object entity) throws Exception{
		try {
			PropertyDescriptor property = EntityUtil.getPrimaryKey(entity.getClass());
			//System.out.println("claa=="+entity.getClass());
			Object val = EntityUtil.getValue(entity, property);
			//System.out.println("val="+val);
			if("".equals(val))EntityUtil.setValue(entity, property, null);
			//System.out.println("entity="+entity==null);
			//System.out.println("entity="+entity!=null);
			this.entityManager.persist(entity);
			//System.out.println(entity.getClass().getSimpleName());
			logger.info("save entity "+entity.getClass().getSimpleName());
		}catch (Exception e) {
			if(DebugUtil.IS_DEBUG)
			e.printStackTrace();
			logger.info("save entity "+entity.getClass().getSimpleName()+" failed!");
			throw new Exception(e.getMessage());
		}
		
	}
	@Transactional
	public void update(Object entity) throws Exception{
		try {
			this.entityManager.merge(entity);
		} catch (Exception e) {
			if(DebugUtil.IS_DEBUG)
			e.printStackTrace();
			throw new Exception(e.getMessage());
		}
	}
	
	public void updateJtjbxxByCjth(String sql) throws Exception{
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			Query query = this.entityManager.createNativeQuery(sql);
			query.executeUpdate();
		} catch (Exception e) {
			if(DebugUtil.IS_DEBUG)
				e.printStackTrace();
				throw new Exception(e.getMessage());
		}
	}
	
	public Object get(Class clz,String id) throws Exception{
		Object entity = null;
		try {
			entity = this.entityManager.find(clz, id);
		} catch (Exception e) {
			if(DebugUtil.IS_DEBUG)
			e.printStackTrace();
			throw new Exception(e.getMessage());
		}
		return entity;
	}
	
	public void delete(Object entity) throws Exception{
		try {
			this.entityManager.remove(entity);
		} catch (Exception e) {
			if(DebugUtil.IS_DEBUG)
			e.printStackTrace();
			throw new Exception(e.getMessage());
		}
	}
	
	public void delete(Class clz,String id) throws Exception{
		try {
			Object entity = this.get(clz, id);
			this.delete(entity);
		} catch (Exception e) {
			if(DebugUtil.IS_DEBUG)
			e.printStackTrace();
			throw new Exception(e.getMessage());
		}
	}
	
	public void delete(String className,String id) throws Exception{
		try {
			Class clz = Class.forName(className);
			this.delete(clz, id);
		} catch (Exception e) {
			if(DebugUtil.IS_DEBUG)
			e.printStackTrace();
			throw new Exception(e.getMessage());
		}
	}
	public void updateEx(Object entity) throws Exception{
		/*final String  SQL = JPQLBuilder.createUpdateSQL(entity);
		Query query = this.entityManager.createQuery(SQL);*/
		PropertyDescriptor primaryKey = EntityUtil.getPrimaryKey(entity.getClass());
		String idValue = (String) EntityUtil.getPropertyValue(entity, primaryKey);
		if(idValue == null)throw new NullPointerException();
		Object oldEntity = this.get(entity.getClass(), idValue);
		oldEntity = EntityUtil.beanCopay(entity, oldEntity, new PropertyFilter() {
			@Override
			public boolean doFilter(Object obj, String property, Object value) {
				if(value == null)return false;
				return true;
			}
		});
		this.entityManager.merge(oldEntity);
	}
	
	public <T> List<T> query(Class<T> clz,String property,Object value) throws Exception{
		try {
			CriteriaBuilder cb = this.entityManager.getCriteriaBuilder();
			CriteriaQuery<T> cq = cb.createQuery(clz);
			Root<T> root = cq.from(clz);
			EntityType<T> ent = root.getModel(); 
			cq.select(root);
			Predicate condition = cb.equal(root.get(ent.getSingularAttribute(property)), value);
			cq.where(condition);
			//添加默认排序，按照主键排序
			cq.orderBy(cb.asc(root.get(ent.getSingularAttribute(EntityUtil.getPrimaryKey(clz).getName()))));
			TypedQuery<T> typedQuery = this.entityManager.createQuery(cq);
			List<T> rs = typedQuery.getResultList();
			return rs;
		} catch (Exception e) {
			if(DebugUtil.IS_DEBUG)
			e.printStackTrace();
			throw new Exception(e.getMessage());
		}
	}
	
	public <T> List<T> query(Class<T> clz,Map<String ,Object> params) throws Exception{
		return query(clz,params,null);
	}
	
	public <T> List<T> query(Class<T> clz,Map<String ,Object> params,String[] orders) throws Exception{
		try {
			CriteriaBuilder cb = this.entityManager.getCriteriaBuilder();
			CriteriaQuery<T> cq = cb.createQuery(clz);
			Root<T> root = cq.from(clz);
			EntityType<T> ent = root.getModel(); 
			cq.select(root);
			if(params != null){
				Set<String> keyset = params.keySet();
				Iterator<String> it = keyset.iterator();
				Predicate[] conditions = new Predicate[keyset.size()];
				int index = 0;
				while(it.hasNext()){
					String key = it.next();
					Object value = params.get(key);
					root.get(key).equals(value);
					Predicate condition = cb.equal(root.get(ent.getSingularAttribute(key)), value);
					conditions[index] = condition;
					index ++;
				}
				cq.where(conditions);
			}
			if(orders != null){
				if(orders.length>0){
					Order[] arrOrder = (Order[]) new Order[orders.length];
					for(int i=0;i<orders.length;i++){
						arrOrder[i] = (Order) cb.asc(root.get(ent.getSingularAttribute(orders[i])));
					}
					cq.orderBy((javax.persistence.criteria.Order[]) arrOrder);
				}
			}
			TypedQuery<T> typedQuery = this.entityManager.createQuery(cq);
			List<T> rs = typedQuery.getResultList();
			return rs;
		} catch (Exception e) {
			if(DebugUtil.IS_DEBUG)
			e.printStackTrace();
			throw new Exception(e.getMessage());
		}
	}
	/**
	 * 模糊查找，自动识别值中带%号的字段
	 * @param clz
	 * @param params
	 * @param orders  只支持默认排序
	 * @return
	 * @throws Exception
	 */
	public <T> List<T> fuzzyQuery(Class<T> clz,Map<String ,Object> params,String[] orders) throws Exception{
		try {
			CriteriaBuilder cb = this.entityManager.getCriteriaBuilder();
			CriteriaQuery<T> cq = cb.createQuery(clz);
			Root<T> root = cq.from(clz);
			EntityType<T> ent = root.getModel(); 
			cq.select(root);
			if(params != null){
				Set<String> keyset = params.keySet();
				Iterator<String> it = keyset.iterator();
				Predicate[] conditions = new Predicate[keyset.size()];
				int index = 0;
				while(it.hasNext()){
					String key = it.next();
					Object value = params.get(key);
					root.get(key).equals(value);
					Predicate condition ;
					DebugUtil.println(value);
					if(value!=null && value.toString().indexOf("%")>0){
						condition = cb.like((Expression<String>) root.get(ent.getSingularAttribute(key)), value.toString());
					}else{
						condition = cb.equal(root.get(ent.getSingularAttribute(key)), value);
					}
					conditions[index] = condition;
					index ++;
				}
				cq.where(conditions);
			}
			if(orders != null){
				if(orders.length>0){
					Order[] arrOrder = (Order[]) new Order[orders.length];
					for(int i=0;i<orders.length;i++){
						arrOrder[i] = (Order) cb.asc(root.get(ent.getSingularAttribute(orders[i])));
					}
					cq.orderBy((javax.persistence.criteria.Order[]) arrOrder);
				}
			}
			TypedQuery<T> typedQuery = this.entityManager.createQuery(cq);
			List<T> rs = typedQuery.getResultList();
			return rs;
		} catch (Exception e) {
			if(DebugUtil.IS_DEBUG)
			e.printStackTrace();
			throw new Exception(e.getMessage());
		}
	}
	
	public ResultModel queryByJPQL(Class clz,Map<String, Object> params) throws Exception{
		ResultModel rsm = new ResultModel();
		try {
			Set<String> keyset = params.keySet();
			String querySQL = JPQLBuilder.createQuerySQL(clz, null);
			String conutSQL = JPQLBuilder.createCountSQL(clz, null);
			Query query = this.entityManager.createQuery(querySQL);
			Query count = this.entityManager.createQuery(conutSQL);
			Iterator<String> it = keyset.iterator();
			while(it.hasNext()){
				String key = it.next();
				Object value = params.get(key);
				System.out.println("key::"+key+"  value::"+value);
				query.setParameter(key, value);
				count.setParameter(key, value);
			}
			List list = query.getResultList();
			Integer totalCount = Integer.valueOf(count.getSingleResult().toString());
			rsm.setList(list);
			rsm.setTotalCount(totalCount);
			return rsm;
		} catch (Exception e) {
			if(DebugUtil.IS_DEBUG)
			e.printStackTrace();
			throw new Exception(e.getMessage());
		}
	}
	
	public ResultModel queryByJPQL(Class clz,Map<String, Object> params,int start,int limit) throws Exception{
		ResultModel rsm = new ResultModel();
		try {
			Set<String> keyset = params.keySet();
			String querySQL = JPQLBuilder.createQuerySQL(clz, null);
			String conutSQL = JPQLBuilder.createCountSQL(clz, null);
			Query query = this.entityManager.createQuery(querySQL);
			Query count = this.entityManager.createQuery(conutSQL);
			Iterator<String> it = keyset.iterator();
			while(it.hasNext()){
				String key = it.next();Object value = params.get(key);
				query.setParameter(key, value);
				count.setParameter(key, value);
			}
			query.setFirstResult(start);
			query.setMaxResults(limit);
			List list = query.getResultList();
			Integer totalCount = Integer.valueOf(count.getSingleResult().toString());
			rsm.setList(list);
			rsm.setTotalCount(totalCount);
			return rsm;
		} catch (Exception e) {
			if(DebugUtil.IS_DEBUG)
			e.printStackTrace();
			throw new Exception(e.getMessage());
		}
	}
	
	public ResultModel queryByJPQL(Class clz,Map<String, Object> params,String[] orders,int start,int limit) throws Exception{
		ResultModel rsm = new ResultModel();
		try {
			Set<String> keyset = null;
			if(params != null)keyset = params.keySet();
			String querySQL = JPQLBuilder.createQuerySQL(clz, keyset,orders);
			String conutSQL = JPQLBuilder.createCountSQL(clz, keyset);
			Query query = this.entityManager.createQuery(querySQL);
			Query count = this.entityManager.createQuery(conutSQL);
			if(keyset != null){
				Iterator<String> it = keyset.iterator();
				while(it.hasNext()){
					String key = it.next();Object value = params.get(key);
					query.setParameter(key, value);
					count.setParameter(key, value);
				}
			}
			query.setFirstResult(start);
			query.setMaxResults(limit);
			List list = query.getResultList();
			Integer totalCount = Integer.valueOf(count.getSingleResult().toString());
			rsm.setList(list);
			rsm.setTotalCount(totalCount);
			return rsm;
		} catch (Exception e) {
			if(DebugUtil.IS_DEBUG)
			e.printStackTrace();
			throw new Exception(e.getMessage());
		}
	}
	
	public Integer getMaxByPro(String table,String pid) throws Exception{
		Connection conn = null;
		CallableStatement cs = null;
		Integer max = null;
		conn = this.dataSource.getConnection();
		cs = conn.prepareCall("{call PRO_WSJD_GETXHMAX(?,?,?)}");
		cs.setString(1, table);
		cs.setString(2, pid);
		cs.registerOutParameter(3,oracle.jdbc.OracleTypes.NUMBER);
		cs.executeQuery();
		max = cs.getInt(3);
		try {
			cs.close();
			conn.close();
		} catch (Exception e) {
			if(DebugUtil.IS_DEBUG)
			e.printStackTrace();
		}
		return max;
	}
	
	/**
	 * 获取最大编号
	 * @param beanName
	 * @param id
	 * @return
	 */
	public String getMaxId(String jgid) {
		String maxId = null;
		String sql = "{call PRO_SQGL_GETMAX(?, ?, ?, ?)}";
		String rs = null;//获取oracle存储过程结果
		Connection conn = null;
		CallableStatement call = null;
		try {
			conn = this.dataSource.getConnection();
			call = conn.prepareCall(sql);
			call.setString(1,"SqglJtjbxx");
			call.setString(2,jgid);
			call.setString(3, "00001");//initMap.get(beanName)
			call.registerOutParameter(4, oracle.jdbc.OracleTypes.VARCHAR);
			call.execute();
			rs = call.getString(4);
			//System.out.println("rs:"+rs);
		} catch (SQLException e) {
			e.printStackTrace();
		}   
		if (rs != null && !"ERR".equals(rs)) {
			maxId = rs;
		}
		System.out.println("MaxId:"+maxId);
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
	
	public Integer getXmMaxByPro(String table,String jblx) throws Exception{
		Connection conn = null;
		CallableStatement cs = null;
		Integer max = null;
		conn = this.dataSource.getConnection();
		cs = conn.prepareCall("{call PRO_WSJD_GETXMLBXHMAX(?,?,?,?)}");
		cs.setString(1, table);
		System.out.println("jblx="+jblx);
		cs.setString(2, jblx);
		cs.setString(3, "");
		cs.registerOutParameter(4,oracle.jdbc.OracleTypes.NUMBER);
		cs.executeQuery();
		max = cs.getInt(4);
		try {
			cs.close();
			conn.close();
		} catch (Exception e) {
			if(DebugUtil.IS_DEBUG)
			e.printStackTrace();
		}
		return max;
	}
	/**
	 * 去掉分页 
	 * @param clz
	 * @param params
	 * @param orders
	 * @return
	 * @throws Exception
	 */
	public ResultModel queryByJPQL(Class clz,Map<String, Object> params,String[] orders) throws Exception{
		ResultModel rsm = new ResultModel();
		try {
			Set<String> keyset = null;
			if(params != null)keyset = params.keySet();
			String querySQL = JPQLBuilder.createQuerySQL(clz, keyset,orders);
			String conutSQL = JPQLBuilder.createCountSQL(clz, keyset);
			Query query = this.entityManager.createQuery(querySQL);
			Query count = this.entityManager.createQuery(conutSQL);
			if(keyset != null){
				Iterator<String> it = keyset.iterator();
				while(it.hasNext()){
					String key = it.next();Object value = params.get(key);
					query.setParameter(key, value);
					count.setParameter(key, value);
				}
			}
			List list = query.getResultList();
			Integer totalCount = Integer.valueOf(count.getSingleResult().toString());
			rsm.setList(list);
			rsm.setTotalCount(totalCount);
			return rsm;
		} catch (Exception e) {
			if(DebugUtil.IS_DEBUG)
			e.printStackTrace();
			throw new Exception(e.getMessage());
		}
	}
	/**
	 * 根据机构ID查询数据，数据包含子级机构的数据
	 * @param clz
	 * @param params 参数中必须包含depId字段
	 * @param orders
	 * @return
	 * @throws Exception 
	 */
	@Override
	public <T> List<T> queryAllByDep(Class<T> clz,Map<String, Object> params,String[] orders) throws Exception{
		List<T> rs = null;
		Set<String> keyset = params.keySet();
		final String QUERY_SQL = JPQLBuilder.createDepQuerySql(clz, keyset, orders);
		
		Query query = this.entityManager.createNativeQuery(QUERY_SQL, clz);
		Iterator<String> it = keyset.iterator();
		while(it.hasNext()){
			String key = it.next();Object value = params.get(key);
			query.setParameter(key, value);
		}
		rs = query.getResultList();
		return rs;
	}
	/**
	 * 根据机构ID分页查询数据，数据包含子级机构的数据
	 * @param clz
	 * @param params 参数中必须包含depId字段
	 * @param orders
	 * @param start 
	 * @param limit 
	 * @return
	 * @throws Exception
	 */
	@Override
	public ResultModel queryAllByDep(Class clz,Map<String, Object> params,String[] orders,int start,int limit) throws Exception{
		ResultModel rs = new ResultModel();
		Set<String> keyset = params.keySet();
		final String QUERY_SQL = JPQLBuilder.createDepQuerySql(clz, keyset, orders);
		final String COUNT_SQL = JPQLBuilder.createDepCountSql(clz, keyset);
		
		Query query = this.entityManager.createNativeQuery(QUERY_SQL, clz);
		Query count = this.entityManager.createNativeQuery(COUNT_SQL);
		Iterator<String> it = keyset.iterator();
		while(it.hasNext()){
			String key = it.next();Object value = params.get(key);
			query.setParameter(key, value);
			count.setParameter(key, value);
		}
		query.setFirstResult(start);
		query.setMaxResults(limit);
		Integer totalCount = Integer.valueOf(count.getSingleResult().toString());
		List list = query.getResultList();
		rs.setList(list);
		rs.setTotalCount(totalCount);
		return rs;
	}
	
}
