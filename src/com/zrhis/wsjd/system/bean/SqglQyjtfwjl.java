package com.zrhis.wsjd.system.bean;

import java.math.BigDecimal;
import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * SqglQyjtfwjl entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="SQGL_QYJTFWJL"
    ,schema="CXJM"
)

public class SqglQyjtfwjl  implements java.io.Serializable {


    // Fields    

     private String VId;
     private String depId;
     private String depName;
     private String CJth;
     private String VYljgh;
     private String VYljgmc;
     private Timestamp dtFwsj;
     private String VHzxm;
     private String VJtrenq;
     private String VJtrs;
     private String VJtdh;
     private String VJtzz;
     private BigDecimal IFwzl1;
     private BigDecimal IFwzl2;
     private BigDecimal IFwzl3;
     private BigDecimal IFwzl4;
     private BigDecimal IFwzl5;
     private BigDecimal IFwzl6;
     private BigDecimal IFwzl7;
     private BigDecimal IFwzl8;
     private BigDecimal IFwzl9;
     private BigDecimal IFwzl10;
     private BigDecimal IFwzl11;
     private String VPxjl;
     private String VFwjl;
     private String VFwxj;
     private String VFwpg;
     private String VJsfwjm;
     private String VFwys;
     private String CCzybh;
     private Timestamp dtCreate;
     private String VFwtp;
     private String VFwfs;
     private String VJsjmfwqm;
     private String VFwysqm;
     private BigDecimal IPjzt;
     private BigDecimal ISflx;
     private BigDecimal IYstqjh;
     private BigDecimal IYstd;
     private BigDecimal IPjfs;
     private String VPjnr;
     private Timestamp dtPjsj;
     private String CPjrgrbh;
     private String CUserbh;


    // Constructors

    /** default constructor */
    public SqglQyjtfwjl() {
    }

	/** minimal constructor */
    public SqglQyjtfwjl(String VId) {
        this.VId = VId;
    }
    
    /** full constructor */
    public SqglQyjtfwjl(String VId, String depId, String depName, String CJth, String VYljgh, String VYljgmc, Timestamp dtFwsj, String VHzxm, String VJtrenq, String VJtrs, String VJtdh, String VJtzz, BigDecimal IFwzl1, BigDecimal IFwzl2, BigDecimal IFwzl3, BigDecimal IFwzl4, BigDecimal IFwzl5, BigDecimal IFwzl6, BigDecimal IFwzl7, BigDecimal IFwzl8, BigDecimal IFwzl9, BigDecimal IFwzl10, BigDecimal IFwzl11, String VPxjl, String VFwjl, String VFwxj, String VFwpg, String VJsfwjm, String VFwys, String CCzybh, Timestamp dtCreate, String VFwtp, String VFwfs, String VJsjmfwqm, String VFwysqm, BigDecimal IPjzt, BigDecimal ISflx, BigDecimal IYstqjh, BigDecimal IYstd, BigDecimal IPjfs, String VPjnr, Timestamp dtPjsj, String CPjrgrbh, String CUserbh) {
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
    
    @Column(name="DEP_NAME", length=100)

    public String getDepName() {
        return this.depName;
    }
    
    public void setDepName(String depName) {
        this.depName = depName;
    }
    
    @Column(name="C_JTH", length=20)

    public String getCJth() {
        return this.CJth;
    }
    
    public void setCJth(String CJth) {
        this.CJth = CJth;
    }
    
    @Column(name="V_YLJGH", length=100)

    public String getVYljgh() {
        return this.VYljgh;
    }
    
    public void setVYljgh(String VYljgh) {
        this.VYljgh = VYljgh;
    }
    
    @Column(name="V_YLJGMC", length=100)

    public String getVYljgmc() {
        return this.VYljgmc;
    }
    
    public void setVYljgmc(String VYljgmc) {
        this.VYljgmc = VYljgmc;
    }
    
    @Column(name="DT_FWSJ", length=7)

    public Timestamp getDtFwsj() {
        return this.dtFwsj;
    }
    
    public void setDtFwsj(Timestamp dtFwsj) {
        this.dtFwsj = dtFwsj;
    }
    
    @Column(name="V_HZXM", length=100)

    public String getVHzxm() {
        return this.VHzxm;
    }
    
    public void setVHzxm(String VHzxm) {
        this.VHzxm = VHzxm;
    }
    
    @Column(name="V_JTRENQ", length=100)

    public String getVJtrenq() {
        return this.VJtrenq;
    }
    
    public void setVJtrenq(String VJtrenq) {
        this.VJtrenq = VJtrenq;
    }
    
    @Column(name="V_JTRS", length=100)

    public String getVJtrs() {
        return this.VJtrs;
    }
    
    public void setVJtrs(String VJtrs) {
        this.VJtrs = VJtrs;
    }
    
    @Column(name="V_JTDH", length=100)

    public String getVJtdh() {
        return this.VJtdh;
    }
    
    public void setVJtdh(String VJtdh) {
        this.VJtdh = VJtdh;
    }
    
    @Column(name="V_JTZZ", length=200)

    public String getVJtzz() {
        return this.VJtzz;
    }
    
    public void setVJtzz(String VJtzz) {
        this.VJtzz = VJtzz;
    }
    
    @Column(name="I_FWZL1", precision=22, scale=0)

    public BigDecimal getIFwzl1() {
        return this.IFwzl1;
    }
    
    public void setIFwzl1(BigDecimal IFwzl1) {
        this.IFwzl1 = IFwzl1;
    }
    
    @Column(name="I_FWZL2", precision=22, scale=0)

    public BigDecimal getIFwzl2() {
        return this.IFwzl2;
    }
    
    public void setIFwzl2(BigDecimal IFwzl2) {
        this.IFwzl2 = IFwzl2;
    }
    
    @Column(name="I_FWZL3", precision=22, scale=0)

    public BigDecimal getIFwzl3() {
        return this.IFwzl3;
    }
    
    public void setIFwzl3(BigDecimal IFwzl3) {
        this.IFwzl3 = IFwzl3;
    }
    
    @Column(name="I_FWZL4", precision=22, scale=0)

    public BigDecimal getIFwzl4() {
        return this.IFwzl4;
    }
    
    public void setIFwzl4(BigDecimal IFwzl4) {
        this.IFwzl4 = IFwzl4;
    }
    
    @Column(name="I_FWZL5", precision=22, scale=0)

    public BigDecimal getIFwzl5() {
        return this.IFwzl5;
    }
    
    public void setIFwzl5(BigDecimal IFwzl5) {
        this.IFwzl5 = IFwzl5;
    }
    
    @Column(name="I_FWZL6", precision=22, scale=0)

    public BigDecimal getIFwzl6() {
        return this.IFwzl6;
    }
    
    public void setIFwzl6(BigDecimal IFwzl6) {
        this.IFwzl6 = IFwzl6;
    }
    
    @Column(name="I_FWZL7", precision=22, scale=0)

    public BigDecimal getIFwzl7() {
        return this.IFwzl7;
    }
    
    public void setIFwzl7(BigDecimal IFwzl7) {
        this.IFwzl7 = IFwzl7;
    }
    
    @Column(name="I_FWZL8", precision=22, scale=0)

    public BigDecimal getIFwzl8() {
        return this.IFwzl8;
    }
    
    public void setIFwzl8(BigDecimal IFwzl8) {
        this.IFwzl8 = IFwzl8;
    }
    
    @Column(name="I_FWZL9", precision=22, scale=0)

    public BigDecimal getIFwzl9() {
        return this.IFwzl9;
    }
    
    public void setIFwzl9(BigDecimal IFwzl9) {
        this.IFwzl9 = IFwzl9;
    }
    
    @Column(name="I_FWZL10", precision=22, scale=0)

    public BigDecimal getIFwzl10() {
        return this.IFwzl10;
    }
    
    public void setIFwzl10(BigDecimal IFwzl10) {
        this.IFwzl10 = IFwzl10;
    }
    
    @Column(name="I_FWZL11", precision=22, scale=0)

    public BigDecimal getIFwzl11() {
        return this.IFwzl11;
    }
    
    public void setIFwzl11(BigDecimal IFwzl11) {
        this.IFwzl11 = IFwzl11;
    }
    
    @Column(name="V_PXJL", length=500)

    public String getVPxjl() {
        return this.VPxjl;
    }
    
    public void setVPxjl(String VPxjl) {
        this.VPxjl = VPxjl;
    }
    
    @Column(name="V_FWJL", length=500)

    public String getVFwjl() {
        return this.VFwjl;
    }
    
    public void setVFwjl(String VFwjl) {
        this.VFwjl = VFwjl;
    }
    
    @Column(name="V_FWXJ", length=500)

    public String getVFwxj() {
        return this.VFwxj;
    }
    
    public void setVFwxj(String VFwxj) {
        this.VFwxj = VFwxj;
    }
    
    @Column(name="V_FWPG", length=500)

    public String getVFwpg() {
        return this.VFwpg;
    }
    
    public void setVFwpg(String VFwpg) {
        this.VFwpg = VFwpg;
    }
    
    @Column(name="V_JSFWJM", length=100)

    public String getVJsfwjm() {
        return this.VJsfwjm;
    }
    
    public void setVJsfwjm(String VJsfwjm) {
        this.VJsfwjm = VJsfwjm;
    }
    
    @Column(name="V_FWYS", length=100)

    public String getVFwys() {
        return this.VFwys;
    }
    
    public void setVFwys(String VFwys) {
        this.VFwys = VFwys;
    }
    
    @Column(name="C_CZYBH", length=100)

    public String getCCzybh() {
        return this.CCzybh;
    }
    
    public void setCCzybh(String CCzybh) {
        this.CCzybh = CCzybh;
    }
    
    @Column(name="DT_CREATE", length=7)

    public Timestamp getDtCreate() {
        return this.dtCreate;
    }
    
    public void setDtCreate(Timestamp dtCreate) {
        this.dtCreate = dtCreate;
    }
    
    @Column(name="V_FWTP")

    public String getVFwtp() {
        return this.VFwtp;
    }
    
    public void setVFwtp(String VFwtp) {
        this.VFwtp = VFwtp;
    }
    
    @Column(name="V_FWFS", length=100)

    public String getVFwfs() {
        return this.VFwfs;
    }
    
    public void setVFwfs(String VFwfs) {
        this.VFwfs = VFwfs;
    }
    
    @Column(name="V_JSJMFWQM")

    public String getVJsjmfwqm() {
        return this.VJsjmfwqm;
    }
    
    public void setVJsjmfwqm(String VJsjmfwqm) {
        this.VJsjmfwqm = VJsjmfwqm;
    }
    
    @Column(name="V_FWYSQM")

    public String getVFwysqm() {
        return this.VFwysqm;
    }
    
    public void setVFwysqm(String VFwysqm) {
        this.VFwysqm = VFwysqm;
    }
    
    @Column(name="I_PJZT", precision=22, scale=0)

    public BigDecimal getIPjzt() {
        return this.IPjzt;
    }
    
    public void setIPjzt(BigDecimal IPjzt) {
        this.IPjzt = IPjzt;
    }
    
    @Column(name="I_SFLX", precision=22, scale=0)

    public BigDecimal getISflx() {
        return this.ISflx;
    }
    
    public void setISflx(BigDecimal ISflx) {
        this.ISflx = ISflx;
    }
    
    @Column(name="I_YSTQJH", precision=22, scale=0)

    public BigDecimal getIYstqjh() {
        return this.IYstqjh;
    }
    
    public void setIYstqjh(BigDecimal IYstqjh) {
        this.IYstqjh = IYstqjh;
    }
    
    @Column(name="I_YSTD", precision=22, scale=0)

    public BigDecimal getIYstd() {
        return this.IYstd;
    }
    
    public void setIYstd(BigDecimal IYstd) {
        this.IYstd = IYstd;
    }
    
    @Column(name="I_PJFS", precision=22, scale=0)

    public BigDecimal getIPjfs() {
        return this.IPjfs;
    }
    
    public void setIPjfs(BigDecimal IPjfs) {
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

    public Timestamp getDtPjsj() {
        return this.dtPjsj;
    }
    
    public void setDtPjsj(Timestamp dtPjsj) {
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