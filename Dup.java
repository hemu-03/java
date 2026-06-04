import java.util.*;
public class Dup {
 String getdata(){

     Set <Integer> s=new HashSet<>();
        int arr[]={1,2,3,1};
      for(int i=0;i<arr.length;i++){
        for(int j=0;i<arr.length;j++)
        {
            if(i!=j && arr[i]==arr[j]){
                return "true";
            }
            
            }
        }return "false";
}
    public static void main(String[] args) {
        Dup dp=new Dup();
        dp.getdata();
        String res=dp.getdata();
        System.out.println(res);
       
    }
}