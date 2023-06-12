<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Schedule Your Medicine</title>
<style>

.container1 {
	display: flex;
	position: relative;
	align-items: center;
	margin: 50px;
	/*border: 3px solid red;*/
	justify-content: center;
	/*widhth:100%;*/
	height: 100%;
}

footer {
	position: fixed;
	bottom: 0;
	width: 100%;
	text-align: center;
	color: white;
}
</style>
<%@include file="all_js_css.jsp"%>
</head>
<body>
	<div class="container">
		<%@include file="Navbar.html"%>
	</div>

	<div class="container1">
		<form>
			<table>
				<tr>
					<td><label for="disease">Disease Name:</label></td>
					<td><input type="text" id="disease" name="disease_name"
						placeholder="Enter your disease here" required ></td>
				</tr>
				<tr>
					<td><input type="checkbox" name="medicine">&nbsp;<label for="medicine">Get
							Medicine</label></td>
				</tr>
				<tr>
					<td><input type="checkbox" name="doctor">&nbsp;<label for="doctor">Get
							Doctor</label></td>
				</tr>

			</table>
			<div class="container text-center">
				<button type="submit" formaction="getmedicine.jsp">Get Info</button>
			</div>

		</form>
	</div>
</body>
</html>