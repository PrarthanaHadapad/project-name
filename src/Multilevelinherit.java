class Animal1{
    void var(){
        System.out.println("Varieties of Animal by their colour ");
    }
}
class dog1 extends Animal1{
    void Dogcol1(){
        System.out.println("We have a white colour Dog ");
    }
}

class babydog extends dog1{
    void babydogcol(){
        System.out.println("We have a black colour dog");
    }
}

public class Multilevelinherit {
    public static void main(String args[]){
        babydog c=new babydog();
        c.var();
        c.Dogcol1();
        c.babydogcol();


    }
}
