package array.Subarray;

public class LengthShortestSubarray209 {
    public static int minSubArrayLen(int target, int[] nums) {
        int len = nums.length;
        int left = 0, right = 0;
        int ans = Integer.MAX_VALUE;
        int sum = 0;
        for (right = 0; right < len; right++) {
            if (sum < target) {
                sum += nums[right];
            }
            while (sum >= target) {
                ans = Math.min(ans, right - left + 1);
                sum -= nums[left++];
            }

        }
        return ans == Integer.MAX_VALUE ? 0 : ans;

    }

    public static void main(String[] args) {
        int[]  nums = {1, 4, 4};
        int target = 4;
        System.out.println(minSubArrayLen(target, nums));
    }
}
