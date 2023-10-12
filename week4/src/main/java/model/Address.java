package model;

public class Address {
	
	private String name = "";
	private String address = "";
	private String phoneNumber = "";
	
	
public Address(String name, String address, String phoneNumbe) {
		this.setName(name);
		this.setAddress(address);
		this.setPhoneNumber(phoneNumber);
}	
		
public Address() {
		this.setName("");
		this.setAddress("");
		this.setPhoneNumber("");
			
					
	}


public String getPhoneNumber() {
	return phoneNumber;
}


public void setPhoneNumber(String phoneNumber) {
	this.phoneNumber = phoneNumber;
}


public String getAddress() {
	return address;
}


public void setAddress(String address) {
	this.address = address;
}


public String getName() {
	return name;
}


public void setName(String name) {
	this.name = name;
}

}
