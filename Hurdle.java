import java.util.*;
class Hurdle{
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();

        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
       Arrays.sort(arr);
       int tem;
            if(arr[arr.length-1]>k){
               tem =arr[arr.length-1]-k;
               System.out.println(tem);

            }else if((arr.length-1)<k){
                tem=0;
                System.out.println(tem);
            }

        
               
            }

        }