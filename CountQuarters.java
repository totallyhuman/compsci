public class CountQuarters {
    public static int countQuarters(int cents) {
        return cents % 100 / 25;
    }

    public static void main(String[] args) {
        System.out.println(countQuarters(64));
        System.out.println(countQuarters(1278));
    }
}
