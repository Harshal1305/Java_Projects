import java.util.Scanner;

public class VariableExample {
    public static void main(String[] args) {
        //Printing area of a circle
        double r;
        double area;
        double pi = 3.14;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        r = sc.nextDouble();
        area = pi * r * r;  
        System.out.println("Area of the circle: " + area);   
        
        //Printing table of a number
        System.out.print("Enter a number to print its table: ");
        int num = sc.nextInt(); 
        System.out.println("Table of " + num + ":");
        System.out.println(num + " * 1" + " = " + (num * 1));
        System.out.println(num + " * 2" + " = " + (num * 2));
        System.out.println(num + " * 3" + " = " + (num * 3));        
        System.out.println(num + " * 4" + " = " + (num * 4));
        System.out.println(num + " * 5" + " = " + (num * 5));
        System.out.println(num + " * 6" + " = " + (num * 6));
        System.out.println(num + " * 7" + " = " + (num * 7));
        System.out.println(num + " * 8" + " = " + (num * 8));
        System.out.println(num + " * 9" + " = " + (num * 9));
        System.out.println(num + " * 10" + " = " + (num * 10));
        sc.close();
    }
}