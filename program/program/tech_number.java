// Tech number
package program;
import java.util.*;
public class tech_number {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        int n1=n/100; // for starting 2 digits
        int n2=n%100;  //for last two digits
        int sum= n1+n2;
        int sq=sum*sum;
        if(sq==n){
            System.out.println("Tech number");
        }
        else{
            System.out.println("Not a tech number");
        }
    }
}
