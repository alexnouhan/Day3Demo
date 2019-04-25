import java.util.Scanner;

/*
 * Write a method named ageInDays that takes in an int value for an age
 * and calculates the amount of days
 * a user has been alive.
 * 
 * Now add the ability to take input from a user, and 
 * write another method called daysUntil75() that calls ageInDays() and 
 * calculates the amount of days until they reach 
 * 75yrs (27375 days).
 *
 */
public class CodeChallenge2 {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your age in years: ");
		int userAge = scan.nextInt();
		
		System.out.println("You are " + ageInDays(userAge) + " days old.");
		System.out.println("You'll be 75 in " + daysUntil75(userAge) + " days.");
		
		scan.close();
	}

	public static int ageInDays(int age) {
		return age * 365;
	}
	
	public static int daysUntil75(int age) {
		return ageInDays(75 - age);
	}


}
