import java.util.HashSet;
import java.util.Iterator;

public class hashset {
    public static void main(String[] args) {
        
        HashSet<Integer> h1 = new HashSet<>();
        h1.add(46);
        h1.add(23);
        h1.add(98);
        h1.add(63);
        h1.add(99);
        System.out.println(h1);

        Iterator<Integer> itr = h1.iterator();
        while(itr.hasNext()){
          System.out.println(itr.next());
        }

    }
}
