package array.HelixMatrix;

import java.util.ArrayList;
import java.util.List;

public class HelixMatrix54_1 {

    public static List<Integer> Order(int[][] matrix) {

        List<Integer> ans = new ArrayList<>();
        int up = 0, left = 0;
        int down = matrix.length - 1, right = matrix[0].length - 1;
        while(true) {
            //上边界都拿,拿完上边界值加1
            for (int j = left; j <= right; j++) {
                ans.add(matrix[up][j]);
            }
            if (++up > down) {break;}
            //右边界都拿，拿完右边界值减1
            for (int i = up; i <= down; i++) {
                ans.add(matrix[i][right]);
            }
            if(--right < left) { break; }
            //下边界都拿,拿完下边界值减1
            for (int j = right; j >= left; j--) {
                ans.add(matrix[down][j]);
            }
            if (--down < up) {break;}
            //左边界都拿，拿完左边界值加1
            for (int i = down; i >= up; i--) {
                ans.add(matrix[i][left]);
            }
            if(left++ > right) { break; }
        }

        return ans;
    }
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        List<Integer> ans = Order(matrix);
        for(int i = 0 ; i < ans.size(); i ++) {
            System.out.println(ans.get(i));
        }

    }
}
