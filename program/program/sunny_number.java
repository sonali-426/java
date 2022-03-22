// Sunny number 

package program;
import java.util.*;
public class sunny_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a no.");
        int n =sc.nextInt();
        int a=n+1;
        double b=Math.sqrt(a);
        if(b-Math.floor(b)==0){  //ti convert decimal number to the lowest integer.
            System.out.println("It a Sunny number");
        }else{
            System.out.println("Not a Sunny number");
        }
    }
}
