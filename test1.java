import java.util.*;
class test1{
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.println("\t\t\tENTER THE NUMBER");
        int n=sc.nextInt();

        int cap=12;
        System.out.println("\t\t\t--PACKING REPORT-- ");
        System.out.println("\t\t\tTOTAL BISCUITS : "+n);
        cap=n/12;
        System.out.println("\t\t\tBOX CAPACITY :  "+ cap);
        cap=n%12;
        System.out.println("\t\t\tBISCUIT LEFT : "+cap);
    }
    
}