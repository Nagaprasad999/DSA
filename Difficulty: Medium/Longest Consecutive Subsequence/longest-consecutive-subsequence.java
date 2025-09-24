class Solution {

    // Function to return length of longest subsequence of consecutive integers.
    public int longestConsecutive(int[] arr) {
        // code here
       int n=arr.length;
       if(n==0) return 0;
       
       HashSet<Integer>brs=new HashSet<>();
       for(int i=0;i<arr.length;i++){
           brs.add(arr[i]);
       }
       int longest=1;
       for(int a : brs){
           int count=1;
           int num=a;
           if(!brs.contains(a-1)){
             while(brs.contains(num+1)){
                 num++;
                 count++;
             }
           }
           longest=Math.max(longest,count);
       }
       return longest;
    }
}