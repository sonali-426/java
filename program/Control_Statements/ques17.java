/*  Write a program in Java to make such a pattern like right angle triangle with a number which will repeat a number in a row.The pattern is as follows : Go to the editor

1
22
333
4444 */

package Control_Statements;
import java.util.*;
public class ques17 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enetr a no. ");
        int a = sc.nextInt();
        for (int i = 1; i<=a; i++) {
            for (int j = 1; j<=i ; j++) {
                System.out.print(i);
                
            }
            System.out.println("");
            
        }
    }
}
