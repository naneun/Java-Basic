import java.util.Arrays;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder sb = new StringBuilder("");
        Arrays.sort(strs, (s1, s2) -> {
            return Integer.compare(s1.length(), s2.length());
        });
        int cnt = strs.length;
        int idx = 0;
        int mxIdx = strs[0].length();
        while (idx < mxIdx) {
            int i = 1;
            for (; i < cnt; ++i) {
                if (strs[i].charAt(idx) != strs[i - 1].charAt(idx)) {
                    break;
                }
            }
            if (i < cnt) {
                break;
            }
            sb.append(strs[0].charAt(idx++));
        }
        return sb.toString();
    }
}
