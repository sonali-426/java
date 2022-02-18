package Conditional_Statements;
import java.util.*;
public class switch_statement {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter month");
        int a=sc.nextInt();
        System.out.println("enter year");
        int b = sc.nextInt();

        switch(a){
            case 1:
            System.out.println("31 days");  
            break;
            case 3:
            System.out.println("31 days");  
            break;
            case 5:
            System.out.println("31 days");  
            break;
            case 7:
            System.out.println("31 days");  
            break;
            case 8:
            System.out.println("31 days");  
            break;
            case 10:
            System.out.println("31 days");  
            break;
            case 12:
            System.out.println("31 days");  
            break;
            case 4:
            System.out.println("30 days");  
            break;
            case 6:
            System.out.println("30 days");  
            break;
            case 9:
            System.out.println("30 days");  
            break;
            case 11:
            System.out.println("30 days");  
            break;
            case 2:
            if(((b%4==0) && (b%100!=0))||(b%400==0)){
                System.out.println("29 days");

            }
            else {
                System.out.println("28 days"); 
            }
            break;
            
            default:
            System.out.println("invalid month");
            break;
        }

    }
    
}
