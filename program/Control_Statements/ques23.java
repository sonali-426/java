/* 
Write a java program to generate a following *'s triangle. Go to the editor

******                                                   
 *****                                                   
  ****                                                   
   ***                                                   
    **                                                   
     *       */
package Control_Statements;
import java.util.*;
public class ques23{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a no.");
        int n= sc.nextInt();
        for (int i =n; i>=1; i--) { //for rows
            for (int s = n-i; s>=1; s--) { //for space
                System.out.print(" ");
            }
            for (int j=1; j <=i; j++) {  // for printing * sign & whenever we are starting a loop from a smaller no. , moving toward a bigger no. we do increment.
               System.out.print("*"); 
            }
            System.out.print("\n");
        }
    }
}
