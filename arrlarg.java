import java.util.*;
public class arrlarg {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of element");
        int n=sc.nextInt();

        System.out.println("the numbers are :");
        int arr[]=new int[n];
        int larg=arr[0];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        
        for(int i=0;i<n;i++){
            if(larg<arr[i]){
                larg=arr[i];
            }
            
        }
        System.out.println("The largest number is :"+ larg);
    }
}
