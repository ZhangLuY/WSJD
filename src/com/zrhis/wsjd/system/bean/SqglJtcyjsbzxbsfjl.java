package com.zrhis.wsjd.system.bean;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * SqglJtcyjsbzxbsfjl entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="SQGL_JTCYJSBZXBSFJL"
    ,schema="CXJM"
)

public class SqglJtcyjsbzxbsfjl  implements java.io.Serializable {


    // Fields    

     private String VId;
     private String depId;
     private String CId;
     private String CGrbh;
     private Integer IZzhj;
     private Integer IZzjl;
     private Integer IZzcy;
     private Integer IZzxn;
     private Integer IZzxw;
     private Integer IZzxf;
     private Integer IZzsr;
     private Integer IZzbg;
     private Integer IZzwz;
     private Integer IZzzy;
     private Integer IZzgp;
     private String VZzqt;
     private Integer IZzl;
     private Integer ISmqk;
     private Integer IYsqk;
     private Integer IShgr;
     private Integer IShjw;
     private Integer IShld;
     private Integer IShxx;
     private Integer IShrj;
     private String VSysjc;
     private Integer IFyycx;
     private Integer IBlfy;
     private String VBlfy;
     private Integer IZlxg;
     private Integer ISffl;
     private Integer ISfzz;
     private String VZzyy;
     private String VZzjg;
     private String VYpmc1;
     private Integer IFycs1;
     private Double NMcjl1;
     private String VYpmc2;
     private Integer IFycs2;
     private Double NMcjl2;
     private String VYpmc3;
     private Integer IFycs3;
     private Double NMcjl3;
     private Integer IKfcs1;
     private Integer IKfcs2;
     private Integer IKfcs3;
     private Integer IKfcs4;
     private Integer IKfcs5;
     private String VKfcs;
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
     private Integer IYxcs1;
     private Integer IYxcs2;
     private Integer IYxcs3;
     private Integer IYxcs4;
     private Integer IYxcs5;
     private Integer IYxcs6;
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
     private Short IWxx;
     private Short IGszt;
     private Short IZyqk;
     private Date dtMccy;
     private Integer ICsbz;
     private Integer IHisto;
     private Integer ISffs;
     private Integer ISfyy;
     private Date dtSwrq;
     private Integer ISwyy;
     private Integer ISwjb0;
     private Integer ISwjb1;
     private Integer ISwjb2;
     private Integer ISwjb3;
     private Integer ISwjb4;
     private Integer ISwjb5;
     private Integer ISwjb6;
     private Integer ISwjb7;
     private String VYpmc4;
     private Integer IFycs4;
     private Double NMcjl4;
     private String VYpmc5;
     private Integer IFycs5;
     private Double NMcjl5;
     private String VYpmc6;
     private Integer IFycs6;
     private Double NMcjl6;
     private Integer IYxcs7;
     private Integer IPjzt;
     private Integer ISflx;
     private Integer IYstqjh;
     private Integer IYstd;
     private Integer IPjfs;
     private String VPjnr;
     private Date dtPjsj;
     private String CPjrgrbh;
     private String CUserbh;


    // Constructors

    /** default constructor */
    public SqglJtcyjsbzxbsfjl() {
    }

	/** minimal constructor */
    public SqglJtcyjsbzxbsfjl(String VId, String CGrbh, Date dtJlsj, String CCzybh) {
        this.VId = VId;
        this.CGrbh = CGrbh;
        this.dtJlsj = dtJlsj;
        this.CCzybh = CCzybh;
    }
    
    /** full constructor */
    public SqglJtcyjsbzxbsfjl(String VId, String depId, String CId, String CGrbh, Integer IZzhj, Integer IZzjl, Integer IZzcy, Integer IZzxn, Integer IZzxw, Integer IZzxf, Integer IZzsr, Integer IZzbg, Integer IZzwz, Integer IZzzy, Integer IZzgp, String VZzqt, Integer IZzl, Integer ISmqk, Integer IYsqk, Integer IShgr, Integer IShjw, Integer IShld, Integer IShxx, Integer IShrj, String VSysjc, Integer IFyycx, Integer IBlfy, String VBlfy, Integer IZlxg, Integer ISffl, Integer ISfzz, String VZzyy, String VZzjg, String VYpmc1, Integer IFycs1, Double NMcjl1, String VYpmc2, Integer IFycs2, Double NMcjl2, String VYpmc3, Integer IFycs3, Double NMcjl3, Integer IKfcs1, Integer IKfcs2, Integer IKfcs3, Integer IKfcs4, Integer IKfcs5, String VKfcs, Date dtNext, String VBdcz, String VDcz, String VFhz, Date dtQmrq, Date dtDcrq, Date dtFhrq, Date dtJlsj, String CCzybh, String VBz, Integer IYxcs1, Integer IYxcs2, Integer IYxcs3, Integer IYxcs4, Integer IYxcs5, Integer IYxcs6, String depName, Integer IUpload, Date dtUpload, Date dtCreate, String VXm, Short IXb, String VZjhm, Date dtCsrq, String VYktbh, String VBz1, String VBz2, String VBz3, Short IWxx, Short IGszt, Short IZyqk, Date dtMccy, Integer ICsbz, Integer IHisto, Integer ISffs, Integer ISfyy, Date dtSwrq, Integer ISwyy, Integer ISwjb0, Integer ISwjb1, Integer ISwjb2, Integer ISwjb3, Integer ISwjb4, Integer ISwjb5, Integer ISwjb6, Integer ISwjb7, String VYpmc4, Integer IFycs4, Double NMcjl4, String VYpmc5, Integer IFycs5, Double NMcjl5, String VYpmc6, Integer IFycs6, Double NMcjl6, Integer IYxcs7, Integer IPjzt, Integer ISflx, Integer IYstqjh, Integer IYstd, Integer IPjfs, String VPjnr, Date dtPjsj, String CPjrgrbh, String CUserbh) {
        this.VId = VId;
        this.depId = depId;
        this.CId = CId;
        this.CGrbh = CGrbh;
        this.IZzhj = IZzhj;
        this.IZzjl = IZzjl;
        this.IZzcy = IZzcy;
        this.IZzxn = IZzxn;
        this.IZzxw = IZzxw;
        this.IZzxf = IZzxf;
        this.IZzsr = IZzsr;
        this.IZzbg = IZzbg;
        this.IZzwz = IZzwz;
        this.IZzzy = IZzzy;
        this.IZzgp = IZzgp;
        this.VZzqt = VZzqt;
        this.IZzl = IZzl;
        this.ISmqk = ISmqk;
        this.IYsqk = IYsqk;
        this.IShgr = IShgr;
        this.IShjw = IShjw;
        this.IShld = IShld;
        this.IShxx = IShxx;
        this.IShrj = IShrj;
        this.VSysjc = VSysjc;
        this.IFyycx = IFyycx;
        this.IBlfy = IBlfy;
        this.VBlfy = VBlfy;
        this.IZlxg = IZlxg;
        this.ISffl = ISffl;
        this.ISfzz = ISfzz;
        this.VZzyy = VZzyy;
        this.VZzjg = VZzjg;
        this.VYpmc1 = VYpmc1;
        this.IFycs1 = IFycs1;
        this.NMcjl1 = NMcjl1;
        this.VYpmc2 = VYpmc2;
        this.IFycs2 = IFycs2;
        this.NMcjl2 = NMcjl2;
        this.VYpmc3 = VYpmc3;
        this.IFycs3 = IFycs3;
        this.NMcjl3 = NMcjl3;
        this.IKfcs1 = IKfcs1;
        this.IKfcs2 = IKfcs2;
        this.IKfcs3 = IKfcs3;
        this.IKfcs4 = IKfcs4;
        this.IKfcs5 = IKfcs5;
        this.VKfcs = VKfcs;
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
        this.IYxcs1 = IYxcs1;
        this.IYxcs2 = IYxcs2;
        this.IYxcs3 = IYxcs3;
        this.IYxcs4 = IYxcs4;
        this.IYxcs5 = IYxcs5;
        this.IYxcs6 = IYxcs6;
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
        this.IWxx = IWxx;
        this.IGszt = IGszt;
        this.IZyqk = IZyqk;
        this.dtMccy = dtMccy;
        this.ICsbz = ICsbz;
        this.IHisto = IHisto;
        this.ISffs = ISffs;
        this.ISfyy = ISfyy;
        this.dtSwrq = dtSwrq;
        this.ISwyy = ISwyy;
        this.ISwjb0 = ISwjb0;
        this.ISwjb1 = ISwjb1;
        this.ISwjb2 = ISwjb2;
        this.ISwjb3 = ISwjb3;
        this.ISwjb4 = ISwjb4;
        this.ISwjb5 = ISwjb5;
        this.ISwjb6 = ISwjb6;
        this.ISwjb7 = ISwjb7;
        this.VYpmc4 = VYpmc4;
        this.IFycs4 = IFycs4;
        this.NMcjl4 = NMcjl4;
        this.VYpmc5 = VYpmc5;
        this.IFycs5 = IFycs5;
        this.NMcjl5 = NMcjl5;
        this.VYpmc6 = VYpmc6;
        this.IFycs6 = IFycs6;
        this.NMcjl6 = NMcjl6;
        this.IYxcs7 = IYxcs7;
        this.IPjzt = IPjzt;
        this.ISflx = ISflx;
        this.IYstqjh = IYstqjh;
        this.IYstd = IYstd;
        this.IPjfs = IPjfs;
        this.VPjnr = VPjnr;
        this.dtPjsj = dtPjsj;
        this.CPjrgrbh = CPjrgrbh;
        this.CUserbh = CUserbh;
    }

   
    // Property accessors
    @Id 
    
    @Column(name="V_ID", unique=true, nullable=false, length=100)

    public String getVId() {
        return this.VId;
    }
    
    public void setVId(String VId) {
        this.VId = VId;
    }
    
    @Column(name="DEP_ID", length=100)

    public String getDepId() {
        return this.depId;
    }
    
    public void setDepId(String depId) {
        this.depId = depId;
    }
    
    @Column(name="C_ID", length=14)

    public String getCId() {
        return this.CId;
    }
    
    public void setCId(String CId) {
        this.CId = CId;
    }
    
    @Column(name="C_GRBH", nullable=false, length=22)

    public String getCGrbh() {
        return this.CGrbh;
    }
    
    public void setCGrbh(String CGrbh) {
        this.CGrbh = CGrbh;
    }
    
    @Column(name="I_ZZHJ", precision=22, scale=0)

    public Integer getIZzhj() {
        return this.IZzhj;
    }
    
    public void setIZzhj(Integer IZzhj) {
        this.IZzhj = IZzhj;
    }
    
    @Column(name="I_ZZJL", precision=22, scale=0)

    public Integer getIZzjl() {
        return this.IZzjl;
    }
    
    public void setIZzjl(Integer IZzjl) {
        this.IZzjl = IZzjl;
    }
    
    @Column(name="I_ZZCY", precision=22, scale=0)

    public Integer getIZzcy() {
        return this.IZzcy;
    }
    
    public void setIZzcy(Integer IZzcy) {
        this.IZzcy = IZzcy;
    }
    
    @Column(name="I_ZZXN", precision=22, scale=0)

    public Integer getIZzxn() {
        return this.IZzxn;
    }
    
    public void setIZzxn(Integer IZzxn) {
        this.IZzxn = IZzxn;
    }
    
    @Column(name="I_ZZXW", precision=22, scale=0)

    public Integer getIZzxw() {
        return this.IZzxw;
    }
    
    public void setIZzxw(Integer IZzxw) {
        this.IZzxw = IZzxw;
    }
    
    @Column(name="I_ZZXF", precision=22, scale=0)

    public Integer getIZzxf() {
        return this.IZzxf;
    }
    
    public void setIZzxf(Integer IZzxf) {
        this.IZzxf = IZzxf;
    }
    
    @Column(name="I_ZZSR", precision=22, scale=0)

    public Integer getIZzsr() {
        return this.IZzsr;
    }
    
    public void setIZzsr(Integer IZzsr) {
        this.IZzsr = IZzsr;
    }
    
    @Column(name="I_ZZBG", precision=22, scale=0)

    public Integer getIZzbg() {
        return this.IZzbg;
    }
    
    public void setIZzbg(Integer IZzbg) {
        this.IZzbg = IZzbg;
    }
    
    @Column(name="I_ZZWZ", precision=22, scale=0)

    public Integer getIZzwz() {
        return this.IZzwz;
    }
    
    public void setIZzwz(Integer IZzwz) {
        this.IZzwz = IZzwz;
    }
    
    @Column(name="I_ZZZY", precision=22, scale=0)

    public Integer getIZzzy() {
        return this.IZzzy;
    }
    
    public void setIZzzy(Integer IZzzy) {
        this.IZzzy = IZzzy;
    }
    
    @Column(name="I_ZZGP", precision=22, scale=0)

    public Integer getIZzgp() {
        return this.IZzgp;
    }
    
    public void setIZzgp(Integer IZzgp) {
        this.IZzgp = IZzgp;
    }
    
    @Column(name="V_ZZQT", length=100)

    public String getVZzqt() {
        return this.VZzqt;
    }
    
    public void setVZzqt(String VZzqt) {
        this.VZzqt = VZzqt;
    }
    
    @Column(name="I_ZZL", precision=22, scale=0)

    public Integer getIZzl() {
        return this.IZzl;
    }
    
    public void setIZzl(Integer IZzl) {
        this.IZzl = IZzl;
    }
    
    @Column(name="I_SMQK", precision=22, scale=0)

    public Integer getISmqk() {
        return this.ISmqk;
    }
    
    public void setISmqk(Integer ISmqk) {
        this.ISmqk = ISmqk;
    }
    
    @Column(name="I_YSQK", precision=22, scale=0)

    public Integer getIYsqk() {
        return this.IYsqk;
    }
    
    public void setIYsqk(Integer IYsqk) {
        this.IYsqk = IYsqk;
    }
    
    @Column(name="I_SHGR", precision=22, scale=0)

    public Integer getIShgr() {
        return this.IShgr;
    }
    
    public void setIShgr(Integer IShgr) {
        this.IShgr = IShgr;
    }
    
    @Column(name="I_SHJW", precision=22, scale=0)

    public Integer getIShjw() {
        return this.IShjw;
    }
    
    public void setIShjw(Integer IShjw) {
        this.IShjw = IShjw;
    }
    
    @Column(name="I_SHLD", precision=22, scale=0)

    public Integer getIShld() {
        return this.IShld;
    }
    
    public void setIShld(Integer IShld) {
        this.IShld = IShld;
    }
    
    @Column(name="I_SHXX", precision=22, scale=0)

    public Integer getIShxx() {
        return this.IShxx;
    }
    
    public void setIShxx(Integer IShxx) {
        this.IShxx = IShxx;
    }
    
    @Column(name="I_SHRJ", precision=22, scale=0)

    public Integer getIShrj() {
        return this.IShrj;
    }
    
    public void setIShrj(Integer IShrj) {
        this.IShrj = IShrj;
    }
    
    @Column(name="V_SYSJC")

    public String getVSysjc() {
        return this.VSysjc;
    }
    
    public void setVSysjc(String VSysjc) {
        this.VSysjc = VSysjc;
    }
    
    @Column(name="I_FYYCX", precision=22, scale=0)

    public Integer getIFyycx() {
        return this.IFyycx;
    }
    
    public void setIFyycx(Integer IFyycx) {
        this.IFyycx = IFyycx;
    }
    
    @Column(name="I_BLFY", precision=22, scale=0)

    public Integer getIBlfy() {
        return this.IBlfy;
    }
    
    public void setIBlfy(Integer IBlfy) {
        this.IBlfy = IBlfy;
    }
    
    @Column(name="V_BLFY")

    public String getVBlfy() {
        return this.VBlfy;
    }
    
    public void setVBlfy(String VBlfy) {
        this.VBlfy = VBlfy;
    }
    
    @Column(name="I_ZLXG", precision=22, scale=0)

    public Integer getIZlxg() {
        return this.IZlxg;
    }
    
    public void setIZlxg(Integer IZlxg) {
        this.IZlxg = IZlxg;
    }
    
    @Column(name="I_SFFL", precision=22, scale=0)

    public Integer getISffl() {
        return this.ISffl;
    }
    
    public void setISffl(Integer ISffl) {
        this.ISffl = ISffl;
    }
    
    @Column(name="I_SFZZ", precision=22, scale=0)

    public Integer getISfzz() {
        return this.ISfzz;
    }
    
    public void setISfzz(Integer ISfzz) {
        this.ISfzz = ISfzz;
    }
    
    @Column(name="V_ZZYY")

    public String getVZzyy() {
        return this.VZzyy;
    }
    
    public void setVZzyy(String VZzyy) {
        this.VZzyy = VZzyy;
    }
    
    @Column(name="V_ZZJG")

    public String getVZzjg() {
        return this.VZzjg;
    }
    
    public void setVZzjg(String VZzjg) {
        this.VZzjg = VZzjg;
    }
    
    @Column(name="V_YPMC1", length=50)

    public String getVYpmc1() {
        return this.VYpmc1;
    }
    
    public void setVYpmc1(String VYpmc1) {
        this.VYpmc1 = VYpmc1;
    }
    
    @Column(name="I_FYCS1", precision=22, scale=0)

    public Integer getIFycs1() {
        return this.IFycs1;
    }
    
    public void setIFycs1(Integer IFycs1) {
        this.IFycs1 = IFycs1;
    }
    
    @Column(name="N_MCJL1")

    public Double getNMcjl1() {
        return this.NMcjl1;
    }
    
    public void setNMcjl1(Double NMcjl1) {
        this.NMcjl1 = NMcjl1;
    }
    
    @Column(name="V_YPMC2", length=50)

    public String getVYpmc2() {
        return this.VYpmc2;
    }
    
    public void setVYpmc2(String VYpmc2) {
        this.VYpmc2 = VYpmc2;
    }
    
    @Column(name="I_FYCS2", precision=22, scale=0)

    public Integer getIFycs2() {
        return this.IFycs2;
    }
    
    public void setIFycs2(Integer IFycs2) {
        this.IFycs2 = IFycs2;
    }
    
    @Column(name="N_MCJL2")

    public Double getNMcjl2() {
        return this.NMcjl2;
    }
    
    public void setNMcjl2(Double NMcjl2) {
        this.NMcjl2 = NMcjl2;
    }
    
    @Column(name="V_YPMC3", length=50)

    public String getVYpmc3() {
        return this.VYpmc3;
    }
    
    public void setVYpmc3(String VYpmc3) {
        this.VYpmc3 = VYpmc3;
    }
    
    @Column(name="I_FYCS3", precision=22, scale=0)

    public Integer getIFycs3() {
        return this.IFycs3;
    }
    
    public void setIFycs3(Integer IFycs3) {
        this.IFycs3 = IFycs3;
    }
    
    @Column(name="N_MCJL3")

    public Double getNMcjl3() {
        return this.NMcjl3;
    }
    
    public void setNMcjl3(Double NMcjl3) {
        this.NMcjl3 = NMcjl3;
    }
    
    @Column(name="I_KFCS1", precision=22, scale=0)

    public Integer getIKfcs1() {
        return this.IKfcs1;
    }
    
    public void setIKfcs1(Integer IKfcs1) {
        this.IKfcs1 = IKfcs1;
    }
    
    @Column(name="I_KFCS2", precision=22, scale=0)

    public Integer getIKfcs2() {
        return this.IKfcs2;
    }
    
    public void setIKfcs2(Integer IKfcs2) {
        this.IKfcs2 = IKfcs2;
    }
    
    @Column(name="I_KFCS3", precision=22, scale=0)

    public Integer getIKfcs3() {
        return this.IKfcs3;
    }
    
    public void setIKfcs3(Integer IKfcs3) {
        this.IKfcs3 = IKfcs3;
    }
    
    @Column(name="I_KFCS4", precision=22, scale=0)

    public Integer getIKfcs4() {
        return this.IKfcs4;
    }
    
    public void setIKfcs4(Integer IKfcs4) {
        this.IKfcs4 = IKfcs4;
    }
    
    @Column(name="I_KFCS5", precision=22, scale=0)

    public Integer getIKfcs5() {
        return this.IKfcs5;
    }
    
    public void setIKfcs5(Integer IKfcs5) {
        this.IKfcs5 = IKfcs5;
    }
    
    @Column(name="V_KFCS")

    public String getVKfcs() {
        return this.VKfcs;
    }
    
    public void setVKfcs(String VKfcs) {
        this.VKfcs = VKfcs;
    }
    
    @Column(name="DT_NEXT", length=7)

    public Date getDtNext() {
        return this.dtNext;
    }
    
    public void setDtNext(Date dtNext) {
        this.dtNext = dtNext;
    }
    
    @Column(name="V_BDCZ", length=10)

    public String getVBdcz() {
        return this.VBdcz;
    }
    
    public void setVBdcz(String VBdcz) {
        this.VBdcz = VBdcz;
    }
    
    @Column(name="V_DCZ", length=10)

    public String getVDcz() {
        return this.VDcz;
    }
    
    public void setVDcz(String VDcz) {
        this.VDcz = VDcz;
    }
    
    @Column(name="V_FHZ", length=10)

    public String getVFhz() {
        return this.VFhz;
    }
    
    public void setVFhz(String VFhz) {
        this.VFhz = VFhz;
    }
    
    @Column(name="DT_QMRQ", length=7)

    public Date getDtQmrq() {
        return this.dtQmrq;
    }
    
    public void setDtQmrq(Date dtQmrq) {
        this.dtQmrq = dtQmrq;
    }
    
    @Column(name="DT_DCRQ", length=7)

    public Date getDtDcrq() {
        return this.dtDcrq;
    }
    
    public void setDtDcrq(Date dtDcrq) {
        this.dtDcrq = dtDcrq;
    }
    
    @Column(name="DT_FHRQ", length=7)

    public Date getDtFhrq() {
        return this.dtFhrq;
    }
    
    public void setDtFhrq(Date dtFhrq) {
        this.dtFhrq = dtFhrq;
    }
    
    @Column(name="DT_JLSJ", nullable=false, length=7)

    public Date getDtJlsj() {
        return this.dtJlsj;
    }
    
    public void setDtJlsj(Date dtJlsj) {
        this.dtJlsj = dtJlsj;
    }
    
    @Column(name="C_CZYBH", nullable=false, length=50)

    public String getCCzybh() {
        return this.CCzybh;
    }
    
    public void setCCzybh(String CCzybh) {
        this.CCzybh = CCzybh;
    }
    
    @Column(name="V_BZ", length=60)

    public String getVBz() {
        return this.VBz;
    }
    
    public void setVBz(String VBz) {
        this.VBz = VBz;
    }
    
    @Column(name="I_YXCS1", precision=22, scale=0)

    public Integer getIYxcs1() {
        return this.IYxcs1;
    }
    
    public void setIYxcs1(Integer IYxcs1) {
        this.IYxcs1 = IYxcs1;
    }
    
    @Column(name="I_YXCS2", precision=22, scale=0)

    public Integer getIYxcs2() {
        return this.IYxcs2;
    }
    
    public void setIYxcs2(Integer IYxcs2) {
        this.IYxcs2 = IYxcs2;
    }
    
    @Column(name="I_YXCS3", precision=22, scale=0)

    public Integer getIYxcs3() {
        return this.IYxcs3;
    }
    
    public void setIYxcs3(Integer IYxcs3) {
        this.IYxcs3 = IYxcs3;
    }
    
    @Column(name="I_YXCS4", precision=22, scale=0)

    public Integer getIYxcs4() {
        return this.IYxcs4;
    }
    
    public void setIYxcs4(Integer IYxcs4) {
        this.IYxcs4 = IYxcs4;
    }
    
    @Column(name="I_YXCS5", precision=22, scale=0)

    public Integer getIYxcs5() {
        return this.IYxcs5;
    }
    
    public void setIYxcs5(Integer IYxcs5) {
        this.IYxcs5 = IYxcs5;
    }
    
    @Column(name="I_YXCS6", precision=22, scale=0)

    public Integer getIYxcs6() {
        return this.IYxcs6;
    }
    
    public void setIYxcs6(Integer IYxcs6) {
        this.IYxcs6 = IYxcs6;
    }
    
    @Column(name="DEP_NAME")

    public String getDepName() {
        return this.depName;
    }
    
    public void setDepName(String depName) {
        this.depName = depName;
    }
    
    @Column(name="I_UPLOAD", precision=22, scale=0)

    public Integer getIUpload() {
        return this.IUpload;
    }
    
    public void setIUpload(Integer IUpload) {
        this.IUpload = IUpload;
    }
    
    @Column(name="DT_UPLOAD", length=7)

    public Date getDtUpload() {
        return this.dtUpload;
    }
    
    public void setDtUpload(Date dtUpload) {
        this.dtUpload = dtUpload;
    }
    
    @Column(name="DT_CREATE", length=7)

    public Date getDtCreate() {
        return this.dtCreate;
    }
    
    public void setDtCreate(Date dtCreate) {
        this.dtCreate = dtCreate;
    }
    
    @Column(name="V_XM", length=60)

    public String getVXm() {
        return this.VXm;
    }
    
    public void setVXm(String VXm) {
        this.VXm = VXm;
    }
    
    @Column(name="I_XB", precision=4, scale=0)

    public Short getIXb() {
        return this.IXb;
    }
    
    public void setIXb(Short IXb) {
        this.IXb = IXb;
    }
    
    @Column(name="V_ZJHM", length=20)

    public String getVZjhm() {
        return this.VZjhm;
    }
    
    public void setVZjhm(String VZjhm) {
        this.VZjhm = VZjhm;
    }
    
    @Column(name="DT_CSRQ", length=7)

    public Date getDtCsrq() {
        return this.dtCsrq;
    }
    
    public void setDtCsrq(Date dtCsrq) {
        this.dtCsrq = dtCsrq;
    }
    
    @Column(name="V_YKTBH", length=100)

    public String getVYktbh() {
        return this.VYktbh;
    }
    
    public void setVYktbh(String VYktbh) {
        this.VYktbh = VYktbh;
    }
    
    @Column(name="V_BZ1", length=100)

    public String getVBz1() {
        return this.VBz1;
    }
    
    public void setVBz1(String VBz1) {
        this.VBz1 = VBz1;
    }
    
    @Column(name="V_BZ2", length=100)

    public String getVBz2() {
        return this.VBz2;
    }
    
    public void setVBz2(String VBz2) {
        this.VBz2 = VBz2;
    }
    
    @Column(name="V_BZ3", length=100)

    public String getVBz3() {
        return this.VBz3;
    }
    
    public void setVBz3(String VBz3) {
        this.VBz3 = VBz3;
    }
    
    @Column(name="I_WXX", precision=4, scale=0)

    public Short getIWxx() {
        return this.IWxx;
    }
    
    public void setIWxx(Short IWxx) {
        this.IWxx = IWxx;
    }
    
    @Column(name="I_GSZT", precision=4, scale=0)

    public Short getIGszt() {
        return this.IGszt;
    }
    
    public void setIGszt(Short IGszt) {
        this.IGszt = IGszt;
    }
    
    @Column(name="I_ZYQK", precision=4, scale=0)

    public Short getIZyqk() {
        return this.IZyqk;
    }
    
    public void setIZyqk(Short IZyqk) {
        this.IZyqk = IZyqk;
    }
    
    @Column(name="DT_MCCY", length=7)

    public Date getDtMccy() {
        return this.dtMccy;
    }
    
    public void setDtMccy(Date dtMccy) {
        this.dtMccy = dtMccy;
    }
    
    @Column(name="I_CSBZ", precision=22, scale=0)

    public Integer getICsbz() {
        return this.ICsbz;
    }
    
    public void setICsbz(Integer ICsbz) {
        this.ICsbz = ICsbz;
    }
    
    @Column(name="I_HISTO", precision=22, scale=0)

    public Integer getIHisto() {
        return this.IHisto;
    }
    
    public void setIHisto(Integer IHisto) {
        this.IHisto = IHisto;
    }
    
    @Column(name="I_SFFS", precision=22, scale=0)

    public Integer getISffs() {
        return this.ISffs;
    }
    
    public void setISffs(Integer ISffs) {
        this.ISffs = ISffs;
    }
    
    @Column(name="I_SFYY", precision=22, scale=0)

    public Integer getISfyy() {
        return this.ISfyy;
    }
    
    public void setISfyy(Integer ISfyy) {
        this.ISfyy = ISfyy;
    }
    
    @Column(name="DT_SWRQ", length=7)

    public Date getDtSwrq() {
        return this.dtSwrq;
    }
    
    public void setDtSwrq(Date dtSwrq) {
        this.dtSwrq = dtSwrq;
    }
    
    @Column(name="I_SWYY", precision=22, scale=0)

    public Integer getISwyy() {
        return this.ISwyy;
    }
    
    public void setISwyy(Integer ISwyy) {
        this.ISwyy = ISwyy;
    }
    
    @Column(name="I_SWJB0", precision=22, scale=0)

    public Integer getISwjb0() {
        return this.ISwjb0;
    }
    
    public void setISwjb0(Integer ISwjb0) {
        this.ISwjb0 = ISwjb0;
    }
    
    @Column(name="I_SWJB1", precision=22, scale=0)

    public Integer getISwjb1() {
        return this.ISwjb1;
    }
    
    public void setISwjb1(Integer ISwjb1) {
        this.ISwjb1 = ISwjb1;
    }
    
    @Column(name="I_SWJB2", precision=22, scale=0)

    public Integer getISwjb2() {
        return this.ISwjb2;
    }
    
    public void setISwjb2(Integer ISwjb2) {
        this.ISwjb2 = ISwjb2;
    }
    
    @Column(name="I_SWJB3", precision=22, scale=0)

    public Integer getISwjb3() {
        return this.ISwjb3;
    }
    
    public void setISwjb3(Integer ISwjb3) {
        this.ISwjb3 = ISwjb3;
    }
    
    @Column(name="I_SWJB4", precision=22, scale=0)

    public Integer getISwjb4() {
        return this.ISwjb4;
    }
    
    public void setISwjb4(Integer ISwjb4) {
        this.ISwjb4 = ISwjb4;
    }
    
    @Column(name="I_SWJB5", precision=22, scale=0)

    public Integer getISwjb5() {
        return this.ISwjb5;
    }
    
    public void setISwjb5(Integer ISwjb5) {
        this.ISwjb5 = ISwjb5;
    }
    
    @Column(name="I_SWJB6", precision=22, scale=0)

    public Integer getISwjb6() {
        return this.ISwjb6;
    }
    
    public void setISwjb6(Integer ISwjb6) {
        this.ISwjb6 = ISwjb6;
    }
    
    @Column(name="I_SWJB7", precision=22, scale=0)

    public Integer getISwjb7() {
        return this.ISwjb7;
    }
    
    public void setISwjb7(Integer ISwjb7) {
        this.ISwjb7 = ISwjb7;
    }
    
    @Column(name="V_YPMC4", length=50)

    public String getVYpmc4() {
        return this.VYpmc4;
    }
    
    public void setVYpmc4(String VYpmc4) {
        this.VYpmc4 = VYpmc4;
    }
    
    @Column(name="I_FYCS4", precision=22, scale=0)

    public Integer getIFycs4() {
        return this.IFycs4;
    }
    
    public void setIFycs4(Integer IFycs4) {
        this.IFycs4 = IFycs4;
    }
    
    @Column(name="N_MCJL4")

    public Double getNMcjl4() {
        return this.NMcjl4;
    }
    
    public void setNMcjl4(Double NMcjl4) {
        this.NMcjl4 = NMcjl4;
    }
    
    @Column(name="V_YPMC5", length=50)

    public String getVYpmc5() {
        return this.VYpmc5;
    }
    
    public void setVYpmc5(String VYpmc5) {
        this.VYpmc5 = VYpmc5;
    }
    
    @Column(name="I_FYCS5", precision=22, scale=0)

    public Integer getIFycs5() {
        return this.IFycs5;
    }
    
    public void setIFycs5(Integer IFycs5) {
        this.IFycs5 = IFycs5;
    }
    
    @Column(name="N_MCJL5")

    public Double getNMcjl5() {
        return this.NMcjl5;
    }
    
    public void setNMcjl5(Double NMcjl5) {
        this.NMcjl5 = NMcjl5;
    }
    
    @Column(name="V_YPMC6", length=50)

    public String getVYpmc6() {
        return this.VYpmc6;
    }
    
    public void setVYpmc6(String VYpmc6) {
        this.VYpmc6 = VYpmc6;
    }
    
    @Column(name="I_FYCS6", precision=22, scale=0)

    public Integer getIFycs6() {
        return this.IFycs6;
    }
    
    public void setIFycs6(Integer IFycs6) {
        this.IFycs6 = IFycs6;
    }
    
    @Column(name="N_MCJL6")

    public Double getNMcjl6() {
        return this.NMcjl6;
    }
    
    public void setNMcjl6(Double NMcjl6) {
        this.NMcjl6 = NMcjl6;
    }
    
    @Column(name="I_YXCS7", precision=22, scale=0)

    public Integer getIYxcs7() {
        return this.IYxcs7;
    }
    
    public void setIYxcs7(Integer IYxcs7) {
        this.IYxcs7 = IYxcs7;
    }
    
    @Column(name="I_PJZT", precision=22, scale=0)

    public Integer getIPjzt() {
        return this.IPjzt;
    }
    
    public void setIPjzt(Integer IPjzt) {
        this.IPjzt = IPjzt;
    }
    
    @Column(name="I_SFLX", precision=22, scale=0)

    public Integer getISflx() {
        return this.ISflx;
    }
    
    public void setISflx(Integer ISflx) {
        this.ISflx = ISflx;
    }
    
    @Column(name="I_YSTQJH", precision=22, scale=0)

    public Integer getIYstqjh() {
        return this.IYstqjh;
    }
    
    public void setIYstqjh(Integer IYstqjh) {
        this.IYstqjh = IYstqjh;
    }
    
    @Column(name="I_YSTD", precision=22, scale=0)

    public Integer getIYstd() {
        return this.IYstd;
    }
    
    public void setIYstd(Integer IYstd) {
        this.IYstd = IYstd;
    }
    
    @Column(name="I_PJFS", precision=22, scale=0)

    public Integer getIPjfs() {
        return this.IPjfs;
    }
    
    public void setIPjfs(Integer IPjfs) {
        this.IPjfs = IPjfs;
    }
    
    @Column(name="V_PJNR", length=350)

    public String getVPjnr() {
        return this.VPjnr;
    }
    
    public void setVPjnr(String VPjnr) {
        this.VPjnr = VPjnr;
    }
    
    @Column(name="DT_PJSJ", length=7)

    public Date getDtPjsj() {
        return this.dtPjsj;
    }
    
    public void setDtPjsj(Date dtPjsj) {
        this.dtPjsj = dtPjsj;
    }
    
    @Column(name="C_PJRGRBH", length=100)

    public String getCPjrgrbh() {
        return this.CPjrgrbh;
    }
    
    public void setCPjrgrbh(String CPjrgrbh) {
        this.CPjrgrbh = CPjrgrbh;
    }
    
    @Column(name="C_USERBH", length=50)

    public String getCUserbh() {
        return this.CUserbh;
    }
    
    public void setCUserbh(String CUserbh) {
        this.CUserbh = CUserbh;
    }
   








}