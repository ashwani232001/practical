import java.util.Scanner;

public class Verify {
    public static void main(String[] args) {
        String usid = "ashwani01";
        String pass = "02March2001";

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the username : ");
        String uname = sc.next();
        System.out.println("Enter the password : ");
        String password = sc.next();
        if (uname.equals(usid) && pass.equals(password)){
            System.out.println("welcome!");
        }
        else {
            System.out.println("wrong username and password");
        }
    }
}
