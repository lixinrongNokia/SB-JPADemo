package com.gzwl.jpa_demo.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 
 * 
 * <p>
 * Title: Province
 * </p>
 * 
 * <p>
 * Description: 省级
 * </p>
 * 
 * @author Lixinrong
 * 
 * @date 2019年7月28日
 */
@Entity
@Table(name="t_province")
public class Province implements Serializable {
	/** serialVersionUID*/
	private static final long serialVersionUID = -8742056300974782829L;
	/**
	 * 自增id
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Integer id;
	/**
	 * 省份编码
	 */
	@Column(name="provinceID")
	private String provinceID;
	/**
	 * 省份名称
	 */
	@Column(name="province")
	private String provinceName;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getProvinceID() {
		return provinceID;
	}
	public void setProvinceID(String provinceID) {
		this.provinceID = provinceID;
	}
	public String getProvinceName() {
		return provinceName;
	}
	public void setProvinceName(String provinceName) {
		this.provinceName = provinceName;
	}
	@Override
	public String toString() {
		return "Province [id=" + id + ", provinceID=" + provinceID + ", provinceName=" + provinceName + "]";
	}
}
