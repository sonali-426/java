/* Write a Java program that takes the user to provide a single character from the alphabet. 
Print Vowel or Consonant, depending on the user input. If the user input is 
not a letter (between a and z or A and Z), or is a string of length > 1,
 print an error message.*/

package Conditional_Statements;
import java.util.*;
public class ques8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a character:");
        // char a= sc.next().charAt(0);  //to save null character therefore 0.
        String ch= sc.next().toLowerCase();
        //boolean uppercase = ch.charAt(0) >= 65 && ch.charAt(0)<=90;
        //boolean lowercase = ch.charAt(0) >= 97 && ch.charAt(0)<=122;
        boolean vowels = ch.equals("a") || ch.equals("e") || ch.equals("i") || ch.equals("o")
                            || ch.equals("u");
        if(ch.length() >1){
            System.out.println("error");
        }    
        else if(vowels){
            System.out.println("input letter is vowel");
        }                
        else{
            System.out.println("input letter is consonant");
        }
    }
}
