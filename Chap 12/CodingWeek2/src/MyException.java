public class MyException extends Exception{
    int age;

    public MyException(String message, int age){
        super (message);
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}
