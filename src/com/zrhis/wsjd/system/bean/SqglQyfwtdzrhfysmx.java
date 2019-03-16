package com.zrhis.wsjd.system.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * SqglQyfwtdzrhfysmx entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "SQGL_QYFWTDZRHFYSMX", schema = "CXJM")
public class SqglQyfwtdzrhfysmx implements java.io.Serializable {

	// Fields

	private String VId;
	private String VTdid;
	private String VYsxm;
	private String VYsdh;
	private String VYljgh;
	private String VYljgmc;
	private String depId;
	private String depName;
	private String VYljgjb;
	private String VTdmc;
	private String VZzxm;

	// Constructors

	/** default constructor */
	public SqglQyfwtdzrhfysmx() {
	}

	/** minimal constructor */
	public SqglQyfwtdzrhfysmx(String VId) {
		this.VId = VId;
	}

	/** full constructor */
	public SqglQyfwtdzrhfysmx(String VId, String VTdid, String VYsxm,
			String VYsdh, String VYljgh, String VYljgmc, String depId,
			String depName, String VYljgjb, String VTdmc, String VZzxm) {
		this.VId = VId;
		this.VTdid = VTdid;
		this.VYsxm = VYsxm;
		this.VYsdh = VYsdh;
		this.VYljgh = VYljgh;
		this.VYljgmc = VYljgmc;
		this.depId = depId;
		this.depName = depName;
		this.VYljgjb = VYljgjb;
		this.VTdmc = VTdmc;
		this.VZzxm = VZzxm;
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

	@Column(name = "V_TDID", length = 100)
	public String getVTdid() {
		return this.VTdid;
	}

	public void setVTdid(String VTdid) {
		this.VTdid = VTdid;
	}

	@Column(name = "V_YSXM", length = 100)
	public String getVYsxm() {
		return this.VYsxm;
	}

	public void setVYsxm(String VYsxm) {
		this.VYsxm = VYsxm;
	}

	@Column(name = "V_YSDH", length = 100)
	public String getVYsdh() {
		return this.VYsdh;
	}

	public void setVYsdh(String VYsdh) {
		this.VYsdh = VYsdh;
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

	@Column(name = "V_YLJGJB", length = 100)
	public String getVYljgjb() {
		return this.VYljgjb;
	}

	public void setVYljgjb(String VYljgjb) {
		this.VYljgjb = VYljgjb;
	}

	@Column(name = "V_TDMC", length = 100)
	public String getVTdmc() {
		return this.VTdmc;
	}

	public void setVTdmc(String VTdmc) {
		this.VTdmc = VTdmc;
	}

	@Column(name = "V_ZZXM", length = 100)
	public String getVZzxm() {
		return this.VZzxm;
	}

	public void setVZzxm(String VZzxm) {
		this.VZzxm = VZzxm;
	}

}