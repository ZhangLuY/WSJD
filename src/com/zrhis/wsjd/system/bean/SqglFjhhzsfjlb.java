package com.zrhis.wsjd.system.bean;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * SqglFjhhzsfjlb entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "SQGL_FJHHZSFJLB", schema = "CXJM")
public class SqglFjhhzsfjlb implements java.io.Serializable {

	// Fields

	private String VId;
	private String depId;
	private String depName;
	private String VXm;
	private String CGrbh;
	private String VZjhm;
	private Integer IXb;
	private Date dtCsrq;
	private String VZlyx;
	private Integer IDdry;
	private Integer ISffs;
	private Integer IZz;
	private Integer IZzks;
	private Integer IZzdh;
	private Integer IZzxt;
	private Integer IZzxtxs;
	private Integer IZzex;
	private Integer IZztt;
	private Integer IZzsjmh;
	private Integer IZzpz;
	private Integer IZzem;
	private String VZzqt;
	private String VHlfa;
	private Integer IYyyf;
	private Integer IYpjx1;
	private String VLfcs;
	private String VXy1;
	private String VXy2;
	private String VYj1;
	private String VYj2;
	private Integer IYwblfy;
	private String VYwblfy2;
	private Integer IBfz;
	private String VBfz2;
	private String VZzkb;
	private String VZzyy;
	private String VZzsfjg;
	private String VClyj;
	private Date dtSfnext;
	private String VSfysqz;
	private Date dtTzsj;
	private Integer ITzyy1;
	private Integer IYfscs;
	private Integer ISjfscs;
	private Integer IYfycs;
	private Integer ISjfycs;
	private String VFyl;
	private String CCzybh;
	private Date dtCreate;
	private Integer IHisto;
	private String VBz;
	private Integer IZt;
	private Date dtJlsj;
	private String VYsqz;
	private Integer IZzqt;
	private Integer IYpjx2;
	private Integer IYpjx3;
	private Integer IYpjx4;
	private Integer ITzyy2;
	private Integer ITzyy3;
	private Integer ITzyy4;
	private String VPgys;

	// Constructors

	/** default constructor */
	public SqglFjhhzsfjlb() {
	}

	/** minimal constructor */
	public SqglFjhhzsfjlb(String VId, String depId, String CGrbh) {
		this.VId = VId;
		this.depId = depId;
		this.CGrbh = CGrbh;
	}

	/** full constructor */
	public SqglFjhhzsfjlb(String VId, String depId, String depName, String VXm,
			String CGrbh, String VZjhm, Integer IXb, Date dtCsrq,
			String VZlyx, Integer IDdry, Integer ISffs, Integer IZz,
			Integer IZzks, Integer IZzdh, Integer IZzxt,
			Integer IZzxtxs, Integer IZzex, Integer IZztt,
			Integer IZzsjmh, Integer IZzpz, Integer IZzem,
			String VZzqt, String VHlfa, Integer IYyyf, Integer IYpjx1,
			String VLfcs, String VXy1, String VXy2, String VYj1, String VYj2,
			Integer IYwblfy, String VYwblfy2, Integer IBfz, String VBfz2,
			String VZzkb, String VZzyy, String VZzsfjg, String VClyj,
			Date dtSfnext, String VSfysqz, Date dtTzsj,
			Integer ITzyy1, Integer IYfscs, Integer ISjfscs,
			Integer IYfycs, Integer ISjfycs, String VFyl, String CCzybh,
			Date dtCreate, Integer IHisto, String VBz, Integer IZt,
			Date dtJlsj, String VYsqz, Integer IZzqt,
			Integer IYpjx2, Integer IYpjx3, Integer IYpjx4,
			Integer ITzyy2, Integer ITzyy3, Integer ITzyy4,
			String VPgys) {
		this.VId = VId;
		this.depId = depId;
		this.depName = depName;
		this.VXm = VXm;
		this.CGrbh = CGrbh;
		this.VZjhm = VZjhm;
		this.IXb = IXb;
		this.dtCsrq = dtCsrq;
		this.VZlyx = VZlyx;
		this.IDdry = IDdry;
		this.ISffs = ISffs;
		this.IZz = IZz;
		this.IZzks = IZzks;
		this.IZzdh = IZzdh;
		this.IZzxt = IZzxt;
		this.IZzxtxs = IZzxtxs;
		this.IZzex = IZzex;
		this.IZztt = IZztt;
		this.IZzsjmh = IZzsjmh;
		this.IZzpz = IZzpz;
		this.IZzem = IZzem;
		this.VZzqt = VZzqt;
		this.VHlfa = VHlfa;
		this.IYyyf = IYyyf;
		this.IYpjx1 = IYpjx1;
		this.VLfcs = VLfcs;
		this.VXy1 = VXy1;
		this.VXy2 = VXy2;
		this.VYj1 = VYj1;
		this.VYj2 = VYj2;
		this.IYwblfy = IYwblfy;
		this.VYwblfy2 = VYwblfy2;
		this.IBfz = IBfz;
		this.VBfz2 = VBfz2;
		this.VZzkb = VZzkb;
		this.VZzyy = VZzyy;
		this.VZzsfjg = VZzsfjg;
		this.VClyj = VClyj;
		this.dtSfnext = dtSfnext;
		this.VSfysqz = VSfysqz;
		this.dtTzsj = dtTzsj;
		this.ITzyy1 = ITzyy1;
		this.IYfscs = IYfscs;
		this.ISjfscs = ISjfscs;
		this.IYfycs = IYfycs;
		this.ISjfycs = ISjfycs;
		this.VFyl = VFyl;
		this.CCzybh = CCzybh;
		this.dtCreate = dtCreate;
		this.IHisto = IHisto;
		this.VBz = VBz;
		this.IZt = IZt;
		this.dtJlsj = dtJlsj;
		this.VYsqz = VYsqz;
		this.IZzqt = IZzqt;
		this.IYpjx2 = IYpjx2;
		this.IYpjx3 = IYpjx3;
		this.IYpjx4 = IYpjx4;
		this.ITzyy2 = ITzyy2;
		this.ITzyy3 = ITzyy3;
		this.ITzyy4 = ITzyy4;
		this.VPgys = VPgys;
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

	@Column(name = "DEP_NAME", length = 100)
	public String getDepName() {
		return this.depName;
	}

	public void setDepName(String depName) {
		this.depName = depName;
	}

	@Column(name = "V_XM", length = 100)
	public String getVXm() {
		return this.VXm;
	}

	public void setVXm(String VXm) {
		this.VXm = VXm;
	}

	@Column(name = "C_GRBH", nullable = false, length = 100)
	public String getCGrbh() {
		return this.CGrbh;
	}

	public void setCGrbh(String CGrbh) {
		this.CGrbh = CGrbh;
	}

	@Column(name = "V_ZJHM", length = 100)
	public String getVZjhm() {
		return this.VZjhm;
	}

	public void setVZjhm(String VZjhm) {
		this.VZjhm = VZjhm;
	}

	@Column(name = "I_XB", precision = 22, scale = 0)
	public Integer getIXb() {
		return this.IXb;
	}

	public void setIXb(Integer IXb) {
		this.IXb = IXb;
	}

	@Column(name = "DT_CSRQ", length = 7)
	public Date getDtCsrq() {
		return this.dtCsrq;
	}

	public void setDtCsrq(Date dtCsrq) {
		this.dtCsrq = dtCsrq;
	}

	@Column(name = "V_ZLYX", length = 100)
	public String getVZlyx() {
		return this.VZlyx;
	}

	public void setVZlyx(String VZlyx) {
		this.VZlyx = VZlyx;
	}

	@Column(name = "I_DDRY", precision = 22, scale = 0)
	public Integer getIDdry() {
		return this.IDdry;
	}

	public void setIDdry(Integer IDdry) {
		this.IDdry = IDdry;
	}

	@Column(name = "I_SFFS", precision = 22, scale = 0)
	public Integer getISffs() {
		return this.ISffs;
	}

	public void setISffs(Integer ISffs) {
		this.ISffs = ISffs;
	}

	@Column(name = "I_ZZ", precision = 22, scale = 0)
	public Integer getIZz() {
		return this.IZz;
	}

	public void setIZz(Integer IZz) {
		this.IZz = IZz;
	}

	@Column(name = "I_ZZKS", precision = 22, scale = 0)
	public Integer getIZzks() {
		return this.IZzks;
	}

	public void setIZzks(Integer IZzks) {
		this.IZzks = IZzks;
	}

	@Column(name = "I_ZZDH", precision = 22, scale = 0)
	public Integer getIZzdh() {
		return this.IZzdh;
	}

	public void setIZzdh(Integer IZzdh) {
		this.IZzdh = IZzdh;
	}

	@Column(name = "I_ZZXT", precision = 22, scale = 0)
	public Integer getIZzxt() {
		return this.IZzxt;
	}

	public void setIZzxt(Integer IZzxt) {
		this.IZzxt = IZzxt;
	}

	@Column(name = "I_ZZXTXS", precision = 22, scale = 0)
	public Integer getIZzxtxs() {
		return this.IZzxtxs;
	}

	public void setIZzxtxs(Integer IZzxtxs) {
		this.IZzxtxs = IZzxtxs;
	}

	@Column(name = "I_ZZEX", precision = 22, scale = 0)
	public Integer getIZzex() {
		return this.IZzex;
	}

	public void setIZzex(Integer IZzex) {
		this.IZzex = IZzex;
	}

	@Column(name = "I_ZZTT", precision = 22, scale = 0)
	public Integer getIZztt() {
		return this.IZztt;
	}

	public void setIZztt(Integer IZztt) {
		this.IZztt = IZztt;
	}

	@Column(name = "I_ZZSJMH", precision = 22, scale = 0)
	public Integer getIZzsjmh() {
		return this.IZzsjmh;
	}

	public void setIZzsjmh(Integer IZzsjmh) {
		this.IZzsjmh = IZzsjmh;
	}

	@Column(name = "I_ZZPZ", precision = 22, scale = 0)
	public Integer getIZzpz() {
		return this.IZzpz;
	}

	public void setIZzpz(Integer IZzpz) {
		this.IZzpz = IZzpz;
	}

	@Column(name = "I_ZZEM", precision = 22, scale = 0)
	public Integer getIZzem() {
		return this.IZzem;
	}

	public void setIZzem(Integer IZzem) {
		this.IZzem = IZzem;
	}

	@Column(name = "V_ZZQT", length = 100)
	public String getVZzqt() {
		return this.VZzqt;
	}

	public void setVZzqt(String VZzqt) {
		this.VZzqt = VZzqt;
	}

	@Column(name = "V_HLFA", length = 100)
	public String getVHlfa() {
		return this.VHlfa;
	}

	public void setVHlfa(String VHlfa) {
		this.VHlfa = VHlfa;
	}

	@Column(name = "I_YYYF", precision = 22, scale = 0)
	public Integer getIYyyf() {
		return this.IYyyf;
	}

	public void setIYyyf(Integer IYyyf) {
		this.IYyyf = IYyyf;
	}

	@Column(name = "I_YPJX1", precision = 22, scale = 0)
	public Integer getIYpjx1() {
		return this.IYpjx1;
	}

	public void setIYpjx1(Integer IYpjx1) {
		this.IYpjx1 = IYpjx1;
	}

	@Column(name = "V_LFCS", length = 100)
	public String getVLfcs() {
		return this.VLfcs;
	}

	public void setVLfcs(String VLfcs) {
		this.VLfcs = VLfcs;
	}

	@Column(name = "V_XY1", length = 100)
	public String getVXy1() {
		return this.VXy1;
	}

	public void setVXy1(String VXy1) {
		this.VXy1 = VXy1;
	}

	@Column(name = "V_XY2", length = 100)
	public String getVXy2() {
		return this.VXy2;
	}

	public void setVXy2(String VXy2) {
		this.VXy2 = VXy2;
	}

	@Column(name = "V_YJ1", length = 100)
	public String getVYj1() {
		return this.VYj1;
	}

	public void setVYj1(String VYj1) {
		this.VYj1 = VYj1;
	}

	@Column(name = "V_YJ2", length = 100)
	public String getVYj2() {
		return this.VYj2;
	}

	public void setVYj2(String VYj2) {
		this.VYj2 = VYj2;
	}

	@Column(name = "I_YWBLFY", precision = 22, scale = 0)
	public Integer getIYwblfy() {
		return this.IYwblfy;
	}

	public void setIYwblfy(Integer IYwblfy) {
		this.IYwblfy = IYwblfy;
	}

	@Column(name = "V_YWBLFY2", length = 100)
	public String getVYwblfy2() {
		return this.VYwblfy2;
	}

	public void setVYwblfy2(String VYwblfy2) {
		this.VYwblfy2 = VYwblfy2;
	}

	@Column(name = "I_BFZ", precision = 22, scale = 0)
	public Integer getIBfz() {
		return this.IBfz;
	}

	public void setIBfz(Integer IBfz) {
		this.IBfz = IBfz;
	}

	@Column(name = "V_BFZ2", length = 100)
	public String getVBfz2() {
		return this.VBfz2;
	}

	public void setVBfz2(String VBfz2) {
		this.VBfz2 = VBfz2;
	}

	@Column(name = "V_ZZKB", length = 100)
	public String getVZzkb() {
		return this.VZzkb;
	}

	public void setVZzkb(String VZzkb) {
		this.VZzkb = VZzkb;
	}

	@Column(name = "V_ZZYY", length = 100)
	public String getVZzyy() {
		return this.VZzyy;
	}

	public void setVZzyy(String VZzyy) {
		this.VZzyy = VZzyy;
	}

	@Column(name = "V_ZZSFJG", length = 100)
	public String getVZzsfjg() {
		return this.VZzsfjg;
	}

	public void setVZzsfjg(String VZzsfjg) {
		this.VZzsfjg = VZzsfjg;
	}

	@Column(name = "V_CLYJ", length = 100)
	public String getVClyj() {
		return this.VClyj;
	}

	public void setVClyj(String VClyj) {
		this.VClyj = VClyj;
	}

	@Column(name = "DT_SFNEXT", length = 7)
	public Date getDtSfnext() {
		return this.dtSfnext;
	}

	public void setDtSfnext(Date dtSfnext) {
		this.dtSfnext = dtSfnext;
	}

	@Column(name = "V_SFYSQZ", length = 100)
	public String getVSfysqz() {
		return this.VSfysqz;
	}

	public void setVSfysqz(String VSfysqz) {
		this.VSfysqz = VSfysqz;
	}

	@Column(name = "DT_TZSJ", length = 7)
	public Date getDtTzsj() {
		return this.dtTzsj;
	}

	public void setDtTzsj(Date dtTzsj) {
		this.dtTzsj = dtTzsj;
	}

	@Column(name = "I_TZYY1", precision = 22, scale = 0)
	public Integer getITzyy1() {
		return this.ITzyy1;
	}

	public void setITzyy1(Integer ITzyy1) {
		this.ITzyy1 = ITzyy1;
	}

	@Column(name = "I_YFSCS", precision = 22, scale = 0)
	public Integer getIYfscs() {
		return this.IYfscs;
	}

	public void setIYfscs(Integer IYfscs) {
		this.IYfscs = IYfscs;
	}

	@Column(name = "I_SJFSCS", precision = 22, scale = 0)
	public Integer getISjfscs() {
		return this.ISjfscs;
	}

	public void setISjfscs(Integer ISjfscs) {
		this.ISjfscs = ISjfscs;
	}

	@Column(name = "I_YFYCS", precision = 22, scale = 0)
	public Integer getIYfycs() {
		return this.IYfycs;
	}

	public void setIYfycs(Integer IYfycs) {
		this.IYfycs = IYfycs;
	}

	@Column(name = "I_SJFYCS", precision = 22, scale = 0)
	public Integer getISjfycs() {
		return this.ISjfycs;
	}

	public void setISjfycs(Integer ISjfycs) {
		this.ISjfycs = ISjfycs;
	}

	@Column(name = "V_FYL", length = 100)
	public String getVFyl() {
		return this.VFyl;
	}

	public void setVFyl(String VFyl) {
		this.VFyl = VFyl;
	}

	@Column(name = "C_CZYBH", length = 100)
	public String getCCzybh() {
		return this.CCzybh;
	}

	public void setCCzybh(String CCzybh) {
		this.CCzybh = CCzybh;
	}

	@Column(name = "I_HISTO", precision = 22, scale = 0)
	public Integer getIHisto() {
		return this.IHisto;
	}

	public void setIHisto(Integer IHisto) {
		this.IHisto = IHisto;
	}

	@Column(name = "V_BZ", length = 100)
	public String getVBz() {
		return this.VBz;
	}

	public void setVBz(String VBz) {
		this.VBz = VBz;
	}

	@Column(name = "I_ZT", precision = 22, scale = 0)
	public Integer getIZt() {
		return this.IZt;
	}

	public void setIZt(Integer IZt) {
		this.IZt = IZt;
	}

	@Column(name = "DT_JLSJ", length = 7)
	public Date getDtJlsj() {
		return this.dtJlsj;
	}

	public void setDtJlsj(Date dtJlsj) {
		this.dtJlsj = dtJlsj;
	}

	@Column(name = "V_YSQZ", length = 100)
	public String getVYsqz() {
		return this.VYsqz;
	}

	public void setVYsqz(String VYsqz) {
		this.VYsqz = VYsqz;
	}

	@Column(name = "I_ZZQT", precision = 22, scale = 0)
	public Integer getIZzqt() {
		return this.IZzqt;
	}

	public void setIZzqt(Integer IZzqt) {
		this.IZzqt = IZzqt;
	}

	@Column(name = "I_YPJX2", precision = 22, scale = 0)
	public Integer getIYpjx2() {
		return this.IYpjx2;
	}

	public void setIYpjx2(Integer IYpjx2) {
		this.IYpjx2 = IYpjx2;
	}

	@Column(name = "I_YPJX3", precision = 22, scale = 0)
	public Integer getIYpjx3() {
		return this.IYpjx3;
	}

	public void setIYpjx3(Integer IYpjx3) {
		this.IYpjx3 = IYpjx3;
	}

	@Column(name = "I_YPJX4", precision = 22, scale = 0)
	public Integer getIYpjx4() {
		return this.IYpjx4;
	}

	public void setIYpjx4(Integer IYpjx4) {
		this.IYpjx4 = IYpjx4;
	}

	@Column(name = "I_TZYY2", precision = 22, scale = 0)
	public Integer getITzyy2() {
		return this.ITzyy2;
	}

	public void setITzyy2(Integer ITzyy2) {
		this.ITzyy2 = ITzyy2;
	}

	@Column(name = "I_TZYY3", precision = 22, scale = 0)
	public Integer getITzyy3() {
		return this.ITzyy3;
	}

	public void setITzyy3(Integer ITzyy3) {
		this.ITzyy3 = ITzyy3;
	}

	@Column(name = "I_TZYY4", precision = 22, scale = 0)
	public Integer getITzyy4() {
		return this.ITzyy4;
	}

	public void setITzyy4(Integer ITzyy4) {
		this.ITzyy4 = ITzyy4;
	}

	@Column(name = "V_PGYS", length = 100)
	public String getVPgys() {
		return this.VPgys;
	}

	public void setVPgys(String VPgys) {
		this.VPgys = VPgys;
	}

}