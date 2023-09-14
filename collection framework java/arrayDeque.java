import java.util.*;
  
public class arrayDeque {
  
    public static void main(String args[])
    {
        ArrayDeque<Integer> ll = new ArrayDeque<>();
        // is act as a deque -- double ended queue;
  
        ll.add(10);
        ll.add(20);
        ll.addLast(30);
        ll.addFirst(00);
        ll.add(40);
        ll.addLast(50);
        System.out.println(ll);
        System.out.println("no. of element  = "+ ll.size());
        System.out.println("remove first element = " + ll.removeFirst());//remove first element ;
        System.out.println("remove element from front = "+ ll.remove()); // remove element from front;
        System.out.println("remove end element = "+ll.removeLast()); // remove end element;
        System.out.println(ll);
        ll.clear();// remove all element of list;
        System.out.println("after using clear method!");
        System.out.println(ll);
    }
}
