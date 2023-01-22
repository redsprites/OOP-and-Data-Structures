import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Objects;
    public class Driver implements Comparable <Driver>
    {
    int age;
    Car car = new Car();

    public Driver(int age, Car car) {
        this.age = age;
        this.car = car;
    }
        @Override
        public Object clone() throws CloneNotSupportedException {
           try{
            Driver  clonedDriver = (Driver) super.clone();
            clonedDriver.car = (Car) car.clone();
            return clonedDriver;
        }
        catch(CloneNotSupportedException ex) {
            return null;
        }
    }
    @Override
    public int compareTo(Driver o) {
        if(this.age > o.age)
            return 1;
        else if (this.age == o.age)
            return 0;
        else return -1;
        }

    public int equals (Driver o) {
        return this.compareTo(o);
        }

    @Override
    public String toString() {
        return "Driver details: " + this.age;
    }
        //        ###################################################################################
//        Driver d3 = new Driver(30, new Car());
//        Driver d4 = new Driver(40, new Car());
//
//        Driver [] drivers = new Driver[4];
//    drivers[0] = d1;
//
//    drivers[2] = d3;
//    drivers[3] = d4;
//    Arrays.sort(drivers);
//
//    for (int i=0; i<4; i++)
//        System.out.println(drivers[i]);

        //                System.out.println(d1.compareTo(d2));
        public static void main(String[] args) {
//     Using the clone method
            Driver d1 = new Driver(30, new Car());
            Driver d2 = null;
            try {
                d2 = (Driver) d1.clone();
            } catch (CloneNotSupportedException ex) {
                System.out.println("connot clone");
            }
            System.out.println(d1);
            System.out.println(d2);

            d2.age = 50;

            System.out.println(d1.car);
            System.out.println(d2.car);
        }
}
