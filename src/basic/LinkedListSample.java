package basic;

import java.util.*;

public class LinkedListSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<String> ll = new LinkedList<String>();
		
		ArrayList<String> al = new ArrayList<String>(); 
		
		ll.add("ran");
		ll.add("zheng");
		
		al.add("item1");
		al.add("item2");
		ll.addAll(al);
		/*Display Linked List Content*/
	    System.out.println("Linked List Content: " +ll);
	    
	    // Add First and Last
	    ll.addFirst("FirstString");
	    ll.addLast("LastString");
	    System.out.println("Linked List Content 2: " +ll);
	    
	    // Get and Set
	    System.out.println("Get object by index : " + ll.get(3));
	    ll.set(4, ll.get(3).concat("Update"));
	    System.out.println("Set object by index : " + ll.get(4));
	    
	    //Add and Remove by index
	    ll.add(3, "addedByIdx");
	    System.out.println("Linked List Content 3: " +ll);
	    ll.remove(5);
	    System.out.println("Linked List Content 4: " +ll);
	    
	}

}