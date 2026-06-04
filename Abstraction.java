abstract class vechile{
    abstract void start();
    void display(){
        System.out.println("Staring ");
    }
 }
class car extends vechile{
    void start(){
        System.out.println("car going");
    }
}
public class Abstraction {
    public static void main(String args[]){
        vechile vc = new car();
        vc.display();
          vc.start();
    }
}
