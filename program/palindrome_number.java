// palindrome number

import java.util.*;
public class palindrome_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        int a, pal=0,temp;
        temp=n;
        for(; n>0; n=n/10){
            a=n%10;
            pal=(pal*10)+a;
        }
        if(temp==pal){
            System.out.println("Is a palindrome");
        }
        else{
            System.out.println("Not a palindrome");
        }
    }
    
}
