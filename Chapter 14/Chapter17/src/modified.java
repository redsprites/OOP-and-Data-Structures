import java.io.*;

public class modified {
    public static void main(String[] args) {
        String fileName = "test.txt";
        try(DataOutputStream dos = new DataOutputStream(new FileOutputStream(fileName))){
            dos.writeDouble(10.45);
            dos.writeBoolean(true);
        }
        catch (IOException ex){
            System.out.println("cant create");
        }
        try(DataInputStream dis = new DataInputStream(new FileInputStream(fileName))){
            double d = dis.readDouble();
            System.out.println(d);
            boolean b = dis.readBoolean();
            System.out.println(b);
        }
        catch (IOException ex){
            System.out.println("cant create");
        }

    }
}

