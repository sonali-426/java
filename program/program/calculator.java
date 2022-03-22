// calculator 

package program;
import java.util.*;
public class calculator {
    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);

    
    System.out.println("Enter first number");
    double n1 = sc.nextDouble();
    
    System.out.println("Enter second number");
    double n2 = sc.nextDouble();
    System.out.println("Enter the operator +,-,*,/");
    char op=sc.next().charAt(0);
    double result;
    switch (op) {

      
      case '+':
        result = n1 + n2;
        System.out.println(n1 + " + " + n2 + " = " + result);
        break;

      case '-':
        result = n1 - n2;
        System.out.println(n1 + " - " + n2 + " = " + result);
        break;

      
      case '*':
        result = n1 * n2;
        System.out.println(n1 + " * " + n2 + " = " + result);
        break;

      
      case '/':
        result = n1 / n2;
        System.out.println(n1 + " / " + n2 + " = " + result);
        break;
    }
}
}