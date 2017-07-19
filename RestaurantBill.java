import java.util.Scanner;

public class RestaurantBill {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Enter the subtotal: $");
        double subtotal = reader.nextDouble();

        double tax = 0.0675 * subtotal;
        double tip = 0.2 * (subtotal + tax);

        double total = subtotal + tax + tip;

        System.out.println("The total is $" + total + ".");
    }
}
