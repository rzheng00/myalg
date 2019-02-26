package alg;

public class LongestPrefix {
	
	public String longestCommonPrefix2(String[] strs) {
		StringBuilder common = new StringBuilder();
		char[] sampleString = strs[0].toCharArray();
		
		for(int i=0; i< sampleString.length; i++) {
			boolean matched = false;
			for(int j=1; j<strs.length; j++) {
				char[] string4Check = strs[j].toCharArray();
				if (string4Check.length > i) {
					if (string4Check[i] == sampleString[i]) {
						matched=true;
					} else {
						matched=false;
						break;
					}
				}else {
					matched = false;
					break;
				}
			}
			
			if (matched) {
				common.append(sampleString[i]);
			} else {
				break;
			}
		}
		
		return (common.length()==0? "no common prefix": common.toString());
		
	}
	
	public String longestCommonSuffix(String[] strs) {
		StringBuilder common = new StringBuilder();
		char[] sampleString = strs[0].toCharArray();
		int idx =0;
		for(int i=sampleString.length-1; i>=0; i--) {
			boolean matched = false;
			idx++;
			for(int j=1; j<strs.length; j++) {
				char[] string4Check = strs[j].toCharArray();
				if (string4Check.length >= idx) {
					if (string4Check[string4Check.length-idx] == sampleString[i]) {
						matched=true;
					} else {
						matched=false;
						break;
					}
				}else {
					matched = false;
					break;
				}
			}
			
			if (matched) {
				common.append(sampleString[i]);
			} else {
				break;
			}
		}
		
		return (common.length()==0? "no common prefix": common.reverse().toString());
		
	}
	
	
	// leetcode 
	public String longestCommonPrefix(String[] strs) {
	    if (strs.length == 0) return "";
	    String prefix = strs[0];
	    for (int i = 1; i < strs.length; i++)
	        while (strs[i].indexOf(prefix) != 0) {
	            prefix = prefix.substring(0, prefix.length() - 1);
	            if (prefix.isEmpty()) return "";
	        }        
	    return prefix;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LongestPrefix lp = new LongestPrefix();
		System.out.println("adcd".indexOf("abc"));
		System.out.println(lp.longestCommonPrefix(new String[] {"abc", "adcd", "ab"}));
		System.out.println(lp.longestCommonPrefix(new String[] {"adbce", "adcd", "ad"}));
		System.out.println(lp.longestCommonPrefix(new String[] {"", "adcd", "ad"}));
		System.out.println(lp.longestCommonPrefix(new String[] {"adbce", "adcd", ""}));
		System.out.println(lp.longestCommonPrefix(new String[] {"adbce", "", "ad"}));
		System.out.println(lp.longestCommonPrefix(new String[] {" adbce", " adcd", " ad"}));
		
		System.out.println(lp.longestCommonSuffix(new String[] {"adbced", "bdcd", "ed"}));
		System.out.println(lp.longestCommonSuffix(new String[] {"acbcad", "adad", "ad"}));
		
	}

}
