import java.sql.SQLOutput;

public class Boat extends Vehicle{
    @Override
    public void operate() {
        System.out.println("boat splashes");
    }

    @Override
    public void move() {
        System.out.println("boat moves");
    }

    @Override
    public void Sound() {
        System.out.println(" boat sound");
    }
}
