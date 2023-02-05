package zorba;

public class Switch {

	public static void main(String[] args) {
		//switch without break
		int day=5;
		switch(day){
		case''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''' 1:
			System.out.println("The day is Sunday");
		case 2:
			System.out.println("The day is Monday");
		case 3:
			System.out.println("The day is Tuesday");
		case 4:
			System.out.println("The day is Wednesday");
		case 5:
			System.out.println("The day is Thursday");
		case 6:
			System.out.println("The day is Friday");
		case 7:
			System.out.println("The day is Saturday");
		default:
			System.out.println("Invalid entry");
		}
			// if there is no any break statement mentioned in the switch case then all the
			// option following the right answer will be printed. If we mention break in
			// that case only right answer will be printed

			
			int noofday=4;
			switch(noofday){
			case 1:
				System.out.println("The day is Sunday");
				break;
			case 2:
				System.out.println("The day is Monday");
				break;
			case 3:
				System.out.println("The day is Tuesday");
				break;
			case 4:
				System.out.println("The day is Wednesday");
				break;
			case 5:
				System.out.println("The day is Thursday");
				break;
			case 6:
				System.out.println("The day is Friday");
				break;
			case 7:
				System.out.println("The day is Saturday");
				break;
			default:
				System.out.println("Invalid entry");
			}
				
				//if there is a multiple cases in switch case
				
				String city= "queens";
				
				switch(city){
				case "Haslet":
				case "Euless":
				case "Fortworth":
					System.out.println("texas");
					break;
				case "queens":
				case "long island":
					System.out.println("new york");
					break;
				case "adsn":
					System.out.println("florida");
					break;
				case "Logan":
				case "jdhhbfbg":
					System.out.println("utah");
					break;
				default:
					System.out.println("Invalid entry");

				
		}
			// multiple cases switch case in term of numbers
				int numofday=44;
				switch(numofday){
				case 1:
				case 19:
				case 14:
					System.out.println("The day is Sunday");
					break;
				case 2:
				case 44:
					System.out.println("The day is Monday");
					break;
				case 3:
				case 51:
					System.out.println("The day is Tuesday");
					break;
				case 4:
				case 81:
					System.out.println("The day is Wednesday");
					break;
				case 5:
					System.out.println("The day is Thursday");
					break;
				case 6:
					System.out.println("The day is Friday");
					break;
				case 7:
					System.out.println("The day is Saturday");
					break;
				default:
					System.out.println("Invalid entry");
				
				
	}
	}
}