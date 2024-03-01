import java.io.*;

public class FileWrite {
    public static void main(String[] args) throws IOException {

       // try {
            //String filePath = "C:\\Users\\vinayak\\Desktop\\vinayak.txt";
            File f = new File("C:\\Users\\vinayak\\Desktop\\vinayak.txt");
            try(FileWriter fw = new FileWriter(f)) {
                fw.write("Vinay is my name.");
            } catch(Exception e) {
                System.out.println(e);
            }
            
            /*  finally {
                fw.close();
            } */
      /*   } catch (Exception e) {
            //System.out.println(e);
            e.printStackTrace();
        } */
        

        
    }
}