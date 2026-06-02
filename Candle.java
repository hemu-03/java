import java.util.*;
class Candle{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();

        int arr[]=new int[n];
        List<Integer> arrList=new ArrayList<>();

        for(int i=0;i<n;i++)
        {
            arrList.add(sc.nextInt());
        }
        int max=arrList.get(0);
        for(int i=0;i<n;i++)
            {
            if(max<arrList.get(i)){
                max=arr[i];
                
            }
        } 
        int count =0;
        for(int j=0;j<n;j++){
            if(arrList.get(j)==max){
                count ++;
            }
        }
        
System.out.println(count);     
}
   
}