import java.util.*;
public class prime_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a no. ");
        int n = sc.nextInt();

        for(int i=2; i<=n/2;i++){
            if(n%i==0){
                System.out.println("not a prime no.");
                break;
            }
            else{
                System.out.println("a prime no.");
                
            }
          
        } 

    }
}
