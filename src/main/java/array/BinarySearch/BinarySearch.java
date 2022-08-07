package array.BinarySearch;

import java.sql.Array;

public class BinarySearch {
    public static int[] search(int[] nums, int target) {
        //注意length，没有(),size()
//        int length = nums.length;
//        if (target < nums[0] && target > nums[length - 1]) {
//            return -1;
//        } else {
//            int low = 0;
//            int high = length - 1;
//            int mid = (high - low)/2;
//            //注意for函数需要有3个小语句
//            while(low <= high) {
//                if (nums[mid] < target) {
//                    low = mid + 1;
//                } else if (nums[mid] > target) {
//                    high = mid - 1;
//                } else {
//                    return mid;
//                }
//                mid = (low + high)/2;
//            }
//            //while之后还需要一个返回值
//            return -1;
//        }

        int length = nums.length;
        int low = 0;
        int high = length - 1;
        int begin = 0;
        int end = 0;
        int mid = 0;
        while (low <= high) {
            mid = (low + high) / 2;
            if (target < nums[mid]) {
                high = mid - 1;
            } else if (target > nums[mid]) {
                low = mid + 1;
            } else if (target == nums[mid]) {
                int res_begin = mid;
                int res_end = mid;


                while (low <= res_begin) {
                    begin = (low + res_begin) / 2;
                    if (target <= nums[begin]) {
                        res_begin = begin - 1;
                    } else {
                        low = begin + 1;
                    }
                }
                begin = res_begin + 1;

                while (res_end <= high) {
                    end = (res_end + high) / 2;
                    if (target < nums[end]) {
                        high = end - 1;
                    } else {
                        res_end = end + 1;
                    }
                }
                end = res_end - 1;
                break;
            }

        }
        int[] res = {begin, end};
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        int target = 6;
        int[] res = search(nums, target);
        System.out.println(res[0]+","+res[1]);

    }
}