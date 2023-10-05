package model;


public class Pizza {

private  int orderNumber ;
private static int nextOrderNumber = 1000;


private String toppings = "";
private String size = "";
private String crust= "";
private String sauce= "";
private String name = "";



public int getOrderNumber() {
	return orderNumber;
	
}

public Pizza() {
	
	setSize("Lager");
	setCrust("Thin");
	setToppings("Cheese");
	nextOrderNumber++;
	orderNumber = nextOrderNumber;
	
}

	public Pizza(String name, String crust, String size, String sauce) {
	this.name = name;
	this.crust = crust;
	this.size = size;
	this.sauce = sauce;
	nextOrderNumber++;
	orderNumber = nextOrderNumber;
	
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

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}
}	

