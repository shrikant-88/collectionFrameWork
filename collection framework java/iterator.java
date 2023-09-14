import java.util.*;
public class iterator {
    
   public static void main(String[] args) {
    
      ArrayList<Integer> arr = new ArrayList<>();
      arr.add(10);
      arr.add(1);
      arr.add(34);
      arr.add(45);
      arr.add(67);

      Iterator<Integer> i = arr.iterator();  // iterating using Iterator object:

      while(i.hasNext()){
        System.out.println(i.next());
      }

      System.out.println(arr);

      for (Integer ele  : arr) {   // iterating using for each loop :
          System.out.println(ele);
      }
      
      System.out.println(arr);

   }
}
