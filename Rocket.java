public class Rocket {

    public static void cone() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5 - i; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < i + 1; j++) {
                System.out.print("/");
            }

            System.out.print("**");

            for (int j = 0; j < i + 1; j++) {
                System.out.print("\\");
            }

            System.out.println();
        }
    }

    public static void body() {
        System.out.print("+");
        for (int i = 0; i < 6; i++) {
            System.out.print("=*");
        }
        System.out.println("+");

        for (int i = 0; i < 6; i++) {
            System.out.print("|");
        }
    }

    public static void main(String[] args) {
        cone();
        cone();
    }
}
