package ExceptionHandling;

public class FinallyBlock {
    public static void main(String[] args) {
        try {
            int a = 10/2;
            System.out.println(a);
        }
        catch (Exception e){
            System.out.println(e);
        }
        try {
            int a = 10/0;
            System.out.println(a);
        }
        catch (NullPointerException e){
            System.out.println(e);
        }
        finally {
            System.out.println("always finally block will execute  ");
        }
    }
}
