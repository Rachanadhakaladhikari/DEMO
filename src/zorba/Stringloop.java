package zorba;

public class Stringloop {

	public static void  (String[] args) {
		// TODO Auto-generated method stub
		String name = "Rachana";
		for (int i = 0; i < name.length(); i++) {
			// System.out.println(i);
			// System.out.println(name.charAt(i));
		}

		for (int i = name.length() - 1; i >= 0; i--) {
//			System.out.println(i);
			System.out.println(name.charAt(i));
		}

		String country = "Nepal";
		String rev = "";
		for (int i = 0; i < country.length(); i++) {
			// System.out.println(i);
			// System.out.println(country.charAt(i));

			rev = country.charAt(i) + rev;
			System.out.println(rev);

			// "n" +""=n
			// "e"+ "en"=en
			// "p" + "pen" = pen
			// "a" + "apen"= apen
			// "l"+ "lapen"= lapen

		}

		String state = "oiho";
		String rev1 = "";
		for (int i = state.length() - 1; i >= 0; i--) {
			rev1 = rev1 + state.charAt(i);
			System.out.println(rev1);

		}

	}

}
