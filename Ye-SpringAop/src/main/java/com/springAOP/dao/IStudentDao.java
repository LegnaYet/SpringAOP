package com.springAOP.dao;

import java.util.List;

import com.springAOP.pojo.po.Student;

public interface IStudentDao {
	public void saveStu();
	public void delStu();
	public void updateStu();
	List<Student> getAllStudent();
}
