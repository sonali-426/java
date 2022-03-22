// Factorial using while looop

import java.util.*;
public class factorial_while_number {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a no.");
        int n= sc.nextInt();
        int m=1;
        int i=n;
        while(i>0){
            m=m*i;
            
            i--;
        }
        
        System.out.println("Factorial is : "+m);
    }
}
