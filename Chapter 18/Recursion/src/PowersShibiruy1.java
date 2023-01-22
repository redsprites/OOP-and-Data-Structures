//Made by Yoseph Shibiru
// Assignment on methods on recursion
import java.util.Scanner;
public class PowersShibiruy1 {
    private static int multiplications;

    //    first method "power1" is simply iterative uses for loop to compute number b multiplied n times
    public static double power1(double base, int n) {
        double mult = 0;
        double total = 1;
//   create a loop that will save the multiplication of a number by itself into a total variable on each loop
//        create condition
//     for square multiply the number times itself
//        create a total and save it, pull the total gain and multiply it with the number
              for (int i = 0; i < n; i++) {
                mult = total * base;
                total = mult;
                multiplications++;
            }
            return mult;
    }

    //    second method "power2" uses recursive method to compute number b multiplied n times
    public static double power2(double base, int n) {
//    create a base case what is the sub problem? if n is 1 then return b
        multiplications++;
        if (n == 1) return base;
//    create a recurrence relation
        return power2(base, n - 1) * base;
    }

    public static double power3(double base, int n) {
//    create a base case what is the sub problem? if n is 1 then return b
        if (n == 0) {
            return 1;
        }
//    create a recurrence relation
        else {
            if (n % 2 == 0) {
                multiplications++;
                double num = power3(base, n / 2);
                return num * num;
            } else {
                multiplications += 2;
                double num = power3(base, n / 2);
                return base * num * num;
            }
        }
    }
    public static double power4(double base, int n) {
       return multPow(1, base, n);
    }
    public static double multPow(double a, double base, int n) {
            double total;
//    create a base case what is the sub problem? if n is 1 then return b
        if (n == 0) {
            return a;
        }
//    create a recurrence relation
            else if (n % 2 == 0) {
                multiplications++;
                    total =  base * base;
                    base = total;
                return multPow( a, base, n / 2);
           } else {
                multiplications += 2;
                a *= base;
                total =  base * base;
                base = total;

                 return multPow( a,base, n / 2);
            }
    }
    public static double power5(double base, int n) {
        double total = 1;
        double baseAcc = 1;
        multiplications++;
          while  (n>0)
                if (n==1) {
                    multiplications++;
                    return  total * baseAcc;
                }
                else if (n%2 == 0){
                    total = base * base;
                    base = total;
                    n/=2;
                    multiplications++;
                }
                else {
                    baseAcc *= base;
                    total = base * base;
                    base = total;
                    n/=2;
                    multiplications+=2;
            }
            return total;
        }


//    create a main method to test the methods you built
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a decimal number: ");
        double base = input.nextDouble();
        System.out.println("Enter a non-negative integer exponent: ");

        int n = input.nextInt();

//        Make sure we are getting a positive integer for our exponent.
        while (n<0){
            System.out.println("You Entered a negative number. Please Enter a non-negative integer: ");
             n = input.nextInt();
        }
        System.out.println("Computing " + base +" to the power " + n+ ":");
        System.out.println("Math.pow("+ base +"," + n+") = " + Math.pow(base, n));
//power1
        multiplications = 0;
        System.out.println("\npower1(" + base + ", " + n + ") = " + power1(base, n));
        System.out.println("Multiplications = " + multiplications);
//power2
        multiplications = 0;
        System.out.println("\npower2(" + base + ", " + n + ") = " + power2(base, n));
        System.out.println("Multiplications = " + multiplications);
// power3
        multiplications = 0;
        System.out.println("\npower3(" + base + ", " + n + ") = " + power3(base, n));
        System.out.println("Multiplications = " + multiplications);
// power4
        multiplications = 0;
        System.out.println("\npower4(" + base + ", " + n + ") = " + power4(base, n));
        System.out.println("Multiplications = " + multiplications);
// power5
        multiplications = 0;
        System.out.println("\npower5(" + base + ", " + n + ") = " + power5(base, n));
        System.out.println("Multiplications = " + multiplications);
        multiplications = 0;
    }
}
