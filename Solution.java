public class Solution{
    public static void main(String args[]){
int target =9;
int arr[]={1,5,4,2,3};
int sum=0;
for(int i=0;i<arr.length;i++){
    for(int j=i+1;j<arr.length;j++){
        sum = arr[i]+arr[j];
        if(sum==target){
            System.out.println(i+"," +j);
        }
 }    
}
}
}