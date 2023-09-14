import java.util.Stack;

public class Stack1 {
    public static void main(String[] args) {
        
        Stack<Integer> s1 = new Stack<Integer>();
        s1.push(23);
        s1.push(49);
        s1.push(30);
        s1.push(45);
        System.out.println(s1);
        System.out.println(s1.pop()); // remove last element from stack - pop(); 
        System.out.println("after using pop method : ");
        System.out.println(s1);
        System.out.println("peek element of stack without removing element - peek() = " + s1.peek());
        System.out.println("after using peek method ");
        System.out.println(s1);
        System.out.println("stack is  empty : "+ s1.empty());
        s1.clear();
        // removing all element from stack using clear method:
        System.out.println("after using clear method : ");
        System.out.println("stack is empty : "+ s1.empty() + " : "+ s1);
    }
    
}
