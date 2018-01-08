<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table align="center" border="1px soild black">
		<tr>
			<th width="200px">学生id</th>
			<th width="200px">学生姓名</th>
		</tr>
		<c:forEach	items="${stuList }" var="stu">
			<tr>
				<td>${stu.sid }</td>
				<td>${stu.sname }</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>