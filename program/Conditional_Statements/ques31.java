/* Write a program that accepts three numbers from the user and prints "increasing" if 
the numbers are in increasing order, "decreasing" if the numbers are in decreasing order,
 and "Neither increasing or decreasing order" otherwise. */

package Conditional_Statements;
import java.util.*;
public class ques31 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 1st no. : ");
        double a =sc.nextDouble();
        System.out.println("enter 2nd no. : ");
        int b =sc.nextInt();
        int c= sc.nextInt();
        System.out.println("enter 3rd no.");
        if(a>b && b>c){
            System.out.println("decreasing order");
        }
        else if(a<b &&b<c){
            System.out.println("increasing order");
        }
        else{
            System.out.println("Neither increasing or decreasing order");
        }
    }
}
