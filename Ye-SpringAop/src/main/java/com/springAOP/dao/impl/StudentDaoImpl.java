package com.springAOP.dao.impl;

import java.io.IOException;
import java.io.Reader;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import com.springAOP.dao.IStudentDao;
import com.springAOP.pojo.po.Student;

@Repository
public class StudentDaoImpl extends JdbcDaoSupport implements IStudentDao{

	public void saveStu(Student student) {
		String sql = "insert into student values (?,?)";
		getJdbcTemplate().update(sql, new Object[]{student.getSid(),student.getSname()});
	}

	public void delStu(String sid) {
		String sql = "delete from student where sid = ?";
		getJdbcTemplate().update(sql, sid);
	}

	public void updateStu(Student student) {
		String sql = "update student set sname = ? where sid =?";
		getJdbcTemplate().update(sql, new Object[]{student.getSname(),student.getSid()});
	}
	
	public List<Student> selectAll(){
		String sql = "select * from student";
		List<Student> list =  getJdbcTemplate().query(sql , new RowMapper<Student>() {
	            public Student mapRow(ResultSet resultSet, int i) throws SQLException {
	                return mapRowHandler(resultSet);
	            }
	        });
		return list;
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
	
	private Student mapRowHandler(ResultSet resultSet) throws  SQLException{
		Student student = new Student();
		student.setSid(resultSet.getString("sid"));
		student.setSname(resultSet.getString("sname"));
        return  student;
 }
}
