class animal{
public void sound(){
    System.out.println("dog makes sound");
}
}
class Dog extends animal{
    public void sound(){
        System.out.println("animal makes sound");
    }
}
public class PolyOverRide {
    public static void main(String[] args) {
        animal an = new Dog();
        an.sound();
        

    }
}
