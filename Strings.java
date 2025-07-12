import java.util.Scanner;

public class Strings {
    
    public static void main(String[] args) {
        
        //Take string input from user and replace letter 'e' with letter 'i' from the string and print new string
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String result = "";
        /* for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='e'){
                result += 'i';
            }else{
                result+= str.charAt(i);
            }
        } 
        System.out.println(result);
        sc.close();     */   

        //Take email input from user and provide name as output
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='@'){
                System.out.println(str.substring(0,i));
                break;
            }
        }
    }
}
