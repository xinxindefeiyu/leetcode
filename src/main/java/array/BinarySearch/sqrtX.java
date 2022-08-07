package array.BinarySearch;

public class sqrtX {
    public static int mySqrt(int x) {
        if (x == 1) {
            return  1;
        } else {
            int low = 1;
            int high = x;
            while (high >= low) {
                int mid = (low + high) / 2;
                int mul = mid * mid;
                if (mul > x) {
                    high = mid - 1;
                } else if (mul < x) {
                    low = mid + 1;
                } else {
                    return 1;
                }
            }
            return -1;
        }

    }

    public static void main(String[] args) {
        int x = 5;
        int res = mySqrt(x);
        System.out.println(res);
    }
}
