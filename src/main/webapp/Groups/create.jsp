<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Create group</title>
		<link rel="stylesheet" type="text/css" href="../addstyle.css">
	</head>
	
	<body>
		<p><a href="${pageContext.request.contextPath}/Groups/index" class="button-back">
    		<img src="../back.png">
		</a></p>
		<h3>New group</h3>
		<form method="post">
			<label>Schedule</label><br>
			<input name="schedule"/><br><br>
			<label>Subject</label><br>
			<input name="subject"/><br><br>
			<input type="submit" value="Save" />
		</form>
	</body>
</html>