public class Fibonacci {
    public static void main(String[] args) {
        int x = 1;
        int y = 1;
        int temp;

        for (int i = 0; i < 12; i++) {
            System.out.print(x + " ");

            temp = x;
            x = y;
            y += temp;
        }
    }
}
