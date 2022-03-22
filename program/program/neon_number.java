// neon number

package program;
import java.util.*;
public class neon_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number. ");
        int n= sc.nextInt();
        int r;
        int sum=0;
        int sq=n*n;
        for(; sq>0; sq=sq/10){
            r=sq%10;
            sum=(sum*10)+r;
        }
        if(sum == n){
            System.out.println("Is Neon number");
        }
        else{
            System.out.println("Not a Neon number");
        }
    }
}
