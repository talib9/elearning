<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Login</title>
</head>
<body>
<h2>User Login</h2>
<form action ="userauthentication" method ="Post"> 
		<pre>
			id : <input type="text" name = "userid" /> <br>
			password : <input type="text" name = "password" /> <br>
			
			<input type ="submit" value = "login" />	<input type ="reset" value = "Cancel"/>
		</pre>
	</form>
</body>
</html>