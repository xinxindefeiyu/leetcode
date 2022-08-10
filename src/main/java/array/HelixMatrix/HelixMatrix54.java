package array.HelixMatrix;

import java.util.ArrayList;
import java.util.List;

public class HelixMatrix54 {

    public static List<Integer> Order(int[][] matrix) {

        int start = 0;
        int loop = 0;
        int m = matrix.length;
        int n = matrix[0].length;
        int i = 0, j = 0;
        List<Integer> ans = new ArrayList<>();
        int minLoop = Math.min(m, n);
        while (loop++ < minLoop/2) {
            for (j = start; j < n - loop; j++) {
                ans.add(matrix[start][j]);
            }
            for (i = start; i < m - loop; i++) {
                ans.add(matrix[i][j]);
            }
            for (; j > start; j--) {
                ans.add(matrix[i][j]);
            }
            for (; i > start; i--) {
                ans.add(matrix[i][j]);
            }
            start++;
            System.out.print(ans.size());
        }
        if (ans.size() < m * n) {
            if (m % 2 == 1 && n % 2 == 1) {
                if (minLoop == m) {
                    for (j = start; j <= start + Math.abs(m - n); j++) {
                        ans.add(matrix[start][j]);
                    }
                } else {
                    for (i = start; i <= start + Math.abs(m - n); i++) {
                        ans.add(matrix[i][start]);
                    }
                }
            }
            else if (m % 2 == 1) {
                for (j = start; j <= start + Math.abs(m - n); j++) {
                    ans.add(matrix[start][j]);
                }

            }
            else if (n % 2 == 1) {
                for (i = start; i <= start + Math.abs(m - n); i++) {
                    ans.add(matrix[i][start]);
                }
            }
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
