public class animal {
    protected String name;
    protected void display(){

    }
}
class Dog extends animal{
    public static void main(String args[]){
        Dog d=new Dog();
        d.name="Softwiz";
        d.display();
    }
}


