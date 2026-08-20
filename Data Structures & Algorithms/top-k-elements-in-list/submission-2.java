class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        // Count frequency of each element
        HashMap<Integer, Integer> map = new HashMap<>();
            for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Min-heap
        // int[] = {element, frequency}
        PriorityQueue<int[]> pq = new PriorityQueue<>(
            (a, b) -> a[1] - b[1]
        );

        // Add elements to heap
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {

            int element = entry.getKey();
            int frequency = entry.getValue();

            pq.offer(new int[]{element, frequency});

            // Keep only k most frequent elements
            if (pq.size() > k) {
                pq.poll();
            }
        }
        // Store result
        int[] result = new int[k];

        for (int i = 0; i < k; i++) {
            result[i] = pq.poll()[0];
        }

        return result;
    }
}