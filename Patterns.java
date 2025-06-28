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


     }
}
