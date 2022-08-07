package error2.array;

public class BinarySearchMedium34 {
    public static int[] searchRange(int[] nums, int target) {
        int len = nums.length;
        int left = searchLeft(nums, target);
        int right = searchRight(nums, target);
        if (len == 0 || target < nums[0] || target > nums[len - 1]) {
            return new int[]{-1, -1};
        }
        if (nums[left] != target) {
            return new int[]{-1, -1};
        }
        int[] ans = {left, right};

        return ans;
    }

    public static int searchLeft(int[] nums, int target) {
        int len = nums.length;
        int low = 0, high = len - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return high + 1;
    }


    public static int searchRight(int[] nums, int target) {
        int len = nums.length;
        int low = 0, high = len - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums[mid] <= target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return high;
    }


    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        int target = 6;
        int[] res = searchRange(nums, target);
        System.out.println(res[0]+","+res[1]);
    }
}
