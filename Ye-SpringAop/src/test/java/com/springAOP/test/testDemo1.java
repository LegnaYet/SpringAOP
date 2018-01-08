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

//创建容器
@RunWith(SpringJUnit4ClassRunner.class)
//指定创建容器时使用哪个配置文件
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
