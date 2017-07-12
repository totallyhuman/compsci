public class EggStop {

    public static void top() {
        System.out.println("  _______\n" +
                           " /       \\\n" +
                           "/         \\");
    }

    public static void bottom() {
        System.out.println("\\         /\n" +
                           " \\_______/");
    }

    public static void line() {

    }

    public static void main(String[] args) {
        top();
        bottom();
        bottom();
        System.out.println(" +-------+");
        top();
        System.out.println("|   STOP  |");
        bottom();
        top();
        System.out.println("+---------+");
    }
}
