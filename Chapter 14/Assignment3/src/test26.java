import java.util.*;
public class test26 {
public static void foo() {
    try {
        System.out.println("Entering try in foo");
        int[] a = new int[10];
        a[9] = 1; // Does not throw an exception
        System.out.println("Leaving try in foo");
    } finally {

        System.out.println("Finally clause in foo is executed");
    }
}

    public static void main(String[] args) {

    try {
        foo();
    }
        catch (Exception ex) {
        System.out.println(" Catch clause in main is executed");

}}}