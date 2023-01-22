import java.text.DecimalFormat;
import java.util.Arrays;

public class Laptop implements Comparable <Laptop>{
// cpu, ram, hdd, graphics card (boolean 1=yes/0=no), screen size, weight, battery
//life (hours), and price
    double cpu = 0;
    double ram = 0;
    double hdd = 0;
    double screenSize = 0;
    double weight = 0;
    double batteryLife = 0;
    double price = 0;
    int graphicsCard = 0;
    double laptopScore = 0;
    double cpuMax = 3.0, ramMax = 32, hddMax = 2048, screenMax = 17.0, weightMax = 6, batteryMax = 9, priceMax = 2000;
    double rand = (double)(Math.random() * 2) + 1;
    public Laptop(double cpu, double ram, double hdd, double screenSize, double weight, double batteryLife, double price, int graphicsCard) {
        this.cpu = cpu;
        this.ram = ram;
        this.hdd = hdd;
        this.screenSize = screenSize;
        this.weight = weight;
        this.batteryLife = batteryLife;
        this.price = price;
        this.graphicsCard = graphicsCard;
        this.laptopScore = (2 * this.cpu/cpuMax) + (2 * this.ram/ramMax) + (1 * this.hdd/hddMax) + (this.graphicsCard) + (1 * this.screenSize/screenMax) +
                (1 * this.weight/weightMax) + (1 * this.batteryLife/batteryMax) + (1 * this.price/priceMax);
    }

      public static Laptop randomLaptopCreator(){
       DecimalFormat df = new DecimalFormat("#.##");
       Laptop sampleLaptop = new Laptop(Double.parseDouble(df.format(Math.random() * 2) + 1),
               Double.parseDouble(df.format(Math.pow(2,(int)(Math.random() * 5) + 1))),
               Double.parseDouble(df.format(Math.pow(2,(int)(Math.random() * 6) + 6))),
               Double.parseDouble(df.format((Math.random() * 5.0) + 12.0)),
               Double.parseDouble(df.format((Math.random() * 4) + 2)),
               Double.parseDouble(df.format((Math.random() * 7) + 2)),
               Double.parseDouble(df.format((Math.random() * 1500) + 500)),
               (int) (Math.random() * 2));
       return sampleLaptop;
   }
    @Override
    public java.lang.String toString() {
        return "Laptop with cpu = " + this.cpu+  ", ram = " + this.ram+  ", HDD = " + this.hdd + ", Screen Size = "+ this.screenSize+ ", Weight = "+ this.weight+ ", Battery Life = "+ this.batteryLife + ", Price = "+ this.price+ ", Graphics Card = "+ this.graphicsCard+ ", Laptop Score = "+ laptopScore;

    }
      @Override
    public int compareTo(Laptop o) {
            if (this.laptopScore < o.laptopScore) {
                  return -1;
              } else if (this.laptopScore == o.laptopScore) {
                  return 0;
              } else {
                  return 1;
              }
          }
    public static void main(String[] args) {
        Laptop [] Laptops = new Laptop[5];
        for (int i = 0; i<5; i++){
            Laptops[i] =  randomLaptopCreator();
            System.out.println(Laptops[i]);}
        System.out.println("\n");
        Arrays.sort(Laptops);
        for (int i = 0; i<5; i++)
             System.out.println(Laptops[i]);
    }
}

