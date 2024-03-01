import java.util.Scanner;

public class ExceptionTryCatch {
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter divident number: ");
        int a = input.nextInt();
        System.out.print("\nEnter divisor number: ");
        int b = input.nextInt();

        int c = a / b;
        System.out.print("\nQuotient " + c);
        
        input.close();
    }
}
