class Animal3{
    public void Animalsound(){
        System.out.println("The Animal makes a sound");
    }
}
      class Pig extends Animal3{
    public void Animalsound(){
        System.out.println("Wee, Wee");
    }
      }
      class G extends Animal3{
    public void Animalsound(){
        System.out.println("Bow Bow");
    }
      }
public class Polymorphism {
    public static void main(String args[]){
        Animal3 MyAnimal=new Animal3();
        Animal3 MyPig=new Pig();
        Animal3 MyDog=new G();
        MyAnimal.Animalsound();
        MyPig.Animalsound();
        MyDog.Animalsound();



    }
}
