import java.util.Scanner;

public class TimesTable {
    
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any number between 1 and 10: ");

        int userNumber = sc.nextInt();
        int minNumber = 1;
        int maxNumber = 10;

        if (userNumber >= minNumber && userNumber <= maxNumber) {
            
            int i = 0;
            
            System.out.println("FOR loop");
            for (i = minNumber; i <= maxNumber; i++) {
                PrintResult(userNumber, i);
            }

            System.out.println("");

            System.out.println("WHILE loop");
            i = minNumber; // reset the index for the next loop
            while (i <= maxNumber) {
                PrintResult(userNumber, i++);
            }

            System.out.println("");

            System.out.println("DO WHILE loop");
            i = minNumber; // reset the index for the next loop
            do {
                PrintResult(userNumber, i++);
            } while (i <= maxNumber);
            
        } else {
            System.out.print("Sorry, you number is invalid!");
        }
        
        sc.close();
    }

    public static void PrintResult(int userNumber, int i) {
        System.out.println(userNumber + " * " + i + " = " + (userNumber * i));
    }
}
