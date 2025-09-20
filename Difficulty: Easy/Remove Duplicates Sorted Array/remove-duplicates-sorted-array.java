class Solution {
    // Function to remove duplicates from the given array.
    ArrayList<Integer> removeDuplicates(int[] arr) {
        // code here
      LinkedHashSet<Integer>ans=new LinkedHashSet<>();
      for(int i =0;i< arr.length;i++){
          ans.add(arr[i]);
      }
      ArrayList<Integer>brs=new ArrayList<>(ans);
      return brs;
    }
}
