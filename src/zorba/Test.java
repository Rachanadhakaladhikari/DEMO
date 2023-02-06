package zorba;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="Rachana";
		for(int i=0;i<name.length();i++){
			System.out.println(name.charAt(i));
		
		}
		
		String country="America";
		for(int i=name.length()-1;i>=0;i--) {
			System.out.println(country.charAt(i));
		}
		
		String fruits="Apple Banana Grapes kiwi strawberry";
		String result= "banana";
	if(fruits.contains(result)) {
			System.out.println("banana is available");
		}else {
			System.out.println("banana is unavailable");
		}
		
		String city1="nepal";
		String rev="";
		for(int i=0;i<city1.length();i++) {
			rev=city1.charAt(i)+rev;
			//n+""====n
			//e+n=====en
			//p+en====pen
			//a+pen====apen
			//l+apen====lapen
			
		System.out.println(rev);
		
		}
		
		String place="letoh";
		String rev1="";
		for(int i=place.length()-1;i>=0;i--) {
			rev1=rev1+place.charAt(i);
			//""+"l"===l
			//l+"e"====le
			//t+"le"==tle
			//o+"tle"===otle
			//h+"otle"===hotle
			
			System.out.println(rev1);
			}
			
			String fruit="apple";
			int count=0;
			for(int i=0; i<fruit.length();i++)
			if(fruit.charAt(i)=='a' ||  fruit.charAt(i)=='e' || fruit.charAt(i)=='i' ||fruit.charAt(i)=='o' || fruit.charAt(i)=='u' ) {
			
		    count=count+1;
			}
			
			
			System.out.println(count);		
			
			
		
		
		
		
	}

}
