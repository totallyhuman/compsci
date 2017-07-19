public class Quadrants {
	
	public static int quadrantOf(double x, double y) {
		if (x == 0 || y == 0) {
			return 0;
		}
		if (x > 0 && y > 0) {
			return 1;
		}
		if (x < 0 && y > 0) {
			return 2;
		}
		if (x < 0 && y < 0) {
			return 3;
		}
		return 4;
	}

	public static void main(String[] args) {
		System.out.println(quadrantOf(-4.2, 17.3));
	}

}
