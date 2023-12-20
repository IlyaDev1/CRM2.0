<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Group</title>
		<link rel="stylesheet" type="text/css" href="../style.css">
	</head>
	
	<body>
		<p><a href="/CRM2.0/main.jsp">
    		<img src="../back.png">
		</a></p>
			
		<p><a href="${pageContext.request.contextPath}/Groups/create">
    		<img src="../add.png">
		</a></p>
		
		<p><a href="${pageContext.request.contextPath}/Groups/index">
    		<img src="../update.png">
		</a></p>
		
		<table>
			<tr><th>Schedule</th><th>Subject</th><th>Delete row</th></tr>
			<c:forEach var="group" items="${groups}">
 			<tr>
 				<td>${group.schedule}</td>
    			<td>${group.subject}</td>
    			<td>
	    			<form method="post" action='<c:url value="/Groups/delete" />' style="display:inline;">
		        		<input type="hidden" name="id" value="${group.id}">
		        		<input type="submit" class="delete-button" value="Delete">
	    			</form>
    			</td>
 			</tr>
			</c:forEach>
		</table>
	</body>
</html>