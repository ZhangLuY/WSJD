package com.zrhis.wsjd.system.bean;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * SqglJtcytnbzxb entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "SQGL_JTCYTNBZXB", schema = "CXJM", uniqueConstraints = @UniqueConstraint(columnNames = {
		"C_ID", "C_GRBH", "DT_JLSJ" }))
public class SqglJtcytnbzxb implements java.io.Serializable {

	// Fields

	private String CGrbh;
	private String depId;
	private String CId;
	private Integer ITnblx;
	private Double NXtsp;
	private Integer IJtqk;
	private Double MJtfy;
	private Integer IJjyy;
	private Integer IWj;
	private Integer IPybb;
	private Integer IByf;
	private Integer IBlfy;
	private Integer IBxyw;
	private Integer ISybb;
	private Integer IQt;
	private String VQtyy;
	private Integer IBfjx;
	private Integer IBffjh;
	private Integer IBfdmy;
	private Integer IBfsjb;
	private Integer IBfswm;
	private Double NWztz;
	private Double NMqtz;
	private Double NKfxt;
	private Double NFhxt;
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
	public SqglJtcytnbzxb() {
	}

	/** minimal constructor */
	public SqglJtcytnbzxb(String CGrbh, Date dtJlsj, String CCzybh) {
		this.CGrbh = CGrbh;
		this.dtJlsj = dtJlsj;
		this.CCzybh = CCzybh;
	}

	/** full constructor */
	public SqglJtcytnbzxb(String CGrbh, String depId, String CId,
			Integer ITnblx, Double NXtsp, Integer IJtqk, Double MJtfy,
			Integer IJjyy, Integer IWj, Integer IPybb,
			Integer IByf, Integer IBlfy, Integer IBxyw,
			Integer ISybb, Integer IQt, String VQtyy, Integer IBfjx,
			Integer IBffjh, Integer IBfdmy, Integer IBfsjb,
			Integer IBfswm, Double NWztz, Double NMqtz, Double NKfxt,
			Double NFhxt, String VBdcz, String VDcz, String VFhz,
			Date dtQmrq, Date dtDcrq, Date dtFhrq,
			Date dtJlsj, String CCzybh, String VBz, String depName,
			Integer IUpload, Date dtUpload, Date dtCreate,
			String VXm, Short IXb, String VZjhm, Date dtCsrq,
			String VYktbh, String VBz1, String VBz2, String VBz3,
			Integer IHisto) {
		this.CGrbh = CGrbh;
		this.depId = depId;
		this.CId = CId;
		this.ITnblx = ITnblx;
		this.NXtsp = NXtsp;
		this.IJtqk = IJtqk;
		this.MJtfy = MJtfy;
		this.IJjyy = IJjyy;
		this.IWj = IWj;
		this.IPybb = IPybb;
		this.IByf = IByf;
		this.IBlfy = IBlfy;
		this.IBxyw = IBxyw;
		this.ISybb = ISybb;
		this.IQt = IQt;
		this.VQtyy = VQtyy;
		this.IBfjx = IBfjx;
		this.IBffjh = IBffjh;
		this.IBfdmy = IBfdmy;
		this.IBfsjb = IBfsjb;
		this.IBfswm = IBfswm;
		this.NWztz = NWztz;
		this.NMqtz = NMqtz;
		this.NKfxt = NKfxt;
		this.NFhxt = NFhxt;
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

	@Column(name = "I_TNBLX", precision = 22, scale = 0)
	public Integer getITnblx() {
		return this.ITnblx;
	}

	public void setITnblx(Integer ITnblx) {
		this.ITnblx = ITnblx;
	}

	@Column(name = "N_XTSP", scale = 4)
	public Double getNXtsp() {
		return this.NXtsp;
	}

	public void setNXtsp(Double NXtsp) {
		this.NXtsp = NXtsp;
	}

	@Column(name = "I_JTQK", precision = 22, scale = 0)
	public Integer getIJtqk() {
		return this.IJtqk;
	}

	public void setIJtqk(Integer IJtqk) {
		this.IJtqk = IJtqk;
	}

	@Column(name = "M_JTFY", scale = 4)
	public Double getMJtfy() {
		return this.MJtfy;
	}

	public void setMJtfy(Double MJtfy) {
		this.MJtfy = MJtfy;
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

	@Column(name = "I_PYBB", precision = 22, scale = 0)
	public Integer getIPybb() {
		return this.IPybb;
	}

	public void setIPybb(Integer IPybb) {
		this.IPybb = IPybb;
	}

	@Column(name = "I_BYF", precision = 22, scale = 0)
	public Integer getIByf() {
		return this.IByf;
	}

	public void setIByf(Integer IByf) {
		this.IByf = IByf;
	}

	@Column(name = "I_BLFY", precision = 22, scale = 0)
	public Integer getIBlfy() {
		return this.IBlfy;
	}

	public void setIBlfy(Integer IBlfy) {
		this.IBlfy = IBlfy;
	}

	@Column(name = "I_BXYW", precision = 22, scale = 0)
	public Integer getIBxyw() {
		return this.IBxyw;
	}

	public void setIBxyw(Integer IBxyw) {
		this.IBxyw = IBxyw;
	}

	@Column(name = "I_SYBB", precision = 22, scale = 0)
	public Integer getISybb() {
		return this.ISybb;
	}

	public void setISybb(Integer ISybb) {
		this.ISybb = ISybb;
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

	@Column(name = "I_BFJX", precision = 22, scale = 0)
	public Integer getIBfjx() {
		return this.IBfjx;
	}

	public void setIBfjx(Integer IBfjx) {
		this.IBfjx = IBfjx;
	}

	@Column(name = "I_BFFJH", precision = 22, scale = 0)
	public Integer getIBffjh() {
		return this.IBffjh;
	}

	public void setIBffjh(Integer IBffjh) {
		this.IBffjh = IBffjh;
	}

	@Column(name = "I_BFDMY", precision = 22, scale = 0)
	public Integer getIBfdmy() {
		return this.IBfdmy;
	}

	public void setIBfdmy(Integer IBfdmy) {
		this.IBfdmy = IBfdmy;
	}

	@Column(name = "I_BFSJB", precision = 22, scale = 0)
	public Integer getIBfsjb() {
		return this.IBfsjb;
	}

	public void setIBfsjb(Integer IBfsjb) {
		this.IBfsjb = IBfsjb;
	}

	@Column(name = "I_BFSWM", precision = 22, scale = 0)
	public Integer getIBfswm() {
		return this.IBfswm;
	}

	public void setIBfswm(Integer IBfswm) {
		this.IBfswm = IBfswm;
	}

	@Column(name = "N_WZTZ")
	public Double getNWztz() {
		return this.NWztz;
	}

	public void setNWztz(Double NWztz) {
		this.NWztz = NWztz;
	}

	@Column(name = "N_MQTZ")
	public Double getNMqtz() {
		return this.NMqtz;
	}

	public void setNMqtz(Double NMqtz) {
		this.NMqtz = NMqtz;
	}

	@Column(name = "N_KFXT", scale = 4)
	public Double getNKfxt() {
		return this.NKfxt;
	}

	public void setNKfxt(Double NKfxt) {
		this.NKfxt = NKfxt;
	}

	@Column(name = "N_FHXT", scale = 4)
	public Double getNFhxt() {
		return this.NFhxt;
	}

	public void setNFhxt(Double NFhxt) {
		this.NFhxt = NFhxt;
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

	@Column(name = "C_CZYBH", nullable = false, length = 50)
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