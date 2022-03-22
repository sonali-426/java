/* Write a program in Java to display the pattern like a diamond. Go to the editor

Test Data
Input number of rows (half of the diamond) : 7
Expected Output :

                                                                                 
      *                                                                          
     ***                                                                         
    *****                                                                        
   *******                                                                       
  *********                                                                      
 ***********                                                                     
*************                                                                    
 ***********                                                                     
  *********                                                                      
   *******                                                                       
    *****                                                                        
     ***                                                                         
      *      */


package Control_Statements;
import java.util.*;
public class ques21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter a no.");
        int n = sc.nextInt();
        
        for (int i = 0; i <=n; i++) { //since no space between stars in a row therefore starting from 0
            for (int s= 1; s<=n-i; s++) {  // for space
                System.out.print(" ");
            }
            for (int j =1; j<=2*i-1; j++) {  //for columns &printing * sign
                System.out.print("*");
            }
            System.out.print("\n");
        } 

        // reverse triangle

        for (int k = n-1; k >=1; k--) {
            for (int s =1 ; s <=n-k; s++) {  //for space
                System.out.print(" ");
            }
            for (int l =1; l <=2*k-1; l++) {  //for printing * 
               System.out.print("*");

            }
            System.out.print("\n");
        }
    }
}
