class Solution {
    public int lengthOfLongestSubstring(String s) {
        int ans = 0, left = 0, right = 0;
        int n = s.length();
        int[] map = new int[256];
        Arrays.fill(map, -1);
        while (right < n) {
            if (map[s.charAt(right)] != -1) {
                left = Math.max(map[s.charAt(right)] + 1, left);
            }
            map[s.charAt(right)] = right;
            ans = Math.max(ans, right - left + 1);
            right++;
        }
        return ans;
    }
}