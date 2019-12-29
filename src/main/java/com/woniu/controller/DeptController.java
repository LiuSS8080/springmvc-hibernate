package com.woniu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.woniu.pojo.Dept;
import com.woniu.service.IDeptService;
@Controller
@RequestMapping("dept")
public class DeptController {
	@Autowired
	IDeptService ds;
	
	@RequestMapping(method = RequestMethod.GET)
	@ResponseBody
	public List<Dept> findAll() {
		List<Dept> list = ds.findAll();
		return list;
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public String save(Dept dept) {
		ds.save(dept);
		return "redirect:index.html";
	}
	@RequestMapping(method = RequestMethod.DELETE)
	@ResponseBody
	public String delete(Dept dept) {
		ds.delete(dept);
		return "删除成功";
	}
	@RequestMapping(value = "{deptno}",method = RequestMethod.GET)
	@ResponseBody
	public Dept findOne(@PathVariable Integer deptno ,Dept dept) {
		System.out.println("DeptController.findOne()");
		Dept d= ds.findOne(dept);
		return d;
	}
	@RequestMapping(method = RequestMethod.PUT)
	@ResponseBody
	public String upd(Dept dept) {
		System.out.println("DeptController.upd()");
		System.out.println(dept+"=======================");
		ds.upd(dept);
		return "修改成功";
	}

}
