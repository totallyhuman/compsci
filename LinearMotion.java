public class LinearMotion {
    public static void main(String[] args) {
        double t = 5;
        double s0 = 3;
        double v0 = 7;
        double a = 9;

        double s = s0 + v0 * t + 0.5 * a * t * t;

        System.out.println(s);
    }
}
