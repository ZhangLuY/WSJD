package com.zrhis.wsjd.system.bean;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * XtglMz entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "XTGL_MZ", schema = "CXJM")
public class XtglMz implements java.io.Serializable {

	// Fields

	private String CBh;
	private String VMc;
	private String VBz;
	private String VCode;
	private Date dtCreate;
	private String VCode1;

	// Constructors

	/** default constructor */
	public XtglMz() {
	}

	/** minimal constructor */
	public XtglMz(String CBh) {
		this.CBh = CBh;
	}

	/** full constructor */
	public XtglMz(String CBh, String VMc, String VBz, String VCode,
			Date dtCreate, String VCode1) {
		this.CBh = CBh;
		this.VMc = VMc;
		this.VBz = VBz;
		this.VCode = VCode;
		this.dtCreate = dtCreate;
		this.VCode1 = VCode1;
	}

	// Property accessors
	@Id
	@Column(name = "C_BH", unique = true, nullable = false, length = 2)
	public String getCBh() {
		return this.CBh;
	}

	public void setCBh(String CBh) {
		this.CBh = CBh;
	}

	@Column(name = "V_MC", length = 100)
	public String getVMc() {
		return this.VMc;
	}

	public void setVMc(String VMc) {
		this.VMc = VMc;
	}

	@Column(name = "V_BZ", length = 60)
	public String getVBz() {
		return this.VBz;
	}

	public void setVBz(String VBz) {
		this.VBz = VBz;
	}

	@Column(name = "V_CODE", length = 20)
	public String getVCode() {
		return this.VCode;
	}

	public void setVCode(String VCode) {
		this.VCode = VCode;
	}


	@Column(name = "V_CODE1", length = 100)
	public String getVCode1() {
		return this.VCode1;
	}

	public void setVCode1(String VCode1) {
		this.VCode1 = VCode1;
	}

}