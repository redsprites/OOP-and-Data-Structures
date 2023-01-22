public class isPalindrom {
    public static void main(String[] args) {
        Object[] array = new Object[4];
        array[0] =1;
        array[1] =2;
        array[2] =2;
        array[3] =1;

        System.out.println(isPalindrome(array));
    }
    public static boolean isPalindrome(Object[] array) {
        return isPalindrome(array, 0, array.length - 1);
    }

    public static boolean isPalindrome(Object[] array, int first, int last) {
        if (first >= last) // Base case
            return true;
        if (!array[first].equals(array[last])) {
            return false;
        }// Base case
        else
            return isPalindrome(array, first + 1, last - 1);
    }
}
