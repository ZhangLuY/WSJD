package com.zrhis.wsjd.system.bean;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * SqglXcysqyls entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="SQGL_XCYSQYLS"
    ,schema="CXJM"
)

public class SqglXcysqyls  implements java.io.Serializable {


    // Fields    

     private String VId;
     private String depId;
     private String depName;
     private String CJth;
     private String VYfjy;
     private String VJfjy;
     private String VYf;
     private String VJf;
     private Date dtYfjysj;
     private Date dtJfjysj;
     private String VJyyy;
     private Integer ICzlx;
     private Integer IZt;
     private Date dtJlsj;
     private Date dtCzsj;
     private String CCzybh;


    // Constructors

    /** default constructor */
    public SqglXcysqyls() {
    }

	/** minimal constructor */
    public SqglXcysqyls(String VId) {
        this.VId = VId;
    }
    
    /** full constructor */
    public SqglXcysqyls(String VId, String depId, String depName, String CJth, String VYfjy, String VJfjy, String VYf, String VJf, Date dtYfjysj, Date dtJfjysj, String VJyyy, Integer ICzlx, Integer IZt, Date dtJlsj, Date dtCzsj, String CCzybh) {
        this.VId = VId;
        this.depId = depId;
        this.depName = depName;
        this.CJth = CJth;
        this.VYfjy = VYfjy;
        this.VJfjy = VJfjy;
        this.VYf = VYf;
        this.VJf = VJf;
        this.dtYfjysj = dtYfjysj;
        this.dtJfjysj = dtJfjysj;
        this.VJyyy = VJyyy;
        this.ICzlx = ICzlx;
        this.IZt = IZt;
        this.dtJlsj = dtJlsj;
        this.dtCzsj = dtCzsj;
        this.CCzybh = CCzybh;
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
    
    @Column(name="DEP_ID", length=50)

    public String getDepId() {
        return this.depId;
    }
    
    public void setDepId(String depId) {
        this.depId = depId;
    }
    
    @Column(name="DEP_NAME", length=50)

    public String getDepName() {
        return this.depName;
    }
    
    public void setDepName(String depName) {
        this.depName = depName;
    }
    
    @Column(name="C_JTH", length=50)

    public String getCJth() {
        return this.CJth;
    }
    
    public void setCJth(String CJth) {
        this.CJth = CJth;
    }
    
    @Column(name="V_YFJY", length=30)

    public String getVYfjy() {
        return this.VYfjy;
    }
    
    public void setVYfjy(String VYfjy) {
        this.VYfjy = VYfjy;
    }
    
    @Column(name="V_JFJY", length=30)

    public String getVJfjy() {
        return this.VJfjy;
    }
    
    public void setVJfjy(String VJfjy) {
        this.VJfjy = VJfjy;
    }
    
    @Column(name="V_YF")

    public String getVYf() {
        return this.VYf;
    }
    
    public void setVYf(String VYf) {
        this.VYf = VYf;
    }
    
    @Column(name="V_JF")

    public String getVJf() {
        return this.VJf;
    }
    
    public void setVJf(String VJf) {
        this.VJf = VJf;
    }
    
    @Column(name="DT_YFJYSJ", length=7)

    public Date getDtYfjysj() {
        return this.dtYfjysj;
    }
    
    public void setDtYfjysj(Date dtYfjysj) {
        this.dtYfjysj = dtYfjysj;
    }
    
    @Column(name="DT_JFJYSJ", length=7)

    public Date getDtJfjysj() {
        return this.dtJfjysj;
    }
    
    public void setDtJfjysj(Date dtJfjysj) {
        this.dtJfjysj = dtJfjysj;
    }
    
    @Column(name="V_JYYY", length=400)

    public String getVJyyy() {
        return this.VJyyy;
    }
    
    public void setVJyyy(String VJyyy) {
        this.VJyyy = VJyyy;
    }
    
    @Column(name="I_CZLX", precision=22, scale=0)

    public Integer getICzlx() {
        return this.ICzlx;
    }
    
    public void setICzlx(Integer ICzlx) {
        this.ICzlx = ICzlx;
    }
    
    @Column(name="I_ZT", precision=22, scale=0)

    public Integer getIZt() {
        return this.IZt;
    }
    
    public void setIZt(Integer IZt) {
        this.IZt = IZt;
    }
    
    @Column(name="DT_JLSJ", length=7)

    public Date getDtJlsj() {
        return this.dtJlsj;
    }
    
    public void setDtJlsj(Date dtJlsj) {
        this.dtJlsj = dtJlsj;
    }
    
    @Column(name="DT_CZSJ", length=7)

    public Date getDtCzsj() {
        return this.dtCzsj;
    }
    
    public void setDtCzsj(Date dtCzsj) {
        this.dtCzsj = dtCzsj;
    }
    
    @Column(name="C_CZYBH", length=30)

    public String getCCzybh() {
        return this.CCzybh;
    }
    
    public void setCCzybh(String CCzybh) {
        this.CCzybh = CCzybh;
    }
   








}