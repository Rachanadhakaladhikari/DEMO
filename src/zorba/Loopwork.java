package zorba;

public class Loopwork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//loop is the process of repeating something
		
		// for loop
		
		// for(initialization; condition; increament/decreament){
		//
        //	}
		for(int i=0; i<=5; i++) {    //1,2,3,4,5,6
		
		System.out.println(i);      //0,1,2,3,4,5
	}
		for(int i=6; i>=3; i--) {   //5,4,3,2
			System.out.println(i);  //6,5,4,3
		}
		for(int i=6; i>=3; i--) {   //5,4,3,2
			System.out.println("hello");//6,5,4,3
			System.out.println(i);
			}
		// increament value by 1 ===>i++
		//increament value by 2 ===> i= i+2
		//decreament value by 3 ===> i=i-3
		for(int i=6; i<=30; i=i+3) {  //9,12,15,18,21,24,27,30,33
			System.out.println(i);    //6,9,12,15,18,21,24,27,30,
		
		
		}
		//break statement
		for(int i=1; i<=5; i++) {   //2,3
			System.out.println(i);//1,2,3
			if(i==3) {
				break;
			}
		
		}
		
		for(int i=1; i<=5; i++) {   //2,3
			if(i==3) {
				break;
			}
				System.out.println(i);    //1,2
			
		}
		for(int i=5; i>=2; i--) {   //4,3,
			if(i==3) {
				break;
			}
				System.out.println(i);    //5,4,
			
		}
		
		for(int i=5; i>=2; i--) {   //4,3
			System.out.println(i); //5,4,3,
			if(i==3) {
				break;
			}
		}
		//continue statement
		for(int i=5; i>=2; i--) {   //4,3,2
			System.out.println(i); //5,4,2,
			if(i==3) {
			continue;
		
			}
			}
		
		for(int i=1; i<=5; i++) {   //2,3,4,5,6
			if(i==3) {
		    continue;
			}
			System.out.println(i); //1,2,4,5,
		}
		
		//table of five ascending
		for (int i= 5; i<=50;i=i+5) {
			System.out.println(i);
		}
		//table of five descending	
		for (int i= 50; i>=5;i=i-5) {
			System.out.println(i);
		}
				
		
		
		
		
}
}