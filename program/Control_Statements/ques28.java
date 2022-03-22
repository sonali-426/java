/*  Write a Java program that reads a floating-point number.
 If the number is zero it prints "zero", otherwise, print "positive" or "negative". 
 Add "small" if the absolute value of the number is less than 1, or "large"
  if it exceeds 1,000,000.   */

package Control_Statements;
import java.util.*;
public class ques28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a floating point no.");
        double n = sc.nextDouble();
        if(n==0){
            System.out.println("Number is zero");
        }
        else if(n>0){
            System.out.println("Number is positive");
            if(Math.abs(n)>1000000){
                System.out.println("Large Positive");
        
            }
            else{
                System.out.println("Small Positive");
            }
        }
        else{
            System.out.println("Number is negative");
            if(Math.abs(n)<1000000){
                System.out.println("Small negative");
            }
            else{
                System.out.println("Large negative");
            }
        }
    }
}           