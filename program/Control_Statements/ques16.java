/*Write a program in Java to display the pattern like right angle triangle with a number.
1                                                                                
12                                                                               
123                                                                              
1234                                                                             
12345                                                                            
123456                                                                           
1234567                                                                          
12345678                                                                         
123456789                                                                        
12345678910 */

package Control_Statements;
import java.util.*;


public class ques16 {
    public static void main(String[] args) {
        
    
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a no.");
        int a= sc.nextInt();
        for(int i=1 ; i<=a; i++){
        
            for (int j=1; j<=i; j++) {
             System.out.print('*');            
            }
            System.out.println("");
        }
    }
}
