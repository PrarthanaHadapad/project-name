public class pvt {
    public  String name;
    public void display(){
        System.out.println("Hello everyone" + name);
    }
}
class main{
    public static void main(String args[]){
       pvt e=new pvt();
       e.name="Softwix";
       e.display( );

    }
}