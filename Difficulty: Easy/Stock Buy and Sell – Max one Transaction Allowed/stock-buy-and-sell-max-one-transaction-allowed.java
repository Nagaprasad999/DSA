// User function Template for Java

class Solution {
    public int maximumProfit(int arr[]) {
        // Code here
        int maxi=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                maxi=Math.max(maxi,arr[j]-arr[i]);
            }
        }
        return maxi;
    }
}