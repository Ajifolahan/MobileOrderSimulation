// Author: Garrett Goldberg & Momoreoluwa Ayinde
// Food.java creates all the parameters, setters, and getters to create the list in 
// MenuCreation.java that will be used in the program.
public class Food {
//instance variables
	private String item;
	private double price;
//default constructor
	public Food() {
		this.item = "";
		this.price = 0;
	}
//parametized constructor
	public Food(String item, double price) {
		this.item = item;
		this.price = price;
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	//Creates a string of the current object
	public String toString() {
		return (item + ": $" + price);
	}
}