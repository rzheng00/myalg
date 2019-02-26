package sort;

import java.util.Arrays;

public class MoveZeroBack {
	public void sorting(int[] nums) {
//		System.out.println(Arrays.toString(nums));
		for (int i=nums.length-2; i>=0; i--) {
			if (nums[i] == 0) {
				for (int j=i; j<=nums.length-2; j++) {
					nums[j] = nums[j+1];
					nums[j+1] = 0;
				}
			}
		}
		
		System.out.println(Arrays.toString(nums));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MoveZeroBack mzb = new MoveZeroBack();
		mzb.sorting(new int[] {0,1,0,3,12});
		mzb.sorting(new int[] {0,0,0,0,12});
		mzb.sorting(new int[] {10,0,0,0,12});
		mzb.sorting(new int[] {12,0,0,0,0});
		mzb.sorting(new int[] {0,0,10,4,0});
		mzb.sorting(new int[] {0});
		mzb.sorting(new int[] {1});
		mzb.sorting(new int[] {10,0,0,0,-12});
		mzb.sorting(new int[] {10,10,0,11,12});

	}

}
