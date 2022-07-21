package arrays.twodarray;

public class Traverse2DArray {
    public static void traverse(int[][] nums) {
        int rows = nums.length;
        int cols = nums[0].length;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.println(nums[i][j]);
            }
        }
    } // TC: O(row*col)

    public static void main(String[] args) {
        int[][] nums = {{1,2}, {3,4}, {5,6}};
        traverse(nums);
    }
}
