import java.util.LinkedList;

public class Linklist {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<String>();
        ll.add("Anamika");
        ll.add("Sudiksha");
        ll.add("Sharmila");
        ll.add("Vidhi");
        ll.add("Jyoti");
        System.out.println("linked list: "+ll );

        ll.addLast("Shivani");
        System.out.println(ll);

        ll.removeFirst();
        System.out.println(ll);

        ll.removeLast();
        System.out.println(ll);

        System.out.println(ll.getFirst());

        System.out.println(ll.getLast());
    }
}
