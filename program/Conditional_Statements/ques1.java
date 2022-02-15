//Write a Java program to get a number from the user and print whether it is positive or negative.

package Conditional_Statements;
import java.util.*;
public class ques1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number : ");
        int a = sc.nextInt();
        if(a<0){
            System.out.println("it is a negative");
        }
        else{
            System.out.println(" it is positive");
        }
        
        
    }
    
}
