import java.util.Scanner;

public class Arrays {
    
    public static void main(String[] args) {
        
        //Take array from user and search a number in the array and print index of the array where we got the number
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        /* int x = sc.nextInt();
        for(int j=0; j<n; j++){
            if(arr[j] ==x){
                System.out.println("Element found at index: "+ j);
            }
            else System.out.println("Element not found");
        } */

        /* //Finding the maximum and minimum element in an array
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int j=0; j<n; j++){
            if(arr[j]< min){
                min = arr[j];
            }
            if(arr[j]> max){
                max = arr[j];
            }
        }
        System.out.println("Minimum element in the array: " + min);
        System.out.println("Maximum element in the array: " + max); */

        //Taking an array as input and checking if it is sorted or not
        boolean isSorted = true;
        for(int j=0; j<n-1; j++){
            if(arr[j] > arr[j+1]){
                isSorted = false;
                break;
            }
        }
        if(isSorted) {
            System.out.println("Array is sorted");
        } else {
            System.out.println("Array is not sorted");
        }
        
        sc.close();
    }
}
