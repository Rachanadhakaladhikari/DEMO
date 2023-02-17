package zorba;

public class Revision2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//check given no is positive
		int x=35;
		if(x>0) {
			System.out.println("it is positive");
		}else {
			System.out.println("it is negative");
		}
		
		//greatest of two number
		int a=55;
		int b=67;
		if(a>b) {
			System.out.println("ais greater");
		}else {System.out.println("b is greater");
		}
		
		//ticket
		int Tic=15;
		if(Tic>=5 && Tic<=10) {
			System.out.println("5% discount");
		}else if(Tic >=11 && Tic<=20) {
			System.out.println("10% discount");
		}else if(Tic >20) {
			System.out.println("20% discount");
		}
			
			//marks/////else if
			int m=85;
			if(m>90) {
				System.out.println("grade A+");
			}else if(m>80) {
				System.out.println("grade A");
			} else if(m>70) {
				System.out.println("Grade B+");
			}else if(m>60) {
				System.out.println("Grade B");
			}else if (m<=50 && m<60) {
				System.out.println("Grade C");
			}else {
				System.out.println("fail");
			}
			
			//only if
			int m1=85;
			if(m1>90) {
				System.out.println("grade A+");
			} if(m1>80) {
				System.out.println("grade A");
			}  if(m1>70) {
				System.out.println("Grade B+");
			} if(m1>60) {
				System.out.println("Grade B");
			}if (m1<=50 && m1<60) {
				System.out.println("Grade C");
			}else {
				System.out.println("fail");
			}
			
			
			int e=756;
			int f=645;
			int g=736;
			if(e>f &&e>g) {
				System.out.println("e is greater");
			}else if(f>e && f>g) {
			System.out.println("f is greater");
			}else {
				System.out.println("g is greater");
			}
			
			if (e>f) {
				if(e>g) {
					System.out.println("e is greater");
				}
			}else{if(f>e) {
				if(f>g) {
					System.out.println("f is greater");
				}}else {
					System.out.println("g is greater");
				}
				
			
			
			//Switch case
	
		
			}
			
	}}
		
		
		
		
		
		
		
		
		
		
			
	
		
		
	


