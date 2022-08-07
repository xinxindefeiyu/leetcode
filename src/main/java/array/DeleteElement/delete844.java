package array.DeleteElement;

public class delete844 {
    public static boolean backspaceCompare(String s, String t) {
        int i = s.length() - 1, j = t.length() - 1;
        int delS = 0, delT = 0;
        while (i >= 0 || j >= 0) {
            while (i >= 0) {
                if (s.charAt(i) == '#') {
                    delS++;
                    i--;
                } else if (delS > 0) {
                    i--;
                    delS--;
                } else {
                    break;
                }
            }

            while (j >= 0) {
                if (t.charAt(j) == '#') {
                    delT++;
                    j--;
                } else if (delT > 0) {
                    j--;
                    delT--;
                } else {
                    break;
                }
            }

            if (i >= 0 && j >= 0) {
                if ( s.charAt(i) != t.charAt(j)) {
                    return false;
                }
            } else if (i >= 0 || j >= 0) {
                return false;
            }
            i--;
            j--;
        }
        return true;
    }


    public static void main(String[] args) {
        String t = "a##c";

        String s = "#a#c";
        boolean res =backspaceCompare(s, t);
        System.out.println((res));

    }
}
