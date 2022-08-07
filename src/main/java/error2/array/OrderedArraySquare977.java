package error2.array;

import static java.lang.Math.abs;

public class OrderedArraySquare977 {
    public static int[] sortedSquares(int[] nums) {
        int len = nums.length;
        int[] ans = new int[len];
        int low = 0, high = len - 1;
        for (int i = len - 1; i >= 0; i--) {
            if (nums[low] * nums[low] > nums[high] * nums[high]) {
                ans[i] = nums[low] * nums[low];
                low++;
            } else {
                ans[i] = nums[high] * nums[high];
                high --;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{-4,-1,0,3,10};
        for (int i = 0; i < nums.length - 1; i++) {
            System.out.println(sortedSquares(nums)[i]);
        }

    }
}
