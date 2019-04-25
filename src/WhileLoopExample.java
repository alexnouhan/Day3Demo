import java.util.Scanner;

public class WhileLoopExample {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String cont = "yes";
		
		while (cont.equalsIgnoreCase("yes")) {
			//your code should start here
			System.out.println("Play");
			
			
			
			//this is where your code should end
			System.out.println("Do you want to continue? (yes/no)");
			cont = scan.nextLine();
		}
		
		//this is to let our user know that our program has ended 
		System.out.println("Goodbye!");
		
		scan.close();
		
	}

}
