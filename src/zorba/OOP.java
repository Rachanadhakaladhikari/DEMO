package zorba;

public class OOP {
	public static void main(String[] args) {
Human h = new Human("Rachana", 31);
System.out.println(h.name);
System.out.println(h.age);
h.walk();
h.talk();
	

}
}
class Human{
	String name;
	int age;
	

 public Human(String name, int age){
	this.name=name;
	this.age= age;

 }
public void walk() {
	System.out.println("Iam walking");
}

public void talk() {
	System.out.println("Iam talking");
}
}
