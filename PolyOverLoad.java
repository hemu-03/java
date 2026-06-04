import java.util.*;
class Add{
    public int add(int a, int b){
        return a+b;
    }
    public int add(int a,int b,int c){
        return a+b+c;
    }
}


public class PolyOverLoad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();

        Add ad=new Add();
        int aa=ad.add(a, b);
        int aad=ad.add(a, b, c);
        System.out.println(ad.add(a,b));
        //rendu onnu tha (ad.add(a,b))...ithuvum kudukulam (OR) aa/ aa
        System.out.println(aa);
    }
}
