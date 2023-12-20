<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Add Lid</title>
		<link rel="stylesheet" type="text/css" href="../addstyle.css">
	</head>
	
	<body>
		<p><a href="${pageContext.request.contextPath}/Lid/index" class="button-back">
    		<img src="../back.png">
		</a></p>
		<h3>New Lid</h3>
		<form method="post">
			<label>Name</label><br>
			<input name="name"/><br><br>
			<label>Old</label><br>
			<input name="old"/><br><br>
			<label>Subject</label><br>
			<input name="subject"/><br><br>
			<input type="submit" value="Save" />
		</form>
	</body>
</html>