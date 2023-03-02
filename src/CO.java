public class CO {
    String name;
    int rollno;
    int age;

    void info() {
        System.out.println("name " + name);
        System.out.println("rollno " + rollno);
        System.out.println("age " + age);

    }

    public static void main(String args[]) {
        CO CO = new CO();

        CO.name = "Ramesh";
        CO.rollno = 52;
        CO.age = 54;

        CO.info();


    }
}