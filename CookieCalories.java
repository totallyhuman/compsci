import java.util.Scanner;

public class CookieCalories {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Enter the amount of cookies you ate: ");
        int cookies = reader.nextInt();

        int calories = cookies * 75;

        System.out.println("The amount of calories you consumed is "
                           + calories + ".");
    }
}
