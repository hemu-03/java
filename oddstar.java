import java.util.*;
class oddstar{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=n;i>0;i--){
        //SPACE
        for(int j=1;j<=n-i;j++){
            System.out.print(" ");
            }
            //STAR
        for(int j=1;j<=i*2-1;j++){
            System.out.print("*");
        }
        System.out.println();
        }
    }
        
    }
