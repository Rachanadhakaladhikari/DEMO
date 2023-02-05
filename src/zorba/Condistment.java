package zorba;

public class Condistment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 conditional statement =it means one input and multiple outcomes 
		 if(condition){  
		 statements 
		    }
		 */
		
		if(2==2) {
			System.out.println("hello");
		}
			else {
				System.out.println("bye");
				
		}
		
		int numT=75;
		
		if(numT>0 && numT<=25) {
			System.out.println("No discount");
		}
		
		if(numT>=26 && numT<=50) {
			System.out.println("10% discount");
		}
		
			if(numT>=51 && numT<=75) {
				System.out.println("20% discount");
			}
		
		    if(numT>=76 && numT<=100) {
				System.out.println("30% discount");
		    }
		/*NOTES
		    // Using if
		    in case of IF  whether the first statement is
		    true or false it will proceed until the last statement
		    
		    //Using else if
	         in case of else if it will moves towards other statements
	          only if the first condition is false*/

		    int numTi=90;
			
			if(numTi>0 && numTi<=25) {
				System.out.println("No discount");
			}
			
			else if(numTi<=25 && numTi>=50) {
				System.out.println("10% discount");
			}
			
			else if(numTi==51 && numT<=75) {
					System.out.println("20% discount");
				}
			
			else if(numT>=75 && numT<=100) {
					System.out.println("30% discount");
			    }
		    
		    
			int marks= 94;
			if (marks<60) {
				System.out.println("C GRADE");
			}
			 
			if(marks<70) {
			System.out.println("B Grade");
			}
			
			if (marks<80) {
				System.out.println("A Grade");
			}
		    
			if(marks>=80) {
				System.out.println("A+ Grade");
				
			}
		       
			
			int a=84;
			int b=74;
			if(a>b){
				System.out.println(" A is greater");
			}
				else {
					System.out.println("Bis greater");
			}
		    
		    int num= 90;
		    if(num>=90) {
		    	System.out.println("Grade A");
		    }if(num<=80){
		    	System.out.println("Grade B");
		    }if(num<=70) {
		    	System.out.println("Grade c");
		    
		    }
		    
}
}