// User function Template for Java

class Solution {
    void pushZerosToEnd(int[] arr) {
        // code here
        ArrayList<Integer>ans=new ArrayList<>();
             ArrayList<Integer>brs=new ArrayList<>();
      for(int i=0;i<arr.length;i++){
          if(arr[i]==0){
              ans.add(arr[i]);
          }else{
              brs.add(arr[i]);
          }
      }
      int count=0;
      for(int i=0;i<brs.size();i++){
          arr[i]=brs.get(count);
          count++;
      }
     
      int bount=0;
    for(int i=brs.size();i<arr.length;i++){
        arr[i]=ans.get(bount);
        bount++;
    }
      
       
    }
}