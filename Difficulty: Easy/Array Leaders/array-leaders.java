class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        // code here
        ArrayList<Integer>brs=new ArrayList<>();
        int min=Integer.MIN_VALUE;
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]>=min){
                min=arr[i];
                brs.add(arr[i]);
            }
        }
       Collections.reverse(brs);
return brs;

    }
}
