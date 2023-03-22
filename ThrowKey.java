package ExceptionHandling;

public class ThrowKey {
    public static void  check(int marks){
        if (marks<60){
            throw new ArithmeticException("he is not eligible");
        }
        else {
            System.out.println("he is eligible");
        }
    }

    public static void main(String[] args) {
        check(58);
    }
}
