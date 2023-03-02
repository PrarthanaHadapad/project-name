interface ANIMA{
    void ANIMALsound();
    void sleep();
}
class Horse implements ANIMA {
    public void ANIMALsound(){
        System.out.println("The pig says Wee Wee");
    }

    public void sleep (){
        System.out.println("zzz");
    }}


public class JavaInterface {
    public static void main(String args[]){
        Horse Mypig=new Horse();
        Mypig.ANIMALsound();
        Mypig.sleep();
    }
}
