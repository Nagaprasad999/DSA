class Solution {
    public int[] twoRepeated(int[] arr) {
        // code here
         int ans[]=new int[2];
        int i=0;
        HashSet<Integer> set=new HashSet<>();
        for(int num:arr){
            if(set.contains(num)){
                ans[i]=num;
                i++;
            }
            else{
                set.add(num);
            }
        }
        return ans;
    }
}