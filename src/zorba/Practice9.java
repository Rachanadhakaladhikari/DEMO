package zorba;

public class Practice9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "Rachana";
		int r = name.indexOf('a');
		System.out.println(r);
		int r1 = name.indexOf('a', 5);
		System.out.println(r1);
		for (int i = 0; i < name.length(); i++) {
//System.out.println(i);
		}

		// array
		String color[] = new String[3];
		color[0] = "red";
		color[1] = "blue";
		color[2] = "green";
		System.out.println(color[0]);
		System.out.println(color[2]);
		System.out.println(color[1]);
		for (int i = 0; i < color.length; i++) {
			System.out.println(color[i]);
		}

		int num[] = { 98, 654, 25, 97 };
		int add = 0;
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);

		}
		for (int i1 = 0; i1 < num.length; i1++) {
			add = add + num[i1];
		}
		System.out.println(add);

		// split
		String text1 = "I am learning java";
		
		String[] r3 = text1.split(" ");
		for (int i = 0; i < r3.length; i++) {
			System.out.println(r3[i]);
		}
		String[] r4 = text1.split("a");
		for (int i = 0; i < r4.length; i++) {
			System.out.println(r4[i]);
		}
//	
//	
//	

		String naam = "Rachana";
		char[] r6 = naam.toCharArray();
		for (int i = 0; i < r6.length; i++) {

			System.out.println(r6[i]);

		}

		// for each loop
		int age[] = { 7, 9, 5, 4 };
		System.out.println("for -each loop");

		for (int a : age) {
			System.out.println(a);
		}

		String fruits[] = { "apple", "banana", "cherry", "kiwi" };
		for (String b : fruits) {
			System.out.println(b);
		}
		char ab[] = { 'a', 'e', 'i', 'o', 'u' };
		for (char x : ab) {
			System.out.println(x);
		}

		char names8[] = { 'r', 'a', 'c', 'h', 'a', 'n', 'a' };
		String rev = "";
		for (char h : names8) {
			rev = rev + h;
		}
		System.out.println(rev);

//matrix
		int[][] matrix = { { 8, 6, 4 }, { 7, 3, 6, 0 } };
		System.out.println(matrix[1][2]);
		System.out.println(matrix[0][0]);

		char names9[] = { 'r', 'a', 'c', 'h', 'a', 'n', 'a' };
		String abc = "";
		for (char u : names9) {
			// System.out.println(u);
			abc = abc + u;
		}

		System.out.println(abc);

		// sum and average
		int [] num5= {5,7,4,2};
		int sum=0;
		float avg=0;
		for(int x:num5){
			sum=sum+x;
		}
		
		System.out.println(sum);
		avg=sum/num5.length;
		System.out.println(avg);
		
		
		
		
	}

}
