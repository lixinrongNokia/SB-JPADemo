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
 * Title: Area
 * </p>
 * 
 * <p>
 * Description:区县镇级
 * </p>
 * 
 * @author Lixinrong
 * 
 * @date 2019年7月28日
 */
@Entity
@Table(name = "t_area")
public class Area implements Serializable{
	/** serialVersionUID*/
	private static final long serialVersionUID = 3040233254101905280L;
	/** 自增ID */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	public Integer id;
	/** 区县镇编号 */
	@Column(length = 50)
	public String areaID;
	/** 区县镇名称 */
	@Column(name = "area", length = 60)
	public String areaName;
	/** 所属市级编号 */
	@Column(length = 60)
	public String father;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAreaID() {
		return areaID;
	}

	public void setAreaID(String areaID) {
		this.areaID = areaID;
	}

	public String getAreaName() {
		return areaName;
	}

	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}

	public String getFather() {
		return father;
	}

	public void setFather(String father) {
		this.father = father;
	}

	@Override
	public String toString() {
		return "Area [id=" + id + ", areaID=" + areaID + ", areaName=" + areaName + ", father=" + father + "]";
	}

}
