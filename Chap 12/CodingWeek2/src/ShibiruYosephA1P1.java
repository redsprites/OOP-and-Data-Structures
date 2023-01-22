import java.util.InputMismatchException;
import java.util.Scanner;
public class ShibiruYosephA1P1 {
    public static void main(String [] args) {
        boolean continueInput = true;
        boolean continueSecond = true;
        Scanner input = new Scanner(System.in);
        do {
            try {
                System.out.println("Enter First Integer: ");
                int x = input.nextInt();
                continueInput = false;
                do {
                    try {
                        System.out.println("Enter Second Integer: ");
                        int y = input.nextInt();
                        continueSecond = false;
                        int result = x + y;
                        System.out.println("The sum is "+ result);
                    } catch (InputMismatchException e) {
                        System.out.println("Try again. (" + "Incorrect input: an integer is required)");
                        input.nextLine();
                    }
                } while (continueSecond);
            } catch (InputMismatchException e) {
                System.out.println("Try again. (" + "Incorrect input: an integer is required)");
                input.nextLine();
            }
           }while (continueInput) ;
    }
}
