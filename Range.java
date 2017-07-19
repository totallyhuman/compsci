public class Range {
    public static void printNumbers(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.print("[" + i + "] ");
        }

        System.out.println();
    }

    public static void main(String[] args) {
        printNumbers(15);
        printNumbers(5);
    }
}
