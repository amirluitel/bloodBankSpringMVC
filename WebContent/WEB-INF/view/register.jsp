<!DOCTYPE HTML>

<html>
	<head>
		<title>Blood Bank</title>
		<meta charset="utf-8" />
		<meta name="viewport" content="width=device-width, initial-scale=1" />
		<link href="${pageContext.request.contextPath}/resources/main.css" rel="stylesheet">
	</head>
	<body>
	
	
<!-- registration -->
			<section id="one" class="wrapper style3 special">
			<a href="index"><h2><strong>BLOOD BANK</strong></h2></a>
				<div class="inner">
					<header class="major">
						<h2 style="margin-bottom: 0px">Register</h2>
					</header>
					<div class="features">
					<p>${msqlError}</p>
					<p><strong>${AllFieldRequired}</strong></p>
						<form class="grid-form" method="post" action="registration">
						
							<label for="name">First Name*</label>
							<input name="fname" id="fname" type="text">
							<label for="lname">Last Name*</label>
							<input name="lname" type="text"> 
							<label for="email">Email*</label>
							<input name="email" type="text"> 
							<label for="password">Password*</label>
							<input name="password" autocomplete="new-password" type="password">
							<label for="address">Address (zipcode)*</label>
							<input name="address" type="text"> 
							<label for="phone">Phone*</label>
							<input name="phone" type="text"> 
							<label for="bloodGroup">Blood Group*</label>
							<select name="bloodGroup">
							  <option value="A+">A+</option>
							  <option value="B+">B+</option>
							  <option value="AB+">AB+</option>
							  <option value="o+">o+</option>
							  <option value="A+">A-</option>
							  <option value="B+">B-</option>
							  <option value="AB+">AB-</option>
							  <option value="o+">o-</option>
							</select>
							<label for="address">Willing to donate blood ?*</label>
							<select name="donate">
							  <option value="yes">Yes</option>
							  <option value="no">No</option>
							</select>
						<ul class="actions">
							<br><li><input class="loginSubmit" value="Register" type="submit"></li>
						</ul>
						
						
					</form>
						
					</div>
				</div>
			</section>

		</body>
	</html>