package String;

public class StringEx1 {
    public void show(){
    char[] ch = {'j','A','V','A'};
    String s = new String(ch);
        System.out.println(s);
    }
    public void MyFunction(){
        String s1 = "Ashwani";
        String s2 = new String(s1);
        System.out.println(s2);
    }

    public static void main(String[] args) {
        StringEx1 obj = new StringEx1();
        obj.show();
        obj.MyFunction();
    }
}
