import java.util.*;
public class swt{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("1. addition \t 2.subtraction \t 3.red \t 4.green \t 5.yellow");
        int n=sc.nextInt();

        switch(n){
            case 1:
                System.out.println("you chose addition");
                System.out.println("enter A value");
                int a=sc.nextInt();
                System.out.println("enter B value");
                int b=sc.nextInt();
                int c=a+b;
                System.out.println(c);
                break;

                case 2:
                System.out.println("you chose subtraction");
                System.out.println("enter a value");
                int d=sc.nextInt();
                System.out.println("you chose addition");
                int e=sc.nextInt();
                System.out.println();
                int f=d-e;
                System.out.println(f);
                break;
                case 3:
                    System.out.println("STOP");
                    break;
                case 4:
                    System.out.println("GO");
                    break;
                case 5:
                    System.out.println("WAIT");
                break;
                default:
                System.out.println("INVALID");

        }
        }
}