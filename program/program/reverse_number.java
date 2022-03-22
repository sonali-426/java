//Wap to print reverse of a number. 


package program;
import java.util.*;
public class reverse_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number. ");
        int n= sc.nextInt();
        int r;
        int sum=0;    /*since we have to store data into this variable performing addition
         operation therefore 0.And for multiplication sum=1*/

        for(; n>0; n=n/10){
            r=n%10;
            sum=(sum*10)+r;

        }
        System.out.println("Reverse number : " +sum);
    }
}
