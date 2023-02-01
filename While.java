import java.util.Scanner;

public class While_dowhile_test {
    public static void main(String[] args) {

        int sum = 0, number = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the number");

        while (true){
            number =sc.nextInt();
            if (number<0)break;
            sum+=number;
            System.out.println(sum);
        }
        sc.close();
        }}
