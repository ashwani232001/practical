package IO;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class BufferedIS {
public static void main(String[] args) {
	try {
		FileInputStream f = new FileInputStream("D:\\man.txt");
		BufferedInputStream b = new BufferedInputStream(f);
		int i =0;
		while ((i=b.read())!=-1){
			System.out.print((char)i);
		}
		f.close();
		b.close();
	} catch (Exception e) {
		System.out.println(e);
	}
}
}
