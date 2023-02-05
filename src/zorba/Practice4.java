package zorba;

public class Practice4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = add(5, 6);
		System.out.println(a);
		System.out.println(a + 9);
		

		int b = sub(6, 4);
		System.out.println(b);
		System.out.println(b + 5);
	}

	static int add(int x, int y) {
		return x + y;
	}

	static int sub(int x, int y) {
		return x - y;
	}
}
