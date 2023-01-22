// Yoseph Shibiru Assignment 6
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Stack;

public class ParenthesisMatch {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner file = new Scanner(new File("brackets.txt"));
        while (file.hasNextLine()) {
            String input = file.nextLine();
            System.out.println(isParenthesisMatch(input));
        }
        file.close();
    }
    public static boolean isParenthesisMatch(String seq) {
        Stack<Character> stack = new Stack<>();
        int i = 0;
        while (i < seq.length()) {
            char test = seq.charAt(i);
            if (test == '(') {
                stack.push(test);
            } else if (test == ')') {
                if (stack.empty()) {
                    return false;
                }
                stack.pop();
            }
            i++;
        }
        return stack.empty();
    }
}

