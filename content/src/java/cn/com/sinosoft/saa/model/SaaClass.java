package cn.com.sinosoft.saa.model;

// Generated by Hibernate Tools 3.2.0.b9 (sinosoft version)

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;

/**
 * SaaClass generated by Tools.Don't edit.
 */
@Entity
@Table(name = "saa_class")
public class SaaClass implements java.io.Serializable {
	private static final long serialVersionUID = 1L;

	/** 险类代码 */
	private String classCode;

	/** 险类名称 */
	private String className;

	/** 产品线代码 */
	private String businessLineCode;

	/** 是否有效 */
	private String validStatus;

	public SaaClass() {
	}

	/**       
	 * 险类代码
	 */
	@GenericGenerator(name = "generator", strategy = "increment")
	@Id
	@GeneratedValue(generator = "generator")
	@Column(name = "ClassCode")
	public String getClassCode() {
		return this.classCode;
	}

	public void setClassCode(String classCode) {
		this.classCode = classCode;
	}

	/**       
	 * 险类名称
	 */

	@Column(name = "ClassName")
	public String getClassName() {
		return this.className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	/**       
	 * 产品线代码
	 */

	@Column(name = "BusinessLineCode")
	public String getBusinessLineCode() {
		return this.businessLineCode;
	}

	public void setBusinessLineCode(String businessLineCode) {
		this.businessLineCode = businessLineCode;
	}

	/**       
	 * 是否有效
	 */

	@Column(name = "ValidStatus")
	public String getValidStatus() {
		return this.validStatus;
	}

	public void setValidStatus(String validStatus) {
		this.validStatus = validStatus;
	}

}
