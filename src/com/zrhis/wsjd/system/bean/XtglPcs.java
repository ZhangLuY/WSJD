package com.zrhis.wsjd.system.bean;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * XtglPcs entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "XTGL_PCS", schema = "CXJM")
public class XtglPcs implements java.io.Serializable {

	// Fields

	private String CBh;
	private String depId;
	private String VMc;
	private Date dtCreate;
	private Short NSxbz;
	private String VBz;

	// Constructors

	/** default constructor */
	public XtglPcs() {
	}

	/** minimal constructor */
	public XtglPcs(String CBh) {
		this.CBh = CBh;
	}

	/** full constructor */
	public XtglPcs(String CBh, String depId, String VMc, Date dtCreate,
			Short NSxbz, String VBz) {
		this.CBh = CBh;
		this.depId = depId;
		this.VMc = VMc;
		this.dtCreate = dtCreate;
		this.NSxbz = NSxbz;
		this.VBz = VBz;
	}

	// Property accessors
	@Id
	@Column(name = "C_BH", unique = true, nullable = false, length = 100)
	public String getCBh() {
		return this.CBh;
	}

	public void setCBh(String CBh) {
		this.CBh = CBh;
	}

	@Column(name = "DEP_ID", length = 100)
	public String getDepId() {
		return this.depId;
	}

	public void setDepId(String depId) {
		this.depId = depId;
	}

	@Column(name = "V_MC", length = 100)
	public String getVMc() {
		return this.VMc;
	}

	public void setVMc(String VMc) {
		this.VMc = VMc;
	}


	@Column(name = "N_SXBZ", precision = 4, scale = 0)
	public Short getNSxbz() {
		return this.NSxbz;
	}

	public void setNSxbz(Short NSxbz) {
		this.NSxbz = NSxbz;
	}

	@Column(name = "V_BZ", length = 200)
	public String getVBz() {
		return this.VBz;
	}

	public void setVBz(String VBz) {
		this.VBz = VBz;
	}

}