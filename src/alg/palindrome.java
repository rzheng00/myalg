package alg;

//import java.util.*;

public class palindrome {

	public static void main(String[] args) {
		
		for (String input: args) {
			String origStr = input;
			StringBuilder sb = new StringBuilder(origStr);
			
			sb.reverse();
			
			if (origStr.equals(sb.toString())) {
				System.out.println("Find palindrome, " + origStr);
			}else {
				System.out.println("Original String: " + origStr + " vs Reverse String:" + sb.toString());
			};
		}
	}

}
