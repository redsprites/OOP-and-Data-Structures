import java.util.Scanner;
public class test{
    public static int divider(int x, int y){
        if( y == 0){
            throw new ArithmeticException();
        }
    return x/y;
    }
    public static void main(String[] args) {
        System.out.println("Input two nos:");
        try {
            Scanner input = new Scanner(System.in);
            int x = input.nextInt();
            int y = input.nextInt();
            int result = divider(x , y);
            System.out.println(result);
        }
        catch(ArithmeticException exception){
            System.out.println("no div by 0");
        }
        System.out.println("still");
    }
}