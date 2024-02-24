import java.util.Scanner;

public class UserInput {
    
    public static void main(String[] args) {
        
        System.out.println("Enter any number: ");

        Scanner input = new Scanner(System.in);

        System.out.println("You entered: " + input.nextInt());

        input.close();
    }
}
