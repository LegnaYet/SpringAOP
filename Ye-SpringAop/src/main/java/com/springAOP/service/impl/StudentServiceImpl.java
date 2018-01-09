package com.springAOP.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springAOP.dao.IStudentDao;
import com.springAOP.pojo.po.Student;
import com.springAOP.service.IStudentService;

@Service
public class StudentServiceImpl implements IStudentService{

	@Autowired
	private IStudentDao studao;

	public void saveStu(Student student) {
		studao.saveStu(student);
	}

	public void delStu(String sid) {
		studao.delStu(sid);
	}

	public void updateStu(Student student) {
		studao.updateStu(student);
	}
	
	public List<Student> getAllStudent(){
			return studao.getAllStudent();
	}

	public List<Student> selectAll() {
		return studao.selectAll();
	}
	
}
