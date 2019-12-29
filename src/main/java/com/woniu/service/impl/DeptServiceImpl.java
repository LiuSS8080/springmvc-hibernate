package com.woniu.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.woniu.dao.IDeptDAO;
import com.woniu.pojo.Dept;
import com.woniu.service.IDeptService;
@Service
@Transactional
public class DeptServiceImpl implements IDeptService {
	@Autowired
	IDeptDAO dd;

	@Override
	public List<Dept> findAll() {
		// TODO Auto-generated method stub
		return dd.findAll();
	}

	@Override
	public Dept findOne(Dept obj) {
		// TODO Auto-generated method stub
		return dd.findOne(obj);
	}

	@Override
	public void save(Dept obj) {
		// TODO Auto-generated method stub
		dd.save(obj);
	}

	@Override
	public void delete(Dept obj) {
		// TODO Auto-generated method stub
		dd.delete(obj);
	}

	@Override
	public void upd(Dept obj) {
		// TODO Auto-generated method stub
		dd.upd(obj);
	}

}
