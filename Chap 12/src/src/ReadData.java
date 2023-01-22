import java.io.FileNotFoundException;
import java.util.Scanner;
public class ReadData {
  public static void main(String[] args) throws java.io.IOException {
    // Input from user and save to a variable;
    Scanner in = new Scanner(System.in);
    System.out.println("Please enter a file: ");
    String fileName = in.nextLine();
// check if the file exist If not then the program will print a message to that effect and terminate by executing System.exit(1).
try{
  // Create a File instance
  java.io.File file = new java.io.File(fileName);
  // Create a Scanner for the file
}
catch(FileNotFoundException e){
    System.out.println("File you are looking for is not found");
    System.exit(1);
}
      Scanner input = new Scanner(file);
    // Read data from a file
    while (input.hasNext()) {
      int x = inputLine();
      String mi = input.next();
      String lastName = input.next();
      int score = input.nextInt();
      System.out.println(
        firstName + " " + mi + " " + lastName + " " + score);
    }

    // Close the file
    input.close();
  }
}
