class InvalidAgeException extends Exception{
    InvalidAgeException(String s){
        super(s);

    }
}
public class user{
    static void validate(int age)throws InvalidAgeException{
        if(age<18)
            throw new InvalidAgeException("not valid");
        else
            System.out.println("Welcome to voting ");

    }
    public static void main(String args[]){
        try{
            validate(17);
        }
        catch(Exception m){
            System.out.println("Exception occured: " +m);
        }


    }

}
