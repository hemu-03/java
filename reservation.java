import java.util.*;
public class reservation {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int seat=100;
        for(int i=0;i<100;i++){
            System.out.println("enter the number of seats for booking :");
            int book=sc.nextInt();

            if(book<seat){
                seat=seat-book;
                System.out.println("booking sucessfully");
                System.out.println("remaining seats " +seat);
                System.out.println("you can book in the limit " +seat);

            
            }else{
            
                System.out.println("cant book");
                
        }
    }
    System.out.println("booking closed");
    }
}
