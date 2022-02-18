// Write a Java program to find the number of days in a month. 

package Conditional_Statements;
import java.util.*;
public class ques7 {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter month");
        int a=sc.nextInt();
        System.out.println("enter year");
        int b = sc.nextInt();

      if(a==1){
            System.out.println("31 days");  
        }
        else if(a==3){
            System.out.println(" 31 days");
        }
        else if(a==5){
            System.out.println(" 31 days");
      
        }
        else if(a==7){
            System.out.println(" 31 days");
        }
        else if(a==8){
            System.out.println(" 31 days");  
        }
        else if(a==10){
            System.out.println(" 31 days"); 
        }
        else if(a==12){
            System.out.println(" 31 days");  
        }
        else if(a==4){
            System.out.println(" 30days");   
        }
        else if(a==6){
            System.out.println(" 30days");   
        }
        else if(a==9){
            System.out.println(" 30days"); 
        }
        else if(a==11){
            System.out.println(" 30days");  
        }
        else if(a==2){
            if(((b%4==0) && (b%100!=0))||(b%400==0)){
                System.out.println("29 days");

            }
            else {
                System.out.println("28 days"); 
            }
            

            
        }
    }    

                 
}
