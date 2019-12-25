<!DOCTYPE HTML>

<html>
	<head>
	
	<link href="${pageContext.request.contextPath}/resources/main.css" rel="stylesheet">
		<title>Blood Bank</title>
		<meta charset="utf-8" />
		<meta name="viewport" content="width=device-width, initial-scale=1" />
	</head>
	<body>
	
<!-- Login -->
			<section id="one" class="wrapper style3 special">
			
			<a href="index"><h2><strong>BLOOD BANK</strong></h2></a>
				<div class="inner">
					<header class="major">
						<h2 style="margin-bottom: 0px">Login</h2>
						
					</header>
					<div class="features">
					<form class="grid-form" method="post" action="loginSuccess">
						<div class="form-control narrow">
						<strong><p style="color:white;" >${errorMessage}</p></strong>
						<strong><p style="color:white;" >${registrationSuccess }</p></strong>
							<label for="email">Email</label>
							<input name="email" type="text">
						</div>
						<div class="form-control narrow">
							<label for="password">Password</label>
							<input name="password"  type="password">
						</div>
						
						<ul class="actions">
							<li><input class="loginSubmit" value="Login" type="submit"></li>
						</ul>	
					</form>
						
					</div>
				</div>
			</section>

		</body>
	</html>