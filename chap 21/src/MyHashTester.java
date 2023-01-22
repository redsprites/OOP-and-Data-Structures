import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class MyHashTester {
    public static void main(String[] args) {
        Book b1 = new Book("How to be Awesome", "Rasib", 1233);
        Book b2 = new Book("How not to be Awesome", "Somebody", 234);
        Book b3 = new Book("Steps to future", "Anybody", 345);
        Book b4 = new Book("How not to be Awesome", "Somebody", 567);
        System.out.println(b1.hashCode());
        System.out.println(b2.hashCode());
        System.out.println(b3.hashCode());
        System.out.println(b4.hashCode());

        Set<Book> bookSet = new HashSet<>();
        bookSet.add(b1);
        bookSet.add(b2);
        bookSet.add(b3);
        bookSet.add(b4);
        for(Book b:bookSet){
            System.out.println(b);
        }

    }
}

class Book implements Comparable<Book>{
    String name;
    String author;
    int ISBN;
    Book(String name, String author, int ISBN){
        this.name = name;
        this.author = author;
        this.ISBN = ISBN;

    }
    @Override
    public String toString(){
        return this.name + " by  " + this.author + " ISBN: " +this.ISBN;
    }

    @Override
    public int compareTo(Book o) {
        if (this.ISBN < o.ISBN)
            return  -1;
        if (this.ISBN > o.ISBN)
            return  1;
        return  0;
    }
    @Override
    public int hashCode(){
        int hashcode = 0;
        for (int i = 0; i <this.name.length(); i++){
            hashcode += name.charAt(i);

        }
        return hashcode;
    }
    @Override
    public boolean equals(Object o){
        return this.hashCode() == o.hashCode();
    }

}
