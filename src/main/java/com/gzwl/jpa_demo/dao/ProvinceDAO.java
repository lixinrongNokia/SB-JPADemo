package com.gzwl.jpa_demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

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
public interface ProvinceDAO extends JpaRepository<Province, Integer> {
}
