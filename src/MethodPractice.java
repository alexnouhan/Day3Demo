import java.util.Scanner;

public class MethodPractice {

	// methods can also live here
	public static void main(String[] args) {
		// never write your methods inside the main
		Scanner scan = new Scanner(System.in);
		sayHello();

		System.out.print("please enter your name: ");
		String userName = scan.nextLine();
		System.out.println(sayHelloName(userName));
		
		
		//we had to use the name of the class to call the method
		//because the method does not live in this class directly
		Robot.sayHello();
		
		
		//since checkSeven is not static, we had to use the name
		//of the class that contains that method
		MethodPractice test = new MethodPractice();
		boolean t = test.checkSeven(65, "Grand");
		System.out.println(t);
		
		System.out.println("enter # of hours: ");
		int hours = scan.nextInt();
		int seconds = daysSeconds(hours);
		System.out.println("in seconds: " + seconds);
		
		scan.close();
	}

	// methods can live here

	/*
	 * 5 Steps for writing methods
	 * 
	 * 1. Visibility modifier (required): public or private 
	 * 2. Static or nothing 
	 * 3. Return type: should match what you need to return 
	 * 4. Method name: should be a verb to show action 
	 * 5. Parameter list: things we need to use in the method
	 * (can be blank)
	 * 
	 * 
	 * Static & same class -- just call by method name
	 * Static & diff class -- use classname.
	 *                        	example: Math.random();
	 *                        
	 * not static in same class or different -- create an object using class
	 *                                          name to call method 
	 *                                          	example: Scanner scan = new Scanner(System.in);
	 *                                          			 scan.next();
	 * 
	 * Methods will always have parenthesis, variables or fields will never have parenthesis
	 */

	public static void sayHello() {
		System.out.println("hello!");
	}

	public static String sayHelloName(String name) {
		return "hello, " + name;
	}
	
	//can call methods inside of other methods
	private boolean checkSeven(int num, String name) {
		String names = sayHelloName(name);
		if (num == 7 || names.equalsIgnoreCase("hello, Grand")) {
			return true;
		}
		return false;
	
	}

	public static int daysSeconds(int hours) {
		//System.out.println(seconds); -- you can put sysout statments in
		//methods that have a return, but it's tipically used for testing
		return hours * 60 * 60;
		
	}
	
}
