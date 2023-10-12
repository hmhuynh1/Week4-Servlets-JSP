package model;


public class Pizza {

private  int orderNumber ;
private static int nextOrderNumber = 1000;


private String toppings = "";
private String size = "";
private String crust= "";
private String sauce= "";
private double price = 10;
private double TAX = 0.07;



public int getOrderNumber() {
	return orderNumber;
	
}

public Pizza() {
	
	setSize("Large");
	setCrust("Thin");
	setToppings("Cheese");
	nextOrderNumber++;
	orderNumber = nextOrderNumber;
	
}

	public Pizza(String crust, String size, String sauce) {
	this.crust = crust;
	this.size = size;
	this.sauce = sauce;
	nextOrderNumber++;
	orderNumber = nextOrderNumber;
	
}
public double getPrice() {
	return price;
}

public void setPrice() {
	
	if (size.equals("small")) {
		price = 10;
	}
	else if (size.equals("medium")){
		price = 15;
	}
	else {
		price = 20;
	}
	price = price + getTax();
}

public double getTax() {
	return TAX*price;
}

public String getToppings() {
	
	return toppings;
}

public void setToppings(String toppings ) {
	
	this.toppings = toppings;
	
}

public String getSize() {
	return size;
}

public void setSize(String size) {
	this.size = size;
}


public String getCrust() {
	return crust;
}

public void setCrust(String crust) {
	this.crust = crust;
}

public String getSauce() {
	return sauce;
}

public void setSauce(String sauce) {
	this.sauce = sauce;
}
}	

