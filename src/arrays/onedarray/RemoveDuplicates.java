package arrays.onedarray;

import java.util.LinkedList;

public class RemoveDuplicates {
    public static int remove_duplicates(int[] nums) {
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

    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[i] != nums[j]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i+1;
    }

    public static void main(String[] args) {
        int[] nums = {0, 0,1,1,1,2,2,3,3,4};
        int new_len = removeDuplicates(nums);
        for (int i = 0; i < new_len; i++) {
            System.out.println(nums[i]);
        }
    }
	/*
	Example:
		nums =  [0,0,1,1,1,2,2,3,3,4]
		output: [0,1,2,3,4,2,2,3,3,4]
		new_len: 5
	*/
}
