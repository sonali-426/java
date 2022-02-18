/* Write a Java program that keeps a number from the user and generates an integer between 1 and 7 and
 displays the name of the weekday. 

*/


package Conditional_Statements;
import java.util.*;
public class ques5 {
    //private static Scanner sc; 
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a no. between 1 & 7 : ");
        int a= sc.nextInt();
        sc.close();
        if(a==1){
            System.out.println("monday");
        }
        if(a==2){
            System.out.println("tuesday");
        }
        if(a==3){
            System.out.println("wednesday");
        }
        if(a==4){
            System.out.println("thursday");

        }
        if(a==5){
            System.out.println("friday");
        }
        if(a==6){
            System.out.println("saturday");
        }
        if(a==7){
            System.out.println("sunday");
        }

    }
    
}
