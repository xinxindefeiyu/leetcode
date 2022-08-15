package sort;

import java.util.Random;

public class quickSort {

    public static int[] sort(int[] nums) {
        quickSort(nums, 0, nums.length - 1);
        return nums;
    }

    public static void quickSort(int[] nums, int start, int end) {
        if(start < end) {
            int pos = randomizedPartition(nums, start, end);
            quickSort(nums, start, pos - 1);
            quickSort(nums, pos + 1, end);
        }
    }

    public static int randomizedPartition(int[] nums, int start, int end) {
        //随机选择一个主元
        int r = new Random().nextInt(end - start + 1) + start;
        swap(nums, end, r);
        return partition(nums, start, end);
    }

    public static int partition(int[] nums, int start, int end) {
        int pivot = nums[end];
        int i = start - 1, j = start;
        while(j < end) {
            if (nums[j] <= pivot) {
                i++;
                swap(nums, i, j);
            }
            j++;
        }
        swap(nums, i + 1, end);
        return i + 1;
    }

    public static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public static void main(String[] args) {
        int[] nums = {5,2,3,1};
        int[] ans = sort(nums);
        for(int i : ans) {
            System.out.print(i);
        }
    }
}
