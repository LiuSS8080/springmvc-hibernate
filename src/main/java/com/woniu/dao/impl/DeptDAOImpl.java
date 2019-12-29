package com.woniu.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.woniu.dao.IDeptDAO;
import com.woniu.pojo.Dept;
@Repository
public class DeptDAOImpl implements IDeptDAO {
	
	@Autowired
	SessionFactory sf;
	
	@Override
	public List<Dept> findAll() {
		// TODO Auto-generated method stub
		List<Dept> list = sf.getCurrentSession().createQuery("from Dept").list();
		return list;
	}

	@Override
	public Dept findOne(Dept obj) {
		// TODO Auto-generated method stub
		return (Dept) sf.getCurrentSession().get(Dept.class, obj.getDeptno());
	}

	@Override
	public void save(Dept obj) {
		// TODO Auto-generated method stub
		sf.getCurrentSession().save(obj);
	}

	@Override
	public void delete(Dept obj) {
		// TODO Auto-generated method stub
		sf.getCurrentSession().delete(obj);
	}

	@Override
	public void upd(Dept obj) {
		// TODO Auto-generated method stub
		sf.getCurrentSession().update(obj);
	}

}
