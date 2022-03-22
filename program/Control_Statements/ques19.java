/* Write a program in Java to make such a pattern like a pyramid with a number 
which will repeat the number in the same row. Go to the editor

       1
      2 2
     3 3 3
    4 4 4 4 
    */ 


package Control_Statements;
import java.util.*;
public class ques19 {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("enter a no.");
      int n = sc.nextInt();
      int x = n+4-1;   // to find no. of  columns 
      for (int i = 1; i <=n; i++) {   // for rows
        for (int s = x; s !=0; s--) {  //for space
            System.out.print(" ");
        }
          for (int j = 1; j <=i; j++) {   //for column
              System.out.print( i + " ");
              
          }
          System.out.println("");
          x--;
        }  
    }
   
}
