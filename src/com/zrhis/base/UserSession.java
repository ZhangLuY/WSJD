package com.zrhis.base;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;

public class UserSession implements Serializable,HttpSessionBindingListener{
	private String userId;
	private String userName;
	private String userReadName;
	private String depId;
	private String roleId;
	private String roleName;
	private String depName;
	private String admin;
	private String theme;
	private Map permission;
	private Integer level;
	private String vPath;
	private String vYlbh;
	private Integer nYhlb;
	private String ylParentId;	//20120328添加医疗机构父节点编号
	private String ylName;		//20120329添加所在医疗机构名称
	private Map ylParams;		//20120423添加医疗机构参数设置
	private UserList u=UserList.getInstance();//单例用户信息集合
	/*2012-5-23增加两个字段 王成委*/
	private String qzjgbh;//签证机构编号 2012-5-23
	private String qzjgmc;//签证机构名称 2012-5-23
	private Integer cxfs;		//20140630添加查询方式
	private Integer type;		//20140630添加操作员类型
	private Integer glms;		//20151024添加管理模式
	private String VScqx;		//20170415删除权限
	public UserSession(){
		permission = new HashMap();
	}
	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserReadName() {
		return userReadName;
	}

	public void setUserReadName(String userReadName) {
		this.userReadName = userReadName;
	}

	public String getDepId() {
		return depId;
	}

	public void setDepId(String depId) {
		this.depId = depId;
	}

	public String getDepName() {
		return depName;
	}

	public void setDepName(String depName) {
		this.depName = depName;
	}

	public Map getPermission() {
		return permission;
	}

	public void setPermission(Map permission) {
		this.permission = permission;
	}

	public String getRoleId() {
		return roleId;
	}

	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public String getAdmin() {
		return admin;
	}

	public void setAdmin(String admin) {
		this.admin = admin;
	}

	public String getTheme() {
		return theme;
	}

	public void setTheme(String theme) {
		this.theme = theme;
	}

	public Integer getLevel() {
		return level;
	}

	public void setLevel(Integer level) {
		this.level = level;
	}

	public String getVPath() {
		return vPath;
	}

	public void setVPath(String path) {
		vPath = path;
	}
	
	public String getVYlbh() {
		return vYlbh;
	}

	public void setVYlbh(String ylbh) {
		vYlbh = ylbh;
	}
	
	public Integer getNYhlb() {
		return nYhlb;
	}
	public void setNYhlb(Integer yhlb) {
		nYhlb = yhlb;
	}
	
	public String getYlName() {
		return ylName;
	}

	public void setYlName(String ylName) {
		this.ylName = ylName;
	}

	public String getYlParentId() {
		return ylParentId;
	}

	public void setYlParentId(String ylParentId) {
		this.ylParentId = ylParentId;
	}

	public Map getYlParams() {
		return ylParams;
	}

	public void setYlParams(Map ylParams) {
		this.ylParams = ylParams;
	}

	public void valueBound(HttpSessionBindingEvent arg0) {
		u.addUser(this);
		
	}

	public void valueUnbound(HttpSessionBindingEvent arg0) {
		u.romoveUser(this);
	}
	public String getQzjgbh() {
		return qzjgbh;
	}
	public void setQzjgbh(String qzjgbh) {
		this.qzjgbh = qzjgbh;
	}
	public String getQzjgmc() {
		return qzjgmc;
	}
	public void setQzjgmc(String qzjgmc) {
		this.qzjgmc = qzjgmc;
	}
	public Integer getCxfs() {
		return cxfs;
	}
	public void setCxfs(Integer cxfs) {
		this.cxfs = cxfs;
	}
	public Integer getType() {
		return type;
	}
	public void setType(Integer type) {
		this.type = type;
	}
	public Integer getGlms() {
		return glms;
	}
	public void setGlms(Integer glms) {
		this.glms = glms;
	}
	public String getVScqx() {
		return VScqx;
	}
	public void setVScqx(String vScqx) {
		VScqx = vScqx;
	}
	
}
