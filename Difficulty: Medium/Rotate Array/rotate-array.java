// User function Template for Java

class Solution {
    // Function to rotate an array by d elements in counter-clockwise direction.
    static void rotateArr(int arr[], int d) {
        int n=arr.length;
        d=d%n;
       ArrayList<Integer>ans=new ArrayList<>();
       for(int i=d;i<arr.length;i++){
           ans.add(arr[i]);
       }
       for(int i=0;i<d;i++){
           ans.add(arr[i]);
       }
      for(int i=0;i<arr.length;i++){
          arr[i]=ans.get(i);
      }
    }
}