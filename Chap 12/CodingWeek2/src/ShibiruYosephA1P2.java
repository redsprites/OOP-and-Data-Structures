import java.io.FileNotFoundException;
import java.util.Scanner;
public class ShibiruYosephA1P2 {
    public static void main(String[] args) {
        // Input from user and save to a variable;
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the file name: ");
        String fileName = in.nextLine();
// check if the file exist If not then the program will print a message to that effect and terminate by executing System.exit(1).
        try {
            // Create a File instance
            java.io.File file = new java.io.File(fileName);
            // Create a Scanner for the file
            Scanner input = new Scanner(file);
            // Read data from a file
            int unparsable = 0;
            int parsable = 0;
            int total = 0;
            String x = "";
            while (input.hasNext()) {
                try {
                    x = input.nextLine();
                    int y = Integer.parseInt(x);
                    total += y;
                    parsable++;

                }
                catch (NumberFormatException e){
                    System.out.println("cannot parse " + x + " as an integer");
                    unparsable++;
                }

            }
            // Close the file
            input.close();
            double average = total / parsable;
            System.out.println("Number of parsable lines " + parsable);
            System.out.println("Average value " + average);
            System.out.println("Number of unparsable lines " + unparsable);

        }
        catch(FileNotFoundException e){
            System.out.println("Could not find file: " + fileName);
            System.exit(1);
        }
    }
}


