package com.zrhis.wsjd.system.bean;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * SqglGxhfwxy entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "SQGL_GXHFWXY", schema = "CXJM")
public class SqglGxhfwxy implements java.io.Serializable {

	// Fields

	private String VId;
	private String depId;
	private String depName;
	private String CJth;
	private String VJtysxm;
	private String VXzcy;
	private String VYslxdh;
	private String VSq;
	private String VXz;
	private String VHzlxdh;
	private String VJtzz;
	private String VYlfwf;
	private String VFydx;
	private Date dtFwkssj;
	private Date dtFwjssj;
	private String VFwnr1;
	private String VFwnr2;
	private String VFwnr3;
	private String VFwnr4;
	private String VJtysqz;
	private String VJtqz;
	private Date dtYsqzsj;
	private Date dtJtqzsj;
	private String VYljgh;
	private String VYljgmc;
	private String CCzybh;
	private Date dtCreate;
	private Date dtJlsj;
	private String VHzxm;
	private String VJtysqm;
	private String VJtqm;

	// Constructors

	/** default constructor */
	public SqglGxhfwxy() {
	}

	/** minimal constructor */
	public SqglGxhfwxy(String VId) {
		this.VId = VId;
	}

	/** full constructor */
	public SqglGxhfwxy(String VId, String depId, String depName, String CJth,
			String VJtysxm, String VXzcy, String VYslxdh, String VSq,
			String VXz, String VHzlxdh, String VJtzz, String VYlfwf,
			String VFydx, Date dtFwkssj, Date dtFwjssj,
			String VFwnr1, String VFwnr2, String VFwnr3, String VFwnr4,
			String VJtysqz, String VJtqz, Date dtYsqzsj,
			Date dtJtqzsj, String VYljgh, String VYljgmc, String CCzybh,
			Date dtCreate, Date dtJlsj, String VHzxm, String VJtysqm,
			String VJtqm) {
		this.VId = VId;
		this.depId = depId;
		this.depName = depName;
		this.CJth = CJth;
		this.VJtysxm = VJtysxm;
		this.VXzcy = VXzcy;
		this.VYslxdh = VYslxdh;
		this.VSq = VSq;
		this.VXz = VXz;
		this.VHzlxdh = VHzlxdh;
		this.VJtzz = VJtzz;
		this.VYlfwf = VYlfwf;
		this.VFydx = VFydx;
		this.dtFwkssj = dtFwkssj;
		this.dtFwjssj = dtFwjssj;
		this.VFwnr1 = VFwnr1;
		this.VFwnr2 = VFwnr2;
		this.VFwnr3 = VFwnr3;
		this.VFwnr4 = VFwnr4;
		this.VJtysqz = VJtysqz;
		this.VJtqz = VJtqz;
		this.dtYsqzsj = dtYsqzsj;
		this.dtJtqzsj = dtJtqzsj;
		this.VYljgh = VYljgh;
		this.VYljgmc = VYljgmc;
		this.CCzybh = CCzybh;
		this.dtCreate = dtCreate;
		this.dtJlsj = dtJlsj;
		this.VHzxm = VHzxm;
		this.VJtysqm = VJtysqm;
		this.VJtqm = VJtqm;
	}

	// Property accessors
	@Id
	@Column(name = "V_ID", unique = true, nullable = false, length = 100)
	public String getVId() {
		return this.VId;
	}

	public void setVId(String VId) {
		this.VId = VId;
	}

	@Column(name = "DEP_ID", length = 100)
	public String getDepId() {
		return this.depId;
	}

	public void setDepId(String depId) {
		this.depId = depId;
	}

	@Column(name = "DEP_NAME", length = 100)
	public String getDepName() {
		return this.depName;
	}

	public void setDepName(String depName) {
		this.depName = depName;
	}

	@Column(name = "C_JTH", length = 20)
	public String getCJth() {
		return this.CJth;
	}

	public void setCJth(String CJth) {
		this.CJth = CJth;
	}

	@Column(name = "V_JTYSXM", length = 100)
	public String getVJtysxm() {
		return this.VJtysxm;
	}

	public void setVJtysxm(String VJtysxm) {
		this.VJtysxm = VJtysxm;
	}

	@Column(name = "V_XZCY", length = 100)
	public String getVXzcy() {
		return this.VXzcy;
	}

	public void setVXzcy(String VXzcy) {
		this.VXzcy = VXzcy;
	}

	@Column(name = "V_YSLXDH", length = 100)
	public String getVYslxdh() {
		return this.VYslxdh;
	}

	public void setVYslxdh(String VYslxdh) {
		this.VYslxdh = VYslxdh;
	}

	@Column(name = "V_SQ", length = 100)
	public String getVSq() {
		return this.VSq;
	}

	public void setVSq(String VSq) {
		this.VSq = VSq;
	}

	@Column(name = "V_XZ", length = 100)
	public String getVXz() {
		return this.VXz;
	}

	public void setVXz(String VXz) {
		this.VXz = VXz;
	}

	@Column(name = "V_HZLXDH", length = 100)
	public String getVHzlxdh() {
		return this.VHzlxdh;
	}

	public void setVHzlxdh(String VHzlxdh) {
		this.VHzlxdh = VHzlxdh;
	}

	@Column(name = "V_JTZZ", length = 200)
	public String getVJtzz() {
		return this.VJtzz;
	}

	public void setVJtzz(String VJtzz) {
		this.VJtzz = VJtzz;
	}

	@Column(name = "V_YLFWF", length = 100)
	public String getVYlfwf() {
		return this.VYlfwf;
	}

	public void setVYlfwf(String VYlfwf) {
		this.VYlfwf = VYlfwf;
	}

	@Column(name = "V_FYDX", length = 100)
	public String getVFydx() {
		return this.VFydx;
	}

	public void setVFydx(String VFydx) {
		this.VFydx = VFydx;
	}

	@Column(name = "DT_FWKSSJ", length = 7)
	public Date getDtFwkssj() {
		return this.dtFwkssj;
	}

	public void setDtFwkssj(Date dtFwkssj) {
		this.dtFwkssj = dtFwkssj;
	}

	@Column(name = "DT_FWJSSJ", length = 7)
	public Date getDtFwjssj() {
		return this.dtFwjssj;
	}

	public void setDtFwjssj(Date dtFwjssj) {
		this.dtFwjssj = dtFwjssj;
	}

	@Column(name = "V_FWNR1", length = 500)
	public String getVFwnr1() {
		return this.VFwnr1;
	}

	public void setVFwnr1(String VFwnr1) {
		this.VFwnr1 = VFwnr1;
	}

	@Column(name = "V_FWNR2", length = 500)
	public String getVFwnr2() {
		return this.VFwnr2;
	}

	public void setVFwnr2(String VFwnr2) {
		this.VFwnr2 = VFwnr2;
	}

	@Column(name = "V_FWNR3", length = 500)
	public String getVFwnr3() {
		return this.VFwnr3;
	}

	public void setVFwnr3(String VFwnr3) {
		this.VFwnr3 = VFwnr3;
	}

	@Column(name = "V_FWNR4", length = 500)
	public String getVFwnr4() {
		return this.VFwnr4;
	}

	public void setVFwnr4(String VFwnr4) {
		this.VFwnr4 = VFwnr4;
	}

	@Column(name = "V_JTYSQZ", length = 100)
	public String getVJtysqz() {
		return this.VJtysqz;
	}

	public void setVJtysqz(String VJtysqz) {
		this.VJtysqz = VJtysqz;
	}

	@Column(name = "V_JTQZ", length = 100)
	public String getVJtqz() {
		return this.VJtqz;
	}

	public void setVJtqz(String VJtqz) {
		this.VJtqz = VJtqz;
	}

	@Column(name = "DT_YSQZSJ", length = 7)
	public Date getDtYsqzsj() {
		return this.dtYsqzsj;
	}

	public void setDtYsqzsj(Date dtYsqzsj) {
		this.dtYsqzsj = dtYsqzsj;
	}

	@Column(name = "DT_JTQZSJ", length = 7)
	public Date getDtJtqzsj() {
		return this.dtJtqzsj;
	}

	public void setDtJtqzsj(Date dtJtqzsj) {
		this.dtJtqzsj = dtJtqzsj;
	}

	@Column(name = "V_YLJGH", length = 100)
	public String getVYljgh() {
		return this.VYljgh;
	}

	public void setVYljgh(String VYljgh) {
		this.VYljgh = VYljgh;
	}

	@Column(name = "V_YLJGMC", length = 100)
	public String getVYljgmc() {
		return this.VYljgmc;
	}

	public void setVYljgmc(String VYljgmc) {
		this.VYljgmc = VYljgmc;
	}

	@Column(name = "C_CZYBH", length = 100)
	public String getCCzybh() {
		return this.CCzybh;
	}

	public void setCCzybh(String CCzybh) {
		this.CCzybh = CCzybh;
	}


	@Column(name = "DT_JLSJ", length = 7)
	public Date getDtJlsj() {
		return this.dtJlsj;
	}

	public void setDtJlsj(Date dtJlsj) {
		this.dtJlsj = dtJlsj;
	}

	@Column(name = "V_HZXM", length = 100)
	public String getVHzxm() {
		return this.VHzxm;
	}

	public void setVHzxm(String VHzxm) {
		this.VHzxm = VHzxm;
	}

	@Column(name = "V_JTYSQM")
	public String getVJtysqm() {
		return this.VJtysqm;
	}

	public void setVJtysqm(String VJtysqm) {
		this.VJtysqm = VJtysqm;
	}

	@Column(name = "V_JTQM")
	public String getVJtqm() {
		return this.VJtqm;
	}

	public void setVJtqm(String VJtqm) {
		this.VJtqm = VJtqm;
	}

}