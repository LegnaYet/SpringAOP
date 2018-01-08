package com.springAOP.dao.impl;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.springAOP.dao.IStudentDao;
import com.springAOP.pojo.po.Student;

@Repository
public class StudentDaoImpl implements IStudentDao{

	public void saveStu() {
		
	}

	public void delStu() {
		
	}

	public void updateStu() {
		
	}
	
	public List<Student> getAllStudent(){
			Reader reader = null;
			try {
				reader = Resources.getResourceAsReader("mybatis-config.xml");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(reader);
	        SqlSession session = factory.openSession();
	        String statement = "StuMapper.getStu";
	        List<Student> list = session.selectList(statement);
	        return list;
	}
}
