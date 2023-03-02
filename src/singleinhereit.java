class Animal{
    void var(){
        System.out.println("Varieties of Animal by their colour....");
    }
}

class Dg extends Animal{
    void Dgcol(){
        System.out.println("We have white colour dog.... ");
    }

}

public class singleinhereit {
    public static void main(String args[]){
        Dg d=new Dg();
            d.var();
            d.Dgcol();
        
    }
}
