public class ExceptionEx extends Throwable {
    public static void main(String[] args) {
        methodA();
    }

    public static void methodA() {
        try {
            System.out.println("Statement A1");
            methodB();
            System.out.println("Statement A2");
        } catch (ArithmeticException e) {
            System.out.println("Catch Block in method A");
        } catch (Exception e) {
            System.out.println("Catch Block in method A");
        }
    }

    public static void methodB() throws Exception {
        try {
            System.out.println("Statement B1");
            methodC();
            System.out.println("Statement B2");
        } catch (ArithmeticException e) {
            System.out.println("Catch block in method B");
        } catch (Exception e) {
            System.out.println("Catch block in method B");
        }
    }

    public static void methodC() throws Exception {
        try {
            System.out.println("Statement c1");
//                throw new Exception("random exception");
            throw new MyException("just for fun ", -2);
//                int x = 10 / 0;
//                System.out.println("Statement c2");
        } catch (MyException e) {
            System.out.println("Catch block in method C");
            System.out.println("Invalid age " + e.getMessage() + e.getAge() + e.getStackTrace());
        } finally {
            System.out.println("finally");
        }

    }
}
