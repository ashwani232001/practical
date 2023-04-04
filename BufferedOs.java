package IO;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class BufferedOs {
    public static void main(String[] args) {
        try {
            FileOutputStream f =new FileOutputStream("D:\\4119.txt");
            BufferedOutputStream b = new BufferedOutputStream(f);
            String s = "Welcome Ashwani";
            byte b1[] = s.getBytes();
            f.write(b1);
            f.flush();
            f.close();
            System.out.println("Done");
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
