package day1;

public class Vehicle {

	String bName, color;
	int price;

	public void getDetails() {
		System.out.println("Brand Name is " + bName);
		System.out.println("color is " + color);
		System.out.println("price is " + price);

	}
}

class Bike extends Vehicle {

	public void kickStart() {
		System.out.println("Kick Start of Bike");
	}

}