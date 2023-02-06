package zorba;

public class Practice6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "Rachana";
		for (int i = 0; i < name.length(); i++) {
			System.out.println(name.charAt(i));
		}

		String name1 = "Adhikari";
		for (int i = name1.length() - 1; i >= 0; i--) {
			System.out.println(name1.charAt(i));
		}

		String country = "America";
		String rev = "";
		for (int i = 0; i < country.length(); i++) {
			rev = country.charAt(i) + rev;
			System.out.println(rev);
		}
		String hotel = "ttiah";
		String rev1 = "";
		for (int i = hotel.length() - 1; i >= 0; i--) {
			rev1 = rev1 + hotel.charAt(i);
			System.out.println(rev1);
		}

		String fruits = "apple banana cherry kiwi papaya";
		boolean result = fruits.contains("cherry");
		if (result) {
			System.out.println("cherry is available");
		} else {
			System.out.println("cherry is unavailable");
		}
String flowers="rose lily tulip rhododendron lotus";
boolean result2=flowers.contains("lily");
if(result2) {
	System.out.println("lily is present");
}else {
	System.out.println("lily is not present");
}
		
		
		String name2 = "ramkrishna";
		int count = 0;
		for (int i = 0; i < name2.length(); i++) {
			if (name2.charAt(i) == 'a' || name2.charAt(i) == 'e' || name2.charAt(i) == 'i' || name2.charAt(i) == 'o'
					|| name2.charAt(i) == 'u') {
				count = count + 1;

			}
		}
		System.out.println(count);
	}

}
