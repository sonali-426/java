/*Write a Java program that reads a floating-point number and prints "zero" if the number is zero.
 Otherwise, print "positive" or "negative". Add "small"
  if the absolute value of the number is less than 1, or "large" if it exceeds 1,000,000.*/

package Conditional_Statements;

import java.util.*;

public class ques4 {

    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a floating point no. :  ");
        float a =sc.nextFloat();
        if(a==0){
            System.out.println("zero");
        }
        else if (a>0){
        
            
                if(Math.abs(a)<1){
                    System.out.println("small positive"); 
                }
                else if(Math.abs(a)>1000000){
                    System.out.println("large positive");
                }
                else{
                    System.out.println(" positive");
                }
            }
            else {
                
                if(Math.abs(a)<1){
                    System.out.println("small negative");
                }
                else if(Math.abs(a)>1000000){
                    System.out.println("large negative");
                }
                else{
                    System.out.println("negative");
                }
            }
        
    }

    
}
