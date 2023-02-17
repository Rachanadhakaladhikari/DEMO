package zorba;

public class Arraymatrix {

	public static void main(String[] args) {
		
	int [] []matrix= {{1,2,6},{5,6,7}};
	
	System.out.println(matrix[0][1]);
	System.out.println(matrix[1][1]);
	System.out.println(matrix[1][0]);
	System.out.println(matrix[0][2]);
	
	//for loop
	for (int i=0;i<matrix.length;i++) {
		//System.out.println(matrix[i].length);//gives no of elements present in each array
	
	int [] num1=matrix[i];
	for(int j=0;j<num1.length;j++) {
		System.out.println(num1[j]);
	}
	}
	
	//for each loop
	for(int []a:matrix) {
		for(int b:a) {
			System.out.println(b);
		}
	}
	
	int [] [] numb= {{1,22,333},{4444,55555,666666},{7777777}};
	
	//for loop
	for(int i=0;i<numb.length;i++) {
		int j2[]=numb[i];
		for(int j1=0;j1<j2.length;j1++) {
			System.out.println(j2[j1]);
		}
	}
	
	
	//for each array
	for(int [] c:numb) {
		for(int d:c) {
			System.out.println(d);
		}
	}
	 
	
	//three dimentional array
	int [][][]arr= {
			{
				{6,5,4},
				{9,2,4}
			},
			{
				{5,4,3},
				{1,2,3}
			}
			};
	System.out.println(arr[1][1][1]);
	System.out.println(arr[0][1][2]);
	
	
	//for loop
	for(int i=0;i<arr.length;i++) {
		int j3[][]=arr[i];
		for(int j4=0;j4<j3.length;j4++) {
			int j5[]=j3[j4];
			for(int j6=0;j6<j5.length;j6++) {
				System.out.println(j5[j6]);
			}
		}
	}
	
	
	
	//for each
	for(int [][]m:arr) {
		for(int []n:m) {
			for(int o:n) {
				System.out.println(o);
			}
		}
		}
	}
	}


