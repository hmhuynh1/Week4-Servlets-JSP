	

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









//public class StringStatistics {
//	private String name = "";
//	private int whiteSpaces = 0;
//	private int vowels = 0;
//	private int punctuation = 0;
//
//	public StringStatistics(String string) {
//		genStats(string.toUpperCase());
//	}
//
//	/**
//	 * @param string
//	 */
//	private void genStats(String string) {
//		for (int i = 0; i < string.length(); i++) {
//			String analysisChar = string.substring(i, i + 1);
//			if (analysisChar.contains(" ")) {
//				whiteSpaces++;
//			} else if (analysisChar.contains("a") || analysisChar.contains("e") || analysisChar.contains("i")
//					|| analysisChar.contains("o") || analysisChar.contains("u") || analysisChar.contains("y")) {
//				vowels++;
//			} else if (analysisChar.contains(".") || analysisChar.contains("'") || analysisChar.contains(",")
//					|| analysisChar.contains("?") || analysisChar.contains("!")) {
//				punctuation++;
//			}
//		}
//
//	}
//
////	public String getReversed() {
////		return reversed;
////	}
//
////	public void setReversed(String reversed) {
////		this.reversed = reversed;
////	}
//
//	public int getWhiteSpaces() {
//		return whiteSpaces;
//	}
//
//	public void setWhiteSpaces(int whiteSpaces) {
//		this.whiteSpaces = whiteSpaces;
//	}
//
//	public int getVowels() {
//		return vowels;
//	}
//
//	public void setVowels(int vowels) {
//		this.vowels = vowels;
//	}
//
//	public int getPunctuation() {
//		return punctuation;
//	}
//
//	public void setPunctuation(int punctuation) {
//		this.punctuation = punctuation;
//	}
//
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//}






