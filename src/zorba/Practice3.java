package zorba;

public class Practice3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vehicle v = new Vehicle("Tesla", 3000000, "gray", 4);
		System.out.println(v.name);
		System.out.println(v.price);
		System.out.println(v.color);
		System.out.println(v.noofwheels);
		v.start();
		v.stop();
		

	}

}

class Vehicle {
	String name;
	int price;
	String color;
	int noofwheels;

	public Vehicle(String name, int price, String color, int noofwheels) {
		this.name = name;
		this.price = price;
		this.color = color;
		this.noofwheels = noofwheels;
	}

	public void start() {
		System.out.println("It can start");
	}

	public void stop() {
		System.out.println("It  can stop");
	}


}