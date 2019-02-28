package sort;

import java.util.Arrays;

public class quickSort {
	
	public int partition(int[] nums, int left, int right) {
		// select pivot number as the last element
		int pivot = nums[right];
		int i = left-1;
		for (int j = left; j < right; j++ ) {
			if(nums[j]>=pivot) {
				i++;
				int temp = nums[i];
				nums[i] = nums[j];
				nums[j] = temp;
			}
		}
		
		int temp = nums[i+1];
		nums[i+1] = nums[right];
		nums[right] = temp;
		
		return i+1;
	}
	
	public void sort(int[]nums, int left, int right) {
		if (left < right) {
			int idx = partition(nums, left, right);
			sort(nums, left, idx-1);
			sort(nums, idx+1, right);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		quickSort qs = new quickSort();
		int[] arry;
		
		arry = new int[]{5,9,4,6,5,3};
		
		qs.sort(arry, 0, 5);
		System.out.println(Arrays.toString(arry));
				

	}

}
