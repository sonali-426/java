//Keith Number

package program;
import java.util.*;
public class keith_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number. ");
        int n= sc.nextInt();
        int r;
        int sum=0;
        for(; n>0; n=n/10){
            r=n%10;
            sum=(sum*10)+r;
        }  
    }    
}
