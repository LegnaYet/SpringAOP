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

//��������
@RunWith(SpringJUnit4ClassRunner.class)
//ָ����������ʱʹ���ĸ������ļ�
@ContextConfiguration("classpath:applicationContext-aop.xml")
public class testDemo2 {

	@Autowired
	IStudentService stuService; 
	@Test
	public void test1(){
		stuService.saveStu();//���쳣
	}
	
	@Test
	public void test2(){
		stuService.delStu();//���쳣
	}
}
