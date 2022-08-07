package array.BinarySearch;

public class BinarySearchMedium34 {
    public static int[] searchRange(int[] nums, int target) {
        if (target > nums[nums.length - 1] || target < nums[0]) {
            int[] result = {-1, -1};
            return result;
        }
        int begin = searchBegin(nums, target);
        int end = searchEnd(nums, target);
        int[] result = {begin, end};
        return result;
    }

    public static int searchBegin(int[] nums, int target) {
        int length = nums.length;
        int low = 0;
        int high = length - 1;
        while (low <= high) {
            int mid = (low + high)/2;
            if (nums[mid] >= target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        if (nums[high + 1] == target) {
            return high + 1;
        } else {
            return -1;
        }
    }

    public static int searchEnd(int[] nums, int target) {
        int length = nums.length;
        int low = 0;
        int high = length - 1;
        while (low <= high) {
            int mid = (low + high)/2;
            if (nums[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        if (nums[low - 1] == target) {
            return low - 1;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        int target = 6;
        int[] res = searchRange(nums, target);
        System.out.println(res[0]+","+res[1]);
    }
}
