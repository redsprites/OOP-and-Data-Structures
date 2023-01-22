public class User {
    public static void main(String[] args) {
        Car carA = new Car();
        carA.setModel("Tesla Y");
        Boat boatA = new Boat();
        boatA.setModel("Sail boat");
        Vehicle V[] = new Vehicle[2];
        V[0] = carA;
        V[1] = boatA;

        for (int i = 0; i<2; i++){
          if (V[i] instanceof  Car) {
              System.out.println("this is a car");
          }
              else if (V[i] instanceof Boat){
                  System.out.println("this is a boat");
          }
              V[i].Sound();
        }
        carA.move();
        carA.operate();
    }
}
