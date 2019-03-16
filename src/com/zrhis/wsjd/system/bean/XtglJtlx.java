package com.zrhis.wsjd.system.bean;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * XtglJtlx entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "XTGL_JTLX", schema = "CXJM")
public class XtglJtlx implements java.io.Serializable {

	// Fields

	private String CBh;
	private String VMc;
	private String VBz;
	private String VCode;
	private Date dtCreate;

	// Constructors

	/** default constructor */
	public XtglJtlx() {
	}

	/** minimal constructor */
	public XtglJtlx(String CBh) {
		this.CBh = CBh;
	}

	/** full constructor */
	public XtglJtlx(String CBh, String VMc, String VBz, String VCode,
			Date dtCreate) {
		this.CBh = CBh;
		this.VMc = VMc;
		this.VBz = VBz;
		this.VCode = VCode;
		this.dtCreate = dtCreate;
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

	@Column(name = "V_BZ", length = 100)
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

}