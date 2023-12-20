<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Clients</title>
		<link rel="stylesheet" type="text/css" href="../style.css">
	</head>
	
	<body>
		<p><a href="/CRM2.0/main.jsp">
    		<img src="../back.png">
		</a></p>
		
		<p><a href="${pageContext.request.contextPath}/Client/create">
    		<img src="../add.png">
		</a></p>
		
		<p><a href="${pageContext.request.contextPath}/Client/index">
    		<img src="../update.png">
		</a></p>
		
		<table>
			<tr><th>Name</th><th>Lesson(ID)</th><th>Delete row</th></tr>
			<c:forEach var="client" items="${clients}">
 			<tr>
 				<td>${client.name}</td>
    			<td>${client.lesson}</td>
    			<td>
	    			<form method="post" action='<c:url value="/Client/delete" />' style="display:inline;">
		        		<input type="hidden" name="id" value="${client.id}">
		        		<input type="submit" class="delete-button" value="Delete">
	    			</form>
    			</td>
 			</tr>
			</c:forEach>
		</table>
	</body>
</html>