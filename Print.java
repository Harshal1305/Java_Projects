import java.util.Scanner;

public class Print {
    public static void main(String[] args){

        //Printing star patterns
        System.out.println("*");
        System.out.println("**");
        System.out.println("***");
        System.out.println("****");

        System.out.println("*\n**");

        //Taking two integer inputs and printing their sum
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();  
        int b = sc.nextInt();
        int sum = a + b;    
        System.out.println(sum);
    }
}
