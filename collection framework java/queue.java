import java.util.*;
public class queue {
    public static void main(String[] args) {
        Queue<Integer> q = new ArrayDeque<>();
        q.add(30);
        q.add(45);
        q.add(22);
        q.add(67);
        // order of insertion is maintained;
        System.out.println(q);
        System.out.println(q.peek());
        q.remove();
        System.out.println(q);
        q.clear();;
        System.out.println(q);
    }
}
