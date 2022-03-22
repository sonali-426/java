/* Write a Java program that accepts three numbers and prints "All numbers are equal" if all 
three numbers are equal, "All numbers are different" if all three numbers are different and 
"Neither all are equal or different" otherwise.*/

package Conditional_Statements;
import java.util.*;
public class ques30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a no.");
        int a = sc.nextInt();
        System.out.println("enter 2nd no.");
        int b= sc.nextInt();
        System.out.println("enter 3rd no.");
        int c= sc.nextInt();
        if(a==b && a==c){
            System.out.println("no.s are equal");
        }
        else if(a==b || b==c || c==a){
            System.out.println("neither all equal nor different");
        }
        else{
            System.out.println("all are different");
        }
    }
}
