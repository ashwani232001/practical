package ExceptionHandling;

public class TypesOfUncheckExce {
    public void display(){
        try{
        String a = "i am error";
        System.out.println(a);

//        int m = 50/0;                         //Arithmetic Exception
//        System.out.println(m);

        String s = "null";                       //null pointer Exception
        System.out.println(s.length());

        int arr[] = new int[3];                     //ArrayIndexOutOfBounds Exception
        arr[7] = 15;

        String s1 = "riya";                        //number format Exception
        int n = Integer.parseInt(s1);
        System.out.println(n);
        }
        catch (Exception e){
            System.out.println(e);

            //after Try and catch block
            String b = "The End";
            System.out.println(b);
        }
    }

    public static void main(String[] args) {
        TypesOfUncheckExce obj = new TypesOfUncheckExce();
        obj.display();
    }

}
