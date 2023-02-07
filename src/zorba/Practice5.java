package zorba;

public class Practice5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "rachana";
		String r = name.substring(4);
		System.out.println(r);// ana
		String r1 = name.substring(2, 5);
		System.out.println(r1); // cha here value of 5 is excluded
		
		//join
		
		String nam = "rachana";
		String name1 = "dhakal";
		String name2 = "adhikari";
		String r2 = String.join(" ", nam, name1, name2);
		System.out.println(r2);
		String r3 = String.join("-", nam, name1, name2);
		System.out.println(r3);
		String name3 = "gmail.com";
		String r4 = String.join("@", nam, name3);
		System.out.println(r4);

		
		//isEmpty
		String sen="I am eating";
		String sen2="";
		boolean r5 = sen.isEmpty();
		System.out.println(r5);
		boolean r6 = sen2.isEmpty();
		System.out.println(r6);

		//replace
		String sen3="I am learning java";
		String r7=sen3.replace(" ","");
		System.out.println(r7);
		
		
		
		//Trim
		String text=" I like rainy day ";
				String r8=text.trim();
		System.out.println(text.length());
		System.out.println(r8.length());
		
		
	//indexOf
		String car="teslat";
		int r9=car.indexOf('a');
	System.out.println(r9);
	int r10=car.indexOf('t', 3);
	System.out.println(r10);
	  
	//in case of multiple no of same letters
	String book="encyclopedia";
	for(int i=0;i<book.length();i++) {
		if(book.charAt(i)=='e') {
			System.out.println(i);
		}}
	for(int i=0;i<book.length();i++) {
		if(book.charAt(i)=='c') {
			System.out.println(i);
		}
	}
	
		
		
		//split
	String text5="I am going to new york";
	String[] r11=text5.split(" ");
			System.out.println(r11);
		
		String quote="time and tide waits for none";
		String[] rslt=quote.split(" ");
		System.out.println(rslt);
		
		
		
		
		
	}

}
