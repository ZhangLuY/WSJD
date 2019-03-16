package com.zrhis.wsjd.system.bean;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * XtglUsers entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "XTGL_USERS", schema = "CXJM")
public class XtglUsers implements java.io.Serializable {

	// Fields

	private String CUserbh;
	private String depId;
	private String VUsermc;
	private String VDlkl;
	private String VXm;
	private String VZjhm;
	private BigDecimal IXb;
	private Date dtCsrq;
	private String VSjhm;
	private String VJtzz;
	private String VXxzz;
	private String CGrbh;
	private String CJth;

	// Constructors

	/** default constructor */
	public XtglUsers() {
	}

	/** minimal constructor */
	public XtglUsers(String CUserbh) {
		this.CUserbh = CUserbh;
	}

	/** full constructor */
	public XtglUsers(String CUserbh, String depId, String VUsermc,
			String VDlkl, String VXm, String VZjhm, BigDecimal IXb,
			Date dtCsrq, String VSjhm, String VJtzz, String VXxzz,
			String CGrbh, String CJth) {
		this.CUserbh = CUserbh;
		this.depId = depId;
		this.VUsermc = VUsermc;
		this.VDlkl = VDlkl;
		this.VXm = VXm;
		this.VZjhm = VZjhm;
		this.IXb = IXb;
		this.dtCsrq = dtCsrq;
		this.VSjhm = VSjhm;
		this.VJtzz = VJtzz;
		this.VXxzz = VXxzz;
		this.CGrbh = CGrbh;
		this.CJth = CJth;
	}

	// Property accessors
	@Id
	@Column(name = "C_USERBH", unique = true, nullable = false, length = 50)
	public String getCUserbh() {
		return this.CUserbh;
	}

	public void setCUserbh(String CUserbh) {
		this.CUserbh = CUserbh;
	}

	@Column(name = "DEP_ID", length = 100)
	public String getDepId() {
		return this.depId;
	}

	public void setDepId(String depId) {
		this.depId = depId;
	}

	@Column(name = "V_USERMC", length = 100)
	public String getVUsermc() {
		return this.VUsermc;
	}

	public void setVUsermc(String VUsermc) {
		this.VUsermc = VUsermc;
	}

	@Column(name = "V_DLKL", length = 200)
	public String getVDlkl() {
		return this.VDlkl;
	}

	public void setVDlkl(String VDlkl) {
		this.VDlkl = VDlkl;
	}

	@Column(name = "V_XM", length = 20)
	public String getVXm() {
		return this.VXm;
	}

	public void setVXm(String VXm) {
		this.VXm = VXm;
	}

	@Column(name = "V_ZJHM", length = 20)
	public String getVZjhm() {
		return this.VZjhm;
	}

	public void setVZjhm(String VZjhm) {
		this.VZjhm = VZjhm;
	}

	@Column(name = "I_XB", precision = 22, scale = 0)
	public BigDecimal getIXb() {
		return this.IXb;
	}

	public void setIXb(BigDecimal IXb) {
		this.IXb = IXb;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DT_CSRQ", length = 7)
	public Date getDtCsrq() {
		return this.dtCsrq;
	}

	public void setDtCsrq(Date dtCsrq) {
		this.dtCsrq = dtCsrq;
	}

	@Column(name = "V_SJHM", length = 20)
	public String getVSjhm() {
		return this.VSjhm;
	}

	public void setVSjhm(String VSjhm) {
		this.VSjhm = VSjhm;
	}

	@Column(name = "V_JTZZ", length = 100)
	public String getVJtzz() {
		return this.VJtzz;
	}

	public void setVJtzz(String VJtzz) {
		this.VJtzz = VJtzz;
	}

	@Column(name = "V_XXZZ", length = 150)
	public String getVXxzz() {
		return this.VXxzz;
	}

	public void setVXxzz(String VXxzz) {
		this.VXxzz = VXxzz;
	}

	@Column(name = "C_GRBH", length = 22)
	public String getCGrbh() {
		return this.CGrbh;
	}

	public void setCGrbh(String CGrbh) {
		this.CGrbh = CGrbh;
	}

	@Column(name = "C_JTH", length = 20)
	public String getCJth() {
		return this.CJth;
	}

	public void setCJth(String CJth) {
		this.CJth = CJth;
	}

}