import java.util.*;
/**
 * arrayList
 */
public class arrayList {

    public static void main(String[] args) {
        
     ArrayList<Integer> arr = new ArrayList<>();
     // adding element in arraylist:
     arr.add(10);
     arr.add(20);
     arr.add(30);
     arr.add(40);
     arr.add(2, 35); // adding element at spacific index.
     System.out.println(arr);// printing list.
     System.out.println(arr.get(2)); // fatching value present at 2nd index witout removing:
     arr.trimToSize(); // fix the size to no. of element present in list:
     System.out.println(arr.indexOf(40)); // return the index of  element. 
     arr.remove(2); // removing element present at 2nd index.
     System.out.println(arr); 
     arr.clear(); // remove all element present in list.
     System.out.println(arr);

        
    }
}