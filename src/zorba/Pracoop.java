package zorba;

public class Pracoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Laptop l=new Laptop("Dell","Gray",64,2);
Laptop l1=new Laptop("Lenovo","Black",64,2);
Laptop l2=new Laptop("Samsung","Gray",120,2);


System.out.println(l.brand);
System.out.println(l.color);
System.out.println(l.ramcapacity + " GB");
System.out.println(l.warrantyperiod+" years");

//for loop
Laptop [ ] lapt= {l,l1,l2};
for(int i=0;i<lapt.length;i++) {
	System.out.println(lapt[i].brand);
	System.out.println(lapt[i].color);
	System.out.println(lapt[i].ramcapacity + " GB");
	System.out.println(lapt[i].warrantyperiod +" years");
}

//For each
for(Laptop abc:lapt) {
	System.out.println(abc.brand);
	System.out.println(abc.color);
	System.out.println(abc.ramcapacity+" GB");
	System.out.println(abc.warrantyperiod+ " years."); 
	
	
	
}




	}

}
class Laptop{
	String brand;
	String color;
	double ramcapacity;
	int warrantyperiod;
	
	public Laptop(String brand,String color,double ramcapacity,int warrantyperiod) {
		this.brand=brand;
		this.color=color;
		this.ramcapacity=ramcapacity;
		this.warrantyperiod=warrantyperiod;
		
	}
	public void printinfo() {
		System.out.println(this.brand);
		System.out.println(this.color);
		System.out.println(this.ramcapacity);
		System.out.println(this.warrantyperiod);
		
		
		
		
		
		
	}
}