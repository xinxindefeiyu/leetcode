package array.Subarray;

import java.util.*;

public class FruitBaskets904 {
    public static int totalFruit(int[] fruits) {
        int len = fruits.length;
        int left = 0, right = 0;
        int ans = 0;
        HashMap<Integer, Integer> basket = new HashMap<>();
        for (right = 0; right < len; right++) {
            if (!basket.containsKey(fruits[right])) {
                basket.put(fruits[right], 1);
            } else {
                basket.put(fruits[right], basket.get(fruits[right]) + 1);
            }
            while (basket.size() >= 3) {
                basket.put(fruits[left], basket.get(fruits[left]) - 1);
                if (basket.get(fruits[left]) == 0) {
                    basket.remove(fruits[left]);
                }
                left++;
            }
            ans = Math.max(ans, right - left + 1);
        }

        return ans;
    }


    public static void main(String[] args) {
        int[] fruits = {1,2,1};
        System.out.println(totalFruit(fruits));



    }
}
