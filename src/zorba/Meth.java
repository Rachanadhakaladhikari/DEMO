package zorba;

public class Meth {

public static void main(String[] args) {
		
		Calculation(100,10);
		Calculation(90,45);
		
		CalcA();
		CalcA();
		CalcA();
		CalcA();
		CalcA();
		
		
		int sum= add(6,7);
		System.out.println(sum);
		System.out.println(sum +30);
		System.out.println(sum+ sum );
		
		
	    int m= mul(5,3,2);
		System.out.println(m+m);
		System.out.println(m-5);
		System.out.println(m*0);
		System.out.println(m);
		
		
		
		int d=div(25,5);
		System.out.println(d);
		System.out.println(d+sum);
		System.out.println(m*d);
		System.out.println(m%5);
		
		
		int s= sub(10,5);
		System.out.println(s);
		System.out.println(s+m);
		System.out.println(s-sum);
		System.out.println(m*s);
		
		
		
		String name=giveName("Rachana Dhakal");
			System.out.println("I am " + name);
		}
		
		
// function without return type and  with parameter
	static void Calculation(int a, int b) {

		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
	}

	// functions without return type and without parameter
	static void CalcA() {
		System.out.println(20*20);
		System.out.println(200-120);
		System.out.println(200+200);
		System.out.println(20/20);
		System.out.println(20/20);
	}
	
	//function with return type and parameter
		
	static int  add(int x, int y) {
			return x+y;
			
	}
			
     static int mul(int x,int y,int z) {
			return x*y*z;
			
		}
			
	static int div(int x, int y) {
			
			return x/y;
}
			
			static int sub(int x, int y) {
				return x-y;
			
		}
	static String giveName(String name) {
          return name;
}


}