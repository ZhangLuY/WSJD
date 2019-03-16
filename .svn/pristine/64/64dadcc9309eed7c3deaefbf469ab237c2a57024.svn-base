package com.zrhis.wsjd.util;

import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;
import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;
import java.util.Set;
/**
 * 生成JPQL语句
 * @author 王成委
 * @version 1.0
 * @date 2013-6-5 14:26:39
 */
@SuppressWarnings("rawtypes")
public class JPQLBuilder {
	
	/**
	 * 生成查询语句，所有条件and连接
	 * @param clz 类
	 * @param keyset 参数列表
	 * @return 
	 */
	public static String createQuerySQL(Class clz,Set<String> keyset){
		StringBuffer sb = new StringBuffer();
		sb.append("select x from ");
		sb.append(clz.getSimpleName());
		sb.append(" x");
		if(keyset != null){
			if(keyset.size()>0){
				sb.append(" where ");
				Iterator<String> it = keyset.iterator();
				int index = 0;
				while(it.hasNext()){
					String propertyName = it.next();
					if(index > 0 )sb.append(" and ");
					index++;
					sb.append(propertyName+" = :"+propertyName+" ");
				}
			}
		}
		return sb.toString();
	}
	/**
	 * 生成查询语句，所有条件and连接，带排序。
	 * @param clz 类
	 * @param keyset 参数列表
	 * @param orders 排序字段 ["name","id desc"]
	 * @return
	 */
	public static String createQuerySQL(Class clz,Set<String> keyset,String[] orders){
		StringBuffer sb = new StringBuffer();
		sb.append("select x from ");
		sb.append(clz.getSimpleName());
		sb.append(" x");
		int index = 0;
		if(keyset != null){
			if(keyset.size()>0){
				sb.append(" where ");
				Iterator<String> it = keyset.iterator();
				while(it.hasNext()){
					String propertyName = it.next();
					if(index > 0 )sb.append(" and ");
					index++;
					sb.append(propertyName+" = :"+propertyName+" ");
				}
			}
		}
		if(orders.length>0){
			index = 0;
			sb.append(" order by ");
			for(int i=0;i<orders.length;i++){
				if(index > 0 )sb.append(" , ");
				sb.append("x."+orders[i]);
				index ++;
			}
		}
		return sb.toString();
	}
	/**
	 * 生成查询语句  根据时间查询
	 * @param clz
	 * @param beginDate  开始时间
	 * @param endDate  结束时间
	 * @param keyset
	 * @param orders 排序
	 * @return
	 */
	public static String createqueryDateSQL(Class clz,String beginDate,String endDate,Set<String> keyset,String[] orders){
		StringBuffer sb = new StringBuffer();
		sb.append("select x from ");
		sb.append(clz.getSimpleName());
		sb.append(" x ");
		int index = 0;
		if(keyset != null){
			if(keyset.size()>0){
				sb.append(" where ");
				Iterator<String> it = keyset.iterator();
				while(it.hasNext()){
					String propertyName = it.next();
					if(index > 0 )sb.append(" and ");
					index++;
					sb.append(propertyName+" = :"+propertyName+" ");
				}
			}
		}
		if(beginDate!=null && beginDate.trim().length()>0){
			sb.append(" and TO_CHAR(dtCreate,'YYYY-MM-DD')>='"+beginDate+"' ");
		}
		if(endDate!=null && endDate.trim().length()>0){
			sb.append(" and TO_CHAR(dtCreate,'YYYY-MM-DD')<='"+endDate+"' ");
		}
		if(orders.length>0){
			index = 0;
			sb.append(" order by ");
			for(int i=0;i<orders.length;i++){
				if(index > 0 )sb.append(" , ");
				sb.append(" x."+orders[i]);
			}
		}
		return sb.toString();
	}
	/**
	 * 生成查询总记录数语句  根据时间查询
	 * @param clz
	 * @param beginDate  开始时间
	 * @param endDate  结束时间
	 * @param keyset
	 * @return
	 */
	public static String createcountDateSQL(Class clz,String beginDate,String endDate,Set<String> keyset){
		StringBuffer sb = new StringBuffer();
		sb.append("select count(x) from ");
		sb.append(clz.getSimpleName());
		sb.append(" x ");
		if(keyset != null){
			if(keyset.size()>0){
			sb.append(" where ");
				Iterator<String> it = keyset.iterator();
				int index = 0;
				while(it.hasNext()){
					String propertyName = it.next();
					if(index > 0 )sb.append(" and ");
					index++;
					sb.append(propertyName+" = :"+propertyName+" ");
				}
			}
		}
		if(beginDate!=null && beginDate.trim().length()>0){
			sb.append(" and TO_CHAR(dtCreate,'YYYY-MM-DD')>='"+beginDate+"' ");
		}
		if(endDate!=null && endDate.trim().length()>0){
			sb.append(" and TO_CHAR(dtCreate,'YYYY-MM-DD')<='"+endDate+"' ");
		}
		return sb.toString();
	}
	/**
	 * 生成修改数据库语句
	 * @param clz
	 * @param keyset  set里的字段
	 * @param whereset  where后面的字段
	 * @return
	 */
	public static String createupdateSQL(Class clz,Set<String> keyset,Set<String> whereset){
		StringBuffer sg = new StringBuffer();
		sg.append("update ");
		sg.append(clz.getSimpleName());
		sg.append(" set ");
		if(keyset != null){
			Iterator<String> it = keyset.iterator();
			//int index = 0;
			while(it.hasNext()){
				String propertyName = it.next();
				//index++;
				sg.append(propertyName+" = :"+propertyName+" ");
			}
		}else{
			return "";
		}
		if(whereset != null && !"".equals(whereset) ){
			sg.append(" where ");
			Iterator<String> wheit = whereset.iterator();
			int index = 0;
			while(wheit.hasNext()){
				String whereName = wheit.next();
				if(index > 0 )sg.append(" and ");
				index++;
				sg.append(whereName+" = :"+whereName+" ");
			}
		}	
		return sg.toString();
	}
	public static String creategetMaxSQL(Class clz , String yljg, String id){
		StringBuffer sg = new StringBuffer();
		sg.append("select max("+id+") from ");
		sg.append(clz.getSimpleName());
		if(yljg!=null && "".equals(yljg)){
			sg.append(" where ");
			sg.append(id);
			sg.append(" like '");
			sg.append(yljg );
			sg.append("%'");
		}
		return sg.toString();
	}
	/**
	 * 生成查询总记录数的语句
	 * @param clz
	 * @param keyset
	 * @return
	 */
	public static String createCountSQL(Class clz,Set<String> keyset){
		StringBuffer sb = new StringBuffer();
		sb.append("select count(x) from ");
		sb.append(clz.getSimpleName());
		sb.append(" x");
		if(keyset != null){
			if(keyset.size()>0){
				sb.append(" where ");
				Iterator<String> it = keyset.iterator();
				int index = 0;
				while(it.hasNext()){
					String propertyName = it.next();
					if(index > 0 )sb.append(" and ");
					index++;
					sb.append(propertyName+" = :"+propertyName+" ");
				}
			}
		}
		return sb.toString();
	}
	
	public static String createUpdateSQL(Object entity,boolean includeNull) throws IntrospectionException, IllegalArgumentException, IllegalAccessException, InvocationTargetException{
		Class clz = entity.getClass();
		PropertyDescriptor property = EntityUtil.getPrimaryKey(clz);
		String primary = property.getName();
		String[] columns = EntityUtil.getProperties(entity, includeNull);
		
		StringBuffer sb = new StringBuffer();
		sb.append("update ");
		sb.append(clz.getSimpleName());
		sb.append(" x");
		sb.append(" set ");
		boolean flag = true;
		for(String col :columns){
			if(flag){
				sb.append(col +"=:"+col);flag=false;
			}else{
				sb.append(","+col +"=:"+col);
			}
		}
		sb.append(" where ");
		sb.append(primary+"=:"+primary);
		return sb.toString();
	}
	public static String createUpdateSQL(Object entity) 
			throws IntrospectionException, IllegalArgumentException, 
			IllegalAccessException, InvocationTargetException{
		return createUpdateSQL(entity, false);
	}
	/**
	 * 可以根据助记码 查询细则类型
	 * @param clz
	 * @param keyset
	 * @param orders
	 * @return
	 */
	public static String createQueryXzSQL(Class clz, Set<String> nameset ,Set<String> keyset,String[] orders){
		StringBuffer sb = new StringBuffer();
		sb.append("select x from ");
		sb.append(clz.getSimpleName());
		sb.append(" x");
		sb.append(" where ");
		sb.append(" 1=1 ");
		int index = 0;
		if(keyset != null && keyset.size() > 0){
			sb.append(" and ");
			Iterator<String> it = keyset.iterator();
			while(it.hasNext()){
				String propertyName = it.next();
				if(index > 0 )sb.append(" and ");
				index++;
				sb.append(propertyName+" = :"+propertyName+" ");
				//sb.append("GETHZPY.GetHzPYCAP("+propertyName+") like :"+propertyName+" ");
			}
		}
		//模糊查询条件
		int nameindex = 0;
		if(nameset != null && nameset.size() > 0){
			sb.append(" and ");
			Iterator<String> it = nameset.iterator();
			while(it.hasNext()){
				String propertyName = it.next();
				if(nameindex > 0 )sb.append(" and ");
				nameindex++;
				sb.append(propertyName+" like :"+propertyName+" ");
				//sb.append("GETHZPY.GetHzPYCAP("+propertyName+") like :"+propertyName+" ");
			}
		}
		if(orders.length>0){
			index = 0;
			sb.append(" order by ");
			for(int i=0;i<orders.length;i++){
				if(index > 0 )sb.append(" , ");
				sb.append("x."+orders[i]);
				index ++;
			}
		}
		return sb.toString();
	}
	
	/**
	 * 抽查
	 * @param clz
	 * @param nameset
	 * @param keyset
	 * @param orders
	 * @return
	 */
	public static String createQueryCcSQL(Class clz, Set<String> nameset ,Set<String> keyset,String[] orders){
		StringBuffer sb = new StringBuffer();
		sb.append("select  VId,VMc,IXh,VKcydjfz,NZf,NKf,NZdf,VBzh,VWh,IXzjb,depId,depName,to_char(dtCreate,'yyyy-MM-dd')dtCreates,VBz from ");
		sb.append(clz.getSimpleName());
		sb.append(" x");
		sb.append(" where ");
		sb.append(" 1=1 ");
		int index = 0;
		if(keyset != null && keyset.size() > 0){
			sb.append(" and ");
			Iterator<String> it = keyset.iterator();
			while(it.hasNext()){
				String propertyName = it.next();
				if(index > 0 )sb.append(" and ");
				index++;
				sb.append(propertyName+" = :"+propertyName+" ");
				//sb.append("GETHZPY.GetHzPYCAP("+propertyName+") like :"+propertyName+" ");
			}
		}
		//模糊查询条件
		int nameindex = 0;
		if(nameset != null && nameset.size() > 0){
			sb.append(" and ");
			Iterator<String> it = nameset.iterator();
			while(it.hasNext()){
				String propertyName = it.next();
				if(nameindex > 0 )sb.append(" and ");
				nameindex++;
				sb.append(propertyName+" like :"+propertyName+" ");
				//sb.append("GETHZPY.GetHzPYCAP("+propertyName+") like :"+propertyName+" ");
			}
		}
		if(orders.length>0){
			index = 0;
			sb.append(" order by ");
			for(int i=0;i<orders.length;i++){
				if(index > 0 )sb.append(" , ");
				sb.append("x."+orders[i]);
				index ++;
			}
		}
		return sb.toString();
	}
	
	
	/**
	 * 可以根据助记码 查询细则类型
	 * @param clz
	 * @param keyset
	 * @param orders
	 * @return
	 */
	public static String createCountXzSQL(Class clz,Set<String> nameset,Set<String> keyset){
		StringBuffer sb = new StringBuffer();
		sb.append("select count(x) from ");
		sb.append(clz.getSimpleName());
		//sb.append(" Wsjd_Xmlb");
		sb.append(" x");
		sb.append(" where ");
		sb.append(" 1 = 1 ");
		int index = 0;
		if(keyset != null && keyset.size() > 0){
			sb.append(" and ");
			Iterator<String> it = keyset.iterator();
			while(it.hasNext()){
				String propertyName = it.next();
				if(index > 0 )sb.append(" and ");
				index++;
				sb.append(propertyName+" like :"+propertyName+" ");
				//sb.append("GETHZPY.GetHzPYCAP("+propertyName+") like :"+propertyName+" ");
			}
		}
		//模糊查询条件
		int nameindex = 0;
		if(nameset != null && nameset.size() > 0){
			sb.append(" and ");
			Iterator<String> it = nameset.iterator();
			while(it.hasNext()){
				String propertyName = it.next();
				if(nameindex > 0 )sb.append(" and ");
				nameindex++;
				sb.append(propertyName+" like :"+propertyName+" ");
				//sb.append("GETHZPY.GetHzPYCAP("+propertyName+") like :"+propertyName+" ");
			}
		}
		
		return sb.toString();
	}
	//未使用
	public static String createCountSQL(){
		return "select count(j) from WsjdJgry j ,WsjdUser u where u.VJgrybh = j.VJgrybh ";
	}
	//未使用
	public static String createQueryRyUser(Set<String> keyset,String[] orders){
		StringBuffer sb = new StringBuffer();
		sb.append("from WsjdJgry j ,WsjdUser u where u.VJgrybh = j.VJgrybh ");
		int index = 0;
		if(keyset != null){
			sb.append(" and ");
			Iterator<String> it = keyset.iterator();
			while(it.hasNext()){
				String propertyName = it.next();
				if(index > 0 )sb.append(" and ");
				index++;
				sb.append(propertyName+" = :"+propertyName+" ");
			}
		}
		if(orders.length>0){
			index = 0;
			sb.append(" order by ");
			for(int i=0;i<orders.length;i++){
				if(index > 0 )sb.append(" , ");
				sb.append("x."+orders[i]);
				index ++;
			}
		}
		return sb.toString();
	}
	//未使用
	public static String createCountRyUser(Set<String> keyset){
		StringBuffer sb = new StringBuffer();
		sb.append("select count(j) from WsjdJgry j ,WsjdUser u where u.VJgrybh = j.VJgrybh ");
		int index = 0;
		if(keyset != null){
			sb.append(" and ");
			Iterator<String> it = keyset.iterator();
			while(it.hasNext()){
				String propertyName = it.next();
				if(index > 0 )sb.append(" and ");
				index++;
				sb.append(propertyName+" = :"+propertyName+" ");
			}
		}
		return sb.toString();
	}
	
	/*public static String createUpdateSQL(Class clz,Set<String> keyset){
		
	}
	public static String createUpdateSQL(String className,Set<String> keyset){
		
	}*/
	
	public static String createDepQuerySql(Class clz,Set<String> keyset,String[] orders) throws Exception{
		StringBuffer sb = new StringBuffer();
		String tableName = EntityUtil.getTableName(clz);
		
		sb.append("select * from "+tableName);
		
		sb.append(" where ");
		sb.append("dep_id in (select dep_id from wsjd_sqjgxx where instr(v_path,:depId)>0)");
		
		Iterator<String> it = keyset.iterator();
		while(it.hasNext()){
			String propertyName = it.next();
			String columnName = EntityUtil.getColumnByProperty(clz, propertyName);
			if("depId".equals(propertyName)) continue;
			sb.append(" and ");
			sb.append(columnName+" = :"+propertyName+" ");
		}
		if(orders.length>0){
			int index = 0;
			sb.append(" order by ");
			for(int i=0;i<orders.length;i++){
				if(index > 0 )sb.append(" , ");
				String[] column = orders[i].split(" ");
				column[0] = EntityUtil.getColumnByProperty(clz, column[0]);
				sb.append(join(column ," "));
				index ++;
			}
		}
		
		return sb.toString();
	}
	public static String createDepCountSql(Class clz,Set<String> keyset) throws Exception{
		StringBuffer sb = new StringBuffer();
		String primaryKey = EntityUtil.getPrimaryColumn(clz);
		String tableName = EntityUtil.getTableName(clz);
		
		sb.append("select count("+primaryKey+") from "+tableName);
		
		sb.append(" where ");
		sb.append("dep_id in (select dep_id from wsjd_sqjgxx where instr(v_path,:depId)>0)");
		
		Iterator<String> it = keyset.iterator();
		while(it.hasNext()){
			String propertyName = it.next();
			String columnName = EntityUtil.getColumnByProperty(clz, propertyName);
			if("depId".equals(propertyName)) continue;
			sb.append(" and ");
			sb.append(columnName+" = :"+propertyName+" ");
		}
		return sb.toString();
	}
	
	private static String join(String [] arr,String joinstr){
		String str = "";
		for(int i=0;i<arr.length;i++){
			if(i>0) str = str + joinstr;
			str +=arr[i];
		}
		return str;
		
	}
	
	public static String createQuerySq(Set<String> keyset,String depId,Integer last,Integer frist){
		StringBuffer sb = new StringBuffer();
		String sql = "select * from (select r.*, rownum num from (select x.V_Path_Mc, q.dt_Sqsj,q.dt_Jssj,q.V_Nd,q.I_Sfwc,q.dt_Wcsj," +
		"q.I_Sfsh,q.dt_Shsj,q.I_Sftg,q.N_Zf,q.dt_Mmsj,q.I_Sfmm,q.dep_id,q.V_Sqdh,q.I_Sqlx " +
		"from wsjd_sq q left join wsjd_sqjgxx x on q.dep_id = x.dep_id where 1=1 AND INSTR(V_PATH, '"+depId+"')>0 ";
		String sql2 = ") r where rownum <= "+last+") where num >= "+frist;
		sb.append(sql);
		int index = 0;
		if(keyset != null && keyset.size() > 0){
			sb.append(" and q.");
			Iterator<String> it = keyset.iterator();
			while(it.hasNext()){
				String propertyName = it.next();
				if(index > 0 )sb.append(" and ");
				index++;
				sb.append(propertyName+" = :"+propertyName+" ");
			}
		}
		sb.append(sql2);
		return sb.toString();
	}
	
	public static String createCountSq(Set<String> keyset,String depId){
		StringBuffer sb = new StringBuffer();
		String sqlcou = "select count(q.V_Sqdh)"+
		"from wsjd_sq q left join wsjd_sqjgxx x on q.dep_id = x.dep_id where 1=1 AND INSTR(V_PATH, '"+depId+"')>0 ";
		sb.append(sqlcou);
		int index = 0;
		if(keyset != null && keyset.size() > 0){
			sb.append(" and ");
			Iterator<String> it = keyset.iterator();
			while(it.hasNext()){
				String propertyName = it.next();
				if(index > 0 )sb.append(" and ");
				index++;
				sb.append(propertyName+" = :"+propertyName+" ");
			}
		}
		return sb.toString();
	}
	
	public static String createRolMkByCzybhSQL(Set<String> keyset){
		StringBuffer sb = new StringBuffer();
		sb.append("select * from wsjd_role_mod where rol_id in (select rol_id from Wsjd_User_Rol where ");
		int index = 0;
		if(keyset != null){
			if(keyset.size()>0){
				Iterator<String> it = keyset.iterator();
				while(it.hasNext()){
					String propertyName = it.next();
					if(index > 0 )sb.append(" and ");
					index++;
					sb.append(propertyName+" = :"+propertyName+" ");
				}
			}
		}
		sb.append(" ) ");
		return sb.toString();
	}
}
