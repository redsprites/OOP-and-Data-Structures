import java.io.FileInputStream;
import java.io.IOException;
import java.io.RandomAccessFile;

public class randomaccessfiletest {
    public static void main(String[] args) {
        String filename = "test.txt";
        try(RandomAccessFile raf = new RandomAccessFile(filename, "rw")) {
            raf.setLength(0);
            raf.writeBytes("Yoseph Shibiru");
            System.out.println(raf.getFilePointer());
            raf.seek(6);
//            reads 4 byte into a byte array
            byte[] input = new byte[4];
            raf.read(input);
            for (byte b : input){
                System.out.println(b);
            }
            raf.seek(2);
            raf.writeBytes("cky");
        }
        catch (IOException e){
            System.out.println("cant open");
        }
    }
}
