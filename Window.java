public class Window {
    public static void main(String[] args) {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("+===");
            }
            System.out.println("+");

            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 2; k++) {
                    System.out.print("|   ");
                }
                System.out.println("|");
            }
        }

        for (int i = 0; i < 2; i++) {
            System.out.print("+===");
        }
        System.out.println("+");
    }
}
