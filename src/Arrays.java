import java.util.Scanner;
public class Arrays {
    public static void main(String args[]) {
        int age[] = {26, 12, 23, 54, 365};

        System.out.println("Accessing elementof 1st element " + age[0]);
        System.out.println("Accessing elementof 2nd element " + age[1]);
        System.out.println("Accessing elementof 3rd element " + age[2]);
        System.out.println("Accessing elementof 4th element " + age[3]);
        System.out.println("Accessing elementof 5th element " + age[4]);

        Scanner scan = new Scanner(System.in);

        int dur[] = new int[5];
        System.out.println("enter elements");
        for (int a = 0; a < 5; a++) {
            dur[a] = scan.nextInt();
        }
            System.out.println("entered elememts are: ");
            {
                for (int a = 0; a < 5; a++) ;
                System.out.println(dur);
            }


    }}