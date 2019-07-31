package com.gzwl.jpa_demo.dao;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.gzwl.jpa_demo.entity.Area;

public interface AreaPagingAndSortRepoDAO extends PagingAndSortingRepository<Area, Integer> {

}
