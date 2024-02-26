import java.util.Arrays;
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

        //sorting
        Arrays.sort(arr);

        System.out.print("Sorted elements: ");
        for (int i : arr) {
            System.out.print(i + " ");
        } System.out.println();

        //array searching
        int ele = 3; 
        System.out.print("Find the index of folling element" + ele);

        int index = Arrays.binarySearch(arr, ele);
        System.out.println("Index of following element is: " + index); 

        input.close();
    }

}