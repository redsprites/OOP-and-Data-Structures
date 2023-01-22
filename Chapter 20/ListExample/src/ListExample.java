import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class ListExample {
    public static void main(String[] args) {
        House h1 = new House(100, 1456, "Cincinnati");
        House h2 = new House(75, 2345, "Independence");
        House h3 = new House(254, 1754, "Mason");

        Queue<House> houseQueue = new LinkedList<>();
        houseQueue.offer(h1);
        houseQueue.offer(h2);
        houseQueue.offer(h3);
        for (int i= 0; i<3; i++)
            System.out.println(houseQueue.poll());
        PriorityQueue<House> housePriorityQueue = new PriorityQueue<>(3, new House.SqFtComparator());
        housePriorityQueue.offer(h1);
        housePriorityQueue.offer(h2);
        housePriorityQueue.offer(h3);
        for (int i= 0; i<3; i++)
            System.out.println(housePriorityQueue.poll());
    }

    static class House implements Comparable {
        int price;
        int SqFt;
        String area;

        public House(int p, int s, String a) {
            this.price = p;
            this.SqFt = s;
            this.area = a;
        }

        @Override
        public String toString() {
            return "Price: " + this.price + " Square Foot: " + this.SqFt + " Area: " + this.area;
        }

        @Override
        public int compareTo(Object o) {
            return Integer.compare(this.price, ((House) o).price);

        }
//        @Override
//        public int compareTo(Object o) {
//                       return this.price > ((House)o).price ? + 1 : this.price == ((House)o).price  ? 0: -1;
//        }


        static class SqFtComparator implements Comparator<House> {
            @Override
            public int compare(House o1, House o2) {
                return o1.SqFt > o2.SqFt ? +1 : o1.SqFt == o2.SqFt ? 0 : -1;
            }

            class SqFtComparator2 implements Comparator<House> {
                @Override
                public int compare(House o1, House o2) {
                    return Integer.compare(o1.SqFt, o2.SqFt);
                }
            }
        }
    }
}

