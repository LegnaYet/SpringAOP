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
import com.springAOP.service.IStudentService;

//创建容器
@RunWith(SpringJUnit4ClassRunner.class)
//指定创建容器时使用哪个配置文件
@ContextConfiguration("classpath:applicationContext-aop.xml")
public class testDemo2 {

	@Autowired
	IStudentService stuService; 
	@Test
	public void test1(){
		stuService.saveStu();//无异常
	}
	
	@Test
	public void test2(){
		stuService.delStu();//有异常
	}
}
