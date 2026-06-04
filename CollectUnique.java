
import java.util.*;

public class CollectUnique {
    public static void main(String[] args) {
        Set <Integer> s=new HashSet<>();
        int arr []={1,2,3,11,2,3};
        int count =0;
        int count1=0; 
        for(int i=0;i<arr.length;i++){
          if(s.contains(arr[i])){
            System.out.println(arr[i]);
            count++;
          }
          s.add(arr[i]);
          count1++;
            }
            System.out.println(count);
        }
        
    }
