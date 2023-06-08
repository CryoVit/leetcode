/*
@id         3
@title      Longest Substring Without Repeating Characters
@tag        Two Pointers
@author     CryoVit
@date       2023/06/08
*/

class Solution {
    public int lengthOfLongestSubstring(String s) {
        if ("".equals(s)) {
            return 0;
        }
        Set<Character> set = new HashSet<>();
        int ans = 0;
        int i = 0;
        int j = 0;
        int n = s.length();
        // windows is [i, j)
        while (j < n) {
            if (!set.contains(s.charAt(j))) {
                set.add(s.charAt(j++));
                ans = Math.max(ans, j - i);
            } else {
                set.remove(s.charAt(i++));
            }
        }
        return ans;
    }
}

class Solution2 {
    public int lengthOfLongestSubstring(String s) {
        if ("".equals(s)) {
            return 0;
        }
        int rec[] = new int[128];
        int ans = 0;
        int n = s.length();
        // windows is [l, r]
        for (int l = 0, r = 0; r < n; r++) {
            char c = s.charAt(r);
            l = Math.max(l, rec[c]);
            ans = Math.max(ans, r - l + 1);
            rec[c] = r + 1;
        }
        return ans;
    }
}
