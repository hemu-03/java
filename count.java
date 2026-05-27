import java.util.*;
public class count {
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
       System.out.println("enter the number");
       int num =sc.nextInt();
       int rev =0;
         for( ; num > 0; num = num / 10) {
        int rem = num%10;
        rev = rev * 10 + rem;
      /*
        int rev = 0;

        while(n > 0) {

            int rem = n % 10;
            rev = rev * 10 + rem;
            n = n / 10;
        }

      */

       }
System.out.println(rev);
       }
}