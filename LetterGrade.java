import java.util.Scanner;

public class LetterGrade {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("What percentage did you earn? ");
        int percent = reader.nextInt();

        if (percent >= 90) {
            System.out.println("You got an A!");
        }
        if (percent >= 80) {
            System.out.println("You got a B!");
        }
        if (percent >= 70) {
            System.out.println("You got a C!");
        }
        if (percent >= 60) {
            System.out.println("You got a D.");
        }
        if (percent < 60) {
            System.out.println("You got an F.");
        }
    }
}
