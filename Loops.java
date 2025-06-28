import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        //Printing the sum of first n natural numbers
        Scanner sc = new Scanner(System.in);
        /* int n = sc.nextInt();
        int sum = 0;
        for(int i=0; i<=n; i++){
            sum = sum+i;
        }
        System.out.println(sum);
        sc.close(); */

        //Printing the table of a number using for loop
        /* for (int i =1; i<=10; i++){
            System.out.println(n*i);
        } */

        //Printing the even numbers till n using loop
        /* for(int i=1; i<=n; i++){
            if(i%2==0){
                System.out.println(i);
            }
        } */

        //Loops lecture problem set question no 3
        int a = sc.nextInt();
        if(a==1){
            int x = sc.nextInt();
            if(x >= 90)System.out.println("This is Good");
            else if(x >= 60 && x <= 89)System.out.println("This is also good");
            else System.out.println("This is good as well");
        }
        else if (a==0){
            System.out.println("Since a is 0 we are coming out of the program");
        }
    }
}
