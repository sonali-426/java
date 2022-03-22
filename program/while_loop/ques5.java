////  Write a program in Java to display n terms of natural numbers and their sum.

package while_loop;
import java.util.*;
public class ques5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         System.out.println("enter a number: ");
         int n = sc.nextInt();
         int sum =0 ;
         int i=1;
         while (i<=n) {
             System.out.println("natural no.s are:  " +i);
             sum += i;
             i++;
            }   
         
         System.out.println("sum: " +sum);
 
     }
     

 
    
}
