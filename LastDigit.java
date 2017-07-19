public class LastDigit {
    public static int lastDigit(int x) {
        return Math.abs(x) % 10;
    }

    public static void main(String[] args) {
        System.out.println(lastDigit(3572));
        System.out.println(lastDigit(-947));
    }
}
