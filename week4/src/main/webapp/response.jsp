<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Pizza</title>
</head>
<h3 style="color:#006400;">YOUR ADDRESS</h3>
<body>
	 <p> Name: ${addr.getName()} 
		<br />
	    Address: ${addr.getAddress()} 
		<br />
		Phone: ${addr.getPhoneNumber()} 
		<br />	
	</p>
<h2 style="color:#800000;">YOUR ORDER</h2>
	 <p>Crust: ${stats.getCrust()} 
		<br />
	    Top Ping: ${stats.getToppings()} 
		<br />
		Size: ${stats.getSize()} 
		<br />
		Sauce: ${stats.getSauce()} 
		<br />
		Total: ${stats.getPrice()}
	</p>
</body>
</html>

