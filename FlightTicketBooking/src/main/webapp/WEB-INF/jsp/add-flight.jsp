<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>SR Todo Management System</title>
<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css" rel="stylesheet">
<link rel="stylesheet" type="text/css" href="style.css">
</head>
<body>
<div class="container">
		<form method="post">
			<fieldset class="form-group">
				<label>Flight Name</label> 
				<input name="flightname" type="text" class="text" required="required" placeholder="Name"/>
				</fieldset>
				<fieldset class="form-group">
				<label>Place</label> 
				<input name="place" type="text" class="text" required="required" placeholder="Place"/>
				</fieldset>
				<fieldset class="form-group">
				<label>Date</label> 
				<input name="date" type="text" class="text" required="required" placeholder="Date(dd-mm-yyyy)"/>
				</fieldset>
				<fieldset class="form-group">
				<label>Cost</label> 
				<input name="cost" type="text" class="text" required="required" placeholder="cost"/>
			</fieldset>
			<button type="submit" class="btn btn-success">Add</button>
		</form>
</div>
<script src="webjars/jquery/1.9.1/jquery.min.js"></script>
<script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
</body>
</html>