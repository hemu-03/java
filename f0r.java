import java.util.*;
public class f0r {
    public static void main(String args[]){
       /*  for(int i=0;i<=10;i++){
            if(i%2!=0){
                System.out.println(i);
            }
        } */
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no. of ele");
        int n = sc.nextInt();

        System.out.println("enter the element");
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int larg=arr[0];
        for(int i=0;i<n;i++){
            if(arr[0] < arr[i])
            larg=arr[i];

        }
        System.out.println(larg);
        }

}
