

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<title>Blood Bank</title>
<meta charset="utf-8" />
<meta name="viewport" content="width=device-width, initial-scale=1" />
<link href="${pageContext.request.contextPath}/resources/main.css"
	rel="stylesheet">
</head>
<body>
	<%@page import="java.util.*"%>
	<%@page import="java.util.Iterator"%>
	
	
<section id="one" class="wrapper style3 special">

<a href="index"><h2>
				<strong>BLOOD BANK</strong>
			</h2></a>
	<div class="inner">
		<div class="features">
	<table style="width: 100%;">
		<tr>
			<th style="text-align: center;">Firstname</th>
			<th style="text-align: center;">Lastname</th>
			<th style="text-align: center;">Address</th>
			<th style="text-align: center;">Phone</th>
			<th style="text-align: center;">Blood Group</th>
			<th style="text-align: center;">Willing to donate</th>
		</tr>
			
    <c:forEach var="list" items="${allList}">
            <tr> 
               <td>${list.fname} </td>
               <td>${list.lname} </td>
               <td>${list.address} </td>
               <td>${list.phone} </td>
               <td>${list.bloodGroup} </td>
               <td>${list.donate} </td>
            </tr> 
        </c:forEach>   
     
	</table>
	</div>
	</div>
</section>	
</body>
</html>