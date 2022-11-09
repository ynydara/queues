import java.util.LinkedList;
import java.util.Stack;
import java.util.Stack;
public class Main {
    public static void main(String[] args) {
//390 need to implement from scratch without linked list, but with arrays
        // priority queue/ diff line for different things/ there's a reg line, but a line for something specific/ and element can cut in line
        //double ended queue  -can go both ways, can add to the back and to the front of the queue
        Stack<String> stack = new Stack<>();
        System.out.println(stack);
        stack.push("1st");
        stack.push("2nd");
        stack.push("3rd");
        stack.push("4th");
        System.out.println(stack);
        String s = stack.pop();
        System.out.println(s);
        System.out.println(stack);

        stack.push("4th");
        System.out.println(stack);

        s=stack.peek(); //only look at but not remove
        System.out.println(s);
        System.out.println(stack);



     /* LinkedList<String> queue= new LinkedList<>();


        System.out.println(queue.remove()); //throws exception

*/
     /*LinkedList<String> queue = new LinkedList<>();



       queue.add("First");
        queue.add("Second");
        queue.add("Third");
        queue.add("4th");

        System.out.println(queue);

       String s =  queue.remove(); //gets rid of the fist element; throws and exception if list is empty
        System.out.println(s);
        System.out.println(queue);

       s= queue.poll(); //gets rid of the first element or null if not
        System.out.println(s);
        System.out.println(queue);

        s= queue.peek(); //looks at the first element
        System.out.println(s);
        System.out.println(queue);

        queue.add("aaaaa");
        System.out.println(queue); // adds to the back of the line/ the next element*/
    }
}
