class Solution {
    public int longestConsecutive(int[] nums) {

        Set<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);
        }
        int longest = 0;
        for (int num : set) {
         // Start only from the beginning of a sequenc
             if (!set.contains(num - 1)) {
                int current = num;
                int currLen = 1;

                while (set.contains(current + 1)) {
                    current++;
                    currLen++;
                }
            longest = Math.max(longest, currLen);
            }
        }
         return longest;
    }
}