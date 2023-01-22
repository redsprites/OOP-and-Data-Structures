import java.util.*;
public class test25 {
    public static void foo(){

        try {
            System.out.println("Entering try in foo");
            int[] a = new int[10];
            a[10] = 1;
            System.out.println("leaving try in foo");// Throws an ln&xQjtOfBoundsExcepticn
        }
        finally {
            System.out.println("Finally clause in foo is excuted");
        }
    }

    public static void main(String[] args) {
       try {
        foo();
       }
            catch (Exception ex) {
        System.out.println("Catch clause in main is excuted");
}
    }}