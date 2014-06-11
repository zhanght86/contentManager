package cn.com.sinosoft.ipconfig.model;

// Generated by Hibernate Tools 3.2.0.b9 (sinosoft version)

import java.util.Date;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * IpServiceConfig generated by Tools.Don't edit.
 */
@Entity
@Table(name = "IPSERVICECONFIG")
public class IpServiceConfig implements java.io.Serializable {
	private static final long serialVersionUID = 1L;

	/** 环境类别代码 */
	private IpServiceConfigId id;
	/** 环境类别代码 */
	private IpEnvironmen ipEnvironmen;
	/** 协议类型 */
	private String protecltype;
	/** 服务IP或域名 */
	private String serverIp;
	/** 服务端口 */
	private String serverPort;
	/** 服务应用名 */
	private String applicationName;
	/** 方法名称 */
	private String methods;
	/** 地区编码 */
	private String areaCode;
	/** 服务应用用户名 */
	private String appUserName;
	/** 服务应用密码 */
	private String appPassword;
	/** 创建人 */
	private String creatorCode;
	/** 创建时间 */
	private Date createTime;
	/** 最后修改人 */
	private String updaterCode;
	/** 最后修改时间 */
	private Date updateTime;
	/** 效力状态 */
	private String validStatus;

	public IpServiceConfig() {
	}

	/**       
	 * 环境类别代码
	 */
	@EmbeddedId
	@AttributeOverrides( {
			@AttributeOverride(name = "serverType", column = @Column(name = "SERVERTYPE")),
			@AttributeOverride(name = "environmentTypeCode", column = @Column(name = "ENVIRONMENTTYPECODE")) })
	public IpServiceConfigId getId() {
		return this.id;
	}

	public void setId(IpServiceConfigId id) {
		this.id = id;
	}

	/**       
	 * 环境类别代码
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ENVIRONMENTTYPECODE", nullable = false, insertable = false, updatable = false)
	public IpEnvironmen getIpEnvironmen() {
		return this.ipEnvironmen;
	}

	public void setIpEnvironmen(IpEnvironmen ipEnvironmen) {
		this.ipEnvironmen = ipEnvironmen;
	}

	@Column(name = "PROTECLTYPE")
	public String getProtecltype() {
		return this.protecltype;
	}

	public void setProtecltype(String protecltype) {
		this.protecltype = protecltype;
	}

	/**       
	 * 服务IP或域名
	 */

	@Column(name = "SERVERIP")
	public String getServerIp() {
		return this.serverIp;
	}

	public void setServerIp(String serverIp) {
		this.serverIp = serverIp;
	}

	/**       
	 * 服务端口
	 */

	@Column(name = "SERVERPORT")
	public String getServerPort() {
		return this.serverPort;
	}

	public void setServerPort(String serverPort) {
		this.serverPort = serverPort;
	}

	/**       
	 * 服务应用名
	 */

	@Column(name = "APPLICATIONNAME")
	public String getApplicationName() {
		return this.applicationName;
	}

	public void setApplicationName(String applicationName) {
		this.applicationName = applicationName;
	}

	@Column(name = "METHODS")
	public String getMethods() {
		return this.methods;
	}

	public void setMethods(String methods) {
		this.methods = methods;
	}

	/**       
	 * 地区编码
	 */

	@Column(name = "AREACODE")
	public String getAreaCode() {
		return this.areaCode;
	}

	public void setAreaCode(String areaCode) {
		this.areaCode = areaCode;
	}

	/**       
	 * 服务应用用户名
	 */

	@Column(name = "APPUSERNAME")
	public String getAppUserName() {
		return this.appUserName;
	}

	public void setAppUserName(String appUserName) {
		this.appUserName = appUserName;
	}

	/**       
	 * 服务应用密码
	 */

	@Column(name = "APPPASSWORD")
	public String getAppPassword() {
		return this.appPassword;
	}

	public void setAppPassword(String appPassword) {
		this.appPassword = appPassword;
	}

	/**       
	 * 创建人
	 */

	@Column(name = "CREATORCODE")
	public String getCreatorCode() {
		return this.creatorCode;
	}

	public void setCreatorCode(String creatorCode) {
		this.creatorCode = creatorCode;
	}

	/**       
	 * 创建时间
	 */
	@Temporal(TemporalType.DATE)
	@Column(name = "CREATETIME")
	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	/**       
	 * 最后修改人
	 */

	@Column(name = "UPDATERCODE")
	public String getUpdaterCode() {
		return this.updaterCode;
	}

	public void setUpdaterCode(String updaterCode) {
		this.updaterCode = updaterCode;
	}

	/**       
	 * 最后修改时间
	 */
	@Temporal(TemporalType.DATE)
	@Column(name = "UPDATETIME")
	public Date getUpdateTime() {
		return this.updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	/**       
	 * 效力状态
	 */

	@Column(name = "VALIDSTATUS")
	public String getValidStatus() {
		return this.validStatus;
	}

	public void setValidStatus(String validStatus) {
		this.validStatus = validStatus;
	}

}
