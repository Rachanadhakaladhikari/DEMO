package zorba;

public class Revision3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//switch case without break
		int size=55;
		switch (size) {
			case 20:
			case 55:
				System.out.println("xtra small");
			case 30:
			case 77:
				System.out.println("small");
			case 40:
				System.out.println("medium");
			case 50:
				System.out.println("large");
				default:
					System.out.println("invalid entry");
				
				
			}
		//switch case with break
		int siz=55;
		switch (siz) {
			case 20:
				System.out.println("xtra small");
				break;
			case 30:
				System.out.println("small");
				break;
			case 40:
				System.out.println("medium");
				break;
			case 50:
				System.out.println("large");
				break;
				default:
					System.out.println("invalid entry");
				}
		
		//loop
	//print 1 to 5
		for(int i=1;i<=5;i++) {
			System.out.println(i);
		}
		
	//5-1
		for(int i=5;i>=1;i--) {
			System.out.println(i);
		}
		
		
		//table of 2
		for(int i=2;i<=20;i=i+2) {
			System.out.println(i);
		}
	//even no bet 1-50
		for(int i=1;i<=50;i++) {
			if(i%2==0) {
				System.out.println(i);
			}
		}
		
		//break
		for(int i=10;i>=1;i--) {
			if(i==7) {
				break;
				}
				System.out.println(i);//10,9,8,
			}
		
		
		for(int i=1;i<=10;i++) {
		System.out.println(i);
		if(i==7) {
			break;
		}
		}
		 for(int i=10;i>=0;i--) {
			 System.out.println(i);//10,9,8,7
			 if(i==7) {
				 break;
			 }
		 }
		
		//continue
		 for(int i=0;i<=5;i++) {
			 if(i==3) {
				 continue;
			 }
			 System.out.println(i);
		 }
			 
			//while loop
			 //1-5
			 int a1=1;
			 while(a1<=5) {
				 System.out.println(a1);
				 a1++;
			 }
			 
			 
			 //5-1
			 int a2=5;
			 while(a2>=1) {
				 System.out.println(a2);
				 a2--;
			 }
			 
			//table of 3
			 int a3=3;
			 while(a3<=30) {
				 System.out.println(a3);
				 a3=a3+3;
			 }
		 //table of 4 in rev
			 int a4=40;
			 while(a4>=4) {
				 System.out.println(a4);
				 a4=a4-4;
			 }
		
		//break
			 int j=1;
			 while(j<=10) {
				 System.out.println(j);//1,2,3,4,5,6,7,
				 if(j==7) {
					 break;
					 
				 }
				 j++;
			 }
			 
		int k=5;
		while(k<=10) {
			if(k==7) {
				break;
			}
			System.out.println(k);//6
			k++;
		}
			 
			 
			//continue
		int i1=10;
		while(i1>=0) {
			if(i1==7) {
				i1--;
				continue;
				}
			System.out.println(i1);
			i1--;
		}
				
			 //index of a
		String name="Kasthamandap";
		for(int i=0;i<name.length();i++) {
			if (name.charAt(i)=='a') {
				System.out.println(i);
			}
		}
		
		//sum of array
		int [] num= {1,2,3,4,5};
		int sum=0;
		double avg=0;
//		for(int i=0;i<num.length;i++) {
//			sum=sum+num[i];
//		}
//		
//		System.out.println(sum);
//		avg=sum/num.length;
//		System.out.println(avg);
		
		
		for(int p:num) {
			sum=sum+p;
			System.out.println(sum);
		}
			
		
		
		
		//ternary operator
			int s=87;
			int h=76;
		   String result55= s>h?"s is greater":"h is greater";
			System.out.println(result55);
			
			
			
			//count
			String name0="Rachana";
			int count=0;
			for(int i=0;i<name0.length();i++) {
			if(name0.charAt(i)=='a') {
			count=count+1;
			}
			}
			
		System.out.println(count);
		
		
		String text="i have an umbrella";
		//int count1=0;
		for(int i=0;i<text.length();i++) {
			if(text.charAt(i)=='a' || text.charAt(i)=='e' ||text.charAt(i)=='i' ||text.charAt(i)=='o' || text.charAt(i)=='u'){
					//count1 =count1 +1;
					
			
			
		
		//System.out.println(count1);
		System.out.println("found vowel " + text.charAt(i)+ " at position "+ i);
			}}
		int [][][] numbers= {
				{
					{3,4,5},
					{1,2,3}
					
				},
				{
					{3,4,7},
					{4,8,9}
				},
				{
					{6,7,8}
					}
		};
		
		
		System.out.println(numbers[1][0][0]);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
