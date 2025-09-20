class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        int larg=0;
        int seclarg=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>larg){
                larg=arr[i];
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]>seclarg && arr[i]!=larg){
                seclarg=arr[i];
            }
        }
        return seclarg;
    }
}