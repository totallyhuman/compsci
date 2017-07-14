
public class MathClassDemo {
	public static double circleArea(double rad) {
		return Math.PI * Math.pow(rad, 2);
	}
	
	public static double circleCircumference(double rad) {
		return 2 * Math.PI * rad;
	}
	
	public static double distance(int x1, int y1, int x2, int y2) {
		int dx = x2 - x1;
		int dy = y2 - y1;
		
		return Math.sqrt(Math.pow(dx, 2) + Math.pow(dy, 2));
	}
	
	public static int max(int x, int y) {
		return Math.max(x, y);
	}
	
	public static int min(int x, int y) {
		return Math.min(x, y);
	}
	
	public static double roundDown(double x) {
		return Math.floor(x);
	}
	
	public static double roundUp(double x) {
		return Math.ceil(x);
	}
	
	public static int absoluteValue(int x) {
		return Math.abs(x);
	}
	
	public static void main(String[] args) {
		double radius = 2.5;
		
		int x1 = 0;
		int y1 = 0;
		int x2 = 3;
		int y2 = 5;
		
		int x = 3;
		int y = 5;
		
		double a = 3.2;
		double b = 3.9;
		
		int c = -5;
		
		System.out.println("The area of a circle with the radius " + radius + " is "
						   + circleArea(radius));
		System.out.println("The cirumference of a circle with the radius " + radius
				           + " is " + circleCircumference(radius));
		System.out.println("The distance from (" + x1 + ", " + y1 + ") to (" + x2
				           + ", " + y2 + ") is " + distance(x1, y1, x2, y2));
		System.out.println("The minimum of " + x + " and " + y + " is " + min(x, y));
		System.out.println("The maximum of " + x + " and " + y + " is " + max(x, y));
		System.out.println(a + " rounded up is " + roundUp(a));
		System.out.println(b + " rounded down is " + roundDown(b));
		System.out.println("The absolute value of " + c + " is " + absoluteValue(c));
		
	}
	
}
