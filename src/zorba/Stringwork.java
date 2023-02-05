package zorba;

public class Stringwork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//program1
		String name= "Rachana";
String text= "I am Kriraj";
String text1= "I am Kripal";
System.out.println(text);
System.out.println(text1);


//program 2
//string + integer= string   //"2" + 2= 22
//integer +string= string    //2 +"2"= 22
//integer +integer= integer  // 2+2=4
//string + string= string    // "2"+"2"= 22

System.out.println("2" +2);
System.out.println(2+2);
System.out.println(2+"2");
System.out.println("2"+"2");

//program3 length()
String name1= "I am Rachana Dhakal Adhikari";
int namelength= name1.length();
System.out.println(namelength);
 
// program4
String first= "i am";
String second= "Rachana Dhakal Adhikari.";
System.out.println(first + "  " +second);
String three= first +second;
System.out.println(three);

//program5
String name3="Rachana Dhakal Adhikari";
String nameinLower=name.toLowerCase();
String nameinUpper= name.toUpperCase();
System.out.println("NAME IN UPPER CASE IS"+" " +nameinUpper);
System.out.println("name in lower case is"+ " "+ nameinLower);


//program6

String country="Nepal";
 int q=country.toUpperCase().toLowerCase().length();
 System.out.println(q);
 //"nepal".length()
 //"5".toUpperCase()
 System.out.println("5".toUpperCase());
 
//program8
int a=8;
System.out.println(a);
System.out.println("a");

//program9
String city= new String("Lamjung");
System.out.println(city);


	}

}
