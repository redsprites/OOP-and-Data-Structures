
public class TestOctagon {
    public static void main(String[] args) {
        double side = 5;
        Octagon Oct1 = new Octagon(5);
        Octagon Oct2 = null;
        try {
            Oct2 = (Octagon) Oct1.clone();
        }
        catch (CloneNotSupportedException ex) {
            System.out.println("can't clone");
        }
        System.out.println(Oct1);
        System.out.println(Oct2);
        System.out.println("oct1.compareTo(oct2): " + Oct1.compareTo(Oct2));
    }
}

