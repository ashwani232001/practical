package IO;


import java.io.FileOutputStream;

public class WriteByteFOS {
    public static void main(String[] args) {
        try {
            FileOutputStream f =new FileOutputStream("D:\\4119.txt");
            String s = "Welcome to Anudip Foundation";
            byte b[] = s.getBytes();
            f.write(b);
            f.close();
            System.out.println("Done");
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
