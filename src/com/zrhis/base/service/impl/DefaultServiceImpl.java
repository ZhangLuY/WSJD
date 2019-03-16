package com.zrhis.base.service.impl;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import net.sf.json.JSONObject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.zrhis.base.Message;
import com.zrhis.base.Parameters;
import com.zrhis.base.ResultModel;
import com.zrhis.base.dao.BaseDao;
import com.zrhis.base.service.DefaultService;
import com.zrhis.wsjd.util.ControllerTools;
import com.zrhis.wsjd.util.JSONFormat;
import com.zrhis.wsjd.util.MessageManager;

@SuppressWarnings({"rawtypes","unchecked"})
@Service
public class DefaultServiceImpl implements DefaultService {
	
	@Autowired
	private BaseDao baseDao;
	
	@Override
	@Transactional(readOnly=false,propagation= Propagation.REQUIRED,rollbackFor={Exception.class})
	public Message getEntity(String className,String id)
			throws Exception {
		Object entity = baseDao.get(Class.forName(className), id);
		Message msg = new Message();
		msg.setSuccess(true);
		msg.setFlag(true);
		msg.setData(entity);
		return msg;
	}
	
	@Override
	@Transactional(readOnly=false,propagation= Propagation.REQUIRED,rollbackFor={Exception.class})
	public Message getEntity(Class clz,String id)
			throws Exception {
		Object entity = baseDao.get(clz, id);
		Message msg = new Message();
		msg.setSuccess(true);
		msg.setFlag(true);
		msg.setData(entity);
		return msg;
	}
	
	@Override
	@Transactional(readOnly=false,propagation= Propagation.REQUIRED,rollbackFor={Exception.class})
	public Message savaEntity(HttpServletRequest request, Parameters params)
			throws Exception {
		Object entity = ControllerTools.resolvePayloadEX(request);
		baseDao.save(entity);
		Message msg = MessageManager.save();
		return msg;
	}

	@Override
	@Transactional(readOnly=false,propagation= Propagation.REQUIRED,rollbackFor={Exception.class})
	public Message updateEntity(HttpServletRequest request, Parameters params)
			throws Exception {
		Object entity = ControllerTools.resolvePayloadEX(request);
		baseDao.update(entity);
		Message msg = MessageManager.save();
		return msg;
	}

	@Override
	@Transactional(readOnly=false,propagation= Propagation.REQUIRED,rollbackFor={Exception.class})
	public Message deleteEntity(String className,String id)
			throws Exception {
		baseDao.delete(className, id);
		Message msg = MessageManager.delete();
		return msg;
	}

	@Override
	//@Transactional(readOnly=false,propagation= Propagation.REQUIRED,rollbackFor={Exception.class})
	public Message query(HttpServletRequest request, Parameters params)
			throws Exception {
		Class clz = null;
		clz = Class.forName(params.getClassName());
		Map<String,Object> map = null;
		if(params.getParams()!=null && !"".equals(params.getParams())){
			map = JSONObject.fromObject(params.getParams());
			map = JSONFormat.bindType(clz, map);
		}
		System.out.println("clz::"+clz+"  map=="+map+"  Orderarr:"+params.getOrderarr()+"  Start:"+params.getStart()+"  Limit:"+params.getLimit());
		ResultModel rsm = baseDao.queryByJPQL(clz, map, params.getOrderarr(), params.getStart(), params.getLimit());
		Message msg = new Message(rsm.getTotalCount(),rsm.getList());
		return msg;
	}
	
	@Override
	//@Transactional(readOnly=false,propagation= Propagation.REQUIRED,rollbackFor={Exception.class})
	public Message queryAll(HttpServletRequest request, Parameters params)
			throws Exception {
		Class clz = null;
		clz = Class.forName(params.getClassName());
		Map<String,Object> map = null;
		if(params.getParams()!=null && !"".equals(params.getParams())){
			map = JSONObject.fromObject(params.getParams());
			map = JSONFormat.bindType(clz, map);
		}
		ResultModel rs = baseDao.queryByJPQL(clz, map,params.getOrderarr());  
		Message msg = new Message(rs.getList());
		return msg;
	}
	
	public Message fuzzyQueryAll(HttpServletRequest request, Parameters params)
			throws Exception {
		Class clz = null;
		clz = Class.forName(params.getClassName());
		Map<String,Object> map = null;
		if(params.getParams()!=null && !"".equals(params.getParams())){
			map = JSONObject.fromObject(params.getParams());
			map = JSONFormat.bindType(clz, map);
		}
		List rs = baseDao.fuzzyQuery(clz, map,params.getOrderarr());  
		Message msg = new Message(rs);
		return msg;
	}

	@Override
	@Transactional(readOnly=false,propagation= Propagation.REQUIRED,rollbackFor={Exception.class})
	public Message updateEntityEx(HttpServletRequest request, Parameters params)
			throws Exception {
		Object entity = ControllerTools.resolvePayloadEX(request);
		/*DebugUtil.println(entity);
		WsjdSqjgxx en = (WsjdSqjgxx) entity;
		SimpleDateFormat formatDate = new SimpleDateFormat("yyyy-MM-dd");
	    String str = formatDate.format(en.getDtTgsj());
	    System.out.println("entity:" + en.getDtTgsj());
		System.out.println("str:" + str);*/
	    this.baseDao.updateEx(entity);
		Message msg = MessageManager.update();
		return msg;
	}
	
	@Override
	public Message queryAllByDep(HttpServletRequest request,
			Parameters params) throws Exception {
		Class clz = null;
		clz = Class.forName(params.getClassName());
		Map<String,Object> map = null;
		if(params.getParams()!=null && !"".equals(params.getParams())){
			map = JSONObject.fromObject(params.getParams());
			map = JSONFormat.bindType(clz, map);
		}
		List list = this.baseDao.queryAllByDep(clz, map, params.getOrderarr());
		Message msg = new Message(list);
		return msg;
	}

	@Override
	public Message pagingQueryAllByDep(HttpServletRequest request,
			Parameters params) throws Exception {
		Class clz = null;
		clz = Class.forName(params.getClassName());
		Map<String,Object> map = null;
		if(params.getParams()!=null && !"".equals(params.getParams())){
			map = JSONObject.fromObject(params.getParams());
			map = JSONFormat.bindType(clz, map);
		}
		ResultModel rs = this.baseDao.queryAllByDep(clz, map, params.getOrderarr(),params.getStart(),params.getLimit());
		Message msg = new Message(rs.getTotalCount(),rs.getList());
		return msg;
	}

}
