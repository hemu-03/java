import java.util.*;
class MinMax{
    public static void main(String args[]){
        int sum=0;
        int arr[]={1,2,4,6,7,9};
        Arrays.sort(arr);

        for(int i=0;i<arr.length-1;i++){
            sum=sum+arr[i];
System.out.println(sum);
        }
        

    }
}
