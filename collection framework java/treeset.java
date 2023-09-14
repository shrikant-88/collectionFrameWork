import java.util.TreeSet;

public class treeset {
    
    public static void main(String[] args) {
        
         TreeSet<Integer> t = new TreeSet<>();
         t.add(50);
         t.add(56);
         t.add(39);
         t.add(32);
         // treeSet store data in sorted order - Treeset internally implement Binary search tree - Inorder traversal:
         System.out.println(t);
         System.out.println(t.pollFirst());
         System.out.println(t.pollLast());
         System.out.println(t);
    }
}
