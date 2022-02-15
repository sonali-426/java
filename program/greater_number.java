public class greater_number {
    public static void main(String args[]){
        int a =4;
        int b= 5;
        int c= 10;
        if(a>b){
            if(a>c){
                System.out.println("a is greater");
            }
            else{
                System.out.println("c is greater");
            }
        }
        else if(b>c){
            System.out.println("b is greater");
        }
        else{
            System.out.println("c is greater");
        }
    }
    
}
