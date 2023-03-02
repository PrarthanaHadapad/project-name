import java.util.Scanner;
public class SwitchStatements {
    public static void main(String args[]){
        Scanner scan= new Scanner(System.in);
        char oper;
        double num1,num2,num3=0;
        System.out.println("enter two numbers ");
        num1=scan.nextDouble();
        num2=scan.nextDouble();
        System.out.println("Enter Operation");
        oper=scan.next().charAt(0);
        switch(oper){
            case'+':
                num3=num1+num2;
                System.out.println("The result of addition is " + num3);
                break;
            case'*':
                num3=num1*num2;
                System.out.println("The result of Multiplication is " + num3);
                break;
            case'-':
                num3=num1-num2;
                System.out.println("The result of subtraction is " + num3);
                break;
            case'/':
                num3=num1/num2;
                System.out.println("The result of Division is " + num3);

            default:
                System.out.println("wrong operation");
                break;

        }
        scan.close();

    }
}
