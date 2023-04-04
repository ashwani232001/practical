




package IO;


import java.io.FileOutputStream;

public class WriteStringFOS {
    public static void main(String[] args) {
        try {
        	
            FileOutputStream f =new FileOutputStream("D:\\Test.txt");
            
           
            f.write(65);
            f.close();
            System.out.println("Created");
        }catch (Exception e){
            System.out.println(e);
        }
    }
}