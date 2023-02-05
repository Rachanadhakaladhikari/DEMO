package zorba;

public class Stringprac1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Program1
		String first="kriraj";
		String second="Kripal";
		System.out.println(first +" "+ second);
		System.out.println(first.concat(second));
		
		//program 2
		String name= "Rachana Dhakal";
		System.out.println(name);
		
		//program 3
		String name1="I am Kriraj Adhikari";
		int name1length= name1.length();
		String name1toLowerCase= name1.toLowerCase();
		String name1toUpperCase= name1.toUpperCase();
		System.out.println("The namelength is"+ " " + name1.length());
		System.out.println("Name in upper case is" + " " +name1.toUpperCase());
		System.out.println("Name in lower case is "+ "  "+ name1.toLowerCase());
				
		//program4
		
		System.out.println("2"+2);//22
		System.out.println(2+"2");//22
		System.out.println(2+2);//4
		System.out.println("2"+"2");//22
		
		//program5
	
		int a=69;
		System.out.println(a);//69
		System.out.println("a");//a
		
		//program 6
		String city= new String("gorkha");
		System.out.println(city);
		int q= city.toLowerCase().toUpperCase().length();
		System.out.println(q);
		
		
		
		
		
		
	}

}
