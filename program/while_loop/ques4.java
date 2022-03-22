/* Write a program in Java to input 5 numbers from keyboard and find 
    their sum and average.*/
    
    
package while_loop;
import java.util.*;
public class ques4 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter 5 no.s:  ");
           // int a =sc.nextInt();
            int avg = 0;
            int sum =0;
            int i=1;
            while(i<=5){
                int a =sc.nextInt();
                sum += a;
                i++;
           }
           avg = sum/5;
           System.out.println("average = " + avg);
           System.out.println("sum " + sum);
        }
        
    }
    



    
