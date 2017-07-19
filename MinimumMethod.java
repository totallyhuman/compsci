public class MinimumMethod {
    public static int min(int x, int y, int z) {
        return Math.min(Math.min(x, y), z);
    }

    public static void main(String[] args) {
        System.out.println(min(3, -2, 7));
        System.out.println(min(19, 27, 6));
    }
}
