class Solution {
    public int lowerBound(int[] arr, int x) {
        
      int n=arr.length;
      int low=0;
      int high=n-1;
      int result=arr.length;
     while(low<=high){
         
         int mid=(low+high)/2;
        if(arr[mid]>=x){
            result=mid;
            high=mid-1;
        }else{
            low=mid+1;
        }
      }
      return result;
    }
}
