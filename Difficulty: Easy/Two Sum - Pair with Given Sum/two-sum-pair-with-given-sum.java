class Solution {
    boolean twoSum(int arr[], int target) {
        // code here
       for(int i=0;i<arr.length-1;i++){
           for(int j=i+1;j<arr.length;j++){
               if(arr[j]+arr[i]==target) return true;
           }
       } 
       return false;
    }
}