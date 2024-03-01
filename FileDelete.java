import java.io.File;
public class FileDelete {
    public static void main(String[] args) {
        
        File f = new File("C:\\Users\\vinayak\\Desktop\\vinayak.pptx");

        if(f.delete())
            System.out.println("File deleted successfully.");
        else    
            System.out.println("File not found.");
    }
}