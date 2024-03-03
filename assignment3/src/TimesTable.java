import java.util.Scanner;

public class TimesTable {
    
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any number between 1 and 10: ");

        int userNumber = sc.nextInt();
        int minNumber = 1;
        int maxNumber = 10;

        if (userNumber >= minNumber && userNumber <= maxNumber) {
            for (int i = minNumber; i <= maxNumber; i++) {
                int result = userNumber * i;
                System.out.println(userNumber + " * " + i + " = " + result);
            }
        } else {
            System.out.print("Sorry, you number is invalid!");
        }
        
        sc.close();
    }
}
