package com.springAOP.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;

import com.springAOP.pojo.po.Student;
import com.springAOP.service.impl.StudentServiceImpl;

@Controller
public class ShowAllStu extends HttpServlet {

//	@Autowired
//	private IStudentService stuService;
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		StudentServiceImpl stuService = context.getBean("studentServiceImpl", StudentServiceImpl.class);
		List<Student> stuList = stuService.getAllStudent();
		request.setAttribute("stuList", stuList);
		request.getRequestDispatcher("index.jsp").forward(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}