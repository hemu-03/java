import java.util.*;
public class BrainAnna {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
    int dish=sc.nextInt();
    int count =0;
    int arr[]=new int[n];
    for (int i = 0; i < arr.length; i++) {
        arr[i]=sc.nextInt();
    }
   //excess amt
   int amt=sc.nextInt();

//count the dish
   
    for(int i=0;i<n;i++){
        if(dish!=i){
            count = count + arr[i];
        }
    }

System.out.println(count); 


}

}   


