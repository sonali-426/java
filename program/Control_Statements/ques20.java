/*  Write a program in Java to print the Floyd's Triangle. Go to the editor

Test Data
Input number of rows : 5
Expected Output :

Input number of rows :  5
1 
2 3 
4 5 6 
7 8 9 10 
11 12 13 14 15*/

package Control_Statements;
import java.util.*;
public class ques20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a no.");
        int a = sc.nextInt();
        int b =1;
        for (int i = 1; i <=a; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(b++ +" ");
    
            }
            System.out.println(" ");
        }
    }
    
}

    

