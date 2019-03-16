package com.zrhis.wsjd.system.bean;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * XtglJwh entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "XTGL_JWH", schema = "CXJM", uniqueConstraints = @UniqueConstraint(columnNames = {
		"DEP_ID", "C_SSXZ", "C_BH" }))
public class XtglJwh implements java.io.Serializable {

	// Fields

	private String VId;
	private String depId;
	private String CBh;
	private String CSsxz;
	private String VMc;
	private String VBz;
	private Date dtCreate;

	// Constructors

	/** default constructor */
	public XtglJwh() {
	}

	/** minimal constructor */
	public XtglJwh(String VId, String depId, String CBh) {
		this.VId = VId;
		this.depId = depId;
		this.CBh = CBh;
	}

	/** full constructor */
	public XtglJwh(String VId, String depId, String CBh, String CSsxz,
			String VMc, String VBz, Date dtCreate) {
		this.VId = VId;
		this.depId = depId;
		this.CBh = CBh;
		this.CSsxz = CSsxz;
		this.VMc = VMc;
		this.VBz = VBz;
		this.dtCreate = dtCreate;
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

	@Column(name = "DEP_ID", nullable = false, length = 100)
	public String getDepId() {
		return this.depId;
	}

	public void setDepId(String depId) {
		this.depId = depId;
	}

	@Column(name = "C_BH", nullable = false, length = 2)
	public String getCBh() {
		return this.CBh;
	}

	public void setCBh(String CBh) {
		this.CBh = CBh;
	}

	@Column(name = "C_SSXZ", length = 2)
	public String getCSsxz() {
		return this.CSsxz;
	}

	public void setCSsxz(String CSsxz) {
		this.CSsxz = CSsxz;
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


}