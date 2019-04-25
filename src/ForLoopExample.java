
public class ForLoopExample {

	public static void main(String[] args) {

		for (int counter = 2; counter <= 24; counter += 2) {

			System.out.println(counter + " hello");

		}

		int i;
		for (i = 150; i >= 100; i--) {
			
			System.out.println(i);
//			for (int j = 0; j < 50; j++) {
//				System.out.println(i + j);
//			}
		}
		
		int [] numbs = {1, 2, 3, 4, 5};
		
		for (int x : numbs ) {
			System.out.println(x);
			System.out.println(", ");
		}

		System.out.println("\n");
		
		String [] names = {"james", "larry", "tom", "lacy"};
		
		for (String name : names) {
			System.out.println(name);
			System.out.println(", ");
		}
	}

}
