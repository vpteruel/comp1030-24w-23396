import java.util.Scanner;

public class QuotaCalculator {

    public static final int QUOTA = 10;
    public static final double BONUS = 3000;
    public static final double ANNUAL_PAYMENT = 50000;

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.println("How many sales they made or how many cars did they sell in one year?");

        int sale = sc.nextInt();
        double finalPayment = ANNUAL_PAYMENT;

        if (sale >= QUOTA) {
            finalPayment += BONUS;
            System.out.println("You did the quota and will receive a bonus payment.");
        } else {
            int diff = QUOTA - sale;
            System.out.println("This employee was unable to make a quota and they were " + diff + " sales short.");
        }

        System.out.println("The final payment for this employee after the bonus is $" + finalPayment);

        sc.close();
    }
}
