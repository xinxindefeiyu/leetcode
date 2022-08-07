package array.ArraySquare;

import static java.lang.Math.abs;

public class OrderedArraySquare977 {
    public int[] sortedSquares(int[] nums) {
        int len = nums.length;
        int max = len - 1, min = 0;
        int[] res = new int[len];
        for (int i = len - 1; i >= 0; i--) {
            if (abs(nums[max])< abs(nums[min])) {
                res[i] = nums[min] * nums[min];
                min++;
            } else {
                res[i] = nums[max] * nums[max];
                max--;
            }
        }
        return nums;

    }
}
