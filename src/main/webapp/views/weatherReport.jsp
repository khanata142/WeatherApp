<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false"%>

<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Document</title>
<style>
body {
	background-image: url("https://picsum.photos/seed/picsum/1500/800");
	background-repeat: no-repeat;
}

table {
	background-color: #e1e2f1;
	border: 2px #a1a1df solid;
	margin: 100px 200px 200px 500px;
}
</style>
</head>

<body>
	<table>
		<tbody>
			<tr>
				<th>Country</th>
				<td>${reportArray[0]}</td>
			</tr>
			<tr>
				<th>City</th>
				<td>${reportArray[1]}</td>
			</tr>
			<tr>
				<th>Coordinates</th>
				<td>${reportArray[2]}</td>
			</tr>
			<tr>
				<th>Weather</th>
				<td>${reportArray[3]}</td>
			</tr>
			<tr>
				<th>Temperature</th>
				<td>${reportArray[4]}&nbsp;Kelvin</td>
			</tr>
			<tr>
				<th>Pressure</th>
				<td>${reportArray[5]}&nbsp;hPa</td>
			</tr>
			<tr>
				<th>Humidity</th>
				<td>${reportArray[6]}&nbsp;%</td>
			</tr>
			<tr>
				<th>Sealevel</th>
				<td>${reportArray[7]}&nbsp;hPa</td>
			</tr>
			<tr>
				<th>Ground level</th>
				<td>${reportArray[8]}&nbsp;hPa</td>
			</tr>
			<tr>
				<th>Visibility</th>
				<td>${reportArray[9]}&nbsp;meter</td>
			</tr>
			<tr>
				<th>Windspeed</th>
				<td>${reportArray[10]}&nbsp;m/s</td>
			</tr>

		</tbody>
	</table>
</body>

</html>