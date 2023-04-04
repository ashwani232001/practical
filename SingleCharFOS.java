package IO;

import java.io.FileInputStream;

public class SingleCharFOS {
public static void main(String[] args) {
	try {
		FileInputStream f = new FileInputStream("D:\\man.txt");
		int i =f.read();{
			System.out.println((char)i);
		}
		f.close();
	} catch (Exception e) {
		System.out.println(e);
	}
}
}
