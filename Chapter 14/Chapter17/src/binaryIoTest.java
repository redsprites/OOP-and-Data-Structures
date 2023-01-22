import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class binaryIoTest {
    public static void main(String[] args) {
        String fileName = "test.txt";
        try(FileOutputStream fos = new FileOutputStream(fileName)){
            for(int i =0;i<5; i++){
                fos.write(i);
            }
        }
        catch(IOException e){
            System.out.println("cant create file");
        }
        try(FileInputStream fis = new FileInputStream(fileName)) {
            int i;
            while ((i = fis.read()) != -1) ;
            {
                System.out.println("read: "+ i);
            }
        }
        catch(IOException e){
            System.out.println("cannot show file");
        }
    }
}
