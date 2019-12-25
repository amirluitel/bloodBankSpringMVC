<!DOCTYPE HTML>

<html>
<head>
<title>Blood Bank</title>
<meta charset="utf-8" />
<meta name="viewport" content="width=device-width, initial-scale=1" />
<link href="${pageContext.request.contextPath}/resources/main.css"
	rel="stylesheet">
</head>
<body>


	<section id="one" class="wrapper style3 special">

		<a href="index"><h2>
				<strong>BLOOD BANK</strong>
			</h2></a>
		
		<div class="inner">
			<header class="major">
				<h2 style="margin-bottom: 0px">Search</h2>
			</header>
			<div class="features">
				<form action="searchResult" method="post">
					<label for="address">Blood Group</label> 
					<select name="bloodGroup">
							  <option value="A+">A+</option>
							  <option value="B+">B+</option>
							  <option value="AB+">AB+</option>
							  <option value="o+">o+</option>
							  <option value="A+">A-</option>
							  <option value="B+">B-</option>
							  <option value="AB+">AB-</option>
							  
							</select> <br>
					<label for="address">Address (Zip Code)</label> 
					<input	name="address" type="text"> <br>
					<br>
					<input class="searchSubmit" value="search" type="submit">
					<br><br>
					<strong><a href="index" style="color:white;">Logout</a></strong>
				</form>
				
			</div>
			
	</section>

</body>
</html>