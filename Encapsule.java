class bank{


 private double balance=0;
    public void  setbalance(int amt){
        balance = balance+amt;
    }
    public double getbalance(){
        return balance;
    }
    }
public class Encapsule {

    public static void main(String[] args) {
        bank acc = new bank();
        acc.setbalance(1000);
        System.out.println(acc.getbalance());

    }
}
