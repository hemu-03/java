import java.util.*;
public class testhospital {
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the BMI :" );
    float n=sc.nextFloat();

    if(n<18.5){
        System.out.println("the patient is underweight");
    }else if(n>18.5 && n<24.5 ){
        System.out.println("normal");
    }else if(n>25 && n<29.9){
        System.out.println("overweight");
    }else if(n>30){
        System.out.println("obese");
    }
    }
  

    }













