package ExceptionHandling;

public class ExceptionEg {
    public void show() {

        String a = null;
        try {
            a = "i am error";
            System.out.println(a);

            int m = 50 / 0;
            System.out.println(m);

            String s = "Ashwani";
            System.out.println(s.length());
        } catch (Exception e) {
            System.out.println(e);

            String b = "i cannot be handle";
            System.out.println(a + " " + b);
        }
    }
    public static void main(String[] args) {
        ExceptionEg obj = new ExceptionEg();
        obj.show();
    }
}
