import java.util.*;

public class GangstaName {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String firstName = reader.next();
        String lastName = reader.next();

        System.out.println("\n" + firstName.charAt(0) + " Diddy "
                           + lastName.toUpperCase() + " " + firstName
                           + "-izzle");
    }
}
