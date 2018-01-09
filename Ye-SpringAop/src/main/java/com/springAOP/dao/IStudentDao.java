package com.springAOP.dao;

import java.util.List;

import com.springAOP.pojo.po.Student;

public interface IStudentDao {
	public void saveStu(Student student);
	public void delStu(String sid);
	public void updateStu(Student student);
	List<Student> selectAll();
	List<Student> getAllStudent();
}
