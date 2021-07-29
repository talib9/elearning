<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin Page</title>
</head>
<body>
<h2>login page</h2>
<form action ="authentication" method ="Post"> 
		<pre>
			id : <input type="text" name = "userid" /> <br>
			password : <input type="text" name = "password" /> <br>
			
			<input type ="submit" value = "login" />	<input type ="reset" value = "Cancel"/>
		</pre>
	</form>
</body>
</html>