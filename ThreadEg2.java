package thread;

public class ThreadEg2 {
    public void run(){
        System.out.println("jai");
    }

    public static void main(String[] args) {
        ThreadEg2 n =new ThreadEg2();
        Thread t = new Thread("Ashwani");
        Thread t1 = new Thread();
        t.start();
        t1.start();
        t1.setName("Ankit");
        String s = t1.getName();
        System.out.println(t.getName());
        System.out.println(s);
        n.run();
    }
}
