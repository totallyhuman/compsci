public class TwoRockets {
    public static void triangle() {
        System.out.println("   /\\       /\\\n" +
                           "  /  \\     /  \\\n" +
                           " /    \\   /    \\");
    }

    public static void box() {
        System.out.println("+------+ +------+\n" +
                           "|      | |      |\n" +
                           "|      | |      |\n" +
                           "+------+ +------+");
    }

    public static void unitedStates() {
        System.out.println("|United| |United|\n" +
                           "|States| |States|");
    }

    public static void main(String[] args) {
        triangle();
        box();
        unitedStates();
        box();
        triangle();
    }
}
