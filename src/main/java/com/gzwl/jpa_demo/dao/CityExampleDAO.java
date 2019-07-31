package com.gzwl.jpa_demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;

import com.gzwl.jpa_demo.entity.City;

/**
 * 
 * 
 * <p>
 * Title: ProvinceExampleDAO
 * </p>
 * 
 * <p>
 * Description:操作城市表的名称命名查询条件接口
 * </p>
 * 
 * @author Lixinrong
 * 
 * @date 2019年7月28日
 */
public interface CityExampleDAO extends Repository<City, Integer> {

	List<City> findByFatherEquals(String father);

	@Query("from City where cityName = ?1")
	City getCityByUseHQL(String cityName);

	@Query(value = "select * from t_city where city = ?", nativeQuery = true)
	City getCityUseSQL(String cityName);
}
