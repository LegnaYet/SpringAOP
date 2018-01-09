package com.springAOP.service;

import java.util.List;

import com.springAOP.pojo.po.Student;

public interface IStudentService {

	public void saveStu(Student student);
	public void delStu(String sid);
	public void updateStu(Student student);
	List<Student> selectAll();
	List<Student> getAllStudent();
}
