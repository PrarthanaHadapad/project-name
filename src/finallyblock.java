public class finallyblock {
    public static void main(String args[]){
        try{
            int dividebyzero=5/0;
        }
        catch(ArithmeticException e){
            System.out.println("ArithmeticException=>" + e.getMessage());

        }
        finally{
            System.out.println("This is the finally block");
        }
    }
}
