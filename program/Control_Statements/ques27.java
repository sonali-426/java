/* Write a Java program that reads an integer and check whether it is negative, zero, or positive
*/

package Control_Statements;
import java.util.*;
public class ques27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a no.");
        int n = sc.nextInt();
        if(n==0){
            System.out.println("no. is zero");
        }
        else if (n>0){
            System.out.println("no. is positive");
        }
        else{
            System.out.println("no. is negative");
        }
    }
    
}
