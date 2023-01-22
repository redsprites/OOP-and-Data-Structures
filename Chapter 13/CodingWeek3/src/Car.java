public class Car extends Vehicle implements Cloneable{
    @Override
    public void operate() {
        System.out.println("car drives");
    }

    @Override
    public void move() {
    System.out.println("car is moving");
    }

    @Override
    public void Sound() {
        System.out.println("car - honk");

    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return null;
    }
}

