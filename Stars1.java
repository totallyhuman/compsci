public class Stars1 { 
    public static void main(String[] args) { 
        line(13); 
        line(7); 
        line(35); 
        box(10, 5); 
        box(5, 6); 
    } 

    public static void line(int length) { 
        for (int i = 1; i <= length; i++) { 
            System.out.print("*"); 
        }
        System.out.println(); 
    } 

    public static void box(int width, int height) {
        for (int i = 1; i <= width; i++) { 
            System.out.print("*"); 
        }
        System.out.println(); 
        for (int line = 1; line <= height - 2; line++) {
            System.out.print("*");
            for (int space = 1; space <= width - 2; space++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }
        for (int i = 1; i <= width; i++) { 
            System.out.print("*"); 
        }
        System.out.println(); 
    }
}
