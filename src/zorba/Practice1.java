package zorba;

public class Practice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		cal();
		
		calcA(6,5);
		
		int a=add(3,2);
		System.out.println(a);
		System.out.println(a+2);
		System.out.println(a*2);
		System.out.println(a-3);
		
		
		
		
		int m=mul(5,1);
		System.out.println(m);
		System.out.println(m*0.1);
		System.out.println(m+9);
		System.out.println(m-8);
		
		
		
		//if, else if case
		
		int h=894756;
	    int n=78566;
		int o=84656;
		
		if (h>n && h>o) {
			System.out.println("h is greater");
		}else if(n>h &&n>o) {
			System.out.println("n is greater");
		}else {
			System.out.println("o is greater");
			
			
			
		}
		
		 int tic=20;
		 if (tic == 5) {
			 System.out.println("10% discount");
		 }else if(tic== 10) {
			 System.out.println("20% discount");
		 }else {
			 System.out.println("30% discount");
			 
			 
			 
		 }
		
		 int marks=82;
		 if (marks< 50) {
			 System.out.println("grade d");
		 }else if (marks<60) {
			 System.out.println("grade c");
		 }else if (marks<70) {
			 System.out.println("grade b");
		 }else {
			 System.out.println("grade a");
		 }
		 
		 
		 String country= "Nepa";
		 switch(country) {
		 case "Nepal":
		 case "China":
			 System.out.println("Asia");
			 break;
		 case "poland":
		 case "ukrane":
			 System.out.println("Europe");
			 break;
		 case "Ghana":
		 case "Nigeria":
			 System.out.println("Africa");
			 break;
			 default:
			 System.out.println("invalid entry");
		 }
		 
		String caste="Dhakal";
		switch (caste) {
		case "Dhakal":
		case "Adhikari":
			System.out.println("Bhramins");
			break;
		case "sherestha":
		case "joshi":
			System.out.println(" Newar;");
			break;
		case "kc":
		case "thakuri":
			System.out.println("Chhetri");
			break;
		case "Thapa":
			System.out.println("Magar");
			break;
			default:
				System.out.println("invalid entry");
			
		}
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
	}
	
	// function with return type and without parameter
static void cal() {
	System.out.println(6+9);
}
//function with return type and with parameter
static void calcA(int x, int y) {
	System.out.println(x + y);
	System.out.println(x - y);
	System.out.println(x * y);
	System.out.println(x / y);
	System.out.println(x % y);
}
  //function without return type and  with parameter

static int add(int x, int y) {
	return x+y;

}

static int mul( int x, int y) {
	return x*y;
	
}





}


