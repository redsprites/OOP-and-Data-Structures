public class test2 {
    public static void main(String[] args) {
        System.out.println(geoSeries(3));
        System.out.println(gsTail(3));
           }
    private static double geoSeries(double n){
//      base case
//        what if n is 1 ?
        if(n == 0){
            return 1;
        }
//               call the function with n -1 (which is going down into the hole)  plus the result at that n
        double temp = geoSeries(n-1 ) +  1/ (Math.pow(3,n));
        return temp;

    }

//    tail recursion
    public static double gsTail(double n){
        return gsTail(n, 0);
    }
    public static double gsTail(double n , double acc){
        if (n==0){
            return acc +1;
        }
//        calcualte the result at that n first and pass it in the new hole
        acc = acc + 1/Math.pow(3,n);
        return gsTail(n-1, acc) ;
    }
}


