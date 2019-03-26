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
		al.add("item3");
		ll.addAll(al);
		System.out.println("index of "+ al.indexOf("item2"));
		
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
	    
	    Collections.reverse(ll);
	    System.out.println("Linked List Content 5: " +ll);
	    
	    LinkedList<int[]> lla= new LinkedList<int[]>();
	    
	    lla.add(new int[] {1,2});
	    lla.add(new int[] {3,4});
	    System.out.println("Linked List Content 6: " +Arrays.deepToString(lla.toArray()));
	    
	    
	}

}