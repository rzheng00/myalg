package sort;

import java.util.Arrays;

public class IntArraySort {
	
	public int[] descending(int[] nums) {
		for(int i=0; i<=nums.length-2;i++) {
			for(int j=i+1;j<=nums.length-1;j++) {
				if (nums[i] < nums[j]) {
					int temp = nums[j];
					nums[j] = nums[i];
					nums[i] = temp;
				}
			}
		}		
		return nums;
	}
	
	public int[] ascending(int[] nums) {
		for(int i=0; i<=nums.length-2;i++) {
			for(int j=i+1;j<=nums.length-1;j++) {
				if (nums[i] > nums[j]) {
					int temp = nums[j];
					nums[j] = nums[i];
					nums[i] = temp;
				}
			}
		}		
		return nums;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IntArraySort ias = new IntArraySort();
		
		System.out.println(Arrays.toString(ias.descending(new int[] {2,3,5})));
		System.out.println(Arrays.toString(ias.descending(new int[] {10,8,5})));
		System.out.println(Arrays.toString(ias.descending(new int[] {2,5,3})));
		System.out.println(Arrays.toString(ias.descending(new int[] {5,2,3})));
		System.out.println(Arrays.toString(ias.descending(new int[] {5,2,2,3})));
		System.out.println(Arrays.toString(ias.descending(new int[] {5,2,3,4})));
		System.out.println(Arrays.toString(ias.descending(new int[] {5,2,4,3})));
		System.out.println(Arrays.toString(ias.descending(new int[] {10,8,5,4})));
		System.out.println(Arrays.toString(ias.descending(new int[] {10,8,4,5})));
		
		System.out.println(Arrays.toString(ias.ascending(new int[] {2,3,5})));
		System.out.println(Arrays.toString(ias.ascending(new int[] {10,8,5})));
		System.out.println(Arrays.toString(ias.ascending(new int[] {2,5,3})));
		System.out.println(Arrays.toString(ias.ascending(new int[] {5,2,3})));
		
		System.out.println(Arrays.toString(ias.ascending(new int[] {5,2,2,3})));
		System.out.println(Arrays.toString(ias.ascending(new int[] {2,2,5,3})));
		
		System.out.println(Arrays.toString(ias.ascending(new int[] {5,2,2,3})));
		System.out.println(Arrays.toString(ias.descending(new int[] {2,2,5,3})));
		System.out.println(Arrays.toString(ias.ascending(new int[] {64, 34, 25, 12, 10, 22, 11, 90})));
		System.out.println(Arrays.toString(ias.descending(new int[] {64, 34, 25, 12, 10, 22, 11, 90})));

	}

}
