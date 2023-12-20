<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Lids</title>
		<link rel="stylesheet" type="text/css" href="../style.css">
	</head>
	
	<body>
		<p><a href="/CRM2.0/main.jsp">
    		<img src="../back.png">
		</a></p>
			
		<p><a href="${pageContext.request.contextPath}/Lid/create">
    		<img src="../add.png">
		</a></p>
		
		<p><a href="${pageContext.request.contextPath}/Lid/index">
    		<img src="../update.png">
		</a></p>
		
		<table>
			<tr><th>Name</th><th>Old</th><th>Subject</th><th>Delete row</th></tr>
			<c:forEach var="lid" items="${lids}">
 			<tr>
 				<td>${lid.name}</td>
    			<td>${lid.old}</td>
    			<td>${lid.subject}</td>
    			<td>
	    			<form method="post" action='<c:url value="/Lid/delete" />' style="display:inline;">
		        		<input type="hidden" name="id" value="${lid.id}">
		        		<input type="submit" class="delete-button" value="Delete">
	    			</form>
    			</td>
 			</tr>
			</c:forEach>
		</table>
	</body>
</html>