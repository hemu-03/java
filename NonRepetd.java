import java.util.*;
public class NonRepetd {
    public static char nonrepet (String s1){
        for(int i=0;i<s1.length();i++){
int count =0;
for(int j=0;j<s1.length();j++){
    if(s1.charAt(i)==s1.charAt(j)){
        count ++;
    }
        }
        if(count==1){
            return s1.charAt(i);
        }
}
    }
}