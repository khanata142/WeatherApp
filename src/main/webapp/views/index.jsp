<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Document</title>
<style>
* {
	box-sizing: border-box;
}

body {
	background-color: #c7c7d5;
}

#toppanel {
	background-color: #958593;
	border: 2px solid black;
	border-radius: 13px;
	height: 70px;
	width: 100%;
	font-size: 30px;
	padding-left: 375px;
	padding-top: 15px;
	color: #fff7f7;
}

.container {
	height: 200px;
	width: 300px;
	background-color: #dfd1dd;
	border: 2px solid black;
	border-radius: 13px;
	margin-top: 15px;
	margin-left: 500px;
}

form {
	padding: 50px;
}

#button {
	margin-left: 60px;
}
</style>
</head>

<body>
	<header id="toppanel">Welcome to Weather Information System</header>
	<div class="container">
		<form action="getdata" method="post">
			<label for="city">Select city:</label> <select name="city" id="city">
				<c:forEach var="singleCity" items="${listOfCities}">
					<option value="${singleCity}">${singleCity}</option>
				</c:forEach>
			</select><br>
			<br> <input type="submit" value="submit" id="button" />
		</form>
	</div>
</body>

</html>
