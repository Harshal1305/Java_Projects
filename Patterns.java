import java.util.Scanner;

public class Patterns {
    public static void main(String[] args) {
        //Printing a solid rectangle pattern
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        //int col = sc.nextInt();
        /* 
        for (int i=1; i<=row; i++){
            for (int j=1; j<=col; j++){
                System.out.print("* ");
            }
            System.out.println("\n");
        } */
        
        //Printing a hollow rectangle pattern
        /* for(int i=1; i<=row; i++){
            for(int j=1; j<=col; j++){
                if(i==1 || i==row || j==1 || j==col){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
                
            }
            System.out.println();
        }*/ 
        
        /* //Printing half pyramid pattern
        for(int i=1; i<=row; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");    
            }
            System.out.println();
        }  */ 

        /* //Printing half pyramid pattern inverted
        for(int i=row; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print("*");    
            }
            System.out.println();
        } */ 

        /* //Printing inverted half pyramid
        for(int i=1; i<=row; i++){
            for(int j=1; j<=(row-i); j++){
                System.out.print(" ");               
            }
            for(int k=1; k<=i; k++){
                System.out.print("*");
            }
             
        System.out.println();
        } */

        /* //Printing numbers in half pyramid
        for(int i=1; i<=row; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        } */

        /* //Printing numbers in half pyramid inverted
        for(int i=1; i<=row; i++){
            for(int j=1; j<=(row-i+1); j++){
                System.out.print(j);
            }
            System.out.println();
        } */

        /* //Printing Floyd's triangle
        int num =1;
        for(int i=1; i<=row; i++){
            for(int j=1; j<=i;j++){
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        } */

        /* //Printing 0-1 triangle
        for(int i=1; i<=row; i++){
            for(int j=1; j<=i; j++){
                if((i+j)%2==0){
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        } */

        /* //Printing solid rhombus
        for(int i=1; i<=row; i++){
            for(int j=1; j<=(row-i); j++){
                System.out.print(" ");
            }
            for(int k=1; k<=row; k++){
                System.out.print("*");
            }
            System.out.println();
        } */

        /* //Printing number pyramid
        for(int i=1; i<=row; i++){
            for(int j=(row/2); j>=i; j--){
                System.out.print(" ");
            }
            for(int k=1; k<=i; k++){
                System.out.print(i);
            }
            System.out.println();
        } */

        /* //Printing palindromic number pyramid
        for(int i=1; i<=row; i++){
            for(int j=1; j<=(row-i); j++){
                System.out.print(" ");
            }
            for(int k=i; k<=i; k++){
                System.out.print(k);
            }
            for(int l=(i-1); l>=1; l--){
                System.out.print(l);
            }
            for(int m=1;m<i; m++){
                System.out.print(m+1);
            }
            System.out.println();
        } */
        
     }
}
