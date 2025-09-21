class Solution {
    public int longestSubarray(int[] arr, int k) {
      int larg=0;
      int sum=0;
      HashMap<Integer,Integer>brs=new HashMap<>();
      for(int i=0;i<arr.length;i++){
          sum+=arr[i];
          if(sum==k){
              larg=i+1;
          }
          int rem=sum-k;
          if(brs.containsKey(rem)){
              int temp=i-brs.get(rem);
              larg=Math.max(larg,temp);
          }
          if(!brs.containsKey(sum)){
              brs.put(sum,i);
          }
      }
      return larg;
    }
}
