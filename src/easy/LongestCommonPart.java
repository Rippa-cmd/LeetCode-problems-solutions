package easy;

import java.util.Arrays;
import java.util.Comparator;


/**
 * Write a function to find the longest common part of string amongst an array of strings.
 *
 * If there is no common part, return an empty string "".
 *
 * 1 <= strs.length <= 200
 * 0 <= strs[i].length <= 200
 * strs[i] consists of only lowercase English letters.
 */
public class LongestCommonPart {
    public static void main(String[] args) {
        String[] strs = new String[]{"reflower","flow","flight"};
        Arrays.sort(strs, Comparator.comparingInt(String::length));
        StringBuilder sb = new StringBuilder();
        String shortestWord = strs[0];
        String pref = "";

        for (int b = 0; b < strs[0].length(); b++) {
            sb.append(shortestWord.charAt(b));

            while ((sb.length() > 0) && !isGoodCut(strs, sb)) {
                sb.deleteCharAt(0);
            }

            if (sb.length() > pref.length()) {
                pref = sb.toString();
            }
        }

        System.out.println(pref);
    }

    private static boolean isGoodCut(String[] strs, StringBuilder sb) {
        for (int i = 1; i < strs.length; i++) {
            if (!strs[i].contains(sb)) {
                return false;
            }
        }
        return true;
    }
}
