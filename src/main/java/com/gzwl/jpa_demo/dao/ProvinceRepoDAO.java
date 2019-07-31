package com.gzwl.jpa_demo.dao;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;

import com.gzwl.jpa_demo.entity.Province;

/**
 * 
 * 
 * <p>
 * Title: ProvinceDAO
 * </p>
 * 
 * <p>
 * Description:操作省份表的接口
 * </p>
 * 
 * @author Lixinrong
 * 
 * @date 2019年7月28日
 */
public interface ProvinceRepoDAO extends Repository<Province, Integer> {
	@Query("update Province set provinceName = ?1 where id = ?2")
	@Modifying
	void updateProvince(String provinceName, Integer id);
}
