import java.util.Scanner;

public class ExceptionTryCatch {
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter divident number: ");
        int a = input.nextInt();
        System.out.print("\nEnter divisor number: ");
        int b = input.nextInt();

        try {
            int c = a / b;
            System.out.println("\nQuotient " + c);
        } //catch (Exception e) {
        catch (ArithmeticException e) {
            System.out.println(e + " not possible");
        }
        
        System.out.println("Main method ended");
        
        input.close();
    }
}