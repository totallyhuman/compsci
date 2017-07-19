import java.util.Scanner;

public class TestAverage {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Enter three test scores: ");
        double score1 = reader.nextDouble();
        double score2 = reader.nextDouble();
        double score3 = reader.nextDouble();

        double average = (score1 + score2 + score3) / 3;

        System.out.println("The three test scores you entered are " + score1
                           + ", " + score2 + ", " + score3 + ".");
        System.out.println("The average of the three scores is " + average + ".");
    }
}
