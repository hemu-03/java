class vechile{
    void start(){
    System.out.println("starting........");
    }
}
    class car extends vechile{
        void start(){
         System.out.println("Car moving");
        }
    }
    class bike extends vechile{
            void start(){
             System.out.println("vechile is going");
            }
          
        }
     class bus extends vechile{
            void start(){
            System.out.println("Bus is big");
            }
            
        }
public class VehicleOverRide {
    public static void main(String args[]){
        vechile vc = new vechile();
        vechile ca=new car();
        vechile bi=new bike();
        vechile bu=new bus();
        vc.start();
        ca.start();
        bi.start();
        bu.start();
    
    
    }
}
//@override
//abstract