// factorial number

import java.util.*;
public class factorial_number {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a no.");
        int n= sc.nextInt();
        int m=1;
        for(int i=n;i>0;i--){
            m=m*i;
         
        }
        System.out.println("Factorial is: " +m);
    }
}
