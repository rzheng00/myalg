package alg;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicate {
	
	// unsorted array 
	public int removeDuplicates2(int[] nums) {
		
		Set<Integer> hs = new HashSet<Integer>();
		
		for (int i=0; i<nums.length;i++) {
			hs.add(Integer.valueOf(nums[i]));
		}
		System.out.println(hs.toString());
		return hs.size();
	}
	// Leetcode
	public int removeDuplicates(int[] nums) {
	    if (nums.length == 0) return 0;
	    int i = 0;
	    for (int j = 1; j < nums.length; j++) {
	        if (nums[j] != nums[i]) {
	            i++;
	            nums[i] = nums[j];
	        }
	    }
	    return i + 1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RemoveDuplicate rd = new RemoveDuplicate();
		System.out.println(rd.removeDuplicates2(new int[] {}));
		System.out.println(rd.removeDuplicates(new int[] {1,1,2}));
		System.out.println(rd.removeDuplicates(new int[] {1,3,1,4,1,2}));

	}

}
