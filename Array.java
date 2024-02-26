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

        //2D Array
        System.out.println("Index of following element is: " + index);  
        System.out.println("Enter row and coln for 2D array: ");
        int row = input.nextInt();
        int col = input.nextInt();

        int arr2[][] = new int[row][col];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr2[i][j] = input.nextInt();
            }
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr2[i][j] + "  ");
            } System.out.println();
        }System.out.println();

        input.close();
    }
}