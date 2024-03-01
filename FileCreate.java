import java.io.File;
import java.io.IOException;

public class FileCreate {
    public static void main(String[] args) throws IOException{
        
        File f = new File("C:\\Users\\vinayak\\Desktop\\vinayak.txt");
       // try{
            if(f.createNewFile())
                System.out.println("File created successfully");
            else 
                System.out.println("File already exits");
       /*  } catch(IOException e) {
            System.out.println("Exception Handled");
        }*/

    }
}
