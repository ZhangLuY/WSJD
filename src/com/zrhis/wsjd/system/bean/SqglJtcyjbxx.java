package com.zrhis.wsjd.system.bean;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * SqglJtcyjbxx entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "SQGL_JTCYJBXX", schema = "CXJM", uniqueConstraints = @UniqueConstraint(columnNames = {
		"DEP_ID", "C_GRBH" }))
public class SqglJtcyjbxx implements java.io.Serializable {

	// Fields

	private String CGrbh;
	private String depId;
	private String CSqh;
	private String CId;
	private String VXm;
	private String CJth;
	private String CYhzgx;
	private String VPyjm;
	private Integer IXb;
	private Date dtCsrq;
	private Integer IHklx;
	private Integer IHjlx;
	private Integer IJzzk;
	private Integer IYlfkfs;
	private String VQt;
	private String VYbzh;
	private Integer IHf;
	private Double NSg;
	private Double NTz;
	private Integer IXl;
	private String VXyg;
	private String VXyd;
	private String VMz;
	private String CSf;
	private String CSq;
	private String CXq;
	private String VGzdw;
	private String VDwdh;
	private String VZjhm;
	private String CWhcd;
	private String VJg;
	private String VYqzy;
	private String VZy;
	private String VSzjwh;
	private String VSzpcs;
	private String CSzxq;
	private String VSzjd;
	private String VSzyh;
	private String VSzlh;
	private String VSzfjh;
	private String CYzbm;
	private String VLxdh;
	private Integer IXx;
	private Integer ISflr;
	private Integer IZt;
	private Integer IZcdyy;
	private String VZdjwh;
	private String CZdxq;
	private String VZdjd;
	private String VZdlh;
	private String VZdfjh;
	private String VWgyy;
	private Integer IJwjkzk;
	private Integer IJblb1;
	private Integer IJblb2;
	private Integer IJblb3;
	private Integer IJblb4;
	private Integer IJblb5;
	private Integer IJblb6;
	private Integer IJblb7;
	private Integer IJblb8;
	private Integer IJblb9;
	private Integer IJblb10;
	private Integer IJblb11;
	private Integer IJblb12;
	private Integer IJblb13;
	private Integer IJblb14;
	private Integer IJblb15;
	private Integer IJblb16;
	private Integer IJblb17;
	private Integer IJblb18;
	private Integer IJblb19;
	private Integer IJblb20;
	private Integer IJblb21;
	private Integer IJblb22;
	private Integer IJblb23;
	private Integer IJblb24;
	private Integer IJblb25;
	private Integer IJblb26;
	private Integer IJblb27;
	private Integer IJblb28;
	private Integer IJblb29;
	private Integer IJblb30;
	private String VQtjb;
	private Date dtQzrq1;
	private Date dtQzrq2;
	private Date dtQzrq3;
	private Date dtQzrq4;
	private Date dtQzrq5;
	private Date dtQzrq6;
	private Date dtQzrq7;
	private Date dtQzrq8;
	private Date dtQzrq9;
	private Date dtQzrq10;
	private Date dtQzrq11;
	private Date dtQzrq12;
	private Date dtQzrq13;
	private Date dtQzrq14;
	private Date dtQzrq15;
	private Date dtQzrq16;
	private Date dtQzrq17;
	private Date dtQzrq18;
	private Date dtQzrq19;
	private Date dtQzrq20;
	private Date dtQzrq21;
	private Date dtQzrq22;
	private Date dtQzrq23;
	private Date dtQzrq24;
	private Date dtQzrq25;
	private Date dtQzrq26;
	private Date dtQzrq27;
	private Date dtQzrq28;
	private Date dtQzrq29;
	private Date dtQzrq30;
	private Date dtQtqzrq;
	private String VJdys;
	private String VJdhs;
	private Date dtJdrq;
	private String VBdcz;
	private String VDcz;
	private String VFhz;
	private Date dtQmrq;
	private Date dtDcrq;
	private Date dtFhrq;
	private String VBz;
	private Integer IIczt;
	private String VJddw;
	private String VJddwdh;
	private String VJtdh;
	private String VYsdh;
	private String VQtsm;
	private String VLxrxm;
	private Integer IYwss;
	private String VSsmc1;
	private String VSsmc2;
	private String VSsmc3;
	private Date dtSsrq1;
	private Date dtSsrq2;
	private Date dtSsrq3;
	private Integer IYwws;
	private String VWsmc1;
	private String VWsmc2;
	private String VWsmc3;
	private Date dtWsrq1;
	private Date dtWsrq2;
	private Date dtWsrq3;
	private Integer IYwsx;
	private String VSxyy1;
	private String VSxyy2;
	private String VSxyy3;
	private Date dtSxrq1;
	private Date dtSxrq2;
	private Date dtSxrq3;
	private Integer IYwgm;
	private Integer IYwqms;
	private Integer IYwha;
	private Integer IYwlms;
	private Integer IQtgm;
	private String VQtgm;
	private Integer IYwcj;
	private Integer ISlcj;
	private Integer ITlcj;
	private Integer IYycj;
	private Integer IZtcj;
	private Integer IZlcj;
	private Integer IJscj;
	private Integer IQtcj;
	private String VQtcj;
	private Integer IXxyx;
	private String VZhxgr;
	private Date dtZhxgrq;
	private Integer IXgbz;
	private Integer IJlbz;
	private Integer ICsbz;
	private Integer IZt2;
	private Integer IZcdyy2;
	private String depName;
	private String VGrsdbh;
	private Integer IUpload;
	private Date dtUpload;
	private Date dtCreate;
	private Short IYwbls;
	private Long IBls;
	private Short ICfpf;
	private Short IRllx;
	private Short IYs;
	private Short ICs;
	private Short IQcl;
	private String CCzybh;
	private String CSzjdh;
	private Short IEt;
	private Date dtTurnEt;
	private Date dtRevokeEt;
	private Short ILr;
	private Date dtTurnLr;
	private Date dtRevokeLr;
	private Short IYcf;
	private Date dtTurnYcf;
	private Date dtRevokeYcf;
	private String VJtlx;
	private Integer IQyzt;
	private Integer IJblb31;
	private Date dtQzrq31;
	private Integer IPkzt;
	private Date dtFwrq;
	private String VPgnf;

	// Constructors

	/** default constructor */
	public SqglJtcyjbxx() {
	}

	/** minimal constructor */
	public SqglJtcyjbxx(String CGrbh, String depId, String CSqh, String CId,
			String VXm, String CJth, Integer IXb, Date dtCsrq,
			Integer IZt) {
		this.CGrbh = CGrbh;
		this.depId = depId;
		this.CSqh = CSqh;
		this.CId = CId;
		this.VXm = VXm;
		this.CJth = CJth;
		this.IXb = IXb;
		this.dtCsrq = dtCsrq;
		this.IZt = IZt;
	}

	/** full constructor */
	public SqglJtcyjbxx(String CGrbh, String depId, String CSqh, String CId,
			String VXm, String CJth, String CYhzgx, String VPyjm,
			Integer IXb, Date dtCsrq, Integer IHklx,
			Integer IHjlx, Integer IJzzk, Integer IYlfkfs, String VQt,
			String VYbzh, Integer IHf, Double NSg, Double NTz,
			Integer IXl, String VXyg, String VXyd, String VMz, String CSf,
			String CSq, String CXq, String VGzdw, String VDwdh, String VZjhm,
			String CWhcd, String VJg, String VYqzy, String VZy, String VSzjwh,
			String VSzpcs, String CSzxq, String VSzjd, String VSzyh,
			String VSzlh, String VSzfjh, String CYzbm, String VLxdh,
			Integer IXx, Integer ISflr, Integer IZt,
			Integer IZcdyy, String VZdjwh, String CZdxq, String VZdjd,
			String VZdlh, String VZdfjh, String VWgyy, Integer IJwjkzk,
			Integer IJblb1, Integer IJblb2, Integer IJblb3,
			Integer IJblb4, Integer IJblb5, Integer IJblb6,
			Integer IJblb7, Integer IJblb8, Integer IJblb9,
			Integer IJblb10, Integer IJblb11, Integer IJblb12,
			Integer IJblb13, Integer IJblb14, Integer IJblb15,
			Integer IJblb16, Integer IJblb17, Integer IJblb18,
			Integer IJblb19, Integer IJblb20, Integer IJblb21,
			Integer IJblb22, Integer IJblb23, Integer IJblb24,
			Integer IJblb25, Integer IJblb26, Integer IJblb27,
			Integer IJblb28, Integer IJblb29, Integer IJblb30,
			String VQtjb, Date dtQzrq1, Date dtQzrq2,
			Date dtQzrq3, Date dtQzrq4, Date dtQzrq5,
			Date dtQzrq6, Date dtQzrq7, Date dtQzrq8,
			Date dtQzrq9, Date dtQzrq10, Date dtQzrq11,
			Date dtQzrq12, Date dtQzrq13, Date dtQzrq14,
			Date dtQzrq15, Date dtQzrq16, Date dtQzrq17,
			Date dtQzrq18, Date dtQzrq19, Date dtQzrq20,
			Date dtQzrq21, Date dtQzrq22, Date dtQzrq23,
			Date dtQzrq24, Date dtQzrq25, Date dtQzrq26,
			Date dtQzrq27, Date dtQzrq28, Date dtQzrq29,
			Date dtQzrq30, Date dtQtqzrq, String VJdys, String VJdhs,
			Date dtJdrq, String VBdcz, String VDcz, String VFhz,
			Date dtQmrq, Date dtDcrq, Date dtFhrq, String VBz,
			Integer IIczt, String VJddw, String VJddwdh, String VJtdh,
			String VYsdh, String VQtsm, String VLxrxm, Integer IYwss,
			String VSsmc1, String VSsmc2, String VSsmc3, Date dtSsrq1,
			Date dtSsrq2, Date dtSsrq3, Integer IYwws,
			String VWsmc1, String VWsmc2, String VWsmc3, Date dtWsrq1,
			Date dtWsrq2, Date dtWsrq3, Integer IYwsx,
			String VSxyy1, String VSxyy2, String VSxyy3, Date dtSxrq1,
			Date dtSxrq2, Date dtSxrq3, Integer IYwgm,
			Integer IYwqms, Integer IYwha, Integer IYwlms,
			Integer IQtgm, String VQtgm, Integer IYwcj, Integer ISlcj,
			Integer ITlcj, Integer IYycj, Integer IZtcj,
			Integer IZlcj, Integer IJscj, Integer IQtcj, String VQtcj,
			Integer IXxyx, String VZhxgr, Date dtZhxgrq,
			Integer IXgbz, Integer IJlbz, Integer ICsbz,
			Integer IZt2, Integer IZcdyy2, String depName,
			String VGrsdbh, Integer IUpload, Date dtUpload,
			Date dtCreate, Short IYwbls, Long IBls, Short ICfpf,
			Short IRllx, Short IYs, Short ICs, Short IQcl, String CCzybh,
			String CSzjdh, Short IEt, Date dtTurnEt, Date dtRevokeEt,
			Short ILr, Date dtTurnLr, Date dtRevokeLr, Short IYcf,
			Date dtTurnYcf, Date dtRevokeYcf, String VJtlx,
			Integer IQyzt, Integer IJblb31, Date dtQzrq31,
			Integer IPkzt, Date dtFwrq, String VPgnf) {
		this.CGrbh = CGrbh;
		this.depId = depId;
		this.CSqh = CSqh;
		this.CId = CId;
		this.VXm = VXm;
		this.CJth = CJth;
		this.CYhzgx = CYhzgx;
		this.VPyjm = VPyjm;
		this.IXb = IXb;
		this.dtCsrq = dtCsrq;
		this.IHklx = IHklx;
		this.IHjlx = IHjlx;
		this.IJzzk = IJzzk;
		this.IYlfkfs = IYlfkfs;
		this.VQt = VQt;
		this.VYbzh = VYbzh;
		this.IHf = IHf;
		this.NSg = NSg;
		this.NTz = NTz;
		this.IXl = IXl;
		this.VXyg = VXyg;
		this.VXyd = VXyd;
		this.VMz = VMz;
		this.CSf = CSf;
		this.CSq = CSq;
		this.CXq = CXq;
		this.VGzdw = VGzdw;
		this.VDwdh = VDwdh;
		this.VZjhm = VZjhm;
		this.CWhcd = CWhcd;
		this.VJg = VJg;
		this.VYqzy = VYqzy;
		this.VZy = VZy;
		this.VSzjwh = VSzjwh;
		this.VSzpcs = VSzpcs;
		this.CSzxq = CSzxq;
		this.VSzjd = VSzjd;
		this.VSzyh = VSzyh;
		this.VSzlh = VSzlh;
		this.VSzfjh = VSzfjh;
		this.CYzbm = CYzbm;
		this.VLxdh = VLxdh;
		this.IXx = IXx;
		this.ISflr = ISflr;
		this.IZt = IZt;
		this.IZcdyy = IZcdyy;
		this.VZdjwh = VZdjwh;
		this.CZdxq = CZdxq;
		this.VZdjd = VZdjd;
		this.VZdlh = VZdlh;
		this.VZdfjh = VZdfjh;
		this.VWgyy = VWgyy;
		this.IJwjkzk = IJwjkzk;
		this.IJblb1 = IJblb1;
		this.IJblb2 = IJblb2;
		this.IJblb3 = IJblb3;
		this.IJblb4 = IJblb4;
		this.IJblb5 = IJblb5;
		this.IJblb6 = IJblb6;
		this.IJblb7 = IJblb7;
		this.IJblb8 = IJblb8;
		this.IJblb9 = IJblb9;
		this.IJblb10 = IJblb10;
		this.IJblb11 = IJblb11;
		this.IJblb12 = IJblb12;
		this.IJblb13 = IJblb13;
		this.IJblb14 = IJblb14;
		this.IJblb15 = IJblb15;
		this.IJblb16 = IJblb16;
		this.IJblb17 = IJblb17;
		this.IJblb18 = IJblb18;
		this.IJblb19 = IJblb19;
		this.IJblb20 = IJblb20;
		this.IJblb21 = IJblb21;
		this.IJblb22 = IJblb22;
		this.IJblb23 = IJblb23;
		this.IJblb24 = IJblb24;
		this.IJblb25 = IJblb25;
		this.IJblb26 = IJblb26;
		this.IJblb27 = IJblb27;
		this.IJblb28 = IJblb28;
		this.IJblb29 = IJblb29;
		this.IJblb30 = IJblb30;
		this.VQtjb = VQtjb;
		this.dtQzrq1 = dtQzrq1;
		this.dtQzrq2 = dtQzrq2;
		this.dtQzrq3 = dtQzrq3;
		this.dtQzrq4 = dtQzrq4;
		this.dtQzrq5 = dtQzrq5;
		this.dtQzrq6 = dtQzrq6;
		this.dtQzrq7 = dtQzrq7;
		this.dtQzrq8 = dtQzrq8;
		this.dtQzrq9 = dtQzrq9;
		this.dtQzrq10 = dtQzrq10;
		this.dtQzrq11 = dtQzrq11;
		this.dtQzrq12 = dtQzrq12;
		this.dtQzrq13 = dtQzrq13;
		this.dtQzrq14 = dtQzrq14;
		this.dtQzrq15 = dtQzrq15;
		this.dtQzrq16 = dtQzrq16;
		this.dtQzrq17 = dtQzrq17;
		this.dtQzrq18 = dtQzrq18;
		this.dtQzrq19 = dtQzrq19;
		this.dtQzrq20 = dtQzrq20;
		this.dtQzrq21 = dtQzrq21;
		this.dtQzrq22 = dtQzrq22;
		this.dtQzrq23 = dtQzrq23;
		this.dtQzrq24 = dtQzrq24;
		this.dtQzrq25 = dtQzrq25;
		this.dtQzrq26 = dtQzrq26;
		this.dtQzrq27 = dtQzrq27;
		this.dtQzrq28 = dtQzrq28;
		this.dtQzrq29 = dtQzrq29;
		this.dtQzrq30 = dtQzrq30;
		this.dtQtqzrq = dtQtqzrq;
		this.VJdys = VJdys;
		this.VJdhs = VJdhs;
		this.dtJdrq = dtJdrq;
		this.VBdcz = VBdcz;
		this.VDcz = VDcz;
		this.VFhz = VFhz;
		this.dtQmrq = dtQmrq;
		this.dtDcrq = dtDcrq;
		this.dtFhrq = dtFhrq;
		this.VBz = VBz;
		this.IIczt = IIczt;
		this.VJddw = VJddw;
		this.VJddwdh = VJddwdh;
		this.VJtdh = VJtdh;
		this.VYsdh = VYsdh;
		this.VQtsm = VQtsm;
		this.VLxrxm = VLxrxm;
		this.IYwss = IYwss;
		this.VSsmc1 = VSsmc1;
		this.VSsmc2 = VSsmc2;
		this.VSsmc3 = VSsmc3;
		this.dtSsrq1 = dtSsrq1;
		this.dtSsrq2 = dtSsrq2;
		this.dtSsrq3 = dtSsrq3;
		this.IYwws = IYwws;
		this.VWsmc1 = VWsmc1;
		this.VWsmc2 = VWsmc2;
		this.VWsmc3 = VWsmc3;
		this.dtWsrq1 = dtWsrq1;
		this.dtWsrq2 = dtWsrq2;
		this.dtWsrq3 = dtWsrq3;
		this.IYwsx = IYwsx;
		this.VSxyy1 = VSxyy1;
		this.VSxyy2 = VSxyy2;
		this.VSxyy3 = VSxyy3;
		this.dtSxrq1 = dtSxrq1;
		this.dtSxrq2 = dtSxrq2;
		this.dtSxrq3 = dtSxrq3;
		this.IYwgm = IYwgm;
		this.IYwqms = IYwqms;
		this.IYwha = IYwha;
		this.IYwlms = IYwlms;
		this.IQtgm = IQtgm;
		this.VQtgm = VQtgm;
		this.IYwcj = IYwcj;
		this.ISlcj = ISlcj;
		this.ITlcj = ITlcj;
		this.IYycj = IYycj;
		this.IZtcj = IZtcj;
		this.IZlcj = IZlcj;
		this.IJscj = IJscj;
		this.IQtcj = IQtcj;
		this.VQtcj = VQtcj;
		this.IXxyx = IXxyx;
		this.VZhxgr = VZhxgr;
		this.dtZhxgrq = dtZhxgrq;
		this.IXgbz = IXgbz;
		this.IJlbz = IJlbz;
		this.ICsbz = ICsbz;
		this.IZt2 = IZt2;
		this.IZcdyy2 = IZcdyy2;
		this.depName = depName;
		this.VGrsdbh = VGrsdbh;
		this.IUpload = IUpload;
		this.dtUpload = dtUpload;
		this.dtCreate = dtCreate;
		this.IYwbls = IYwbls;
		this.IBls = IBls;
		this.ICfpf = ICfpf;
		this.IRllx = IRllx;
		this.IYs = IYs;
		this.ICs = ICs;
		this.IQcl = IQcl;
		this.CCzybh = CCzybh;
		this.CSzjdh = CSzjdh;
		this.IEt = IEt;
		this.dtTurnEt = dtTurnEt;
		this.dtRevokeEt = dtRevokeEt;
		this.ILr = ILr;
		this.dtTurnLr = dtTurnLr;
		this.dtRevokeLr = dtRevokeLr;
		this.IYcf = IYcf;
		this.dtTurnYcf = dtTurnYcf;
		this.dtRevokeYcf = dtRevokeYcf;
		this.VJtlx = VJtlx;
		this.IQyzt = IQyzt;
		this.IJblb31 = IJblb31;
		this.dtQzrq31 = dtQzrq31;
		this.IPkzt = IPkzt;
		this.dtFwrq = dtFwrq;
		this.VPgnf = VPgnf;
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

	@Column(name = "DEP_ID", nullable = false, length = 100)
	public String getDepId() {
		return this.depId;
	}

	public void setDepId(String depId) {
		this.depId = depId;
	}

	@Column(name = "C_SQH", nullable = false, length = 3)
	public String getCSqh() {
		return this.CSqh;
	}

	public void setCSqh(String CSqh) {
		this.CSqh = CSqh;
	}

	@Column(name = "C_ID", nullable = false, length = 14)
	public String getCId() {
		return this.CId;
	}

	public void setCId(String CId) {
		this.CId = CId;
	}

	@Column(name = "V_XM", nullable = false, length = 60)
	public String getVXm() {
		return this.VXm;
	}

	public void setVXm(String VXm) {
		this.VXm = VXm;
	}

	@Column(name = "C_JTH", nullable = false, length = 20)
	public String getCJth() {
		return this.CJth;
	}

	public void setCJth(String CJth) {
		this.CJth = CJth;
	}

	@Column(name = "C_YHZGX", length = 2)
	public String getCYhzgx() {
		return this.CYhzgx;
	}

	public void setCYhzgx(String CYhzgx) {
		this.CYhzgx = CYhzgx;
	}

	@Column(name = "V_PYJM", length = 40)
	public String getVPyjm() {
		return this.VPyjm;
	}

	public void setVPyjm(String VPyjm) {
		this.VPyjm = VPyjm;
	}

	@Column(name = "I_XB", nullable = false, precision = 22, scale = 0)
	public Integer getIXb() {
		return this.IXb;
	}

	public void setIXb(Integer IXb) {
		this.IXb = IXb;
	}

	@Column(name = "DT_CSRQ", nullable = false, length = 7)
	public Date getDtCsrq() {
		return this.dtCsrq;
	}

	public void setDtCsrq(Date dtCsrq) {
		this.dtCsrq = dtCsrq;
	}

	@Column(name = "I_HKLX", precision = 22, scale = 0)
	public Integer getIHklx() {
		return this.IHklx;
	}

	public void setIHklx(Integer IHklx) {
		this.IHklx = IHklx;
	}

	@Column(name = "I_HJLX", precision = 22, scale = 0)
	public Integer getIHjlx() {
		return this.IHjlx;
	}

	public void setIHjlx(Integer IHjlx) {
		this.IHjlx = IHjlx;
	}

	@Column(name = "I_JZZK", precision = 22, scale = 0)
	public Integer getIJzzk() {
		return this.IJzzk;
	}

	public void setIJzzk(Integer IJzzk) {
		this.IJzzk = IJzzk;
	}

	@Column(name = "I_YLFKFS", precision = 22, scale = 0)
	public Integer getIYlfkfs() {
		return this.IYlfkfs;
	}

	public void setIYlfkfs(Integer IYlfkfs) {
		this.IYlfkfs = IYlfkfs;
	}

	@Column(name = "V_QT", length = 10)
	public String getVQt() {
		return this.VQt;
	}

	public void setVQt(String VQt) {
		this.VQt = VQt;
	}

	@Column(name = "V_YBZH", length = 30)
	public String getVYbzh() {
		return this.VYbzh;
	}

	public void setVYbzh(String VYbzh) {
		this.VYbzh = VYbzh;
	}

	@Column(name = "I_HF", precision = 22, scale = 0)
	public Integer getIHf() {
		return this.IHf;
	}

	public void setIHf(Integer IHf) {
		this.IHf = IHf;
	}

	@Column(name = "N_SG", precision = 10)
	public Double getNSg() {
		return this.NSg;
	}

	public void setNSg(Double NSg) {
		this.NSg = NSg;
	}

	@Column(name = "N_TZ", precision = 10)
	public Double getNTz() {
		return this.NTz;
	}

	public void setNTz(Double NTz) {
		this.NTz = NTz;
	}

	@Column(name = "I_XL", precision = 22, scale = 0)
	public Integer getIXl() {
		return this.IXl;
	}

	public void setIXl(Integer IXl) {
		this.IXl = IXl;
	}

	@Column(name = "V_XYG", length = 20)
	public String getVXyg() {
		return this.VXyg;
	}

	public void setVXyg(String VXyg) {
		this.VXyg = VXyg;
	}

	@Column(name = "V_XYD", length = 20)
	public String getVXyd() {
		return this.VXyd;
	}

	public void setVXyd(String VXyd) {
		this.VXyd = VXyd;
	}

	@Column(name = "V_MZ", length = 20)
	public String getVMz() {
		return this.VMz;
	}

	public void setVMz(String VMz) {
		this.VMz = VMz;
	}

	@Column(name = "C_SF", length = 2)
	public String getCSf() {
		return this.CSf;
	}

	public void setCSf(String CSf) {
		this.CSf = CSf;
	}

	@Column(name = "C_SQ", length = 4)
	public String getCSq() {
		return this.CSq;
	}

	public void setCSq(String CSq) {
		this.CSq = CSq;
	}

	@Column(name = "C_XQ", length = 7)
	public String getCXq() {
		return this.CXq;
	}

	public void setCXq(String CXq) {
		this.CXq = CXq;
	}

	@Column(name = "V_GZDW", length = 100)
	public String getVGzdw() {
		return this.VGzdw;
	}

	public void setVGzdw(String VGzdw) {
		this.VGzdw = VGzdw;
	}

	@Column(name = "V_DWDH", length = 20)
	public String getVDwdh() {
		return this.VDwdh;
	}

	public void setVDwdh(String VDwdh) {
		this.VDwdh = VDwdh;
	}

	@Column(name = "V_ZJHM", length = 20)
	public String getVZjhm() {
		return this.VZjhm;
	}

	public void setVZjhm(String VZjhm) {
		this.VZjhm = VZjhm;
	}

	@Column(name = "C_WHCD", length = 50)
	public String getCWhcd() {
		return this.CWhcd;
	}

	public void setCWhcd(String CWhcd) {
		this.CWhcd = CWhcd;
	}

	@Column(name = "V_JG", length = 200)
	public String getVJg() {
		return this.VJg;
	}

	public void setVJg(String VJg) {
		this.VJg = VJg;
	}

	@Column(name = "V_YQZY", length = 30)
	public String getVYqzy() {
		return this.VYqzy;
	}

	public void setVYqzy(String VYqzy) {
		this.VYqzy = VYqzy;
	}

	@Column(name = "V_ZY", length = 10)
	public String getVZy() {
		return this.VZy;
	}

	public void setVZy(String VZy) {
		this.VZy = VZy;
	}

	@Column(name = "V_SZJWH", length = 50)
	public String getVSzjwh() {
		return this.VSzjwh;
	}

	public void setVSzjwh(String VSzjwh) {
		this.VSzjwh = VSzjwh;
	}

	@Column(name = "V_SZPCS", length = 200)
	public String getVSzpcs() {
		return this.VSzpcs;
	}

	public void setVSzpcs(String VSzpcs) {
		this.VSzpcs = VSzpcs;
	}

	@Column(name = "C_SZXQ", length = 30)
	public String getCSzxq() {
		return this.CSzxq;
	}

	public void setCSzxq(String CSzxq) {
		this.CSzxq = CSzxq;
	}

	@Column(name = "V_SZJD", length = 50)
	public String getVSzjd() {
		return this.VSzjd;
	}

	public void setVSzjd(String VSzjd) {
		this.VSzjd = VSzjd;
	}

	@Column(name = "V_SZYH", length = 40)
	public String getVSzyh() {
		return this.VSzyh;
	}

	public void setVSzyh(String VSzyh) {
		this.VSzyh = VSzyh;
	}

	@Column(name = "V_SZLH", length = 40)
	public String getVSzlh() {
		return this.VSzlh;
	}

	public void setVSzlh(String VSzlh) {
		this.VSzlh = VSzlh;
	}

	@Column(name = "V_SZFJH", length = 40)
	public String getVSzfjh() {
		return this.VSzfjh;
	}

	public void setVSzfjh(String VSzfjh) {
		this.VSzfjh = VSzfjh;
	}

	@Column(name = "C_YZBM", length = 6)
	public String getCYzbm() {
		return this.CYzbm;
	}

	public void setCYzbm(String CYzbm) {
		this.CYzbm = CYzbm;
	}

	@Column(name = "V_LXDH", length = 20)
	public String getVLxdh() {
		return this.VLxdh;
	}

	public void setVLxdh(String VLxdh) {
		this.VLxdh = VLxdh;
	}

	@Column(name = "I_XX", precision = 22, scale = 0)
	public Integer getIXx() {
		return this.IXx;
	}

	public void setIXx(Integer IXx) {
		this.IXx = IXx;
	}

	@Column(name = "I_SFLR", precision = 22, scale = 0)
	public Integer getISflr() {
		return this.ISflr;
	}

	public void setISflr(Integer ISflr) {
		this.ISflr = ISflr;
	}

	@Column(name = "I_ZT", nullable = false, precision = 22, scale = 0)
	public Integer getIZt() {
		return this.IZt;
	}

	public void setIZt(Integer IZt) {
		this.IZt = IZt;
	}

	@Column(name = "I_ZCDYY", precision = 22, scale = 0)
	public Integer getIZcdyy() {
		return this.IZcdyy;
	}

	public void setIZcdyy(Integer IZcdyy) {
		this.IZcdyy = IZcdyy;
	}

	@Column(name = "V_ZDJWH", length = 50)
	public String getVZdjwh() {
		return this.VZdjwh;
	}

	public void setVZdjwh(String VZdjwh) {
		this.VZdjwh = VZdjwh;
	}

	@Column(name = "C_ZDXQ", length = 50)
	public String getCZdxq() {
		return this.CZdxq;
	}

	public void setCZdxq(String CZdxq) {
		this.CZdxq = CZdxq;
	}

	@Column(name = "V_ZDJD", length = 50)
	public String getVZdjd() {
		return this.VZdjd;
	}

	public void setVZdjd(String VZdjd) {
		this.VZdjd = VZdjd;
	}

	@Column(name = "V_ZDLH", length = 10)
	public String getVZdlh() {
		return this.VZdlh;
	}

	public void setVZdlh(String VZdlh) {
		this.VZdlh = VZdlh;
	}

	@Column(name = "V_ZDFJH", length = 10)
	public String getVZdfjh() {
		return this.VZdfjh;
	}

	public void setVZdfjh(String VZdfjh) {
		this.VZdfjh = VZdfjh;
	}

	@Column(name = "V_WGYY", length = 20)
	public String getVWgyy() {
		return this.VWgyy;
	}

	public void setVWgyy(String VWgyy) {
		this.VWgyy = VWgyy;
	}

	@Column(name = "I_JWJKZK", precision = 22, scale = 0)
	public Integer getIJwjkzk() {
		return this.IJwjkzk;
	}

	public void setIJwjkzk(Integer IJwjkzk) {
		this.IJwjkzk = IJwjkzk;
	}

	@Column(name = "I_JBLB1", precision = 22, scale = 0)
	public Integer getIJblb1() {
		return this.IJblb1;
	}

	public void setIJblb1(Integer IJblb1) {
		this.IJblb1 = IJblb1;
	}

	@Column(name = "I_JBLB2", precision = 22, scale = 0)
	public Integer getIJblb2() {
		return this.IJblb2;
	}

	public void setIJblb2(Integer IJblb2) {
		this.IJblb2 = IJblb2;
	}

	@Column(name = "I_JBLB3", precision = 22, scale = 0)
	public Integer getIJblb3() {
		return this.IJblb3;
	}

	public void setIJblb3(Integer IJblb3) {
		this.IJblb3 = IJblb3;
	}

	@Column(name = "I_JBLB4", precision = 22, scale = 0)
	public Integer getIJblb4() {
		return this.IJblb4;
	}

	public void setIJblb4(Integer IJblb4) {
		this.IJblb4 = IJblb4;
	}

	@Column(name = "I_JBLB5", precision = 22, scale = 0)
	public Integer getIJblb5() {
		return this.IJblb5;
	}

	public void setIJblb5(Integer IJblb5) {
		this.IJblb5 = IJblb5;
	}

	@Column(name = "I_JBLB6", precision = 22, scale = 0)
	public Integer getIJblb6() {
		return this.IJblb6;
	}

	public void setIJblb6(Integer IJblb6) {
		this.IJblb6 = IJblb6;
	}

	@Column(name = "I_JBLB7", precision = 22, scale = 0)
	public Integer getIJblb7() {
		return this.IJblb7;
	}

	public void setIJblb7(Integer IJblb7) {
		this.IJblb7 = IJblb7;
	}

	@Column(name = "I_JBLB8", precision = 22, scale = 0)
	public Integer getIJblb8() {
		return this.IJblb8;
	}

	public void setIJblb8(Integer IJblb8) {
		this.IJblb8 = IJblb8;
	}

	@Column(name = "I_JBLB9", precision = 22, scale = 0)
	public Integer getIJblb9() {
		return this.IJblb9;
	}

	public void setIJblb9(Integer IJblb9) {
		this.IJblb9 = IJblb9;
	}

	@Column(name = "I_JBLB10", precision = 22, scale = 0)
	public Integer getIJblb10() {
		return this.IJblb10;
	}

	public void setIJblb10(Integer IJblb10) {
		this.IJblb10 = IJblb10;
	}

	@Column(name = "I_JBLB11", precision = 22, scale = 0)
	public Integer getIJblb11() {
		return this.IJblb11;
	}

	public void setIJblb11(Integer IJblb11) {
		this.IJblb11 = IJblb11;
	}

	@Column(name = "I_JBLB12", precision = 22, scale = 0)
	public Integer getIJblb12() {
		return this.IJblb12;
	}

	public void setIJblb12(Integer IJblb12) {
		this.IJblb12 = IJblb12;
	}

	@Column(name = "I_JBLB13", precision = 22, scale = 0)
	public Integer getIJblb13() {
		return this.IJblb13;
	}

	public void setIJblb13(Integer IJblb13) {
		this.IJblb13 = IJblb13;
	}

	@Column(name = "I_JBLB14", precision = 22, scale = 0)
	public Integer getIJblb14() {
		return this.IJblb14;
	}

	public void setIJblb14(Integer IJblb14) {
		this.IJblb14 = IJblb14;
	}

	@Column(name = "I_JBLB15", precision = 22, scale = 0)
	public Integer getIJblb15() {
		return this.IJblb15;
	}

	public void setIJblb15(Integer IJblb15) {
		this.IJblb15 = IJblb15;
	}

	@Column(name = "I_JBLB16", precision = 22, scale = 0)
	public Integer getIJblb16() {
		return this.IJblb16;
	}

	public void setIJblb16(Integer IJblb16) {
		this.IJblb16 = IJblb16;
	}

	@Column(name = "I_JBLB17", precision = 22, scale = 0)
	public Integer getIJblb17() {
		return this.IJblb17;
	}

	public void setIJblb17(Integer IJblb17) {
		this.IJblb17 = IJblb17;
	}

	@Column(name = "I_JBLB18", precision = 22, scale = 0)
	public Integer getIJblb18() {
		return this.IJblb18;
	}

	public void setIJblb18(Integer IJblb18) {
		this.IJblb18 = IJblb18;
	}

	@Column(name = "I_JBLB19", precision = 22, scale = 0)
	public Integer getIJblb19() {
		return this.IJblb19;
	}

	public void setIJblb19(Integer IJblb19) {
		this.IJblb19 = IJblb19;
	}

	@Column(name = "I_JBLB20", precision = 22, scale = 0)
	public Integer getIJblb20() {
		return this.IJblb20;
	}

	public void setIJblb20(Integer IJblb20) {
		this.IJblb20 = IJblb20;
	}

	@Column(name = "I_JBLB21", precision = 22, scale = 0)
	public Integer getIJblb21() {
		return this.IJblb21;
	}

	public void setIJblb21(Integer IJblb21) {
		this.IJblb21 = IJblb21;
	}

	@Column(name = "I_JBLB22", precision = 22, scale = 0)
	public Integer getIJblb22() {
		return this.IJblb22;
	}

	public void setIJblb22(Integer IJblb22) {
		this.IJblb22 = IJblb22;
	}

	@Column(name = "I_JBLB23", precision = 22, scale = 0)
	public Integer getIJblb23() {
		return this.IJblb23;
	}

	public void setIJblb23(Integer IJblb23) {
		this.IJblb23 = IJblb23;
	}

	@Column(name = "I_JBLB24", precision = 22, scale = 0)
	public Integer getIJblb24() {
		return this.IJblb24;
	}

	public void setIJblb24(Integer IJblb24) {
		this.IJblb24 = IJblb24;
	}

	@Column(name = "I_JBLB25", precision = 22, scale = 0)
	public Integer getIJblb25() {
		return this.IJblb25;
	}

	public void setIJblb25(Integer IJblb25) {
		this.IJblb25 = IJblb25;
	}

	@Column(name = "I_JBLB26", precision = 22, scale = 0)
	public Integer getIJblb26() {
		return this.IJblb26;
	}

	public void setIJblb26(Integer IJblb26) {
		this.IJblb26 = IJblb26;
	}

	@Column(name = "I_JBLB27", precision = 22, scale = 0)
	public Integer getIJblb27() {
		return this.IJblb27;
	}

	public void setIJblb27(Integer IJblb27) {
		this.IJblb27 = IJblb27;
	}

	@Column(name = "I_JBLB28", precision = 22, scale = 0)
	public Integer getIJblb28() {
		return this.IJblb28;
	}

	public void setIJblb28(Integer IJblb28) {
		this.IJblb28 = IJblb28;
	}

	@Column(name = "I_JBLB29", precision = 22, scale = 0)
	public Integer getIJblb29() {
		return this.IJblb29;
	}

	public void setIJblb29(Integer IJblb29) {
		this.IJblb29 = IJblb29;
	}

	@Column(name = "I_JBLB30", precision = 22, scale = 0)
	public Integer getIJblb30() {
		return this.IJblb30;
	}

	public void setIJblb30(Integer IJblb30) {
		this.IJblb30 = IJblb30;
	}

	@Column(name = "V_QTJB", length = 100)
	public String getVQtjb() {
		return this.VQtjb;
	}

	public void setVQtjb(String VQtjb) {
		this.VQtjb = VQtjb;
	}

	@Column(name = "DT_QZRQ1", length = 7)
	public Date getDtQzrq1() {
		return this.dtQzrq1;
	}

	public void setDtQzrq1(Date dtQzrq1) {
		this.dtQzrq1 = dtQzrq1;
	}

	@Column(name = "DT_QZRQ2", length = 7)
	public Date getDtQzrq2() {
		return this.dtQzrq2;
	}

	public void setDtQzrq2(Date dtQzrq2) {
		this.dtQzrq2 = dtQzrq2;
	}

	@Column(name = "DT_QZRQ3", length = 7)
	public Date getDtQzrq3() {
		return this.dtQzrq3;
	}

	public void setDtQzrq3(Date dtQzrq3) {
		this.dtQzrq3 = dtQzrq3;
	}

	@Column(name = "DT_QZRQ4", length = 7)
	public Date getDtQzrq4() {
		return this.dtQzrq4;
	}

	public void setDtQzrq4(Date dtQzrq4) {
		this.dtQzrq4 = dtQzrq4;
	}

	@Column(name = "DT_QZRQ5", length = 7)
	public Date getDtQzrq5() {
		return this.dtQzrq5;
	}

	public void setDtQzrq5(Date dtQzrq5) {
		this.dtQzrq5 = dtQzrq5;
	}

	@Column(name = "DT_QZRQ6", length = 7)
	public Date getDtQzrq6() {
		return this.dtQzrq6;
	}

	public void setDtQzrq6(Date dtQzrq6) {
		this.dtQzrq6 = dtQzrq6;
	}

	@Column(name = "DT_QZRQ7", length = 7)
	public Date getDtQzrq7() {
		return this.dtQzrq7;
	}

	public void setDtQzrq7(Date dtQzrq7) {
		this.dtQzrq7 = dtQzrq7;
	}

	@Column(name = "DT_QZRQ8", length = 7)
	public Date getDtQzrq8() {
		return this.dtQzrq8;
	}

	public void setDtQzrq8(Date dtQzrq8) {
		this.dtQzrq8 = dtQzrq8;
	}

	@Column(name = "DT_QZRQ9", length = 7)
	public Date getDtQzrq9() {
		return this.dtQzrq9;
	}

	public void setDtQzrq9(Date dtQzrq9) {
		this.dtQzrq9 = dtQzrq9;
	}

	@Column(name = "DT_QZRQ10", length = 7)
	public Date getDtQzrq10() {
		return this.dtQzrq10;
	}

	public void setDtQzrq10(Date dtQzrq10) {
		this.dtQzrq10 = dtQzrq10;
	}

	@Column(name = "DT_QZRQ11", length = 7)
	public Date getDtQzrq11() {
		return this.dtQzrq11;
	}

	public void setDtQzrq11(Date dtQzrq11) {
		this.dtQzrq11 = dtQzrq11;
	}

	@Column(name = "DT_QZRQ12", length = 7)
	public Date getDtQzrq12() {
		return this.dtQzrq12;
	}

	public void setDtQzrq12(Date dtQzrq12) {
		this.dtQzrq12 = dtQzrq12;
	}

	@Column(name = "DT_QZRQ13", length = 7)
	public Date getDtQzrq13() {
		return this.dtQzrq13;
	}

	public void setDtQzrq13(Date dtQzrq13) {
		this.dtQzrq13 = dtQzrq13;
	}

	@Column(name = "DT_QZRQ14", length = 7)
	public Date getDtQzrq14() {
		return this.dtQzrq14;
	}

	public void setDtQzrq14(Date dtQzrq14) {
		this.dtQzrq14 = dtQzrq14;
	}

	@Column(name = "DT_QZRQ15", length = 7)
	public Date getDtQzrq15() {
		return this.dtQzrq15;
	}

	public void setDtQzrq15(Date dtQzrq15) {
		this.dtQzrq15 = dtQzrq15;
	}

	@Column(name = "DT_QZRQ16", length = 7)
	public Date getDtQzrq16() {
		return this.dtQzrq16;
	}

	public void setDtQzrq16(Date dtQzrq16) {
		this.dtQzrq16 = dtQzrq16;
	}

	@Column(name = "DT_QZRQ17", length = 7)
	public Date getDtQzrq17() {
		return this.dtQzrq17;
	}

	public void setDtQzrq17(Date dtQzrq17) {
		this.dtQzrq17 = dtQzrq17;
	}

	@Column(name = "DT_QZRQ18", length = 7)
	public Date getDtQzrq18() {
		return this.dtQzrq18;
	}

	public void setDtQzrq18(Date dtQzrq18) {
		this.dtQzrq18 = dtQzrq18;
	}

	@Column(name = "DT_QZRQ19", length = 7)
	public Date getDtQzrq19() {
		return this.dtQzrq19;
	}

	public void setDtQzrq19(Date dtQzrq19) {
		this.dtQzrq19 = dtQzrq19;
	}

	@Column(name = "DT_QZRQ20", length = 7)
	public Date getDtQzrq20() {
		return this.dtQzrq20;
	}

	public void setDtQzrq20(Date dtQzrq20) {
		this.dtQzrq20 = dtQzrq20;
	}

	@Column(name = "DT_QZRQ21", length = 7)
	public Date getDtQzrq21() {
		return this.dtQzrq21;
	}

	public void setDtQzrq21(Date dtQzrq21) {
		this.dtQzrq21 = dtQzrq21;
	}

	@Column(name = "DT_QZRQ22", length = 7)
	public Date getDtQzrq22() {
		return this.dtQzrq22;
	}

	public void setDtQzrq22(Date dtQzrq22) {
		this.dtQzrq22 = dtQzrq22;
	}

	@Column(name = "DT_QZRQ23", length = 7)
	public Date getDtQzrq23() {
		return this.dtQzrq23;
	}

	public void setDtQzrq23(Date dtQzrq23) {
		this.dtQzrq23 = dtQzrq23;
	}

	@Column(name = "DT_QZRQ24", length = 7)
	public Date getDtQzrq24() {
		return this.dtQzrq24;
	}

	public void setDtQzrq24(Date dtQzrq24) {
		this.dtQzrq24 = dtQzrq24;
	}

	@Column(name = "DT_QZRQ25", length = 7)
	public Date getDtQzrq25() {
		return this.dtQzrq25;
	}

	public void setDtQzrq25(Date dtQzrq25) {
		this.dtQzrq25 = dtQzrq25;
	}

	@Column(name = "DT_QZRQ26", length = 7)
	public Date getDtQzrq26() {
		return this.dtQzrq26;
	}

	public void setDtQzrq26(Date dtQzrq26) {
		this.dtQzrq26 = dtQzrq26;
	}

	@Column(name = "DT_QZRQ27", length = 7)
	public Date getDtQzrq27() {
		return this.dtQzrq27;
	}

	public void setDtQzrq27(Date dtQzrq27) {
		this.dtQzrq27 = dtQzrq27;
	}

	@Column(name = "DT_QZRQ28", length = 7)
	public Date getDtQzrq28() {
		return this.dtQzrq28;
	}

	public void setDtQzrq28(Date dtQzrq28) {
		this.dtQzrq28 = dtQzrq28;
	}

	@Column(name = "DT_QZRQ29", length = 7)
	public Date getDtQzrq29() {
		return this.dtQzrq29;
	}

	public void setDtQzrq29(Date dtQzrq29) {
		this.dtQzrq29 = dtQzrq29;
	}

	@Column(name = "DT_QZRQ30", length = 7)
	public Date getDtQzrq30() {
		return this.dtQzrq30;
	}

	public void setDtQzrq30(Date dtQzrq30) {
		this.dtQzrq30 = dtQzrq30;
	}

	@Column(name = "DT_QTQZRQ", length = 7)
	public Date getDtQtqzrq() {
		return this.dtQtqzrq;
	}

	public void setDtQtqzrq(Date dtQtqzrq) {
		this.dtQtqzrq = dtQtqzrq;
	}

	@Column(name = "V_JDYS", length = 10)
	public String getVJdys() {
		return this.VJdys;
	}

	public void setVJdys(String VJdys) {
		this.VJdys = VJdys;
	}

	@Column(name = "V_JDHS", length = 10)
	public String getVJdhs() {
		return this.VJdhs;
	}

	public void setVJdhs(String VJdhs) {
		this.VJdhs = VJdhs;
	}

	@Column(name = "DT_JDRQ", length = 7)
	public Date getDtJdrq() {
		return this.dtJdrq;
	}

	public void setDtJdrq(Date dtJdrq) {
		this.dtJdrq = dtJdrq;
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

	@Column(name = "V_BZ", length = 60)
	public String getVBz() {
		return this.VBz;
	}

	public void setVBz(String VBz) {
		this.VBz = VBz;
	}

	@Column(name = "I_ICZT", precision = 22, scale = 0)
	public Integer getIIczt() {
		return this.IIczt;
	}

	public void setIIczt(Integer IIczt) {
		this.IIczt = IIczt;
	}

	@Column(name = "V_JDDW", length = 100)
	public String getVJddw() {
		return this.VJddw;
	}

	public void setVJddw(String VJddw) {
		this.VJddw = VJddw;
	}

	@Column(name = "V_JDDWDH", length = 20)
	public String getVJddwdh() {
		return this.VJddwdh;
	}

	public void setVJddwdh(String VJddwdh) {
		this.VJddwdh = VJddwdh;
	}

	@Column(name = "V_JTDH", length = 20)
	public String getVJtdh() {
		return this.VJtdh;
	}

	public void setVJtdh(String VJtdh) {
		this.VJtdh = VJtdh;
	}

	@Column(name = "V_YSDH", length = 20)
	public String getVYsdh() {
		return this.VYsdh;
	}

	public void setVYsdh(String VYsdh) {
		this.VYsdh = VYsdh;
	}

	@Column(name = "V_QTSM", length = 500)
	public String getVQtsm() {
		return this.VQtsm;
	}

	public void setVQtsm(String VQtsm) {
		this.VQtsm = VQtsm;
	}

	@Column(name = "V_LXRXM", length = 10)
	public String getVLxrxm() {
		return this.VLxrxm;
	}

	public void setVLxrxm(String VLxrxm) {
		this.VLxrxm = VLxrxm;
	}

	@Column(name = "I_YWSS", precision = 22, scale = 0)
	public Integer getIYwss() {
		return this.IYwss;
	}

	public void setIYwss(Integer IYwss) {
		this.IYwss = IYwss;
	}

	@Column(name = "V_SSMC1", length = 100)
	public String getVSsmc1() {
		return this.VSsmc1;
	}

	public void setVSsmc1(String VSsmc1) {
		this.VSsmc1 = VSsmc1;
	}

	@Column(name = "V_SSMC2", length = 100)
	public String getVSsmc2() {
		return this.VSsmc2;
	}

	public void setVSsmc2(String VSsmc2) {
		this.VSsmc2 = VSsmc2;
	}

	@Column(name = "V_SSMC3", length = 100)
	public String getVSsmc3() {
		return this.VSsmc3;
	}

	public void setVSsmc3(String VSsmc3) {
		this.VSsmc3 = VSsmc3;
	}

	@Column(name = "DT_SSRQ1", length = 7)
	public Date getDtSsrq1() {
		return this.dtSsrq1;
	}

	public void setDtSsrq1(Date dtSsrq1) {
		this.dtSsrq1 = dtSsrq1;
	}

	@Column(name = "DT_SSRQ2", length = 7)
	public Date getDtSsrq2() {
		return this.dtSsrq2;
	}

	public void setDtSsrq2(Date dtSsrq2) {
		this.dtSsrq2 = dtSsrq2;
	}

	@Column(name = "DT_SSRQ3", length = 7)
	public Date getDtSsrq3() {
		return this.dtSsrq3;
	}

	public void setDtSsrq3(Date dtSsrq3) {
		this.dtSsrq3 = dtSsrq3;
	}

	@Column(name = "I_YWWS", precision = 22, scale = 0)
	public Integer getIYwws() {
		return this.IYwws;
	}

	public void setIYwws(Integer IYwws) {
		this.IYwws = IYwws;
	}

	@Column(name = "V_WSMC1", length = 100)
	public String getVWsmc1() {
		return this.VWsmc1;
	}

	public void setVWsmc1(String VWsmc1) {
		this.VWsmc1 = VWsmc1;
	}

	@Column(name = "V_WSMC2", length = 100)
	public String getVWsmc2() {
		return this.VWsmc2;
	}

	public void setVWsmc2(String VWsmc2) {
		this.VWsmc2 = VWsmc2;
	}

	@Column(name = "V_WSMC3", length = 100)
	public String getVWsmc3() {
		return this.VWsmc3;
	}

	public void setVWsmc3(String VWsmc3) {
		this.VWsmc3 = VWsmc3;
	}

	@Column(name = "DT_WSRQ1", length = 7)
	public Date getDtWsrq1() {
		return this.dtWsrq1;
	}

	public void setDtWsrq1(Date dtWsrq1) {
		this.dtWsrq1 = dtWsrq1;
	}

	@Column(name = "DT_WSRQ2", length = 7)
	public Date getDtWsrq2() {
		return this.dtWsrq2;
	}

	public void setDtWsrq2(Date dtWsrq2) {
		this.dtWsrq2 = dtWsrq2;
	}

	@Column(name = "DT_WSRQ3", length = 7)
	public Date getDtWsrq3() {
		return this.dtWsrq3;
	}

	public void setDtWsrq3(Date dtWsrq3) {
		this.dtWsrq3 = dtWsrq3;
	}

	@Column(name = "I_YWSX", precision = 22, scale = 0)
	public Integer getIYwsx() {
		return this.IYwsx;
	}

	public void setIYwsx(Integer IYwsx) {
		this.IYwsx = IYwsx;
	}

	@Column(name = "V_SXYY1", length = 100)
	public String getVSxyy1() {
		return this.VSxyy1;
	}

	public void setVSxyy1(String VSxyy1) {
		this.VSxyy1 = VSxyy1;
	}

	@Column(name = "V_SXYY2", length = 100)
	public String getVSxyy2() {
		return this.VSxyy2;
	}

	public void setVSxyy2(String VSxyy2) {
		this.VSxyy2 = VSxyy2;
	}

	@Column(name = "V_SXYY3", length = 100)
	public String getVSxyy3() {
		return this.VSxyy3;
	}

	public void setVSxyy3(String VSxyy3) {
		this.VSxyy3 = VSxyy3;
	}

	@Column(name = "DT_SXRQ1", length = 7)
	public Date getDtSxrq1() {
		return this.dtSxrq1;
	}

	public void setDtSxrq1(Date dtSxrq1) {
		this.dtSxrq1 = dtSxrq1;
	}

	@Column(name = "DT_SXRQ2", length = 7)
	public Date getDtSxrq2() {
		return this.dtSxrq2;
	}

	public void setDtSxrq2(Date dtSxrq2) {
		this.dtSxrq2 = dtSxrq2;
	}

	@Column(name = "DT_SXRQ3", length = 7)
	public Date getDtSxrq3() {
		return this.dtSxrq3;
	}

	public void setDtSxrq3(Date dtSxrq3) {
		this.dtSxrq3 = dtSxrq3;
	}

	@Column(name = "I_YWGM", precision = 22, scale = 0)
	public Integer getIYwgm() {
		return this.IYwgm;
	}

	public void setIYwgm(Integer IYwgm) {
		this.IYwgm = IYwgm;
	}

	@Column(name = "I_YWQMS", precision = 22, scale = 0)
	public Integer getIYwqms() {
		return this.IYwqms;
	}

	public void setIYwqms(Integer IYwqms) {
		this.IYwqms = IYwqms;
	}

	@Column(name = "I_YWHA", precision = 22, scale = 0)
	public Integer getIYwha() {
		return this.IYwha;
	}

	public void setIYwha(Integer IYwha) {
		this.IYwha = IYwha;
	}

	@Column(name = "I_YWLMS", precision = 22, scale = 0)
	public Integer getIYwlms() {
		return this.IYwlms;
	}

	public void setIYwlms(Integer IYwlms) {
		this.IYwlms = IYwlms;
	}

	@Column(name = "I_QTGM", precision = 22, scale = 0)
	public Integer getIQtgm() {
		return this.IQtgm;
	}

	public void setIQtgm(Integer IQtgm) {
		this.IQtgm = IQtgm;
	}

	@Column(name = "V_QTGM", length = 50)
	public String getVQtgm() {
		return this.VQtgm;
	}

	public void setVQtgm(String VQtgm) {
		this.VQtgm = VQtgm;
	}

	@Column(name = "I_YWCJ", precision = 22, scale = 0)
	public Integer getIYwcj() {
		return this.IYwcj;
	}

	public void setIYwcj(Integer IYwcj) {
		this.IYwcj = IYwcj;
	}

	@Column(name = "I_SLCJ", precision = 22, scale = 0)
	public Integer getISlcj() {
		return this.ISlcj;
	}

	public void setISlcj(Integer ISlcj) {
		this.ISlcj = ISlcj;
	}

	@Column(name = "I_TLCJ", precision = 22, scale = 0)
	public Integer getITlcj() {
		return this.ITlcj;
	}

	public void setITlcj(Integer ITlcj) {
		this.ITlcj = ITlcj;
	}

	@Column(name = "I_YYCJ", precision = 22, scale = 0)
	public Integer getIYycj() {
		return this.IYycj;
	}

	public void setIYycj(Integer IYycj) {
		this.IYycj = IYycj;
	}

	@Column(name = "I_ZTCJ", precision = 22, scale = 0)
	public Integer getIZtcj() {
		return this.IZtcj;
	}

	public void setIZtcj(Integer IZtcj) {
		this.IZtcj = IZtcj;
	}

	@Column(name = "I_ZLCJ", precision = 22, scale = 0)
	public Integer getIZlcj() {
		return this.IZlcj;
	}

	public void setIZlcj(Integer IZlcj) {
		this.IZlcj = IZlcj;
	}

	@Column(name = "I_JSCJ", precision = 22, scale = 0)
	public Integer getIJscj() {
		return this.IJscj;
	}

	public void setIJscj(Integer IJscj) {
		this.IJscj = IJscj;
	}

	@Column(name = "I_QTCJ", precision = 22, scale = 0)
	public Integer getIQtcj() {
		return this.IQtcj;
	}

	public void setIQtcj(Integer IQtcj) {
		this.IQtcj = IQtcj;
	}

	@Column(name = "V_QTCJ", length = 100)
	public String getVQtcj() {
		return this.VQtcj;
	}

	public void setVQtcj(String VQtcj) {
		this.VQtcj = VQtcj;
	}

	@Column(name = "I_XXYX", precision = 22, scale = 0)
	public Integer getIXxyx() {
		return this.IXxyx;
	}

	public void setIXxyx(Integer IXxyx) {
		this.IXxyx = IXxyx;
	}

	@Column(name = "V_ZHXGR", length = 10)
	public String getVZhxgr() {
		return this.VZhxgr;
	}

	public void setVZhxgr(String VZhxgr) {
		this.VZhxgr = VZhxgr;
	}

	@Column(name = "DT_ZHXGRQ", length = 7)
	public Date getDtZhxgrq() {
		return this.dtZhxgrq;
	}

	public void setDtZhxgrq(Date dtZhxgrq) {
		this.dtZhxgrq = dtZhxgrq;
	}

	@Column(name = "I_XGBZ", precision = 22, scale = 0)
	public Integer getIXgbz() {
		return this.IXgbz;
	}

	public void setIXgbz(Integer IXgbz) {
		this.IXgbz = IXgbz;
	}

	@Column(name = "I_JLBZ", precision = 22, scale = 0)
	public Integer getIJlbz() {
		return this.IJlbz;
	}

	public void setIJlbz(Integer IJlbz) {
		this.IJlbz = IJlbz;
	}

	@Column(name = "I_CSBZ", precision = 22, scale = 0)
	public Integer getICsbz() {
		return this.ICsbz;
	}

	public void setICsbz(Integer ICsbz) {
		this.ICsbz = ICsbz;
	}

	@Column(name = "I_ZT2", precision = 22, scale = 0)
	public Integer getIZt2() {
		return this.IZt2;
	}

	public void setIZt2(Integer IZt2) {
		this.IZt2 = IZt2;
	}

	@Column(name = "I_ZCDYY2", precision = 22, scale = 0)
	public Integer getIZcdyy2() {
		return this.IZcdyy2;
	}

	public void setIZcdyy2(Integer IZcdyy2) {
		this.IZcdyy2 = IZcdyy2;
	}

	@Column(name = "DEP_NAME")
	public String getDepName() {
		return this.depName;
	}

	public void setDepName(String depName) {
		this.depName = depName;
	}

	@Column(name = "V_GRSDBH", length = 25)
	public String getVGrsdbh() {
		return this.VGrsdbh;
	}

	public void setVGrsdbh(String VGrsdbh) {
		this.VGrsdbh = VGrsdbh;
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

	@Column(name = "DT_CREATE", length = 7)
	public Date getDtCreate() {
		return this.dtCreate;
	}

	public void setDtCreate(Date dtCreate) {
		this.dtCreate = dtCreate;
	}

	@Column(name = "I_YWBLS", precision = 4, scale = 0)
	public Short getIYwbls() {
		return this.IYwbls;
	}

	public void setIYwbls(Short IYwbls) {
		this.IYwbls = IYwbls;
	}

	@Column(name = "I_BLS", precision = 10, scale = 0)
	public Long getIBls() {
		return this.IBls;
	}

	public void setIBls(Long IBls) {
		this.IBls = IBls;
	}

	@Column(name = "I_CFPF", precision = 4, scale = 0)
	public Short getICfpf() {
		return this.ICfpf;
	}

	public void setICfpf(Short ICfpf) {
		this.ICfpf = ICfpf;
	}

	@Column(name = "I_RLLX", precision = 4, scale = 0)
	public Short getIRllx() {
		return this.IRllx;
	}

	public void setIRllx(Short IRllx) {
		this.IRllx = IRllx;
	}

	@Column(name = "I_YS", precision = 4, scale = 0)
	public Short getIYs() {
		return this.IYs;
	}

	public void setIYs(Short IYs) {
		this.IYs = IYs;
	}

	@Column(name = "I_CS", precision = 4, scale = 0)
	public Short getICs() {
		return this.ICs;
	}

	public void setICs(Short ICs) {
		this.ICs = ICs;
	}

	@Column(name = "I_QCL", precision = 4, scale = 0)
	public Short getIQcl() {
		return this.IQcl;
	}

	public void setIQcl(Short IQcl) {
		this.IQcl = IQcl;
	}

	@Column(name = "C_CZYBH", length = 100)
	public String getCCzybh() {
		return this.CCzybh;
	}

	public void setCCzybh(String CCzybh) {
		this.CCzybh = CCzybh;
	}

	@Column(name = "C_SZJDH", length = 100)
	public String getCSzjdh() {
		return this.CSzjdh;
	}

	public void setCSzjdh(String CSzjdh) {
		this.CSzjdh = CSzjdh;
	}

	@Column(name = "I_ET", precision = 4, scale = 0)
	public Short getIEt() {
		return this.IEt;
	}

	public void setIEt(Short IEt) {
		this.IEt = IEt;
	}

	@Column(name = "DT_TURN_ET", length = 7)
	public Date getDtTurnEt() {
		return this.dtTurnEt;
	}

	public void setDtTurnEt(Date dtTurnEt) {
		this.dtTurnEt = dtTurnEt;
	}

	@Column(name = "DT_REVOKE_ET", length = 7)
	public Date getDtRevokeEt() {
		return this.dtRevokeEt;
	}

	public void setDtRevokeEt(Date dtRevokeEt) {
		this.dtRevokeEt = dtRevokeEt;
	}

	@Column(name = "I_LR", precision = 4, scale = 0)
	public Short getILr() {
		return this.ILr;
	}

	public void setILr(Short ILr) {
		this.ILr = ILr;
	}

	@Column(name = "DT_TURN_LR", length = 7)
	public Date getDtTurnLr() {
		return this.dtTurnLr;
	}

	public void setDtTurnLr(Date dtTurnLr) {
		this.dtTurnLr = dtTurnLr;
	}

	@Column(name = "DT_REVOKE_LR", length = 7)
	public Date getDtRevokeLr() {
		return this.dtRevokeLr;
	}

	public void setDtRevokeLr(Date dtRevokeLr) {
		this.dtRevokeLr = dtRevokeLr;
	}

	@Column(name = "I_YCF", precision = 4, scale = 0)
	public Short getIYcf() {
		return this.IYcf;
	}

	public void setIYcf(Short IYcf) {
		this.IYcf = IYcf;
	}

	@Column(name = "DT_TURN_YCF", length = 7)
	public Date getDtTurnYcf() {
		return this.dtTurnYcf;
	}

	public void setDtTurnYcf(Date dtTurnYcf) {
		this.dtTurnYcf = dtTurnYcf;
	}

	@Column(name = "DT_REVOKE_YCF", length = 7)
	public Date getDtRevokeYcf() {
		return this.dtRevokeYcf;
	}

	public void setDtRevokeYcf(Date dtRevokeYcf) {
		this.dtRevokeYcf = dtRevokeYcf;
	}

	@Column(name = "V_JTLX", length = 100)
	public String getVJtlx() {
		return this.VJtlx;
	}

	public void setVJtlx(String VJtlx) {
		this.VJtlx = VJtlx;
	}

	@Column(name = "I_QYZT", precision = 22, scale = 0)
	public Integer getIQyzt() {
		return this.IQyzt;
	}

	public void setIQyzt(Integer IQyzt) {
		this.IQyzt = IQyzt;
	}

	@Column(name = "I_JBLB31", precision = 22, scale = 0)
	public Integer getIJblb31() {
		return this.IJblb31;
	}

	public void setIJblb31(Integer IJblb31) {
		this.IJblb31 = IJblb31;
	}

	@Column(name = "DT_QZRQ31", length = 7)
	public Date getDtQzrq31() {
		return this.dtQzrq31;
	}

	public void setDtQzrq31(Date dtQzrq31) {
		this.dtQzrq31 = dtQzrq31;
	}

	@Column(name = "I_PKZT", precision = 22, scale = 0)
	public Integer getIPkzt() {
		return this.IPkzt;
	}

	public void setIPkzt(Integer IPkzt) {
		this.IPkzt = IPkzt;
	}

	@Column(name = "DT_FWRQ", length = 7)
	public Date getIFwjd() {
		return this.dtFwrq;
	}

	public void setIFwjd(Date dtFwrq) {
		this.dtFwrq = dtFwrq;
	}

	@Column(name = "V_PGNF", length = 20)
	public String getVPgnf() {
		return this.VPgnf;
	}

	public void setVPgnf(String VPgnf) {
		this.VPgnf = VPgnf;
	}

}