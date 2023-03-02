import java.util.Scanner;
public class IKnextLine {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the name: ");
        String UserName=scan.nextLine();
        System.out.println("Enter the name: " + UserName);
    }
}
