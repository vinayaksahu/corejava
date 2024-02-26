import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the size of array: " );
        int n = input.nextInt();
        //int arr[] = {1,2,3,4,5,6,7,8,9,10};
        int[] arr = new int[n];
        System.out.print("Enter the array elements: ");
        
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        
        System.out.print("You entered follwing elements: ");
        for (int i : arr) {
            System.out.print(i + " ");
        } System.out.println();

        input.close();
    }
}