class Solution {
    public int lowerBound(int[] arr, int x) {
        int n = arr.length;
        int low = 0;
        int high = n - 1;
        int ans = n; // Default: if not found, insertion point is at end

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] >= x) {
                ans = mid;        // possible position
                high = mid - 1;   // look on the left for smaller index
            } else {
                low = mid + 1;    // look on the right side
            }
        }

        return ans;
    }
}
