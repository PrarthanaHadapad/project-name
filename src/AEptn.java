public class AEptn {
    public static void main(String args[]) {
        try {
            int a = 30, b = 0;
            int c = a / b;
            System.out.println("Result=" + c);
        } catch (ArithmeticException e) {
            System.out.println("can't Divide a number by 0" + e.getMessage());
        }
    }
}