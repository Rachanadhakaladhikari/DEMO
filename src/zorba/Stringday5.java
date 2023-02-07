package zorba;

public class Stringday5 {
	public static void main(String[] args) {
		String name="Rachana is my name";
		String result1=name.substring(3,10);// end value is not included
		System.out.println(result1);
		
		String city="Pune";
		String result2=city.substring(0,3);
		System.out.println(result2);
		
		
		String name1="my";
		String name2="name is";
		String name3="Rachana.";
		String result3=String.join(" ",name1,name2,name3);
		System.out.println(result3);
		
		
		String value="Rachanad30";
		String value1="yahoo.com";
		String result4=String.join("@",value,value1);
		System.out.println(result4);
		
		//to make output ram-krishna-adhikari
		String name4="Ram";
		String name5="Krishna";
		String name6="Adhikari";
		String result5=String.join("-",name4,name5,name6);
		System.out.println(result5);
		 
		
		
		//indexof
		String city1="kanchanjunga";
		int result6=city1.indexOf('a');
		System.out.println(result6);
		int result7=city1.indexOf('a',2);
		System.out.println(result7);
		  //isEmpty
		String city4="Pokhara";
		String city5="";
		boolean result8=city4.isEmpty();
		System.out.println(result8);
		boolean result9=city5.isEmpty();
		System.out.println(result9);
		 
		//Trim
		String sentence= " i am learning java ";
		String result10=sentence.trim();
		System.out.println(sentence.length());
		System.out.println(result10.length());
		
		//replace
		String  result11=sentence.replace(" ","");
		System.out.println(result11);
		
		// for all the position of a
		String town="samaya dani";
		for(int i=0;i<town.length();i++) {
			if(town.charAt(i)=='a') {
				System.out.println(i);	
			}
			}
		
		// it is splitting it like "i" "am" "learning" "java"
		String sen="i am learning java";
		String[] result12=sen.split(" ");
		System.out.println(result12);
		
		
		
		
		
	}
}
