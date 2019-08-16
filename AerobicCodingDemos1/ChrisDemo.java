import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class ChrisDemo {
    public static void main(String[] args) {
        File f = new File("Hello.data");
        FileOutputStream stream;
        try {
            f.createNewFile();
            stream = new FileOutputStream(f);
            stream.write("Hello".getBytes());
        }
        catch (IOException e) {
            System.out.println("Error creating file.");
        }
        catch (Exception e)  {
            System.out.println("File doesnt exist.");
        }
    }
}