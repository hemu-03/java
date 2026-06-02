public class StrPalindRom {

    void getdata(){

        String name = "madae";
        boolean ispalindrome = true;
        for(int i=0;i<name.length();i++){
         if (name.charAt(i) != name.charAt(name.length() - 1 - i)) {
                ispalindrome=false;
                break;
            }
        }if(ispalindrome){
            System.out.println("yes");

        }else{
            System.out.println("no");
        }
        
    }
    public static void main(String[] args) {
        StrPalindRom pr = new StrPalindRom();
        pr.getdata();
            
        }
    }


    /*        String n1="hem";
        String n2="hem";
        int count =0;

        for(int i=0;i<n1.length();i++){
            System.out.println(n1.charAt(i));
            
        }
        for(int i=0;i<n2.length();i++){
            System.out.println(n2.charAt(i));
            
        }
        if(n1.equals(n2)){
            System.out.println("true");
        }
    }
? */