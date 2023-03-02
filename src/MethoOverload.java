public class MethoOverload {
    public void disp(char c, int num){
        System.out.println( "hello " + c +" " + num);
    }
    public void disp(int num2 , char d){
        System.out.println("Program " + num2 +" " + d);
    }
   }
   class test{
    public static void main(String args[]){
        MethoOverload obj= new MethoOverload();
        obj.disp('d',20);
        obj.disp(59,'a');
    }
   }

