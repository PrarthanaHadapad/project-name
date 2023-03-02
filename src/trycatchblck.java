public class trycatchblck {
    public static void main(String args[]){
        try {
            int dividebyzero=5/0;
            System.out.println("rest of the code in try catch block");
        }
        catch(ArithmeticException e){
            System.out.println("ArithmeticException=>" + e.getMessage());
        }
    }
}
