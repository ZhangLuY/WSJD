package com.zrhis.wsjd.system.bean;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * SqglXcysqyfw entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "SQGL_XCYSQYFW", schema = "CXJM")
public class SqglXcysqyfw implements java.io.Serializable {

	// Fields

	private String VId;
	private String depId;
	private String depName;
	private String CJth;
	private String VYljgh;
	private String VYljgmc;
	private String VZwsy;
	private Date dtQysj;
	private String VQyjt;
	private String VQyjtdz;
	private Integer NJtrs;
	private String VRqlb;
	private String VXzqyfs;
	private String VJtlxr;
	private String VJtlxdh;
	private Integer NJf;
	private String CCzybh;
	private Date dtCreate;
	private String VSzjdh;
	private Integer NCzrks;
	private Date dtDqsj;
	private String VSzjg;
	private String VSzys;
	private String VSzysdh;
	private String VZzjg1;
	private String VZzys1;
	private String VZzysdh1;
	private String VZzjg2;
	private String VZzys2;
	private String VZzysdh2;
	private String VZzjg3;
	private String VZzys3;
	private String VZzysdh3;
	private String VCwss;
	private Integer IZt;
	private Date dtJysj;
	private String VJyyy;
	private String VCyys;
	private String VCydh;
	private String VWsyys;
	private String VWsydh;
	private String VQjys;
	private String VQjdh;
	private String VJfqz;
	private Date dtJfqzsj;
	private String VYfqz;
	private Date dtYfqzsj;
	private String VJfjy;
	private Date dtJfjysj;
	private String VYfjy;
	private Date dtYfjysj;
	private String VYy;
	private String VJfqm;
	private String VYfqm;
	private String VBz;
	private Integer ISfsc;
	private String VJfjyqm;
	private String VYfjyqm;
	private String VYfc;
	private String VYfz;
	private String VCyxm2;
	private String VCyxm3;
	private String VCyxm4;
	private String VYsbh;
	private String CYlzh;
	private String VJtlx;
	private String VSycyxm;
	private String VCyxm1;
	private String VSycydh;
	private String VSycybh;
	private String VCyxx;
	private String depXname;
	private String depZname;
	private String VYydh;
	private String VTdmc;
	private String VZzxm;
	private String VLxdh1;
	private String VTdid;

	// Constructors

	/** default constructor */
	public SqglXcysqyfw() {
	}

	/** minimal constructor */
	public SqglXcysqyfw(String VId) {
		this.VId = VId;
	}

	/** full constructor */
	public SqglXcysqyfw(String VId, String depId, String depName, String CJth,
			String VYljgh, String VYljgmc, String VZwsy, Date dtQysj,
			String VQyjt, String VQyjtdz, Integer NJtrs, String VRqlb,
			String VXzqyfs, String VJtlxr, String VJtlxdh, Integer NJf,
			String CCzybh, Date dtCreate, String VSzjdh, Integer NCzrks,
			Date dtDqsj, String VSzjg, String VSzys, String VSzysdh,
			String VZzjg1, String VZzys1, String VZzysdh1, String VZzjg2,
			String VZzys2, String VZzysdh2, String VZzjg3, String VZzys3,
			String VZzysdh3, String VCwss, Integer IZt, Date dtJysj,
			String VJyyy, String VCyys, String VCydh, String VWsyys,
			String VWsydh, String VQjys, String VQjdh, String VJfqz,
			Date dtJfqzsj, String VYfqz, Date dtYfqzsj, String VJfjy,
			Date dtJfjysj, String VYfjy, Date dtYfjysj, String VYy,
			String VJfqm, String VYfqm, String VBz, Integer ISfsc,
			String VJfjyqm, String VYfjyqm, String VYfc, String VYfz,
			String VCyxm2, String VCyxm3, String VCyxm4, String VYsbh,
			String CYlzh, String VJtlx, String VSycyxm, String VCyxm1,
			String VSycydh, String VSycybh, String VCyxx, String depXname,
			String depZname, String VYydh, String VTdmc, String VZzxm,
			String VLxdh1, String VTdid) {
		this.VId = VId;
		this.depId = depId;
		this.depName = depName;
		this.CJth = CJth;
		this.VYljgh = VYljgh;
		this.VYljgmc = VYljgmc;
		this.VZwsy = VZwsy;
		this.dtQysj = dtQysj;
		this.VQyjt = VQyjt;
		this.VQyjtdz = VQyjtdz;
		this.NJtrs = NJtrs;
		this.VRqlb = VRqlb;
		this.VXzqyfs = VXzqyfs;
		this.VJtlxr = VJtlxr;
		this.VJtlxdh = VJtlxdh;
		this.NJf = NJf;
		this.CCzybh = CCzybh;
		this.dtCreate = dtCreate;
		this.VSzjdh = VSzjdh;
		this.NCzrks = NCzrks;
		this.dtDqsj = dtDqsj;
		this.VSzjg = VSzjg;
		this.VSzys = VSzys;
		this.VSzysdh = VSzysdh;
		this.VZzjg1 = VZzjg1;
		this.VZzys1 = VZzys1;
		this.VZzysdh1 = VZzysdh1;
		this.VZzjg2 = VZzjg2;
		this.VZzys2 = VZzys2;
		this.VZzysdh2 = VZzysdh2;
		this.VZzjg3 = VZzjg3;
		this.VZzys3 = VZzys3;
		this.VZzysdh3 = VZzysdh3;
		this.VCwss = VCwss;
		this.IZt = IZt;
		this.dtJysj = dtJysj;
		this.VJyyy = VJyyy;
		this.VCyys = VCyys;
		this.VCydh = VCydh;
		this.VWsyys = VWsyys;
		this.VWsydh = VWsydh;
		this.VQjys = VQjys;
		this.VQjdh = VQjdh;
		this.VJfqz = VJfqz;
		this.dtJfqzsj = dtJfqzsj;
		this.VYfqz = VYfqz;
		this.dtYfqzsj = dtYfqzsj;
		this.VJfjy = VJfjy;
		this.dtJfjysj = dtJfjysj;
		this.VYfjy = VYfjy;
		this.dtYfjysj = dtYfjysj;
		this.VYy = VYy;
		this.VJfqm = VJfqm;
		this.VYfqm = VYfqm;
		this.VBz = VBz;
		this.ISfsc = ISfsc;
		this.VJfjyqm = VJfjyqm;
		this.VYfjyqm = VYfjyqm;
		this.VYfc = VYfc;
		this.VYfz = VYfz;
		this.VCyxm2 = VCyxm2;
		this.VCyxm3 = VCyxm3;
		this.VCyxm4 = VCyxm4;
		this.VYsbh = VYsbh;
		this.CYlzh = CYlzh;
		this.VJtlx = VJtlx;
		this.VSycyxm = VSycyxm;
		this.VCyxm1 = VCyxm1;
		this.VSycydh = VSycydh;
		this.VSycybh = VSycybh;
		this.VCyxx = VCyxx;
		this.depXname = depXname;
		this.depZname = depZname;
		this.VYydh = VYydh;
		this.VTdmc = VTdmc;
		this.VZzxm = VZzxm;
		this.VLxdh1 = VLxdh1;
		this.VTdid = VTdid;
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

	@Column(name = "V_ZWSY", length = 100)
	public String getVZwsy() {
		return this.VZwsy;
	}

	public void setVZwsy(String VZwsy) {
		this.VZwsy = VZwsy;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DT_QYSJ", length = 7)
	public Date getDtQysj() {
		return this.dtQysj;
	}

	public void setDtQysj(Date dtQysj) {
		this.dtQysj = dtQysj;
	}

	@Column(name = "V_QYJT", length = 100)
	public String getVQyjt() {
		return this.VQyjt;
	}

	public void setVQyjt(String VQyjt) {
		this.VQyjt = VQyjt;
	}

	@Column(name = "V_QYJTDZ", length = 100)
	public String getVQyjtdz() {
		return this.VQyjtdz;
	}

	public void setVQyjtdz(String VQyjtdz) {
		this.VQyjtdz = VQyjtdz;
	}

	@Column(name = "N_JTRS", precision = 22, scale = 0)
	public Integer getNJtrs() {
		return this.NJtrs;
	}

	public void setNJtrs(Integer NJtrs) {
		this.NJtrs = NJtrs;
	}

	@Column(name = "V_RQLB", length = 100)
	public String getVRqlb() {
		return this.VRqlb;
	}

	public void setVRqlb(String VRqlb) {
		this.VRqlb = VRqlb;
	}

	@Column(name = "V_XZQYFS", length = 100)
	public String getVXzqyfs() {
		return this.VXzqyfs;
	}

	public void setVXzqyfs(String VXzqyfs) {
		this.VXzqyfs = VXzqyfs;
	}

	@Column(name = "V_JTLXR", length = 60)
	public String getVJtlxr() {
		return this.VJtlxr;
	}

	public void setVJtlxr(String VJtlxr) {
		this.VJtlxr = VJtlxr;
	}

	@Column(name = "V_JTLXDH", length = 20)
	public String getVJtlxdh() {
		return this.VJtlxdh;
	}

	public void setVJtlxdh(String VJtlxdh) {
		this.VJtlxdh = VJtlxdh;
	}

	@Column(name = "N_JF", precision = 22, scale = 0)
	public Integer getNJf() {
		return this.NJf;
	}

	public void setNJf(Integer NJf) {
		this.NJf = NJf;
	}

	@Column(name = "C_CZYBH", length = 100)
	public String getCCzybh() {
		return this.CCzybh;
	}

	public void setCCzybh(String CCzybh) {
		this.CCzybh = CCzybh;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DT_CREATE", length = 7)
	public Date getDtCreate() {
		return this.dtCreate;
	}

	public void setDtCreate(Date dtCreate) {
		this.dtCreate = dtCreate;
	}

	@Column(name = "V_SZJDH", length = 100)
	public String getVSzjdh() {
		return this.VSzjdh;
	}

	public void setVSzjdh(String VSzjdh) {
		this.VSzjdh = VSzjdh;
	}

	@Column(name = "N_CZRKS", precision = 22, scale = 0)
	public Integer getNCzrks() {
		return this.NCzrks;
	}

	public void setNCzrks(Integer NCzrks) {
		this.NCzrks = NCzrks;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DT_DQSJ", length = 7)
	public Date getDtDqsj() {
		return this.dtDqsj;
	}

	public void setDtDqsj(Date dtDqsj) {
		this.dtDqsj = dtDqsj;
	}

	@Column(name = "V_SZJG", length = 100)
	public String getVSzjg() {
		return this.VSzjg;
	}

	public void setVSzjg(String VSzjg) {
		this.VSzjg = VSzjg;
	}

	@Column(name = "V_SZYS", length = 100)
	public String getVSzys() {
		return this.VSzys;
	}

	public void setVSzys(String VSzys) {
		this.VSzys = VSzys;
	}

	@Column(name = "V_SZYSDH", length = 100)
	public String getVSzysdh() {
		return this.VSzysdh;
	}

	public void setVSzysdh(String VSzysdh) {
		this.VSzysdh = VSzysdh;
	}

	@Column(name = "V_ZZJG1", length = 100)
	public String getVZzjg1() {
		return this.VZzjg1;
	}

	public void setVZzjg1(String VZzjg1) {
		this.VZzjg1 = VZzjg1;
	}

	@Column(name = "V_ZZYS1", length = 100)
	public String getVZzys1() {
		return this.VZzys1;
	}

	public void setVZzys1(String VZzys1) {
		this.VZzys1 = VZzys1;
	}

	@Column(name = "V_ZZYSDH1", length = 100)
	public String getVZzysdh1() {
		return this.VZzysdh1;
	}

	public void setVZzysdh1(String VZzysdh1) {
		this.VZzysdh1 = VZzysdh1;
	}

	@Column(name = "V_ZZJG2", length = 100)
	public String getVZzjg2() {
		return this.VZzjg2;
	}

	public void setVZzjg2(String VZzjg2) {
		this.VZzjg2 = VZzjg2;
	}

	@Column(name = "V_ZZYS2", length = 100)
	public String getVZzys2() {
		return this.VZzys2;
	}

	public void setVZzys2(String VZzys2) {
		this.VZzys2 = VZzys2;
	}

	@Column(name = "V_ZZYSDH2", length = 100)
	public String getVZzysdh2() {
		return this.VZzysdh2;
	}

	public void setVZzysdh2(String VZzysdh2) {
		this.VZzysdh2 = VZzysdh2;
	}

	@Column(name = "V_ZZJG3", length = 100)
	public String getVZzjg3() {
		return this.VZzjg3;
	}

	public void setVZzjg3(String VZzjg3) {
		this.VZzjg3 = VZzjg3;
	}

	@Column(name = "V_ZZYS3", length = 100)
	public String getVZzys3() {
		return this.VZzys3;
	}

	public void setVZzys3(String VZzys3) {
		this.VZzys3 = VZzys3;
	}

	@Column(name = "V_ZZYSDH3", length = 100)
	public String getVZzysdh3() {
		return this.VZzysdh3;
	}

	public void setVZzysdh3(String VZzysdh3) {
		this.VZzysdh3 = VZzysdh3;
	}

	@Column(name = "V_CWSS", length = 100)
	public String getVCwss() {
		return this.VCwss;
	}

	public void setVCwss(String VCwss) {
		this.VCwss = VCwss;
	}

	@Column(name = "I_ZT", precision = 22, scale = 0)
	public Integer getIZt() {
		return this.IZt;
	}

	public void setIZt(Integer IZt) {
		this.IZt = IZt;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DT_JYSJ", length = 7)
	public Date getDtJysj() {
		return this.dtJysj;
	}

	public void setDtJysj(Date dtJysj) {
		this.dtJysj = dtJysj;
	}

	@Column(name = "V_JYYY", length = 500)
	public String getVJyyy() {
		return this.VJyyy;
	}

	public void setVJyyy(String VJyyy) {
		this.VJyyy = VJyyy;
	}

	@Column(name = "V_CYYS", length = 100)
	public String getVCyys() {
		return this.VCyys;
	}

	public void setVCyys(String VCyys) {
		this.VCyys = VCyys;
	}

	@Column(name = "V_CYDH", length = 100)
	public String getVCydh() {
		return this.VCydh;
	}

	public void setVCydh(String VCydh) {
		this.VCydh = VCydh;
	}

	@Column(name = "V_WSYYS", length = 100)
	public String getVWsyys() {
		return this.VWsyys;
	}

	public void setVWsyys(String VWsyys) {
		this.VWsyys = VWsyys;
	}

	@Column(name = "V_WSYDH", length = 100)
	public String getVWsydh() {
		return this.VWsydh;
	}

	public void setVWsydh(String VWsydh) {
		this.VWsydh = VWsydh;
	}

	@Column(name = "V_QJYS", length = 100)
	public String getVQjys() {
		return this.VQjys;
	}

	public void setVQjys(String VQjys) {
		this.VQjys = VQjys;
	}

	@Column(name = "V_QJDH", length = 100)
	public String getVQjdh() {
		return this.VQjdh;
	}

	public void setVQjdh(String VQjdh) {
		this.VQjdh = VQjdh;
	}

	@Column(name = "V_JFQZ", length = 100)
	public String getVJfqz() {
		return this.VJfqz;
	}

	public void setVJfqz(String VJfqz) {
		this.VJfqz = VJfqz;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DT_JFQZSJ", length = 7)
	public Date getDtJfqzsj() {
		return this.dtJfqzsj;
	}

	public void setDtJfqzsj(Date dtJfqzsj) {
		this.dtJfqzsj = dtJfqzsj;
	}

	@Column(name = "V_YFQZ", length = 100)
	public String getVYfqz() {
		return this.VYfqz;
	}

	public void setVYfqz(String VYfqz) {
		this.VYfqz = VYfqz;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DT_YFQZSJ", length = 7)
	public Date getDtYfqzsj() {
		return this.dtYfqzsj;
	}

	public void setDtYfqzsj(Date dtYfqzsj) {
		this.dtYfqzsj = dtYfqzsj;
	}

	@Column(name = "V_JFJY", length = 100)
	public String getVJfjy() {
		return this.VJfjy;
	}

	public void setVJfjy(String VJfjy) {
		this.VJfjy = VJfjy;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DT_JFJYSJ", length = 7)
	public Date getDtJfjysj() {
		return this.dtJfjysj;
	}

	public void setDtJfjysj(Date dtJfjysj) {
		this.dtJfjysj = dtJfjysj;
	}

	@Column(name = "V_YFJY", length = 100)
	public String getVYfjy() {
		return this.VYfjy;
	}

	public void setVYfjy(String VYfjy) {
		this.VYfjy = VYfjy;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DT_YFJYSJ", length = 7)
	public Date getDtYfjysj() {
		return this.dtYfjysj;
	}

	public void setDtYfjysj(Date dtYfjysj) {
		this.dtYfjysj = dtYfjysj;
	}

	@Column(name = "V_YY", length = 100)
	public String getVYy() {
		return this.VYy;
	}

	public void setVYy(String VYy) {
		this.VYy = VYy;
	}

	@Column(name = "V_JFQM")
	public String getVJfqm() {
		return this.VJfqm;
	}

	public void setVJfqm(String VJfqm) {
		this.VJfqm = VJfqm;
	}

	@Column(name = "V_YFQM")
	public String getVYfqm() {
		return this.VYfqm;
	}

	public void setVYfqm(String VYfqm) {
		this.VYfqm = VYfqm;
	}

	@Column(name = "V_BZ")
	public String getVBz() {
		return this.VBz;
	}

	public void setVBz(String VBz) {
		this.VBz = VBz;
	}

	@Column(name = "I_SFSC", precision = 22, scale = 0)
	public Integer getISfsc() {
		return this.ISfsc;
	}

	public void setISfsc(Integer ISfsc) {
		this.ISfsc = ISfsc;
	}

	@Column(name = "V_JFJYQM")
	public String getVJfjyqm() {
		return this.VJfjyqm;
	}

	public void setVJfjyqm(String VJfjyqm) {
		this.VJfjyqm = VJfjyqm;
	}

	@Column(name = "V_YFJYQM")
	public String getVYfjyqm() {
		return this.VYfjyqm;
	}

	public void setVYfjyqm(String VYfjyqm) {
		this.VYfjyqm = VYfjyqm;
	}

	@Column(name = "V_YFC", length = 20)
	public String getVYfc() {
		return this.VYfc;
	}

	public void setVYfc(String VYfc) {
		this.VYfc = VYfc;
	}

	@Column(name = "V_YFZ", length = 20)
	public String getVYfz() {
		return this.VYfz;
	}

	public void setVYfz(String VYfz) {
		this.VYfz = VYfz;
	}

	@Column(name = "V_CYXM2", length = 100)
	public String getVCyxm2() {
		return this.VCyxm2;
	}

	public void setVCyxm2(String VCyxm2) {
		this.VCyxm2 = VCyxm2;
	}

	@Column(name = "V_CYXM3", length = 100)
	public String getVCyxm3() {
		return this.VCyxm3;
	}

	public void setVCyxm3(String VCyxm3) {
		this.VCyxm3 = VCyxm3;
	}

	@Column(name = "V_CYXM4", length = 100)
	public String getVCyxm4() {
		return this.VCyxm4;
	}

	public void setVCyxm4(String VCyxm4) {
		this.VCyxm4 = VCyxm4;
	}

	@Column(name = "V_YSBH", length = 100)
	public String getVYsbh() {
		return this.VYsbh;
	}

	public void setVYsbh(String VYsbh) {
		this.VYsbh = VYsbh;
	}

	@Column(name = "C_YLZH", length = 100)
	public String getCYlzh() {
		return this.CYlzh;
	}

	public void setCYlzh(String CYlzh) {
		this.CYlzh = CYlzh;
	}

	@Column(name = "V_JTLX", length = 100)
	public String getVJtlx() {
		return this.VJtlx;
	}

	public void setVJtlx(String VJtlx) {
		this.VJtlx = VJtlx;
	}

	@Column(name = "V_SYCYXM", length = 1000)
	public String getVSycyxm() {
		return this.VSycyxm;
	}

	public void setVSycyxm(String VSycyxm) {
		this.VSycyxm = VSycyxm;
	}

	@Column(name = "V_CYXM1", length = 100)
	public String getVCyxm1() {
		return this.VCyxm1;
	}

	public void setVCyxm1(String VCyxm1) {
		this.VCyxm1 = VCyxm1;
	}

	@Column(name = "V_SYCYDH", length = 1000)
	public String getVSycydh() {
		return this.VSycydh;
	}

	public void setVSycydh(String VSycydh) {
		this.VSycydh = VSycydh;
	}

	@Column(name = "V_SYCYBH", length = 1000)
	public String getVSycybh() {
		return this.VSycybh;
	}

	public void setVSycybh(String VSycybh) {
		this.VSycybh = VSycybh;
	}

	@Column(name = "V_CYXX")
	public String getVCyxx() {
		return this.VCyxx;
	}

	public void setVCyxx(String VCyxx) {
		this.VCyxx = VCyxx;
	}

	@Column(name = "DEP_XNAME", length = 100)
	public String getDepXname() {
		return this.depXname;
	}

	public void setDepXname(String depXname) {
		this.depXname = depXname;
	}

	@Column(name = "DEP_ZNAME", length = 100)
	public String getDepZname() {
		return this.depZname;
	}

	public void setDepZname(String depZname) {
		this.depZname = depZname;
	}

	@Column(name = "V_YYDH", length = 100)
	public String getVYydh() {
		return this.VYydh;
	}

	public void setVYydh(String VYydh) {
		this.VYydh = VYydh;
	}

	@Column(name = "V_TDMC", length = 100)
	public String getVTdmc() {
		return this.VTdmc;
	}

	public void setVTdmc(String VTdmc) {
		this.VTdmc = VTdmc;
	}

	@Column(name = "V_ZZXM", length = 100)
	public String getVZzxm() {
		return this.VZzxm;
	}

	public void setVZzxm(String VZzxm) {
		this.VZzxm = VZzxm;
	}

	@Column(name = "V_LXDH1", length = 100)
	public String getVLxdh1() {
		return this.VLxdh1;
	}

	public void setVLxdh1(String VLxdh1) {
		this.VLxdh1 = VLxdh1;
	}

	@Column(name = "V_TDID", length = 100)
	public String getVTdid() {
		return this.VTdid;
	}

	public void setVTdid(String VTdid) {
		this.VTdid = VTdid;
	}

}