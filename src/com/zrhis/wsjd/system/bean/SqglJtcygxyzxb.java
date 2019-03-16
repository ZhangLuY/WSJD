package com.zrhis.wsjd.system.bean;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * SqglJtcygxyzxb entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "SQGL_JTCYGXYZXB", schema = "CXJM", uniqueConstraints = @UniqueConstraint(columnNames = {
		"DEP_ID", "C_GRBH", "DT_JLSJ" }))
public class SqglJtcygxyzxb implements java.io.Serializable {

	// Fields

	private String CGrbh;
	private String depId;
	private String CId;
	private Integer IGljb;
	private Integer IBslx;
	private Integer IXyg;
	private Integer IXyd;
	private Integer IJyyqk;
	private Integer IJjyy;
	private Integer IWj;
	private Integer IBlfy;
	private Integer IFybb;
	private Integer IPybb;
	private Integer IBxzl;
	private Integer IByf;
	private Integer IQt;
	private String VQtyy;
	private Double MJyfy;
	private Integer INqx;
	private Integer INcx;
	private Integer INdzqx;
	private Integer IXjgs;
	private Integer IXjt;
	private Integer IXgdm;
	private Integer IXcx;
	private Integer IStnb;
	private Integer ISsj;
	private Integer IScx;
	private Integer ISsz;
	private Integer IGyfc;
	private Integer ISfgxz;
	private Integer IZdgcjc;
	private Integer IZdgcjcz;
	private Integer ISfzxsfh;
	private Integer IZxsfhjc;
	private Integer ISfydjc;
	private Integer ISfswmxz;
	private Integer IXtjc;
	private Integer IXtjcz;
	private Integer INdbjc;
	private Integer INdbjcz;
	private Integer ISfdmbk;
	private Integer IDmbkz;
	private Integer ISfxxgjzs;
	private String VBdcz;
	private String VDcz;
	private String VFhz;
	private Date dtQmrq;
	private Date dtDcrq;
	private Date dtFhrq;
	private Date dtJlsj;
	private String CCzybh;
	private String VBz;
	private String depName;
	private Integer IUpload;
	private Date dtUpload;
	private Date dtCreate;
	private String VXm;
	private Short IXb;
	private String VZjhm;
	private Date dtCsrq;
	private String VYktbh;
	private String VBz1;
	private String VBz2;
	private String VBz3;
	private Integer IHisto;

	// Constructors

	/** default constructor */
	public SqglJtcygxyzxb() {
	}

	/** minimal constructor */
	public SqglJtcygxyzxb(String CGrbh, Date dtJlsj) {
		this.CGrbh = CGrbh;
		this.dtJlsj = dtJlsj;
	}

	/** full constructor */
	public SqglJtcygxyzxb(String CGrbh, String depId, String CId,
			Integer IGljb, Integer IBslx, Integer IXyg,
			Integer IXyd, Integer IJyyqk, Integer IJjyy,
			Integer IWj, Integer IBlfy, Integer IFybb,
			Integer IPybb, Integer IBxzl, Integer IByf,
			Integer IQt, String VQtyy, Double MJyfy, Integer INqx,
			Integer INcx, Integer INdzqx, Integer IXjgs,
			Integer IXjt, Integer IXgdm, Integer IXcx,
			Integer IStnb, Integer ISsj, Integer IScx,
			Integer ISsz, Integer IGyfc, Integer ISfgxz,
			Integer IZdgcjc, Integer IZdgcjcz, Integer ISfzxsfh,
			Integer IZxsfhjc, Integer ISfydjc, Integer ISfswmxz,
			Integer IXtjc, Integer IXtjcz, Integer INdbjc,
			Integer INdbjcz, Integer ISfdmbk, Integer IDmbkz,
			Integer ISfxxgjzs, String VBdcz, String VDcz, String VFhz,
			Date dtQmrq, Date dtDcrq, Date dtFhrq,
			Date dtJlsj, String CCzybh, String VBz, String depName,
			Integer IUpload, Date dtUpload, Date dtCreate,
			String VXm, Short IXb, String VZjhm, Date dtCsrq,
			String VYktbh, String VBz1, String VBz2, String VBz3,
			Integer IHisto) {
		this.CGrbh = CGrbh;
		this.depId = depId;
		this.CId = CId;
		this.IGljb = IGljb;
		this.IBslx = IBslx;
		this.IXyg = IXyg;
		this.IXyd = IXyd;
		this.IJyyqk = IJyyqk;
		this.IJjyy = IJjyy;
		this.IWj = IWj;
		this.IBlfy = IBlfy;
		this.IFybb = IFybb;
		this.IPybb = IPybb;
		this.IBxzl = IBxzl;
		this.IByf = IByf;
		this.IQt = IQt;
		this.VQtyy = VQtyy;
		this.MJyfy = MJyfy;
		this.INqx = INqx;
		this.INcx = INcx;
		this.INdzqx = INdzqx;
		this.IXjgs = IXjgs;
		this.IXjt = IXjt;
		this.IXgdm = IXgdm;
		this.IXcx = IXcx;
		this.IStnb = IStnb;
		this.ISsj = ISsj;
		this.IScx = IScx;
		this.ISsz = ISsz;
		this.IGyfc = IGyfc;
		this.ISfgxz = ISfgxz;
		this.IZdgcjc = IZdgcjc;
		this.IZdgcjcz = IZdgcjcz;
		this.ISfzxsfh = ISfzxsfh;
		this.IZxsfhjc = IZxsfhjc;
		this.ISfydjc = ISfydjc;
		this.ISfswmxz = ISfswmxz;
		this.IXtjc = IXtjc;
		this.IXtjcz = IXtjcz;
		this.INdbjc = INdbjc;
		this.INdbjcz = INdbjcz;
		this.ISfdmbk = ISfdmbk;
		this.IDmbkz = IDmbkz;
		this.ISfxxgjzs = ISfxxgjzs;
		this.VBdcz = VBdcz;
		this.VDcz = VDcz;
		this.VFhz = VFhz;
		this.dtQmrq = dtQmrq;
		this.dtDcrq = dtDcrq;
		this.dtFhrq = dtFhrq;
		this.dtJlsj = dtJlsj;
		this.CCzybh = CCzybh;
		this.VBz = VBz;
		this.depName = depName;
		this.IUpload = IUpload;
		this.dtUpload = dtUpload;
		this.dtCreate = dtCreate;
		this.VXm = VXm;
		this.IXb = IXb;
		this.VZjhm = VZjhm;
		this.dtCsrq = dtCsrq;
		this.VYktbh = VYktbh;
		this.VBz1 = VBz1;
		this.VBz2 = VBz2;
		this.VBz3 = VBz3;
		this.IHisto = IHisto;
	}

	// Property accessors
	@Id
	@Column(name = "C_GRBH", unique = true, nullable = false, length = 22)
	public String getCGrbh() {
		return this.CGrbh;
	}

	public void setCGrbh(String CGrbh) {
		this.CGrbh = CGrbh;
	}

	@Column(name = "DEP_ID", length = 100)
	public String getDepId() {
		return this.depId;
	}

	public void setDepId(String depId) {
		this.depId = depId;
	}

	@Column(name = "C_ID", length = 14)
	public String getCId() {
		return this.CId;
	}

	public void setCId(String CId) {
		this.CId = CId;
	}

	@Column(name = "I_GLJB", precision = 22, scale = 0)
	public Integer getIGljb() {
		return this.IGljb;
	}

	public void setIGljb(Integer IGljb) {
		this.IGljb = IGljb;
	}

	@Column(name = "I_BSLX", precision = 22, scale = 0)
	public Integer getIBslx() {
		return this.IBslx;
	}

	public void setIBslx(Integer IBslx) {
		this.IBslx = IBslx;
	}

	@Column(name = "I_XYG", precision = 22, scale = 0)
	public Integer getIXyg() {
		return this.IXyg;
	}

	public void setIXyg(Integer IXyg) {
		this.IXyg = IXyg;
	}

	@Column(name = "I_XYD", precision = 22, scale = 0)
	public Integer getIXyd() {
		return this.IXyd;
	}

	public void setIXyd(Integer IXyd) {
		this.IXyd = IXyd;
	}

	@Column(name = "I_JYYQK", precision = 22, scale = 0)
	public Integer getIJyyqk() {
		return this.IJyyqk;
	}

	public void setIJyyqk(Integer IJyyqk) {
		this.IJyyqk = IJyyqk;
	}

	@Column(name = "I_JJYY", precision = 22, scale = 0)
	public Integer getIJjyy() {
		return this.IJjyy;
	}

	public void setIJjyy(Integer IJjyy) {
		this.IJjyy = IJjyy;
	}

	@Column(name = "I_WJ", precision = 22, scale = 0)
	public Integer getIWj() {
		return this.IWj;
	}

	public void setIWj(Integer IWj) {
		this.IWj = IWj;
	}

	@Column(name = "I_BLFY", precision = 22, scale = 0)
	public Integer getIBlfy() {
		return this.IBlfy;
	}

	public void setIBlfy(Integer IBlfy) {
		this.IBlfy = IBlfy;
	}

	@Column(name = "I_FYBB", precision = 22, scale = 0)
	public Integer getIFybb() {
		return this.IFybb;
	}

	public void setIFybb(Integer IFybb) {
		this.IFybb = IFybb;
	}

	@Column(name = "I_PYBB", precision = 22, scale = 0)
	public Integer getIPybb() {
		return this.IPybb;
	}

	public void setIPybb(Integer IPybb) {
		this.IPybb = IPybb;
	}

	@Column(name = "I_BXZL", precision = 22, scale = 0)
	public Integer getIBxzl() {
		return this.IBxzl;
	}

	public void setIBxzl(Integer IBxzl) {
		this.IBxzl = IBxzl;
	}

	@Column(name = "I_BYF", precision = 22, scale = 0)
	public Integer getIByf() {
		return this.IByf;
	}

	public void setIByf(Integer IByf) {
		this.IByf = IByf;
	}

	@Column(name = "I_QT", precision = 22, scale = 0)
	public Integer getIQt() {
		return this.IQt;
	}

	public void setIQt(Integer IQt) {
		this.IQt = IQt;
	}

	@Column(name = "V_QTYY", length = 100)
	public String getVQtyy() {
		return this.VQtyy;
	}

	public void setVQtyy(String VQtyy) {
		this.VQtyy = VQtyy;
	}

	@Column(name = "M_JYFY", scale = 4)
	public Double getMJyfy() {
		return this.MJyfy;
	}

	public void setMJyfy(Double MJyfy) {
		this.MJyfy = MJyfy;
	}

	@Column(name = "I_NQX", precision = 22, scale = 0)
	public Integer getINqx() {
		return this.INqx;
	}

	public void setINqx(Integer INqx) {
		this.INqx = INqx;
	}

	@Column(name = "I_NCX", precision = 22, scale = 0)
	public Integer getINcx() {
		return this.INcx;
	}

	public void setINcx(Integer INcx) {
		this.INcx = INcx;
	}

	@Column(name = "I_NDZQX", precision = 22, scale = 0)
	public Integer getINdzqx() {
		return this.INdzqx;
	}

	public void setINdzqx(Integer INdzqx) {
		this.INdzqx = INdzqx;
	}

	@Column(name = "I_XJGS", precision = 22, scale = 0)
	public Integer getIXjgs() {
		return this.IXjgs;
	}

	public void setIXjgs(Integer IXjgs) {
		this.IXjgs = IXjgs;
	}

	@Column(name = "I_XJT", precision = 22, scale = 0)
	public Integer getIXjt() {
		return this.IXjt;
	}

	public void setIXjt(Integer IXjt) {
		this.IXjt = IXjt;
	}

	@Column(name = "I_XGDM", precision = 22, scale = 0)
	public Integer getIXgdm() {
		return this.IXgdm;
	}

	public void setIXgdm(Integer IXgdm) {
		this.IXgdm = IXgdm;
	}

	@Column(name = "I_XCX", precision = 22, scale = 0)
	public Integer getIXcx() {
		return this.IXcx;
	}

	public void setIXcx(Integer IXcx) {
		this.IXcx = IXcx;
	}

	@Column(name = "I_STNB", precision = 22, scale = 0)
	public Integer getIStnb() {
		return this.IStnb;
	}

	public void setIStnb(Integer IStnb) {
		this.IStnb = IStnb;
	}

	@Column(name = "I_SSJ", precision = 22, scale = 0)
	public Integer getISsj() {
		return this.ISsj;
	}

	public void setISsj(Integer ISsj) {
		this.ISsj = ISsj;
	}

	@Column(name = "I_SCX", precision = 22, scale = 0)
	public Integer getIScx() {
		return this.IScx;
	}

	public void setIScx(Integer IScx) {
		this.IScx = IScx;
	}

	@Column(name = "I_SSZ", precision = 22, scale = 0)
	public Integer getISsz() {
		return this.ISsz;
	}

	public void setISsz(Integer ISsz) {
		this.ISsz = ISsz;
	}

	@Column(name = "I_GYFC", precision = 22, scale = 0)
	public Integer getIGyfc() {
		return this.IGyfc;
	}

	public void setIGyfc(Integer IGyfc) {
		this.IGyfc = IGyfc;
	}

	@Column(name = "I_SFGXZ", precision = 22, scale = 0)
	public Integer getISfgxz() {
		return this.ISfgxz;
	}

	public void setISfgxz(Integer ISfgxz) {
		this.ISfgxz = ISfgxz;
	}

	@Column(name = "I_ZDGCJC", precision = 22, scale = 0)
	public Integer getIZdgcjc() {
		return this.IZdgcjc;
	}

	public void setIZdgcjc(Integer IZdgcjc) {
		this.IZdgcjc = IZdgcjc;
	}

	@Column(name = "I_ZDGCJCZ", precision = 22, scale = 0)
	public Integer getIZdgcjcz() {
		return this.IZdgcjcz;
	}

	public void setIZdgcjcz(Integer IZdgcjcz) {
		this.IZdgcjcz = IZdgcjcz;
	}

	@Column(name = "I_SFZXSFH", precision = 22, scale = 0)
	public Integer getISfzxsfh() {
		return this.ISfzxsfh;
	}

	public void setISfzxsfh(Integer ISfzxsfh) {
		this.ISfzxsfh = ISfzxsfh;
	}

	@Column(name = "I_ZXSFHJC", precision = 22, scale = 0)
	public Integer getIZxsfhjc() {
		return this.IZxsfhjc;
	}

	public void setIZxsfhjc(Integer IZxsfhjc) {
		this.IZxsfhjc = IZxsfhjc;
	}

	@Column(name = "I_SFYDJC", precision = 22, scale = 0)
	public Integer getISfydjc() {
		return this.ISfydjc;
	}

	public void setISfydjc(Integer ISfydjc) {
		this.ISfydjc = ISfydjc;
	}

	@Column(name = "I_SFSWMXZ", precision = 22, scale = 0)
	public Integer getISfswmxz() {
		return this.ISfswmxz;
	}

	public void setISfswmxz(Integer ISfswmxz) {
		this.ISfswmxz = ISfswmxz;
	}

	@Column(name = "I_XTJC", precision = 22, scale = 0)
	public Integer getIXtjc() {
		return this.IXtjc;
	}

	public void setIXtjc(Integer IXtjc) {
		this.IXtjc = IXtjc;
	}

	@Column(name = "I_XTJCZ", precision = 22, scale = 0)
	public Integer getIXtjcz() {
		return this.IXtjcz;
	}

	public void setIXtjcz(Integer IXtjcz) {
		this.IXtjcz = IXtjcz;
	}

	@Column(name = "I_NDBJC", precision = 22, scale = 0)
	public Integer getINdbjc() {
		return this.INdbjc;
	}

	public void setINdbjc(Integer INdbjc) {
		this.INdbjc = INdbjc;
	}

	@Column(name = "I_NDBJCZ", precision = 22, scale = 0)
	public Integer getINdbjcz() {
		return this.INdbjcz;
	}

	public void setINdbjcz(Integer INdbjcz) {
		this.INdbjcz = INdbjcz;
	}

	@Column(name = "I_SFDMBK", precision = 22, scale = 0)
	public Integer getISfdmbk() {
		return this.ISfdmbk;
	}

	public void setISfdmbk(Integer ISfdmbk) {
		this.ISfdmbk = ISfdmbk;
	}

	@Column(name = "I_DMBKZ", precision = 22, scale = 0)
	public Integer getIDmbkz() {
		return this.IDmbkz;
	}

	public void setIDmbkz(Integer IDmbkz) {
		this.IDmbkz = IDmbkz;
	}

	@Column(name = "I_SFXXGJZS", precision = 22, scale = 0)
	public Integer getISfxxgjzs() {
		return this.ISfxxgjzs;
	}

	public void setISfxxgjzs(Integer ISfxxgjzs) {
		this.ISfxxgjzs = ISfxxgjzs;
	}

	@Column(name = "V_BDCZ", length = 10)
	public String getVBdcz() {
		return this.VBdcz;
	}

	public void setVBdcz(String VBdcz) {
		this.VBdcz = VBdcz;
	}

	@Column(name = "V_DCZ", length = 10)
	public String getVDcz() {
		return this.VDcz;
	}

	public void setVDcz(String VDcz) {
		this.VDcz = VDcz;
	}

	@Column(name = "V_FHZ", length = 10)
	public String getVFhz() {
		return this.VFhz;
	}

	public void setVFhz(String VFhz) {
		this.VFhz = VFhz;
	}

	@Column(name = "DT_QMRQ", length = 7)
	public Date getDtQmrq() {
		return this.dtQmrq;
	}

	public void setDtQmrq(Date dtQmrq) {
		this.dtQmrq = dtQmrq;
	}

	@Column(name = "DT_DCRQ", length = 7)
	public Date getDtDcrq() {
		return this.dtDcrq;
	}

	public void setDtDcrq(Date dtDcrq) {
		this.dtDcrq = dtDcrq;
	}

	@Column(name = "DT_FHRQ", length = 7)
	public Date getDtFhrq() {
		return this.dtFhrq;
	}

	public void setDtFhrq(Date dtFhrq) {
		this.dtFhrq = dtFhrq;
	}

	@Column(name = "DT_JLSJ", nullable = false, length = 7)
	public Date getDtJlsj() {
		return this.dtJlsj;
	}

	public void setDtJlsj(Date dtJlsj) {
		this.dtJlsj = dtJlsj;
	}

	@Column(name = "C_CZYBH", length = 50)
	public String getCCzybh() {
		return this.CCzybh;
	}

	public void setCCzybh(String CCzybh) {
		this.CCzybh = CCzybh;
	}

	@Column(name = "V_BZ", length = 60)
	public String getVBz() {
		return this.VBz;
	}

	public void setVBz(String VBz) {
		this.VBz = VBz;
	}

	@Column(name = "DEP_NAME")
	public String getDepName() {
		return this.depName;
	}

	public void setDepName(String depName) {
		this.depName = depName;
	}

	@Column(name = "I_UPLOAD", precision = 22, scale = 0)
	public Integer getIUpload() {
		return this.IUpload;
	}

	public void setIUpload(Integer IUpload) {
		this.IUpload = IUpload;
	}

	@Column(name = "DT_UPLOAD", length = 7)
	public Date getDtUpload() {
		return this.dtUpload;
	}

	public void setDtUpload(Date dtUpload) {
		this.dtUpload = dtUpload;
	}
	@Column(name = "V_XM", length = 60)
	public String getVXm() {
		return this.VXm;
	}

	public void setVXm(String VXm) {
		this.VXm = VXm;
	}

	@Column(name = "I_XB", precision = 4, scale = 0)
	public Short getIXb() {
		return this.IXb;
	}

	public void setIXb(Short IXb) {
		this.IXb = IXb;
	}

	@Column(name = "V_ZJHM", length = 20)
	public String getVZjhm() {
		return this.VZjhm;
	}

	public void setVZjhm(String VZjhm) {
		this.VZjhm = VZjhm;
	}

	@Column(name = "DT_CSRQ", length = 7)
	public Date getDtCsrq() {
		return this.dtCsrq;
	}

	public void setDtCsrq(Date dtCsrq) {
		this.dtCsrq = dtCsrq;
	}

	@Column(name = "V_YKTBH", length = 100)
	public String getVYktbh() {
		return this.VYktbh;
	}

	public void setVYktbh(String VYktbh) {
		this.VYktbh = VYktbh;
	}

	@Column(name = "V_BZ1", length = 100)
	public String getVBz1() {
		return this.VBz1;
	}

	public void setVBz1(String VBz1) {
		this.VBz1 = VBz1;
	}

	@Column(name = "V_BZ2", length = 100)
	public String getVBz2() {
		return this.VBz2;
	}

	public void setVBz2(String VBz2) {
		this.VBz2 = VBz2;
	}

	@Column(name = "V_BZ3", length = 100)
	public String getVBz3() {
		return this.VBz3;
	}

	public void setVBz3(String VBz3) {
		this.VBz3 = VBz3;
	}

	@Column(name = "I_HISTO", precision = 22, scale = 0)
	public Integer getIHisto() {
		return this.IHisto;
	}

	public void setIHisto(Integer IHisto) {
		this.IHisto = IHisto;
	}

}