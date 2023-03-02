class Animal2{
    void var1(){
        System.out.println("We have Varieties of Animals");
    }
    class anima extends Animal2{
    }

    public void ani() {
        System.out.println("black");
    }
}

class Babydog1 extends Animal2{
    void Babydogcol2(){
        System.out.println("White");
    }
}
public class HierarchyInherit {
    public static void main(String args[]){
        Babydog1 z=new Babydog1();
        z.var1();
        z.ani();
        z.Babydogcol2();
        
    }
}
