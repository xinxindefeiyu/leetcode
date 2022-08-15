package hashtable;

import java.util.HashSet;

public class isHappy202 {
    public static boolean isHappy(int n) {
        //将该数替换为它每个位置上的数字的平方和
        int sum = 0;
        HashSet<Integer> set = new HashSet<>();
        set.add(n);
        while (sum != 1) {
            String s = String.valueOf(n);
            int len = s.length();
            for (int i = len - 1; i >= 0; i--) {
                int k =(int)(n/Math.pow(10, i));
                n = n - (int)(k * Math.pow(10, i));
                sum += k * k;
            }
            n = sum;
            sum = 0;
            //判断这个数是否为1
            if(n == 1) {
                return true;
            }
            //将该数的平方和放入set，判断set中是否已经存在这个值
            if (!set.contains(n)) {
                set.add(n);
            } else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int n = 19;
        boolean k = isHappy(n);
        System.out.println(k);

    }
}
