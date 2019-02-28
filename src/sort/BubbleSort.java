package sort;

import java.util.Arrays;

public class BubbleSort {
	
	public static int[] sortAsc(int[] nums) {
		
		for (int i=0; i<=nums.length-1; i++) {
			
			for (int j=0; j<=nums.length-2;j++) {
				if (nums[j]>nums[j+1]) {
					int num = nums[j];
					nums[j] = nums[j+1];
					nums[j+1] = num;
				}
			}
//			System.out.println("array: " + i + ", after: " + nums[i]+ " --"+ Arrays.toString(nums));
		}
		
		return nums;
	}
	
	public static int[] sortDesc(int[] nums) {
		
		for (int i=0; i<=nums.length-1; i++) {
			
			for (int j=0; j<=nums.length-2;j++) {
				if (nums[j]<nums[j+1]) {
					int num = nums[j];
					nums[j] = nums[j+1];
					nums[j+1] = num;
				}
			}
//			System.out.println("array: " + i + ", after: " + nums[i]+ " --"+ Arrays.toString(nums));
		}
		
		return nums;
	}

	public static void main(String[] args) {
		System.out.println(Arrays.toString(BubbleSort.sortAsc(new int[] {10, 12, 1, 100})));
		System.out.println(Arrays.toString(BubbleSort.sortAsc(new int[] {10, 12, 99, 100})));
		System.out.println(Arrays.toString(BubbleSort.sortAsc(new int[] {10, 102, 1, 100})));
		System.out.println(Arrays.toString(BubbleSort.sortAsc(new int[] {1000, 120, 110, 100})));
		System.out.println(Arrays.toString(BubbleSort.sortAsc(new int[] {10})));
		
		System.out.println(Arrays.toString(BubbleSort.sortDesc(new int[] {10, 12, 1, 100})));
		System.out.println(Arrays.toString(BubbleSort.sortDesc(new int[] {10, 12, 99, 100})));
		System.out.println(Arrays.toString(BubbleSort.sortDesc(new int[] {10, 102, 1, 100})));
		System.out.println(Arrays.toString(BubbleSort.sortDesc(new int[] {1000, 120, 110, 100})));
		System.out.println(Arrays.toString(BubbleSort.sortDesc(new int[] {10})));
	}
}
