//  Write a program in Java to display n terms of natural numbers and their sum.

package Control_Statements;
import java.util.*;
public class ques11 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("enter a number: ");
        int n = sc.nextInt();
        int sum =0 ;
        for (int i = 1; i<=n; i++) {
            System.out.println("natural no.s are:  " +i);
            sum += i;
        }   
        
        System.out.println("sum: " +sum);

    }
    
}
