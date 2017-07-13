
public class MethodPractice {

	
	public static int sum(int x, int y) {
		return x + y;
	}
	
	public static int addOne(int x) {
		return x + 1;
	}
	
	public static int doubleNumber(int x) {
		return x * 2;
	}
	
	public static void main(String[] args) {
		int x = 3;
		int y = 5;
		
		int sum = sum(x, y);
		int incremented = addOne(x);
		int doubled = doubleNumber(y);
		
		System.out.println("The sum of x and y is " + sum);
		System.out.println("x plus one equals to " + incremented);
		System.out.println("y times two equals to " + doubled);
	}

}
