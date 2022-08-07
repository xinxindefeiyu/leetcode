package array.DeleteElement;

public class RemoveElement26 {
    public static int removeDuplicates(int[] nums) {
        int len = nums.length;
        if (len <= 1) { return len;}
        int slow = 0;
        int fast = 0;
        for (;fast < len;fast++) {
            if(fast == slow) {
                fast ++;
            }
            if( nums[fast] != nums[slow]) {
                slow++;
                nums[slow] = nums[fast];
            }
        }
        return slow + 1;

    }

    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        int res = removeDuplicates(nums);
        for (int i = 0; i < res; i++) {
            System.out.print(nums[i] + ",");
        }

    }
}
