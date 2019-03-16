package com.zrhis.wsjd.system.bean;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * SqglJtcytnbzxbsfjl entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "SQGL_JTCYTNBZXBSFJL", schema = "CXJM", uniqueConstraints = @UniqueConstraint(columnNames = {
		"DEP_ID", "C_GRBH", "DT_JLSJ" }))
public class SqglJtcytnbzxbsfjl implements java.io.Serializable {

	// Fields

	private String VId;
	private String depId;
	private String CId;
	private String CGrbh;
	private Date dtSfsj;
	private Integer ISffs;
	private String VNtzc;
	private Integer IZz1;
	private Integer IZz2;
	private Integer IZz3;
	private Integer IZz4;
	private Integer IZz5;
	private Integer IZz6;
	private Integer IZz7;
	private Integer IZz8;
	private String VQtzz;
	private Integer xyg;
	private Integer xyd;
	private Double NMqtz;
	private Double ITzzs1;
	private Double ITzzs2;
	private Integer IZbdm;
	private String VQttz;
	private Integer IXy;
	private Integer IXymb;
	private Integer IYj;
	private Integer IYjmb;
	private Integer IYdcs;
	private Integer IYdfz;
	private Integer IYdcsmb;
	private Integer IYdfzmb;
	private Integer IZs;
	private Integer IZsmb;
	private Integer IXltz;
	private Integer IZyxw;
	private Double NKfxt;
	private Double NXhdb;
	private Date dtJcrq;
	private String VJcjg;
	private Integer IFyycx;
	private Integer IBlfy;
	private String VBlfy;
	private Integer IDxtfy;
	private Integer ICcsffl;
	private String VYpmc1;
	private Integer IFycs1;
	private Double NMcjl1;
	private String VYpmc2;
	private Integer IFycs2;
	private Double NMcjl2;
	private String VYpmc3;
	private Integer IFycs3;
	private Double NMcjl3;
	private String VYds;
	private String VYsxm;
	private Date dtXcsfsj;
	private String VBdcz;
	private String VDcz;
	private String VFhz;
	private Date dtQmrq;
	private Date dtDcrq;
	private Date dtFhrq;
	private Integer ISfzz;
	private String VZzyy;
	private String VZzjg;
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
	private Integer ICsbz;
	private Integer IHisto;
	private Integer IZbdmjr1;
	private Integer IZbdmjr2;
	private Integer IZbdmjr3;
	private Integer IZbdmxs1;
	private Integer IZbdmxs2;
	private Integer IZbdmxs3;
	private Integer IZbdmbf;

	// Constructors

	/** default constructor */
	public SqglJtcytnbzxbsfjl() {
	}

	/** minimal constructor */
	public SqglJtcytnbzxbsfjl(String VId, String CGrbh, Date dtJlsj) {
		this.VId = VId;
		this.CGrbh = CGrbh;
		this.dtJlsj = dtJlsj;
	}

	/** full constructor */
	public SqglJtcytnbzxbsfjl(String VId, String depId, String CId,
			String CGrbh, Date dtSfsj, Integer ISffs, String VNtzc,
			Integer IZz1, Integer IZz2, Integer IZz3, Integer IZz4,
			Integer IZz5, Integer IZz6, Integer IZz7, Integer IZz8,
			String VQtzz, Integer xyg, Integer xyd, Double NMqtz,
			Double ITzzs1, Double ITzzs2, Integer IZbdm, String VQttz,
			Integer IXy, Integer IXymb, Integer IYj, Integer IYjmb,
			Integer IYdcs, Integer IYdfz, Integer IYdcsmb,
			Integer IYdfzmb, Integer IZs, Integer IZsmb,
			Integer IXltz, Integer IZyxw, Double NKfxt, Double NXhdb,
			Date dtJcrq, String VJcjg, Integer IFyycx,
			Integer IBlfy, String VBlfy, Integer IDxtfy,
			Integer ICcsffl, String VYpmc1, Integer IFycs1,
			Double NMcjl1, String VYpmc2, Integer IFycs2, Double NMcjl2,
			String VYpmc3, Integer IFycs3, Double NMcjl3, String VYds,
			String VYsxm, Date dtXcsfsj, String VBdcz, String VDcz,
			String VFhz, Date dtQmrq, Date dtDcrq, Date dtFhrq,
			Integer ISfzz, String VZzyy, String VZzjg, Date dtJlsj,
			String CCzybh, String VBz, String depName, Integer IUpload,
			Date dtUpload, Date dtCreate, String VXm, Short IXb,
			String VZjhm, Date dtCsrq, String VYktbh, String VBz1,
			String VBz2, String VBz3, Integer ICsbz, Integer IHisto,
			Integer IZbdmjr1, Integer IZbdmjr2, Integer IZbdmjr3,
			Integer IZbdmxs1, Integer IZbdmxs2, Integer IZbdmxs3,
			Integer IZbdmbf) {
		this.VId = VId;
		this.depId = depId;
		this.CId = CId;
		this.CGrbh = CGrbh;
		this.dtSfsj = dtSfsj;
		this.ISffs = ISffs;
		this.VNtzc = VNtzc;
		this.IZz1 = IZz1;
		this.IZz2 = IZz2;
		this.IZz3 = IZz3;
		this.IZz4 = IZz4;
		this.IZz5 = IZz5;
		this.IZz6 = IZz6;
		this.IZz7 = IZz7;
		this.IZz8 = IZz8;
		this.VQtzz = VQtzz;
		this.xyg = xyg;
		this.xyd = xyd;
		this.NMqtz = NMqtz;
		this.ITzzs1 = ITzzs1;
		this.ITzzs2 = ITzzs2;
		this.IZbdm = IZbdm;
		this.VQttz = VQttz;
		this.IXy = IXy;
		this.IXymb = IXymb;
		this.IYj = IYj;
		this.IYjmb = IYjmb;
		this.IYdcs = IYdcs;
		this.IYdfz = IYdfz;
		this.IYdcsmb = IYdcsmb;
		this.IYdfzmb = IYdfzmb;
		this.IZs = IZs;
		this.IZsmb = IZsmb;
		this.IXltz = IXltz;
		this.IZyxw = IZyxw;
		this.NKfxt = NKfxt;
		this.NXhdb = NXhdb;
		this.dtJcrq = dtJcrq;
		this.VJcjg = VJcjg;
		this.IFyycx = IFyycx;
		this.IBlfy = IBlfy;
		this.VBlfy = VBlfy;
		this.IDxtfy = IDxtfy;
		this.ICcsffl = ICcsffl;
		this.VYpmc1 = VYpmc1;
		this.IFycs1 = IFycs1;
		this.NMcjl1 = NMcjl1;
		this.VYpmc2 = VYpmc2;
		this.IFycs2 = IFycs2;
		this.NMcjl2 = NMcjl2;
		this.VYpmc3 = VYpmc3;
		this.IFycs3 = IFycs3;
		this.NMcjl3 = NMcjl3;
		this.VYds = VYds;
		this.VYsxm = VYsxm;
		this.dtXcsfsj = dtXcsfsj;
		this.VBdcz = VBdcz;
		this.VDcz = VDcz;
		this.VFhz = VFhz;
		this.dtQmrq = dtQmrq;
		this.dtDcrq = dtDcrq;
		this.dtFhrq = dtFhrq;
		this.ISfzz = ISfzz;
		this.VZzyy = VZzyy;
		this.VZzjg = VZzjg;
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
		this.ICsbz = ICsbz;
		this.IHisto = IHisto;
		this.IZbdmjr1 = IZbdmjr1;
		this.IZbdmjr2 = IZbdmjr2;
		this.IZbdmjr3 = IZbdmjr3;
		this.IZbdmxs1 = IZbdmxs1;
		this.IZbdmxs2 = IZbdmxs2;
		this.IZbdmxs3 = IZbdmxs3;
		this.IZbdmbf = IZbdmbf;
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

	@Column(name = "C_ID", length = 14)
	public String getCId() {
		return this.CId;
	}

	public void setCId(String CId) {
		this.CId = CId;
	}

	@Column(name = "C_GRBH", nullable = false, length = 22)
	public String getCGrbh() {
		return this.CGrbh;
	}

	public void setCGrbh(String CGrbh) {
		this.CGrbh = CGrbh;
	}

	@Column(name = "DT_SFSJ", length = 7)
	public Date getDtSfsj() {
		return this.dtSfsj;
	}

	public void setDtSfsj(Date dtSfsj) {
		this.dtSfsj = dtSfsj;
	}

	@Column(name = "I_SFFS", precision = 22, scale = 0)
	public Integer getISffs() {
		return this.ISffs;
	}

	public void setISffs(Integer ISffs) {
		this.ISffs = ISffs;
	}

	@Column(name = "V_NTZC", length = 20)
	public String getVNtzc() {
		return this.VNtzc;
	}

	public void setVNtzc(String VNtzc) {
		this.VNtzc = VNtzc;
	}

	@Column(name = "I_ZZ1", precision = 22, scale = 0)
	public Integer getIZz1() {
		return this.IZz1;
	}

	public void setIZz1(Integer IZz1) {
		this.IZz1 = IZz1;
	}

	@Column(name = "I_ZZ2", precision = 22, scale = 0)
	public Integer getIZz2() {
		return this.IZz2;
	}

	public void setIZz2(Integer IZz2) {
		this.IZz2 = IZz2;
	}

	@Column(name = "I_ZZ3", precision = 22, scale = 0)
	public Integer getIZz3() {
		return this.IZz3;
	}

	public void setIZz3(Integer IZz3) {
		this.IZz3 = IZz3;
	}

	@Column(name = "I_ZZ4", precision = 22, scale = 0)
	public Integer getIZz4() {
		return this.IZz4;
	}

	public void setIZz4(Integer IZz4) {
		this.IZz4 = IZz4;
	}

	@Column(name = "I_ZZ5", precision = 22, scale = 0)
	public Integer getIZz5() {
		return this.IZz5;
	}

	public void setIZz5(Integer IZz5) {
		this.IZz5 = IZz5;
	}

	@Column(name = "I_ZZ6", precision = 22, scale = 0)
	public Integer getIZz6() {
		return this.IZz6;
	}

	public void setIZz6(Integer IZz6) {
		this.IZz6 = IZz6;
	}

	@Column(name = "I_ZZ7", precision = 22, scale = 0)
	public Integer getIZz7() {
		return this.IZz7;
	}

	public void setIZz7(Integer IZz7) {
		this.IZz7 = IZz7;
	}

	@Column(name = "I_ZZ8", precision = 22, scale = 0)
	public Integer getIZz8() {
		return this.IZz8;
	}

	public void setIZz8(Integer IZz8) {
		this.IZz8 = IZz8;
	}

	@Column(name = "V_QTZZ", length = 200)
	public String getVQtzz() {
		return this.VQtzz;
	}

	public void setVQtzz(String VQtzz) {
		this.VQtzz = VQtzz;
	}

	@Column(name = "XYG", precision = 22, scale = 0)
	public Integer getXyg() {
		return this.xyg;
	}

	public void setXyg(Integer xyg) {
		this.xyg = xyg;
	}

	@Column(name = "XYD", precision = 22, scale = 0)
	public Integer getXyd() {
		return this.xyd;
	}

	public void setXyd(Integer xyd) {
		this.xyd = xyd;
	}

	@Column(name = "N_MQTZ")
	public Double getNMqtz() {
		return this.NMqtz;
	}

	public void setNMqtz(Double NMqtz) {
		this.NMqtz = NMqtz;
	}

	@Column(name = "I_TZZS1")
	public Double getITzzs1() {
		return this.ITzzs1;
	}

	public void setITzzs1(Double ITzzs1) {
		this.ITzzs1 = ITzzs1;
	}

	@Column(name = "I_TZZS2")
	public Double getITzzs2() {
		return this.ITzzs2;
	}

	public void setITzzs2(Double ITzzs2) {
		this.ITzzs2 = ITzzs2;
	}

	@Column(name = "I_ZBDM", precision = 22, scale = 0)
	public Integer getIZbdm() {
		return this.IZbdm;
	}

	public void setIZbdm(Integer IZbdm) {
		this.IZbdm = IZbdm;
	}

	@Column(name = "V_QTTZ", length = 200)
	public String getVQttz() {
		return this.VQttz;
	}

	public void setVQttz(String VQttz) {
		this.VQttz = VQttz;
	}

	@Column(name = "I_XY", precision = 22, scale = 0)
	public Integer getIXy() {
		return this.IXy;
	}

	public void setIXy(Integer IXy) {
		this.IXy = IXy;
	}

	@Column(name = "I_XYMB", precision = 22, scale = 0)
	public Integer getIXymb() {
		return this.IXymb;
	}

	public void setIXymb(Integer IXymb) {
		this.IXymb = IXymb;
	}

	@Column(name = "I_YJ", precision = 22, scale = 0)
	public Integer getIYj() {
		return this.IYj;
	}

	public void setIYj(Integer IYj) {
		this.IYj = IYj;
	}

	@Column(name = "I_YJMB", precision = 22, scale = 0)
	public Integer getIYjmb() {
		return this.IYjmb;
	}

	public void setIYjmb(Integer IYjmb) {
		this.IYjmb = IYjmb;
	}

	@Column(name = "I_YDCS", precision = 22, scale = 0)
	public Integer getIYdcs() {
		return this.IYdcs;
	}

	public void setIYdcs(Integer IYdcs) {
		this.IYdcs = IYdcs;
	}

	@Column(name = "I_YDFZ", precision = 22, scale = 0)
	public Integer getIYdfz() {
		return this.IYdfz;
	}

	public void setIYdfz(Integer IYdfz) {
		this.IYdfz = IYdfz;
	}

	@Column(name = "I_YDCSMB", precision = 22, scale = 0)
	public Integer getIYdcsmb() {
		return this.IYdcsmb;
	}

	public void setIYdcsmb(Integer IYdcsmb) {
		this.IYdcsmb = IYdcsmb;
	}

	@Column(name = "I_YDFZMB", precision = 22, scale = 0)
	public Integer getIYdfzmb() {
		return this.IYdfzmb;
	}

	public void setIYdfzmb(Integer IYdfzmb) {
		this.IYdfzmb = IYdfzmb;
	}

	@Column(name = "I_ZS", precision = 22, scale = 0)
	public Integer getIZs() {
		return this.IZs;
	}

	public void setIZs(Integer IZs) {
		this.IZs = IZs;
	}

	@Column(name = "I_ZSMB", precision = 22, scale = 0)
	public Integer getIZsmb() {
		return this.IZsmb;
	}

	public void setIZsmb(Integer IZsmb) {
		this.IZsmb = IZsmb;
	}

	@Column(name = "I_XLTZ", precision = 22, scale = 0)
	public Integer getIXltz() {
		return this.IXltz;
	}

	public void setIXltz(Integer IXltz) {
		this.IXltz = IXltz;
	}

	@Column(name = "I_ZYXW", precision = 22, scale = 0)
	public Integer getIZyxw() {
		return this.IZyxw;
	}

	public void setIZyxw(Integer IZyxw) {
		this.IZyxw = IZyxw;
	}

	@Column(name = "N_KFXT", precision = 17, scale = 4)
	public Double getNKfxt() {
		return this.NKfxt;
	}

	public void setNKfxt(Double NKfxt) {
		this.NKfxt = NKfxt;
	}

	@Column(name = "N_XHDB")
	public Double getNXhdb() {
		return this.NXhdb;
	}

	public void setNXhdb(Double NXhdb) {
		this.NXhdb = NXhdb;
	}

	@Column(name = "DT_JCRQ", length = 7)
	public Date getDtJcrq() {
		return this.dtJcrq;
	}

	public void setDtJcrq(Date dtJcrq) {
		this.dtJcrq = dtJcrq;
	}

	@Column(name = "V_JCJG", length = 200)
	public String getVJcjg() {
		return this.VJcjg;
	}

	public void setVJcjg(String VJcjg) {
		this.VJcjg = VJcjg;
	}

	@Column(name = "I_FYYCX", precision = 22, scale = 0)
	public Integer getIFyycx() {
		return this.IFyycx;
	}

	public void setIFyycx(Integer IFyycx) {
		this.IFyycx = IFyycx;
	}

	@Column(name = "I_BLFY", precision = 22, scale = 0)
	public Integer getIBlfy() {
		return this.IBlfy;
	}

	public void setIBlfy(Integer IBlfy) {
		this.IBlfy = IBlfy;
	}

	@Column(name = "V_BLFY", length = 200)
	public String getVBlfy() {
		return this.VBlfy;
	}

	public void setVBlfy(String VBlfy) {
		this.VBlfy = VBlfy;
	}

	@Column(name = "I_DXTFY", precision = 22, scale = 0)
	public Integer getIDxtfy() {
		return this.IDxtfy;
	}

	public void setIDxtfy(Integer IDxtfy) {
		this.IDxtfy = IDxtfy;
	}

	@Column(name = "I_CCSFFL", precision = 22, scale = 0)
	public Integer getICcsffl() {
		return this.ICcsffl;
	}

	public void setICcsffl(Integer ICcsffl) {
		this.ICcsffl = ICcsffl;
	}

	@Column(name = "V_YPMC1", length = 50)
	public String getVYpmc1() {
		return this.VYpmc1;
	}

	public void setVYpmc1(String VYpmc1) {
		this.VYpmc1 = VYpmc1;
	}

	@Column(name = "I_FYCS1", precision = 22, scale = 0)
	public Integer getIFycs1() {
		return this.IFycs1;
	}

	public void setIFycs1(Integer IFycs1) {
		this.IFycs1 = IFycs1;
	}

	@Column(name = "N_MCJL1")
	public Double getNMcjl1() {
		return this.NMcjl1;
	}

	public void setNMcjl1(Double NMcjl1) {
		this.NMcjl1 = NMcjl1;
	}

	@Column(name = "V_YPMC2", length = 50)
	public String getVYpmc2() {
		return this.VYpmc2;
	}

	public void setVYpmc2(String VYpmc2) {
		this.VYpmc2 = VYpmc2;
	}

	@Column(name = "I_FYCS2", precision = 22, scale = 0)
	public Integer getIFycs2() {
		return this.IFycs2;
	}

	public void setIFycs2(Integer IFycs2) {
		this.IFycs2 = IFycs2;
	}

	@Column(name = "N_MCJL2")
	public Double getNMcjl2() {
		return this.NMcjl2;
	}

	public void setNMcjl2(Double NMcjl2) {
		this.NMcjl2 = NMcjl2;
	}

	@Column(name = "V_YPMC3", length = 50)
	public String getVYpmc3() {
		return this.VYpmc3;
	}

	public void setVYpmc3(String VYpmc3) {
		this.VYpmc3 = VYpmc3;
	}

	@Column(name = "I_FYCS3", precision = 22, scale = 0)
	public Integer getIFycs3() {
		return this.IFycs3;
	}

	public void setIFycs3(Integer IFycs3) {
		this.IFycs3 = IFycs3;
	}

	@Column(name = "N_MCJL3")
	public Double getNMcjl3() {
		return this.NMcjl3;
	}

	public void setNMcjl3(Double NMcjl3) {
		this.NMcjl3 = NMcjl3;
	}

	@Column(name = "V_YDS", length = 200)
	public String getVYds() {
		return this.VYds;
	}

	public void setVYds(String VYds) {
		this.VYds = VYds;
	}

	@Column(name = "V_YSXM", length = 20)
	public String getVYsxm() {
		return this.VYsxm;
	}

	public void setVYsxm(String VYsxm) {
		this.VYsxm = VYsxm;
	}

	@Column(name = "DT_XCSFSJ", length = 7)
	public Date getDtXcsfsj() {
		return this.dtXcsfsj;
	}

	public void setDtXcsfsj(Date dtXcsfsj) {
		this.dtXcsfsj = dtXcsfsj;
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

	@Column(name = "I_SFZZ", precision = 22, scale = 0)
	public Integer getISfzz() {
		return this.ISfzz;
	}

	public void setISfzz(Integer ISfzz) {
		this.ISfzz = ISfzz;
	}

	@Column(name = "V_ZZYY")
	public String getVZzyy() {
		return this.VZzyy;
	}

	public void setVZzyy(String VZzyy) {
		this.VZzyy = VZzyy;
	}

	@Column(name = "V_ZZJG")
	public String getVZzjg() {
		return this.VZzjg;
	}

	public void setVZzjg(String VZzjg) {
		this.VZzjg = VZzjg;
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

	@Column(name = "I_CSBZ", precision = 22, scale = 0)
	public Integer getICsbz() {
		return this.ICsbz;
	}

	public void setICsbz(Integer ICsbz) {
		this.ICsbz = ICsbz;
	}

	@Column(name = "I_HISTO", precision = 22, scale = 0)
	public Integer getIHisto() {
		return this.IHisto;
	}

	public void setIHisto(Integer IHisto) {
		this.IHisto = IHisto;
	}

	@Column(name = "I_ZBDMJR1", precision = 22, scale = 0)
	public Integer getIZbdmjr1() {
		return this.IZbdmjr1;
	}

	public void setIZbdmjr1(Integer IZbdmjr1) {
		this.IZbdmjr1 = IZbdmjr1;
	}

	@Column(name = "I_ZBDMJR2", precision = 22, scale = 0)
	public Integer getIZbdmjr2() {
		return this.IZbdmjr2;
	}

	public void setIZbdmjr2(Integer IZbdmjr2) {
		this.IZbdmjr2 = IZbdmjr2;
	}

	@Column(name = "I_ZBDMJR3", precision = 22, scale = 0)
	public Integer getIZbdmjr3() {
		return this.IZbdmjr3;
	}

	public void setIZbdmjr3(Integer IZbdmjr3) {
		this.IZbdmjr3 = IZbdmjr3;
	}

	@Column(name = "I_ZBDMXS1", precision = 22, scale = 0)
	public Integer getIZbdmxs1() {
		return this.IZbdmxs1;
	}

	public void setIZbdmxs1(Integer IZbdmxs1) {
		this.IZbdmxs1 = IZbdmxs1;
	}

	@Column(name = "I_ZBDMXS2", precision = 22, scale = 0)
	public Integer getIZbdmxs2() {
		return this.IZbdmxs2;
	}

	public void setIZbdmxs2(Integer IZbdmxs2) {
		this.IZbdmxs2 = IZbdmxs2;
	}

	@Column(name = "I_ZBDMXS3", precision = 22, scale = 0)
	public Integer getIZbdmxs3() {
		return this.IZbdmxs3;
	}

	public void setIZbdmxs3(Integer IZbdmxs3) {
		this.IZbdmxs3 = IZbdmxs3;
	}

	@Column(name = "I_ZBDMBF", precision = 22, scale = 0)
	public Integer getIZbdmbf() {
		return this.IZbdmbf;
	}

	public void setIZbdmbf(Integer IZbdmbf) {
		this.IZbdmbf = IZbdmbf;
	}

}