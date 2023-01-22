import java.io.FileNotFoundException;

public class WriteData {
    public static void main(String[] args) throws FileNotFoundException {
        java.io.File file = new java.io.File("Scores.txt");
//        create a file
        java.io.PrintWriter output = new java.io.PrintWriter(file);
    }
}
