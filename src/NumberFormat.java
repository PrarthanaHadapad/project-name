public class NumberFormat {
    public static void main(String args[]){
        try{
            int num=Integer.parseInt("Tanvi");
            System.out.println(num);
        }
        catch(NumberFormatException e){
            System.out.println("Number format exception" + e);



        }
    }
}
