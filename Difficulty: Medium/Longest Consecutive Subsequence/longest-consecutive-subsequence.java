class Solution {

    // Function to return length of longest subsequence of consecutive integers.
    public int longestConsecutive(int[] arr) {
        // code here
         Arrays.sort(arr);
        int count = 1;
        int max = 1; // start from 1 because even one number is a subsequence

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] + 1 == arr[i + 1]) {
                count++;
                max = Math.max(max, count);
            } 
            else if (arr[i] != arr[i + 1]) { // ignore duplicates
                count = 1;
            }
        }
        return max;
    }
}