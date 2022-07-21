package arrays.onedarray;

public class MovesZeroes {

    public static void moveZeroes(int[] nums){
        int current = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[current] = nums[i];
                current++;
                System.out.println(nums[i]);
            }
        }

        for (int i = current; i < nums.length; i++) {
            nums[i] = 0;
        }
    }

    public static void main(String[] args) {
        int[] array = {0,1,0,3,12};
        moveZeroes(array);
    }
}
