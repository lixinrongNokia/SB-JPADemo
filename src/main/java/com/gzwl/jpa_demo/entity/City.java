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
 * Title: City
 * </p>
 * 
 * <p>
 * Description:市级
 * </p>
 * 
 * @author Lixinrong
 * 
 * @date 2019年7月28日
 */
@Entity
@Table(name = "t_city")
public class City implements Serializable {
	/** serialVersionUID */
	private static final long serialVersionUID = -7518230687586750403L;

	/** 主键ID */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	/** 市级编号 */
	@Column(length = 6)
	private String cityID;
	/** 市级名称 */
	@Column(name = "city", length = 50)
	private String cityName;
	/** 所属省级编号 */
	@Column(length = 6)
	private String father;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCityID() {
		return cityID;
	}

	public void setCityID(String cityID) {
		this.cityID = cityID;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getFather() {
		return father;
	}

	public void setFather(String father) {
		this.father = father;
	}

	@Override
	public String toString() {
		return "City [id=" + id + ", cityID=" + cityID + ", cityName=" + cityName + ", father=" + father + "]";
	}
}
