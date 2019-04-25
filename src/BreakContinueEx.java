
public class BreakContinueEx {

	public static void main(String[] args) {
		
		System.out.println("Break Example");
		// this will create an infinite loop
		// and will run continuously until we add
		// a stop condition
		while (true) {
//			System.out.println();
			int randomNum = (int) (Math.random() * 10);
			System.out.println(randomNum);
			
			//to break out of this loop we need a conditional statement
			//and we'll use the break keyword to exit
			
			if (randomNum == 7) {
				System.out.println("you found 7!");
				break;
			}
		}

		System.out.println("Continue Example");
		
		for (int i = 0; i < 5; i++) {
			int randomNum = (int) (Math.random() * 10);
			if (randomNum > 7) {
				System.out.println("This number is too big -- going back to the top of the loop");
				continue;
			}
			System.out.println(randomNum);
		}
		
	}

}
