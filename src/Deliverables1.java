import java.util.Scanner;

public class Deliverables1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Scanner scan = new Scanner(System.in);

		String eventType;
		String mealSuggest = "";
		int partySize;
		String prepSuggest = "";
		String result = "";

		System.out.print("What type of event are you having? ");
		System.out.println("Please enter Casual, Semi-Formal or Formal.");

		eventType = scan.nextLine();

		if (eventType.equalsIgnoreCase("Casual")) {
			mealSuggest = "sanwiches";
		}

		else if (eventType.equalsIgnoreCase("Semi-formal")) {
			mealSuggest = "fried chicken";
		}

		else if (eventType.equalsIgnoreCase("Formal")) {
			mealSuggest = "chicken parmesan";
		}

		else {
			System.out.println("Not a valid answer, please select again.");
		}

		System.out.println("How many people are attending?");

		partySize = scan.nextInt();

		if (partySize == 1) {
			prepSuggest = "in the microwave";
		}
		if ((partySize >= 2) && (partySize <= 12)) {
			prepSuggest = "in your kitchen";
		}
		if (partySize >= 13) {
			prepSuggest = "by a caterer";
		}

		result = "Since you're hosting a " + eventType + " event for " + partySize + " participants, you should serve "
				+ mealSuggest + " prepared " + prepSuggest + ".";
		System.out.println(result);
	}

}
