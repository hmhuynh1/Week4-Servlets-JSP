<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>PIZZA SIZE AND PRICE</title>
</head>
<body>
	<h1 style="color:#006400;">YOU ADDRESS</h1>
	<form style="color:#800000;" action="getAddress" method="post">
			Enter your name: <input
			type="text" name="name" size="25"><br/><br/>
			Address:<input
			type="text" name="address" size="25"><br/><br/>
			Phone Number:<input
			type="text" name="phoneNumber" size="25" /><input type="submit" value="Enter" />
			
			<input type="hidden" name="crust" value='<%=request.getParameter("Crust")%>' />
			<input type="hidden" name="size" value='<%=request.getParameter("Size")%>' />
			<input type="hidden" name="sauce" value='<%=request.getParameter("Sauce")%>' />
			<input type="hidden" name="price" value='<%=request.getParameter("Price")%>' />
			<input type="hidden" name="toppings" value='<%=request.getParameter("Toppings")%>' />
			
	</form>
</body>
</html>