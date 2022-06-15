<html>
<head>
<title>Flight Ticketer </title>
<link rel="stylesheet" type="text/css" href="style.css">
</head>
<body>
<form method="post">
<label>Name</label>
<input type="text" name="name">
<br>
<label>Password<label>
<input type="password" name="password">
<br>
<input type="submit">
<br>
<h3> ${errorMessage} </h3>
<br>
<a href="/signup" class="btn btn-success">Signup</a>
</form>
</body>
</html>