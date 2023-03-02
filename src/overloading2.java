public class overloading2 {
    public void disp(char c){
        System.out.println(c);
    }
    public void disp(int num){
        System.out.println(num);
    }
}
class test1
{
    public static void main(String args[]){
        overloading2 obj=new overloading2();
        obj.disp('d');
        obj.disp(22);
    }
}



