package zorba;

public class Arraypractice {
public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] num= {8,3,2,8};
		System.out.println(num[0]);
		System.out.println();
		
		
		//for loop
		for(int i=0;i<num.length;i++) {
			//System.out.println(i);
			System.out.println(num[i]);
		}
		
		//for each
		for(int a:num) {
			System.out.println(a);
		}
		
		String[] name= {"ram","rachana","kriraj","kripal"};
		System.out.println(name[2]);
		//for loop
		for(int i=0;i<name.length;i++) {
			System.out.println(name[i]);
		}
		
		//for each
		for(String b:name) {
			System.out.println(b);
		}
		
		char [] aa= {'e','r','d','s'};
		System.out.println(aa[1]);
		
		
		for(int i=0;i<aa.length;i++) {
			System.out.println(aa[i]);
		}
		for(char c:aa) {
			System.out.println(c);
		}
		
		
		
		
		String  name1="Rachana";
//		char r[]=name1.toCharArray();
//		
//		for(int i=0;i<r.length;i++) {
//			System.out.println(r[i]);
//		
//		}
		
		
		for(int i=0;i<name1.length();i++) {
			System.out.println(name1.charAt(i));
		}
		
		
		char []ad=name1.toCharArray();
		for(int i=0;i<name1.length();i++) {
			System.out.println(ad[i]);
		}
		
		//split
		String text="i am learning java";
		
		String[] r=text.split(" ");
		for(int i=0;i<r.length;i++)
		System.out.println(r[i]);
		
		String rr[]=text.split("a");
		for(int i=0;i<rr.length;i++) {
			System.out.println(rr[i]);
		}
		
		
		int []numb= {4,3,2,1};
		int sum=0;
//		for (int i=0;i<numb.length;i++) {
//			sum=sum+numb[i];
//		}
//		System.out.println(sum);
//		
		//for each
		for(int ac:numb) {
			sum=sum+ac;
			
			
		}
		
		
		
		System.out.println(sum);
		
		
		
		
		
		//add,avg
		
		
		int []ab= {3,4,5,6};
		int sum1=0;
		float avg=0;
		for(int i=0;i<ab.length;i++) {
			sum1=sum1+ab[i];
			
		}
		
		
		System.out.println(sum1);
		avg=sum1/ab.length;
		System.out.println(avg);
		
		
		
		
		
		
		
		
		
		
	}

}
