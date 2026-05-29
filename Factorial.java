import java.util.*;
public class Factorial {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int fact = sc.nextInt();

        int count =1;
        for(int i=1;i<=fact;i++){
            count = count *i;
           
        }
         System.out.println(count);
    }
}
