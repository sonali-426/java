//AtM machine

package program;
import java.util.*;
public class ATM {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("1. Money withdrawn");
        System.out.println("2. Check balance");
        System.out.println("3. Money deposit");
        System.out.println("4. Exit");
        System.out.println("Enter your choice");
        int n=sc.nextInt();
        int balance=8000000;
        switch(n){
            case 1:
            System.out.println("Enter amount to be withdrawn");
            int w=sc.nextInt();
            balance= balance-w;
            System.out.println("Remaining balance: "+balance);
            break;
            
            case 2:
            System.out.println("Your current balance is: "+balance);
            break;

            case 3:
            System.out.println("Enter amount to be deposited");
            int d=sc.nextInt();
            balance= balance +d;
            System.out.println("New amount: "+balance);
             break;

            case 4:
            System.exit(0);

        }   

    }
}
