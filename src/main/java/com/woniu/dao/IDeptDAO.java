package com.woniu.dao;

import java.util.List;

import com.woniu.pojo.Dept;

public interface IDeptDAO {
	
	List<Dept> findAll();
	Dept findOne(Dept obj);
	void save(Dept obj);
	void delete(Dept obj);
	void upd(Dept obj);
	
	

}
