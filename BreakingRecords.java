public class BreakingRecords {
    public static void main(String args[]){
        int max=10;
        int count =0;
        int arr[]={10,5,20,20,4,5,25,1};
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
                System.out.println(max);
                count++;
            }
        }
        System.out.println("the higher she scores " +count);
        int sum=0;
      for(int j=0;j<arr.length;j++){
        
        if(max>arr[j]){
            max=arr[j];
            System.out.println(max);
            sum++;
        }
        
      }
       System.out.println("the lower she scores is " +sum);
    }
}