import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Linkedlist {
    public static void main(String[] args) {
        
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(10);       // 10
        ll.add(20);       // 10 -> 20
        ll.addFirst(00);  // 00 -> 10 -> 20;
        ll.addLast(30);   // 00 -> 10 -> 20 -> 30;
        ll.offer(25);     // 00 -> 10 -> 20 -> 30 -> 25:

        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(50);
        arr.add(60);
        arr.add(70);

        ll.addAll(arr);

        int top_ele = ll.peek();
        System.out.println("top element = " + top_ele); // top element of LinkedList -> first element:
        System.out.println(ll);
        System.out.println("top element removed using pop method =  "+ ll.pop()); // removing top element (first ele):
        System.out.println(ll);
        System.out.println( "is list is empty : "+ ll.isEmpty()); // check list is empty or not!
        Iterator<Integer> itr = ll.iterator();
        
        System.out.println();
        System.out.println("iterating element of list using iterator object : ");
        while (itr.hasNext()) {
            System.out.print(itr.next() + " -> ");
        }
        System.out.println();
        ll.clear(); // removing all element from list 
        
        System.out.println("After using clear method on list ");
        System.out.println(ll);

    }
}
