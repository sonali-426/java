// Spy number

package program;
import java.util.*;
public class spy_number {
   public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter a number");
       int n= sc.nextInt();
       int sum =0, pr=1,r;
       for(; n>0; n=n/10){
        r=n%10;
        sum=sum+r;
        pr=pr*r;
       }
       if(sum==pr){
           System.out.println("Number is a Spy number");
       }
       else{
           System.out.println("Number is not a Spy number");
       }
    }
}
