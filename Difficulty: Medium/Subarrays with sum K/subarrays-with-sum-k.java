class Solution {
    public int cntSubarrays(int[] arr, int k) {
        // code here
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1); // base case

        int preSum = 0, count = 0;

        for (int num : arr) {
            preSum += num; // update prefix sum

            int remove = preSum - k; // target prefix to remove
            count += map.getOrDefault(remove, 0);

            // update frequency of current prefix sum
            map.put(preSum, map.getOrDefault(preSum, 0) + 1);
        }

        return count;
    }
}