public class ObjectEg {

        //Instance variable
        int id;
        String name;
    }
    class Object{                  // main class
        public static void main(String[] args) {
            ObjectEg obj=new ObjectEg();   //create object -- obj is our ref variable
            obj.id=72;
            obj.name="Ashwani";
            System.out.println(obj.id+" "+obj.name); // printing members with a white space
        }
    }
