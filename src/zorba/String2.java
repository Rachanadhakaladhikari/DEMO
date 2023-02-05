package zorba;

public class String2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Program1
		String city1= "Gorkha";
		String city2="Kathmandu";
		String city3= "Gorkha";
		boolean result= city1.equals(city2);
		System.out.println(result);
if(result) {
	System.out.println("city1 is equal to city2");
}else {
	System.out.println("city1 is not equal to city2");
}

//program with ternary operator
String result1= city1.equals(city3)?"equal":"not equal";
System.out.println(result1);

		String example="Quote \"Try Try Try until you die  \"";
		System.out.println(example);
	
		
		//program3
	String town= "Kathmandu";
boolean result2=town.startsWith("h");
	System.out.println(result2);
		
boolean result3= town.endsWith	("y");
System.out.println(result3);
	

//program4
String text="My name is Kriraj Adhikari";
boolean result4=text.contains("name");
System.out.println(result4);

//Program5
String text1="I am learinig javascript and javascript is great";
String result5= text1.replace("j","h");
System.out.println(result5);
String result6=text1.replaceAll("and","kind");
System.out.println(result6);

String result7= text1.replaceFirst("javascript","java")	;
System.out.println(result7);

//program5
String city6="Lamjung";

 // 0  1  2  3  4  5  6
  //l  a  m  j  u  n  g
//length()-1 is always last index
char a= city6.charAt(4);
  System.out.println(a);
String name4= "rachana dhakal";
int len= name4.length();
System.out.println(len);

for(int i=0;i<len;i++) {
	System.out.println(len);
}
	
	
	
	//Reverse string
for(int i=len;i>0;i--) {
System.out.println(i);

	}
	
	
	
	
	



	}
	}
	
	
	
	




