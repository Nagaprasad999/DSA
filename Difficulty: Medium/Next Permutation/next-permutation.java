class Solution {
     public static void swap(int arr[],int start,int end){
           
           int temp   = arr[start];
           arr[start]=arr[end];
           arr[end]=temp;
           
       }
       public static void reverse(int arr[],int start,int end){
           while(start<end){
               swap(arr,start,end);
               start++;
               end--;
           }
       }
    int[] nextPermutation(int[] arr) {
       int n=arr.length;
       
       int idx=-1;
       for(int i=n-2;i>=0;i--){
           if(arr[i]<arr[i+1]){
               idx=i;
               break;
           }
       }
       if(idx==-1){
           reverse(arr,0,n-1);
           return arr;
       }
      
       for(int i=n-1;i>=0;i--){
           if(arr[i]>arr[idx]){
               swap(arr,idx,i);
         
               break;
           }
       }
       reverse(arr,idx+1,n-1);
       
      return arr;
     
   }
}
    