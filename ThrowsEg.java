package ExceptionHandling;

public class ThrowsEg {
    public static void mydisplay(int a) throws ArithmeticException{
        if (a < 35){
            throw new ArithmeticException("you are fail");
        }
        else {
            System.out.println("you are pass");
        }
    }

    public static void main(String[] args) {
        mydisplay(12);
    }
}
