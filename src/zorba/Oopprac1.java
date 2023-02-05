package zorba;

public class Oopprac1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Humans h=new Humans("kriraj", 5);
System.out.println(h.name);
System.out.println(h.age);
h.walk();
h.talk();

	}

}
class Humans{
	String name;
	int age;
	
	public Humans(String name, int age) {
		this.name=name;
		this.age=age;
	}
	
	public void walk() {
		System.out.println("I can walk");
	}
	public void talk() {
		System.out.println("I can talk");
	}
	
}
	
	
	
	