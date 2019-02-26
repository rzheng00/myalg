package alg;

public class longest_substring {
	
	public String longestSub(String org) {
		char[] orgString = org.toCharArray();
		String sub = "";
		int maxSubStart = 0;
		int maxSubEnd = 0;
		int maxCount = 1;
		for (int i=0; i<org.length()-2; i++) {
			char currentChar = orgString[i];
			int count = 0;
			for (int j =i+1; j< org.length()-1;j++) {
				if (currentChar !=  orgString[j]) {
					count++; 
				} else {
					break;
				}
			}
			
			if (count>maxCount) {
				maxCount = count;
				maxSubStart = i;
			}
		}
		
		return org.substring(maxSubStart, maxSubStart+maxCount);
	}
	
	public static void main(String[]args) {
		longest_substring ls = new longest_substring();
		System.out.println(ls.longestSub("abcabcbb"));
		System.out.println(ls.longestSub("abcabcdbb"));
		System.out.println(ls.longestSub("bbbbb"));
	}

}
