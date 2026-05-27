import java.util.*;
public class arreven {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n=sc.nextInt();

        int arr[]=new int[n];
        int sum=0;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        if(arr[i]%2==0){
            sum =sum+arr[i];
           
        }
  
        }
        System.out.println("the total even is :"+sum);
       
       
    }
}
