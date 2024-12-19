<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">

<script type="text/javascript">
	function generateRandomNumber() {
		let number = parseInt(Math.random() * 100);
		document.getElementById("result").innerHTML = 'Random Number = '
				+ number;
	}
</script>

</head>
<body>
	<div class="container">
		<div class="jumbotron bg-primary">
			<h1 class="display-4 text-light">Random Number Generator!</h1>
			<p class="lead text-light">This is simple program to generate random number
				in Java.</p>
			<button class="btn btn-danger" onclick="generateRandomNumber()">Click
				Me!!!</button>
		</div>
		<div id="result" class="alert alert-success">Random Number</div>
	</div>
</body>
</html>