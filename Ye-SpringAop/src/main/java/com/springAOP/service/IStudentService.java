package com.springAOP.service;

import java.util.List;

import com.springAOP.pojo.po.Student;

public interface IStudentService {

	public void saveStu();
	public void delStu();
	public void updateStu();
	List<Student> getAllStudent();
}
