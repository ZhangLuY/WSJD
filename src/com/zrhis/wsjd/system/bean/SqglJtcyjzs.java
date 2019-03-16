package com.zrhis.wsjd.system.bean;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * SqglJtcyjzs entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "SQGL_JTCYJZS", schema = "CXJM", uniqueConstraints = @UniqueConstraint(columnNames = {
		"DEP_ID", "C_GRBH", "DT_JLSJ" }))
public class SqglJtcyjzs implements java.io.Serializable {

	// Fields

	private String CGrbh;
	private String depId;
	private String CId;
	private Date dtJlsj;
	private Integer IJblb1F;
	private Integer IJblb2F;
	private Integer IJblb3F;
	private Integer IJblb4F;
	private Integer IJblb5F;
	private Integer IJblb6F;
	private Integer IJblb7F;
	private Integer IJblb8F;
	private Integer IJblb9F;
	private Integer IJblb10F;
	private Integer IJblb11F;
	private Integer IJblb12F;
	private Integer IJblb13F;
	private Integer IJblb14F;
	private Integer IJblb15F;
	private Integer IJblb16F;
	private Integer IJblb17F;
	private Integer IJblb18F;
	private Integer IJblb19F;
	private Integer IJblb20F;
	private Integer IJblb21F;
	private Integer IJblb22F;
	private Integer IJblb23F;
	private Integer IJblb24F;
	private Integer IJblb25F;
	private Integer IJblb26F;
	private Integer IJblb27F;
	private Integer IJblb28F;
	private Integer IJblb29F;
	private Integer IJblb30F;
	private Integer IJblb31M;
	private Integer IJblb32M;
	private Integer IJblb33M;
	private Integer IJblb34M;
	private Integer IJblb35M;
	private Integer IJblb36M;
	private Integer IJblb37M;
	private Integer IJblb38M;
	private Integer IJblb39M;
	private Integer IJblb40M;
	private Integer IJblb41M;
	private Integer IJblb42M;
	private Integer IJblb43M;
	private Integer IJblb44M;
	private Integer IJblb45M;
	private Integer IJblb46M;
	private Integer IJblb47M;
	private Integer IJblb48M;
	private Integer IJblb49M;
	private Integer IJblb50M;
	private Integer IJblb51M;
	private Integer IJblb52M;
	private Integer IJblb53M;
	private Integer IJblb54M;
	private Integer IJblb55M;
	private Integer IJblb56M;
	private Integer IJblb57M;
	private Integer IJblb58M;
	private Integer IJblb59M;
	private Integer IJblb60M;
	private Integer IJblb61X;
	private Integer IJblb62X;
	private Integer IJblb63X;
	private Integer IJblb64X;
	private Integer IJblb65X;
	private Integer IJblb66X;
	private Integer IJblb67X;
	private Integer IJblb68X;
	private Integer IJblb69X;
	private Integer IJblb70X;
	private Integer IJblb71X;
	private Integer IJblb72X;
	private Integer IJblb73X;
	private Integer IJblb74X;
	private Integer IJblb75X;
	private Integer IJblb76X;
	private Integer IJblb77X;
	private Integer IJblb78X;
	private Integer IJblb79X;
	private Integer IJblb80X;
	private Integer IJblb81X;
	private Integer IJblb82X;
	private Integer IJblb83X;
	private Integer IJblb84X;
	private Integer IJblb85X;
	private Integer IJblb86X;
	private Integer IJblb87X;
	private Integer IJblb88X;
	private Integer IJblb89X;
	private Integer IJblb90X;
	private Integer IJblb91P;
	private Integer IJblb92P;
	private Integer IJblb93P;
	private Integer IJblb94P;
	private Integer IJblb95P;
	private Integer IJblb96P;
	private Integer IJblb97P;
	private Integer IJblb98P;
	private Integer IJblb99P;
	private Integer IJblb100P;
	private Integer IJblb101P;
	private Integer IJblb102P;
	private Integer IJblb103P;
	private Integer IJblb104P;
	private Integer IJblb105P;
	private Integer IJblb106P;
	private Integer IJblb107P;
	private Integer IJblb108P;
	private Integer IJblb109P;
	private Integer IJblb110P;
	private Integer IJblb111P;
	private Integer IJblb112P;
	private Integer IJblb113P;
	private Integer IJblb114P;
	private Integer IJblb115P;
	private Integer IJblb116P;
	private Integer IJblb117P;
	private Integer IJblb118P;
	private Integer IJblb119P;
	private Integer IJblb120P;
	private Integer IJblb121Z;
	private Integer IJblb122Z;
	private Integer IJblb123Z;
	private Integer IJblb124Z;
	private Integer IJblb125Z;
	private Integer IJblb126Z;
	private Integer IJblb127Z;
	private Integer IJblb128Z;
	private Integer IJblb129Z;
	private Integer IJblb130Z;
	private Integer IJblb131Z;
	private Integer IJblb132Z;
	private Integer IJblb133Z;
	private Integer IJblb134Z;
	private Integer IJblb135Z;
	private Integer IJblb136Z;
	private Integer IJblb137Z;
	private Integer IJblb138Z;
	private Integer IJblb139Z;
	private Integer IJblb140Z;
	private Integer IJblb141Z;
	private Integer IJblb142Z;
	private Integer IJblb143Z;
	private Integer IJblb144Z;
	private Integer IJblb145Z;
	private Integer IJblb146Z;
	private Integer IJblb147Z;
	private Integer IJblb148Z;
	private Integer IJblb149Z;
	private Integer IJblb150Z;
	private String VQtjzs;
	private String VBdcz;
	private String VDcz;
	private String VFhz;
	private Date dtQmrq;
	private Date dtDcrq;
	private Date dtFhrq;
	private String CCzybh;
	private String VBz;
	private Integer IYwyc;
	private String VYcjbmc;
	private String depName;
	private Date dtCreate;

	// Constructors

	/** default constructor */
	public SqglJtcyjzs() {
	}

	/** minimal constructor */
	public SqglJtcyjzs(String CGrbh, String depId, Date dtJlsj,
			String CCzybh) {
		this.CGrbh = CGrbh;
		this.depId = depId;
		this.dtJlsj = dtJlsj;
		this.CCzybh = CCzybh;
	}

	/** full constructor */
	public SqglJtcyjzs(String CGrbh, String depId, String CId,
			Date dtJlsj, Integer IJblb1F, Integer IJblb2F,
			Integer IJblb3F, Integer IJblb4F, Integer IJblb5F,
			Integer IJblb6F, Integer IJblb7F, Integer IJblb8F,
			Integer IJblb9F, Integer IJblb10F, Integer IJblb11F,
			Integer IJblb12F, Integer IJblb13F, Integer IJblb14F,
			Integer IJblb15F, Integer IJblb16F, Integer IJblb17F,
			Integer IJblb18F, Integer IJblb19F, Integer IJblb20F,
			Integer IJblb21F, Integer IJblb22F, Integer IJblb23F,
			Integer IJblb24F, Integer IJblb25F, Integer IJblb26F,
			Integer IJblb27F, Integer IJblb28F, Integer IJblb29F,
			Integer IJblb30F, Integer IJblb31M, Integer IJblb32M,
			Integer IJblb33M, Integer IJblb34M, Integer IJblb35M,
			Integer IJblb36M, Integer IJblb37M, Integer IJblb38M,
			Integer IJblb39M, Integer IJblb40M, Integer IJblb41M,
			Integer IJblb42M, Integer IJblb43M, Integer IJblb44M,
			Integer IJblb45M, Integer IJblb46M, Integer IJblb47M,
			Integer IJblb48M, Integer IJblb49M, Integer IJblb50M,
			Integer IJblb51M, Integer IJblb52M, Integer IJblb53M,
			Integer IJblb54M, Integer IJblb55M, Integer IJblb56M,
			Integer IJblb57M, Integer IJblb58M, Integer IJblb59M,
			Integer IJblb60M, Integer IJblb61X, Integer IJblb62X,
			Integer IJblb63X, Integer IJblb64X, Integer IJblb65X,
			Integer IJblb66X, Integer IJblb67X, Integer IJblb68X,
			Integer IJblb69X, Integer IJblb70X, Integer IJblb71X,
			Integer IJblb72X, Integer IJblb73X, Integer IJblb74X,
			Integer IJblb75X, Integer IJblb76X, Integer IJblb77X,
			Integer IJblb78X, Integer IJblb79X, Integer IJblb80X,
			Integer IJblb81X, Integer IJblb82X, Integer IJblb83X,
			Integer IJblb84X, Integer IJblb85X, Integer IJblb86X,
			Integer IJblb87X, Integer IJblb88X, Integer IJblb89X,
			Integer IJblb90X, Integer IJblb91P, Integer IJblb92P,
			Integer IJblb93P, Integer IJblb94P, Integer IJblb95P,
			Integer IJblb96P, Integer IJblb97P, Integer IJblb98P,
			Integer IJblb99P, Integer IJblb100P, Integer IJblb101P,
			Integer IJblb102P, Integer IJblb103P, Integer IJblb104P,
			Integer IJblb105P, Integer IJblb106P, Integer IJblb107P,
			Integer IJblb108P, Integer IJblb109P, Integer IJblb110P,
			Integer IJblb111P, Integer IJblb112P, Integer IJblb113P,
			Integer IJblb114P, Integer IJblb115P, Integer IJblb116P,
			Integer IJblb117P, Integer IJblb118P, Integer IJblb119P,
			Integer IJblb120P, Integer IJblb121Z, Integer IJblb122Z,
			Integer IJblb123Z, Integer IJblb124Z, Integer IJblb125Z,
			Integer IJblb126Z, Integer IJblb127Z, Integer IJblb128Z,
			Integer IJblb129Z, Integer IJblb130Z, Integer IJblb131Z,
			Integer IJblb132Z, Integer IJblb133Z, Integer IJblb134Z,
			Integer IJblb135Z, Integer IJblb136Z, Integer IJblb137Z,
			Integer IJblb138Z, Integer IJblb139Z, Integer IJblb140Z,
			Integer IJblb141Z, Integer IJblb142Z, Integer IJblb143Z,
			Integer IJblb144Z, Integer IJblb145Z, Integer IJblb146Z,
			Integer IJblb147Z, Integer IJblb148Z, Integer IJblb149Z,
			Integer IJblb150Z, String VQtjzs, String VBdcz, String VDcz,
			String VFhz, Date dtQmrq, Date dtDcrq, Date dtFhrq,
			String CCzybh, String VBz, Integer IYwyc, String VYcjbmc,
			String depName, Date dtCreate) {
		this.CGrbh = CGrbh;
		this.depId = depId;
		this.CId = CId;
		this.dtJlsj = dtJlsj;
		this.IJblb1F = IJblb1F;
		this.IJblb2F = IJblb2F;
		this.IJblb3F = IJblb3F;
		this.IJblb4F = IJblb4F;
		this.IJblb5F = IJblb5F;
		this.IJblb6F = IJblb6F;
		this.IJblb7F = IJblb7F;
		this.IJblb8F = IJblb8F;
		this.IJblb9F = IJblb9F;
		this.IJblb10F = IJblb10F;
		this.IJblb11F = IJblb11F;
		this.IJblb12F = IJblb12F;
		this.IJblb13F = IJblb13F;
		this.IJblb14F = IJblb14F;
		this.IJblb15F = IJblb15F;
		this.IJblb16F = IJblb16F;
		this.IJblb17F = IJblb17F;
		this.IJblb18F = IJblb18F;
		this.IJblb19F = IJblb19F;
		this.IJblb20F = IJblb20F;
		this.IJblb21F = IJblb21F;
		this.IJblb22F = IJblb22F;
		this.IJblb23F = IJblb23F;
		this.IJblb24F = IJblb24F;
		this.IJblb25F = IJblb25F;
		this.IJblb26F = IJblb26F;
		this.IJblb27F = IJblb27F;
		this.IJblb28F = IJblb28F;
		this.IJblb29F = IJblb29F;
		this.IJblb30F = IJblb30F;
		this.IJblb31M = IJblb31M;
		this.IJblb32M = IJblb32M;
		this.IJblb33M = IJblb33M;
		this.IJblb34M = IJblb34M;
		this.IJblb35M = IJblb35M;
		this.IJblb36M = IJblb36M;
		this.IJblb37M = IJblb37M;
		this.IJblb38M = IJblb38M;
		this.IJblb39M = IJblb39M;
		this.IJblb40M = IJblb40M;
		this.IJblb41M = IJblb41M;
		this.IJblb42M = IJblb42M;
		this.IJblb43M = IJblb43M;
		this.IJblb44M = IJblb44M;
		this.IJblb45M = IJblb45M;
		this.IJblb46M = IJblb46M;
		this.IJblb47M = IJblb47M;
		this.IJblb48M = IJblb48M;
		this.IJblb49M = IJblb49M;
		this.IJblb50M = IJblb50M;
		this.IJblb51M = IJblb51M;
		this.IJblb52M = IJblb52M;
		this.IJblb53M = IJblb53M;
		this.IJblb54M = IJblb54M;
		this.IJblb55M = IJblb55M;
		this.IJblb56M = IJblb56M;
		this.IJblb57M = IJblb57M;
		this.IJblb58M = IJblb58M;
		this.IJblb59M = IJblb59M;
		this.IJblb60M = IJblb60M;
		this.IJblb61X = IJblb61X;
		this.IJblb62X = IJblb62X;
		this.IJblb63X = IJblb63X;
		this.IJblb64X = IJblb64X;
		this.IJblb65X = IJblb65X;
		this.IJblb66X = IJblb66X;
		this.IJblb67X = IJblb67X;
		this.IJblb68X = IJblb68X;
		this.IJblb69X = IJblb69X;
		this.IJblb70X = IJblb70X;
		this.IJblb71X = IJblb71X;
		this.IJblb72X = IJblb72X;
		this.IJblb73X = IJblb73X;
		this.IJblb74X = IJblb74X;
		this.IJblb75X = IJblb75X;
		this.IJblb76X = IJblb76X;
		this.IJblb77X = IJblb77X;
		this.IJblb78X = IJblb78X;
		this.IJblb79X = IJblb79X;
		this.IJblb80X = IJblb80X;
		this.IJblb81X = IJblb81X;
		this.IJblb82X = IJblb82X;
		this.IJblb83X = IJblb83X;
		this.IJblb84X = IJblb84X;
		this.IJblb85X = IJblb85X;
		this.IJblb86X = IJblb86X;
		this.IJblb87X = IJblb87X;
		this.IJblb88X = IJblb88X;
		this.IJblb89X = IJblb89X;
		this.IJblb90X = IJblb90X;
		this.IJblb91P = IJblb91P;
		this.IJblb92P = IJblb92P;
		this.IJblb93P = IJblb93P;
		this.IJblb94P = IJblb94P;
		this.IJblb95P = IJblb95P;
		this.IJblb96P = IJblb96P;
		this.IJblb97P = IJblb97P;
		this.IJblb98P = IJblb98P;
		this.IJblb99P = IJblb99P;
		this.IJblb100P = IJblb100P;
		this.IJblb101P = IJblb101P;
		this.IJblb102P = IJblb102P;
		this.IJblb103P = IJblb103P;
		this.IJblb104P = IJblb104P;
		this.IJblb105P = IJblb105P;
		this.IJblb106P = IJblb106P;
		this.IJblb107P = IJblb107P;
		this.IJblb108P = IJblb108P;
		this.IJblb109P = IJblb109P;
		this.IJblb110P = IJblb110P;
		this.IJblb111P = IJblb111P;
		this.IJblb112P = IJblb112P;
		this.IJblb113P = IJblb113P;
		this.IJblb114P = IJblb114P;
		this.IJblb115P = IJblb115P;
		this.IJblb116P = IJblb116P;
		this.IJblb117P = IJblb117P;
		this.IJblb118P = IJblb118P;
		this.IJblb119P = IJblb119P;
		this.IJblb120P = IJblb120P;
		this.IJblb121Z = IJblb121Z;
		this.IJblb122Z = IJblb122Z;
		this.IJblb123Z = IJblb123Z;
		this.IJblb124Z = IJblb124Z;
		this.IJblb125Z = IJblb125Z;
		this.IJblb126Z = IJblb126Z;
		this.IJblb127Z = IJblb127Z;
		this.IJblb128Z = IJblb128Z;
		this.IJblb129Z = IJblb129Z;
		this.IJblb130Z = IJblb130Z;
		this.IJblb131Z = IJblb131Z;
		this.IJblb132Z = IJblb132Z;
		this.IJblb133Z = IJblb133Z;
		this.IJblb134Z = IJblb134Z;
		this.IJblb135Z = IJblb135Z;
		this.IJblb136Z = IJblb136Z;
		this.IJblb137Z = IJblb137Z;
		this.IJblb138Z = IJblb138Z;
		this.IJblb139Z = IJblb139Z;
		this.IJblb140Z = IJblb140Z;
		this.IJblb141Z = IJblb141Z;
		this.IJblb142Z = IJblb142Z;
		this.IJblb143Z = IJblb143Z;
		this.IJblb144Z = IJblb144Z;
		this.IJblb145Z = IJblb145Z;
		this.IJblb146Z = IJblb146Z;
		this.IJblb147Z = IJblb147Z;
		this.IJblb148Z = IJblb148Z;
		this.IJblb149Z = IJblb149Z;
		this.IJblb150Z = IJblb150Z;
		this.VQtjzs = VQtjzs;
		this.VBdcz = VBdcz;
		this.VDcz = VDcz;
		this.VFhz = VFhz;
		this.dtQmrq = dtQmrq;
		this.dtDcrq = dtDcrq;
		this.dtFhrq = dtFhrq;
		this.CCzybh = CCzybh;
		this.VBz = VBz;
		this.IYwyc = IYwyc;
		this.VYcjbmc = VYcjbmc;
		this.depName = depName;
		this.dtCreate = dtCreate;
	}

	// Property accessors
	@Id
	@Column(name = "C_GRBH", unique = true, nullable = false, length = 22)
	public String getCGrbh() {
		return this.CGrbh;
	}

	public void setCGrbh(String CGrbh) {
		this.CGrbh = CGrbh;
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

	@Column(name = "DT_JLSJ", nullable = false, length = 7)
	public Date getDtJlsj() {
		return this.dtJlsj;
	}

	public void setDtJlsj(Date dtJlsj) {
		this.dtJlsj = dtJlsj;
	}

	@Column(name = "I_JBLB1_F", precision = 22, scale = 0)
	public Integer getIJblb1F() {
		return this.IJblb1F;
	}

	public void setIJblb1F(Integer IJblb1F) {
		this.IJblb1F = IJblb1F;
	}

	@Column(name = "I_JBLB2_F", precision = 22, scale = 0)
	public Integer getIJblb2F() {
		return this.IJblb2F;
	}

	public void setIJblb2F(Integer IJblb2F) {
		this.IJblb2F = IJblb2F;
	}

	@Column(name = "I_JBLB3_F", precision = 22, scale = 0)
	public Integer getIJblb3F() {
		return this.IJblb3F;
	}

	public void setIJblb3F(Integer IJblb3F) {
		this.IJblb3F = IJblb3F;
	}

	@Column(name = "I_JBLB4_F", precision = 22, scale = 0)
	public Integer getIJblb4F() {
		return this.IJblb4F;
	}

	public void setIJblb4F(Integer IJblb4F) {
		this.IJblb4F = IJblb4F;
	}

	@Column(name = "I_JBLB5_F", precision = 22, scale = 0)
	public Integer getIJblb5F() {
		return this.IJblb5F;
	}

	public void setIJblb5F(Integer IJblb5F) {
		this.IJblb5F = IJblb5F;
	}

	@Column(name = "I_JBLB6_F", precision = 22, scale = 0)
	public Integer getIJblb6F() {
		return this.IJblb6F;
	}

	public void setIJblb6F(Integer IJblb6F) {
		this.IJblb6F = IJblb6F;
	}

	@Column(name = "I_JBLB7_F", precision = 22, scale = 0)
	public Integer getIJblb7F() {
		return this.IJblb7F;
	}

	public void setIJblb7F(Integer IJblb7F) {
		this.IJblb7F = IJblb7F;
	}

	@Column(name = "I_JBLB8_F", precision = 22, scale = 0)
	public Integer getIJblb8F() {
		return this.IJblb8F;
	}

	public void setIJblb8F(Integer IJblb8F) {
		this.IJblb8F = IJblb8F;
	}

	@Column(name = "I_JBLB9_F", precision = 22, scale = 0)
	public Integer getIJblb9F() {
		return this.IJblb9F;
	}

	public void setIJblb9F(Integer IJblb9F) {
		this.IJblb9F = IJblb9F;
	}

	@Column(name = "I_JBLB10_F", precision = 22, scale = 0)
	public Integer getIJblb10F() {
		return this.IJblb10F;
	}

	public void setIJblb10F(Integer IJblb10F) {
		this.IJblb10F = IJblb10F;
	}

	@Column(name = "I_JBLB11_F", precision = 22, scale = 0)
	public Integer getIJblb11F() {
		return this.IJblb11F;
	}

	public void setIJblb11F(Integer IJblb11F) {
		this.IJblb11F = IJblb11F;
	}

	@Column(name = "I_JBLB12_F", precision = 22, scale = 0)
	public Integer getIJblb12F() {
		return this.IJblb12F;
	}

	public void setIJblb12F(Integer IJblb12F) {
		this.IJblb12F = IJblb12F;
	}

	@Column(name = "I_JBLB13_F", precision = 22, scale = 0)
	public Integer getIJblb13F() {
		return this.IJblb13F;
	}

	public void setIJblb13F(Integer IJblb13F) {
		this.IJblb13F = IJblb13F;
	}

	@Column(name = "I_JBLB14_F", precision = 22, scale = 0)
	public Integer getIJblb14F() {
		return this.IJblb14F;
	}

	public void setIJblb14F(Integer IJblb14F) {
		this.IJblb14F = IJblb14F;
	}

	@Column(name = "I_JBLB15_F", precision = 22, scale = 0)
	public Integer getIJblb15F() {
		return this.IJblb15F;
	}

	public void setIJblb15F(Integer IJblb15F) {
		this.IJblb15F = IJblb15F;
	}

	@Column(name = "I_JBLB16_F", precision = 22, scale = 0)
	public Integer getIJblb16F() {
		return this.IJblb16F;
	}

	public void setIJblb16F(Integer IJblb16F) {
		this.IJblb16F = IJblb16F;
	}

	@Column(name = "I_JBLB17_F", precision = 22, scale = 0)
	public Integer getIJblb17F() {
		return this.IJblb17F;
	}

	public void setIJblb17F(Integer IJblb17F) {
		this.IJblb17F = IJblb17F;
	}

	@Column(name = "I_JBLB18_F", precision = 22, scale = 0)
	public Integer getIJblb18F() {
		return this.IJblb18F;
	}

	public void setIJblb18F(Integer IJblb18F) {
		this.IJblb18F = IJblb18F;
	}

	@Column(name = "I_JBLB19_F", precision = 22, scale = 0)
	public Integer getIJblb19F() {
		return this.IJblb19F;
	}

	public void setIJblb19F(Integer IJblb19F) {
		this.IJblb19F = IJblb19F;
	}

	@Column(name = "I_JBLB20_F", precision = 22, scale = 0)
	public Integer getIJblb20F() {
		return this.IJblb20F;
	}

	public void setIJblb20F(Integer IJblb20F) {
		this.IJblb20F = IJblb20F;
	}

	@Column(name = "I_JBLB21_F", precision = 22, scale = 0)
	public Integer getIJblb21F() {
		return this.IJblb21F;
	}

	public void setIJblb21F(Integer IJblb21F) {
		this.IJblb21F = IJblb21F;
	}

	@Column(name = "I_JBLB22_F", precision = 22, scale = 0)
	public Integer getIJblb22F() {
		return this.IJblb22F;
	}

	public void setIJblb22F(Integer IJblb22F) {
		this.IJblb22F = IJblb22F;
	}

	@Column(name = "I_JBLB23_F", precision = 22, scale = 0)
	public Integer getIJblb23F() {
		return this.IJblb23F;
	}

	public void setIJblb23F(Integer IJblb23F) {
		this.IJblb23F = IJblb23F;
	}

	@Column(name = "I_JBLB24_F", precision = 22, scale = 0)
	public Integer getIJblb24F() {
		return this.IJblb24F;
	}

	public void setIJblb24F(Integer IJblb24F) {
		this.IJblb24F = IJblb24F;
	}

	@Column(name = "I_JBLB25_F", precision = 22, scale = 0)
	public Integer getIJblb25F() {
		return this.IJblb25F;
	}

	public void setIJblb25F(Integer IJblb25F) {
		this.IJblb25F = IJblb25F;
	}

	@Column(name = "I_JBLB26_F", precision = 22, scale = 0)
	public Integer getIJblb26F() {
		return this.IJblb26F;
	}

	public void setIJblb26F(Integer IJblb26F) {
		this.IJblb26F = IJblb26F;
	}

	@Column(name = "I_JBLB27_F", precision = 22, scale = 0)
	public Integer getIJblb27F() {
		return this.IJblb27F;
	}

	public void setIJblb27F(Integer IJblb27F) {
		this.IJblb27F = IJblb27F;
	}

	@Column(name = "I_JBLB28_F", precision = 22, scale = 0)
	public Integer getIJblb28F() {
		return this.IJblb28F;
	}

	public void setIJblb28F(Integer IJblb28F) {
		this.IJblb28F = IJblb28F;
	}

	@Column(name = "I_JBLB29_F", precision = 22, scale = 0)
	public Integer getIJblb29F() {
		return this.IJblb29F;
	}

	public void setIJblb29F(Integer IJblb29F) {
		this.IJblb29F = IJblb29F;
	}

	@Column(name = "I_JBLB30_F", precision = 22, scale = 0)
	public Integer getIJblb30F() {
		return this.IJblb30F;
	}

	public void setIJblb30F(Integer IJblb30F) {
		this.IJblb30F = IJblb30F;
	}

	@Column(name = "I_JBLB31_M", precision = 22, scale = 0)
	public Integer getIJblb31M() {
		return this.IJblb31M;
	}

	public void setIJblb31M(Integer IJblb31M) {
		this.IJblb31M = IJblb31M;
	}

	@Column(name = "I_JBLB32_M", precision = 22, scale = 0)
	public Integer getIJblb32M() {
		return this.IJblb32M;
	}

	public void setIJblb32M(Integer IJblb32M) {
		this.IJblb32M = IJblb32M;
	}

	@Column(name = "I_JBLB33_M", precision = 22, scale = 0)
	public Integer getIJblb33M() {
		return this.IJblb33M;
	}

	public void setIJblb33M(Integer IJblb33M) {
		this.IJblb33M = IJblb33M;
	}

	@Column(name = "I_JBLB34_M", precision = 22, scale = 0)
	public Integer getIJblb34M() {
		return this.IJblb34M;
	}

	public void setIJblb34M(Integer IJblb34M) {
		this.IJblb34M = IJblb34M;
	}

	@Column(name = "I_JBLB35_M", precision = 22, scale = 0)
	public Integer getIJblb35M() {
		return this.IJblb35M;
	}

	public void setIJblb35M(Integer IJblb35M) {
		this.IJblb35M = IJblb35M;
	}

	@Column(name = "I_JBLB36_M", precision = 22, scale = 0)
	public Integer getIJblb36M() {
		return this.IJblb36M;
	}

	public void setIJblb36M(Integer IJblb36M) {
		this.IJblb36M = IJblb36M;
	}

	@Column(name = "I_JBLB37_M", precision = 22, scale = 0)
	public Integer getIJblb37M() {
		return this.IJblb37M;
	}

	public void setIJblb37M(Integer IJblb37M) {
		this.IJblb37M = IJblb37M;
	}

	@Column(name = "I_JBLB38_M", precision = 22, scale = 0)
	public Integer getIJblb38M() {
		return this.IJblb38M;
	}

	public void setIJblb38M(Integer IJblb38M) {
		this.IJblb38M = IJblb38M;
	}

	@Column(name = "I_JBLB39_M", precision = 22, scale = 0)
	public Integer getIJblb39M() {
		return this.IJblb39M;
	}

	public void setIJblb39M(Integer IJblb39M) {
		this.IJblb39M = IJblb39M;
	}

	@Column(name = "I_JBLB40_M", precision = 22, scale = 0)
	public Integer getIJblb40M() {
		return this.IJblb40M;
	}

	public void setIJblb40M(Integer IJblb40M) {
		this.IJblb40M = IJblb40M;
	}

	@Column(name = "I_JBLB41_M", precision = 22, scale = 0)
	public Integer getIJblb41M() {
		return this.IJblb41M;
	}

	public void setIJblb41M(Integer IJblb41M) {
		this.IJblb41M = IJblb41M;
	}

	@Column(name = "I_JBLB42_M", precision = 22, scale = 0)
	public Integer getIJblb42M() {
		return this.IJblb42M;
	}

	public void setIJblb42M(Integer IJblb42M) {
		this.IJblb42M = IJblb42M;
	}

	@Column(name = "I_JBLB43_M", precision = 22, scale = 0)
	public Integer getIJblb43M() {
		return this.IJblb43M;
	}

	public void setIJblb43M(Integer IJblb43M) {
		this.IJblb43M = IJblb43M;
	}

	@Column(name = "I_JBLB44_M", precision = 22, scale = 0)
	public Integer getIJblb44M() {
		return this.IJblb44M;
	}

	public void setIJblb44M(Integer IJblb44M) {
		this.IJblb44M = IJblb44M;
	}

	@Column(name = "I_JBLB45_M", precision = 22, scale = 0)
	public Integer getIJblb45M() {
		return this.IJblb45M;
	}

	public void setIJblb45M(Integer IJblb45M) {
		this.IJblb45M = IJblb45M;
	}

	@Column(name = "I_JBLB46_M", precision = 22, scale = 0)
	public Integer getIJblb46M() {
		return this.IJblb46M;
	}

	public void setIJblb46M(Integer IJblb46M) {
		this.IJblb46M = IJblb46M;
	}

	@Column(name = "I_JBLB47_M", precision = 22, scale = 0)
	public Integer getIJblb47M() {
		return this.IJblb47M;
	}

	public void setIJblb47M(Integer IJblb47M) {
		this.IJblb47M = IJblb47M;
	}

	@Column(name = "I_JBLB48_M", precision = 22, scale = 0)
	public Integer getIJblb48M() {
		return this.IJblb48M;
	}

	public void setIJblb48M(Integer IJblb48M) {
		this.IJblb48M = IJblb48M;
	}

	@Column(name = "I_JBLB49_M", precision = 22, scale = 0)
	public Integer getIJblb49M() {
		return this.IJblb49M;
	}

	public void setIJblb49M(Integer IJblb49M) {
		this.IJblb49M = IJblb49M;
	}

	@Column(name = "I_JBLB50_M", precision = 22, scale = 0)
	public Integer getIJblb50M() {
		return this.IJblb50M;
	}

	public void setIJblb50M(Integer IJblb50M) {
		this.IJblb50M = IJblb50M;
	}

	@Column(name = "I_JBLB51_M", precision = 22, scale = 0)
	public Integer getIJblb51M() {
		return this.IJblb51M;
	}

	public void setIJblb51M(Integer IJblb51M) {
		this.IJblb51M = IJblb51M;
	}

	@Column(name = "I_JBLB52_M", precision = 22, scale = 0)
	public Integer getIJblb52M() {
		return this.IJblb52M;
	}

	public void setIJblb52M(Integer IJblb52M) {
		this.IJblb52M = IJblb52M;
	}

	@Column(name = "I_JBLB53_M", precision = 22, scale = 0)
	public Integer getIJblb53M() {
		return this.IJblb53M;
	}

	public void setIJblb53M(Integer IJblb53M) {
		this.IJblb53M = IJblb53M;
	}

	@Column(name = "I_JBLB54_M", precision = 22, scale = 0)
	public Integer getIJblb54M() {
		return this.IJblb54M;
	}

	public void setIJblb54M(Integer IJblb54M) {
		this.IJblb54M = IJblb54M;
	}

	@Column(name = "I_JBLB55_M", precision = 22, scale = 0)
	public Integer getIJblb55M() {
		return this.IJblb55M;
	}

	public void setIJblb55M(Integer IJblb55M) {
		this.IJblb55M = IJblb55M;
	}

	@Column(name = "I_JBLB56_M", precision = 22, scale = 0)
	public Integer getIJblb56M() {
		return this.IJblb56M;
	}

	public void setIJblb56M(Integer IJblb56M) {
		this.IJblb56M = IJblb56M;
	}

	@Column(name = "I_JBLB57_M", precision = 22, scale = 0)
	public Integer getIJblb57M() {
		return this.IJblb57M;
	}

	public void setIJblb57M(Integer IJblb57M) {
		this.IJblb57M = IJblb57M;
	}

	@Column(name = "I_JBLB58_M", precision = 22, scale = 0)
	public Integer getIJblb58M() {
		return this.IJblb58M;
	}

	public void setIJblb58M(Integer IJblb58M) {
		this.IJblb58M = IJblb58M;
	}

	@Column(name = "I_JBLB59_M", precision = 22, scale = 0)
	public Integer getIJblb59M() {
		return this.IJblb59M;
	}

	public void setIJblb59M(Integer IJblb59M) {
		this.IJblb59M = IJblb59M;
	}

	@Column(name = "I_JBLB60_M", precision = 22, scale = 0)
	public Integer getIJblb60M() {
		return this.IJblb60M;
	}

	public void setIJblb60M(Integer IJblb60M) {
		this.IJblb60M = IJblb60M;
	}

	@Column(name = "I_JBLB61_X", precision = 22, scale = 0)
	public Integer getIJblb61X() {
		return this.IJblb61X;
	}

	public void setIJblb61X(Integer IJblb61X) {
		this.IJblb61X = IJblb61X;
	}

	@Column(name = "I_JBLB62_X", precision = 22, scale = 0)
	public Integer getIJblb62X() {
		return this.IJblb62X;
	}

	public void setIJblb62X(Integer IJblb62X) {
		this.IJblb62X = IJblb62X;
	}

	@Column(name = "I_JBLB63_X", precision = 22, scale = 0)
	public Integer getIJblb63X() {
		return this.IJblb63X;
	}

	public void setIJblb63X(Integer IJblb63X) {
		this.IJblb63X = IJblb63X;
	}

	@Column(name = "I_JBLB64_X", precision = 22, scale = 0)
	public Integer getIJblb64X() {
		return this.IJblb64X;
	}

	public void setIJblb64X(Integer IJblb64X) {
		this.IJblb64X = IJblb64X;
	}

	@Column(name = "I_JBLB65_X", precision = 22, scale = 0)
	public Integer getIJblb65X() {
		return this.IJblb65X;
	}

	public void setIJblb65X(Integer IJblb65X) {
		this.IJblb65X = IJblb65X;
	}

	@Column(name = "I_JBLB66_X", precision = 22, scale = 0)
	public Integer getIJblb66X() {
		return this.IJblb66X;
	}

	public void setIJblb66X(Integer IJblb66X) {
		this.IJblb66X = IJblb66X;
	}

	@Column(name = "I_JBLB67_X", precision = 22, scale = 0)
	public Integer getIJblb67X() {
		return this.IJblb67X;
	}

	public void setIJblb67X(Integer IJblb67X) {
		this.IJblb67X = IJblb67X;
	}

	@Column(name = "I_JBLB68_X", precision = 22, scale = 0)
	public Integer getIJblb68X() {
		return this.IJblb68X;
	}

	public void setIJblb68X(Integer IJblb68X) {
		this.IJblb68X = IJblb68X;
	}

	@Column(name = "I_JBLB69_X", precision = 22, scale = 0)
	public Integer getIJblb69X() {
		return this.IJblb69X;
	}

	public void setIJblb69X(Integer IJblb69X) {
		this.IJblb69X = IJblb69X;
	}

	@Column(name = "I_JBLB70_X", precision = 22, scale = 0)
	public Integer getIJblb70X() {
		return this.IJblb70X;
	}

	public void setIJblb70X(Integer IJblb70X) {
		this.IJblb70X = IJblb70X;
	}

	@Column(name = "I_JBLB71_X", precision = 22, scale = 0)
	public Integer getIJblb71X() {
		return this.IJblb71X;
	}

	public void setIJblb71X(Integer IJblb71X) {
		this.IJblb71X = IJblb71X;
	}

	@Column(name = "I_JBLB72_X", precision = 22, scale = 0)
	public Integer getIJblb72X() {
		return this.IJblb72X;
	}

	public void setIJblb72X(Integer IJblb72X) {
		this.IJblb72X = IJblb72X;
	}

	@Column(name = "I_JBLB73_X", precision = 22, scale = 0)
	public Integer getIJblb73X() {
		return this.IJblb73X;
	}

	public void setIJblb73X(Integer IJblb73X) {
		this.IJblb73X = IJblb73X;
	}

	@Column(name = "I_JBLB74_X", precision = 22, scale = 0)
	public Integer getIJblb74X() {
		return this.IJblb74X;
	}

	public void setIJblb74X(Integer IJblb74X) {
		this.IJblb74X = IJblb74X;
	}

	@Column(name = "I_JBLB75_X", precision = 22, scale = 0)
	public Integer getIJblb75X() {
		return this.IJblb75X;
	}

	public void setIJblb75X(Integer IJblb75X) {
		this.IJblb75X = IJblb75X;
	}

	@Column(name = "I_JBLB76_X", precision = 22, scale = 0)
	public Integer getIJblb76X() {
		return this.IJblb76X;
	}

	public void setIJblb76X(Integer IJblb76X) {
		this.IJblb76X = IJblb76X;
	}

	@Column(name = "I_JBLB77_X", precision = 22, scale = 0)
	public Integer getIJblb77X() {
		return this.IJblb77X;
	}

	public void setIJblb77X(Integer IJblb77X) {
		this.IJblb77X = IJblb77X;
	}

	@Column(name = "I_JBLB78_X", precision = 22, scale = 0)
	public Integer getIJblb78X() {
		return this.IJblb78X;
	}

	public void setIJblb78X(Integer IJblb78X) {
		this.IJblb78X = IJblb78X;
	}

	@Column(name = "I_JBLB79_X", precision = 22, scale = 0)
	public Integer getIJblb79X() {
		return this.IJblb79X;
	}

	public void setIJblb79X(Integer IJblb79X) {
		this.IJblb79X = IJblb79X;
	}

	@Column(name = "I_JBLB80_X", precision = 22, scale = 0)
	public Integer getIJblb80X() {
		return this.IJblb80X;
	}

	public void setIJblb80X(Integer IJblb80X) {
		this.IJblb80X = IJblb80X;
	}

	@Column(name = "I_JBLB81_X", precision = 22, scale = 0)
	public Integer getIJblb81X() {
		return this.IJblb81X;
	}

	public void setIJblb81X(Integer IJblb81X) {
		this.IJblb81X = IJblb81X;
	}

	@Column(name = "I_JBLB82_X", precision = 22, scale = 0)
	public Integer getIJblb82X() {
		return this.IJblb82X;
	}

	public void setIJblb82X(Integer IJblb82X) {
		this.IJblb82X = IJblb82X;
	}

	@Column(name = "I_JBLB83_X", precision = 22, scale = 0)
	public Integer getIJblb83X() {
		return this.IJblb83X;
	}

	public void setIJblb83X(Integer IJblb83X) {
		this.IJblb83X = IJblb83X;
	}

	@Column(name = "I_JBLB84_X", precision = 22, scale = 0)
	public Integer getIJblb84X() {
		return this.IJblb84X;
	}

	public void setIJblb84X(Integer IJblb84X) {
		this.IJblb84X = IJblb84X;
	}

	@Column(name = "I_JBLB85_X", precision = 22, scale = 0)
	public Integer getIJblb85X() {
		return this.IJblb85X;
	}

	public void setIJblb85X(Integer IJblb85X) {
		this.IJblb85X = IJblb85X;
	}

	@Column(name = "I_JBLB86_X", precision = 22, scale = 0)
	public Integer getIJblb86X() {
		return this.IJblb86X;
	}

	public void setIJblb86X(Integer IJblb86X) {
		this.IJblb86X = IJblb86X;
	}

	@Column(name = "I_JBLB87_X", precision = 22, scale = 0)
	public Integer getIJblb87X() {
		return this.IJblb87X;
	}

	public void setIJblb87X(Integer IJblb87X) {
		this.IJblb87X = IJblb87X;
	}

	@Column(name = "I_JBLB88_X", precision = 22, scale = 0)
	public Integer getIJblb88X() {
		return this.IJblb88X;
	}

	public void setIJblb88X(Integer IJblb88X) {
		this.IJblb88X = IJblb88X;
	}

	@Column(name = "I_JBLB89_X", precision = 22, scale = 0)
	public Integer getIJblb89X() {
		return this.IJblb89X;
	}

	public void setIJblb89X(Integer IJblb89X) {
		this.IJblb89X = IJblb89X;
	}

	@Column(name = "I_JBLB90_X", precision = 22, scale = 0)
	public Integer getIJblb90X() {
		return this.IJblb90X;
	}

	public void setIJblb90X(Integer IJblb90X) {
		this.IJblb90X = IJblb90X;
	}

	@Column(name = "I_JBLB91_P", precision = 22, scale = 0)
	public Integer getIJblb91P() {
		return this.IJblb91P;
	}

	public void setIJblb91P(Integer IJblb91P) {
		this.IJblb91P = IJblb91P;
	}

	@Column(name = "I_JBLB92_P", precision = 22, scale = 0)
	public Integer getIJblb92P() {
		return this.IJblb92P;
	}

	public void setIJblb92P(Integer IJblb92P) {
		this.IJblb92P = IJblb92P;
	}

	@Column(name = "I_JBLB93_P", precision = 22, scale = 0)
	public Integer getIJblb93P() {
		return this.IJblb93P;
	}

	public void setIJblb93P(Integer IJblb93P) {
		this.IJblb93P = IJblb93P;
	}

	@Column(name = "I_JBLB94_P", precision = 22, scale = 0)
	public Integer getIJblb94P() {
		return this.IJblb94P;
	}

	public void setIJblb94P(Integer IJblb94P) {
		this.IJblb94P = IJblb94P;
	}

	@Column(name = "I_JBLB95_P", precision = 22, scale = 0)
	public Integer getIJblb95P() {
		return this.IJblb95P;
	}

	public void setIJblb95P(Integer IJblb95P) {
		this.IJblb95P = IJblb95P;
	}

	@Column(name = "I_JBLB96_P", precision = 22, scale = 0)
	public Integer getIJblb96P() {
		return this.IJblb96P;
	}

	public void setIJblb96P(Integer IJblb96P) {
		this.IJblb96P = IJblb96P;
	}

	@Column(name = "I_JBLB97_P", precision = 22, scale = 0)
	public Integer getIJblb97P() {
		return this.IJblb97P;
	}

	public void setIJblb97P(Integer IJblb97P) {
		this.IJblb97P = IJblb97P;
	}

	@Column(name = "I_JBLB98_P", precision = 22, scale = 0)
	public Integer getIJblb98P() {
		return this.IJblb98P;
	}

	public void setIJblb98P(Integer IJblb98P) {
		this.IJblb98P = IJblb98P;
	}

	@Column(name = "I_JBLB99_P", precision = 22, scale = 0)
	public Integer getIJblb99P() {
		return this.IJblb99P;
	}

	public void setIJblb99P(Integer IJblb99P) {
		this.IJblb99P = IJblb99P;
	}

	@Column(name = "I_JBLB100_P", precision = 22, scale = 0)
	public Integer getIJblb100P() {
		return this.IJblb100P;
	}

	public void setIJblb100P(Integer IJblb100P) {
		this.IJblb100P = IJblb100P;
	}

	@Column(name = "I_JBLB101_P", precision = 22, scale = 0)
	public Integer getIJblb101P() {
		return this.IJblb101P;
	}

	public void setIJblb101P(Integer IJblb101P) {
		this.IJblb101P = IJblb101P;
	}

	@Column(name = "I_JBLB102_P", precision = 22, scale = 0)
	public Integer getIJblb102P() {
		return this.IJblb102P;
	}

	public void setIJblb102P(Integer IJblb102P) {
		this.IJblb102P = IJblb102P;
	}

	@Column(name = "I_JBLB103_P", precision = 22, scale = 0)
	public Integer getIJblb103P() {
		return this.IJblb103P;
	}

	public void setIJblb103P(Integer IJblb103P) {
		this.IJblb103P = IJblb103P;
	}

	@Column(name = "I_JBLB104_P", precision = 22, scale = 0)
	public Integer getIJblb104P() {
		return this.IJblb104P;
	}

	public void setIJblb104P(Integer IJblb104P) {
		this.IJblb104P = IJblb104P;
	}

	@Column(name = "I_JBLB105_P", precision = 22, scale = 0)
	public Integer getIJblb105P() {
		return this.IJblb105P;
	}

	public void setIJblb105P(Integer IJblb105P) {
		this.IJblb105P = IJblb105P;
	}

	@Column(name = "I_JBLB106_P", precision = 22, scale = 0)
	public Integer getIJblb106P() {
		return this.IJblb106P;
	}

	public void setIJblb106P(Integer IJblb106P) {
		this.IJblb106P = IJblb106P;
	}

	@Column(name = "I_JBLB107_P", precision = 22, scale = 0)
	public Integer getIJblb107P() {
		return this.IJblb107P;
	}

	public void setIJblb107P(Integer IJblb107P) {
		this.IJblb107P = IJblb107P;
	}

	@Column(name = "I_JBLB108_P", precision = 22, scale = 0)
	public Integer getIJblb108P() {
		return this.IJblb108P;
	}

	public void setIJblb108P(Integer IJblb108P) {
		this.IJblb108P = IJblb108P;
	}

	@Column(name = "I_JBLB109_P", precision = 22, scale = 0)
	public Integer getIJblb109P() {
		return this.IJblb109P;
	}

	public void setIJblb109P(Integer IJblb109P) {
		this.IJblb109P = IJblb109P;
	}

	@Column(name = "I_JBLB110_P", precision = 22, scale = 0)
	public Integer getIJblb110P() {
		return this.IJblb110P;
	}

	public void setIJblb110P(Integer IJblb110P) {
		this.IJblb110P = IJblb110P;
	}

	@Column(name = "I_JBLB111_P", precision = 22, scale = 0)
	public Integer getIJblb111P() {
		return this.IJblb111P;
	}

	public void setIJblb111P(Integer IJblb111P) {
		this.IJblb111P = IJblb111P;
	}

	@Column(name = "I_JBLB112_P", precision = 22, scale = 0)
	public Integer getIJblb112P() {
		return this.IJblb112P;
	}

	public void setIJblb112P(Integer IJblb112P) {
		this.IJblb112P = IJblb112P;
	}

	@Column(name = "I_JBLB113_P", precision = 22, scale = 0)
	public Integer getIJblb113P() {
		return this.IJblb113P;
	}

	public void setIJblb113P(Integer IJblb113P) {
		this.IJblb113P = IJblb113P;
	}

	@Column(name = "I_JBLB114_P", precision = 22, scale = 0)
	public Integer getIJblb114P() {
		return this.IJblb114P;
	}

	public void setIJblb114P(Integer IJblb114P) {
		this.IJblb114P = IJblb114P;
	}

	@Column(name = "I_JBLB115_P", precision = 22, scale = 0)
	public Integer getIJblb115P() {
		return this.IJblb115P;
	}

	public void setIJblb115P(Integer IJblb115P) {
		this.IJblb115P = IJblb115P;
	}

	@Column(name = "I_JBLB116_P", precision = 22, scale = 0)
	public Integer getIJblb116P() {
		return this.IJblb116P;
	}

	public void setIJblb116P(Integer IJblb116P) {
		this.IJblb116P = IJblb116P;
	}

	@Column(name = "I_JBLB117_P", precision = 22, scale = 0)
	public Integer getIJblb117P() {
		return this.IJblb117P;
	}

	public void setIJblb117P(Integer IJblb117P) {
		this.IJblb117P = IJblb117P;
	}

	@Column(name = "I_JBLB118_P", precision = 22, scale = 0)
	public Integer getIJblb118P() {
		return this.IJblb118P;
	}

	public void setIJblb118P(Integer IJblb118P) {
		this.IJblb118P = IJblb118P;
	}

	@Column(name = "I_JBLB119_P", precision = 22, scale = 0)
	public Integer getIJblb119P() {
		return this.IJblb119P;
	}

	public void setIJblb119P(Integer IJblb119P) {
		this.IJblb119P = IJblb119P;
	}

	@Column(name = "I_JBLB120_P", precision = 22, scale = 0)
	public Integer getIJblb120P() {
		return this.IJblb120P;
	}

	public void setIJblb120P(Integer IJblb120P) {
		this.IJblb120P = IJblb120P;
	}

	@Column(name = "I_JBLB121_Z", precision = 22, scale = 0)
	public Integer getIJblb121Z() {
		return this.IJblb121Z;
	}

	public void setIJblb121Z(Integer IJblb121Z) {
		this.IJblb121Z = IJblb121Z;
	}

	@Column(name = "I_JBLB122_Z", precision = 22, scale = 0)
	public Integer getIJblb122Z() {
		return this.IJblb122Z;
	}

	public void setIJblb122Z(Integer IJblb122Z) {
		this.IJblb122Z = IJblb122Z;
	}

	@Column(name = "I_JBLB123_Z", precision = 22, scale = 0)
	public Integer getIJblb123Z() {
		return this.IJblb123Z;
	}

	public void setIJblb123Z(Integer IJblb123Z) {
		this.IJblb123Z = IJblb123Z;
	}

	@Column(name = "I_JBLB124_Z", precision = 22, scale = 0)
	public Integer getIJblb124Z() {
		return this.IJblb124Z;
	}

	public void setIJblb124Z(Integer IJblb124Z) {
		this.IJblb124Z = IJblb124Z;
	}

	@Column(name = "I_JBLB125_Z", precision = 22, scale = 0)
	public Integer getIJblb125Z() {
		return this.IJblb125Z;
	}

	public void setIJblb125Z(Integer IJblb125Z) {
		this.IJblb125Z = IJblb125Z;
	}

	@Column(name = "I_JBLB126_Z", precision = 22, scale = 0)
	public Integer getIJblb126Z() {
		return this.IJblb126Z;
	}

	public void setIJblb126Z(Integer IJblb126Z) {
		this.IJblb126Z = IJblb126Z;
	}

	@Column(name = "I_JBLB127_Z", precision = 22, scale = 0)
	public Integer getIJblb127Z() {
		return this.IJblb127Z;
	}

	public void setIJblb127Z(Integer IJblb127Z) {
		this.IJblb127Z = IJblb127Z;
	}

	@Column(name = "I_JBLB128_Z", precision = 22, scale = 0)
	public Integer getIJblb128Z() {
		return this.IJblb128Z;
	}

	public void setIJblb128Z(Integer IJblb128Z) {
		this.IJblb128Z = IJblb128Z;
	}

	@Column(name = "I_JBLB129_Z", precision = 22, scale = 0)
	public Integer getIJblb129Z() {
		return this.IJblb129Z;
	}

	public void setIJblb129Z(Integer IJblb129Z) {
		this.IJblb129Z = IJblb129Z;
	}

	@Column(name = "I_JBLB130_Z", precision = 22, scale = 0)
	public Integer getIJblb130Z() {
		return this.IJblb130Z;
	}

	public void setIJblb130Z(Integer IJblb130Z) {
		this.IJblb130Z = IJblb130Z;
	}

	@Column(name = "I_JBLB131_Z", precision = 22, scale = 0)
	public Integer getIJblb131Z() {
		return this.IJblb131Z;
	}

	public void setIJblb131Z(Integer IJblb131Z) {
		this.IJblb131Z = IJblb131Z;
	}

	@Column(name = "I_JBLB132_Z", precision = 22, scale = 0)
	public Integer getIJblb132Z() {
		return this.IJblb132Z;
	}

	public void setIJblb132Z(Integer IJblb132Z) {
		this.IJblb132Z = IJblb132Z;
	}

	@Column(name = "I_JBLB133_Z", precision = 22, scale = 0)
	public Integer getIJblb133Z() {
		return this.IJblb133Z;
	}

	public void setIJblb133Z(Integer IJblb133Z) {
		this.IJblb133Z = IJblb133Z;
	}

	@Column(name = "I_JBLB134_Z", precision = 22, scale = 0)
	public Integer getIJblb134Z() {
		return this.IJblb134Z;
	}

	public void setIJblb134Z(Integer IJblb134Z) {
		this.IJblb134Z = IJblb134Z;
	}

	@Column(name = "I_JBLB135_Z", precision = 22, scale = 0)
	public Integer getIJblb135Z() {
		return this.IJblb135Z;
	}

	public void setIJblb135Z(Integer IJblb135Z) {
		this.IJblb135Z = IJblb135Z;
	}

	@Column(name = "I_JBLB136_Z", precision = 22, scale = 0)
	public Integer getIJblb136Z() {
		return this.IJblb136Z;
	}

	public void setIJblb136Z(Integer IJblb136Z) {
		this.IJblb136Z = IJblb136Z;
	}

	@Column(name = "I_JBLB137_Z", precision = 22, scale = 0)
	public Integer getIJblb137Z() {
		return this.IJblb137Z;
	}

	public void setIJblb137Z(Integer IJblb137Z) {
		this.IJblb137Z = IJblb137Z;
	}

	@Column(name = "I_JBLB138_Z", precision = 22, scale = 0)
	public Integer getIJblb138Z() {
		return this.IJblb138Z;
	}

	public void setIJblb138Z(Integer IJblb138Z) {
		this.IJblb138Z = IJblb138Z;
	}

	@Column(name = "I_JBLB139_Z", precision = 22, scale = 0)
	public Integer getIJblb139Z() {
		return this.IJblb139Z;
	}

	public void setIJblb139Z(Integer IJblb139Z) {
		this.IJblb139Z = IJblb139Z;
	}

	@Column(name = "I_JBLB140_Z", precision = 22, scale = 0)
	public Integer getIJblb140Z() {
		return this.IJblb140Z;
	}

	public void setIJblb140Z(Integer IJblb140Z) {
		this.IJblb140Z = IJblb140Z;
	}

	@Column(name = "I_JBLB141_Z", precision = 22, scale = 0)
	public Integer getIJblb141Z() {
		return this.IJblb141Z;
	}

	public void setIJblb141Z(Integer IJblb141Z) {
		this.IJblb141Z = IJblb141Z;
	}

	@Column(name = "I_JBLB142_Z", precision = 22, scale = 0)
	public Integer getIJblb142Z() {
		return this.IJblb142Z;
	}

	public void setIJblb142Z(Integer IJblb142Z) {
		this.IJblb142Z = IJblb142Z;
	}

	@Column(name = "I_JBLB143_Z", precision = 22, scale = 0)
	public Integer getIJblb143Z() {
		return this.IJblb143Z;
	}

	public void setIJblb143Z(Integer IJblb143Z) {
		this.IJblb143Z = IJblb143Z;
	}

	@Column(name = "I_JBLB144_Z", precision = 22, scale = 0)
	public Integer getIJblb144Z() {
		return this.IJblb144Z;
	}

	public void setIJblb144Z(Integer IJblb144Z) {
		this.IJblb144Z = IJblb144Z;
	}

	@Column(name = "I_JBLB145_Z", precision = 22, scale = 0)
	public Integer getIJblb145Z() {
		return this.IJblb145Z;
	}

	public void setIJblb145Z(Integer IJblb145Z) {
		this.IJblb145Z = IJblb145Z;
	}

	@Column(name = "I_JBLB146_Z", precision = 22, scale = 0)
	public Integer getIJblb146Z() {
		return this.IJblb146Z;
	}

	public void setIJblb146Z(Integer IJblb146Z) {
		this.IJblb146Z = IJblb146Z;
	}

	@Column(name = "I_JBLB147_Z", precision = 22, scale = 0)
	public Integer getIJblb147Z() {
		return this.IJblb147Z;
	}

	public void setIJblb147Z(Integer IJblb147Z) {
		this.IJblb147Z = IJblb147Z;
	}

	@Column(name = "I_JBLB148_Z", precision = 22, scale = 0)
	public Integer getIJblb148Z() {
		return this.IJblb148Z;
	}

	public void setIJblb148Z(Integer IJblb148Z) {
		this.IJblb148Z = IJblb148Z;
	}

	@Column(name = "I_JBLB149_Z", precision = 22, scale = 0)
	public Integer getIJblb149Z() {
		return this.IJblb149Z;
	}

	public void setIJblb149Z(Integer IJblb149Z) {
		this.IJblb149Z = IJblb149Z;
	}

	@Column(name = "I_JBLB150_Z", precision = 22, scale = 0)
	public Integer getIJblb150Z() {
		return this.IJblb150Z;
	}

	public void setIJblb150Z(Integer IJblb150Z) {
		this.IJblb150Z = IJblb150Z;
	}

	@Column(name = "V_QTJZS", length = 50)
	public String getVQtjzs() {
		return this.VQtjzs;
	}

	public void setVQtjzs(String VQtjzs) {
		this.VQtjzs = VQtjzs;
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

	@Column(name = "C_CZYBH", nullable = false, length = 50)
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

	@Column(name = "I_YWYC", precision = 22, scale = 0)
	public Integer getIYwyc() {
		return this.IYwyc;
	}

	public void setIYwyc(Integer IYwyc) {
		this.IYwyc = IYwyc;
	}

	@Column(name = "V_YCJBMC", length = 100)
	public String getVYcjbmc() {
		return this.VYcjbmc;
	}

	public void setVYcjbmc(String VYcjbmc) {
		this.VYcjbmc = VYcjbmc;
	}

	@Column(name = "DEP_NAME")
	public String getDepName() {
		return this.depName;
	}

	public void setDepName(String depName) {
		this.depName = depName;
	}

}