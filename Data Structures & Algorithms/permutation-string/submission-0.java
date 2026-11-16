
class Solution {
    public boolean checkInclusion(String s1, String s2) {

        int n = s1.length();
        int m = s2.length();

        if (n > m) return false;

        int[] freq1 = new int[26];
        int[] freq2 = new int[26];

        // Build frequency arrays for initial window
        for (int i = 0; i < n; i++) {
            freq1[s1.charAt(i) - 'a']++;
            freq2[s2.charAt(i) - 'a']++;
        }

        // Check initial window
        if (Arrays.equals(freq1, freq2)) {
            return true;
        }

        // Sliding window
        for (int i = n; i < m; i++) {

            // Add incoming character
            freq2[s2.charAt(i) - 'a']++;

            freq2[s2.charAt(i - n) - 'a']--;

            if (Arrays.equals(freq1, freq2)) {
                return true;
            }
        }

        return false;
    }
}
