public class Salary {
    public static double pay(double salary, int hours) {
        int overtime = Math.max(hours - 8, 0);
        int regular = Math.min(hours, 8);

        return salary * regular + salary * 1.5 * overtime;
    }

    public static void main(String[] args) {
        System.out.println(pay(5.5, 6));
        System.out.println(pay(4.0, 11));
    }
}
