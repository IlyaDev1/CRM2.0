<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Lesson</title>
		<link rel="stylesheet" type="text/css" href="../style.css">
	</head>
	
	<body>
		<p><a href="/CRM2.0/main.jsp">
    		<img src="../back.png">
		</a></p>
			
		<p><a href="${pageContext.request.contextPath}/Lesson/create">
    		<img src="../add.png">
		</a></p>
		
		<p><a href="${pageContext.request.contextPath}/Lesson/index">
    		<img src="../update.png">
		</a></p>
		
		<table>
			<tr><th>Time</th><th>Subject</th><th>Group(ID)</th><th>Category</th><th>Delete row</th></tr>
			<c:forEach var="lesson" items="${lessons}">
 			<tr>
 				<td>${lesson.time}</td>
    			<td>${lesson.subject}</td>
    			<td>${lesson.group}</td>
    			<td>${lesson.category}</td>
    			<td>
	    			<form method="post" action='<c:url value="/Lesson/delete" />' style="display:inline;">
		        		<input type="hidden" name="id" value="${lesson.id}">
		        		<input type="submit" class="delete-button" value="Delete">
	    			</form>
    			</td>
 			</tr>
			</c:forEach>
		</table>
	</body>
</html>