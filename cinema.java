import java.util.*;
public class cinema {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
       

        int limit=10;
        while(limit>0){
             System.out.println("enter the number of tickets");
        int ticket=sc.nextInt();
            if(ticket>6){
            System.out.println("seat not available");
            }else if(ticket<0){
                System.out.println("invalid");
            }else if(ticket <=6 && ticket <= limit){
                limit = limit-ticket;
                System.out.println("Sucessfully booked");
                System.out.println("remaining tickets " +limit);
               
            }
           
         
        }
         System.out.println("housefull");
            System.out.println("closed");

    }
    
}
