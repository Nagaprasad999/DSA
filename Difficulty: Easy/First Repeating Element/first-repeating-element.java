class Solution {
    public static int firstRepeated(int[] arr) {
        // code here
        Map<Integer, Integer> map = new HashMap<>();
        int minIndex = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                minIndex = Math.min(minIndex, map.get(arr[i]));
            } else {
                map.put(arr[i], i); // store first occurrence
            }
        }

        return (minIndex == Integer.MAX_VALUE) ? -1 : minIndex + 1; // 1-based index
    }
}
