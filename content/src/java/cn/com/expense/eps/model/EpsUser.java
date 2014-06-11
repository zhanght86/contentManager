package cn.com.expense.eps.model;

// Generated by Hibernate Tools 3.2.0.b9 (sinosoft version)

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * EpsUser generated by Tools.Don't edit.
 */
@Entity
@Table(name = "EPSUSER")
public class EpsUser implements java.io.Serializable {
	private static final long serialVersionUID = 1L;

	/** 用户代码 */
	private String userCode;
	/** 成本中心 */
	private EpsCompany epsCompany;
	/** 中文�? */
	private String userName;
	/** 英文�? */
	private String userEName;
	/** 密码 */
	private String passWord;
	/** 密码设置日期 */
	private Date passWordSetDate;
	/** 密码过期日期 */
	private Date passWordExpireDate;
	/** 宅电号码 */
	private String phone;
	/** 手机 */
	private String mobile;
	/** 邮箱 */
	private String email;
	/** 用户登陆名称 */
	private String newUserCode;
	/** 收款�? */
	private String payee;
	/** 收款人帐�? */
	private String payeeBankAccount;
	/** �?��行（收款人） */
	private String payeeBankName;
	/** 代起草权�? */
	private String draftPermission;
	/** 有效状�?(0 无效,1 有效) */
	private String validStatus;
	/** 查询权限 */
	private String queryPermission;

	public EpsUser() {
	}

	/**       
	 * 用户代码
	 */
	@Id
	@Column(name = "USERCODE")
	public String getUserCode() {
		return this.userCode;
	}

	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}

	/**       
	 * 成本中心
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "COMCODE")
	public EpsCompany getEpsCompany() {
		return this.epsCompany;
	}

	public void setEpsCompany(EpsCompany epsCompany) {
		this.epsCompany = epsCompany;
	}

	/**       
	 * 中文�?
	 */

	@Column(name = "USERNAME")
	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**       
	 * 英文�?
	 */

	@Column(name = "USERENAME")
	public String getUserEName() {
		return this.userEName;
	}

	public void setUserEName(String userEName) {
		this.userEName = userEName;
	}

	/**       
	 * 密码
	 */

	@Column(name = "PASSWORD")
	public String getPassWord() {
		return this.passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	/**       
	 * 密码设置日期
	 */
	@Temporal(TemporalType.DATE)
	@Column(name = "PASSWORDSETDATE")
	public Date getPassWordSetDate() {
		return this.passWordSetDate;
	}

	public void setPassWordSetDate(Date passWordSetDate) {
		this.passWordSetDate = passWordSetDate;
	}

	/**       
	 * 密码过期日期
	 */
	@Temporal(TemporalType.DATE)
	@Column(name = "PASSWORDEXPIREDATE")
	public Date getPassWordExpireDate() {
		return this.passWordExpireDate;
	}

	public void setPassWordExpireDate(Date passWordExpireDate) {
		this.passWordExpireDate = passWordExpireDate;
	}

	/**       
	 * 宅电号码
	 */

	@Column(name = "PHONE")
	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	/**       
	 * 手机
	 */

	@Column(name = "MOBILE")
	public String getMobile() {
		return this.mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	/**       
	 * 邮箱
	 */

	@Column(name = "EMAIL")
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	/**       
	 * 用户登陆名称
	 */

	@Column(name = "NEWUSERCODE")
	public String getNewUserCode() {
		return this.newUserCode;
	}

	public void setNewUserCode(String newUserCode) {
		this.newUserCode = newUserCode;
	}

	/**       
	 * 收款�?
	 */

	@Column(name = "PAYEE")
	public String getPayee() {
		return this.payee;
	}

	public void setPayee(String payee) {
		this.payee = payee;
	}

	/**       
	 * 收款人帐�?
	 */

	@Column(name = "PAYEEBANKACCOUNT")
	public String getPayeeBankAccount() {
		return this.payeeBankAccount;
	}

	public void setPayeeBankAccount(String payeeBankAccount) {
		this.payeeBankAccount = payeeBankAccount;
	}

	/**       
	 * �?��行（收款人）
	 */

	@Column(name = "PAYEEBANKNAME")
	public String getPayeeBankName() {
		return this.payeeBankName;
	}

	public void setPayeeBankName(String payeeBankName) {
		this.payeeBankName = payeeBankName;
	}

	/**       
	 * 代起草权�?
	 */

	@Column(name = "DRAFTPERMISSION")
	public String getDraftPermission() {
		return this.draftPermission;
	}

	public void setDraftPermission(String draftPermission) {
		this.draftPermission = draftPermission;
	}

	/**       
	 * 有效状�?(0 无效,1 有效)
	 */

	@Column(name = "VALIDSTATUS")
	public String getValidStatus() {
		return this.validStatus;
	}

	public void setValidStatus(String validStatus) {
		this.validStatus = validStatus;
	}

	/**       
	 * 查询权限
	 */

	@Column(name = "QUERYPERMISSION")
	public String getQueryPermission() {
		return this.queryPermission;
	}

	public void setQueryPermission(String queryPermission) {
		this.queryPermission = queryPermission;
	}

}