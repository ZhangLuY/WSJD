package com.zrhis.wsjd.system.bean;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * SqglJtcygxyzxbsfjl entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "SQGL_JTCYGXYZXBSFJL", schema = "CXJM")
public class SqglJtcygxyzxbsfjl implements java.io.Serializable {

	// Fields

	private String VId;
	private String depId;
	private String CId;
	private String CGrbh;
	private Integer ISfclxy;
	private Integer IJgts;
	private Integer IClxyg;
	private Integer IClxyd;
	private Integer IBcxl;
	private Double NCltz;
	private Integer IZzty;
	private Integer IZztt;
	private Integer IZzfz;
	private Integer IZzch;
	private Integer IZzsl;
	private Integer IZzqt;
	private String VQtzz;
	private Integer ISffy;
	private String VYpmc1;
	private Double NMcjl1;
	private Integer IFycs1;
	private Integer IBlfy1;
	private String VYpmc2;
	private Double NMcjl2;
	private Integer IFycs2;
	private Integer IBlfy2;
	private String VYpmc3;
	private Double NMcjl3;
	private Integer IFycs3;
	private Integer IBlfy3;
	private String VYpmc4;
	private Double NMcjl4;
	private Integer IFycs4;
	private Integer IBlfy4;
	private String VYpmc5;
	private Double NMcjl5;
	private Integer IFycs5;
	private Integer IBlfy5;
	private String VYpmc6;
	private Double NMcjl6;
	private Integer IFycs6;
	private Integer IBlfy6;
	private String VYpmc7;
	private Double NMcjl7;
	private Integer IFycs7;
	private Integer IBlfy7;
	private String VYpmc8;
	private Double NMcjl8;
	private Integer IFycs8;
	private Integer IBlfy8;
	private Integer IFyqkyj;
	private Integer IFyqkcjs;
	private Integer IFyqkby;
	private Integer IGxyxy;
	private Integer IGxyjy;
	private Integer IGxyjj;
	private Integer IGxyss;
	private Integer IGxytz;
	private Integer IGxyyd;
	private Integer IGxyfs;
	private Integer IGxyqt;
	private String VGxyqt;
	private Date dtNext;
	private String VBdcz;
	private String VDcz;
	private String VFhz;
	private Date dtQmrq;
	private Date dtDcrq;
	private Date dtFhrq;
	private Date dtJlsj;
	private String CCzybh;
	private String VBz;
	private Integer ISffs;
	private Integer IZz1;
	private Integer IZz3;
	private Integer IZz4;
	private Integer IZz5;
	private Integer IZz6;
	private Integer IZz7;
	private Integer IZz8;
	private Integer IZz9;
	private Double NMbtz;
	private String VTzzs1;
	private String VTzzs2;
	private Integer IMbxl;
	private String VQttz;
	private Integer IXy;
	private Integer IXymb;
	private Integer IYj;
	private Integer IYjmb;
	private Integer IYdcs;
	private Integer IYdfz;
	private Integer IYdcsmb;
	private Integer IYdfzmb;
	private Integer ISy;
	private Integer ISymb;
	private Integer IXltz;
	private Integer IZyxw;
	private String VJcjg;
	private Integer IFyycx;
	private Integer ICcsffl;
	private String VYsxm;
	private Integer ISfzz;
	private String VZzyy;
	private String VZzjg;
	private String VZhxgr;
	private Date dtZhxgrq;
	private Integer IXgbz;
	private Integer IJlbz;
	private Integer ICsbz;
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
	private String VSy;

	// Constructors

	/** default constructor */
	public SqglJtcygxyzxbsfjl() {
	}

	/** minimal constructor */
	public SqglJtcygxyzxbsfjl(String VId, String depId, String CGrbh,
			Date dtJlsj) {
		this.VId = VId;
		this.depId = depId;
		this.CGrbh = CGrbh;
		this.dtJlsj = dtJlsj;
	}

	/** full constructor */
	public SqglJtcygxyzxbsfjl(String VId, String depId, String CId,
			String CGrbh, Integer ISfclxy, Integer IJgts,
			Integer IClxyg, Integer IClxyd, Integer IBcxl,
			Double NCltz, Integer IZzty, Integer IZztt, Integer IZzfz,
			Integer IZzch, Integer IZzsl, Integer IZzqt, String VQtzz,
			Integer ISffy, String VYpmc1, Double NMcjl1, Integer IFycs1,
			Integer IBlfy1, String VYpmc2, Double NMcjl2, Integer IFycs2,
			Integer IBlfy2, String VYpmc3, Double NMcjl3, Integer IFycs3,
			Integer IBlfy3, String VYpmc4, Double NMcjl4, Integer IFycs4,
			Integer IBlfy4, String VYpmc5, Double NMcjl5, Integer IFycs5,
			Integer IBlfy5, String VYpmc6, Double NMcjl6, Integer IFycs6,
			Integer IBlfy6, String VYpmc7, Double NMcjl7, Integer IFycs7,
			Integer IBlfy7, String VYpmc8, Double NMcjl8, Integer IFycs8,
			Integer IBlfy8, Integer IFyqkyj, Integer IFyqkcjs,
			Integer IFyqkby, Integer IGxyxy, Integer IGxyjy,
			Integer IGxyjj, Integer IGxyss, Integer IGxytz,
			Integer IGxyyd, Integer IGxyfs, Integer IGxyqt,
			String VGxyqt, Date dtNext, String VBdcz, String VDcz,
			String VFhz, Date dtQmrq, Date dtDcrq, Date dtFhrq,
			Date dtJlsj, String CCzybh, String VBz, Integer ISffs,
			Integer IZz1, Integer IZz3, Integer IZz4, Integer IZz5,
			Integer IZz6, Integer IZz7, Integer IZz8, Integer IZz9,
			Double NMbtz, String VTzzs1, String VTzzs2, Integer IMbxl,
			String VQttz, Integer IXy, Integer IXymb, Integer IYj,
			Integer IYjmb, Integer IYdcs, Integer IYdfz,
			Integer IYdcsmb, Integer IYdfzmb, Integer ISy,
			Integer ISymb, Integer IXltz, Integer IZyxw, String VJcjg,
			Integer IFyycx, Integer ICcsffl, String VYsxm,
			Integer ISfzz, String VZzyy, String VZzjg, String VZhxgr,
			Date dtZhxgrq, Integer IXgbz, Integer IJlbz,
			Integer ICsbz, String depName, Integer IUpload,
			Date dtUpload, Date dtCreate, String VXm, Short IXb,
			String VZjhm, Date dtCsrq, String VYktbh, String VBz1,
			String VBz2, String VBz3, Integer IHisto, String VSy) {
		this.VId = VId;
		this.depId = depId;
		this.CId = CId;
		this.CGrbh = CGrbh;
		this.ISfclxy = ISfclxy;
		this.IJgts = IJgts;
		this.IClxyg = IClxyg;
		this.IClxyd = IClxyd;
		this.IBcxl = IBcxl;
		this.NCltz = NCltz;
		this.IZzty = IZzty;
		this.IZztt = IZztt;
		this.IZzfz = IZzfz;
		this.IZzch = IZzch;
		this.IZzsl = IZzsl;
		this.IZzqt = IZzqt;
		this.VQtzz = VQtzz;
		this.ISffy = ISffy;
		this.VYpmc1 = VYpmc1;
		this.NMcjl1 = NMcjl1;
		this.IFycs1 = IFycs1;
		this.IBlfy1 = IBlfy1;
		this.VYpmc2 = VYpmc2;
		this.NMcjl2 = NMcjl2;
		this.IFycs2 = IFycs2;
		this.IBlfy2 = IBlfy2;
		this.VYpmc3 = VYpmc3;
		this.NMcjl3 = NMcjl3;
		this.IFycs3 = IFycs3;
		this.IBlfy3 = IBlfy3;
		this.VYpmc4 = VYpmc4;
		this.NMcjl4 = NMcjl4;
		this.IFycs4 = IFycs4;
		this.IBlfy4 = IBlfy4;
		this.VYpmc5 = VYpmc5;
		this.NMcjl5 = NMcjl5;
		this.IFycs5 = IFycs5;
		this.IBlfy5 = IBlfy5;
		this.VYpmc6 = VYpmc6;
		this.NMcjl6 = NMcjl6;
		this.IFycs6 = IFycs6;
		this.IBlfy6 = IBlfy6;
		this.VYpmc7 = VYpmc7;
		this.NMcjl7 = NMcjl7;
		this.IFycs7 = IFycs7;
		this.IBlfy7 = IBlfy7;
		this.VYpmc8 = VYpmc8;
		this.NMcjl8 = NMcjl8;
		this.IFycs8 = IFycs8;
		this.IBlfy8 = IBlfy8;
		this.IFyqkyj = IFyqkyj;
		this.IFyqkcjs = IFyqkcjs;
		this.IFyqkby = IFyqkby;
		this.IGxyxy = IGxyxy;
		this.IGxyjy = IGxyjy;
		this.IGxyjj = IGxyjj;
		this.IGxyss = IGxyss;
		this.IGxytz = IGxytz;
		this.IGxyyd = IGxyyd;
		this.IGxyfs = IGxyfs;
		this.IGxyqt = IGxyqt;
		this.VGxyqt = VGxyqt;
		this.dtNext = dtNext;
		this.VBdcz = VBdcz;
		this.VDcz = VDcz;
		this.VFhz = VFhz;
		this.dtQmrq = dtQmrq;
		this.dtDcrq = dtDcrq;
		this.dtFhrq = dtFhrq;
		this.dtJlsj = dtJlsj;
		this.CCzybh = CCzybh;
		this.VBz = VBz;
		this.ISffs = ISffs;
		this.IZz1 = IZz1;
		this.IZz3 = IZz3;
		this.IZz4 = IZz4;
		this.IZz5 = IZz5;
		this.IZz6 = IZz6;
		this.IZz7 = IZz7;
		this.IZz8 = IZz8;
		this.IZz9 = IZz9;
		this.NMbtz = NMbtz;
		this.VTzzs1 = VTzzs1;
		this.VTzzs2 = VTzzs2;
		this.IMbxl = IMbxl;
		this.VQttz = VQttz;
		this.IXy = IXy;
		this.IXymb = IXymb;
		this.IYj = IYj;
		this.IYjmb = IYjmb;
		this.IYdcs = IYdcs;
		this.IYdfz = IYdfz;
		this.IYdcsmb = IYdcsmb;
		this.IYdfzmb = IYdfzmb;
		this.ISy = ISy;
		this.ISymb = ISymb;
		this.IXltz = IXltz;
		this.IZyxw = IZyxw;
		this.VJcjg = VJcjg;
		this.IFyycx = IFyycx;
		this.ICcsffl = ICcsffl;
		this.VYsxm = VYsxm;
		this.ISfzz = ISfzz;
		this.VZzyy = VZzyy;
		this.VZzjg = VZzjg;
		this.VZhxgr = VZhxgr;
		this.dtZhxgrq = dtZhxgrq;
		this.IXgbz = IXgbz;
		this.IJlbz = IJlbz;
		this.ICsbz = ICsbz;
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
		this.VSy = VSy;
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

	@Column(name = "I_SFCLXY", precision = 22, scale = 0)
	public Integer getISfclxy() {
		return this.ISfclxy;
	}

	public void setISfclxy(Integer ISfclxy) {
		this.ISfclxy = ISfclxy;
	}

	@Column(name = "I_JGTS", precision = 22, scale = 0)
	public Integer getIJgts() {
		return this.IJgts;
	}

	public void setIJgts(Integer IJgts) {
		this.IJgts = IJgts;
	}

	@Column(name = "I_CLXYG", precision = 22, scale = 0)
	public Integer getIClxyg() {
		return this.IClxyg;
	}

	public void setIClxyg(Integer IClxyg) {
		this.IClxyg = IClxyg;
	}

	@Column(name = "I_CLXYD", precision = 22, scale = 0)
	public Integer getIClxyd() {
		return this.IClxyd;
	}

	public void setIClxyd(Integer IClxyd) {
		this.IClxyd = IClxyd;
	}

	@Column(name = "I_BCXL", precision = 22, scale = 0)
	public Integer getIBcxl() {
		return this.IBcxl;
	}

	public void setIBcxl(Integer IBcxl) {
		this.IBcxl = IBcxl;
	}

	@Column(name = "N_CLTZ")
	public Double getNCltz() {
		return this.NCltz;
	}

	public void setNCltz(Double NCltz) {
		this.NCltz = NCltz;
	}

	@Column(name = "I_ZZTY", precision = 22, scale = 0)
	public Integer getIZzty() {
		return this.IZzty;
	}

	public void setIZzty(Integer IZzty) {
		this.IZzty = IZzty;
	}

	@Column(name = "I_ZZTT", precision = 22, scale = 0)
	public Integer getIZztt() {
		return this.IZztt;
	}

	public void setIZztt(Integer IZztt) {
		this.IZztt = IZztt;
	}

	@Column(name = "I_ZZFZ", precision = 22, scale = 0)
	public Integer getIZzfz() {
		return this.IZzfz;
	}

	public void setIZzfz(Integer IZzfz) {
		this.IZzfz = IZzfz;
	}

	@Column(name = "I_ZZCH", precision = 22, scale = 0)
	public Integer getIZzch() {
		return this.IZzch;
	}

	public void setIZzch(Integer IZzch) {
		this.IZzch = IZzch;
	}

	@Column(name = "I_ZZSL", precision = 22, scale = 0)
	public Integer getIZzsl() {
		return this.IZzsl;
	}

	public void setIZzsl(Integer IZzsl) {
		this.IZzsl = IZzsl;
	}

	@Column(name = "I_ZZQT", precision = 22, scale = 0)
	public Integer getIZzqt() {
		return this.IZzqt;
	}

	public void setIZzqt(Integer IZzqt) {
		this.IZzqt = IZzqt;
	}

	@Column(name = "V_QTZZ", length = 50)
	public String getVQtzz() {
		return this.VQtzz;
	}

	public void setVQtzz(String VQtzz) {
		this.VQtzz = VQtzz;
	}

	@Column(name = "I_SFFY", precision = 22, scale = 0)
	public Integer getISffy() {
		return this.ISffy;
	}

	public void setISffy(Integer ISffy) {
		this.ISffy = ISffy;
	}

	@Column(name = "V_YPMC1", length = 50)
	public String getVYpmc1() {
		return this.VYpmc1;
	}

	public void setVYpmc1(String VYpmc1) {
		this.VYpmc1 = VYpmc1;
	}

	@Column(name = "N_MCJL1")
	public Double getNMcjl1() {
		return this.NMcjl1;
	}

	public void setNMcjl1(Double NMcjl1) {
		this.NMcjl1 = NMcjl1;
	}

	@Column(name = "I_FYCS1", precision = 22, scale = 0)
	public Integer getIFycs1() {
		return this.IFycs1;
	}

	public void setIFycs1(Integer IFycs1) {
		this.IFycs1 = IFycs1;
	}

	@Column(name = "I_BLFY1", precision = 22, scale = 0)
	public Integer getIBlfy1() {
		return this.IBlfy1;
	}

	public void setIBlfy1(Integer IBlfy1) {
		this.IBlfy1 = IBlfy1;
	}

	@Column(name = "V_YPMC2", length = 50)
	public String getVYpmc2() {
		return this.VYpmc2;
	}

	public void setVYpmc2(String VYpmc2) {
		this.VYpmc2 = VYpmc2;
	}

	@Column(name = "N_MCJL2")
	public Double getNMcjl2() {
		return this.NMcjl2;
	}

	public void setNMcjl2(Double NMcjl2) {
		this.NMcjl2 = NMcjl2;
	}

	@Column(name = "I_FYCS2", precision = 22, scale = 0)
	public Integer getIFycs2() {
		return this.IFycs2;
	}

	public void setIFycs2(Integer IFycs2) {
		this.IFycs2 = IFycs2;
	}

	@Column(name = "I_BLFY2", precision = 22, scale = 0)
	public Integer getIBlfy2() {
		return this.IBlfy2;
	}

	public void setIBlfy2(Integer IBlfy2) {
		this.IBlfy2 = IBlfy2;
	}

	@Column(name = "V_YPMC3", length = 50)
	public String getVYpmc3() {
		return this.VYpmc3;
	}

	public void setVYpmc3(String VYpmc3) {
		this.VYpmc3 = VYpmc3;
	}

	@Column(name = "N_MCJL3")
	public Double getNMcjl3() {
		return this.NMcjl3;
	}

	public void setNMcjl3(Double NMcjl3) {
		this.NMcjl3 = NMcjl3;
	}

	@Column(name = "I_FYCS3", precision = 22, scale = 0)
	public Integer getIFycs3() {
		return this.IFycs3;
	}

	public void setIFycs3(Integer IFycs3) {
		this.IFycs3 = IFycs3;
	}

	@Column(name = "I_BLFY3", precision = 22, scale = 0)
	public Integer getIBlfy3() {
		return this.IBlfy3;
	}

	public void setIBlfy3(Integer IBlfy3) {
		this.IBlfy3 = IBlfy3;
	}

	@Column(name = "V_YPMC4", length = 50)
	public String getVYpmc4() {
		return this.VYpmc4;
	}

	public void setVYpmc4(String VYpmc4) {
		this.VYpmc4 = VYpmc4;
	}

	@Column(name = "N_MCJL4")
	public Double getNMcjl4() {
		return this.NMcjl4;
	}

	public void setNMcjl4(Double NMcjl4) {
		this.NMcjl4 = NMcjl4;
	}

	@Column(name = "I_FYCS4", precision = 22, scale = 0)
	public Integer getIFycs4() {
		return this.IFycs4;
	}

	public void setIFycs4(Integer IFycs4) {
		this.IFycs4 = IFycs4;
	}

	@Column(name = "I_BLFY4", precision = 22, scale = 0)
	public Integer getIBlfy4() {
		return this.IBlfy4;
	}

	public void setIBlfy4(Integer IBlfy4) {
		this.IBlfy4 = IBlfy4;
	}

	@Column(name = "V_YPMC5", length = 50)
	public String getVYpmc5() {
		return this.VYpmc5;
	}

	public void setVYpmc5(String VYpmc5) {
		this.VYpmc5 = VYpmc5;
	}

	@Column(name = "N_MCJL5")
	public Double getNMcjl5() {
		return this.NMcjl5;
	}

	public void setNMcjl5(Double NMcjl5) {
		this.NMcjl5 = NMcjl5;
	}

	@Column(name = "I_FYCS5", precision = 22, scale = 0)
	public Integer getIFycs5() {
		return this.IFycs5;
	}

	public void setIFycs5(Integer IFycs5) {
		this.IFycs5 = IFycs5;
	}

	@Column(name = "I_BLFY5", precision = 22, scale = 0)
	public Integer getIBlfy5() {
		return this.IBlfy5;
	}

	public void setIBlfy5(Integer IBlfy5) {
		this.IBlfy5 = IBlfy5;
	}

	@Column(name = "V_YPMC6", length = 50)
	public String getVYpmc6() {
		return this.VYpmc6;
	}

	public void setVYpmc6(String VYpmc6) {
		this.VYpmc6 = VYpmc6;
	}

	@Column(name = "N_MCJL6")
	public Double getNMcjl6() {
		return this.NMcjl6;
	}

	public void setNMcjl6(Double NMcjl6) {
		this.NMcjl6 = NMcjl6;
	}

	@Column(name = "I_FYCS6", precision = 22, scale = 0)
	public Integer getIFycs6() {
		return this.IFycs6;
	}

	public void setIFycs6(Integer IFycs6) {
		this.IFycs6 = IFycs6;
	}

	@Column(name = "I_BLFY6", precision = 22, scale = 0)
	public Integer getIBlfy6() {
		return this.IBlfy6;
	}

	public void setIBlfy6(Integer IBlfy6) {
		this.IBlfy6 = IBlfy6;
	}

	@Column(name = "V_YPMC7", length = 50)
	public String getVYpmc7() {
		return this.VYpmc7;
	}

	public void setVYpmc7(String VYpmc7) {
		this.VYpmc7 = VYpmc7;
	}

	@Column(name = "N_MCJL7")
	public Double getNMcjl7() {
		return this.NMcjl7;
	}

	public void setNMcjl7(Double NMcjl7) {
		this.NMcjl7 = NMcjl7;
	}

	@Column(name = "I_FYCS7", precision = 22, scale = 0)
	public Integer getIFycs7() {
		return this.IFycs7;
	}

	public void setIFycs7(Integer IFycs7) {
		this.IFycs7 = IFycs7;
	}

	@Column(name = "I_BLFY7", precision = 22, scale = 0)
	public Integer getIBlfy7() {
		return this.IBlfy7;
	}

	public void setIBlfy7(Integer IBlfy7) {
		this.IBlfy7 = IBlfy7;
	}

	@Column(name = "V_YPMC8", length = 50)
	public String getVYpmc8() {
		return this.VYpmc8;
	}

	public void setVYpmc8(String VYpmc8) {
		this.VYpmc8 = VYpmc8;
	}

	@Column(name = "N_MCJL8")
	public Double getNMcjl8() {
		return this.NMcjl8;
	}

	public void setNMcjl8(Double NMcjl8) {
		this.NMcjl8 = NMcjl8;
	}

	@Column(name = "I_FYCS8", precision = 22, scale = 0)
	public Integer getIFycs8() {
		return this.IFycs8;
	}

	public void setIFycs8(Integer IFycs8) {
		this.IFycs8 = IFycs8;
	}

	@Column(name = "I_BLFY8", precision = 22, scale = 0)
	public Integer getIBlfy8() {
		return this.IBlfy8;
	}

	public void setIBlfy8(Integer IBlfy8) {
		this.IBlfy8 = IBlfy8;
	}

	@Column(name = "I_FYQKYJ", precision = 22, scale = 0)
	public Integer getIFyqkyj() {
		return this.IFyqkyj;
	}

	public void setIFyqkyj(Integer IFyqkyj) {
		this.IFyqkyj = IFyqkyj;
	}

	@Column(name = "I_FYQKCJS", precision = 22, scale = 0)
	public Integer getIFyqkcjs() {
		return this.IFyqkcjs;
	}

	public void setIFyqkcjs(Integer IFyqkcjs) {
		this.IFyqkcjs = IFyqkcjs;
	}

	@Column(name = "I_FYQKBY", precision = 22, scale = 0)
	public Integer getIFyqkby() {
		return this.IFyqkby;
	}

	public void setIFyqkby(Integer IFyqkby) {
		this.IFyqkby = IFyqkby;
	}

	@Column(name = "I_GXYXY", precision = 22, scale = 0)
	public Integer getIGxyxy() {
		return this.IGxyxy;
	}

	public void setIGxyxy(Integer IGxyxy) {
		this.IGxyxy = IGxyxy;
	}

	@Column(name = "I_GXYJY", precision = 22, scale = 0)
	public Integer getIGxyjy() {
		return this.IGxyjy;
	}

	public void setIGxyjy(Integer IGxyjy) {
		this.IGxyjy = IGxyjy;
	}

	@Column(name = "I_GXYJJ", precision = 22, scale = 0)
	public Integer getIGxyjj() {
		return this.IGxyjj;
	}

	public void setIGxyjj(Integer IGxyjj) {
		this.IGxyjj = IGxyjj;
	}

	@Column(name = "I_GXYSS", precision = 22, scale = 0)
	public Integer getIGxyss() {
		return this.IGxyss;
	}

	public void setIGxyss(Integer IGxyss) {
		this.IGxyss = IGxyss;
	}

	@Column(name = "I_GXYTZ", precision = 22, scale = 0)
	public Integer getIGxytz() {
		return this.IGxytz;
	}

	public void setIGxytz(Integer IGxytz) {
		this.IGxytz = IGxytz;
	}

	@Column(name = "I_GXYYD", precision = 22, scale = 0)
	public Integer getIGxyyd() {
		return this.IGxyyd;
	}

	public void setIGxyyd(Integer IGxyyd) {
		this.IGxyyd = IGxyyd;
	}

	@Column(name = "I_GXYFS", precision = 22, scale = 0)
	public Integer getIGxyfs() {
		return this.IGxyfs;
	}

	public void setIGxyfs(Integer IGxyfs) {
		this.IGxyfs = IGxyfs;
	}

	@Column(name = "I_GXYQT", precision = 22, scale = 0)
	public Integer getIGxyqt() {
		return this.IGxyqt;
	}

	public void setIGxyqt(Integer IGxyqt) {
		this.IGxyqt = IGxyqt;
	}

	@Column(name = "V_GXYQT", length = 100)
	public String getVGxyqt() {
		return this.VGxyqt;
	}

	public void setVGxyqt(String VGxyqt) {
		this.VGxyqt = VGxyqt;
	}

	@Column(name = "DT_NEXT", length = 7)
	public Date getDtNext() {
		return this.dtNext;
	}

	public void setDtNext(Date dtNext) {
		this.dtNext = dtNext;
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

	@Column(name = "I_SFFS", precision = 22, scale = 0)
	public Integer getISffs() {
		return this.ISffs;
	}

	public void setISffs(Integer ISffs) {
		this.ISffs = ISffs;
	}

	@Column(name = "I_ZZ1", precision = 22, scale = 0)
	public Integer getIZz1() {
		return this.IZz1;
	}

	public void setIZz1(Integer IZz1) {
		this.IZz1 = IZz1;
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

	@Column(name = "I_ZZ9", precision = 22, scale = 0)
	public Integer getIZz9() {
		return this.IZz9;
	}

	public void setIZz9(Integer IZz9) {
		this.IZz9 = IZz9;
	}

	@Column(name = "N_MBTZ", precision = 10)
	public Double getNMbtz() {
		return this.NMbtz;
	}

	public void setNMbtz(Double NMbtz) {
		this.NMbtz = NMbtz;
	}

	@Column(name = "V_TZZS1", length = 10)
	public String getVTzzs1() {
		return this.VTzzs1;
	}

	public void setVTzzs1(String VTzzs1) {
		this.VTzzs1 = VTzzs1;
	}

	@Column(name = "V_TZZS2", length = 10)
	public String getVTzzs2() {
		return this.VTzzs2;
	}

	public void setVTzzs2(String VTzzs2) {
		this.VTzzs2 = VTzzs2;
	}

	@Column(name = "I_MBXL", precision = 22, scale = 0)
	public Integer getIMbxl() {
		return this.IMbxl;
	}

	public void setIMbxl(Integer IMbxl) {
		this.IMbxl = IMbxl;
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

	@Column(name = "I_SY", precision = 22, scale = 0)
	public Integer getISy() {
		return this.ISy;
	}

	public void setISy(Integer ISy) {
		this.ISy = ISy;
	}

	@Column(name = "I_SYMB", precision = 22, scale = 0)
	public Integer getISymb() {
		return this.ISymb;
	}

	public void setISymb(Integer ISymb) {
		this.ISymb = ISymb;
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

	@Column(name = "I_CCSFFL", precision = 22, scale = 0)
	public Integer getICcsffl() {
		return this.ICcsffl;
	}

	public void setICcsffl(Integer ICcsffl) {
		this.ICcsffl = ICcsffl;
	}

	@Column(name = "V_YSXM", length = 20)
	public String getVYsxm() {
		return this.VYsxm;
	}

	public void setVYsxm(String VYsxm) {
		this.VYsxm = VYsxm;
	}

	@Column(name = "I_SFZZ", precision = 22, scale = 0)
	public Integer getISfzz() {
		return this.ISfzz;
	}

	public void setISfzz(Integer ISfzz) {
		this.ISfzz = ISfzz;
	}

	@Column(name = "V_ZZYY", length = 100)
	public String getVZzyy() {
		return this.VZzyy;
	}

	public void setVZzyy(String VZzyy) {
		this.VZzyy = VZzyy;
	}

	@Column(name = "V_ZZJG", length = 100)
	public String getVZzjg() {
		return this.VZzjg;
	}

	public void setVZzjg(String VZzjg) {
		this.VZzjg = VZzjg;
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

	@Column(name = "V_SY", length = 100)
	public String getVSy() {
		return this.VSy;
	}

	public void setVSy(String VSy) {
		this.VSy = VSy;
	}

}