package sort;

import java.util.*;


public class CollectionSort {

	public static void main(String[] args) {
		List<String> list = Arrays.asList(args);
		Collections.sort(list);
		System.out.println("ascending order: " +list);
		Collections.reverse(list);
		System.out.println("descending order: " + list);
	}

}
