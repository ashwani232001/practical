import java.sql.SQLException;
import java.util.Scanner;

public class Crudoperation {
	public static void main(String[] args) throws SQLException {
	MenuDrivenEg e = new MenuDrivenEg();
	Scanner s = new Scanner(System.in);
	int ch;
	do {
		System.out.println("1. INSERT\n 2.DISPLAY \n 3. UPDATE \n 4. DELETE \n 5. Exit");
		System.out.println(" Enter your choice from 1-5");
		ch= Integer.parseInt(s.next());
		System.out.println("-----------------");
		switch (ch) {
		case 1: 
			e.saveMenuDriven();
			break;
		case 2:
			e.fetchMenuDriven();
			break;
		case 3:
			e.updateMenuDriven();
			break;
		case 4:
			e.deleteMenuDriven();
			break;
		case 5:
			System.exit(0);
			break;
		}
	}while (ch!=5);
	}
}
