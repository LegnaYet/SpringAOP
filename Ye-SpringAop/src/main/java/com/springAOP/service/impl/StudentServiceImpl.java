package com.springAOP.service.impl;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springAOP.dao.IStudentDao;
import com.springAOP.pojo.po.Student;
import com.springAOP.service.IStudentService;

@Service
public class StudentServiceImpl implements IStudentService{

	@Autowired
	private IStudentDao studao;

	public void saveStu() {
		System.out.println("����ѧ��");
	}

	public void delStu() {
		Integer.parseInt("abc");
		System.out.println("ɾ��ѧ��");
	}

	public void updateStu() {
		System.out.println("�޸�ѧ��");
	}
	
	public List<Student> getAllStudent(){
			return studao.getAllStudent();
	}
	
}
