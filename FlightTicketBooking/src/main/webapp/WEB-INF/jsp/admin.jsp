<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>SR Todo Management System</title>
<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container">
		<table class="table table-striped">
			<caption>${name}</caption>
			<thead>
				<tr>
					<th>Flight Name</th>
					<th>Date</th>
					<th>Place</th>
					<th>Cost</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${flights}" var="flight">
				<tr>
					<td>${flight.flightname}</td>
					<td>${flight.date}</td>
					<td>${flight.place}</td>
					<td>${flight.cost}</td>
					<td><a type="button" class="btn btn-danger" 
		href="/delete-flight?id=${flight.flightid}">Delete</a></td>
				</tr>
				</c:forEach>
			</tbody>
		</table>
		<div> <a class="btn btn-primary" href="/add-flight">Add Flight</a></div>
</div>
<script src="webjars/jquery/1.9.1/jquery.min.js"></script>
<script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
</body>
</html>