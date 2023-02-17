package zorba;

public class Stringday6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//index of
		String book = "munamadan";
		int r = book.indexOf('a');
		System.out.println(r);
		int r1 = book.indexOf('a', 4);
		System.out.println(r1);
		for(int i=0;i<book.length();i++) {
			if(book.charAt(i)=='a') {
				System.out.println(i);
			}
		}
for(int i=0;i<book.length();i++) {
	if(book.charAt(i)=='m') {
		System.out.println(i);
	}}
		int count=0;
		
		for(int i1=0; i1<book.length();i1++) {
			if(book.charAt(i1)=='a') {
				count=count+1;
				
			}
		}
		System.out.println(count);
		
		
		
		//array
		int num []=new int[5];
		num[0] = 98;
		num[1] = 46;
		num[2] = 85;
		num[3] = 68;
		num[4] = 76;
		System.out.println(num[0]);
		System.out.println(num[1]);
		System.out.println(num[2]);
		System.out.println(num[3]);
		System.out.println(num[4]);

		String fruit="apple"
;
		for(int i=0;i<fruit.length();i++) {
			//System.out.println(i);
			System.out.println(fruit.charAt(i));
			
		}
		// printing all values inside array
		int nums[]=new int[5];
		nums[0]=65;
		nums[1]=87;
		nums[2]=98;
		nums[3]=76;
		nums[4]=67;
		System.out.println(nums.length);
		for(int i1=0;i1<nums.length;i1++) {
			//System.out.println(i1);
			System.out.println(nums[i1]);
		}
		 String cities[]=new String[4];
		 cities [0]="kathmandu";
		 cities [1]="pokhara";
		 cities [2]="gorkha";
		 cities [3]="lamjung";
		 
		 for(int i=0;i<cities.length;i++) {
			 //System.out.println(i);
			 System.out.println(cities[i]);
		 }
		
		 String fruits[]= {"apple","banana","cherry","kiwi"};
		 for(int i=0;i<fruits.length;i++) {
			 System.out.println(fruits[i]);
			 }
		 
		 int numss[]= {65,87,43,53,9};
		 for(int i=0;i<numss.length;i++) {
			 System.out.println(numss[i]);
		 }
		 char ab[]= {'a','e','i','o','u'};
		 for(int i=0;i<ab.length;i++) {
			 System.out.println(ab[i]);
		 }
		 String name="rachana";
		 char cd[]=name.toCharArray();
		 for(int i=0;i<cd.length;i++) {
			 System.out.println(cd[i]);
		 }
		 
		String name1="Kriraj Adhikari";
		char ef[]=name1.toCharArray();
		for(int i=0;i<ef.length;i++) {
			System.out.println(ef[i]);
		}
		 
		 
		 
		 String text="I am learning java";
		 String result[]=text.split(" ");
		 String result1[]=text.split("a");
		 System.out.println(result);
		 
		 for(int i=0;i<result.length;i++) {
			 System.out.println(result[i]);
		 }
		 
		 for(int i=0;i<result1.length;i++) {
			 System.out.println(result1[i]);
		 }
		 
		 
		 
		 
	}


}
