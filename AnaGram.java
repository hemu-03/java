
import java.util.*;

public class AnaGram {
    public static boolean isanagram(String a1, String a2) {
        a1=a1.toLowerCase();
        a2=a2.toLowerCase();

        char c1[]=a1.toCharArray();
        char c2[]=a2.toCharArray();

        Arrays.sort(c1);
        Arrays.sort(c2);

        if(c1.length!=c2.length){
            return false;
        }
        for(int i=0;i<c1.length;i++){
            if(c1!=c2){
                return false;
            }
            return true;
        }











    }