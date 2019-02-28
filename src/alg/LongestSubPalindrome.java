package alg;

public class LongestSubPalindrome {
	
	public String longestSubPalindrome(String orig) {
		char[] contents = orig.toCharArray();
		String subPalindrome = "";
		// read each char of the string from beginning to end
		for(int i = 0; i<contents.length;i++) {
			// Empty the StringBuilder for storing sub palindrome at the beginning of
			// each loop			
			String partI = "";
			// check the sequence of remains along with current char in the string
			for(int j=0; j<((contents.length-i)/2);j++) {
				// Build 1st part of sub pal string	
				partI = partI + String.valueOf(contents[i+j]);				
				
				StringBuilder reverse = new StringBuilder(partI);
				// Build 2nd part of palindrome string based on the length of current partI
				// Based on Type "[n][~n]"
				String partII_1 = "";				
				for(int k=1; k<=partI.length() && i+j+k < contents.length;k++) {
					partII_1 = partII_1 + contents[i+j+k];
				}
				// Based on Type "[n]?[~n]"
				String partII_2 = "";
				for (int l=1; l<=partI.length() && i+j+l+1 < contents.length;l++) {
					partII_2 = partII_2 + contents[i+j+1+l];
				}
				// Construct the sub pal string
				String tempSubPal = "";
				String reversePartI = reverse.reverse().toString();
				if (reversePartI.equals(partII_1)) {
					tempSubPal = partI + partII_1;
				} else if (reversePartI.equals(partII_2)) {
					tempSubPal = partI + String.valueOf(contents[i+j+1]) + partII_2;
				}
				// Set the subPal string if it is empty or current subPal is less than the new subPal
				if (subPalindrome.isEmpty() || subPalindrome.length()<= tempSubPal.length()) {
					subPalindrome = tempSubPal;
				}			
			}
		}
		
		return subPalindrome;
		
	}
	
	public static void main(String[] args) {
		LongestSubPalindrome lsp = new LongestSubPalindrome();
		System.out.println(lsp.longestSubPalindrome("abfba"));
		System.out.println(lsp.longestSubPalindrome("aeadaca"));
		System.out.println(lsp.longestSubPalindrome("eabbaf"));
		System.out.println(lsp.longestSubPalindrome("eabfbaf"));
		System.out.println(lsp.longestSubPalindrome("eabfgbaf"));
		System.out.println(lsp.longestSubPalindrome("eabfgbab"));
	}

}
