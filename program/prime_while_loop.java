import java.util.*;
public class prime_while_loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a  no.");
        int n = sc.nextInt();
        int i=2;
        while(i<=n/2){
            if(n%i==0){
                 System.out.println("is not a prime no.");
                 break;
            }    
            i++;
        }
        System.out.println("prime no.");
    }
}
