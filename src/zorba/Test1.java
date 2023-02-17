package zorba;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String name="Rachana";
		for(int i=0;i<name.length();i++) {
		System.out.println(name.charAt(i));
		}
		
		
		int array[] []= {{4,5,6},{6,7,8}};
		System.out.println(array[1][2]);
		
			
		
		int a[] []= {{1,22,333},{4444,55555},{666666,7777777},{88888888}};
		for (int i=0;i<a.length;i++) {
			//System.out.println(a[i].length);//kati ota element in each array vanxa);
			int []b=a[i];
			for(int j=0;j<b.length;j++) {
				System.out.println(b[j]);
			}
		}
				
			
				int [] [] name1= {{999999999,88888888,7777777},{666666,55555,4444},{333,22,1}};
				
				for(int i=0;i<name1.length;i++) {
					//System.out.println(name1[i].length);
					int j1[]=name1[i];
					for(int j2=0;j2<j1.length;j2++) {
						System.out.println(j1[j2]);
					}
					
				}
		
				//three dimentional array
				int [][][] num= {
						{
							{5,4,3},
							{7,4,3}
						},
						{
							{2,3,9},
							{4,7,8}
							
						},
						{
							{8,9}
						}};
				System.out.println(num[1][1][0]);
				
			for(int [][] x:num) {
				for(int [] y:x) {
					for(int z:y) {
						System.out.println(z);
					}
			
		}}
			
				
				for(int i=0;i<num.length;i++) {
					int[][]j4=num[i];
					for(int j5=0;j5<j4.length;j5++) {
						int[]k1=j4[j5];
						for(int k=0;k<k1.length;k++) {
							System.out.println(k1[k]);
						}
						
					}
				}
				
						
						
				
				
				
				
				
				
				
				
			
		
		
		
		}
}
		
		
		



