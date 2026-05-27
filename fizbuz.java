import java.util.*;
public class fizbuz {
public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the element");
    int n = sc.nextInt();
    for(int i =1; i<=n;i++){
        
        if(i%3==0 && i%5==0){
            System.out.println("fixxbuzz");
        }else if(i%3==0){
            System.out.println("fiz");
        }else if(i%5==0){
            System.out.println("buzz");
        }else{
            System.out.println(i);
        }
    }
}
}
