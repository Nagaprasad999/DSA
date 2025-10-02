class Solution {
    public void mergeArrays(int a[], int b[]) {
        // code here
      int n = a.length;
        int m = b.length;
        int end = n - 1;
        int start = 0;

        while (end >= 0 && start < m) {
            if (a[end] > b[start]) {
                int temp = a[end];
                a[end] = b[start];
                b[start] = temp;
            }
            end--;
            start++;
        }

        Arrays.sort(a);
        Arrays.sort(b);
    }
}
