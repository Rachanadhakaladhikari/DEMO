package zorba;

public class String7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	String [] colors= {"red","blue","green","yellow"	};
	//for each loop
	for(String a:colors) {
		System.out.println(a);
	}
	char [] aa= {'a','e','r','i','a','l'};
	String abc="";
	for(char b:aa) {
		abc=abc+b;
		
	}
	System.out.println(abc);
	
	
	
int[] num= {7,4,5,6};
int sum=0;
float avg=0;
for(int c:num) {
	sum=sum+c;
	
}
System.out.println(sum);
avg=sum/num.length;
System.out.println(avg);



int [][] matrix= {{8,7,6,5},{9,2,6,4}};
  // 0 1 2 3
//{8,7,6,5}===>0

   //0,1,2,3
//{9,2,6,4}====>1

System.out.println(matrix[0][1]);
System.out.println(matrix[1][2]);

//split
//"its", "raining","outside" 
String text="its raining outside";
String[] result=text.split(" ");
for (int i=0;i<result.length;i++) {
	System.out.println(result[i]);
}
String [] result2=text.split("i");
for(int i=0;i<result2.length;i++) {
	System.out.println(result2[i]);
}

int [] num1= {6,3,3,2};
int sum1=0;
for(int d:num1) {
	sum1=sum1+d;
}

System.out.println(sum1);
int[]age= {11,26,3,4};
for(int e:age) {
	System.out.println(e);
}







	}

}
