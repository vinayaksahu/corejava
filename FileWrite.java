import java.io.*;

public class FileWrite {
    public static void main(String[] args) {

        try {
            File f = new File("C:\\Users\\vinayak\\Desktop\\vinayak.txt");
            try(FileWriter fw = new FileWriter(f)) {
                fw.write("Hello my name is Vinay.");
            }/*  finally {
                fw.close();
            } */
        } catch (Exception e) {
            //System.out.println(e);
            e.printStackTrace();
        }
        

        
    }
}