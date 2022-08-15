package hashtable;

import java.util.HashMap;

public class isAnagram242 {
    public static boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> map_s = new HashMap<>();
        HashMap<Character, Integer> map_t = new HashMap<>();
        int len_s = s.length();
        int len_t = t.length();
        if (len_t != len_s) {
            return false;
        }
        for (int i = 0; i < len_s; i++) {
            if (!map_s.containsKey(s.charAt(i))) {
                map_s.put(s.charAt(i), 1);
            } else {
                map_s.put(s.charAt(i), map_s.get(s.charAt(i)) + 1);
            }
        }
        for (int j = 0; j < len_t; j++) {
            if (!map_s.containsKey(t.charAt(j))) {
                return false;
            }
            if (!map_t.containsKey(t.charAt(j))) {
                map_t.put(t.charAt(j), 1);
            } else {
                map_t.put(t.charAt(j), map_t.get(t.charAt(j)) + 1);
            }
        }
        for (int k = 0; k < len_s; k++) {
            if (!map_s.get(s.charAt(k)).equals(map_t.get(s.charAt(k)))) {
                return false;
            }
        }
        return true;


    }

    public static void main(String[] args) {
        String s = "aabbbb";
        String t = "aaaabb";
        System.out.println(isAnagram(s, t));
    }
}
