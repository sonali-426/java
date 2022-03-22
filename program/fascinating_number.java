//Fascinating number

import java.util.*;
public class fascinating_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int n2= n*2;
        int n3= n*3;
        // System.out.println(n+n2+n3); 
        String a=Integer.toString(n); // to convert integer value to string value
        String b=Integer.toString(n2);
        String c=Integer.toString(n3);
        String d=a+b+c;  // for adding string values
        //  System.out.println(d);
        boolean result = true;
        for (char i= '1'; i <='9'; i++) {
            int count =0; // 
            for(int j=0;j<d.length();j++){  //to check index
                char ch=d.charAt(j);  //to read string value as per index.
                if(ch==i){
                    count++;
                }
            }
            if(count!=1){
                result=false;
                break;
            }
        }
        if(result){
            System.out.println("Fascinating number");
        }
        else{
            System.out.println("Not a fascinating number");
        }
    }
}
