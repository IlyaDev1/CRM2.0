<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Tasks</title>
		<link rel="stylesheet" type="text/css" href="../style.css">
	</head>
	
	<body>
		<p><a href="/CRM2.0/main.jsp">
    		<img src="../back.png">
		</a></p>
		
		<p><a href="${pageContext.request.contextPath}/Task/create">
    		<img src="../add.png">
		</a></p>
		
		<p><a href="${pageContext.request.contextPath}/Task/index">
    		<img src="../update.png">
		</a></p>
		
		<table>
			<tr><th>Text</th><th>Start</th><th>End</th><th>Delete row</th></tr>
			<c:forEach var="task" items="${tasks}">
 			<tr>
 				<td>${task.text}</td>
    			<td>${task.start}</td>
    			<td>${task.end}</td>
    			<td>
	    			<form method="post" action='<c:url value="/Task/delete" />' style="display:inline;">
		        		<input type="hidden" name="id" value="${task.id}">
		        		<input type="submit" class="delete-button" value="Delete">
	    			</form>
    			</td>
 			</tr>
			</c:forEach>
		</table>
	</body>
</html>