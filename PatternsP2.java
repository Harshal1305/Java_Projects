import java.util.Scanner;

public class PatternsP2 {

    public static void main(String[] args) {
        
        //Printing butterfly pattern
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        /* for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            int spaces = 2 * (n-i);
            for(int k=1; k<=spaces; k++){
                System.out.print(" ");
            }
            for(int m=1; m<=i; m++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int p=n; p>=1; p--){
            for(int q=1; q<=p; q++){
                System.out.print("*");
            }
            int spaces = 2 * (n-p);
            for(int r=1; r<=spaces; r++){
                System.out.print(" ");
            }   
            for(int s=1; s<=p; s++){
                System.out.print("*");
            }
            System.out.println();
        } */ 

        /* //Printing diamond pattern
        for(int i=1; i<=n; i++){
            for(int j=1; j<=(n-i); j++){
                System.out.print(" ");
            }
            for(int k=1;k<=(2*i-1);k++){
                System.out.print("*");
            }
            System.out.println();
        } */

        /* //Printing hollow butterfly pattern
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                if(j==1 || j==i){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }   
            }
            int spaces = 2 * (n-i);
            for(int k=1; k<=spaces; k++){
                System.out.print(" ");
            }
            for(int m=1; m<=i; m++){
                if(m==1 || m==i){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }    
            }
            System.out.println();
        }
        for(int p=n; p>=1; p--){
            for(int q=1; q<=p; q++){
                if(q==1 || q==p){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            int spaces = 2 * (n-p);
            for(int r=1; r<=spaces; r++){
                System.out.print(" ");
            }   
            for(int s=1; s<=p; s++){
                if(s==1 || s==p){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        } */

        /* //Printing hollow rhombus pattern
        for( int i=1;i<=n;i++){
            for(int j=1; j<=(n-i); j++){
                System.out.print(" ");
            }
            for(int k=1; k<=n; k++){
                if(k==1 || k==n || i==1 || i==n){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        } */
    }
}