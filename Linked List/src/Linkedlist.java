import java.util.*;

public class Linkedlist {


    public static void main(String args[]) {

        /* Linked List Declaration */
        LinkedList<String> linkedlist = new LinkedList<String>();

        /*add(String Element) is used for adding
         * the elements to the linked list*/
        linkedlist.add("Yusuf");
        linkedlist.add("Emre");
        linkedlist.add("Kerim");
        linkedlist.add("Ahmet");
        linkedlist.add("Mehmet");

        /*Display Linked List Content*/
        System.out.println("Linked List Content: " +linkedlist);

        /*Add First and Last Element*/
        linkedlist.addFirst("add mee , i wanna first ! ");
        linkedlist.addLast("add me , but i want to last !");
        System.out.println("LinkedList Content after addition: " +linkedlist);

        /*This is how to get and set Values*/
        Object firstvar = linkedlist.get(0);
        System.out.println("First element: " +firstvar);
        linkedlist.set(0, "Changed first item");
        Object firstvar2 = linkedlist.get(0);
        System.out.println("First element after update by set method: " +firstvar2);

        /*Remove first and last element*/
        linkedlist.removeFirst();
        linkedlist.removeLast();
        System.out.println("LinkedList after deletion of first and last element: " +linkedlist);

        /* Add to a Position and remove from a position*/
        linkedlist.add(0, "add to 0. place");
        linkedlist.remove(2);
        System.out.println("Final Content: " +linkedlist);
    }
}

