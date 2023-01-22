import java.io.*;

public class studentTest {
    public static void main(String[] args) {
        String filename = "test.txt";
        try(ObjectOutput oos = new ObjectOutputStream(new FileOutputStream(filename))){
            Student s1 = new Student("Yoseph",4.5);
            Student s2 = new Student("mema",3.5);
            oos.writeObject(s1);
            oos.writeObject(s2);
        }
        catch (IOException e) {
            System.out.println("cant create");
        }
            try(ObjectInput ois = new ObjectInputStream(new FileInputStream(filename))){
               Student [] students = new Student[2];
             for(int i = 0; i<2; i++){
                 students [i] = (Student) ois.readObject();
             }
                for (Student s: students ) {
                    System.out.println(s);
                }

            }
            catch (IOException | ClassNotFoundException e){
                System.out.println("cant create");

                }
        }
    }

class Student implements Serializable {
    String name;
    double cgpa;
    Student (String name, double cgpa){
        this.name = name;
        this.cgpa = cgpa;

    }
    @Override
    public String toString(){
        return "name" + this.name + "cgpa" +this.cgpa;
    }
}