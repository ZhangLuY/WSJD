package com.zrhis.wsjd.system.bean;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

/**
 * SqglJtjbxx entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "SQGL_JTJBXX", schema = "CXJM", uniqueConstraints = @UniqueConstraint(columnNames = {
		"DEP_ID", "C_JTH" }))
public class SqglJtjbxx implements java.io.Serializable {

	// Fields

	private String CJth;
	private String depId;
	private String VHzxm;
	private String VSzjd;
	private String VSzhy;
	private String VSzhl;
	private String VSzhs;
	private String VDh;
	private String VZrys;
	private String VZrhs;
	private String CSqbh;
	private String CSzjdh;
	private String CJwhbh;
	private Integer ISfqdht;
	private String CJtlx;
	private Integer ILendzt;
	private Integer ICsbz;
	private String CJzzk;
	private Double NJzmj;
	private Integer IYsly1;
	private Integer IYsly2;
	private Integer IYsly3;
	private Integer IYsly4;
	private Integer IYsly5;
	private Integer IYsly6;
	private Integer IYsly7;
	private String VQtly;
	private Integer ICslb;
	private String CJtrjsr;
	private Double NYlzwz;
	private Double NZgdwz;
	private Double NPcswz;
	private Integer IZfjg;
	private Integer ILcs;
	private Integer IFjs;
	private Double NM;
	private Double NRjmj;
	private Integer ICg;
	private Integer ITf;
	private Integer IBn;
	private Integer IKqsd;
	private Integer ICf;
	private Integer ISssp;
	private Integer IRl;
	private Integer IPy;
	private Integer IWs;
	private Integer ISz;
	private Integer IJydd;
	private Integer IJydh;
	private Integer IJydsj;
	private Integer IJylyj;
	private Integer IJyfrj;
	private Integer IJydbx;
	private Integer IJyxyj;
	private Integer IJykt;
	private Integer IJyly;
	private Integer IJydn;
	private Integer IJyzxc;
	private Integer IJyjc;
	private Integer IJyjtyy;
	private Integer IJyqt;
	private String VQtjy;
	private Date dtXhsj;
	private String VXhwt;
	private Date dtCssj;
	private String VCswt;
	private Date dtXlqsj;
	private String VXlqwt;
	private Date dtXlhsj;
	private String VXlhwt;
	private Date dtQssj;
	private String VQswt;
	private Date dtLjsj;
	private String VLjwt;
	private Date dtMrsj;
	private String VMrwt;
	private Date dtTxsj;
	private String VTxwt;
	private Date dtSosj;
	private String VSowt;
	private Integer IZt;
	private Integer IZcdyy;
	private String VZdjwh;
	private String VZdxq;
	private String VZdjd;
	private String VZdlh;
	private String VZdfjh;
	private Date dtJdrq;
	private String VBdcz;
	private String VDcz;
	private String VFhz;
	private Date dtQmrq;
	private Date dtDcrq;
	private Date dtFhrq;
	private String VBz;
	private String depName;
	private String VJtsdbh;
	private Date dtCreate;
	private String CCzybh;
	private String VJtzz;
	private Integer IPkjt;
	private String VPkjtyy;
	private String VPkjtyyqt;

	// Constructors

	/** default constructor */
	public SqglJtjbxx() {
	}

	/** minimal constructor */
	public SqglJtjbxx(String CJth, String depId, Date dtJdrq) {
		this.CJth = CJth;
		this.depId = depId;
		this.dtJdrq = dtJdrq;
	}

	/** full constructor */
	public SqglJtjbxx(String cJth, String depId, String vHzxm, String vSzjd,
			String vSzhy, String vSzhl, String vSzhs, String vDh, String vZrys,
			String vZrhs, String cSqbh, String cSzjdh, String cJwhbh,
			Integer iSfqdht, String cJtlx, Integer iLendzt, Integer iCsbz,
			String cJzzk, Double nJzmj, Integer iYsly1, Integer iYsly2,
			Integer iYsly3, Integer iYsly4, Integer iYsly5, Integer iYsly6,
			Integer iYsly7, String vQtly, Integer iCslb, String cJtrjsr,
			Double nYlzwz, Double nZgdwz, Double nPcswz, Integer iZfjg,
			Integer iLcs, Integer iFjs, Double nM, Double nRjmj, Integer iCg,
			Integer iTf, Integer iBn, Integer iKqsd, Integer iCf,
			Integer iSssp, Integer iRl, Integer iPy, Integer iWs, Integer iSz,
			Integer iJydd, Integer iJydh, Integer iJydsj, Integer iJylyj,
			Integer iJyfrj, Integer iJydbx, Integer iJyxyj, Integer iJykt,
			Integer iJyly, Integer iJydn, Integer iJyzxc, Integer iJyjc,
			Integer iJyjtyy, Integer iJyqt, String vQtjy, Date dtXhsj,
			String vXhwt, Date dtCssj, String vCswt, Date dtXlqsj,
			String vXlqwt, Date dtXlhsj, String vXlhwt, Date dtQssj,
			String vQswt, Date dtLjsj, String vLjwt, Date dtMrsj, String vMrwt,
			Date dtTxsj, String vTxwt, Date dtSosj, String vSowt, Integer iZt,
			Integer iZcdyy, String vZdjwh, String vZdxq, String vZdjd,
			String vZdlh, String vZdfjh, Date dtJdrq, String vBdcz,
			String vDcz, String vFhz, Date dtQmrq, Date dtDcrq, Date dtFhrq,
			String vBz, String depName, String vJtsdbh, Date dtCreate,
			String cCzybh, String vJtzz, Integer iPkjt, String vPkjtyy,
			String vPkjtyyqt) {
		super();
		CJth = cJth;
		this.depId = depId;
		VHzxm = vHzxm;
		VSzjd = vSzjd;
		VSzhy = vSzhy;
		VSzhl = vSzhl;
		VSzhs = vSzhs;
		VDh = vDh;
		VZrys = vZrys;
		VZrhs = vZrhs;
		CSqbh = cSqbh;
		CSzjdh = cSzjdh;
		CJwhbh = cJwhbh;
		ISfqdht = iSfqdht;
		CJtlx = cJtlx;
		ILendzt = iLendzt;
		ICsbz = iCsbz;
		CJzzk = cJzzk;
		NJzmj = nJzmj;
		IYsly1 = iYsly1;
		IYsly2 = iYsly2;
		IYsly3 = iYsly3;
		IYsly4 = iYsly4;
		IYsly5 = iYsly5;
		IYsly6 = iYsly6;
		IYsly7 = iYsly7;
		VQtly = vQtly;
		ICslb = iCslb;
		CJtrjsr = cJtrjsr;
		NYlzwz = nYlzwz;
		NZgdwz = nZgdwz;
		NPcswz = nPcswz;
		IZfjg = iZfjg;
		ILcs = iLcs;
		IFjs = iFjs;
		NM = nM;
		NRjmj = nRjmj;
		ICg = iCg;
		ITf = iTf;
		IBn = iBn;
		IKqsd = iKqsd;
		ICf = iCf;
		ISssp = iSssp;
		IRl = iRl;
		IPy = iPy;
		IWs = iWs;
		ISz = iSz;
		IJydd = iJydd;
		IJydh = iJydh;
		IJydsj = iJydsj;
		IJylyj = iJylyj;
		IJyfrj = iJyfrj;
		IJydbx = iJydbx;
		IJyxyj = iJyxyj;
		IJykt = iJykt;
		IJyly = iJyly;
		IJydn = iJydn;
		IJyzxc = iJyzxc;
		IJyjc = iJyjc;
		IJyjtyy = iJyjtyy;
		IJyqt = iJyqt;
		VQtjy = vQtjy;
		this.dtXhsj = dtXhsj;
		VXhwt = vXhwt;
		this.dtCssj = dtCssj;
		VCswt = vCswt;
		this.dtXlqsj = dtXlqsj;
		VXlqwt = vXlqwt;
		this.dtXlhsj = dtXlhsj;
		VXlhwt = vXlhwt;
		this.dtQssj = dtQssj;
		VQswt = vQswt;
		this.dtLjsj = dtLjsj;
		VLjwt = vLjwt;
		this.dtMrsj = dtMrsj;
		VMrwt = vMrwt;
		this.dtTxsj = dtTxsj;
		VTxwt = vTxwt;
		this.dtSosj = dtSosj;
		VSowt = vSowt;
		IZt = iZt;
		IZcdyy = iZcdyy;
		VZdjwh = vZdjwh;
		VZdxq = vZdxq;
		VZdjd = vZdjd;
		VZdlh = vZdlh;
		VZdfjh = vZdfjh;
		this.dtJdrq = dtJdrq;
		VBdcz = vBdcz;
		VDcz = vDcz;
		VFhz = vFhz;
		this.dtQmrq = dtQmrq;
		this.dtDcrq = dtDcrq;
		this.dtFhrq = dtFhrq;
		VBz = vBz;
		this.depName = depName;
		VJtsdbh = vJtsdbh;
		this.dtCreate = dtCreate;
		CCzybh = cCzybh;
		VJtzz = vJtzz;
		IPkjt = iPkjt;
		VPkjtyy = vPkjtyy;
		VPkjtyyqt = vPkjtyyqt;
	}

	// Property accessors
	@Id
	@Column(name = "C_JTH", unique = true, nullable = false, length = 20)
	public String getCJth() {
		return this.CJth;
	}

	public void setCJth(String CJth) {
		this.CJth = CJth;
	}

	@Column(name = "DEP_ID", nullable = false, length = 100)
	public String getDepId() {
		return this.depId;
	}

	public void setDepId(String depId) {
		this.depId = depId;
	}

	@Column(name = "V_HZXM", length = 20)
	public String getVHzxm() {
		return this.VHzxm;
	}

	public void setVHzxm(String VHzxm) {
		this.VHzxm = VHzxm;
	}

	@Column(name = "V_SZJD", length = 30)
	public String getVSzjd() {
		return this.VSzjd;
	}

	public void setVSzjd(String VSzjd) {
		this.VSzjd = VSzjd;
	}

	@Column(name = "V_SZHY", length = 20)
	public String getVSzhy() {
		return this.VSzhy;
	}

	public void setVSzhy(String VSzhy) {
		this.VSzhy = VSzhy;
	}

	@Column(name = "V_SZHL", length = 40)
	public String getVSzhl() {
		return this.VSzhl;
	}

	public void setVSzhl(String VSzhl) {
		this.VSzhl = VSzhl;
	}

	@Column(name = "V_SZHS", length = 40)
	public String getVSzhs() {
		return this.VSzhs;
	}

	public void setVSzhs(String VSzhs) {
		this.VSzhs = VSzhs;
	}

	@Column(name = "V_DH", length = 16)
	public String getVDh() {
		return this.VDh;
	}

	public void setVDh(String VDh) {
		this.VDh = VDh;
	}

	@Column(name = "V_ZRYS", length = 10)
	public String getVZrys() {
		return this.VZrys;
	}

	public void setVZrys(String VZrys) {
		this.VZrys = VZrys;
	}

	@Column(name = "V_ZRHS", length = 10)
	public String getVZrhs() {
		return this.VZrhs;
	}

	public void setVZrhs(String VZrhs) {
		this.VZrhs = VZrhs;
	}

	@Column(name = "C_SQBH", length = 3)
	public String getCSqbh() {
		return this.CSqbh;
	}

	public void setCSqbh(String CSqbh) {
		this.CSqbh = CSqbh;
	}

	@Column(name = "C_SZJDH", length = 50)
	public String getCSzjdh() {
		return this.CSzjdh;
	}

	public void setCSzjdh(String CSzjdh) {
		this.CSzjdh = CSzjdh;
	}

	@Column(name = "C_JWHBH", length = 100)
	public String getCJwhbh() {
		return this.CJwhbh;
	}

	public void setCJwhbh(String CJwhbh) {
		this.CJwhbh = CJwhbh;
	}

	@Column(name = "I_SFQDHT", precision = 22, scale = 0)
	public Integer getISfqdht() {
		return this.ISfqdht;
	}

	public void setISfqdht(Integer ISfqdht) {
		this.ISfqdht = ISfqdht;
	}

	@Column(name = "C_JTLX", length = 2)
	public String getCJtlx() {
		return this.CJtlx;
	}

	public void setCJtlx(String CJtlx) {
		this.CJtlx = CJtlx;
	}

	@Column(name = "I_LENDZT", precision = 22, scale = 0)
	public Integer getILendzt() {
		return this.ILendzt;
	}

	public void setILendzt(Integer ILendzt) {
		this.ILendzt = ILendzt;
	}

	@Column(name = "I_CSBZ", precision = 22, scale = 0)
	public Integer getICsbz() {
		return this.ICsbz;
	}

	public void setICsbz(Integer ICsbz) {
		this.ICsbz = ICsbz;
	}

	@Column(name = "C_JZZK", length = 2)
	public String getCJzzk() {
		return this.CJzzk;
	}

	public void setCJzzk(String CJzzk) {
		this.CJzzk = CJzzk;
	}

	@Column(name = "N_JZMJ")
	public Double getNJzmj() {
		return this.NJzmj;
	}

	public void setNJzmj(Double NJzmj) {
		this.NJzmj = NJzmj;
	}

	@Column(name = "I_YSLY1", precision = 22, scale = 0)
	public Integer getIYsly1() {
		return this.IYsly1;
	}

	public void setIYsly1(Integer IYsly1) {
		this.IYsly1 = IYsly1;
	}

	@Column(name = "I_YSLY2", precision = 22, scale = 0)
	public Integer getIYsly2() {
		return this.IYsly2;
	}

	public void setIYsly2(Integer IYsly2) {
		this.IYsly2 = IYsly2;
	}

	@Column(name = "I_YSLY3", precision = 22, scale = 0)
	public Integer getIYsly3() {
		return this.IYsly3;
	}

	public void setIYsly3(Integer IYsly3) {
		this.IYsly3 = IYsly3;
	}

	@Column(name = "I_YSLY4", precision = 22, scale = 0)
	public Integer getIYsly4() {
		return this.IYsly4;
	}

	public void setIYsly4(Integer IYsly4) {
		this.IYsly4 = IYsly4;
	}

	@Column(name = "I_YSLY5", precision = 22, scale = 0)
	public Integer getIYsly5() {
		return this.IYsly5;
	}

	public void setIYsly5(Integer IYsly5) {
		this.IYsly5 = IYsly5;
	}

	@Column(name = "I_YSLY6", precision = 22, scale = 0)
	public Integer getIYsly6() {
		return this.IYsly6;
	}

	public void setIYsly6(Integer IYsly6) {
		this.IYsly6 = IYsly6;
	}

	@Column(name = "I_YSLY7", precision = 22, scale = 0)
	public Integer getIYsly7() {
		return this.IYsly7;
	}

	public void setIYsly7(Integer IYsly7) {
		this.IYsly7 = IYsly7;
	}

	@Column(name = "V_QTLY", length = 20)
	public String getVQtly() {
		return this.VQtly;
	}

	public void setVQtly(String VQtly) {
		this.VQtly = VQtly;
	}

	@Column(name = "I_CSLB", precision = 22, scale = 0)
	public Integer getICslb() {
		return this.ICslb;
	}

	public void setICslb(Integer ICslb) {
		this.ICslb = ICslb;
	}

	@Column(name = "C_JTRJSR", length = 2)
	public String getCJtrjsr() {
		return this.CJtrjsr;
	}

	public void setCJtrjsr(String CJtrjsr) {
		this.CJtrjsr = CJtrjsr;
	}

	@Column(name = "N_YLZWZ")
	public Double getNYlzwz() {
		return this.NYlzwz;
	}

	public void setNYlzwz(Double NYlzwz) {
		this.NYlzwz = NYlzwz;
	}

	@Column(name = "N_ZGDWZ")
	public Double getNZgdwz() {
		return this.NZgdwz;
	}

	public void setNZgdwz(Double NZgdwz) {
		this.NZgdwz = NZgdwz;
	}

	@Column(name = "N_PCSWZ")
	public Double getNPcswz() {
		return this.NPcswz;
	}

	public void setNPcswz(Double NPcswz) {
		this.NPcswz = NPcswz;
	}

	@Column(name = "I_ZFJG", precision = 22, scale = 0)
	public Integer getIZfjg() {
		return this.IZfjg;
	}

	public void setIZfjg(Integer IZfjg) {
		this.IZfjg = IZfjg;
	}

	@Column(name = "I_LCS", precision = 22, scale = 0)
	public Integer getILcs() {
		return this.ILcs;
	}

	public void setILcs(Integer ILcs) {
		this.ILcs = ILcs;
	}

	@Column(name = "I_FJS", precision = 22, scale = 0)
	public Integer getIFjs() {
		return this.IFjs;
	}

	public void setIFjs(Integer IFjs) {
		this.IFjs = IFjs;
	}

	@Column(name = "N_M")
	public Double getNM() {
		return this.NM;
	}

	public void setNM(Double NM) {
		this.NM = NM;
	}

	@Column(name = "N_RJMJ")
	public Double getNRjmj() {
		return this.NRjmj;
	}

	public void setNRjmj(Double NRjmj) {
		this.NRjmj = NRjmj;
	}

	@Column(name = "I_CG", precision = 22, scale = 0)
	public Integer getICg() {
		return this.ICg;
	}

	public void setICg(Integer ICg) {
		this.ICg = ICg;
	}

	@Column(name = "I_TF", precision = 22, scale = 0)
	public Integer getITf() {
		return this.ITf;
	}

	public void setITf(Integer ITf) {
		this.ITf = ITf;
	}

	@Column(name = "I_BN", precision = 22, scale = 0)
	public Integer getIBn() {
		return this.IBn;
	}

	public void setIBn(Integer IBn) {
		this.IBn = IBn;
	}

	@Column(name = "I_KQSD", precision = 22, scale = 0)
	public Integer getIKqsd() {
		return this.IKqsd;
	}

	public void setIKqsd(Integer IKqsd) {
		this.IKqsd = IKqsd;
	}

	@Column(name = "I_CF", precision = 22, scale = 0)
	public Integer getICf() {
		return this.ICf;
	}

	public void setICf(Integer ICf) {
		this.ICf = ICf;
	}

	@Column(name = "I_SSSP", precision = 22, scale = 0)
	public Integer getISssp() {
		return this.ISssp;
	}

	public void setISssp(Integer ISssp) {
		this.ISssp = ISssp;
	}

	@Column(name = "I_RL", precision = 22, scale = 0)
	public Integer getIRl() {
		return this.IRl;
	}

	public void setIRl(Integer IRl) {
		this.IRl = IRl;
	}

	@Column(name = "I_PY", precision = 22, scale = 0)
	public Integer getIPy() {
		return this.IPy;
	}

	public void setIPy(Integer IPy) {
		this.IPy = IPy;
	}

	@Column(name = "I_WS", precision = 22, scale = 0)
	public Integer getIWs() {
		return this.IWs;
	}

	public void setIWs(Integer IWs) {
		this.IWs = IWs;
	}

	@Column(name = "I_SZ", precision = 22, scale = 0)
	public Integer getISz() {
		return this.ISz;
	}

	public void setISz(Integer ISz) {
		this.ISz = ISz;
	}

	@Column(name = "I_JYDD", precision = 22, scale = 0)
	public Integer getIJydd() {
		return this.IJydd;
	}

	public void setIJydd(Integer IJydd) {
		this.IJydd = IJydd;
	}

	@Column(name = "I_JYDH", precision = 22, scale = 0)
	public Integer getIJydh() {
		return this.IJydh;
	}

	public void setIJydh(Integer IJydh) {
		this.IJydh = IJydh;
	}

	@Column(name = "I_JYDSJ", precision = 22, scale = 0)
	public Integer getIJydsj() {
		return this.IJydsj;
	}

	public void setIJydsj(Integer IJydsj) {
		this.IJydsj = IJydsj;
	}

	@Column(name = "I_JYLYJ", precision = 22, scale = 0)
	public Integer getIJylyj() {
		return this.IJylyj;
	}

	public void setIJylyj(Integer IJylyj) {
		this.IJylyj = IJylyj;
	}

	@Column(name = "I_JYFRJ", precision = 22, scale = 0)
	public Integer getIJyfrj() {
		return this.IJyfrj;
	}

	public void setIJyfrj(Integer IJyfrj) {
		this.IJyfrj = IJyfrj;
	}

	@Column(name = "I_JYDBX", precision = 22, scale = 0)
	public Integer getIJydbx() {
		return this.IJydbx;
	}

	public void setIJydbx(Integer IJydbx) {
		this.IJydbx = IJydbx;
	}

	@Column(name = "I_JYXYJ", precision = 22, scale = 0)
	public Integer getIJyxyj() {
		return this.IJyxyj;
	}

	public void setIJyxyj(Integer IJyxyj) {
		this.IJyxyj = IJyxyj;
	}

	@Column(name = "I_JYKT", precision = 22, scale = 0)
	public Integer getIJykt() {
		return this.IJykt;
	}

	public void setIJykt(Integer IJykt) {
		this.IJykt = IJykt;
	}

	@Column(name = "I_JYLY", precision = 22, scale = 0)
	public Integer getIJyly() {
		return this.IJyly;
	}

	public void setIJyly(Integer IJyly) {
		this.IJyly = IJyly;
	}

	@Column(name = "I_JYDN", precision = 22, scale = 0)
	public Integer getIJydn() {
		return this.IJydn;
	}

	public void setIJydn(Integer IJydn) {
		this.IJydn = IJydn;
	}

	@Column(name = "I_JYZXC", precision = 22, scale = 0)
	public Integer getIJyzxc() {
		return this.IJyzxc;
	}

	public void setIJyzxc(Integer IJyzxc) {
		this.IJyzxc = IJyzxc;
	}

	@Column(name = "I_JYJC", precision = 22, scale = 0)
	public Integer getIJyjc() {
		return this.IJyjc;
	}

	public void setIJyjc(Integer IJyjc) {
		this.IJyjc = IJyjc;
	}

	@Column(name = "I_JYJTYY", precision = 22, scale = 0)
	public Integer getIJyjtyy() {
		return this.IJyjtyy;
	}

	public void setIJyjtyy(Integer IJyjtyy) {
		this.IJyjtyy = IJyjtyy;
	}

	@Column(name = "I_JYQT", precision = 22, scale = 0)
	public Integer getIJyqt() {
		return this.IJyqt;
	}

	public void setIJyqt(Integer IJyqt) {
		this.IJyqt = IJyqt;
	}

	@Column(name = "V_QTJY", length = 100)
	public String getVQtjy() {
		return this.VQtjy;
	}

	public void setVQtjy(String VQtjy) {
		this.VQtjy = VQtjy;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DT_XHSJ", length = 7)
	public Date getDtXhsj() {
		return this.dtXhsj;
	}

	public void setDtXhsj(Date dtXhsj) {
		this.dtXhsj = dtXhsj;
	}

	@Column(name = "V_XHWT", length = 20)
	public String getVXhwt() {
		return this.VXhwt;
	}

	public void setVXhwt(String VXhwt) {
		this.VXhwt = VXhwt;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DT_CSSJ", length = 7)
	public Date getDtCssj() {
		return this.dtCssj;
	}

	public void setDtCssj(Date dtCssj) {
		this.dtCssj = dtCssj;
	}

	@Column(name = "V_CSWT", length = 20)
	public String getVCswt() {
		return this.VCswt;
	}

	public void setVCswt(String VCswt) {
		this.VCswt = VCswt;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DT_XLQSJ", length = 7)
	public Date getDtXlqsj() {
		return this.dtXlqsj;
	}

	public void setDtXlqsj(Date dtXlqsj) {
		this.dtXlqsj = dtXlqsj;
	}

	@Column(name = "V_XLQWT", length = 20)
	public String getVXlqwt() {
		return this.VXlqwt;
	}

	public void setVXlqwt(String VXlqwt) {
		this.VXlqwt = VXlqwt;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DT_XLHSJ", length = 7)
	public Date getDtXlhsj() {
		return this.dtXlhsj;
	}

	public void setDtXlhsj(Date dtXlhsj) {
		this.dtXlhsj = dtXlhsj;
	}

	@Column(name = "V_XLHWT", length = 20)
	public String getVXlhwt() {
		return this.VXlhwt;
	}

	public void setVXlhwt(String VXlhwt) {
		this.VXlhwt = VXlhwt;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DT_QSSJ", length = 7)
	public Date getDtQssj() {
		return this.dtQssj;
	}

	public void setDtQssj(Date dtQssj) {
		this.dtQssj = dtQssj;
	}

	@Column(name = "V_QSWT", length = 20)
	public String getVQswt() {
		return this.VQswt;
	}

	public void setVQswt(String VQswt) {
		this.VQswt = VQswt;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DT_LJSJ", length = 7)
	public Date getDtLjsj() {
		return this.dtLjsj;
	}

	public void setDtLjsj(Date dtLjsj) {
		this.dtLjsj = dtLjsj;
	}

	@Column(name = "V_LJWT", length = 20)
	public String getVLjwt() {
		return this.VLjwt;
	}

	public void setVLjwt(String VLjwt) {
		this.VLjwt = VLjwt;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DT_MRSJ", length = 7)
	public Date getDtMrsj() {
		return this.dtMrsj;
	}

	public void setDtMrsj(Date dtMrsj) {
		this.dtMrsj = dtMrsj;
	}

	@Column(name = "V_MRWT", length = 20)
	public String getVMrwt() {
		return this.VMrwt;
	}

	public void setVMrwt(String VMrwt) {
		this.VMrwt = VMrwt;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DT_TXSJ", length = 7)
	public Date getDtTxsj() {
		return this.dtTxsj;
	}

	public void setDtTxsj(Date dtTxsj) {
		this.dtTxsj = dtTxsj;
	}

	@Column(name = "V_TXWT", length = 20)
	public String getVTxwt() {
		return this.VTxwt;
	}

	public void setVTxwt(String VTxwt) {
		this.VTxwt = VTxwt;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DT_SOSJ", length = 7)
	public Date getDtSosj() {
		return this.dtSosj;
	}

	public void setDtSosj(Date dtSosj) {
		this.dtSosj = dtSosj;
	}

	@Column(name = "V_SOWT", length = 20)
	public String getVSowt() {
		return this.VSowt;
	}

	public void setVSowt(String VSowt) {
		this.VSowt = VSowt;
	}

	@Column(name = "I_ZT", precision = 22, scale = 0)
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

	@Column(name = "V_ZDXQ", length = 20)
	public String getVZdxq() {
		return this.VZdxq;
	}

	public void setVZdxq(String VZdxq) {
		this.VZdxq = VZdxq;
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

	@Temporal(TemporalType.DATE)
	@Column(name = "DT_JDRQ", nullable = false, length = 7)
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

	@Temporal(TemporalType.DATE)
	@Column(name = "DT_QMRQ", length = 7)
	public Date getDtQmrq() {
		return this.dtQmrq;
	}

	public void setDtQmrq(Date dtQmrq) {
		this.dtQmrq = dtQmrq;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DT_DCRQ", length = 7)
	public Date getDtDcrq() {
		return this.dtDcrq;
	}

	public void setDtDcrq(Date dtDcrq) {
		this.dtDcrq = dtDcrq;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DT_FHRQ", length = 7)
	public Date getDtFhrq() {
		return this.dtFhrq;
	}

	public void setDtFhrq(Date dtFhrq) {
		this.dtFhrq = dtFhrq;
	}

	@Column(name = "V_BZ", length = 200)
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

	@Column(name = "V_JTSDBH", length = 20)
	public String getVJtsdbh() {
		return this.VJtsdbh;
	}

	public void setVJtsdbh(String VJtsdbh) {
		this.VJtsdbh = VJtsdbh;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DT_CREATE", length = 7)
	public Date getDtCreate() {
		return dtCreate;
	}

	public void setDtCreate(Date dtCreate) {
		this.dtCreate = dtCreate;
	}

	@Column(name = "C_CZYBH", length = 100)
	public String getCCzybh() {
		return this.CCzybh;
	}

	public void setCCzybh(String CCzybh) {
		this.CCzybh = CCzybh;
	}

	@Column(name = "V_JTZZ", length = 200)
	public String getVJtzz() {
		return this.VJtzz;
	}

	public void setVJtzz(String VJtzz) {
		this.VJtzz = VJtzz;
	}

	@Column(name = "I_PKJT", precision = 22, scale = 0)
	public Integer getIPkjt() {
		return IPkjt;
	}

	public void setIPkjt(Integer iPkjt) {
		IPkjt = iPkjt;
	}
	@Column(name = "V_PKJTYY", length = 50)
	public String getVPkjtyy() {
		return VPkjtyy;
	}

	public void setVPkjtyy(String vPkjtyy) {
		VPkjtyy = vPkjtyy;
	}
	@Column(name = "V_PKJTYYQT", length = 100)
	public String getVPkjtyyqt() {
		return VPkjtyyqt;
	}

	public void setVPkjtyyqt(String vPkjtyyqt) {
		VPkjtyyqt = vPkjtyyqt;
	}
	
}