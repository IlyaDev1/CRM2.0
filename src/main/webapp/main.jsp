<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
	<head>
		<meta charset="UTF-8">
		<title>CRM2</title>
		<link rel="stylesheet" type="text/css" href="main.css">
	</head>
	
	<body>
		<div>
	        <p><a href="${pageContext.request.contextPath}/Task/index">Задачи</a></p>
	        <p><a href="${pageContext.request.contextPath}/Groups/index">Группы</a></p>
	        <p><a href="${pageContext.request.contextPath}/Lesson/index">Уроки</a></p>
	        <p><a href="${pageContext.request.contextPath}/Client/index">Клиенты</a></p>
	        <p><a href="${pageContext.request.contextPath}/Lid/index">Лиды</a></p>
    </div>
	</body>
</html>
