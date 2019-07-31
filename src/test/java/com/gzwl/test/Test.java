package com.gzwl.test;

import java.util.List;

import javax.transaction.Transactional;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.gzwl.jpa_demo.App;
import com.gzwl.jpa_demo.dao.AreaCRUDRepoDAO;
import com.gzwl.jpa_demo.dao.AreaPagingAndSortRepoDAO;
import com.gzwl.jpa_demo.dao.CityExampleDAO;
import com.gzwl.jpa_demo.dao.ProvinceDAO;
import com.gzwl.jpa_demo.dao.ProvinceRepoDAO;
import com.gzwl.jpa_demo.entity.Area;
import com.gzwl.jpa_demo.entity.City;
import com.gzwl.jpa_demo.entity.Province;

/**
 * 
 * 
 * <p>
 * Title: Test
 * </p>
 * 
 * <p>
 * Description:测试类
 * </p>
 * 
 * @author Lixinrong
 * 
 * @date 2019年7月28日
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = { App.class })
public class Test {

	@Autowired
	private ProvinceDAO provinceDAO;
	@Autowired
	private CityExampleDAO cityExampleDAO;
	@Autowired
	private ProvinceRepoDAO provinceRepoDAO;
	@Autowired
	private AreaCRUDRepoDAO areaCRUDRepoDAO;
	@Autowired
	private AreaPagingAndSortRepoDAO areaPagingAndSortRepoDAO;

	@org.junit.Test
	@Transactional
	public void addTest() {
		Province province = provinceDAO.getOne(1);
		System.out.println(province);
	}

	@org.junit.Test
	@Transactional
	public void findCityTest() {
		List<City> list = cityExampleDAO.findByFatherEquals("430000");
		System.out.println(list.get(0).toString());
	}

	@org.junit.Test
	@Transactional
	public void getCityTest() {
		City city = cityExampleDAO.getCityUseSQL("邢台市");
		System.out.println(city);
	}

	@org.junit.Test
	@Transactional
	@Rollback(false)
	public void addProvinceTest() {
		Province province = new Province();
		province.setProvinceID("830000");
		province.setProvinceName("库页岛");
		provinceDAO.save(province);
	}

	@org.junit.Test
	@Transactional
	@Rollback(false)
	public void updateProvinceTest() {
		provinceRepoDAO.updateProvince("库页岛南", 36);
	}

	@org.junit.Test
	public void addAreaTest() {
		Area entity = new Area();
		areaCRUDRepoDAO.save(entity);
	}

	@org.junit.Test
	public void areaPagingAndSortTest() {
		Pageable pageable = PageRequest.of(0, 10);
		Page<Area> all = areaPagingAndSortRepoDAO.findAll(pageable);
		System.out.println(all.getTotalElements());
		System.out.println(all.getTotalPages());
	}
}