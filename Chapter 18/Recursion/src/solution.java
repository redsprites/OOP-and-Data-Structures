public class solution {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        numbers[0] = -92;
        numbers[1] = 9;
        numbers[2] = 41;
        numbers[3] = 99;
        numbers[4] = 29;
        numbers[4] = -78;
        boolean newArray = solution2(numbers);

        System.out.println(newArray);

//        for( int i =0 ; i< numbers.length-2; i++){
//            System.out.println(newArray);
//    }
    }
    static int[] solution(int[] numbers) {
        int [] newArray = new int[numbers.length-2];
        int i;

        for( i =0 ; i< numbers.length-2; i++){
            if ((numbers[i] < numbers[i+1] && numbers[i+1] > numbers[i+2] )||
                    (numbers[i]> numbers[i+1] && numbers[i+1]< numbers[i+2])){
                newArray[i] = 1;
            }
            else{newArray[i]=0;}

        }
        return newArray;
    }
    static boolean solution2(int[] a) {
        for (int i = 0 ; i < a.length/2; i++){
            System.out.println(a[i]);
            if (a[i] > a[a.length-(i+1)]) {
                return false;
                }
            }
     return true;
    }
    String helloWorld(int[] newArray) {
        System.out.println("This prints to the console when you Run Tests");
        return "Hello, " + newArray;
    }
}