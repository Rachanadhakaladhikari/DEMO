package zorba;

import java.util.Arrays;

public class Revisison {
	public static void main(String[] args) {
		String book1 = "I am learning java";
		String[] result = book1.split("a");
		System.out.println(result);

		System.out.println(Arrays.toString(result));

		int[] numb = { 1, 2, 3, 4, 5 };
		int sum = 0;
		double avg = 0;
		for (int i = 0; i < numb.length; i++) {
			sum = sum + numb[i];

		}
		System.out.println(sum);
		avg = sum / numb.length;
		System.out.println(avg);
		// string to char
		String name = "Rachana";
		char[] a = name.toCharArray();
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}

		String nam = "Kriraj";
		char[] aa = nam.toCharArray();
		for (int i = 0; i < aa.length; i++) {
			System.out.println(aa[i]);
		}

		String name1 = "ramkrishna";
		char[] aaa = name1.toCharArray();
		for (int i = 0; i < aaa.length; i++) {
			System.out.println(aaa[i]);
		}

		String name2 = "Kripal";
		char[] ab = name2.toCharArray();
		for (int i = 0; i < ab.length; i++) {
			System.out.println(ab[i]);
		}

		// split
		String text = "I am rachana";
		String[] bb = text.split(" ");
		for (int i = 0; i < bb.length; i++) {
			System.out.println(bb[i]);

		}

		String txt = "I am going to cook something";
		String[] t = txt.split(" ");
		for (int i = 0; i < t.length; i++) {
			System.out.println(t[i]);
		}

		String[] tt = txt.split("i");
		for (int i = 0; i < tt.length; i++) {
			System.out.println(tt[i]);
		}

		String book = "trurh behind dark";
		String[] r = book.split(" ");
		for (int i = 0; i < r.length; i++) {
			System.out.println(r[i]);
		}

		String name3 = "book";
		char[] a1 = name3.toCharArray();
		for (int i = 0; i < a1.length; i++) {
			System.out.println(a1[i]);
		}

		// print char to string
		char[] c = { 'k', 'i', 'p', 'u' };
		String rev = " ";
//			for(int i=0;i<c.length;i++) {
//				rev=rev+c[i];
//				}
//		
//		System.out.println(rev);
//		
		for (char e : c) {
			rev = rev + e;

		}
		System.out.println(rev);
		// print no in multidimentional array
		int[][] number = { { 8, 5, 4, 3 }, { 3, 5, 8, 9 } };
//		for(int i=0;i<number.length;i++) {
//			int[] m=number[i];
//			for(int j=0;j<m.length;j++) {
//				System.out.println(m[j]);
//			}
//		}

		for (int[] n : number) {
			for (int o : n) {
				System.out.println(o);
			}
		}

		// 3 dim array
		int[][][] no = { { { 2, 3, 4 }, { 3, 4, 5 } }, { { 2, 1, 0 }, { 6, 7, 8 } } };
		System.out.println(no[0][1][1]);

//		//for each		
//			for(int[][] f:no) {
//				for(int [] k:f) {
//					for(int u:k) {
//						System.out.println(u);
//					}
//				}
//			}

		// for loop
		for (int i = 0; i < no.length; i++) {
			int[][] g = no[i];
			for (int j = 0; j < g.length; j++) {
				int[] h = g[j];
				for (int k = 0; k < h.length; k++) {
					System.out.println(h[k]);
				}
			}

		}

	}
}

//
