// armstrong number

import java.util.*;
public class armstrong_number {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a no.");
        int n =sc.nextInt();
        int a , temp,arm=0;
        
        for( ;n!=0;n/=10 ){  //  because of no starting point.
            a=n%10;
            arm= arm+(a*a*a);
        }
        if(arm == n){
            System.out.println("Is Armstrong number");
        }
        else{
            System.out.println("Not an Armstrong number");
        }
    }
}
