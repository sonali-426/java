/* Write a program in Java to input 5 numbers from keyboard and find 
their sum and average.*/


package Control_Statements;
import java.util.*;
public class ques12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 5 no.s:  ");
       // int a =sc.nextInt();
        int avg = 0;
        int sum =0;
        for (int i = 1; i<=5; i++) {
            int a =sc.nextInt();
            sum += a;
       }
       avg = sum/5;
       System.out.println("average = " + avg);
       System.out.println("sum " + sum);
    }
    
}
