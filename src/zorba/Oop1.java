package zorba;

public class Oop1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Human1
		//  creating object of human1
		Human1 h=new Human1("Rachana",'f',31,5.1);
		Human1 hd=new Human1("Kripal",'m',41,6.1);
		Human1 h1=new Human1("Kriraj",'m',4,43);                                                                
		System.out.println(h.name);
		System.out.println(h.gender);
		System.out.println(h.age);
		System.out.println(h.height+" ft ");
		
		h.walk();
		h.talk();
		
		
		System.out.println(hd.name);
		System.out.println(hd.gender);
		hd.age=40;
		System.out.println(hd.age);
		System.out.println(hd.height+" ft ");
		
		System.out.println(h1.name);
		System.out.println(h1.gender);
		System.out.println(h1.age);
		System.out.println(h1.height+" ft");
		
		
		//for loop
	Human1 [] name= {h,hd,h1};
	for(int i=0;i<name.length;i++) {
			System.out.println(name[i].name);
			System.out.println(name[i].gender);
		System.out.println(name[i].age);
		System.out.println(name[i].height);
	}
		
		//for each
		for(Human1 a:name) {
			System.out.println(a.name);
			System.out.println(a.gender);
			System.out.println(a.age);
			System.out.println(a.height);
		}
			//creating object of vehicles
		
		Vehicles v=new Vehicles("red","tesla",35);
		Vehicles v1=new Vehicles("blue","toyota",25);
		Vehicles v2=new Vehicles("yellow","BMW",45);
		System.out.println(v.color);
		System.out.println(v.brand);
		System.out.println(v.price + " k");
		 v.start();
		 v.stop();
		 
//		Vehicles name1[]= {
//				new Vehicles("red","suv",50),
//				new Vehicles("blue","tesla",50),
//				new Vehicles("red","ford", 50),
//				
//		};
		 
		 
		 
		// for loop
		 Vehicles [] name1= {v,v1,v2};
	for(int i=0;i<name1.length;i++) {
			System.out.println(name1[i].color);
		System.out.println(name1[i].brand);
	System.out.println(name1[i].price);
	}
		
		//for each
		for(Vehicles b:name1) {
			System.out.println(b.color);
			System.out.println(b.brand);
			System.out.println(b.price);
		}
		}

}
//user defined class
//property
class Human1{
	String name;
	char gender;
	int age;
	double height;
//constructor
	public Human1(String name,char gender,int age,double height) {
		this.name=name;
		this.gender=gender;
		this.age=age;
		this.height=height;
	
}
	//methods
	public void walk() {
		System.out.println("I am walking");
	}
	
	
	public void talk() {
		System.out.println("i am talking");
	}
	}


class Vehicles{
	String color;
	String brand;
	double price;
	
	public Vehicles(String color, String brand, double price) {
		this.color=color;
		this.brand=brand;
		this.price=price;
	}
	
public void start() {
	System.out.println("it starts");
}
public void stop() {
	System.out.println("it stops");
	
	
	}
}