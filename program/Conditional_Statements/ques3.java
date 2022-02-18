// Take three numbers from the user and print the greatest number. 

package Conditional_Statements;

import java.util.Scanner;

public class ques3 {
    private static Scanner sc;
    public static void main(String args[]){
        sc = new Scanner(System.in);
        System.out.println("enter first no.   ");
        int a = sc.nextInt();
       
        System.out.println("enter second no.  ");
        int b = sc.nextInt();
        
        System.out.println("enter third no. ");
        int c= sc.nextInt();
        if(a>b){
            if(a>c){
                System.out.println(a + " is greater");
            }
            else{
                System.out.println(c + " is greater");
            }
        }
        else if(b>c){
            System.out.println(b + "is greater");
        }
        else{
            System.out.println("c is greater");
        }
    }
    
}


    
