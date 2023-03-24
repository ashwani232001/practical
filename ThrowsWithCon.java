package ExceptionHandling;

public class ThrowsWithCon {
    String name;
    int age;
    public ThrowsWithCon(String name, int age)throws Exception{
        if (age<18){
            throw new Exception("age should be more than 18");
        }
        this.age=age;
        this.name=name;
    }

    public static void main(String[] args)throws Exception {
        ThrowsWithCon ob = new ThrowsWithCon("Ashwani",22);
        System.out.println(ob.age+" "+ob.name);
    }
}
