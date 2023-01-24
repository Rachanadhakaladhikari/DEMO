package zorba;

public class Whileloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		initialization 
//		while(condition) {
//			statement;
//			i++;
//		}

		int i = 6;
		while (i >= 2) {
			System.out.println("hello");// h,h,h,h,h
			i--; // 5,4,3,2,1

		}

		int i1 = 1;
		while (i1 <= 5) { // 2,3,4,5,6
			System.out.println(i1); // 1,2,3,4,5
			i1++;
		}
		int i2 = 6;
		while (i2 >= 2) {
			System.out.println("rachana");// h,h,h,h,h
			i2--; // 5,4,3,2,1
		}
//table of 3
		int i3 = 3;
		while (i3 <= 30) {   //9,12,15,18,21,24,27,30,33
			System.out.println(i3);   //3,9,12,15,18,21,24,27,30,
			i3 = i3 + 3;
		}

		int i4=5;
		while(i4>=1) {//4,3,
			if(i4==3){
				break;
			}
			System.out.println(i4);//5,4,
			
			i4--;
		}
		
		
		int i5 = 1;
		while (i5 <= 5) {   //2,3,4,5,6
			if (i5 == 3) {
				i5++;
				continue;
				
			}
			System.out.println(i5);  //1,2,4,5
			i5++;

		}
		
		//specified condition we use  //for
		//unlimited condition we use // while
		
		
		int i6=2;
		while(i6<=20) {
			System.out.println(i6);
			i6=i6+2;                                             
		}
			
			
		}
		
		
	}


