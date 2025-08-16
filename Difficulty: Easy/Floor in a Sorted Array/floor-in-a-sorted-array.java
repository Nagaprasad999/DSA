class Solution {
    public int findFloor(int[] arr, int x) {
        // code here
        int count=-1;
        int bount=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<=x){
                count=i;
            }
        }
        return count;
    }
}
