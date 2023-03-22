package ExceptionHandling;

public class NestedTry {
    public static void main(String[] args) {
        try{

            try {
                int m = 50 / 0;
                System.out.println(m);
            } catch (ArithmeticException e) {
                System.out.println(e);
            }

            try {
                int arr[] = new int[3];                     //ArrayIndexOutOfBounds Exception
                arr[7] = 15;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println(e);
            }
                System.out.println("both inner try done");
            }
            catch( Exception a){
                System.out.println("Done");
            }
        }

    }

