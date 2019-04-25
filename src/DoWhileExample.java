
public class DoWhileExample {

	public static void main(String[] args) {
		
		
		int counter = 100;
		
		
		//do loop will always execute the code inside at least once
		do {
			
			System.out.println(counter);
			counter--; //same as saying counter = counter - 1;
			
		} while (counter >= 0);

	}

}
