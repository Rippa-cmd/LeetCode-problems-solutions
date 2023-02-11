package easy;

/**
 * Write a function to find the longest common prefix string amongst an array of strings.
 *
 * If there is no common prefix, return an empty string "".
 *
 * 1 <= strs.length <= 200
 * 0 <= strs[i].length <= 200
 * strs[i] consists of only lowercase English letters.
 *
 */
public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] strs = new String[]{"flower","flow","flight"};

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < strs[0].length(); i++) {
            sb.append(strs[0].charAt(i));
            for (int j = 1; j < strs.length; j++) {
                if (!strs[j].startsWith(sb.toString())) {
                    sb.setLength(sb.length() - 1);
                    System.out.println(sb.toString());
                    return;
                }
            }
        }
        System.out.println(sb.toString());
        return;
    }
}
