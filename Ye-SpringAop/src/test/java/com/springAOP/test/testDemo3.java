package com.springAOP.test;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.springAOP.pojo.po.Student;
import com.springAOP.service.IStudentService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext-jdbc.xml")
public class testDemo3 {

	@Autowired
	IStudentService stuService; 
	
	@Test
	public void test1(){
		 Student student = new Student();
		 student.setSid("100");
		 student.setSname("admin");
		 stuService.saveStu(student);
	}
	
	@Test
	public void test2(){
		String sid = "100";
		stuService.delStu(sid);
	}
	
	@Test
	public void test3(){
		 Student student = new Student();
		 student.setSid("4");
		 student.setSname("admin");
		stuService.updateStu(student);
	}
	
	
}
