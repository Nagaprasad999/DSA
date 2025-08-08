class Solution {
    int[] nextPermutation(int[] arr) {
        int n = arr.length;
        int ind = -1;

        // Step 1: Find the pivot index
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] < arr[i + 1]) {
                ind = i;
                break;
            }
        }

        // Step 2: If no pivot found, reverse whole array (last permutation case)
        if (ind == -1) {
            reverse(arr, 0, n - 1);
            return arr;
        }

        // Step 3: Find element just greater than pivot
        for (int i = n - 1; i > ind; i--) {
            if (arr[i] > arr[ind]) {
                swap(arr, i, ind);
                break;
            }
        }

        // Step 4: Reverse suffix after pivot
        reverse(arr, ind + 1, n - 1);

        return arr;
    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private void reverse(int[] arr, int start, int end) {
        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }
}
