class Solution {
     static int func(int mid, int n, int m) {
        long ans = 1;
        for (int i = 1; i <= n; i++) {
            ans = ans * mid;
            if (ans > m) return 2; // greater than m
        }
        if (ans == m) return 1; // equal to m
        return 0;               // less than m
    }

    // Main nthRoot function
    public int nthRoot(int n, int m) {
        int low = 1, high = m;

        while (low <= high) {
            int mid = (low + high) / 2;
            int midN = func(mid, n, m);

            if (midN == 1) return mid;      // exact root found
            else if (midN == 0) low = mid + 1; // move right
            else high = mid - 1;            // move left
        }
        return -1; // no integer root found
    }
}