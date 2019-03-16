package com.zrhis.wsjd.system.bean;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

/**
 * XtglCzy entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "XTGL_CZY", schema = "CXJM", uniqueConstraints = @UniqueConstraint(columnNames = {
		"C_CZYBH", "DEP_ID" }))
public class XtglCzy implements java.io.Serializable {

	// Fields

	private String CCzybh;
	private String depId;
	private String VCzymc;
	private String VZcmc;
	private String VDlkl;
	private Boolean NZt;
	private Boolean NCjyh;
	private String depName;
	private String rolId;
	private String VCss;
	private Date dtZcrq;
	private Date dtCreate;
	private String VYlbh;
	private String VXtbh;
	private Short NYhlb;
	private Short IGlms;
	private Short ICxfs;
	private Short IType;
	private String VScqx;

	// Constructors

	/** default constructor */
	public XtglCzy() {
	}

	/** minimal constructor */
	public XtglCzy(String CCzybh, String depId) {
		this.CCzybh = CCzybh;
		this.depId = depId;
	}

	/** full constructor */
	public XtglCzy(String CCzybh, String depId, String VCzymc, String VZcmc,
			String VDlkl, Boolean NZt, Boolean NCjyh, String depName,
			String rolId, String VCss, Date dtZcrq, Date dtCreate,
			String VYlbh, String VXtbh, Short NYhlb, Short IGlms, Short ICxfs,
			Short IType, String VScqx) {
		this.CCzybh = CCzybh;
		this.depId = depId;
		this.VCzymc = VCzymc;
		this.VZcmc = VZcmc;
		this.VDlkl = VDlkl;
		this.NZt = NZt;
		this.NCjyh = NCjyh;
		this.depName = depName;
		this.rolId = rolId;
		this.VCss = VCss;
		this.dtZcrq = dtZcrq;
		this.dtCreate = dtCreate;
		this.VYlbh = VYlbh;
		this.VXtbh = VXtbh;
		this.NYhlb = NYhlb;
		this.IGlms = IGlms;
		this.ICxfs = ICxfs;
		this.IType = IType;
		this.VScqx = VScqx;
	}

	// Property accessors
	@Id
	@Column(name = "C_CZYBH", unique = true, nullable = false, length = 50)
	public String getCCzybh() {
		return this.CCzybh;
	}

	public void setCCzybh(String CCzybh) {
		this.CCzybh = CCzybh;
	}

	@Column(name = "DEP_ID", nullable = false, length = 100)
	public String getDepId() {
		return this.depId;
	}

	public void setDepId(String depId) {
		this.depId = depId;
	}

	@Column(name = "V_CZYMC", length = 100)
	public String getVCzymc() {
		return this.VCzymc;
	}

	public void setVCzymc(String VCzymc) {
		this.VCzymc = VCzymc;
	}

	@Column(name = "V_ZCMC", length = 20)
	public String getVZcmc() {
		return this.VZcmc;
	}

	public void setVZcmc(String VZcmc) {
		this.VZcmc = VZcmc;
	}

	@Column(name = "V_DLKL", length = 200)
	public String getVDlkl() {
		return this.VDlkl;
	}

	public void setVDlkl(String VDlkl) {
		this.VDlkl = VDlkl;
	}

	@Column(name = "N_ZT", precision = 1, scale = 0)
	public Boolean getNZt() {
		return this.NZt;
	}

	public void setNZt(Boolean NZt) {
		this.NZt = NZt;
	}

	@Column(name = "N_CJYH", precision = 1, scale = 0)
	public Boolean getNCjyh() {
		return this.NCjyh;
	}

	public void setNCjyh(Boolean NCjyh) {
		this.NCjyh = NCjyh;
	}

	@Column(name = "DEP_NAME")
	public String getDepName() {
		return this.depName;
	}

	public void setDepName(String depName) {
		this.depName = depName;
	}

	@Column(name = "ROL_ID", length = 50)
	public String getRolId() {
		return this.rolId;
	}

	public void setRolId(String rolId) {
		this.rolId = rolId;
	}

	@Column(name = "V_CSS", length = 100)
	public String getVCss() {
		return this.VCss;
	}

	public void setVCss(String VCss) {
		this.VCss = VCss;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DT_ZCRQ", length = 7)
	public Date getDtZcrq() {
		return this.dtZcrq;
	}

	public void setDtZcrq(Date dtZcrq) {
		this.dtZcrq = dtZcrq;
	}

	@Column(name = "V_YLBH", length = 100)
	public String getVYlbh() {
		return this.VYlbh;
	}

	public void setVYlbh(String VYlbh) {
		this.VYlbh = VYlbh;
	}

	@Column(name = "V_XTBH", length = 100)
	public String getVXtbh() {
		return this.VXtbh;
	}

	public void setVXtbh(String VXtbh) {
		this.VXtbh = VXtbh;
	}

	@Column(name = "N_YHLB", precision = 4, scale = 0)
	public Short getNYhlb() {
		return this.NYhlb;
	}

	public void setNYhlb(Short NYhlb) {
		this.NYhlb = NYhlb;
	}

	@Column(name = "I_GLMS", precision = 4, scale = 0)
	public Short getIGlms() {
		return this.IGlms;
	}

	public void setIGlms(Short IGlms) {
		this.IGlms = IGlms;
	}

	@Column(name = "I_CXFS", precision = 4, scale = 0)
	public Short getICxfs() {
		return this.ICxfs;
	}

	public void setICxfs(Short ICxfs) {
		this.ICxfs = ICxfs;
	}

	@Column(name = "I_TYPE", precision = 4, scale = 0)
	public Short getIType() {
		return this.IType;
	}

	public void setIType(Short IType) {
		this.IType = IType;
	}

	@Column(name = "V_SCQX", length = 100)
	public String getVScqx() {
		return this.VScqx;
	}

	public void setVScqx(String VScqx) {
		this.VScqx = VScqx;
	}

}