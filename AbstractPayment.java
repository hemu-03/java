interface payment{
 void makepayment();
}
class phonepe implements  payment{
    public void makepayment(){
        System.out.println("phonepe");
    }
}
class googlepay implements  payment{
  public   void makepayment(){
        System.out.println("googlepay");
    }
}
class paytm implements  payment{
   public  void makepayment(){
        System.out.println("payment");
    }
}
public class AbstractPayment {
    public static void main(String[] args) {
        payment py = new phonepe();
        payment gp=new googlepay();
        payment pt=new paytm();
    
        py.makepayment();
        gp.makepayment();
        pt.makepayment();
    }
}
