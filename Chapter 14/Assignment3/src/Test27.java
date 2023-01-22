class Square implements Cloneable {
    private double length;

    public Square(double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
class MySquare implements Cloneable {
    public Square s1 = new Square(1.0);
    public Square s2 = new Square(1.0);

    public Object clone() {
        try {
            MySquare clone = (MySquare) super.clone();
            clone.s2 = (Square) s2.clone();
            return clone;
        } catch (CloneNotSupportedException ex) {
            return null;
        }
    }
}
public class Test27 {
public static void main(String[] args){
        MySquare m1 = new MySquare();
        MySquare m2 = (MySquare) m1.clone();
        m1.s1.setLength(2.0);
        m1.s2.setLength(3.0);
        System.out.println(m2.s1.getLength());
        System.out.println(m2.s2.getLength());
    }}