package com.gzwl.jpa_demo.dao;

import org.springframework.data.repository.CrudRepository;

import com.gzwl.jpa_demo.entity.Area;

public interface AreaCRUDRepoDAO extends CrudRepository<Area, Integer> {

}
