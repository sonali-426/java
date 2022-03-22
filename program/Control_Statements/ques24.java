/* Write a java program to generate a following @'s triangle. Go to the editor

      @                                                  
     @@                                                  
    @@@                                                  
   @@@@                                                  
  @@@@@                                                  
 @@@@@@    */
 
 package Control_Statements;
import java.util.*;
public class ques24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a no.");
        int n = sc.nextInt();
        for (int i =0; i <n ; i++) {
           for (int s =n-i; s>0; s--) {
              System.out.print(" "); 
           }
           for (int j =0; j <=i; j++) {
               System.out.print("@");
           }
           System.out.println(" ");
        }
    }
    
}
