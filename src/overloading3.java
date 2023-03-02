public class overloading3 {
    public void disp(int num1, int num2, char a) {
        System.out.println("I'm the Definition of method disp " + num1 + " " + num2 + " " + a);
    }

    public void disp(char c, int var) {
        System.out.println("I'm the second definition of method disp " + c + " " + var);
    }
}
class test2{
    public static void main(String args[]){
        overloading3 obj=new overloading3();
        obj.disp(55,65,'e');
        obj.disp('d',75);
    }
}