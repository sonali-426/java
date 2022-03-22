/* Write a Java program that accepts two floating­point numbers and checks whether they 
are the same up to two decimal places.
*/

package Conditional_Statements;
import java.util.*;
public class ques32 {

public class ques6 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 1st no. : ");
        double a =sc.nextDouble();
        System.out.println("enter 2nd no. : ");
        double b =sc.nextDouble();

        a = Math.round(a * 1000);
        a = a/1000;
        b = Math.round(b*1000); // to get the the round off the decimal provided in the argument of round().
        b = b/1000;

        if(a==b){
            System.out.println("no. is same");
        
        }
        else{
            System.out.println("no. is different");
        }
    }
}
}


