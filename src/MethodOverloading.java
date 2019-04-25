
public class MethodOverloading {

	public static void main(String[] args) {
		
		System.out.println(modifyMe(1));
		
		System.out.println(modifyMe(1, 4));
		
		System.out.println(modifyMe("1.5"));
		

	}

//	Method Overloading
//	1. Methods must have the same name, but they dont have to
//		be the same return type.
//	2. Must have one of the following differences:
//		a. Diff param types
//		b. Diff param order
//	 	c. Diff amount of param
	
	public static int modifyMe(int num) {
		return num * 56;
	}
	
	public static int modifyMe(int num, int num2) {
		return num * num2;
	}
	
	public static double modifyMe(String userNum) {
		return Double.parseDouble(userNum) * 0.5;
		
		
	}
	
}
