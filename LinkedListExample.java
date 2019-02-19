import java.util.*;
public class LinkedListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //linked list declaration
		LinkedList<String> linkedlist = new LinkedList<String>();
		linkedlist.add("item1");
		linkedlist.add("item5");
		linkedlist.add("item3");
		linkedlist.add("item6");
		linkedlist.add("item2");
		
		System.out.println("linked list content: " +linkedlist);
		linkedlist.offer("item100");  //add element at the end
		
		linkedlist.addFirst("first item");
		linkedlist.addLast("last item");
		System.out.println("linked list content after addition: " +linkedlist);
		
		Object firstvar = linkedlist.get(0);
		System.out.println("first element: " +firstvar);
		linkedlist.set(0, "changed first item");
		Object firstvar2 = linkedlist.get(0);
		System.out.println("first element after update by set method: " +firstvar2);
		
		//remove first and last element
		linkedlist.removeFirst();
		linkedlist.removeLast();
		System.out.println("linkedlist after deletion of first and last element: " +linkedlist);
		linkedlist.add(0,"newly added item");
		linkedlist.remove(2);
		System.out.println("final content: " +linkedlist);
	}

	
}
