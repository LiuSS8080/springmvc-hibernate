package com.woniu.service;

import java.util.List;

import com.woniu.pojo.Dept;

public interface IDeptService {
	List<Dept> findAll();
	Dept findOne(Dept obj);
	void save(Dept obj);
	void delete(Dept obj);
	void upd(Dept obj);
	
	
}
