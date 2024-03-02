import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/* public class FileRead {
    public static void main(String[] args) {
        try {
            // Specify the file path
            String filePath = "C:\\Users\\vinayak\\Desktop\\vinayak.txt";

            // Create a File object
            File file = new File(filePath);

            // Check if the file exists
            if (!file.exists()) {
                System.out.println("File does not exist.");
                return;
            }

            // Create a FileReader and BufferedReader for efficient reading
            try (FileReader fr = new FileReader(file);
                 BufferedReader br = new BufferedReader(fr)) {

                // Read each line from the file
                String line;
                while ((line = br.readLine()) != null) {
                    System.out.println(line);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
 */

public class FileRead {
    public static void main(String[] args) throws IOException {
        //String pathname = "C:\\Users\\vinayak\\Desktop\\vinayak.txt";
        File f = new File("C:\\Users\\vinayak\\Desktop\\vinayak.txt");

        if (!f.exists()) {
            System.out.println("File does not exist.");
            return;
        }

        String line;

        try(FileReader fr = new FileReader(f);
        BufferedReader br = new BufferedReader(fr)) 
        {
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch(IOException e) {
            //System.out.println(e);
            e.printStackTrace();
        }
    }
}