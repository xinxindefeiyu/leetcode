package array.DeleteElement;

public class RemoveElement27 {
    public static int removeElement(int[] nums, int val) {

        int len = nums.length;
        int fir = 0;
        int sec = 0;
        for (fir = 0; fir < len; fir++) {
            if( nums[fir] != val) {
                nums[sec] = nums[fir];
                sec ++;
            }
        }
        return sec;
    }

    public static void main(String[] args) {
        int[] nums = {0,1,2,2,3,0,4,2};
        int val = 2;
        int len = removeElement(nums, val);
        System.out.print(len + "   ");
        for (int i = 0; i < len; i++) {
            System.out.print(nums[i] + ",");
        }

    }

}
