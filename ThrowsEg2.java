package ExceptionHandling;

import java.io.IOException;

class Test{
    void display() throws IOException {
        throw new IOException("throws exception error");
    }

}public class ThrowsEg2 {
    public static void main(String[] args) throws IOException {
        ThrowsEg ob= new ThrowsEg();
        Test obj = new Test();
        obj.display();

    }
}
