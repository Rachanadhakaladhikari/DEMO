package zorba;

public class Practice8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name="Rachana";
		System.out.println(name);
			
System.out.println("2"+2);
System.out.println("2"+"2");
System.out.println(2+2);
System.out.println(2+"2");
	//LENGTH
String text="my name is Rachana Dhakal Adhikari";
int result=text.length();
System.out.println(result);
	
	String name1="Rachana";
	String name2="Dhakal";
	System.out.println(name1+" "+name2);
	System.out.println(name1.concat(name2));
	String third=name1 + name2;
	System.out.println(third);
	
	
	String name3="rachana how r u?";
	String result1=name3.toUpperCase();
	System.out.println(result1);
	
	String name4="WHAT'S UP!";
	String result2=name4.toLowerCase();
	System.out.println(result2);
	
	
	int a=8;
	System.out.println(a);
	System.out.println("a");
	
	String city=new String("Kathmandu");
	System.out.println(city);
	
	
	String name5="Ram";
	String name6="Ram";
	String name7="Rachana";
	boolean result3=name5.equals(name6);
	System.out.println(result3);
	
	if(name6.equals(name7)){
		System.out.println("They are equal");
	}else {
		System.out.println("They are unequal");
	}
	//ternary operator
	String result4=name5.equals(name6)?"equal":"unequal";
	System.out.println(result4);
	
	//example
	String quote="Best Quote\"try try try but dont cry.....\"";
	
	String city1="Bharatpur";
	boolean result5=city1.startsWith("a");
	System.out.println(result5);
	boolean result6=city1.endsWith("r");
	System.out.println(result6);
	
	//contains
	boolean result7=city1.contains("t");
	System.out.println(result7);
	
	
	boolean result8=quote.contains("try");
	System.out.println(result8);
	
	
	//replace
	String text2="i am learning java and java is fun)";
	
	String result9=text2.replace("j","k");
	System.out.println(result9);
	String result10=text2.replaceAll("java","kava");
	System.out.println(result10);
String result11=text2.replaceFirst("java","kava");
	System.out.println(result11);
	
	String town="pokhara";
	String rev="";
	for(int i=0;i<town.length();i++) {
		//System.out.println(i);
	//System.out.println(town.charAt(i));
		rev=town.charAt(i)+rev;
		//"p"+""=p
		//o+""p"=op
		//k+"op"=kop
		//h+"kop"=hkop
		//a+"hkop"=ahkop
		//r+"ahkop"=rahkop
		//a+"rahkop"=arahkop
		System.out.println(rev);
	}
	for(int i=town.length()-1;i>=0;i--) {
		System.out.println(town.charAt(i));
	}
	
	
	//reverse
	String name8="mar";
	String rev1="";
	
	for(int i=name8.length()-1;i>=0;i--) {
		rev1=rev1+name8.charAt(i);
		//""+m=m
		//"m"+a=am
		//"am"+r=ram
		
		
		System.out.println(rev1);
	}
	
	String fruits="apple banana cherry";
	boolean result12=fruits.contains("banana");
	System.out.println(result12);
	if(result12) {
		System.out.println("banana is available");
	}else {
		System.out.println("banana is unavailable");
	}
	
	String book="encyclopaedia";
	int count=0;
	for(int i=0;i<book.length();i++) {
		if(book.charAt(i)=='a'||book.charAt(i)=='e'||book.charAt(i)=='i'||book.charAt(i)=='o'||book.charAt(i)=='u') {
			count=count+1;
		}
	}
	System.out.println(count);
	
//substring
	String country="venezuala";
	String ab=country.substring(2,4);
	System.out.println(ab);
	
	String nam="ramkrishna";
	String aa=nam.substring(0,3);
	System.out.println(aa);
	
	
	//join
	String firstn="Ram";
	String secondn="krishna";
	String thirdn="Adhikari";
	String result13=String.join(" ",firstn,secondn,thirdn);
	System.out.println(result13);
	
	String result14=String.join("-",firstn,secondn,thirdn);
	System.out.println(result14);
	
	
	String forthn="gmail.com";
	String result15=String.join("@",firstn,forthn);
	System.out.println(result15);
	
	//indexOf
	String place="kathmanduduarbar";
	int r=place.indexOf('a',2);
	System.out.println(r);
	int count1=0;
	for(int i=0;i<place.length();i++){
		if(place.charAt(i)=='a') {
			//System.out.println(i);//it 
			count1=count1+1;
		}
	}
	
	System.out.println(count1);
	
	//trim
	String text6=" I am laearning java carefully ";
	String r2=text6.trim();
	System.out.println(text6.length());
	System.out.println(r2.length());
	
	String sen="Its raining here now";
	String r3=sen.replace(" ","");
	System.out.println(r3);
	//split
	String[] r4=sen.split("");
	System.out.println(r4);
	String[] r5=sen.split("a");
	System.out.println(r5);
	 //isempty
	String sen1="how are you?";
	String sen2="" ;
	boolean r6=sen1.isEmpty();
	System.out.println(r6);
	boolean r7=sen2.isEmpty();
	System.out.println(r7);
	
	//substring
	String car="Tesla";
	String r8=car.substring(2,4);
	System.out.println(r8);
	
	String script="Mandala";
	int count2=0;
	for(int i=0;i<script.length();i++) {
		if(script.charAt(i)=='n') {
			//System.out.println(i);
		count2=count2+1;
		
		
		
		}
	}
	
	System.out.println(count2);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
