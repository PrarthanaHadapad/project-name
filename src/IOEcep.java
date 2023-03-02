import java.util.Scanner;
public class IOEcep {
    public static void main(String args[]){
        Scanner scan=new Scanner("Hello Geek!");
        System.out.println( scan.nextLine());
        System.out.println("Exception output:" + scan.ioException());
        scan.close();

    }
}
