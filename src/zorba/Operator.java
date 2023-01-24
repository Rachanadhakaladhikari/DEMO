package zorba;

public class Operator {

	public static void main(String[] args) {
		// rational  operator are >,<,>=,<=,!=
		//returns boolean value either True or False
		System.out.println(9>7);
		System.out.println(9<7);
		System.out.println(9>=7);
		
		System.out.println(9<=7);
		System.out.println(9!=7);
		
		// logical operators are &&, ||, !
		
		//AND &&
		// true && true=====> true
		// true && false====> false
		// false && true ===> false
		// false && false ====>false
	System.out.println(9>7 && 6<9 );
	System.out.println(9>7 && 6<0 );
	System.out.println(1>7 && 50 ==50 );
	System.out.println(1>2 && 6<0 );
	
	// OR||
	// true || true=====> true
	// true || false====> true
	// false || true ===> true
	// false ||false ====>false
	
	System.out.println(9>7 || 6<9 );
	System.out.println(9>7 || 6<0 );
	System.out.println(1>7 || 50==50 );
	System.out.println(1>2 || 6<0 );
	
	// Not!
	// true ===> false
	// false ===> true
	
	System.out.println(!(2==2 ));
	System.out.println(!(6<0 ));
	
	
	

	}

}
