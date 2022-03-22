// Peterson's number

package while_loop;
import java.util.*;
public class Peterson_number {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number");
        int n= sc.nextInt();
        int  fac=1, temp=n, sum=0, r;
        for(; n>0; n=n/10){
            fac=1;
            r=n%10;
            
        for(int i=r;i>0;i--){
            fac=fac*i;
            
        }
        sum= sum+fac;     
       } 
        if(sum==temp){
            System.out.println("It is a Peterson's number");
        }
        else{
            System.out.println("Not a Peterson's number");
        }
    
    }
}