// Automorphic Number 

package program;
import java.util.*;
public class automorphic_number {
    public static void main(String[] args) {
        Scanner sc =new Scanner (System.in);
        System.out.println("Enter a Number : ");
        int n = sc.nextInt();
        int a= n*n;
        for(; n>0; n=n/10){
            if(n%10!=a%10){
                System.out.println("Not an automorphic number.");
                System.exit(0); //
            }
        
            a=a/10;
            
        }
        
        System.out.println("Automorphic Number");
        
    }
}
