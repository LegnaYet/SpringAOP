package com.springAOP.test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.springAOP.dao.IStudentDao;
import com.springAOP.dao.impl.StudentDaoImpl;
import com.springAOP.pojo.po.Student;

//��������
@RunWith(SpringJUnit4ClassRunner.class)
//ָ����������ʱʹ���ĸ������ļ�
@ContextConfiguration("classpath:applicationContext.xml")
public class testDemo1 {

	@Autowired
	StudentDaoImpl studao;
	@Test
	public void test1(){
		List<Student> list = studao.getAllStudent();
		for (Student student : list) {
			System.out.println(student);
		}
		
	}
}
