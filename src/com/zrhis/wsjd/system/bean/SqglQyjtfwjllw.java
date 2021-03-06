package com.zrhis.wsjd.system.bean;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * SqglQyjtfwjllw entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "SQGL_QYJTFWJLLW", schema = "CXJM")
public class SqglQyjtfwjllw implements java.io.Serializable {

	// Fields

	private String VId;
	private String depId;
	private String depName;
	private String CJth;
	private String VYljgh;
	private String VYljgmc;
	private Date dtFwsj;
	private String VHzxm;
	private String VJtrenq;
	private String VJtrs;
	private String VJtdh;
	private String VJtzz;
	private Integer IFwzl1;
	private Integer IFwzl2;
	private Integer IFwzl3;
	private Integer IFwzl4;
	private Integer IFwzl5;
	private Integer IFwzl6;
	private Integer IFwzl7;
	private Integer IFwzl8;
	private Integer IFwzl9;
	private Integer IFwzl10;
	private Integer IFwzl11;
	private String VPxjl;
	private String VFwjl;
	private String VFwxj;
	private String VFwpg;
	private String VJsfwjm;
	private String VFwys;
	private String CCzybh;
	private Date dtCreate;
	private String VFwtp;
	private String VFwfs;
	private String VJsjmfwqm;
	private String VFwysqm;
	private Integer IPjzt;
	private Integer ISflx;
	private Integer IYstqjh;
	private Integer IYstd;
	private Integer IPjfs;
	private String VPjnr;
	private Date dtPjsj;
	private String CPjrgrbh;
	private String CUserbh;
	private String VZrys1;
	private String VYsdh1;
	private String VZz;
	private String VZrys2;
	private String VYsdh2;
	private String VXyd;
	private String VXyg;
	private String VXl;
	private String VFwnr;
	private String CGrbh;
	private String VYfc;
	private String VTdcy;
	private String VZzdh;
	private Integer IXb;
	private String VNl;
	private String VLxdh;
	private Integer IZyjkw;
	private Integer IZygxy;
	private Integer IZytnb;
	private Integer IZyxzb;
	private Integer IZyztza;
	private Integer IZyqgy;
	private Integer IZyfjh;
	private Integer IZyjsb;
	private Integer IZyjkqt;
	private String VZyjkqt;
	private Integer INl;
	private Integer IXy;
	private String VXt;
	private Integer IXt;
	private Integer INyha;
	private Integer IKillip;
	private Integer IXz3;
	private Integer IZtzs;
	private Integer IZtzx;
	private Integer IZtys;
	private Integer IZtyx;
	private String VJzl;
	private Integer IJzl;
	private Integer ITtp;
	private String VWxxfj;
	private Integer IBlxg1;
	private Integer IBlxg2;
	private Integer IBlxg3;
	private Integer IBlxg4;
	private Integer IBlxgqt;
	private String VBlxgqt;
	private Integer ITydl;
	private Integer IYl;
	private Integer IXg;
	private String VXgqt;
	private Integer IYcw;
	private Integer IYcgxy;
	private Integer IYctnb;
	private Integer IYcqt;
	private String VYcqt;
	private Integer ITz;
	private Integer IGxy;
	private String VRxy;
	private String VYl;
	private Integer IYj;
	private String VYj;
	private Integer IJynr1;
	private Integer IJynr2;
	private Integer IJynr3;
	private Integer IJynr4;
	private Integer IJynr5;
	private Integer IJynr6;
	private Integer IJynr7;
	private Integer IJynr8;
	private Integer IJynr9;
	private Integer IJynr10;
	private Integer IJynr11;
	private Integer IXgpg1;
	private Integer IXgpg2;
	private Integer IXgpg3;
	private Integer IXgpg4;
	private Integer IXgpg5;
	private Integer IXgpg6;
	private Integer IXgpgqt;
	private String VXgpgqt;
	private String VYsqm;
	private Date dtJlsj;
	private String VTddh;
	private Integer ISfpg;

	// Constructors

	/** default constructor */
	public SqglQyjtfwjllw() {
	}

	/** minimal constructor */
	public SqglQyjtfwjllw(String VId) {
		this.VId = VId;
	}

	/** full constructor */
	public SqglQyjtfwjllw(String VId, String depId, String depName,
			String CJth, String VYljgh, String VYljgmc, Date dtFwsj,
			String VHzxm, String VJtrenq, String VJtrs, String VJtdh,
			String VJtzz, Integer IFwzl1, Integer IFwzl2,
			Integer IFwzl3, Integer IFwzl4, Integer IFwzl5,
			Integer IFwzl6, Integer IFwzl7, Integer IFwzl8,
			Integer IFwzl9, Integer IFwzl10, Integer IFwzl11,
			String VPxjl, String VFwjl, String VFwxj, String VFwpg,
			String VJsfwjm, String VFwys, String CCzybh, Date dtCreate,
			String VFwtp, String VFwfs, String VJsjmfwqm, String VFwysqm,
			Integer IPjzt, Integer ISflx, Integer IYstqjh,
			Integer IYstd, Integer IPjfs, String VPjnr, Date dtPjsj,
			String CPjrgrbh, String CUserbh, String VZrys1, String VYsdh1,
			String VZz, String VZrys2, String VYsdh2, String VXyd, String VXyg,
			String VXl, String VFwnr, String CGrbh, String VYfc, String VTdcy,
			String VZzdh, Integer IXb, String VNl, String VLxdh,
			Integer IZyjkw, Integer IZygxy, Integer IZytnb,
			Integer IZyxzb, Integer IZyztza, Integer IZyqgy,
			Integer IZyfjh, Integer IZyjsb, Integer IZyjkqt,
			String VZyjkqt, Integer INl, Integer IXy, String VXt,
			Integer IXt, Integer INyha, Integer IKillip,
			Integer IXz3, Integer IZtzs, Integer IZtzx,
			Integer IZtys, Integer IZtyx, String VJzl, Integer IJzl,
			Integer ITtp, String VWxxfj, Integer IBlxg1,
			Integer IBlxg2, Integer IBlxg3, Integer IBlxg4,
			Integer IBlxgqt, String VBlxgqt, Integer ITydl,
			Integer IYl, Integer IXg, String VXgqt, Integer IYcw,
			Integer IYcgxy, Integer IYctnb, Integer IYcqt,
			String VYcqt, Integer ITz, Integer IGxy, String VRxy,
			String VYl, Integer IYj, String VYj, Integer IJynr1,
			Integer IJynr2, Integer IJynr3, Integer IJynr4,
			Integer IJynr5, Integer IJynr6, Integer IJynr7,
			Integer IJynr8, Integer IJynr9, Integer IJynr10,
			Integer IJynr11, Integer IXgpg1, Integer IXgpg2,
			Integer IXgpg3, Integer IXgpg4, Integer IXgpg5,
			Integer IXgpg6, Integer IXgpgqt, String VXgpgqt,
			String VYsqm, Date dtJlsj, String VTddh, Integer ISfpg) {
		this.VId = VId;
		this.depId = depId;
		this.depName = depName;
		this.CJth = CJth;
		this.VYljgh = VYljgh;
		this.VYljgmc = VYljgmc;
		this.dtFwsj = dtFwsj;
		this.VHzxm = VHzxm;
		this.VJtrenq = VJtrenq;
		this.VJtrs = VJtrs;
		this.VJtdh = VJtdh;
		this.VJtzz = VJtzz;
		this.IFwzl1 = IFwzl1;
		this.IFwzl2 = IFwzl2;
		this.IFwzl3 = IFwzl3;
		this.IFwzl4 = IFwzl4;
		this.IFwzl5 = IFwzl5;
		this.IFwzl6 = IFwzl6;
		this.IFwzl7 = IFwzl7;
		this.IFwzl8 = IFwzl8;
		this.IFwzl9 = IFwzl9;
		this.IFwzl10 = IFwzl10;
		this.IFwzl11 = IFwzl11;
		this.VPxjl = VPxjl;
		this.VFwjl = VFwjl;
		this.VFwxj = VFwxj;
		this.VFwpg = VFwpg;
		this.VJsfwjm = VJsfwjm;
		this.VFwys = VFwys;
		this.CCzybh = CCzybh;
		this.dtCreate = dtCreate;
		this.VFwtp = VFwtp;
		this.VFwfs = VFwfs;
		this.VJsjmfwqm = VJsjmfwqm;
		this.VFwysqm = VFwysqm;
		this.IPjzt = IPjzt;
		this.ISflx = ISflx;
		this.IYstqjh = IYstqjh;
		this.IYstd = IYstd;
		this.IPjfs = IPjfs;
		this.VPjnr = VPjnr;
		this.dtPjsj = dtPjsj;
		this.CPjrgrbh = CPjrgrbh;
		this.CUserbh = CUserbh;
		this.VZrys1 = VZrys1;
		this.VYsdh1 = VYsdh1;
		this.VZz = VZz;
		this.VZrys2 = VZrys2;
		this.VYsdh2 = VYsdh2;
		this.VXyd = VXyd;
		this.VXyg = VXyg;
		this.VXl = VXl;
		this.VFwnr = VFwnr;
		this.CGrbh = CGrbh;
		this.VYfc = VYfc;
		this.VTdcy = VTdcy;
		this.VZzdh = VZzdh;
		this.IXb = IXb;
		this.VNl = VNl;
		this.VLxdh = VLxdh;
		this.IZyjkw = IZyjkw;
		this.IZygxy = IZygxy;
		this.IZytnb = IZytnb;
		this.IZyxzb = IZyxzb;
		this.IZyztza = IZyztza;
		this.IZyqgy = IZyqgy;
		this.IZyfjh = IZyfjh;
		this.IZyjsb = IZyjsb;
		this.IZyjkqt = IZyjkqt;
		this.VZyjkqt = VZyjkqt;
		this.INl = INl;
		this.IXy = IXy;
		this.VXt = VXt;
		this.IXt = IXt;
		this.INyha = INyha;
		this.IKillip = IKillip;
		this.IXz3 = IXz3;
		this.IZtzs = IZtzs;
		this.IZtzx = IZtzx;
		this.IZtys = IZtys;
		this.IZtyx = IZtyx;
		this.VJzl = VJzl;
		this.IJzl = IJzl;
		this.ITtp = ITtp;
		this.VWxxfj = VWxxfj;
		this.IBlxg1 = IBlxg1;
		this.IBlxg2 = IBlxg2;
		this.IBlxg3 = IBlxg3;
		this.IBlxg4 = IBlxg4;
		this.IBlxgqt = IBlxgqt;
		this.VBlxgqt = VBlxgqt;
		this.ITydl = ITydl;
		this.IYl = IYl;
		this.IXg = IXg;
		this.VXgqt = VXgqt;
		this.IYcw = IYcw;
		this.IYcgxy = IYcgxy;
		this.IYctnb = IYctnb;
		this.IYcqt = IYcqt;
		this.VYcqt = VYcqt;
		this.ITz = ITz;
		this.IGxy = IGxy;
		this.VRxy = VRxy;
		this.VYl = VYl;
		this.IYj = IYj;
		this.VYj = VYj;
		this.IJynr1 = IJynr1;
		this.IJynr2 = IJynr2;
		this.IJynr3 = IJynr3;
		this.IJynr4 = IJynr4;
		this.IJynr5 = IJynr5;
		this.IJynr6 = IJynr6;
		this.IJynr7 = IJynr7;
		this.IJynr8 = IJynr8;
		this.IJynr9 = IJynr9;
		this.IJynr10 = IJynr10;
		this.IJynr11 = IJynr11;
		this.IXgpg1 = IXgpg1;
		this.IXgpg2 = IXgpg2;
		this.IXgpg3 = IXgpg3;
		this.IXgpg4 = IXgpg4;
		this.IXgpg5 = IXgpg5;
		this.IXgpg6 = IXgpg6;
		this.IXgpgqt = IXgpgqt;
		this.VXgpgqt = VXgpgqt;
		this.VYsqm = VYsqm;
		this.dtJlsj = dtJlsj;
		this.VTddh = VTddh;
		this.ISfpg = ISfpg;
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

	@Column(name = "C_JTH", length = 20)
	public String getCJth() {
		return this.CJth;
	}

	public void setCJth(String CJth) {
		this.CJth = CJth;
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

	@Column(name = "DT_FWSJ", length = 7)
	public Date getDtFwsj() {
		return this.dtFwsj;
	}

	public void setDtFwsj(Date dtFwsj) {
		this.dtFwsj = dtFwsj;
	}

	@Column(name = "V_HZXM", length = 100)
	public String getVHzxm() {
		return this.VHzxm;
	}

	public void setVHzxm(String VHzxm) {
		this.VHzxm = VHzxm;
	}

	@Column(name = "V_JTRENQ", length = 100)
	public String getVJtrenq() {
		return this.VJtrenq;
	}

	public void setVJtrenq(String VJtrenq) {
		this.VJtrenq = VJtrenq;
	}

	@Column(name = "V_JTRS", length = 100)
	public String getVJtrs() {
		return this.VJtrs;
	}

	public void setVJtrs(String VJtrs) {
		this.VJtrs = VJtrs;
	}

	@Column(name = "V_JTDH", length = 100)
	public String getVJtdh() {
		return this.VJtdh;
	}

	public void setVJtdh(String VJtdh) {
		this.VJtdh = VJtdh;
	}

	@Column(name = "V_JTZZ", length = 200)
	public String getVJtzz() {
		return this.VJtzz;
	}

	public void setVJtzz(String VJtzz) {
		this.VJtzz = VJtzz;
	}

	@Column(name = "I_FWZL1", precision = 22, scale = 0)
	public Integer getIFwzl1() {
		return this.IFwzl1;
	}

	public void setIFwzl1(Integer IFwzl1) {
		this.IFwzl1 = IFwzl1;
	}

	@Column(name = "I_FWZL2", precision = 22, scale = 0)
	public Integer getIFwzl2() {
		return this.IFwzl2;
	}

	public void setIFwzl2(Integer IFwzl2) {
		this.IFwzl2 = IFwzl2;
	}

	@Column(name = "I_FWZL3", precision = 22, scale = 0)
	public Integer getIFwzl3() {
		return this.IFwzl3;
	}

	public void setIFwzl3(Integer IFwzl3) {
		this.IFwzl3 = IFwzl3;
	}

	@Column(name = "I_FWZL4", precision = 22, scale = 0)
	public Integer getIFwzl4() {
		return this.IFwzl4;
	}

	public void setIFwzl4(Integer IFwzl4) {
		this.IFwzl4 = IFwzl4;
	}

	@Column(name = "I_FWZL5", precision = 22, scale = 0)
	public Integer getIFwzl5() {
		return this.IFwzl5;
	}

	public void setIFwzl5(Integer IFwzl5) {
		this.IFwzl5 = IFwzl5;
	}

	@Column(name = "I_FWZL6", precision = 22, scale = 0)
	public Integer getIFwzl6() {
		return this.IFwzl6;
	}

	public void setIFwzl6(Integer IFwzl6) {
		this.IFwzl6 = IFwzl6;
	}

	@Column(name = "I_FWZL7", precision = 22, scale = 0)
	public Integer getIFwzl7() {
		return this.IFwzl7;
	}

	public void setIFwzl7(Integer IFwzl7) {
		this.IFwzl7 = IFwzl7;
	}

	@Column(name = "I_FWZL8", precision = 22, scale = 0)
	public Integer getIFwzl8() {
		return this.IFwzl8;
	}

	public void setIFwzl8(Integer IFwzl8) {
		this.IFwzl8 = IFwzl8;
	}

	@Column(name = "I_FWZL9", precision = 22, scale = 0)
	public Integer getIFwzl9() {
		return this.IFwzl9;
	}

	public void setIFwzl9(Integer IFwzl9) {
		this.IFwzl9 = IFwzl9;
	}

	@Column(name = "I_FWZL10", precision = 22, scale = 0)
	public Integer getIFwzl10() {
		return this.IFwzl10;
	}

	public void setIFwzl10(Integer IFwzl10) {
		this.IFwzl10 = IFwzl10;
	}

	@Column(name = "I_FWZL11", precision = 22, scale = 0)
	public Integer getIFwzl11() {
		return this.IFwzl11;
	}

	public void setIFwzl11(Integer IFwzl11) {
		this.IFwzl11 = IFwzl11;
	}

	@Column(name = "V_PXJL", length = 500)
	public String getVPxjl() {
		return this.VPxjl;
	}

	public void setVPxjl(String VPxjl) {
		this.VPxjl = VPxjl;
	}

	@Column(name = "V_FWJL", length = 500)
	public String getVFwjl() {
		return this.VFwjl;
	}

	public void setVFwjl(String VFwjl) {
		this.VFwjl = VFwjl;
	}

	@Column(name = "V_FWXJ", length = 500)
	public String getVFwxj() {
		return this.VFwxj;
	}

	public void setVFwxj(String VFwxj) {
		this.VFwxj = VFwxj;
	}

	@Column(name = "V_FWPG", length = 500)
	public String getVFwpg() {
		return this.VFwpg;
	}

	public void setVFwpg(String VFwpg) {
		this.VFwpg = VFwpg;
	}

	@Column(name = "V_JSFWJM", length = 100)
	public String getVJsfwjm() {
		return this.VJsfwjm;
	}

	public void setVJsfwjm(String VJsfwjm) {
		this.VJsfwjm = VJsfwjm;
	}

	@Column(name = "V_FWYS", length = 100)
	public String getVFwys() {
		return this.VFwys;
	}

	public void setVFwys(String VFwys) {
		this.VFwys = VFwys;
	}

	@Column(name = "C_CZYBH", length = 100)
	public String getCCzybh() {
		return this.CCzybh;
	}

	public void setCCzybh(String CCzybh) {
		this.CCzybh = CCzybh;
	}

	@Column(name = "DT_CREATE", length = 7)
	public Date getDtCreate() {
		return this.dtCreate;
	}

	public void setDtCreate(Date dtCreate) {
		this.dtCreate = dtCreate;
	}

	@Column(name = "V_FWTP")
	public String getVFwtp() {
		return this.VFwtp;
	}

	public void setVFwtp(String VFwtp) {
		this.VFwtp = VFwtp;
	}

	@Column(name = "V_FWFS", length = 100)
	public String getVFwfs() {
		return this.VFwfs;
	}

	public void setVFwfs(String VFwfs) {
		this.VFwfs = VFwfs;
	}

	@Column(name = "V_JSJMFWQM")
	public String getVJsjmfwqm() {
		return this.VJsjmfwqm;
	}

	public void setVJsjmfwqm(String VJsjmfwqm) {
		this.VJsjmfwqm = VJsjmfwqm;
	}

	@Column(name = "V_FWYSQM")
	public String getVFwysqm() {
		return this.VFwysqm;
	}

	public void setVFwysqm(String VFwysqm) {
		this.VFwysqm = VFwysqm;
	}

	@Column(name = "I_PJZT", precision = 22, scale = 0)
	public Integer getIPjzt() {
		return this.IPjzt;
	}

	public void setIPjzt(Integer IPjzt) {
		this.IPjzt = IPjzt;
	}

	@Column(name = "I_SFLX", precision = 22, scale = 0)
	public Integer getISflx() {
		return this.ISflx;
	}

	public void setISflx(Integer ISflx) {
		this.ISflx = ISflx;
	}

	@Column(name = "I_YSTQJH", precision = 22, scale = 0)
	public Integer getIYstqjh() {
		return this.IYstqjh;
	}

	public void setIYstqjh(Integer IYstqjh) {
		this.IYstqjh = IYstqjh;
	}

	@Column(name = "I_YSTD", precision = 22, scale = 0)
	public Integer getIYstd() {
		return this.IYstd;
	}

	public void setIYstd(Integer IYstd) {
		this.IYstd = IYstd;
	}

	@Column(name = "I_PJFS", precision = 22, scale = 0)
	public Integer getIPjfs() {
		return this.IPjfs;
	}

	public void setIPjfs(Integer IPjfs) {
		this.IPjfs = IPjfs;
	}

	@Column(name = "V_PJNR", length = 350)
	public String getVPjnr() {
		return this.VPjnr;
	}

	public void setVPjnr(String VPjnr) {
		this.VPjnr = VPjnr;
	}

	@Column(name = "DT_PJSJ", length = 7)
	public Date getDtPjsj() {
		return this.dtPjsj;
	}

	public void setDtPjsj(Date dtPjsj) {
		this.dtPjsj = dtPjsj;
	}

	@Column(name = "C_PJRGRBH", length = 100)
	public String getCPjrgrbh() {
		return this.CPjrgrbh;
	}

	public void setCPjrgrbh(String CPjrgrbh) {
		this.CPjrgrbh = CPjrgrbh;
	}

	@Column(name = "C_USERBH", length = 50)
	public String getCUserbh() {
		return this.CUserbh;
	}

	public void setCUserbh(String CUserbh) {
		this.CUserbh = CUserbh;
	}

	@Column(name = "V_ZRYS1", length = 50)
	public String getVZrys1() {
		return this.VZrys1;
	}

	public void setVZrys1(String VZrys1) {
		this.VZrys1 = VZrys1;
	}

	@Column(name = "V_YSDH1", length = 50)
	public String getVYsdh1() {
		return this.VYsdh1;
	}

	public void setVYsdh1(String VYsdh1) {
		this.VYsdh1 = VYsdh1;
	}

	@Column(name = "V_ZZ", length = 50)
	public String getVZz() {
		return this.VZz;
	}

	public void setVZz(String VZz) {
		this.VZz = VZz;
	}

	@Column(name = "V_ZRYS2", length = 50)
	public String getVZrys2() {
		return this.VZrys2;
	}

	public void setVZrys2(String VZrys2) {
		this.VZrys2 = VZrys2;
	}

	@Column(name = "V_YSDH2", length = 50)
	public String getVYsdh2() {
		return this.VYsdh2;
	}

	public void setVYsdh2(String VYsdh2) {
		this.VYsdh2 = VYsdh2;
	}

	@Column(name = "V_XYD", length = 50)
	public String getVXyd() {
		return this.VXyd;
	}

	public void setVXyd(String VXyd) {
		this.VXyd = VXyd;
	}

	@Column(name = "V_XYG", length = 50)
	public String getVXyg() {
		return this.VXyg;
	}

	public void setVXyg(String VXyg) {
		this.VXyg = VXyg;
	}

	@Column(name = "V_XL", length = 50)
	public String getVXl() {
		return this.VXl;
	}

	public void setVXl(String VXl) {
		this.VXl = VXl;
	}

	@Column(name = "V_FWNR", length = 200)
	public String getVFwnr() {
		return this.VFwnr;
	}

	public void setVFwnr(String VFwnr) {
		this.VFwnr = VFwnr;
	}

	@Column(name = "C_GRBH", length = 50)
	public String getCGrbh() {
		return this.CGrbh;
	}

	public void setCGrbh(String CGrbh) {
		this.CGrbh = CGrbh;
	}

	@Column(name = "V_YFC", length = 50)
	public String getVYfc() {
		return this.VYfc;
	}

	public void setVYfc(String VYfc) {
		this.VYfc = VYfc;
	}

	@Column(name = "V_TDCY")
	public String getVTdcy() {
		return this.VTdcy;
	}

	public void setVTdcy(String VTdcy) {
		this.VTdcy = VTdcy;
	}

	@Column(name = "V_ZZDH", length = 50)
	public String getVZzdh() {
		return this.VZzdh;
	}

	public void setVZzdh(String VZzdh) {
		this.VZzdh = VZzdh;
	}

	@Column(name = "I_XB", precision = 22, scale = 0)
	public Integer getIXb() {
		return this.IXb;
	}

	public void setIXb(Integer IXb) {
		this.IXb = IXb;
	}

	@Column(name = "V_NL", length = 50)
	public String getVNl() {
		return this.VNl;
	}

	public void setVNl(String VNl) {
		this.VNl = VNl;
	}

	@Column(name = "V_LXDH", length = 50)
	public String getVLxdh() {
		return this.VLxdh;
	}

	public void setVLxdh(String VLxdh) {
		this.VLxdh = VLxdh;
	}

	@Column(name = "I_ZYJKW", precision = 22, scale = 0)
	public Integer getIZyjkw() {
		return this.IZyjkw;
	}

	public void setIZyjkw(Integer IZyjkw) {
		this.IZyjkw = IZyjkw;
	}

	@Column(name = "I_ZYGXY", precision = 22, scale = 0)
	public Integer getIZygxy() {
		return this.IZygxy;
	}

	public void setIZygxy(Integer IZygxy) {
		this.IZygxy = IZygxy;
	}

	@Column(name = "I_ZYTNB", precision = 22, scale = 0)
	public Integer getIZytnb() {
		return this.IZytnb;
	}

	public void setIZytnb(Integer IZytnb) {
		this.IZytnb = IZytnb;
	}

	@Column(name = "I_ZYXZB", precision = 22, scale = 0)
	public Integer getIZyxzb() {
		return this.IZyxzb;
	}

	public void setIZyxzb(Integer IZyxzb) {
		this.IZyxzb = IZyxzb;
	}

	@Column(name = "I_ZYZTZA", precision = 22, scale = 0)
	public Integer getIZyztza() {
		return this.IZyztza;
	}

	public void setIZyztza(Integer IZyztza) {
		this.IZyztza = IZyztza;
	}

	@Column(name = "I_ZYQGY", precision = 22, scale = 0)
	public Integer getIZyqgy() {
		return this.IZyqgy;
	}

	public void setIZyqgy(Integer IZyqgy) {
		this.IZyqgy = IZyqgy;
	}

	@Column(name = "I_ZYFJH", precision = 22, scale = 0)
	public Integer getIZyfjh() {
		return this.IZyfjh;
	}

	public void setIZyfjh(Integer IZyfjh) {
		this.IZyfjh = IZyfjh;
	}

	@Column(name = "I_ZYJSB", precision = 22, scale = 0)
	public Integer getIZyjsb() {
		return this.IZyjsb;
	}

	public void setIZyjsb(Integer IZyjsb) {
		this.IZyjsb = IZyjsb;
	}

	@Column(name = "I_ZYJKQT", precision = 22, scale = 0)
	public Integer getIZyjkqt() {
		return this.IZyjkqt;
	}

	public void setIZyjkqt(Integer IZyjkqt) {
		this.IZyjkqt = IZyjkqt;
	}

	@Column(name = "V_ZYJKQT", length = 100)
	public String getVZyjkqt() {
		return this.VZyjkqt;
	}

	public void setVZyjkqt(String VZyjkqt) {
		this.VZyjkqt = VZyjkqt;
	}

	@Column(name = "I_NL", precision = 22, scale = 0)
	public Integer getINl() {
		return this.INl;
	}

	public void setINl(Integer INl) {
		this.INl = INl;
	}

	@Column(name = "I_XY", precision = 22, scale = 0)
	public Integer getIXy() {
		return this.IXy;
	}

	public void setIXy(Integer IXy) {
		this.IXy = IXy;
	}

	@Column(name = "V_XT", length = 20)
	public String getVXt() {
		return this.VXt;
	}

	public void setVXt(String VXt) {
		this.VXt = VXt;
	}

	@Column(name = "I_XT", precision = 22, scale = 0)
	public Integer getIXt() {
		return this.IXt;
	}

	public void setIXt(Integer IXt) {
		this.IXt = IXt;
	}

	@Column(name = "I_NYHA", precision = 22, scale = 0)
	public Integer getINyha() {
		return this.INyha;
	}

	public void setINyha(Integer INyha) {
		this.INyha = INyha;
	}

	@Column(name = "I_KILLIP", precision = 22, scale = 0)
	public Integer getIKillip() {
		return this.IKillip;
	}

	public void setIKillip(Integer IKillip) {
		this.IKillip = IKillip;
	}

	@Column(name = "I_XZ3", precision = 22, scale = 0)
	public Integer getIXz3() {
		return this.IXz3;
	}

	public void setIXz3(Integer IXz3) {
		this.IXz3 = IXz3;
	}

	@Column(name = "I_ZTZS", precision = 22, scale = 0)
	public Integer getIZtzs() {
		return this.IZtzs;
	}

	public void setIZtzs(Integer IZtzs) {
		this.IZtzs = IZtzs;
	}

	@Column(name = "I_ZTZX", precision = 22, scale = 0)
	public Integer getIZtzx() {
		return this.IZtzx;
	}

	public void setIZtzx(Integer IZtzx) {
		this.IZtzx = IZtzx;
	}

	@Column(name = "I_ZTYS", precision = 22, scale = 0)
	public Integer getIZtys() {
		return this.IZtys;
	}

	public void setIZtys(Integer IZtys) {
		this.IZtys = IZtys;
	}

	@Column(name = "I_ZTYX", precision = 22, scale = 0)
	public Integer getIZtyx() {
		return this.IZtyx;
	}

	public void setIZtyx(Integer IZtyx) {
		this.IZtyx = IZtyx;
	}

	@Column(name = "V_JZL", length = 20)
	public String getVJzl() {
		return this.VJzl;
	}

	public void setVJzl(String VJzl) {
		this.VJzl = VJzl;
	}

	@Column(name = "I_JZL", precision = 22, scale = 0)
	public Integer getIJzl() {
		return this.IJzl;
	}

	public void setIJzl(Integer IJzl) {
		this.IJzl = IJzl;
	}

	@Column(name = "I_TTP", precision = 22, scale = 0)
	public Integer getITtp() {
		return this.ITtp;
	}

	public void setITtp(Integer ITtp) {
		this.ITtp = ITtp;
	}

	@Column(name = "V_WXXFJ", length = 20)
	public String getVWxxfj() {
		return this.VWxxfj;
	}

	public void setVWxxfj(String VWxxfj) {
		this.VWxxfj = VWxxfj;
	}

	@Column(name = "I_BLXG1", precision = 22, scale = 0)
	public Integer getIBlxg1() {
		return this.IBlxg1;
	}

	public void setIBlxg1(Integer IBlxg1) {
		this.IBlxg1 = IBlxg1;
	}

	@Column(name = "I_BLXG2", precision = 22, scale = 0)
	public Integer getIBlxg2() {
		return this.IBlxg2;
	}

	public void setIBlxg2(Integer IBlxg2) {
		this.IBlxg2 = IBlxg2;
	}

	@Column(name = "I_BLXG3", precision = 22, scale = 0)
	public Integer getIBlxg3() {
		return this.IBlxg3;
	}

	public void setIBlxg3(Integer IBlxg3) {
		this.IBlxg3 = IBlxg3;
	}

	@Column(name = "I_BLXG4", precision = 22, scale = 0)
	public Integer getIBlxg4() {
		return this.IBlxg4;
	}

	public void setIBlxg4(Integer IBlxg4) {
		this.IBlxg4 = IBlxg4;
	}

	@Column(name = "I_BLXGQT", precision = 22, scale = 0)
	public Integer getIBlxgqt() {
		return this.IBlxgqt;
	}

	public void setIBlxgqt(Integer IBlxgqt) {
		this.IBlxgqt = IBlxgqt;
	}

	@Column(name = "V_BLXGQT", length = 100)
	public String getVBlxgqt() {
		return this.VBlxgqt;
	}

	public void setVBlxgqt(String VBlxgqt) {
		this.VBlxgqt = VBlxgqt;
	}

	@Column(name = "I_TYDL", precision = 22, scale = 0)
	public Integer getITydl() {
		return this.ITydl;
	}

	public void setITydl(Integer ITydl) {
		this.ITydl = ITydl;
	}

	@Column(name = "I_YL", precision = 22, scale = 0)
	public Integer getIYl() {
		return this.IYl;
	}

	public void setIYl(Integer IYl) {
		this.IYl = IYl;
	}

	@Column(name = "I_XG", precision = 22, scale = 0)
	public Integer getIXg() {
		return this.IXg;
	}

	public void setIXg(Integer IXg) {
		this.IXg = IXg;
	}

	@Column(name = "V_XGQT", length = 100)
	public String getVXgqt() {
		return this.VXgqt;
	}

	public void setVXgqt(String VXgqt) {
		this.VXgqt = VXgqt;
	}

	@Column(name = "I_YCW", precision = 22, scale = 0)
	public Integer getIYcw() {
		return this.IYcw;
	}

	public void setIYcw(Integer IYcw) {
		this.IYcw = IYcw;
	}

	@Column(name = "I_YCGXY", precision = 22, scale = 0)
	public Integer getIYcgxy() {
		return this.IYcgxy;
	}

	public void setIYcgxy(Integer IYcgxy) {
		this.IYcgxy = IYcgxy;
	}

	@Column(name = "I_YCTNB", precision = 22, scale = 0)
	public Integer getIYctnb() {
		return this.IYctnb;
	}

	public void setIYctnb(Integer IYctnb) {
		this.IYctnb = IYctnb;
	}

	@Column(name = "I_YCQT", precision = 22, scale = 0)
	public Integer getIYcqt() {
		return this.IYcqt;
	}

	public void setIYcqt(Integer IYcqt) {
		this.IYcqt = IYcqt;
	}

	@Column(name = "V_YCQT", length = 100)
	public String getVYcqt() {
		return this.VYcqt;
	}

	public void setVYcqt(String VYcqt) {
		this.VYcqt = VYcqt;
	}

	@Column(name = "I_TZ", precision = 22, scale = 0)
	public Integer getITz() {
		return this.ITz;
	}

	public void setITz(Integer ITz) {
		this.ITz = ITz;
	}

	@Column(name = "I_GXY", precision = 22, scale = 0)
	public Integer getIGxy() {
		return this.IGxy;
	}

	public void setIGxy(Integer IGxy) {
		this.IGxy = IGxy;
	}

	@Column(name = "V_RXY", length = 20)
	public String getVRxy() {
		return this.VRxy;
	}

	public void setVRxy(String VRxy) {
		this.VRxy = VRxy;
	}

	@Column(name = "V_YL", length = 20)
	public String getVYl() {
		return this.VYl;
	}

	public void setVYl(String VYl) {
		this.VYl = VYl;
	}

	@Column(name = "I_YJ", precision = 22, scale = 0)
	public Integer getIYj() {
		return this.IYj;
	}

	public void setIYj(Integer IYj) {
		this.IYj = IYj;
	}

	@Column(name = "V_YJ", length = 20)
	public String getVYj() {
		return this.VYj;
	}

	public void setVYj(String VYj) {
		this.VYj = VYj;
	}

	@Column(name = "I_JYNR1", precision = 22, scale = 0)
	public Integer getIJynr1() {
		return this.IJynr1;
	}

	public void setIJynr1(Integer IJynr1) {
		this.IJynr1 = IJynr1;
	}

	@Column(name = "I_JYNR2", precision = 22, scale = 0)
	public Integer getIJynr2() {
		return this.IJynr2;
	}

	public void setIJynr2(Integer IJynr2) {
		this.IJynr2 = IJynr2;
	}

	@Column(name = "I_JYNR3", precision = 22, scale = 0)
	public Integer getIJynr3() {
		return this.IJynr3;
	}

	public void setIJynr3(Integer IJynr3) {
		this.IJynr3 = IJynr3;
	}

	@Column(name = "I_JYNR4", precision = 22, scale = 0)
	public Integer getIJynr4() {
		return this.IJynr4;
	}

	public void setIJynr4(Integer IJynr4) {
		this.IJynr4 = IJynr4;
	}

	@Column(name = "I_JYNR5", precision = 22, scale = 0)
	public Integer getIJynr5() {
		return this.IJynr5;
	}

	public void setIJynr5(Integer IJynr5) {
		this.IJynr5 = IJynr5;
	}

	@Column(name = "I_JYNR6", precision = 22, scale = 0)
	public Integer getIJynr6() {
		return this.IJynr6;
	}

	public void setIJynr6(Integer IJynr6) {
		this.IJynr6 = IJynr6;
	}

	@Column(name = "I_JYNR7", precision = 22, scale = 0)
	public Integer getIJynr7() {
		return this.IJynr7;
	}

	public void setIJynr7(Integer IJynr7) {
		this.IJynr7 = IJynr7;
	}

	@Column(name = "I_JYNR8", precision = 22, scale = 0)
	public Integer getIJynr8() {
		return this.IJynr8;
	}

	public void setIJynr8(Integer IJynr8) {
		this.IJynr8 = IJynr8;
	}

	@Column(name = "I_JYNR9", precision = 22, scale = 0)
	public Integer getIJynr9() {
		return this.IJynr9;
	}

	public void setIJynr9(Integer IJynr9) {
		this.IJynr9 = IJynr9;
	}

	@Column(name = "I_JYNR10", precision = 22, scale = 0)
	public Integer getIJynr10() {
		return this.IJynr10;
	}

	public void setIJynr10(Integer IJynr10) {
		this.IJynr10 = IJynr10;
	}

	@Column(name = "I_JYNR11", precision = 22, scale = 0)
	public Integer getIJynr11() {
		return this.IJynr11;
	}

	public void setIJynr11(Integer IJynr11) {
		this.IJynr11 = IJynr11;
	}

	@Column(name = "I_XGPG1", precision = 22, scale = 0)
	public Integer getIXgpg1() {
		return this.IXgpg1;
	}

	public void setIXgpg1(Integer IXgpg1) {
		this.IXgpg1 = IXgpg1;
	}

	@Column(name = "I_XGPG2", precision = 22, scale = 0)
	public Integer getIXgpg2() {
		return this.IXgpg2;
	}

	public void setIXgpg2(Integer IXgpg2) {
		this.IXgpg2 = IXgpg2;
	}

	@Column(name = "I_XGPG3", precision = 22, scale = 0)
	public Integer getIXgpg3() {
		return this.IXgpg3;
	}

	public void setIXgpg3(Integer IXgpg3) {
		this.IXgpg3 = IXgpg3;
	}

	@Column(name = "I_XGPG4", precision = 22, scale = 0)
	public Integer getIXgpg4() {
		return this.IXgpg4;
	}

	public void setIXgpg4(Integer IXgpg4) {
		this.IXgpg4 = IXgpg4;
	}

	@Column(name = "I_XGPG5", precision = 22, scale = 0)
	public Integer getIXgpg5() {
		return this.IXgpg5;
	}

	public void setIXgpg5(Integer IXgpg5) {
		this.IXgpg5 = IXgpg5;
	}

	@Column(name = "I_XGPG6", precision = 22, scale = 0)
	public Integer getIXgpg6() {
		return this.IXgpg6;
	}

	public void setIXgpg6(Integer IXgpg6) {
		this.IXgpg6 = IXgpg6;
	}

	@Column(name = "I_XGPGQT", precision = 22, scale = 0)
	public Integer getIXgpgqt() {
		return this.IXgpgqt;
	}

	public void setIXgpgqt(Integer IXgpgqt) {
		this.IXgpgqt = IXgpgqt;
	}

	@Column(name = "V_XGPGQT", length = 100)
	public String getVXgpgqt() {
		return this.VXgpgqt;
	}

	public void setVXgpgqt(String VXgpgqt) {
		this.VXgpgqt = VXgpgqt;
	}

	@Column(name = "V_YSQM", length = 30)
	public String getVYsqm() {
		return this.VYsqm;
	}

	public void setVYsqm(String VYsqm) {
		this.VYsqm = VYsqm;
	}

	@Column(name = "DT_JLSJ", length = 7)
	public Date getDtJlsj() {
		return this.dtJlsj;
	}

	public void setDtJlsj(Date dtJlsj) {
		this.dtJlsj = dtJlsj;
	}

	@Column(name = "V_TDDH", length = 50)
	public String getVTddh() {
		return this.VTddh;
	}

	public void setVTddh(String VTddh) {
		this.VTddh = VTddh;
	}

	@Column(name = "I_SFPG", precision = 22, scale = 0)
	public Integer getISfpg() {
		return this.ISfpg;
	}

	public void setISfpg(Integer ISfpg) {
		this.ISfpg = ISfpg;
	}

}