package thread;

class ThreadEg extends Thread {
    public void run(){
        System.out.println("i am thread ..... thread is running");
       
    }

    public static void main(String[] args) {
        ThreadEg t = new ThreadEg();
        t.start();
        t.setName("Ashwani");
        String s = t.getName();
        System.out.println(s);
    }

}
