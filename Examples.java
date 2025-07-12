import java.util.Scanner;

public class Examples {
    
    public static void main(String[] args) {
        
        //Taking numbers from user and printing count of negative numbers, zeros and positive numbers
        Scanner sc = new Scanner(System.in);
        /* int n = sc.nextInt();
        int negativeCount = 0;
        int zeroCount = 0;
        int positiveCount = 0;
        for(int i=0; i<n; i++){
            int num = sc.nextInt();
            if(num < 0){
                negativeCount++;
            } else if(num == 0){
                zeroCount++;
            } else {
                positiveCount++;
            }
        }
        System.out.println("Negative numbers: " + negativeCount);
        System.out.println("Zeroes: " + zeroCount);
        System.out.println("Positive numbers: " + positiveCount); */

       /*  //Writing a function to print power of a number
        int x = sc.nextInt();
        int n = sc.nextInt();
        int result = calPower(x, n);
        System.out.println("Power of " + x + " raised to " + n + " is: " + result); */
    }
    
    /* public static int calPower(int x, int n){
        if(n == 0) {
            return 1;
        }
        for(int i=n; i>1; i--){
            x = x*x;
        }
        return x;
    } */
}
