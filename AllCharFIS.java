package IO;

import java.io.FileInputStream;

public class AllCharFIS {
public static void main(String[] args) {
	try {
		FileInputStream f = new FileInputStream("D:\\man.txt");
		int i =0;
		while ((i =f.read())!=-1) {
			System.out.print((char)i);
		}
		f.close();
	} catch (Exception e) {
		System.out.println(e);
	}
}
}
