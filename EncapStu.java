class detail{
    private String name;
    private int age;
    private int salary;

    public void setdata(String name,int age,int salary){
        this.name=name;
        this.age=age;
        this.salary=salary;
    }
    public String getdata1(){
        return name;
   }
    public int getdata2(){
      return age;
    }
    public int getdata3(){
        return salary;
    }
}
public class EncapStu {

    public static void main(String[] args) {
    detail de = new detail();
    de.setdata("hem",23,78888);
    System.out.println(de.getdata1()+"\n"+de.getdata2()+"\n"+de.getdata3());
}    
}
