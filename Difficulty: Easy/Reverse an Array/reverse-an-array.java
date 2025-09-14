class Solution {
    
    public static void recursion(int arr[],int left,int right){
        if(left>=right){
        return;
        }
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            recursion(arr,left+1,right-1);
        
    }
    public void reverseArray(int arr[]) {
        // code here
         recursion(arr,0,arr.length-1);
    }
}