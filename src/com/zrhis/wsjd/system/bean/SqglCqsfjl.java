package com.zrhis.wsjd.system.bean;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * SqglCqsfjl entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="SQGL_CQSFJL"
    ,schema="CXJM"
)

public class SqglCqsfjl  implements java.io.Serializable {


    // Fields    

     private String VId;
     private String depId;
     private String CId;
     private String CGrbh;
     private Integer ISfcs;
     private Date dtSfrq;
     private Integer IYz;
     private String VZs;
     private String VZfxm;
     private Integer IZfnl;
     private String VZfdh;
     private Integer IYc;
     private Integer ICc;
     private Date dtMcyj;
     private Date dtYcq;
     private Integer IJws;
     private Integer IXzb;
     private Integer ISzjb;
     private Integer IGzjb;
     private Integer IGxy;
     private Integer IPx;
     private Integer ITnb;
     private Integer IJwsqt;
     private String VJwsqt;
     private Integer IYcjb;
     private Integer IJsjbs;
     private Integer IJzsqt;
     private String VJzsqt;
     private Integer IFksf;
     private String VFksf;
     private Integer ILc;
     private Integer ISt;
     private Integer ISc;
     private Integer IXsr;
     private Double NSg;
     private Double NTz;
     private Integer IXyg;
     private Integer IXyd;
     private Integer ITzxz;
     private String VTzxz;
     private Integer ITzfb;
     private String VTzfb;
     private Integer IGdgd;
     private Integer IFw;
     private Integer ITxl;
     private Integer IWyzc;
     private String VWyyc;
     private Integer IYdzc;
     private String VYdyc;
     private Integer IGjzc;
     private String VGjyc;
     private Integer IZgzc;
     private String VZgzc;
     private Integer IFjzc;
     private String VFjyc;
     private String VXhdb;
     private String VBxb;
     private String VXxb;
     private String VXcg;
     private String VNdb;
     private String VNt;
     private String VNtt;
     private String VNtx;
     private String VNcg;
     private String VXqgb;
     private String VXqgc;
     private String VBdb;
     private String VZdhs;
     private String VJhdhs;
     private String VXqjg;
     private String VXnst;
     private String VXjnd;
     private String VXnnd;
     private Integer IYdwjyc;
     private Integer IDc;
     private Integer IMj;
     private String VFmw;
     private Integer IMdxq;
     private Integer IHiv;
     private String VBc;
     private String VXtsc;
     private Integer IZtpg;
     private String VZtpg;
     private Integer IZd;
     private Integer IZzyw;
     private String VZzyy;
     private String VZzjg;
     private Date dtXcsfrq;
     private String VSfys;
     private String VBz;
     private String CCzybh;
     private Date dtJlrq;
     private String VZhxgr;
     private Date dtZhxgrq;
     private Integer IXgbz;
     private Integer IJlbz;
     private Integer ICsbz;
     private Integer IGrws;
     private Integer ISs;
     private Integer IXl;
     private Integer IYd;
     private Integer IZwjh;
     private Integer IMrwy;
     private Integer IFmzb;
     private String depName;
     private Double ITzzs1;
     private Double ITzzs2;
     private Integer IUpload;
     private Date dtUpload;
     private Date dtCreate;
     private String VXm;
     private Integer IXb;
     private String VZjhm;
     private Date dtCsrq;
     private String VYktbh;
     private String VBz1;
     private String VBz2;
     private String VBz3;
     private Integer IGrs;
     private String VGrsqt;
     private String VXxabo;
     private String VXxrh;
     private Integer IYdqjd;
     private String VYgbmky;
     private String VYgbmkt;
     private String VYgeky;
     private String VYgekt;
     private String VYghxkt;
     private Integer IBjzd;
     private String VBjzdqt;
     private Integer IHisto;
     private Integer IHycs;
     private String VBrdh;
     private Integer ITxs;
     private Integer ITxl2;
     private Integer ITxl3;
     private Integer ITxl4;
     private Integer IRglc;
     private Integer ICsqxe;
     private String VTw;
     private String VYfnl;
     private Integer IYdfmcs;
     private Integer IPgccs;
     private String VFzjc;
     private Integer IShfs;
     private Integer IYy;
     private String VZdqt;
     private Integer IZdqt;
     private Integer IJsjmj;
     private String VFzjcdyc;
     private Integer IPjzt;
     private Integer ISflx;
     private Integer IYstqjh;
     private Integer IYstd;
     private Integer IPjfs;
     private String VPjnr;
     private Date dtPjsj;
     private String CPjrgrbh;
     private String CUserbh;
     private Integer IJzs;
     private String VGrsdbh;


    // Constructors

    /** default constructor */
    public SqglCqsfjl() {
    }

	/** minimal constructor */
    public SqglCqsfjl(String VId, String CGrbh, Integer ISfcs) {
        this.VId = VId;
        this.CGrbh = CGrbh;
        this.ISfcs = ISfcs;
    }
    
    /** full constructor */
    public SqglCqsfjl(String VId, String depId, String CId, String CGrbh, Integer ISfcs, Date dtSfrq, Integer IYz, String VZs, String VZfxm, Integer IZfnl, String VZfdh, Integer IYc, Integer ICc, Date dtMcyj, Date dtYcq, Integer IJws, Integer IXzb, Integer ISzjb, Integer IGzjb, Integer IGxy, Integer IPx, Integer ITnb, Integer IJwsqt, String VJwsqt, Integer IYcjb, Integer IJsjbs, Integer IJzsqt, String VJzsqt, Integer IFksf, String VFksf, Integer ILc, Integer ISt, Integer ISc, Integer IXsr, Double NSg, Double NTz, Integer IXyg, Integer IXyd, Integer ITzxz, String VTzxz, Integer ITzfb, String VTzfb, Integer IGdgd, Integer IFw, Integer ITxl, Integer IWyzc, String VWyyc, Integer IYdzc, String VYdyc, Integer IGjzc, String VGjyc, Integer IZgzc, String VZgzc, Integer IFjzc, String VFjyc, String VXhdb, String VBxb, String VXxb, String VXcg, String VNdb, String VNt, String VNtt, String VNtx, String VNcg, String VXqgb, String VXqgc, String VBdb, String VZdhs, String VJhdhs, String VXqjg, String VXnst, String VXjnd, String VXnnd, Integer IYdwjyc, Integer IDc, Integer IMj, String VFmw, Integer IMdxq, Integer IHiv, String VBc, String VXtsc, Integer IZtpg, String VZtpg, Integer IZd, Integer IZzyw, String VZzyy, String VZzjg, Date dtXcsfrq, String VSfys, String VBz, String CCzybh, Date dtJlrq, String VZhxgr, Date dtZhxgrq, Integer IXgbz, Integer IJlbz, Integer ICsbz, Integer IGrws, Integer ISs, Integer IXl, Integer IYd, Integer IZwjh, Integer IMrwy, Integer IFmzb, String depName, Double ITzzs1, Double ITzzs2, Integer IUpload, Date dtUpload, Date dtCreate, String VXm, Integer IXb, String VZjhm, Date dtCsrq, String VYktbh, String VBz1, String VBz2, String VBz3, Integer IGrs, String VGrsqt, String VXxabo, String VXxrh, Integer IYdqjd, String VYgbmky, String VYgbmkt, String VYgeky, String VYgekt, String VYghxkt, Integer IBjzd, String VBjzdqt, Integer IHisto, Integer IHycs, String VBrdh, Integer ITxs, Integer ITxl2, Integer ITxl3, Integer ITxl4, Integer IRglc, Integer ICsqxe, String VTw, String VYfnl, Integer IYdfmcs, Integer IPgccs, String VFzjc, Integer IShfs, Integer IYy, String VZdqt, Integer IZdqt, Integer IJsjmj, String VFzjcdyc, Integer IPjzt, Integer ISflx, Integer IYstqjh, Integer IYstd, Integer IPjfs, String VPjnr, Date dtPjsj, String CPjrgrbh, String CUserbh, Integer IJzs, String VGrsdbh) {
        this.VId = VId;
        this.depId = depId;
        this.CId = CId;
        this.CGrbh = CGrbh;
        this.ISfcs = ISfcs;
        this.dtSfrq = dtSfrq;
        this.IYz = IYz;
        this.VZs = VZs;
        this.VZfxm = VZfxm;
        this.IZfnl = IZfnl;
        this.VZfdh = VZfdh;
        this.IYc = IYc;
        this.ICc = ICc;
        this.dtMcyj = dtMcyj;
        this.dtYcq = dtYcq;
        this.IJws = IJws;
        this.IXzb = IXzb;
        this.ISzjb = ISzjb;
        this.IGzjb = IGzjb;
        this.IGxy = IGxy;
        this.IPx = IPx;
        this.ITnb = ITnb;
        this.IJwsqt = IJwsqt;
        this.VJwsqt = VJwsqt;
        this.IYcjb = IYcjb;
        this.IJsjbs = IJsjbs;
        this.IJzsqt = IJzsqt;
        this.VJzsqt = VJzsqt;
        this.IFksf = IFksf;
        this.VFksf = VFksf;
        this.ILc = ILc;
        this.ISt = ISt;
        this.ISc = ISc;
        this.IXsr = IXsr;
        this.NSg = NSg;
        this.NTz = NTz;
        this.IXyg = IXyg;
        this.IXyd = IXyd;
        this.ITzxz = ITzxz;
        this.VTzxz = VTzxz;
        this.ITzfb = ITzfb;
        this.VTzfb = VTzfb;
        this.IGdgd = IGdgd;
        this.IFw = IFw;
        this.ITxl = ITxl;
        this.IWyzc = IWyzc;
        this.VWyyc = VWyyc;
        this.IYdzc = IYdzc;
        this.VYdyc = VYdyc;
        this.IGjzc = IGjzc;
        this.VGjyc = VGjyc;
        this.IZgzc = IZgzc;
        this.VZgzc = VZgzc;
        this.IFjzc = IFjzc;
        this.VFjyc = VFjyc;
        this.VXhdb = VXhdb;
        this.VBxb = VBxb;
        this.VXxb = VXxb;
        this.VXcg = VXcg;
        this.VNdb = VNdb;
        this.VNt = VNt;
        this.VNtt = VNtt;
        this.VNtx = VNtx;
        this.VNcg = VNcg;
        this.VXqgb = VXqgb;
        this.VXqgc = VXqgc;
        this.VBdb = VBdb;
        this.VZdhs = VZdhs;
        this.VJhdhs = VJhdhs;
        this.VXqjg = VXqjg;
        this.VXnst = VXnst;
        this.VXjnd = VXjnd;
        this.VXnnd = VXnnd;
        this.IYdwjyc = IYdwjyc;
        this.IDc = IDc;
        this.IMj = IMj;
        this.VFmw = VFmw;
        this.IMdxq = IMdxq;
        this.IHiv = IHiv;
        this.VBc = VBc;
        this.VXtsc = VXtsc;
        this.IZtpg = IZtpg;
        this.VZtpg = VZtpg;
        this.IZd = IZd;
        this.IZzyw = IZzyw;
        this.VZzyy = VZzyy;
        this.VZzjg = VZzjg;
        this.dtXcsfrq = dtXcsfrq;
        this.VSfys = VSfys;
        this.VBz = VBz;
        this.CCzybh = CCzybh;
        this.dtJlrq = dtJlrq;
        this.VZhxgr = VZhxgr;
        this.dtZhxgrq = dtZhxgrq;
        this.IXgbz = IXgbz;
        this.IJlbz = IJlbz;
        this.ICsbz = ICsbz;
        this.IGrws = IGrws;
        this.ISs = ISs;
        this.IXl = IXl;
        this.IYd = IYd;
        this.IZwjh = IZwjh;
        this.IMrwy = IMrwy;
        this.IFmzb = IFmzb;
        this.depName = depName;
        this.ITzzs1 = ITzzs1;
        this.ITzzs2 = ITzzs2;
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
        this.IGrs = IGrs;
        this.VGrsqt = VGrsqt;
        this.VXxabo = VXxabo;
        this.VXxrh = VXxrh;
        this.IYdqjd = IYdqjd;
        this.VYgbmky = VYgbmky;
        this.VYgbmkt = VYgbmkt;
        this.VYgeky = VYgeky;
        this.VYgekt = VYgekt;
        this.VYghxkt = VYghxkt;
        this.IBjzd = IBjzd;
        this.VBjzdqt = VBjzdqt;
        this.IHisto = IHisto;
        this.IHycs = IHycs;
        this.VBrdh = VBrdh;
        this.ITxs = ITxs;
        this.ITxl2 = ITxl2;
        this.ITxl3 = ITxl3;
        this.ITxl4 = ITxl4;
        this.IRglc = IRglc;
        this.ICsqxe = ICsqxe;
        this.VTw = VTw;
        this.VYfnl = VYfnl;
        this.IYdfmcs = IYdfmcs;
        this.IPgccs = IPgccs;
        this.VFzjc = VFzjc;
        this.IShfs = IShfs;
        this.IYy = IYy;
        this.VZdqt = VZdqt;
        this.IZdqt = IZdqt;
        this.IJsjmj = IJsjmj;
        this.VFzjcdyc = VFzjcdyc;
        this.IPjzt = IPjzt;
        this.ISflx = ISflx;
        this.IYstqjh = IYstqjh;
        this.IYstd = IYstd;
        this.IPjfs = IPjfs;
        this.VPjnr = VPjnr;
        this.dtPjsj = dtPjsj;
        this.CPjrgrbh = CPjrgrbh;
        this.CUserbh = CUserbh;
        this.IJzs = IJzs;
        this.VGrsdbh = VGrsdbh;
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
    
    @Column(name="I_SFCS", nullable=false, precision=22, scale=0)

    public Integer getISfcs() {
        return this.ISfcs;
    }
    
    public void setISfcs(Integer ISfcs) {
        this.ISfcs = ISfcs;
    }
    
    @Column(name="DT_SFRQ", length=7)

    public Date getDtSfrq() {
        return this.dtSfrq;
    }
    
    public void setDtSfrq(Date dtSfrq) {
        this.dtSfrq = dtSfrq;
    }
    
    @Column(name="I_YZ", precision=22, scale=0)

    public Integer getIYz() {
        return this.IYz;
    }
    
    public void setIYz(Integer IYz) {
        this.IYz = IYz;
    }
    
    @Column(name="V_ZS", length=500)

    public String getVZs() {
        return this.VZs;
    }
    
    public void setVZs(String VZs) {
        this.VZs = VZs;
    }
    
    @Column(name="V_ZFXM", length=10)

    public String getVZfxm() {
        return this.VZfxm;
    }
    
    public void setVZfxm(String VZfxm) {
        this.VZfxm = VZfxm;
    }
    
    @Column(name="I_ZFNL", precision=22, scale=0)

    public Integer getIZfnl() {
        return this.IZfnl;
    }
    
    public void setIZfnl(Integer IZfnl) {
        this.IZfnl = IZfnl;
    }
    
    @Column(name="V_ZFDH", length=20)

    public String getVZfdh() {
        return this.VZfdh;
    }
    
    public void setVZfdh(String VZfdh) {
        this.VZfdh = VZfdh;
    }
    
    @Column(name="I_YC", precision=22, scale=0)

    public Integer getIYc() {
        return this.IYc;
    }
    
    public void setIYc(Integer IYc) {
        this.IYc = IYc;
    }
    
    @Column(name="I_CC", precision=22, scale=0)

    public Integer getICc() {
        return this.ICc;
    }
    
    public void setICc(Integer ICc) {
        this.ICc = ICc;
    }
    
    @Column(name="DT_MCYJ", length=7)

    public Date getDtMcyj() {
        return this.dtMcyj;
    }
    
    public void setDtMcyj(Date dtMcyj) {
        this.dtMcyj = dtMcyj;
    }
    
    @Column(name="DT_YCQ", length=7)

    public Date getDtYcq() {
        return this.dtYcq;
    }
    
    public void setDtYcq(Date dtYcq) {
        this.dtYcq = dtYcq;
    }
    
    @Column(name="I_JWS", precision=22, scale=0)

    public Integer getIJws() {
        return this.IJws;
    }
    
    public void setIJws(Integer IJws) {
        this.IJws = IJws;
    }
    
    @Column(name="I_XZB", precision=22, scale=0)

    public Integer getIXzb() {
        return this.IXzb;
    }
    
    public void setIXzb(Integer IXzb) {
        this.IXzb = IXzb;
    }
    
    @Column(name="I_SZJB", precision=22, scale=0)

    public Integer getISzjb() {
        return this.ISzjb;
    }
    
    public void setISzjb(Integer ISzjb) {
        this.ISzjb = ISzjb;
    }
    
    @Column(name="I_GZJB", precision=22, scale=0)

    public Integer getIGzjb() {
        return this.IGzjb;
    }
    
    public void setIGzjb(Integer IGzjb) {
        this.IGzjb = IGzjb;
    }
    
    @Column(name="I_GXY", precision=22, scale=0)

    public Integer getIGxy() {
        return this.IGxy;
    }
    
    public void setIGxy(Integer IGxy) {
        this.IGxy = IGxy;
    }
    
    @Column(name="I_PX", precision=22, scale=0)

    public Integer getIPx() {
        return this.IPx;
    }
    
    public void setIPx(Integer IPx) {
        this.IPx = IPx;
    }
    
    @Column(name="I_TNB", precision=22, scale=0)

    public Integer getITnb() {
        return this.ITnb;
    }
    
    public void setITnb(Integer ITnb) {
        this.ITnb = ITnb;
    }
    
    @Column(name="I_JWSQT", precision=22, scale=0)

    public Integer getIJwsqt() {
        return this.IJwsqt;
    }
    
    public void setIJwsqt(Integer IJwsqt) {
        this.IJwsqt = IJwsqt;
    }
    
    @Column(name="V_JWSQT", length=50)

    public String getVJwsqt() {
        return this.VJwsqt;
    }
    
    public void setVJwsqt(String VJwsqt) {
        this.VJwsqt = VJwsqt;
    }
    
    @Column(name="I_YCJB", precision=22, scale=0)

    public Integer getIYcjb() {
        return this.IYcjb;
    }
    
    public void setIYcjb(Integer IYcjb) {
        this.IYcjb = IYcjb;
    }
    
    @Column(name="I_JSJBS", precision=22, scale=0)

    public Integer getIJsjbs() {
        return this.IJsjbs;
    }
    
    public void setIJsjbs(Integer IJsjbs) {
        this.IJsjbs = IJsjbs;
    }
    
    @Column(name="I_JZSQT", precision=22, scale=0)

    public Integer getIJzsqt() {
        return this.IJzsqt;
    }
    
    public void setIJzsqt(Integer IJzsqt) {
        this.IJzsqt = IJzsqt;
    }
    
    @Column(name="V_JZSQT", length=50)

    public String getVJzsqt() {
        return this.VJzsqt;
    }
    
    public void setVJzsqt(String VJzsqt) {
        this.VJzsqt = VJzsqt;
    }
    
    @Column(name="I_FKSF", precision=22, scale=0)

    public Integer getIFksf() {
        return this.IFksf;
    }
    
    public void setIFksf(Integer IFksf) {
        this.IFksf = IFksf;
    }
    
    @Column(name="V_FKSF", length=200)

    public String getVFksf() {
        return this.VFksf;
    }
    
    public void setVFksf(String VFksf) {
        this.VFksf = VFksf;
    }
    
    @Column(name="I_LC", precision=22, scale=0)

    public Integer getILc() {
        return this.ILc;
    }
    
    public void setILc(Integer ILc) {
        this.ILc = ILc;
    }
    
    @Column(name="I_ST", precision=22, scale=0)

    public Integer getISt() {
        return this.ISt;
    }
    
    public void setISt(Integer ISt) {
        this.ISt = ISt;
    }
    
    @Column(name="I_SC", precision=22, scale=0)

    public Integer getISc() {
        return this.ISc;
    }
    
    public void setISc(Integer ISc) {
        this.ISc = ISc;
    }
    
    @Column(name="I_XSR", precision=22, scale=0)

    public Integer getIXsr() {
        return this.IXsr;
    }
    
    public void setIXsr(Integer IXsr) {
        this.IXsr = IXsr;
    }
    
    @Column(name="N_SG", precision=10)

    public Double getNSg() {
        return this.NSg;
    }
    
    public void setNSg(Double NSg) {
        this.NSg = NSg;
    }
    
    @Column(name="N_TZ", precision=10)

    public Double getNTz() {
        return this.NTz;
    }
    
    public void setNTz(Double NTz) {
        this.NTz = NTz;
    }
    
    @Column(name="I_XYG", precision=22, scale=0)

    public Integer getIXyg() {
        return this.IXyg;
    }
    
    public void setIXyg(Integer IXyg) {
        this.IXyg = IXyg;
    }
    
    @Column(name="I_XYD", precision=22, scale=0)

    public Integer getIXyd() {
        return this.IXyd;
    }
    
    public void setIXyd(Integer IXyd) {
        this.IXyd = IXyd;
    }
    
    @Column(name="I_TZXZ", precision=22, scale=0)

    public Integer getITzxz() {
        return this.ITzxz;
    }
    
    public void setITzxz(Integer ITzxz) {
        this.ITzxz = ITzxz;
    }
    
    @Column(name="V_TZXZ", length=100)

    public String getVTzxz() {
        return this.VTzxz;
    }
    
    public void setVTzxz(String VTzxz) {
        this.VTzxz = VTzxz;
    }
    
    @Column(name="I_TZFB", precision=22, scale=0)

    public Integer getITzfb() {
        return this.ITzfb;
    }
    
    public void setITzfb(Integer ITzfb) {
        this.ITzfb = ITzfb;
    }
    
    @Column(name="V_TZFB", length=100)

    public String getVTzfb() {
        return this.VTzfb;
    }
    
    public void setVTzfb(String VTzfb) {
        this.VTzfb = VTzfb;
    }
    
    @Column(name="I_GDGD", precision=22, scale=0)

    public Integer getIGdgd() {
        return this.IGdgd;
    }
    
    public void setIGdgd(Integer IGdgd) {
        this.IGdgd = IGdgd;
    }
    
    @Column(name="I_FW", precision=22, scale=0)

    public Integer getIFw() {
        return this.IFw;
    }
    
    public void setIFw(Integer IFw) {
        this.IFw = IFw;
    }
    
    @Column(name="I_TXL", precision=22, scale=0)

    public Integer getITxl() {
        return this.ITxl;
    }
    
    public void setITxl(Integer ITxl) {
        this.ITxl = ITxl;
    }
    
    @Column(name="I_WYZC", precision=22, scale=0)

    public Integer getIWyzc() {
        return this.IWyzc;
    }
    
    public void setIWyzc(Integer IWyzc) {
        this.IWyzc = IWyzc;
    }
    
    @Column(name="V_WYYC", length=100)

    public String getVWyyc() {
        return this.VWyyc;
    }
    
    public void setVWyyc(String VWyyc) {
        this.VWyyc = VWyyc;
    }
    
    @Column(name="I_YDZC", precision=22, scale=0)

    public Integer getIYdzc() {
        return this.IYdzc;
    }
    
    public void setIYdzc(Integer IYdzc) {
        this.IYdzc = IYdzc;
    }
    
    @Column(name="V_YDYC", length=100)

    public String getVYdyc() {
        return this.VYdyc;
    }
    
    public void setVYdyc(String VYdyc) {
        this.VYdyc = VYdyc;
    }
    
    @Column(name="I_GJZC", precision=22, scale=0)

    public Integer getIGjzc() {
        return this.IGjzc;
    }
    
    public void setIGjzc(Integer IGjzc) {
        this.IGjzc = IGjzc;
    }
    
    @Column(name="V_GJYC", length=100)

    public String getVGjyc() {
        return this.VGjyc;
    }
    
    public void setVGjyc(String VGjyc) {
        this.VGjyc = VGjyc;
    }
    
    @Column(name="I_ZGZC", precision=22, scale=0)

    public Integer getIZgzc() {
        return this.IZgzc;
    }
    
    public void setIZgzc(Integer IZgzc) {
        this.IZgzc = IZgzc;
    }
    
    @Column(name="V_ZGZC", length=100)

    public String getVZgzc() {
        return this.VZgzc;
    }
    
    public void setVZgzc(String VZgzc) {
        this.VZgzc = VZgzc;
    }
    
    @Column(name="I_FJZC", precision=22, scale=0)

    public Integer getIFjzc() {
        return this.IFjzc;
    }
    
    public void setIFjzc(Integer IFjzc) {
        this.IFjzc = IFjzc;
    }
    
    @Column(name="V_FJYC", length=100)

    public String getVFjyc() {
        return this.VFjyc;
    }
    
    public void setVFjyc(String VFjyc) {
        this.VFjyc = VFjyc;
    }
    
    @Column(name="V_XHDB", length=20)

    public String getVXhdb() {
        return this.VXhdb;
    }
    
    public void setVXhdb(String VXhdb) {
        this.VXhdb = VXhdb;
    }
    
    @Column(name="V_BXB", length=20)

    public String getVBxb() {
        return this.VBxb;
    }
    
    public void setVBxb(String VBxb) {
        this.VBxb = VBxb;
    }
    
    @Column(name="V_XXB", length=20)

    public String getVXxb() {
        return this.VXxb;
    }
    
    public void setVXxb(String VXxb) {
        this.VXxb = VXxb;
    }
    
    @Column(name="V_XCG", length=100)

    public String getVXcg() {
        return this.VXcg;
    }
    
    public void setVXcg(String VXcg) {
        this.VXcg = VXcg;
    }
    
    @Column(name="V_NDB", length=20)

    public String getVNdb() {
        return this.VNdb;
    }
    
    public void setVNdb(String VNdb) {
        this.VNdb = VNdb;
    }
    
    @Column(name="V_NT", length=20)

    public String getVNt() {
        return this.VNt;
    }
    
    public void setVNt(String VNt) {
        this.VNt = VNt;
    }
    
    @Column(name="V_NTT", length=20)

    public String getVNtt() {
        return this.VNtt;
    }
    
    public void setVNtt(String VNtt) {
        this.VNtt = VNtt;
    }
    
    @Column(name="V_NTX", length=20)

    public String getVNtx() {
        return this.VNtx;
    }
    
    public void setVNtx(String VNtx) {
        this.VNtx = VNtx;
    }
    
    @Column(name="V_NCG", length=100)

    public String getVNcg() {
        return this.VNcg;
    }
    
    public void setVNcg(String VNcg) {
        this.VNcg = VNcg;
    }
    
    @Column(name="V_XQGB", length=20)

    public String getVXqgb() {
        return this.VXqgb;
    }
    
    public void setVXqgb(String VXqgb) {
        this.VXqgb = VXqgb;
    }
    
    @Column(name="V_XQGC", length=20)

    public String getVXqgc() {
        return this.VXqgc;
    }
    
    public void setVXqgc(String VXqgc) {
        this.VXqgc = VXqgc;
    }
    
    @Column(name="V_BDB", length=20)

    public String getVBdb() {
        return this.VBdb;
    }
    
    public void setVBdb(String VBdb) {
        this.VBdb = VBdb;
    }
    
    @Column(name="V_ZDHS", length=20)

    public String getVZdhs() {
        return this.VZdhs;
    }
    
    public void setVZdhs(String VZdhs) {
        this.VZdhs = VZdhs;
    }
    
    @Column(name="V_JHDHS", length=20)

    public String getVJhdhs() {
        return this.VJhdhs;
    }
    
    public void setVJhdhs(String VJhdhs) {
        this.VJhdhs = VJhdhs;
    }
    
    @Column(name="V_XQJG", length=20)

    public String getVXqjg() {
        return this.VXqjg;
    }
    
    public void setVXqjg(String VXqjg) {
        this.VXqjg = VXqjg;
    }
    
    @Column(name="V_XNST", length=20)

    public String getVXnst() {
        return this.VXnst;
    }
    
    public void setVXnst(String VXnst) {
        this.VXnst = VXnst;
    }
    
    @Column(name="V_XJND", length=20)

    public String getVXjnd() {
        return this.VXjnd;
    }
    
    public void setVXjnd(String VXjnd) {
        this.VXjnd = VXjnd;
    }
    
    @Column(name="V_XNND", length=20)

    public String getVXnnd() {
        return this.VXnnd;
    }
    
    public void setVXnnd(String VXnnd) {
        this.VXnnd = VXnnd;
    }
    
    @Column(name="I_YDWJYC", precision=22, scale=0)

    public Integer getIYdwjyc() {
        return this.IYdwjyc;
    }
    
    public void setIYdwjyc(Integer IYdwjyc) {
        this.IYdwjyc = IYdwjyc;
    }
    
    @Column(name="I_DC", precision=22, scale=0)

    public Integer getIDc() {
        return this.IDc;
    }
    
    public void setIDc(Integer IDc) {
        this.IDc = IDc;
    }
    
    @Column(name="I_MJ", precision=22, scale=0)

    public Integer getIMj() {
        return this.IMj;
    }
    
    public void setIMj(Integer IMj) {
        this.IMj = IMj;
    }
    
    @Column(name="V_FMW", length=100)

    public String getVFmw() {
        return this.VFmw;
    }
    
    public void setVFmw(String VFmw) {
        this.VFmw = VFmw;
    }
    
    @Column(name="I_MDXQ", precision=22, scale=0)

    public Integer getIMdxq() {
        return this.IMdxq;
    }
    
    public void setIMdxq(Integer IMdxq) {
        this.IMdxq = IMdxq;
    }
    
    @Column(name="I_HIV", precision=22, scale=0)

    public Integer getIHiv() {
        return this.IHiv;
    }
    
    public void setIHiv(Integer IHiv) {
        this.IHiv = IHiv;
    }
    
    @Column(name="V_BC", length=100)

    public String getVBc() {
        return this.VBc;
    }
    
    public void setVBc(String VBc) {
        this.VBc = VBc;
    }
    
    @Column(name="V_XTSC", length=100)

    public String getVXtsc() {
        return this.VXtsc;
    }
    
    public void setVXtsc(String VXtsc) {
        this.VXtsc = VXtsc;
    }
    
    @Column(name="I_ZTPG", precision=22, scale=0)

    public Integer getIZtpg() {
        return this.IZtpg;
    }
    
    public void setIZtpg(Integer IZtpg) {
        this.IZtpg = IZtpg;
    }
    
    @Column(name="V_ZTPG", length=100)

    public String getVZtpg() {
        return this.VZtpg;
    }
    
    public void setVZtpg(String VZtpg) {
        this.VZtpg = VZtpg;
    }
    
    @Column(name="I_ZD", precision=22, scale=0)

    public Integer getIZd() {
        return this.IZd;
    }
    
    public void setIZd(Integer IZd) {
        this.IZd = IZd;
    }
    
    @Column(name="I_ZZYW", precision=22, scale=0)

    public Integer getIZzyw() {
        return this.IZzyw;
    }
    
    public void setIZzyw(Integer IZzyw) {
        this.IZzyw = IZzyw;
    }
    
    @Column(name="V_ZZYY", length=100)

    public String getVZzyy() {
        return this.VZzyy;
    }
    
    public void setVZzyy(String VZzyy) {
        this.VZzyy = VZzyy;
    }
    
    @Column(name="V_ZZJG", length=100)

    public String getVZzjg() {
        return this.VZzjg;
    }
    
    public void setVZzjg(String VZzjg) {
        this.VZzjg = VZzjg;
    }
    
    @Column(name="DT_XCSFRQ", length=7)

    public Date getDtXcsfrq() {
        return this.dtXcsfrq;
    }
    
    public void setDtXcsfrq(Date dtXcsfrq) {
        this.dtXcsfrq = dtXcsfrq;
    }
    
    @Column(name="V_SFYS", length=10)

    public String getVSfys() {
        return this.VSfys;
    }
    
    public void setVSfys(String VSfys) {
        this.VSfys = VSfys;
    }
    
    @Column(name="V_BZ", length=200)

    public String getVBz() {
        return this.VBz;
    }
    
    public void setVBz(String VBz) {
        this.VBz = VBz;
    }
    
    @Column(name="C_CZYBH", length=50)

    public String getCCzybh() {
        return this.CCzybh;
    }
    
    public void setCCzybh(String CCzybh) {
        this.CCzybh = CCzybh;
    }
    
    @Column(name="DT_JLRQ", length=7)

    public Date getDtJlrq() {
        return this.dtJlrq;
    }
    
    public void setDtJlrq(Date dtJlrq) {
        this.dtJlrq = dtJlrq;
    }
    
    @Column(name="V_ZHXGR", length=10)

    public String getVZhxgr() {
        return this.VZhxgr;
    }
    
    public void setVZhxgr(String VZhxgr) {
        this.VZhxgr = VZhxgr;
    }
    
    @Column(name="DT_ZHXGRQ", length=7)

    public Date getDtZhxgrq() {
        return this.dtZhxgrq;
    }
    
    public void setDtZhxgrq(Date dtZhxgrq) {
        this.dtZhxgrq = dtZhxgrq;
    }
    
    @Column(name="I_XGBZ", precision=22, scale=0)

    public Integer getIXgbz() {
        return this.IXgbz;
    }
    
    public void setIXgbz(Integer IXgbz) {
        this.IXgbz = IXgbz;
    }
    
    @Column(name="I_JLBZ", precision=22, scale=0)

    public Integer getIJlbz() {
        return this.IJlbz;
    }
    
    public void setIJlbz(Integer IJlbz) {
        this.IJlbz = IJlbz;
    }
    
    @Column(name="I_CSBZ", precision=22, scale=0)

    public Integer getICsbz() {
        return this.ICsbz;
    }
    
    public void setICsbz(Integer ICsbz) {
        this.ICsbz = ICsbz;
    }
    
    @Column(name="I_GRWS", precision=22, scale=0)

    public Integer getIGrws() {
        return this.IGrws;
    }
    
    public void setIGrws(Integer IGrws) {
        this.IGrws = IGrws;
    }
    
    @Column(name="I_SS", precision=22, scale=0)

    public Integer getISs() {
        return this.ISs;
    }
    
    public void setISs(Integer ISs) {
        this.ISs = ISs;
    }
    
    @Column(name="I_XL", precision=22, scale=0)

    public Integer getIXl() {
        return this.IXl;
    }
    
    public void setIXl(Integer IXl) {
        this.IXl = IXl;
    }
    
    @Column(name="I_YD", precision=22, scale=0)

    public Integer getIYd() {
        return this.IYd;
    }
    
    public void setIYd(Integer IYd) {
        this.IYd = IYd;
    }
    
    @Column(name="I_ZWJH", precision=22, scale=0)

    public Integer getIZwjh() {
        return this.IZwjh;
    }
    
    public void setIZwjh(Integer IZwjh) {
        this.IZwjh = IZwjh;
    }
    
    @Column(name="I_MRWY", precision=22, scale=0)

    public Integer getIMrwy() {
        return this.IMrwy;
    }
    
    public void setIMrwy(Integer IMrwy) {
        this.IMrwy = IMrwy;
    }
    
    @Column(name="I_FMZB", precision=22, scale=0)

    public Integer getIFmzb() {
        return this.IFmzb;
    }
    
    public void setIFmzb(Integer IFmzb) {
        this.IFmzb = IFmzb;
    }
    
    @Column(name="DEP_NAME")

    public String getDepName() {
        return this.depName;
    }
    
    public void setDepName(String depName) {
        this.depName = depName;
    }
    
    @Column(name="I_TZZS1", precision=10)

    public Double getITzzs1() {
        return this.ITzzs1;
    }
    
    public void setITzzs1(Double ITzzs1) {
        this.ITzzs1 = ITzzs1;
    }
    
    @Column(name="I_TZZS2", precision=10)

    public Double getITzzs2() {
        return this.ITzzs2;
    }
    
    public void setITzzs2(Double ITzzs2) {
        this.ITzzs2 = ITzzs2;
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

    public Integer getIXb() {
        return this.IXb;
    }
    
    public void setIXb(Integer IXb) {
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
    
    @Column(name="I_GRS", precision=10, scale=0)

    public Integer getIGrs() {
        return this.IGrs;
    }
    
    public void setIGrs(Integer IGrs) {
        this.IGrs = IGrs;
    }
    
    @Column(name="V_GRSQT", length=200)

    public String getVGrsqt() {
        return this.VGrsqt;
    }
    
    public void setVGrsqt(String VGrsqt) {
        this.VGrsqt = VGrsqt;
    }
    
    @Column(name="V_XXABO", length=60)

    public String getVXxabo() {
        return this.VXxabo;
    }
    
    public void setVXxabo(String VXxabo) {
        this.VXxabo = VXxabo;
    }
    
    @Column(name="V_XXRH", length=60)

    public String getVXxrh() {
        return this.VXxrh;
    }
    
    public void setVXxrh(String VXxrh) {
        this.VXxrh = VXxrh;
    }
    
    @Column(name="I_YDQJD", precision=4, scale=0)

    public Integer getIYdqjd() {
        return this.IYdqjd;
    }
    
    public void setIYdqjd(Integer IYdqjd) {
        this.IYdqjd = IYdqjd;
    }
    
    @Column(name="V_YGBMKY", length=100)

    public String getVYgbmky() {
        return this.VYgbmky;
    }
    
    public void setVYgbmky(String VYgbmky) {
        this.VYgbmky = VYgbmky;
    }
    
    @Column(name="V_YGBMKT", length=100)

    public String getVYgbmkt() {
        return this.VYgbmkt;
    }
    
    public void setVYgbmkt(String VYgbmkt) {
        this.VYgbmkt = VYgbmkt;
    }
    
    @Column(name="V_YGEKY", length=100)

    public String getVYgeky() {
        return this.VYgeky;
    }
    
    public void setVYgeky(String VYgeky) {
        this.VYgeky = VYgeky;
    }
    
    @Column(name="V_YGEKT", length=100)

    public String getVYgekt() {
        return this.VYgekt;
    }
    
    public void setVYgekt(String VYgekt) {
        this.VYgekt = VYgekt;
    }
    
    @Column(name="V_YGHXKT", length=100)

    public String getVYghxkt() {
        return this.VYghxkt;
    }
    
    public void setVYghxkt(String VYghxkt) {
        this.VYghxkt = VYghxkt;
    }
    
    @Column(name="I_BJZD", precision=10, scale=0)

    public Integer getIBjzd() {
        return this.IBjzd;
    }
    
    public void setIBjzd(Integer IBjzd) {
        this.IBjzd = IBjzd;
    }
    
    @Column(name="V_BJZDQT", length=200)

    public String getVBjzdqt() {
        return this.VBjzdqt;
    }
    
    public void setVBjzdqt(String VBjzdqt) {
        this.VBjzdqt = VBjzdqt;
    }
    
    @Column(name="I_HISTO", precision=22, scale=0)

    public Integer getIHisto() {
        return this.IHisto;
    }
    
    public void setIHisto(Integer IHisto) {
        this.IHisto = IHisto;
    }
    
    @Column(name="I_HYCS", precision=22, scale=0)

    public Integer getIHycs() {
        return this.IHycs;
    }
    
    public void setIHycs(Integer IHycs) {
        this.IHycs = IHycs;
    }
    
    @Column(name="V_BRDH", length=100)

    public String getVBrdh() {
        return this.VBrdh;
    }
    
    public void setVBrdh(String VBrdh) {
        this.VBrdh = VBrdh;
    }
    
    @Column(name="I_TXS", precision=22, scale=0)

    public Integer getITxs() {
        return this.ITxs;
    }
    
    public void setITxs(Integer ITxs) {
        this.ITxs = ITxs;
    }
    
    @Column(name="I_TXL2", precision=22, scale=0)

    public Integer getITxl2() {
        return this.ITxl2;
    }
    
    public void setITxl2(Integer ITxl2) {
        this.ITxl2 = ITxl2;
    }
    
    @Column(name="I_TXL3", precision=22, scale=0)

    public Integer getITxl3() {
        return this.ITxl3;
    }
    
    public void setITxl3(Integer ITxl3) {
        this.ITxl3 = ITxl3;
    }
    
    @Column(name="I_TXL4", precision=22, scale=0)

    public Integer getITxl4() {
        return this.ITxl4;
    }
    
    public void setITxl4(Integer ITxl4) {
        this.ITxl4 = ITxl4;
    }
    
    @Column(name="I_RGLC", precision=22, scale=0)

    public Integer getIRglc() {
        return this.IRglc;
    }
    
    public void setIRglc(Integer IRglc) {
        this.IRglc = IRglc;
    }
    
    @Column(name="I_CSQXE", precision=22, scale=0)

    public Integer getICsqxe() {
        return this.ICsqxe;
    }
    
    public void setICsqxe(Integer ICsqxe) {
        this.ICsqxe = ICsqxe;
    }
    
    @Column(name="V_TW", length=100)

    public String getVTw() {
        return this.VTw;
    }
    
    public void setVTw(String VTw) {
        this.VTw = VTw;
    }
    
    @Column(name="V_YFNL", length=100)

    public String getVYfnl() {
        return this.VYfnl;
    }
    
    public void setVYfnl(String VYfnl) {
        this.VYfnl = VYfnl;
    }
    
    @Column(name="I_YDFMCS", precision=22, scale=0)

    public Integer getIYdfmcs() {
        return this.IYdfmcs;
    }
    
    public void setIYdfmcs(Integer IYdfmcs) {
        this.IYdfmcs = IYdfmcs;
    }
    
    @Column(name="I_PGCCS", precision=22, scale=0)

    public Integer getIPgccs() {
        return this.IPgccs;
    }
    
    public void setIPgccs(Integer IPgccs) {
        this.IPgccs = IPgccs;
    }
    
    @Column(name="V_FZJC", length=100)

    public String getVFzjc() {
        return this.VFzjc;
    }
    
    public void setVFzjc(String VFzjc) {
        this.VFzjc = VFzjc;
    }
    
    @Column(name="I_SHFS", precision=22, scale=0)

    public Integer getIShfs() {
        return this.IShfs;
    }
    
    public void setIShfs(Integer IShfs) {
        this.IShfs = IShfs;
    }
    
    @Column(name="I_YY", precision=22, scale=0)

    public Integer getIYy() {
        return this.IYy;
    }
    
    public void setIYy(Integer IYy) {
        this.IYy = IYy;
    }
    
    @Column(name="V_ZDQT", length=100)

    public String getVZdqt() {
        return this.VZdqt;
    }
    
    public void setVZdqt(String VZdqt) {
        this.VZdqt = VZdqt;
    }
    
    @Column(name="I_ZDQT", precision=22, scale=0)

    public Integer getIZdqt() {
        return this.IZdqt;
    }
    
    public void setIZdqt(Integer IZdqt) {
        this.IZdqt = IZdqt;
    }
    
    @Column(name="I_JSJMJ", precision=22, scale=0)

    public Integer getIJsjmj() {
        return this.IJsjmj;
    }
    
    public void setIJsjmj(Integer IJsjmj) {
        this.IJsjmj = IJsjmj;
    }
    
    @Column(name="V_FZJCDYC", length=100)

    public String getVFzjcdyc() {
        return this.VFzjcdyc;
    }
    
    public void setVFzjcdyc(String VFzjcdyc) {
        this.VFzjcdyc = VFzjcdyc;
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
    
    @Column(name="I_JZS", precision=22, scale=0)

    public Integer getIJzs() {
        return this.IJzs;
    }
    
    public void setIJzs(Integer IJzs) {
        this.IJzs = IJzs;
    }
    
    @Column(name="V_GRSDBH", length=50)

    public String getVGrsdbh() {
        return this.VGrsdbh;
    }
    
    public void setVGrsdbh(String VGrsdbh) {
        this.VGrsdbh = VGrsdbh;
    }
   








}