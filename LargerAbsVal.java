public class LargerAbsVal {
    public static int largerAbsVal(int x, int y) {
        return Math.max(Math.abs(x), Math.abs(y));
    }

    public static void main(String[] args) {
        System.out.println(largerAbsVal(2, 11));
        System.out.println(largerAbsVal(4, -5));
    }
}
