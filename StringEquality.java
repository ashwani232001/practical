package String;

import java.util.Scanner;

public class StringEquality {
    public static void main(String[] args) {
        String str1,str2;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first string");
        str1 = sc.nextLine();
        System.out.println("enter second string");
        str2 = sc.nextLine();

        if (str1.equals(str2)){                          //compare original content of string
        //    if (str1==str2){                           //==compare reference of value
            System.out.println("Equal String");
        }
        else {
            System.out.println("Unequal String");
        }


        if (str1.compareTo(str2)>0){                      //compare Lexoicografically
            System.out.println("Equal String");
        }
        else {
            System.out.println("Unequal String");
        }
    }


}
